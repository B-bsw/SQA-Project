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
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        int int15 = attributes11.indexOfKey("");
        java.lang.String str17 = attributes11.getIgnoreCase("");
        attributes0.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        java.lang.String str22 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes25 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes26 = attributes0.clone();
        attributes0.removeIgnoreCase("");
        attributes0.removeIgnoreCase("");
        java.lang.String[] strArray31 = attributes0.vals;
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        boolean boolean34 = attributes32.hasKeyIgnoreCase("hi!");
        java.lang.String str36 = attributes32.get("hi!");
        attributes32.normalize();
        attributes32.remove("hi!");
        java.lang.String[] strArray40 = attributes32.vals;
        attributes0.vals = strArray40;
        int int43 = attributes0.indexOfKey(" hi!=\" data-=&quot;data-&quot;\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator44 = attributes0.spliterator();
        attributes0.putIgnoreCase("  hi!=\"\"=\"data-\"", "   data-=\"data-\"=\"\"=\" =&quot;&quot;\"");
        boolean boolean49 = attributes0.hasKeyIgnoreCase("   data-=\"\"=\"\"=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(attributeSpliterator44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        attributes4.normalize();
        java.lang.String[] strArray6 = attributes4.keys;
        java.lang.String[] strArray7 = attributes4.keys;
        boolean boolean9 = attributes4.hasKey("hi!");
        java.lang.String str10 = attributes4.html();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.normalize();
        java.lang.String[] strArray15 = attributes13.keys;
        java.lang.String[] strArray16 = attributes13.keys;
        java.lang.String str18 = attributes13.getIgnoreCase("");
        int int19 = attributes13.size();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes20.spliterator();
        java.lang.String str23 = attributes20.getIgnoreCase("");
        attributes20.removeIgnoreCase("data-");
        attributes13.addAll(attributes20);
        attributes20.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes31 = attributes20.put("hi!", "hi!");
        boolean boolean33 = attributes31.hasKeyIgnoreCase(" data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes36 = attributes31.put("", " data-=\"data-\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor37 = attributes31.iterator();
        boolean boolean38 = attributes0.equals((java.lang.Object) attributes31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributeItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("", "hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        boolean boolean9 = attributes7.hasKeyIgnoreCase("hi!");
        java.lang.String str11 = attributes7.get("hi!");
        attributes7.normalize();
        boolean boolean14 = attributes7.hasKey("");
        java.lang.String str15 = attributes7.html();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.normalize();
        java.lang.String[] strArray18 = attributes16.keys;
        int int20 = attributes16.indexOfKey("");
        attributes7.addAll(attributes16);
        boolean boolean22 = attributes0.equals((java.lang.Object) attributes7);
        java.lang.String[] strArray23 = attributes0.keys;
        org.jsoup.nodes.Attributes attributes24 = attributes0.clone();
        attributes0.removeIgnoreCase(" data-=\"data-\"");
        attributes0.removeIgnoreCase("  hi!=\"\"");
        java.lang.String str30 = attributes0.get(" hi!=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.lang.String[] strArray8 = attributes0.keys;
        boolean boolean10 = attributes0.hasKey("data-");
        org.jsoup.nodes.Attributes attributes13 = attributes0.put(" data-=\"data-\"", false);
        boolean boolean15 = attributes13.hasKey("  hi!=\"\"");
        attributes13.removeIgnoreCase(" null=\"\"");
        java.lang.String str19 = attributes13.get(" =\" =&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes20 = attributes13.clone();
        boolean boolean22 = attributes20.hasKey("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.vals;
        java.lang.String str8 = attributes0.toString();
        attributes0.removeIgnoreCase("hi!");
        attributes0.removeIgnoreCase("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        java.lang.String[] strArray16 = attributes14.keys;
        java.lang.String[] strArray17 = attributes14.keys;
        java.lang.String str19 = attributes14.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes22 = attributes14.put("", "");
        attributes22.removeIgnoreCase("");
        boolean boolean26 = attributes22.hasKeyIgnoreCase(" data-=\"\"");
        boolean boolean27 = attributes0.equals((java.lang.Object) attributes22);
        org.jsoup.nodes.Attributes attributes28 = attributes22.clone();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator29 = attributes28.spliterator();
        boolean boolean31 = attributes28.hasKey("  =\"\" data-=\"\"  hi!=\"hi!\"=\"\"");
        int int32 = attributes28.size();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributeSpliterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.lang.String[] strArray8 = attributes0.keys;
        java.lang.String str10 = attributes0.get(" hi!=\"hi!\"");
        attributes0.remove(" =\"\"");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        boolean boolean15 = attributes13.hasKeyIgnoreCase("");
        java.lang.String[] strArray16 = attributes13.keys;
        attributes0.keys = strArray16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes0.dataset();
        attributes0.normalize();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes0.put("", "");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        attributes9.normalize();
        java.lang.String[] strArray11 = attributes9.keys;
        java.lang.String[] strArray12 = attributes9.keys;
        java.lang.String str14 = attributes9.getIgnoreCase("");
        int int15 = attributes9.size();
        java.lang.String[] strArray16 = attributes9.vals;
        attributes0.keys = strArray16;
        int int18 = attributes0.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int2 = attributes0.indexOfKey("hi!");
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.normalize();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str6 = attributes0.html();
        attributes0.putIgnoreCase("   data-=\"data-\"=\"\"=\" =&quot;&quot;\"", "  data-=\"\"=\" data-=&quot;&quot;  hi!=&quot;&quot;=&quot; null=&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str10 = attributes0.html();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "    data-=\"data-\"=\"\"=\" =&quot;&quot;\"=\"  data-=&quot;&quot;=&quot; data-=&amp;quot;&amp;quot;  hi!=&amp;quot;&amp;quot;=&amp;quot; null=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"" + "'", str10, "    data-=\"data-\"=\"\"=\" =&quot;&quot;\"=\"  data-=&quot;&quot;=&quot; data-=&amp;quot;&amp;quot;  hi!=&amp;quot;&amp;quot;=&amp;quot; null=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        attributes0.removeIgnoreCase(" data-=\"data-\"");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        java.lang.String[] strArray15 = attributes12.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        java.lang.String str17 = attributes12.html();
        attributes12.remove(" hi!=\"hi!\"");
        java.lang.String[] strArray20 = attributes12.vals;
        attributes0.addAll(attributes12);
        attributes0.removeIgnoreCase("data-");
        java.lang.String str24 = attributes0.html();
        int int25 = attributes0.size();
        java.lang.String str26 = attributes0.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.remove("hi!");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        java.lang.String str11 = attributes8.getIgnoreCase("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes8.asList();
        int int14 = attributes8.indexOfKey("");
        java.lang.String str16 = attributes8.getIgnoreCase(" hi!=\"hi!\"");
        java.lang.String[] strArray17 = attributes8.keys;
        attributes8.normalize();
        org.jsoup.nodes.Attributes attributes21 = attributes8.put("data-", " null=\"\"");
        boolean boolean23 = attributes21.hasKeyIgnoreCase("  data-=\" =&quot;&quot;\"=\" null=&quot;&quot;\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes21.asList();
        int int26 = attributes21.indexOfKey("  data-=\"\"=\"\"");
        org.jsoup.nodes.Attributes attributes29 = attributes21.put("  data-=\"data-\"=\" hi!=&quot;hi!&quot;\"", false);
        attributes0.addAll(attributes29);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String str4 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes5.keys = strArray14;
        attributes0.keys = strArray14;
        java.lang.String[] strArray17 = attributes0.keys;
        java.lang.String[] strArray18 = attributes0.keys;
        java.lang.String[] strArray19 = attributes0.keys;
        boolean boolean21 = attributes0.hasKeyIgnoreCase("  data-=\"\"=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes24 = attributes0.put(" hi!=\"\"  hi!=\" data-=&quot;data-&quot;\"", "   data-=\"\"=\"\"=\" data-=&quot;data-&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { " hi!=\"\"  hi!=\" data-=&quot;data-&quot;\"", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { " hi!=\"\"  hi!=\" data-=&quot;data-&quot;\"", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { " hi!=\"\"  hi!=\" data-=&quot;data-&quot;\"", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { " hi!=\"\"  hi!=\" data-=&quot;data-&quot;\"", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        attributes0.putIgnoreCase("hi!", " data-=\"data-\"");
        attributes0.putIgnoreCase(" data-=\"data-\"", " data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes14.hasKeyIgnoreCase("");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        java.lang.String str8 = attributes0.getIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes0.spliterator();
        java.lang.String str10 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes14 = attributes0.put(" =\"hi!\"", false);
        org.jsoup.nodes.Attributes attributes17 = attributes0.put(" hi!=\" data-=&quot;data-&quot;\"", true);
        boolean boolean19 = attributes0.hasKey("   data-=\"data-\"=\"\"=\" =&quot;&quot;\"");
        boolean boolean21 = attributes0.hasKey("");
        java.lang.String str22 = attributes0.html();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi!=\"\"" + "'", str10, " hi!=\"\"");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " hi!=\"\"  hi!=\" data-=&quot;data-&quot;\"" + "'", str22, " hi!=\"\"  hi!=\" data-=&quot;data-&quot;\"");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put(" =\"\"", "");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        attributes4.normalize();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        java.lang.String[] strArray10 = attributes7.keys;
        attributes7.remove("");
        java.lang.String[] strArray13 = attributes7.vals;
        java.lang.String[] strArray14 = attributes7.keys;
        attributes4.keys = strArray14;
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.normalize();
        java.lang.String[] strArray18 = attributes16.keys;
        java.lang.String[] strArray19 = attributes16.keys;
        java.lang.String str21 = attributes16.getIgnoreCase("");
        int int22 = attributes16.size();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes23.spliterator();
        java.lang.String str26 = attributes23.getIgnoreCase("");
        attributes23.removeIgnoreCase("data-");
        attributes16.addAll(attributes23);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes23.dataset();
        java.lang.String[] strArray31 = attributes23.vals;
        attributes4.vals = strArray31;
        boolean boolean34 = attributes4.hasKeyIgnoreCase("hi!");
        java.lang.String str36 = attributes4.getIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor37 = attributes4.iterator();
        java.lang.String[] strArray38 = attributes4.vals;
        attributes3.keys = strArray38;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator40 = attributes3.spliterator();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributeItor37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator40);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        boolean boolean5 = attributes3.hasKeyIgnoreCase("hi!");
        java.lang.String str7 = attributes3.get("hi!");
        attributes3.normalize();
        boolean boolean10 = attributes3.hasKey("");
        java.lang.String str11 = attributes3.html();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        int int16 = attributes12.indexOfKey("");
        attributes3.addAll(attributes12);
        attributes2.addAll(attributes3);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes3.spliterator();
        org.jsoup.nodes.Attributes attributes20 = attributes3.clone();
        java.lang.String str22 = attributes20.getIgnoreCase(" null=\"\"");
        java.lang.String str23 = attributes20.toString();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        attributes20.html(appendable24, outputSettings25);
        java.lang.Class<?> wildcardClass27 = attributes20.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        java.lang.String str7 = attributes0.getIgnoreCase(" data-=\"\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes11 = attributes0.put(" data-=\"\"", false);
        java.lang.String[] strArray12 = attributes0.vals;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        boolean boolean4 = attributes0.hasKey(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        org.jsoup.nodes.Attributes attributes9 = attributes5.put("", false);
        int int11 = attributes9.indexOfKey("hi!");
        int int13 = attributes9.indexOfKey("");
        java.lang.String str15 = attributes9.getIgnoreCase("");
        boolean boolean17 = attributes9.hasKey("data-");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        int int20 = attributes18.size();
        java.lang.String[] strArray21 = attributes18.vals;
        attributes18.remove("hi!");
        java.lang.String[] strArray24 = attributes18.vals;
        attributes9.vals = strArray24;
        attributes0.keys = strArray24;
        org.jsoup.nodes.Attributes attributes27 = attributes0.clone();
        java.lang.String str28 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes31 = attributes0.put("  =\"hi!\"=\"hi!\"", false);
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        boolean boolean34 = attributes32.hasKeyIgnoreCase("hi!");
        java.lang.String str36 = attributes32.get("hi!");
        attributes32.normalize();
        boolean boolean39 = attributes32.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes32.iterator();
        java.lang.String str41 = attributes32.toString();
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.normalize();
        java.lang.String[] strArray44 = attributes42.keys;
        java.lang.String[] strArray45 = attributes42.keys;
        attributes42.remove("");
        java.lang.String[] strArray48 = attributes42.vals;
        attributes32.vals = strArray48;
        java.lang.String str50 = attributes32.toString();
        attributes32.removeIgnoreCase("");
        attributes0.addAll(attributes32);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor54 = attributes32.iterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributeItor54);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        attributes4.normalize();
        java.lang.String[] strArray6 = attributes4.keys;
        java.lang.String[] strArray7 = attributes4.keys;
        boolean boolean9 = attributes4.hasKey("hi!");
        java.lang.String str10 = attributes4.html();
        attributes0.addAll(attributes4);
        boolean boolean13 = attributes0.hasKey("  data-=\"\"");
        java.lang.String[] strArray14 = attributes0.keys;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        attributes0.remove("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.remove("");
        java.lang.String[] strArray6 = attributes0.vals;
        org.jsoup.nodes.Attributes attributes9 = attributes0.put("  hi!=\"\"", false);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        boolean boolean12 = attributes10.hasKeyIgnoreCase("hi!");
        attributes10.putIgnoreCase("hi!", "");
        attributes10.normalize();
        java.lang.String[] strArray17 = attributes10.vals;
        attributes0.vals = strArray17;
        org.jsoup.nodes.Attributes attributes21 = attributes0.put("  data-=\"data-\"=\" hi!=&quot;hi!&quot;\"", true);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes21.dataset();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes23.spliterator();
        java.lang.String str26 = attributes23.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes29 = attributes23.put("hi!", "hi!");
        attributes23.putIgnoreCase("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList33 = attributes23.asList();
        int int34 = attributes23.size();
        attributes21.addAll(attributes23);
        java.lang.String str37 = attributes21.getIgnoreCase("  data-=\" =&quot;&quot;\"=\" null=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributeList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        boolean boolean8 = attributes0.hasKeyIgnoreCase("data-");
        java.lang.String[] strArray9 = attributes0.keys;
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes0.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes0.asList();
        attributes0.putIgnoreCase("hi!", "data-");
        attributes0.putIgnoreCase("hi!", " =\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes0.spliterator();
        boolean boolean20 = attributes0.hasKey("    data-=\"data-\"=\"\"=\" =&quot;&quot;\"=\"  data-=&quot;&quot;=&quot; data-=&amp;quot;&amp;quot;  hi!=&amp;quot;&amp;quot;=&amp;quot; null=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("", "hi!");
        java.lang.String str8 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes9.spliterator();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        attributes9.keys = strArray11;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes9.spliterator();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        java.lang.String[] strArray16 = attributes14.keys;
        java.lang.String[] strArray17 = attributes14.keys;
        java.lang.String str19 = attributes14.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes22 = attributes14.put("", "");
        attributes22.removeIgnoreCase("");
        java.lang.String[] strArray25 = attributes22.keys;
        org.jsoup.nodes.Attributes attributes28 = attributes22.put("data-", "");
        java.lang.String[] strArray29 = attributes28.vals;
        boolean boolean30 = attributes9.equals((java.lang.Object) attributes28);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        attributes31.normalize();
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator34 = attributes33.spliterator();
        java.lang.String str36 = attributes33.getIgnoreCase("");
        attributes33.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        attributes39.normalize();
        java.lang.String[] strArray41 = attributes39.keys;
        java.lang.String[] strArray42 = attributes39.keys;
        attributes39.remove("hi!");
        java.lang.String[] strArray45 = attributes39.vals;
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator47 = attributes46.spliterator();
        java.lang.String[] strArray48 = new java.lang.String[] {};
        attributes46.keys = strArray48;
        boolean boolean50 = attributes39.equals((java.lang.Object) strArray48);
        boolean boolean51 = attributes33.equals((java.lang.Object) strArray48);
        attributes31.vals = strArray48;
        boolean boolean53 = attributes28.equals((java.lang.Object) attributes31);
        boolean boolean54 = attributes0.equals((java.lang.Object) boolean53);
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        attributes55.normalize();
        org.jsoup.nodes.Attributes attributes59 = attributes55.put("", false);
        int int61 = attributes59.indexOfKey("hi!");
        int int63 = attributes59.indexOfKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor64 = attributes59.iterator();
        attributes59.removeIgnoreCase("");
        org.jsoup.nodes.Attributes attributes67 = attributes59.clone();
        attributes0.addAll(attributes59);
        boolean boolean70 = attributes0.hasKey(" hi!=\"hi!\"");
        java.lang.String[] strArray71 = attributes0.keys;
        attributes0.remove("  hi!=\"\"=\"data-\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "data-", null, null, null });
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(attributeItor64);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", null, null, null });
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        int int15 = attributes11.indexOfKey("");
        java.lang.String str17 = attributes11.getIgnoreCase("");
        attributes0.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes0.spliterator();
        boolean boolean22 = attributes0.hasKey("  hi!=\"\"");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.normalize();
        java.lang.String[] strArray25 = attributes23.keys;
        java.lang.String[] strArray26 = attributes23.keys;
        java.lang.String str28 = attributes23.getIgnoreCase("");
        int int29 = attributes23.size();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        java.lang.String str33 = attributes30.getIgnoreCase("");
        attributes30.removeIgnoreCase("data-");
        attributes23.addAll(attributes30);
        attributes30.removeIgnoreCase("hi!");
        java.lang.String str40 = attributes30.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes41 = attributes30.clone();
        attributes30.remove("data-");
        java.lang.String[] strArray44 = attributes30.vals;
        attributes0.vals = strArray44;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes48 = attributes0.put("  hi!=\"\"=\" hi!=&quot;&quot;\"", " hi!=\"hi!\"   null=\"\"=\" hi!=&quot;hi!&quot;\"=\"  null=&quot;&quot;=&quot; hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        attributes0.html(appendable3, outputSettings4);
        java.lang.String[] strArray6 = attributes0.keys;
        boolean boolean8 = attributes0.hasKeyIgnoreCase(" hi!=\" data-=&quot;data-&quot;\"");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes0.html(appendable9, outputSettings10);
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList12);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        int int6 = attributes4.indexOfKey("hi!");
        java.lang.String str8 = attributes4.get(" hi!=\"hi!\"");
        boolean boolean10 = attributes4.hasKeyIgnoreCase(" hi!=\" hi!=&quot; null=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String str4 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes5.keys = strArray14;
        attributes0.keys = strArray14;
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.normalize();
        java.lang.String[] strArray19 = attributes17.keys;
        java.lang.String[] strArray20 = attributes17.keys;
        attributes17.remove("hi!");
        java.lang.String[] strArray23 = attributes17.vals;
        attributes0.addAll(attributes17);
        java.lang.String str25 = attributes0.toString();
        java.lang.String[] strArray26 = attributes0.keys;
        java.lang.String str28 = attributes0.get("  hi!=\"\"=\"data-\"");
        boolean boolean30 = attributes0.hasKeyIgnoreCase(" =\"\" data-=\"\"  hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes31.spliterator();
        java.lang.String[] strArray33 = new java.lang.String[] {};
        attributes31.keys = strArray33;
        java.lang.String str36 = attributes31.getIgnoreCase(" hi!=\"\"");
        java.lang.String str38 = attributes31.getIgnoreCase("");
        java.lang.String[] strArray39 = attributes31.vals;
        attributes0.vals = strArray39;
        int int41 = attributes0.size();
        int int42 = attributes0.size();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase("");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes7.dataset();
        java.lang.String[] strArray15 = attributes7.vals;
        java.lang.String str16 = attributes7.toString();
        int int18 = attributes7.indexOfKey(" =\"hi!\"");
        java.lang.String str19 = attributes7.html();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.normalize();
        org.jsoup.nodes.Attributes attributes24 = attributes20.put("", false);
        int int26 = attributes24.indexOfKey("hi!");
        java.lang.String str27 = attributes24.html();
        java.lang.String[] strArray28 = attributes24.vals;
        attributes7.vals = strArray28;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes7.dataset();
        java.lang.String[] strArray15 = attributes7.vals;
        java.lang.String str16 = attributes7.toString();
        java.lang.String[] strArray17 = attributes7.keys;
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes7.iterator();
        org.jsoup.nodes.Attributes attributes21 = attributes7.put("  hi!=\"\"=\"data-\"", true);
        attributes7.remove("  data-=\"data-\"=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int2 = attributes0.indexOfKey("hi!");
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.normalize();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        int int6 = attributes0.indexOfKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        attributes7.removeIgnoreCase("");
        attributes0.addAll(attributes7);
        java.lang.String str13 = attributes7.toString();
        attributes7.removeIgnoreCase("   data-=\"data-\"=\"\"");
        java.lang.String str16 = attributes7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("");
        int int5 = attributes0.indexOfKey("hi!");
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes7.remove(" data-=\" =&quot;&quot;\"");
        java.lang.String str11 = attributes7.getIgnoreCase("  hi!=\"\"=\" data-=&quot;data-&quot;\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes12.spliterator();
        int int14 = attributes12.size();
        int int15 = attributes12.size();
        org.jsoup.nodes.Attributes attributes18 = attributes12.put("", "hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes18.clone();
        java.lang.String[] strArray20 = attributes19.keys;
        attributes7.vals = strArray20;
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", null, null, null });
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        attributes0.putIgnoreCase("hi!", "");
        attributes0.normalize();
        int int8 = attributes0.indexOfKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        attributes9.normalize();
        java.lang.String[] strArray11 = attributes9.keys;
        java.lang.String[] strArray12 = attributes9.keys;
        java.lang.String str14 = attributes9.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes17 = attributes9.put("", "");
        attributes17.removeIgnoreCase("");
        java.lang.String[] strArray20 = attributes17.keys;
        org.jsoup.nodes.Attributes attributes23 = attributes17.put("data-", "");
        boolean boolean24 = attributes0.equals((java.lang.Object) "data-");
        java.lang.String[] strArray25 = attributes0.vals;
        org.jsoup.nodes.Attributes attributes28 = attributes0.put("   data-=\"data-\"=\"\"=\" =&quot;&quot;\"", " hi!");
        boolean boolean30 = attributes28.hasKey(" =\"hi!\" hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "data-", null, null, null });
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", " hi!", null, null });
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        attributes0.keys = strArray2;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        java.lang.String[] strArray7 = attributes5.keys;
        java.lang.String[] strArray8 = attributes5.keys;
        java.lang.String str10 = attributes5.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes13 = attributes5.put("", "");
        attributes13.removeIgnoreCase("");
        java.lang.String[] strArray16 = attributes13.keys;
        org.jsoup.nodes.Attributes attributes19 = attributes13.put("data-", "");
        java.lang.String[] strArray20 = attributes19.vals;
        boolean boolean21 = attributes0.equals((java.lang.Object) attributes19);
        org.jsoup.nodes.Attributes attributes24 = attributes19.put(" hi!=\"\"", " null=\"\"");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes24.dataset();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes24.html(appendable26, outputSettings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "data-", " hi!=\"\"", null, null });
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", " null=\"\"", null, null });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes10 = attributes0.put(" =\" =&quot;&quot;\"", false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String[] strArray3 = attributes0.keys;
        int int4 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        java.lang.String[] strArray7 = attributes5.keys;
        java.lang.String[] strArray8 = attributes5.keys;
        java.lang.String str10 = attributes5.getIgnoreCase("");
        int int11 = attributes5.size();
        java.lang.String[] strArray12 = attributes5.vals;
        java.lang.String str13 = attributes5.toString();
        attributes5.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.normalize();
        java.lang.String[] strArray18 = attributes16.keys;
        java.lang.String[] strArray19 = attributes16.keys;
        java.lang.String str21 = attributes16.getIgnoreCase("");
        int int22 = attributes16.size();
        java.lang.String[] strArray23 = attributes16.vals;
        attributes5.vals = strArray23;
        org.jsoup.nodes.Attributes attributes27 = attributes5.put(" hi!=\"\"", " hi!=\"\"");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKeyIgnoreCase("hi!");
        java.lang.String str32 = attributes28.get("hi!");
        attributes28.normalize();
        java.util.List<org.jsoup.nodes.Attribute> attributeList34 = attributes28.asList();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        attributes35.normalize();
        java.lang.String[] strArray37 = attributes35.keys;
        java.lang.String[] strArray38 = attributes35.keys;
        java.lang.String str40 = attributes35.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes43 = attributes35.put("", "");
        attributes35.normalize();
        attributes35.putIgnoreCase("data-", "");
        java.lang.String[] strArray48 = attributes35.vals;
        attributes28.keys = strArray48;
        attributes5.vals = strArray48;
        boolean boolean51 = attributes0.equals((java.lang.Object) strArray48);
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        attributes52.normalize();
        java.lang.String[] strArray54 = attributes52.keys;
        java.lang.String[] strArray55 = attributes52.keys;
        java.lang.String str57 = attributes52.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes60 = attributes52.put("", "");
        boolean boolean62 = attributes60.hasKeyIgnoreCase("hi!");
        int int64 = attributes60.indexOfKey(" data-=\"\"");
        attributes60.normalize();
        boolean boolean66 = attributes0.equals((java.lang.Object) attributes60);
        attributes60.normalize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributeList34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "", null, null });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("", "hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        java.lang.String str11 = attributes7.get("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKeyIgnoreCase("hi!");
        java.lang.String str16 = attributes12.get("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes12.keys = strArray21;
        attributes7.keys = strArray21;
        java.lang.String[] strArray24 = attributes7.keys;
        java.lang.String[] strArray25 = attributes7.vals;
        attributes0.keys = strArray25;
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        boolean boolean29 = attributes27.hasKeyIgnoreCase("hi!");
        java.lang.String str31 = attributes27.get("hi!");
        attributes27.normalize();
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        attributes33.normalize();
        java.lang.String[] strArray35 = attributes33.keys;
        java.lang.String[] strArray36 = attributes33.keys;
        attributes27.vals = strArray36;
        attributes0.addAll(attributes27);
        java.lang.String[] strArray39 = attributes27.vals;
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        attributes40.normalize();
        java.lang.String[] strArray42 = attributes40.keys;
        java.lang.String[] strArray43 = attributes40.keys;
        attributes40.remove("");
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        attributes46.normalize();
        java.lang.String[] strArray48 = attributes46.keys;
        java.lang.String[] strArray49 = attributes46.keys;
        java.lang.String str51 = attributes46.getIgnoreCase("");
        int int52 = attributes46.size();
        org.jsoup.nodes.Attributes attributes53 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator54 = attributes53.spliterator();
        java.lang.String str56 = attributes53.getIgnoreCase("");
        attributes53.removeIgnoreCase("data-");
        attributes46.addAll(attributes53);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = attributes53.dataset();
        java.lang.String[] strArray61 = attributes53.vals;
        attributes40.vals = strArray61;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator63 = attributes40.spliterator();
        boolean boolean64 = attributes27.equals((java.lang.Object) attributes40);
        org.jsoup.nodes.Attributes attributes65 = new org.jsoup.nodes.Attributes();
        attributes65.normalize();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator67 = attributes65.spliterator();
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        attributes68.normalize();
        java.lang.String[] strArray70 = attributes68.keys;
        java.lang.String[] strArray71 = attributes68.keys;
        attributes68.remove("");
        java.lang.String[] strArray74 = attributes68.vals;
        java.lang.String[] strArray75 = attributes68.keys;
        attributes65.keys = strArray75;
        org.jsoup.nodes.Attributes attributes77 = new org.jsoup.nodes.Attributes();
        attributes77.normalize();
        java.lang.String[] strArray79 = attributes77.keys;
        java.lang.String[] strArray80 = attributes77.keys;
        java.lang.String str82 = attributes77.getIgnoreCase("");
        int int83 = attributes77.size();
        org.jsoup.nodes.Attributes attributes84 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator85 = attributes84.spliterator();
        java.lang.String str87 = attributes84.getIgnoreCase("");
        attributes84.removeIgnoreCase("data-");
        attributes77.addAll(attributes84);
        java.util.Map<java.lang.String, java.lang.String> strMap91 = attributes84.dataset();
        java.lang.String[] strArray92 = attributes84.vals;
        attributes65.vals = strArray92;
        attributes40.keys = strArray92;
        attributes40.remove("  =\"\" data-=\"\"  hi!=\"hi!\"=\"\"");
        attributes40.remove(" hi!=\"hi!\"  hi!=\"hi!\"=\" null=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(attributeSpliterator67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(strMap91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] {});
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String[] strArray7 = attributes0.keys;
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        attributes9.normalize();
        java.lang.String[] strArray11 = attributes9.keys;
        java.lang.String[] strArray12 = attributes9.keys;
        attributes9.remove("");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        attributes15.normalize();
        java.lang.String[] strArray17 = attributes15.keys;
        java.lang.String[] strArray18 = attributes15.keys;
        java.lang.String str20 = attributes15.getIgnoreCase("");
        int int21 = attributes15.size();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        java.lang.String str25 = attributes22.getIgnoreCase("");
        attributes22.removeIgnoreCase("data-");
        attributes15.addAll(attributes22);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = attributes22.dataset();
        java.lang.String[] strArray30 = attributes22.vals;
        attributes9.vals = strArray30;
        attributes0.keys = strArray30;
        org.jsoup.nodes.Attributes attributes35 = attributes0.put(" hi!=\"hi!\"", false);
        int int36 = attributes0.size();
        org.jsoup.nodes.Attributes attributes39 = attributes0.put(" hi!=\"data-\"", " data-=\" =&quot;&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        int int15 = attributes11.indexOfKey("");
        java.lang.String str17 = attributes11.getIgnoreCase("");
        attributes0.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        java.lang.String str22 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes25 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes26 = attributes0.clone();
        attributes0.removeIgnoreCase("");
        attributes0.removeIgnoreCase("");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        attributes31.normalize();
        org.jsoup.nodes.Attributes attributes35 = attributes31.put("", false);
        int int37 = attributes35.indexOfKey("hi!");
        java.lang.String str38 = attributes35.html();
        attributes0.addAll(attributes35);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes0.iterator();
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributeItor40);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.remove("hi!");
        java.lang.String[] strArray6 = attributes0.vals;
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        java.lang.String[] strArray10 = attributes7.keys;
        java.lang.String str12 = attributes7.getIgnoreCase("");
        int int13 = attributes7.size();
        java.lang.String[] strArray14 = attributes7.vals;
        java.lang.String str15 = attributes7.toString();
        boolean boolean16 = attributes0.equals((java.lang.Object) attributes7);
        boolean boolean18 = attributes7.hasKey("");
        boolean boolean20 = attributes7.hasKeyIgnoreCase("  data-=\"data-\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes7.iterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeItor21);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes3 = attributes0.clone();
        attributes0.putIgnoreCase(" data-=\"\"", "");
        java.lang.String str7 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        int int10 = attributes0.indexOfKey("  hi!=\" null=&quot;&quot;\"=\" =&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "  data-=\"\"=\"\"" + "'", str7, "  data-=\"\"=\"\"");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        attributes0.html(appendable2, outputSettings3);
        int int6 = attributes0.indexOfKey(" hi!=\"hi!\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        int int9 = attributes0.indexOfKey("data-");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.normalize();
        attributes10.remove("hi!");
        attributes10.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.normalize();
        org.jsoup.nodes.Attributes attributes21 = attributes17.put("", false);
        int int23 = attributes21.indexOfKey("hi!");
        int int25 = attributes21.indexOfKey("");
        java.lang.String str27 = attributes21.getIgnoreCase("");
        attributes10.addAll(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes10.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes10.iterator();
        java.lang.String str32 = attributes10.get("");
        org.jsoup.nodes.Attributes attributes35 = attributes10.put("hi!", false);
        org.jsoup.nodes.Attributes attributes36 = attributes10.clone();
        attributes0.addAll(attributes36);
        java.lang.String str38 = attributes36.html();
        org.jsoup.nodes.Attributes attributes41 = attributes36.put(" null=\"\"", "data-");
        java.lang.String str43 = attributes41.get(" =\"\"");
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        attributes44.normalize();
        java.lang.String[] strArray46 = attributes44.keys;
        int int48 = attributes44.indexOfKey("");
        boolean boolean50 = attributes44.hasKeyIgnoreCase("");
        boolean boolean52 = attributes44.hasKeyIgnoreCase("data-");
        java.lang.String[] strArray53 = attributes44.keys;
        java.util.List<org.jsoup.nodes.Attribute> attributeList54 = attributes44.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList55 = attributes44.asList();
        attributes44.putIgnoreCase("hi!", "data-");
        org.jsoup.nodes.Attributes attributes59 = attributes44.clone();
        org.jsoup.nodes.Attributes attributes60 = new org.jsoup.nodes.Attributes();
        boolean boolean62 = attributes60.hasKeyIgnoreCase("hi!");
        java.lang.String str64 = attributes60.get("hi!");
        attributes60.normalize();
        org.jsoup.nodes.Attributes attributes66 = new org.jsoup.nodes.Attributes();
        attributes66.normalize();
        java.lang.String[] strArray68 = attributes66.keys;
        java.lang.String[] strArray69 = attributes66.keys;
        attributes60.vals = strArray69;
        org.jsoup.nodes.Attributes attributes71 = attributes60.clone();
        attributes59.addAll(attributes71);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = attributes71.dataset();
        java.lang.String[] strArray74 = attributes71.keys;
        attributes41.keys = strArray74;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeList54);
        org.junit.Assert.assertNotNull(attributeList55);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] {});
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        attributes0.keys = strArray2;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        int int6 = attributes0.indexOfKey(" data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.String str8 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes11 = attributes0.put("  data-=\"\"=\"\"", "  data-=\" =&quot;&quot;\"=\" null=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        attributes12.remove("hi!");
        attributes12.putIgnoreCase("hi!", "");
        java.lang.String str20 = attributes12.getIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes12.spliterator();
        org.jsoup.nodes.Attributes attributes24 = attributes12.put(" hi!=\"\"", false);
        attributes11.addAll(attributes12);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator26 = attributes12.spliterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributeSpliterator26);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String str4 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes5.keys = strArray14;
        attributes0.keys = strArray14;
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.normalize();
        java.lang.String[] strArray19 = attributes17.keys;
        java.lang.String[] strArray20 = attributes17.keys;
        attributes17.remove("hi!");
        java.lang.String[] strArray23 = attributes17.vals;
        attributes0.addAll(attributes17);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes0.dataset();
        java.lang.String[] strArray26 = attributes0.keys;
        attributes0.remove(" hi!=\"hi!\"");
        attributes0.removeIgnoreCase(" hi!=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes0.spliterator();
        org.jsoup.nodes.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes33 = attributes0.put(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(attributeSpliterator31);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        attributes0.putIgnoreCase("", "");
        attributes0.normalize();
        attributes0.removeIgnoreCase(" =\"hi!\" hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.remove("");
        java.lang.String[] strArray6 = attributes0.vals;
        java.lang.String str8 = attributes0.getIgnoreCase(" data-=\"\"");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes9.spliterator();
        java.lang.String str12 = attributes9.getIgnoreCase("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes9.asList();
        int int15 = attributes9.indexOfKey("");
        java.lang.String str17 = attributes9.getIgnoreCase(" hi!=\"hi!\"");
        java.lang.String[] strArray18 = attributes9.keys;
        attributes9.normalize();
        org.jsoup.nodes.Attributes attributes22 = attributes9.put("data-", " null=\"\"");
        org.jsoup.nodes.Attributes attributes25 = attributes22.put("  null=\"\"=\" hi!=&quot;hi!&quot;\"", false);
        boolean boolean26 = attributes0.equals((java.lang.Object) false);
        org.jsoup.nodes.Attributes attributes29 = attributes0.put("  data-=\"\"=\" data-=&quot;&quot;  hi!=&quot;&quot;=&quot; null=&amp;quot;&amp;quot;&quot;\"", " =\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes29.spliterator();
        int int31 = attributes29.size();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        boolean boolean8 = attributes0.hasKeyIgnoreCase("data-");
        java.lang.String[] strArray9 = attributes0.keys;
        org.jsoup.nodes.Attributes attributes12 = attributes0.put("hi!", true);
        attributes12.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        attributes15.normalize();
        attributes15.remove("hi!");
        attributes15.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        attributes22.normalize();
        org.jsoup.nodes.Attributes attributes26 = attributes22.put("", false);
        int int28 = attributes26.indexOfKey("hi!");
        int int30 = attributes26.indexOfKey("");
        java.lang.String str32 = attributes26.getIgnoreCase("");
        attributes15.addAll(attributes26);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor34 = attributes15.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor35 = attributes15.iterator();
        java.lang.String str37 = attributes15.get("");
        boolean boolean38 = attributes12.equals((java.lang.Object) attributes15);
        org.jsoup.nodes.Attributes attributes39 = attributes15.clone();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributeItor34);
        org.junit.Assert.assertNotNull(attributeItor35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        boolean boolean7 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        java.lang.String str10 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.put("data-", "data-");
        java.lang.String str15 = attributes0.getIgnoreCase(" hi!=\"hi!\" data-=\" data-=&quot;data-&quot;\"");
        attributes0.remove(" hi!=\"hi!\"  hi!=\"hi!\"=\" null=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        attributes7.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = attributes7.put("hi!", "hi!");
        java.lang.String str20 = attributes7.getIgnoreCase("data-");
        attributes7.remove(" hi!=\"hi!\"");
        attributes7.remove(" hi!=\"hi!\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes7.iterator();
        java.lang.String str27 = attributes7.get(" data-=\"\"");
        java.lang.String[] strArray28 = attributes7.vals;
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes7.asList();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", null, null, null });
        org.junit.Assert.assertNotNull(attributeList29);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        java.lang.String str8 = attributes0.getIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(" hi!=\"\"", false);
        int int13 = attributes0.size();
        int int14 = attributes0.size();
        boolean boolean16 = attributes0.hasKey(" data-=\"\"  hi!=\"\"=\" null=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String str4 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes5.keys = strArray14;
        attributes0.keys = strArray14;
        java.lang.String[] strArray17 = attributes0.keys;
        java.lang.String[] strArray18 = attributes0.vals;
        org.jsoup.nodes.Attributes attributes19 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.normalize();
        java.lang.String[] strArray22 = attributes20.keys;
        java.lang.String[] strArray23 = attributes20.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes20.dataset();
        java.lang.String str25 = attributes20.html();
        attributes20.removeIgnoreCase("");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKeyIgnoreCase("hi!");
        java.lang.String str32 = attributes28.get("hi!");
        attributes28.normalize();
        attributes28.putIgnoreCase("", "");
        java.lang.String[] strArray37 = attributes28.keys;
        java.lang.String[] strArray38 = attributes28.keys;
        attributes20.vals = strArray38;
        attributes0.vals = strArray38;
        int int42 = attributes0.indexOfKey(" hi!=\"hi!\" data-=\" data-=&quot;data-&quot;\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator43 = attributes0.spliterator();
        java.lang.String str44 = attributes0.html();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(attributeSpliterator43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        boolean boolean8 = attributes0.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        attributes9.normalize();
        java.lang.String[] strArray11 = attributes9.keys;
        java.lang.String[] strArray12 = attributes9.keys;
        java.lang.String str14 = attributes9.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes17 = attributes9.put("", "");
        attributes17.removeIgnoreCase("");
        java.lang.String[] strArray20 = attributes17.keys;
        attributes0.keys = strArray20;
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes22.spliterator();
        java.lang.String[] strArray24 = new java.lang.String[] {};
        attributes22.keys = strArray24;
        attributes0.keys = strArray24;
        java.util.List<org.jsoup.nodes.Attribute> attributeList27 = attributes0.asList();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { null, null, null, null });
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeList27);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", "data-");
        attributes4.putIgnoreCase("", " =\"\"");
        java.lang.String[] strArray8 = attributes4.keys;
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", null, null });
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes0.put("", "");
        java.lang.String str10 = attributes8.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes8.dataset();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes8.asList();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        java.lang.String[] strArray10 = attributes7.keys;
        java.lang.String str12 = attributes7.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes15 = attributes7.put("", "");
        attributes7.normalize();
        attributes7.putIgnoreCase("data-", "");
        java.lang.String[] strArray20 = attributes7.vals;
        attributes0.keys = strArray20;
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes0.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", null, null });
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes7.dataset();
        java.lang.String[] strArray15 = attributes7.vals;
        int int16 = attributes7.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes7.asList();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        attributes19.normalize();
        java.lang.String[] strArray21 = attributes19.keys;
        java.lang.String[] strArray22 = attributes19.keys;
        java.lang.String str24 = attributes19.getIgnoreCase("");
        int int25 = attributes19.size();
        java.lang.String[] strArray26 = attributes19.vals;
        java.util.List<org.jsoup.nodes.Attribute> attributeList27 = attributes19.asList();
        attributes7.addAll(attributes19);
        boolean boolean30 = attributes7.hasKeyIgnoreCase("  data-=\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.vals;
        java.lang.String str9 = attributes0.get("hi!");
        java.lang.String str11 = attributes0.get("");
        attributes0.putIgnoreCase(" hi!=\"\"", "data-");
        java.lang.String str16 = attributes0.getIgnoreCase("  hi!=\"hi!\"=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.lang.String[] strArray8 = attributes0.keys;
        java.lang.String str10 = attributes0.get(" hi!=\"hi!\"");
        attributes0.remove(" =\"\"");
        attributes0.putIgnoreCase("  data-=\"\"=\"\"", " data-=\"data-\"");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes0.iterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(attributeItor17);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        boolean boolean8 = attributes0.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        attributes9.normalize();
        java.lang.String[] strArray11 = attributes9.keys;
        java.lang.String[] strArray12 = attributes9.keys;
        java.lang.String str14 = attributes9.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes17 = attributes9.put("", "");
        attributes17.removeIgnoreCase("");
        java.lang.String[] strArray20 = attributes17.keys;
        attributes0.keys = strArray20;
        org.jsoup.nodes.Attributes attributes24 = attributes0.put(" null=\"\"", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList25 = attributes0.asList();
        java.lang.String[] strArray26 = attributes0.keys;
        java.lang.String[] strArray27 = attributes0.keys;
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        attributes28.remove("hi!");
        attributes28.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        attributes35.normalize();
        org.jsoup.nodes.Attributes attributes39 = attributes35.put("", false);
        int int41 = attributes39.indexOfKey("hi!");
        int int43 = attributes39.indexOfKey("");
        java.lang.String str45 = attributes39.getIgnoreCase("");
        attributes28.addAll(attributes39);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor47 = attributes28.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator48 = attributes28.spliterator();
        org.jsoup.nodes.Attributes attributes51 = attributes28.put(" =\"hi!\"", false);
        boolean boolean52 = attributes0.equals((java.lang.Object) attributes51);
        java.lang.String str54 = attributes0.getIgnoreCase("  null=\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { null, null, null, null });
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributeList25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { null, null, null, null });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { null, null, null, null });
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributeItor47);
        org.junit.Assert.assertNotNull(attributeSpliterator48);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        attributes0.remove("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        boolean boolean10 = attributes0.hasKeyIgnoreCase("  hi!=\"\"");
        org.jsoup.nodes.Attributes attributes13 = attributes0.put("   hi!=\"\"=\"data-\"", " data-=\"\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes17 = attributes0.put("   =\"\" data-=\"\"  hi!=\"hi!\"=\"\"=\"hi!\"", "");
        attributes17.normalize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        boolean boolean5 = attributes3.hasKeyIgnoreCase("hi!");
        java.lang.String str7 = attributes3.get("hi!");
        attributes3.normalize();
        boolean boolean10 = attributes3.hasKey("");
        java.lang.String str11 = attributes3.html();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        int int16 = attributes12.indexOfKey("");
        attributes3.addAll(attributes12);
        attributes2.addAll(attributes3);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes3.spliterator();
        org.jsoup.nodes.Attributes attributes20 = attributes3.clone();
        boolean boolean22 = attributes3.hasKeyIgnoreCase(" null=\"\"");
        int int24 = attributes3.indexOfKey("");
        int int26 = attributes3.indexOfKey(" null=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        attributes7.removeIgnoreCase("hi!");
        java.lang.String str17 = attributes7.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = attributes7.clone();
        boolean boolean20 = attributes7.hasKeyIgnoreCase(" hi!=\"\"");
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        attributes7.html(appendable21, outputSettings22);
        attributes7.removeIgnoreCase(" hi!");
        attributes7.putIgnoreCase(" hi!=\"data-\"", "    data-=\"data-\"=\"\"=\" =&quot;&quot;\"=\"  data-=&quot;&quot;=&quot; data-=&amp;quot;&amp;quot;  hi!=&amp;quot;&amp;quot;=&amp;quot; null=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"  hi!=\"hi!\" data-=\" data-=&quot; =&amp;quot;&amp;quot;&quot;\"=\" null=&quot;hi!&quot;\"");
        attributes7.putIgnoreCase(" hi!=\"\"", " =\" =&quot;hi!&quot;\"  hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        java.lang.String[] strArray5 = attributes3.keys;
        java.lang.String[] strArray6 = attributes3.keys;
        attributes3.remove("");
        java.lang.String[] strArray9 = attributes3.vals;
        java.lang.String[] strArray10 = attributes3.keys;
        attributes0.keys = strArray10;
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        java.lang.String[] strArray15 = attributes12.keys;
        java.lang.String str17 = attributes12.getIgnoreCase("");
        int int18 = attributes12.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes19.spliterator();
        java.lang.String str22 = attributes19.getIgnoreCase("");
        attributes19.removeIgnoreCase("data-");
        attributes12.addAll(attributes19);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes19.dataset();
        java.lang.String[] strArray27 = attributes19.vals;
        attributes0.vals = strArray27;
        boolean boolean30 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        attributes31.normalize();
        java.lang.String[] strArray33 = attributes31.keys;
        int int35 = attributes31.indexOfKey("");
        boolean boolean37 = attributes31.hasKeyIgnoreCase("");
        java.lang.String str38 = attributes31.toString();
        java.lang.String[] strArray39 = attributes31.keys;
        boolean boolean41 = attributes31.hasKey("data-");
        org.jsoup.nodes.Attributes attributes44 = attributes31.put(" data-=\"data-\"", false);
        boolean boolean46 = attributes44.hasKey("  hi!=\"\"");
        int int48 = attributes44.indexOfKey("");
        boolean boolean49 = attributes0.equals((java.lang.Object) attributes44);
        attributes44.remove("   =\"\" data-=\"\"  hi!=\"hi!\"=\"\"=\"hi!\"");
        int int52 = attributes44.size();
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes0.put(" data-=\"\"  hi!=\"\"=\" null=&quot;&quot;\"", true);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes9.dataset();
        boolean boolean12 = attributes9.hasKeyIgnoreCase("  =\"\"=\"\"");
        attributes9.remove(" =\" =&quot;hi!&quot;\"  hi!");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        boolean boolean7 = attributes0.hasKey("");
        int int8 = attributes0.size();
        int int9 = attributes0.size();
        int int11 = attributes0.indexOfKey(" data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.removeIgnoreCase("");
        int int15 = attributes12.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        attributes0.addAll(attributes12);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes12.spliterator();
        org.jsoup.nodes.Attributes attributes19 = attributes12.clone();
        attributes12.normalize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        attributes0.removeIgnoreCase(" data-=\"data-\"");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        java.lang.String[] strArray15 = attributes12.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes12.dataset();
        java.lang.String str17 = attributes12.html();
        attributes12.remove(" hi!=\"hi!\"");
        java.lang.String[] strArray20 = attributes12.vals;
        attributes0.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        attributes22.normalize();
        java.lang.String[] strArray24 = attributes22.keys;
        int int26 = attributes22.indexOfKey("");
        java.lang.String[] strArray27 = attributes22.keys;
        attributes0.vals = strArray27;
        org.jsoup.nodes.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes30 = attributes0.put(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        boolean boolean4 = attributes0.hasKeyIgnoreCase(" data-=\"data-\"");
        java.lang.String str6 = attributes0.getIgnoreCase(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        attributes7.remove("hi!");
        attributes7.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        org.jsoup.nodes.Attributes attributes18 = attributes14.put("", false);
        int int20 = attributes18.indexOfKey("hi!");
        int int22 = attributes18.indexOfKey("");
        java.lang.String str24 = attributes18.getIgnoreCase("");
        attributes7.addAll(attributes18);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes7.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes7.iterator();
        java.lang.String str29 = attributes7.get("");
        org.jsoup.nodes.Attributes attributes32 = attributes7.put("hi!", false);
        org.jsoup.nodes.Attributes attributes33 = attributes7.clone();
        attributes7.removeIgnoreCase("");
        attributes7.removeIgnoreCase("");
        attributes7.remove("data-");
        attributes0.addAll(attributes7);
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        attributes0.html(appendable41, outputSettings42);
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        boolean boolean46 = attributes44.hasKeyIgnoreCase("hi!");
        java.lang.String str48 = attributes44.get("hi!");
        attributes44.normalize();
        boolean boolean51 = attributes44.hasKey("");
        java.lang.String str52 = attributes44.html();
        java.lang.String[] strArray53 = attributes44.keys;
        org.jsoup.nodes.Attributes attributes56 = attributes44.put(" hi!=\"\"", true);
        org.jsoup.nodes.Attributes attributes57 = attributes56.clone();
        java.lang.String[] strArray58 = attributes56.vals;
        attributes0.vals = strArray58;
        org.jsoup.nodes.Attributes attributes62 = attributes0.put("  data-=\"\"", " =\"\" data-=\"\"  hi!=\"hi!\"=\"\"");
        java.lang.String str64 = attributes62.get("  hi!=\"hi!\" data-=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        boolean boolean5 = attributes3.hasKeyIgnoreCase("hi!");
        java.lang.String str7 = attributes3.get("hi!");
        attributes3.normalize();
        boolean boolean10 = attributes3.hasKey("");
        java.lang.String str11 = attributes3.html();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        int int16 = attributes12.indexOfKey("");
        attributes3.addAll(attributes12);
        attributes2.addAll(attributes3);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes3.spliterator();
        org.jsoup.nodes.Attributes attributes22 = attributes3.put(" hi!=\"hi!\"", " data-=\"data-\"");
        attributes3.removeIgnoreCase("  data-=\"\"=\"\"");
        java.lang.String str26 = attributes3.get(" data-=\"\" hi!=\"\"=\" null=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("", "hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        boolean boolean9 = attributes7.hasKeyIgnoreCase("hi!");
        java.lang.String str11 = attributes7.get("hi!");
        attributes7.normalize();
        boolean boolean14 = attributes7.hasKey("");
        java.lang.String str15 = attributes7.html();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.normalize();
        java.lang.String[] strArray18 = attributes16.keys;
        int int20 = attributes16.indexOfKey("");
        attributes7.addAll(attributes16);
        boolean boolean22 = attributes0.equals((java.lang.Object) attributes7);
        boolean boolean24 = attributes0.hasKeyIgnoreCase("");
        attributes0.remove("");
        java.lang.String str27 = attributes0.html();
        boolean boolean29 = attributes0.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        attributes30.normalize();
        org.jsoup.nodes.Attributes attributes34 = attributes30.put("", false);
        int int36 = attributes34.indexOfKey("hi!");
        int int38 = attributes34.indexOfKey("");
        java.lang.String str40 = attributes34.getIgnoreCase("");
        boolean boolean42 = attributes34.hasKey("data-");
        org.jsoup.nodes.Attributes attributes43 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator44 = attributes43.spliterator();
        int int45 = attributes43.size();
        java.lang.String[] strArray46 = attributes43.vals;
        attributes43.remove("hi!");
        java.lang.String[] strArray49 = attributes43.vals;
        attributes34.vals = strArray49;
        attributes0.vals = strArray49;
        boolean boolean53 = attributes0.hasKey(" data-=\" =&quot;&quot;\"");
        java.lang.String[] strArray54 = attributes0.keys;
        boolean boolean56 = attributes0.hasKey(" hi!=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.vals;
        java.lang.String str8 = attributes0.toString();
        attributes0.removeIgnoreCase("hi!");
        attributes0.removeIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes17 = attributes14.put("  hi!=\" null=&quot;&quot;\"=\" null=&quot;hi!&quot;\"", "  hi!=\" null=&quot;&quot;\"=\" null=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        boolean boolean5 = attributes3.hasKeyIgnoreCase("hi!");
        java.lang.String str7 = attributes3.get("hi!");
        attributes3.normalize();
        boolean boolean10 = attributes3.hasKey("");
        java.lang.String str11 = attributes3.html();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        int int16 = attributes12.indexOfKey("");
        attributes3.addAll(attributes12);
        attributes2.addAll(attributes3);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes3.spliterator();
        org.jsoup.nodes.Attributes attributes20 = attributes3.clone();
        java.lang.String str21 = attributes3.html();
        org.jsoup.nodes.Attributes attributes22 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes23.spliterator();
        int int25 = attributes23.size();
        int int26 = attributes23.size();
        org.jsoup.nodes.Attributes attributes29 = attributes23.put("", "hi!");
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        attributes30.normalize();
        java.lang.String[] strArray32 = attributes30.keys;
        java.lang.String str34 = attributes30.get("");
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        boolean boolean37 = attributes35.hasKeyIgnoreCase("hi!");
        java.lang.String str39 = attributes35.get("hi!");
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes35.keys = strArray44;
        attributes30.keys = strArray44;
        java.lang.String[] strArray47 = attributes30.keys;
        java.lang.String[] strArray48 = attributes30.vals;
        attributes23.keys = strArray48;
        org.jsoup.nodes.Attributes attributes50 = attributes23.clone();
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        boolean boolean53 = attributes51.hasKeyIgnoreCase("hi!");
        java.lang.String str55 = attributes51.get("hi!");
        attributes51.normalize();
        attributes51.putIgnoreCase("", "");
        java.lang.String[] strArray60 = attributes51.keys;
        java.lang.String[] strArray61 = attributes51.keys;
        attributes50.vals = strArray61;
        org.jsoup.nodes.Attributes attributes63 = new org.jsoup.nodes.Attributes();
        attributes63.normalize();
        java.lang.String[] strArray65 = attributes63.keys;
        java.lang.String str67 = attributes63.get("");
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        boolean boolean70 = attributes68.hasKeyIgnoreCase("hi!");
        java.lang.String str72 = attributes68.get("hi!");
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes68.keys = strArray77;
        attributes63.keys = strArray77;
        org.jsoup.nodes.Attributes attributes80 = new org.jsoup.nodes.Attributes();
        attributes80.normalize();
        java.lang.String[] strArray82 = attributes80.keys;
        java.lang.String[] strArray83 = attributes80.keys;
        attributes80.remove("hi!");
        java.lang.String[] strArray86 = attributes80.vals;
        attributes63.addAll(attributes80);
        java.lang.String str88 = attributes63.toString();
        java.lang.String[] strArray89 = attributes63.keys;
        attributes50.keys = strArray89;
        attributes22.vals = strArray89;
        java.lang.String[] strArray92 = attributes22.vals;
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        int int6 = attributes4.indexOfKey("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        java.lang.String[] strArray10 = attributes7.keys;
        attributes7.remove("hi!");
        java.lang.String[] strArray13 = attributes7.vals;
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        java.lang.String[] strArray16 = attributes14.keys;
        java.lang.String[] strArray17 = attributes14.keys;
        java.lang.String str19 = attributes14.getIgnoreCase("");
        int int20 = attributes14.size();
        java.lang.String[] strArray21 = attributes14.vals;
        java.lang.String str22 = attributes14.toString();
        boolean boolean23 = attributes7.equals((java.lang.Object) attributes14);
        boolean boolean25 = attributes14.hasKey("");
        boolean boolean26 = attributes4.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes27 = attributes4.clone();
        attributes4.remove("  null=\"\"=\" hi!=&quot;hi!&quot;\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes4.spliterator();
        boolean boolean32 = attributes4.hasKey(" =\"\"");
        int int33 = attributes4.size();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes3 = attributes0.clone();
        java.lang.String str5 = attributes3.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes6 = attributes3.clone();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        java.lang.String[] strArray16 = attributes14.keys;
        java.lang.String[] strArray17 = attributes14.keys;
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.getIgnoreCase("");
        attributes18.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        attributes24.normalize();
        java.lang.String[] strArray26 = attributes24.keys;
        java.lang.String[] strArray27 = attributes24.keys;
        attributes24.remove("hi!");
        java.lang.String[] strArray30 = attributes24.vals;
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes31.spliterator();
        java.lang.String[] strArray33 = new java.lang.String[] {};
        attributes31.keys = strArray33;
        boolean boolean35 = attributes24.equals((java.lang.Object) strArray33);
        boolean boolean36 = attributes18.equals((java.lang.Object) strArray33);
        attributes14.vals = strArray33;
        attributes11.vals = strArray33;
        attributes6.keys = strArray33;
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        attributes40.normalize();
        org.jsoup.nodes.Attributes attributes44 = attributes40.put("", false);
        attributes40.normalize();
        org.jsoup.nodes.Attributes attributes48 = attributes40.put("  =\"\"=\"\"", " hi!=\"hi!\"   data-=\"data-\"=\" hi!=&quot;hi!&quot;\"=\" data-=&quot;&quot;\"");
        attributes6.addAll(attributes48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        int int6 = attributes4.indexOfKey("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        java.lang.String[] strArray10 = attributes7.keys;
        attributes7.remove("hi!");
        java.lang.String[] strArray13 = attributes7.vals;
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        java.lang.String[] strArray16 = attributes14.keys;
        java.lang.String[] strArray17 = attributes14.keys;
        java.lang.String str19 = attributes14.getIgnoreCase("");
        int int20 = attributes14.size();
        java.lang.String[] strArray21 = attributes14.vals;
        java.lang.String str22 = attributes14.toString();
        boolean boolean23 = attributes7.equals((java.lang.Object) attributes14);
        boolean boolean25 = attributes14.hasKey("");
        boolean boolean26 = attributes4.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes27 = attributes4.clone();
        attributes4.normalize();
        attributes4.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes33 = attributes4.put("", "data-");
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        attributes34.normalize();
        java.lang.String[] strArray36 = attributes34.keys;
        java.lang.String[] strArray37 = attributes34.keys;
        attributes34.remove("");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        attributes40.normalize();
        java.lang.String[] strArray42 = attributes40.keys;
        java.lang.String[] strArray43 = attributes40.keys;
        java.lang.String str45 = attributes40.getIgnoreCase("");
        int int46 = attributes40.size();
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator48 = attributes47.spliterator();
        java.lang.String str50 = attributes47.getIgnoreCase("");
        attributes47.removeIgnoreCase("data-");
        attributes40.addAll(attributes47);
        java.util.Map<java.lang.String, java.lang.String> strMap54 = attributes47.dataset();
        java.lang.String[] strArray55 = attributes47.vals;
        attributes34.vals = strArray55;
        boolean boolean58 = attributes34.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes61 = attributes34.put(" hi!=\"\"", false);
        attributes34.remove(" =\" =&quot;&quot;\"");
        boolean boolean64 = attributes33.equals((java.lang.Object) " =\" =&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        attributes0.html(appendable5, outputSettings6);
        org.jsoup.nodes.Attributes attributes10 = attributes0.put("hi!", " hi!=\" data-=&quot;data-&quot;\"");
        org.jsoup.nodes.Attributes attributes11 = attributes10.clone();
        org.jsoup.nodes.Attributes attributes14 = attributes10.put("  hi!=\"\"=\" data-=&quot;data-&quot;\"", " data-=\" =&quot;&quot;\"");
        java.lang.String str16 = attributes14.getIgnoreCase(" =\"hi!\"");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        boolean boolean7 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        java.lang.String str10 = attributes0.get("");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes0.put(" hi!=\"\"", " hi!=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.clone();
        boolean boolean15 = attributes13.hasKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes16.spliterator();
        java.lang.String str19 = attributes16.getIgnoreCase("");
        int int21 = attributes16.indexOfKey("hi!");
        java.lang.String[] strArray22 = attributes16.keys;
        attributes13.vals = strArray22;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        org.jsoup.nodes.Attributes attributes16 = attributes0.put("hi!", false);
        java.lang.String[] strArray17 = null;
        attributes16.keys = strArray17;
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        attributes19.normalize();
        java.lang.String[] strArray21 = attributes19.keys;
        int int23 = attributes19.indexOfKey("");
        boolean boolean25 = attributes19.hasKeyIgnoreCase("");
        boolean boolean27 = attributes19.hasKeyIgnoreCase("data-");
        java.lang.String[] strArray28 = attributes19.keys;
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes19.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList30 = attributes19.asList();
        attributes19.putIgnoreCase("hi!", "data-");
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        attributes34.normalize();
        java.lang.String[] strArray36 = attributes34.keys;
        java.lang.String[] strArray37 = attributes34.keys;
        attributes34.remove("");
        java.lang.String[] strArray40 = attributes34.vals;
        java.lang.String[] strArray41 = attributes34.keys;
        attributes19.vals = strArray41;
        attributes16.vals = strArray41;
        int int44 = attributes16.size();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeList29);
        org.junit.Assert.assertNotNull(attributeList30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "data-");
        org.jsoup.nodes.Attributes attributes10 = attributes7.put("", "hi!");
        int int11 = attributes10.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        java.lang.String[] strArray15 = attributes12.keys;
        java.lang.String str17 = attributes12.getIgnoreCase("");
        int int18 = attributes12.size();
        java.lang.String[] strArray19 = attributes12.vals;
        java.lang.String str20 = attributes12.toString();
        attributes12.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.normalize();
        java.lang.String[] strArray25 = attributes23.keys;
        java.lang.String[] strArray26 = attributes23.keys;
        java.lang.String str28 = attributes23.getIgnoreCase("");
        int int29 = attributes23.size();
        java.lang.String[] strArray30 = attributes23.vals;
        attributes12.vals = strArray30;
        org.jsoup.nodes.Attributes attributes34 = attributes12.put(" hi!=\"\"", " hi!=\"\"");
        attributes10.addAll(attributes12);
        boolean boolean37 = attributes10.hasKey(" hi!=\"hi!\"");
        java.lang.String[] strArray38 = attributes10.vals;
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "data-", "hi!", " hi!=\"\"", null });
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String str4 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes5.keys = strArray14;
        attributes0.keys = strArray14;
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.normalize();
        java.lang.String[] strArray19 = attributes17.keys;
        java.lang.String[] strArray20 = attributes17.keys;
        attributes17.remove("hi!");
        java.lang.String[] strArray23 = attributes17.vals;
        attributes0.addAll(attributes17);
        java.lang.String str25 = attributes0.toString();
        java.lang.String[] strArray26 = attributes0.keys;
        java.lang.String str28 = attributes0.get(" data-=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        attributes0.removeIgnoreCase(" =\"hi!\"");
        java.lang.String str6 = attributes0.get(" =\"\"");
        attributes0.normalize();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        java.lang.String str1 = org.jsoup.nodes.Attributes.checkNotNull("    data-=\"data-\"=\"\"=\" =&quot;&quot;\"=\"  data-=&quot;&quot;=&quot; data-=&amp;quot;&amp;quot;  hi!=&amp;quot;&amp;quot;=&amp;quot; null=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    data-=\"data-\"=\"\"=\" =&quot;&quot;\"=\"  data-=&quot;&quot;=&quot; data-=&amp;quot;&amp;quot;  hi!=&amp;quot;&amp;quot;=&amp;quot; null=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"" + "'", str1, "    data-=\"data-\"=\"\"=\" =&quot;&quot;\"=\"  data-=&quot;&quot;=&quot; data-=&amp;quot;&amp;quot;  hi!=&amp;quot;&amp;quot;=&amp;quot; null=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        java.lang.String[] strArray5 = attributes3.keys;
        java.lang.String[] strArray6 = attributes3.keys;
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.normalize();
        java.lang.String[] strArray15 = attributes13.keys;
        java.lang.String[] strArray16 = attributes13.keys;
        attributes13.remove("hi!");
        java.lang.String[] strArray19 = attributes13.vals;
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes20.spliterator();
        java.lang.String[] strArray22 = new java.lang.String[] {};
        attributes20.keys = strArray22;
        boolean boolean24 = attributes13.equals((java.lang.Object) strArray22);
        boolean boolean25 = attributes7.equals((java.lang.Object) strArray22);
        attributes3.vals = strArray22;
        attributes0.vals = strArray22;
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor28 = attributes0.iterator();
        attributes0.remove("");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        attributes31.normalize();
        java.lang.String[] strArray33 = attributes31.keys;
        java.lang.String[] strArray34 = attributes31.keys;
        attributes31.remove("hi!");
        int int37 = attributes31.size();
        org.jsoup.nodes.Attributes attributes40 = attributes31.put("", " =\"\"");
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        boolean boolean43 = attributes41.hasKeyIgnoreCase("hi!");
        java.lang.String str45 = attributes41.get("hi!");
        attributes41.normalize();
        boolean boolean48 = attributes41.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes41.iterator();
        java.lang.String str50 = attributes41.toString();
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        attributes51.normalize();
        java.lang.String[] strArray53 = attributes51.keys;
        java.lang.String[] strArray54 = attributes51.keys;
        attributes51.remove("");
        java.lang.String[] strArray57 = attributes51.vals;
        attributes41.vals = strArray57;
        org.jsoup.nodes.Attributes attributes61 = attributes41.put("  hi!=\"\"", true);
        org.jsoup.nodes.Attributes attributes62 = new org.jsoup.nodes.Attributes();
        boolean boolean64 = attributes62.hasKeyIgnoreCase("hi!");
        attributes62.putIgnoreCase("hi!", "");
        attributes62.normalize();
        int int70 = attributes62.indexOfKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes71 = new org.jsoup.nodes.Attributes();
        attributes71.normalize();
        java.lang.String[] strArray73 = attributes71.keys;
        java.lang.String[] strArray74 = attributes71.keys;
        java.lang.String str76 = attributes71.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes79 = attributes71.put("", "");
        attributes79.removeIgnoreCase("");
        java.lang.String[] strArray82 = attributes79.keys;
        org.jsoup.nodes.Attributes attributes85 = attributes79.put("data-", "");
        boolean boolean86 = attributes62.equals((java.lang.Object) "data-");
        java.lang.String[] strArray87 = attributes62.vals;
        attributes61.vals = strArray87;
        attributes31.keys = strArray87;
        attributes0.keys = strArray87;
        int int92 = attributes0.indexOfKey("  hi!=\"\"=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeItor28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "data-", null, null, null });
        org.junit.Assert.assertNotNull(attributes85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes0.put("", "");
        attributes8.remove("hi!");
        java.lang.String str12 = attributes8.get("");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.normalize();
        java.lang.String[] strArray15 = attributes13.keys;
        java.lang.String[] strArray16 = attributes13.keys;
        java.lang.String str18 = attributes13.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes21 = attributes13.put("", "");
        attributes13.normalize();
        attributes13.remove(" hi!=\"hi!\"");
        boolean boolean25 = attributes8.equals((java.lang.Object) attributes13);
        org.jsoup.nodes.Attributes attributes28 = attributes13.put("  hi!=\"hi!\"=\" data-=&quot;data-&quot;\"", "  hi!=\"data-\"=\"  null=&quot;&quot;=&quot; hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        attributes0.removeIgnoreCase(" data-=\"data-\"");
        boolean boolean12 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\"");
        java.lang.String[] strArray13 = attributes0.keys;
        java.lang.String str14 = attributes0.html();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("");
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        attributes4.normalize();
        java.lang.String[] strArray6 = attributes4.keys;
        java.lang.String[] strArray7 = attributes4.keys;
        attributes4.remove("hi!");
        java.lang.String[] strArray10 = attributes4.vals;
        java.lang.String[] strArray11 = attributes4.keys;
        attributes0.keys = strArray11;
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes0.iterator();
        java.lang.String str15 = attributes0.html();
        org.jsoup.nodes.Attributes attributes18 = attributes0.put(" hi!=\"hi!\"    hi!=\"\"=\"data-\"", "    data-=\"data-\"=\"\"=\" =&quot;&quot;\"=\"  data-=&quot;&quot;=&quot; data-=&amp;quot;&amp;quot;  hi!=&amp;quot;&amp;quot;=&amp;quot; null=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.remove("");
        java.lang.String[] strArray6 = attributes0.vals;
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.normalize();
        attributes8.remove("hi!");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        java.lang.String[] strArray15 = attributes12.keys;
        java.lang.String str17 = attributes12.getIgnoreCase("");
        int int18 = attributes12.size();
        java.lang.String[] strArray19 = attributes12.vals;
        attributes8.keys = strArray19;
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes21.spliterator();
        int int23 = attributes21.size();
        int int24 = attributes21.size();
        org.jsoup.nodes.Attributes attributes27 = attributes21.put("", "hi!");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        java.lang.String[] strArray30 = attributes28.keys;
        java.lang.String str32 = attributes28.get("");
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        boolean boolean35 = attributes33.hasKeyIgnoreCase("hi!");
        java.lang.String str37 = attributes33.get("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes33.keys = strArray42;
        attributes28.keys = strArray42;
        java.lang.String[] strArray45 = attributes28.keys;
        java.lang.String[] strArray46 = attributes28.vals;
        attributes21.keys = strArray46;
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        attributes48.normalize();
        java.lang.String[] strArray50 = attributes48.keys;
        java.lang.String str52 = attributes48.get("");
        org.jsoup.nodes.Attributes attributes53 = new org.jsoup.nodes.Attributes();
        boolean boolean55 = attributes53.hasKeyIgnoreCase("hi!");
        java.lang.String str57 = attributes53.get("hi!");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes53.keys = strArray62;
        attributes48.keys = strArray62;
        org.jsoup.nodes.Attributes attributes65 = new org.jsoup.nodes.Attributes();
        attributes65.normalize();
        java.lang.String[] strArray67 = attributes65.keys;
        java.lang.String[] strArray68 = attributes65.keys;
        attributes65.remove("hi!");
        java.lang.String[] strArray71 = attributes65.vals;
        attributes48.addAll(attributes65);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = attributes48.dataset();
        java.lang.String[] strArray74 = attributes48.keys;
        attributes21.keys = strArray74;
        attributes8.keys = strArray74;
        java.util.Map<java.lang.String, java.lang.String> strMap77 = attributes8.dataset();
        attributes0.addAll(attributes8);
        java.lang.String str79 = attributes0.toString();
        java.lang.String str81 = attributes0.getIgnoreCase(" data-=\"data-\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes4.spliterator();
        java.lang.String str7 = attributes4.getIgnoreCase(" hi!=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes4.spliterator();
        org.jsoup.nodes.Attributes attributes11 = attributes4.put(" data-=\"data-\"", " hi!=\" data-=&quot;data-&quot;\"");
        java.lang.String[] strArray12 = attributes11.keys;
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { " data-=\"data-\"", null, null, null });
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        int int15 = attributes11.indexOfKey("");
        java.lang.String str17 = attributes11.getIgnoreCase("");
        attributes0.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        attributes21.normalize();
        java.lang.String[] strArray23 = attributes21.keys;
        java.lang.String str25 = attributes21.get("");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        boolean boolean28 = attributes26.hasKeyIgnoreCase("hi!");
        java.lang.String str30 = attributes26.get("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes26.keys = strArray35;
        attributes21.keys = strArray35;
        java.lang.String[] strArray38 = attributes21.keys;
        java.lang.String[] strArray39 = attributes21.vals;
        boolean boolean41 = attributes21.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes42 = attributes21.clone();
        boolean boolean44 = attributes21.hasKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes47 = attributes21.put(" hi!=\"\"", false);
        attributes0.addAll(attributes47);
        attributes47.putIgnoreCase(" hi!=\" data-=&quot;data-&quot;\"", " data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        attributes52.normalize();
        java.lang.String[] strArray54 = attributes52.keys;
        int int56 = attributes52.indexOfKey("");
        boolean boolean58 = attributes52.hasKeyIgnoreCase("");
        java.lang.String str59 = attributes52.toString();
        java.lang.String[] strArray60 = attributes52.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap61 = attributes52.dataset();
        org.jsoup.nodes.Attributes attributes62 = attributes52.clone();
        org.jsoup.nodes.Attributes attributes63 = attributes62.clone();
        boolean boolean64 = attributes47.equals((java.lang.Object) attributes63);
        java.lang.String str65 = attributes47.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator66 = attributes47.spliterator();
        java.lang.String str67 = attributes47.toString();
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "  hi!=\" data-=&quot;data-&quot;\"=\" data-=&quot;data-&quot;\"" + "'", str65, "  hi!=\" data-=&quot;data-&quot;\"=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "  hi!=\" data-=&quot;data-&quot;\"=\" data-=&quot;data-&quot;\"" + "'", str67, "  hi!=\" data-=&quot;data-&quot;\"=\" data-=&quot;data-&quot;\"");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        attributes7.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = attributes7.put("hi!", "hi!");
        java.lang.String str20 = attributes7.getIgnoreCase("data-");
        attributes7.remove(" hi!=\"hi!\"");
        attributes7.remove(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        attributes25.normalize();
        java.lang.String[] strArray27 = attributes25.keys;
        java.lang.String[] strArray28 = attributes25.keys;
        java.lang.String str30 = attributes25.getIgnoreCase("");
        int int31 = attributes25.size();
        java.lang.String[] strArray32 = attributes25.vals;
        java.lang.String str33 = attributes25.toString();
        attributes25.removeIgnoreCase("hi!");
        attributes25.removeIgnoreCase("");
        attributes7.addAll(attributes25);
        int int40 = attributes7.indexOfKey("data-");
        java.lang.String str41 = attributes7.html();
        java.lang.Appendable appendable42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes7.html(appendable42, outputSettings43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " hi!=\"hi!\"" + "'", str41, " hi!=\"hi!\"");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.remove("");
        java.lang.String[] strArray6 = attributes0.vals;
        java.lang.String[] strArray7 = attributes0.keys;
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.normalize();
        attributes8.remove("hi!");
        java.lang.String str12 = attributes8.toString();
        attributes8.normalize();
        boolean boolean14 = attributes0.equals((java.lang.Object) attributes8);
        int int16 = attributes8.indexOfKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes8.spliterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        attributes18.normalize();
        java.lang.String[] strArray20 = attributes18.keys;
        java.lang.String[] strArray21 = attributes18.keys;
        attributes18.remove("");
        java.lang.String[] strArray24 = attributes18.vals;
        java.lang.String[] strArray25 = attributes18.keys;
        attributes8.keys = strArray25;
        attributes8.remove("  data-=\" =&quot;&quot;\"=\" null=&quot;&quot;\"");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = attributes8.dataset();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes0.put("", "");
        java.lang.String[] strArray9 = attributes8.vals;
        boolean boolean11 = attributes8.hasKey(" =\"hi!\"");
        org.jsoup.nodes.Attributes attributes12 = attributes8.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes8.dataset();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int2 = attributes0.indexOfKey("hi!");
        java.lang.String[] strArray3 = attributes0.keys;
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKeyIgnoreCase("hi!");
        java.lang.String str8 = attributes4.get("hi!");
        attributes4.normalize();
        attributes4.putIgnoreCase("", "");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.normalize();
        java.lang.String[] strArray15 = attributes13.keys;
        int int17 = attributes13.indexOfKey("");
        boolean boolean19 = attributes13.hasKeyIgnoreCase("");
        boolean boolean21 = attributes13.hasKeyIgnoreCase("data-");
        attributes4.addAll(attributes13);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.normalize();
        java.lang.String[] strArray25 = attributes23.keys;
        java.lang.String str27 = attributes23.get("");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKeyIgnoreCase("hi!");
        java.lang.String str32 = attributes28.get("hi!");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes28.keys = strArray37;
        attributes23.keys = strArray37;
        attributes13.keys = strArray37;
        org.jsoup.nodes.Attributes attributes43 = attributes13.put(" hi!=\"hi!\"", false);
        java.lang.String[] strArray46 = new java.lang.String[] { " data-=\"data-\"", " data-=\"data-\"" };
        attributes43.vals = strArray46;
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        attributes48.normalize();
        java.lang.String[] strArray50 = attributes48.keys;
        int int52 = attributes48.indexOfKey("");
        boolean boolean54 = attributes48.hasKeyIgnoreCase("");
        java.lang.String str55 = attributes48.toString();
        boolean boolean56 = attributes43.equals((java.lang.Object) attributes48);
        attributes0.addAll(attributes48);
        java.lang.String str58 = attributes48.toString();
        attributes48.putIgnoreCase("  null=\"\"=\" hi!=&quot;hi!&quot;\"", " =\"hi!\" hi!=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator62 = attributes48.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { " data-=\"data-\"", " data-=\"data-\"" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(attributeSpliterator62);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("data-", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes9 = attributes0.put("data-", " data-=\" =&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.normalize();
        attributes10.remove("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        java.lang.String[] strArray16 = attributes14.keys;
        java.lang.String[] strArray17 = attributes14.keys;
        java.lang.String str19 = attributes14.getIgnoreCase("");
        int int20 = attributes14.size();
        java.lang.String[] strArray21 = attributes14.vals;
        attributes10.keys = strArray21;
        java.lang.String str24 = attributes10.get(" data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        attributes25.normalize();
        java.lang.String[] strArray27 = attributes25.keys;
        java.lang.String[] strArray28 = attributes25.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = attributes25.dataset();
        java.lang.String str30 = attributes25.html();
        attributes25.remove(" hi!=\"hi!\"");
        java.lang.String[] strArray33 = attributes25.vals;
        java.lang.String[] strArray34 = attributes25.keys;
        attributes10.keys = strArray34;
        attributes0.addAll(attributes10);
        int int38 = attributes0.indexOfKey(" data-=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        int int15 = attributes11.indexOfKey("");
        java.lang.String str17 = attributes11.getIgnoreCase("");
        attributes0.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        java.lang.String str22 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes25 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes26 = attributes0.clone();
        attributes0.removeIgnoreCase("");
        attributes0.removeIgnoreCase(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        attributes31.normalize();
        java.lang.String[] strArray33 = attributes31.keys;
        java.lang.String[] strArray34 = attributes31.keys;
        java.lang.String str36 = attributes31.getIgnoreCase("");
        int int37 = attributes31.size();
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator39 = attributes38.spliterator();
        java.lang.String str41 = attributes38.getIgnoreCase("");
        attributes38.removeIgnoreCase("data-");
        attributes31.addAll(attributes38);
        org.jsoup.nodes.Attributes attributes47 = attributes31.put("hi!", false);
        java.lang.String[] strArray48 = null;
        attributes47.keys = strArray48;
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        attributes50.normalize();
        java.lang.String[] strArray52 = attributes50.keys;
        int int54 = attributes50.indexOfKey("");
        boolean boolean56 = attributes50.hasKeyIgnoreCase("");
        boolean boolean58 = attributes50.hasKeyIgnoreCase("data-");
        java.lang.String[] strArray59 = attributes50.keys;
        java.util.List<org.jsoup.nodes.Attribute> attributeList60 = attributes50.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList61 = attributes50.asList();
        attributes50.putIgnoreCase("hi!", "data-");
        org.jsoup.nodes.Attributes attributes65 = new org.jsoup.nodes.Attributes();
        attributes65.normalize();
        java.lang.String[] strArray67 = attributes65.keys;
        java.lang.String[] strArray68 = attributes65.keys;
        attributes65.remove("");
        java.lang.String[] strArray71 = attributes65.vals;
        java.lang.String[] strArray72 = attributes65.keys;
        attributes50.vals = strArray72;
        attributes47.vals = strArray72;
        attributes0.keys = strArray72;
        java.lang.String str77 = attributes0.get(" null=\"hi!\"");
        org.jsoup.nodes.Attributes attributes80 = attributes0.put(" data-=\"\"", " null=\"\"");
        java.lang.String[] strArray81 = attributes80.keys;
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeList60);
        org.junit.Assert.assertNotNull(attributeList61);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(attributes80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { " data-=\"\"", null, null, null });
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.lang.String str1 = org.jsoup.nodes.Attributes.checkNotNull(" hi!=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!=\" hi!=&quot;hi!&quot;\"" + "'", str1, " hi!=\" hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes10 = attributes0.put("data-", false);
        org.jsoup.nodes.Attributes attributes13 = attributes0.put(" data-=\" =&quot;&quot;\"", " null=\"\"");
        int int14 = attributes13.size();
        attributes13.putIgnoreCase("   hi!=\"\"=\"data-\"=\" data-=&quot; =&amp;quot;&amp;quot;&quot;\"", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        attributes3.normalize();
        java.lang.String[] strArray5 = attributes3.keys;
        java.lang.String[] strArray6 = attributes3.keys;
        attributes3.remove("");
        java.lang.String[] strArray9 = attributes3.vals;
        java.lang.String[] strArray10 = attributes3.keys;
        attributes0.keys = strArray10;
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        java.lang.String[] strArray15 = attributes12.keys;
        java.lang.String str17 = attributes12.getIgnoreCase("");
        int int18 = attributes12.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes19.spliterator();
        java.lang.String str22 = attributes19.getIgnoreCase("");
        attributes19.removeIgnoreCase("data-");
        attributes12.addAll(attributes19);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes19.dataset();
        java.lang.String[] strArray27 = attributes19.vals;
        attributes0.vals = strArray27;
        boolean boolean30 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        attributes31.normalize();
        java.lang.String[] strArray33 = attributes31.keys;
        int int35 = attributes31.indexOfKey("");
        boolean boolean37 = attributes31.hasKeyIgnoreCase("");
        boolean boolean39 = attributes31.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        attributes40.normalize();
        java.lang.String[] strArray42 = attributes40.keys;
        java.lang.String[] strArray43 = attributes40.keys;
        java.lang.String str45 = attributes40.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes48 = attributes40.put("", "");
        attributes48.removeIgnoreCase("");
        java.lang.String[] strArray51 = attributes48.keys;
        attributes31.keys = strArray51;
        boolean boolean53 = attributes0.equals((java.lang.Object) attributes31);
        org.jsoup.nodes.Attributes attributes56 = attributes0.put("  data-=\"data-\"=\"\"", true);
        boolean boolean58 = attributes56.hasKeyIgnoreCase("  data-=\" =&quot;&quot;\"=\" null=&quot;&quot;\"");
        java.lang.String str59 = attributes56.html();
        java.lang.String[] strArray60 = attributes56.keys;
        int int62 = attributes56.indexOfKey(" =\"\"");
        java.lang.String str63 = attributes56.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "   data-=\"data-\"=\"\"" + "'", str59, "   data-=\"data-\"=\"\"");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "  data-=\"data-\"=\"\"", null, null, null });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "   data-=\"data-\"=\"\"" + "'", str63, "   data-=\"data-\"=\"\"");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes0.put("", "");
        attributes0.normalize();
        attributes0.putIgnoreCase("data-", "");
        attributes0.putIgnoreCase(" hi!=\"hi!\"", "");
        org.jsoup.nodes.Attributes attributes16 = attributes0.clone();
        java.lang.String str17 = attributes0.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " =\"\" data-=\"\"  hi!=\"hi!\"=\"\"" + "'", str17, " =\"\" data-=\"\"  hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String str4 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes5.keys = strArray14;
        attributes0.keys = strArray14;
        java.lang.String[] strArray17 = attributes0.keys;
        java.lang.String[] strArray18 = attributes0.vals;
        org.jsoup.nodes.Attributes attributes19 = attributes0.clone();
        boolean boolean21 = attributes19.hasKey(" data-=\"\"");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes19.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes19.spliterator();
        java.lang.String str25 = attributes19.getIgnoreCase(" =\"\" data-=\"data-\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("", "hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        boolean boolean9 = attributes7.hasKeyIgnoreCase("hi!");
        java.lang.String str11 = attributes7.get("hi!");
        attributes7.normalize();
        boolean boolean14 = attributes7.hasKey("");
        java.lang.String str15 = attributes7.html();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.normalize();
        java.lang.String[] strArray18 = attributes16.keys;
        int int20 = attributes16.indexOfKey("");
        attributes7.addAll(attributes16);
        boolean boolean22 = attributes0.equals((java.lang.Object) attributes7);
        boolean boolean24 = attributes0.hasKeyIgnoreCase("");
        attributes0.remove("");
        java.lang.String str28 = attributes0.getIgnoreCase("hi!");
        int int29 = attributes0.size();
        org.jsoup.nodes.Attributes attributes30 = attributes0.clone();
        attributes30.normalize();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        attributes0.putIgnoreCase("hi!", " data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes13 = attributes0.put(" null=\"\"", false);
        java.lang.String[] strArray14 = attributes13.vals;
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        boolean boolean17 = attributes15.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes18 = attributes15.clone();
        boolean boolean20 = attributes15.hasKeyIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes23 = attributes15.put(" hi!=\"\"", true);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes23.spliterator();
        int int26 = attributes23.indexOfKey("");
        boolean boolean27 = attributes13.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        java.lang.String[] strArray30 = attributes28.keys;
        java.lang.String[] strArray31 = attributes28.keys;
        attributes28.remove("");
        java.lang.String[] strArray34 = attributes28.vals;
        java.lang.String[] strArray35 = attributes28.keys;
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        attributes36.normalize();
        attributes36.remove("hi!");
        java.lang.String str40 = attributes36.toString();
        attributes36.normalize();
        boolean boolean42 = attributes28.equals((java.lang.Object) attributes36);
        attributes36.remove("hi!");
        attributes36.normalize();
        org.jsoup.nodes.Attributes attributes48 = attributes36.put("  null=\"\"=\" hi!=&quot;hi!&quot;\"", " =\"\"");
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        attributes49.normalize();
        java.lang.String[] strArray51 = attributes49.keys;
        java.lang.String[] strArray52 = attributes49.keys;
        attributes49.remove("");
        java.lang.String[] strArray55 = attributes49.vals;
        java.lang.String[] strArray56 = attributes49.keys;
        org.jsoup.nodes.Attributes attributes57 = new org.jsoup.nodes.Attributes();
        attributes57.normalize();
        attributes57.remove("hi!");
        java.lang.String str61 = attributes57.toString();
        attributes57.normalize();
        boolean boolean63 = attributes49.equals((java.lang.Object) attributes57);
        attributes48.addAll(attributes49);
        attributes13.addAll(attributes48);
        java.util.List<org.jsoup.nodes.Attribute> attributeList66 = attributes13.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { " data-=\"data-\"", " =\"\"", null, null });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(attributeList66);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes0.put("", "");
        attributes8.remove("hi!");
        attributes8.normalize();
        attributes8.removeIgnoreCase("  =\"\"=\"\"  data-=\"\"=\" data-=&quot; =&amp;quot;&amp;quot;&quot;\"");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes8.html(appendable14, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "data-");
        org.jsoup.nodes.Attributes attributes10 = attributes7.put("", "hi!");
        attributes7.removeIgnoreCase("");
        attributes7.normalize();
        java.lang.String str14 = attributes7.html();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " hi!=\"data-\"" + "'", str14, " hi!=\"data-\"");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        attributes6.normalize();
        java.lang.String[] strArray8 = attributes6.keys;
        java.lang.String[] strArray9 = attributes6.keys;
        attributes0.vals = strArray9;
        org.jsoup.nodes.Attributes attributes11 = attributes0.clone();
        int int12 = attributes11.size();
        int int13 = attributes11.size();
        java.lang.String[] strArray14 = attributes11.vals;
        java.lang.String str16 = attributes11.getIgnoreCase("  hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.normalize();
        attributes17.remove("hi!");
        attributes17.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        attributes24.normalize();
        org.jsoup.nodes.Attributes attributes28 = attributes24.put("", false);
        int int30 = attributes28.indexOfKey("hi!");
        int int32 = attributes28.indexOfKey("");
        java.lang.String str34 = attributes28.getIgnoreCase("");
        attributes17.addAll(attributes28);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes17.iterator();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        attributes37.removeIgnoreCase("");
        int int40 = attributes37.size();
        java.lang.String str41 = attributes37.html();
        java.lang.String[] strArray42 = attributes37.keys;
        org.jsoup.nodes.Attributes attributes43 = attributes37.clone();
        java.lang.String[] strArray44 = attributes37.vals;
        attributes17.vals = strArray44;
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        attributes46.normalize();
        org.jsoup.nodes.Attributes attributes50 = attributes46.put("", false);
        int int52 = attributes46.indexOfKey("hi!");
        java.lang.String[] strArray53 = attributes46.vals;
        java.lang.String str54 = attributes46.html();
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator56 = attributes55.spliterator();
        java.lang.String[] strArray57 = new java.lang.String[] {};
        attributes55.keys = strArray57;
        attributes46.keys = strArray57;
        java.lang.String str60 = attributes46.html();
        org.jsoup.nodes.Attributes attributes63 = attributes46.put("  hi!=\"\"", "data-");
        java.lang.String str64 = attributes63.toString();
        attributes63.remove(" hi!=\" data-=&quot;data-&quot;\"");
        java.lang.String[] strArray67 = attributes63.vals;
        attributes17.vals = strArray67;
        attributes17.putIgnoreCase(" data-  null=\"\"=\"\"", " hi!");
        java.lang.String str72 = attributes17.html();
        org.jsoup.nodes.Attributes attributes73 = new org.jsoup.nodes.Attributes();
        boolean boolean75 = attributes73.hasKeyIgnoreCase("hi!");
        java.lang.String str77 = attributes73.get("hi!");
        attributes73.normalize();
        boolean boolean80 = attributes73.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor81 = attributes73.iterator();
        java.lang.String str83 = attributes73.get("");
        org.jsoup.nodes.Attributes attributes86 = attributes73.put("data-", "data-");
        org.jsoup.nodes.Attributes attributes87 = attributes73.clone();
        java.lang.String[] strArray88 = attributes73.keys;
        attributes17.vals = strArray88;
        attributes11.keys = strArray88;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(attributeSpliterator56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "   hi!=\"\"=\"data-\"" + "'", str64, "   hi!=\"\"=\"data-\"");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "data-", " hi!", null, null });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + " hi!=\"data-\"  data-  null=\"\"=\"\"=\" hi!\"" + "'", str72, " hi!=\"data-\"  data-  null=\"\"=\"\"=\" hi!\"");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(attributeItor81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(attributes86);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "data-" });
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes0.put("", "");
        attributes8.remove("hi!");
        java.lang.String str12 = attributes8.get("");
        boolean boolean14 = attributes8.hasKey(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        attributes15.removeIgnoreCase("");
        int int18 = attributes15.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        attributes19.normalize();
        java.lang.String[] strArray21 = attributes19.keys;
        java.lang.String[] strArray22 = attributes19.keys;
        attributes19.remove("hi!");
        java.lang.String[] strArray25 = attributes19.vals;
        java.lang.String[] strArray26 = attributes19.keys;
        attributes15.keys = strArray26;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes15.spliterator();
        boolean boolean29 = attributes8.equals((java.lang.Object) attributeSpliterator28);
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        int int32 = attributes30.size();
        int int33 = attributes30.size();
        org.jsoup.nodes.Attributes attributes36 = attributes30.put("", "hi!");
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        attributes37.normalize();
        java.lang.String[] strArray39 = attributes37.keys;
        java.lang.String str41 = attributes37.get("");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        boolean boolean44 = attributes42.hasKeyIgnoreCase("hi!");
        java.lang.String str46 = attributes42.get("hi!");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes42.keys = strArray51;
        attributes37.keys = strArray51;
        java.lang.String[] strArray54 = attributes37.keys;
        java.lang.String[] strArray55 = attributes37.vals;
        attributes30.keys = strArray55;
        org.jsoup.nodes.Attributes attributes57 = new org.jsoup.nodes.Attributes();
        attributes57.normalize();
        java.lang.String[] strArray59 = attributes57.keys;
        java.lang.String str61 = attributes57.get("");
        org.jsoup.nodes.Attributes attributes62 = new org.jsoup.nodes.Attributes();
        boolean boolean64 = attributes62.hasKeyIgnoreCase("hi!");
        java.lang.String str66 = attributes62.get("hi!");
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes62.keys = strArray71;
        attributes57.keys = strArray71;
        org.jsoup.nodes.Attributes attributes74 = new org.jsoup.nodes.Attributes();
        attributes74.normalize();
        java.lang.String[] strArray76 = attributes74.keys;
        java.lang.String[] strArray77 = attributes74.keys;
        attributes74.remove("hi!");
        java.lang.String[] strArray80 = attributes74.vals;
        attributes57.addAll(attributes74);
        java.util.Map<java.lang.String, java.lang.String> strMap82 = attributes57.dataset();
        java.lang.String[] strArray83 = attributes57.keys;
        attributes30.keys = strArray83;
        java.lang.String str85 = attributes30.html();
        org.jsoup.nodes.Attributes attributes86 = new org.jsoup.nodes.Attributes();
        attributes86.normalize();
        java.lang.String[] strArray88 = attributes86.keys;
        int int90 = attributes86.indexOfKey("");
        boolean boolean92 = attributes86.hasKeyIgnoreCase("");
        boolean boolean94 = attributes86.hasKeyIgnoreCase("data-");
        java.lang.String[] strArray95 = attributes86.keys;
        attributes30.vals = strArray95;
        attributes8.vals = strArray95;
        java.lang.Class<?> wildcardClass98 = attributes8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + " hi!=\"hi!\"" + "'", str85, " hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        boolean boolean7 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        java.lang.String str9 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.normalize();
        java.lang.String[] strArray12 = attributes10.keys;
        java.lang.String[] strArray13 = attributes10.keys;
        attributes10.remove("");
        java.lang.String[] strArray16 = attributes10.vals;
        attributes0.vals = strArray16;
        org.jsoup.nodes.Attributes attributes20 = attributes0.put("  hi!=\"\"", true);
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        attributes21.normalize();
        attributes21.remove("hi!");
        attributes21.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        org.jsoup.nodes.Attributes attributes32 = attributes28.put("", false);
        int int34 = attributes32.indexOfKey("hi!");
        int int36 = attributes32.indexOfKey("");
        java.lang.String str38 = attributes32.getIgnoreCase("");
        attributes21.addAll(attributes32);
        attributes0.addAll(attributes32);
        java.lang.String str41 = attributes32.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        boolean boolean7 = attributes0.hasKey("");
        java.lang.String str8 = attributes0.html();
        java.lang.String[] strArray9 = attributes0.keys;
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(" hi!=\"\"", true);
        org.jsoup.nodes.Attributes attributes13 = attributes12.clone();
        java.lang.String str15 = attributes13.getIgnoreCase(" data-=\"\"");
        attributes13.putIgnoreCase(" =\"\"", " data-=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes22 = attributes13.put(" hi!=\" hi!=&quot; null=&amp;quot;&amp;quot;&quot;\"", " hi!=\"hi!\"    hi!=\"\"=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.clone();
        boolean boolean15 = attributes13.hasKey(" hi!=\"\"");
        attributes13.removeIgnoreCase(" =\"\"");
        attributes13.remove("  =\"hi!\"=\"hi!\"");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        attributes13.html(appendable20, outputSettings21);
        attributes13.remove("    hi!=\"\"=\"data-\"=\" data-=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        org.jsoup.nodes.Attributes attributes16 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.hasKeyIgnoreCase("hi!");
        java.lang.String str21 = attributes17.get("hi!");
        attributes17.normalize();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = attributes17.dataset();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        boolean boolean26 = attributes24.hasKeyIgnoreCase("hi!");
        java.lang.String str28 = attributes24.get("hi!");
        attributes24.normalize();
        boolean boolean31 = attributes24.hasKey("");
        int int32 = attributes24.size();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = attributes24.dataset();
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        boolean boolean36 = attributes34.hasKeyIgnoreCase("hi!");
        java.lang.String str38 = attributes34.get("hi!");
        attributes34.normalize();
        attributes34.remove("hi!");
        java.lang.String[] strArray42 = attributes34.vals;
        attributes24.vals = strArray42;
        attributes17.keys = strArray42;
        attributes16.keys = strArray42;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator46 = attributes16.spliterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator46);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        int int15 = attributes11.indexOfKey("");
        java.lang.String str17 = attributes11.getIgnoreCase("");
        attributes0.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.lang.String str20 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " hi!=\"\"" + "'", str20, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        java.lang.String[] strArray3 = attributes0.vals;
        int int4 = attributes0.size();
        attributes0.putIgnoreCase(" hi!=\"\"", " data-=\"data-\"");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKeyIgnoreCase("hi!");
        java.lang.String str13 = attributes9.get("hi!");
        attributes9.normalize();
        attributes9.remove("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes9.iterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        attributes18.normalize();
        java.lang.String[] strArray20 = attributes18.keys;
        int int22 = attributes18.indexOfKey("");
        boolean boolean24 = attributes18.hasKeyIgnoreCase("");
        java.lang.String str25 = attributes18.toString();
        java.lang.String[] strArray26 = attributes18.keys;
        attributes9.keys = strArray26;
        boolean boolean29 = attributes9.hasKey(" hi!=\"hi!\"");
        attributes0.addAll(attributes9);
        java.lang.String str32 = attributes0.get("     hi!=\"\"=\"data-\"=\" data-=&quot;&quot;\"=\"  null=&quot;&quot;=&quot; hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        int int15 = attributes11.indexOfKey("");
        java.lang.String str17 = attributes11.getIgnoreCase("");
        attributes0.addAll(attributes11);
        boolean boolean20 = attributes0.hasKey(" hi!=\"hi!\"   null=\"\"=\" hi!=&quot;hi!&quot;\"=\"  null=&quot;&quot;=&quot; hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        boolean boolean10 = attributes0.hasKey("hi!");
        java.lang.String str12 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.normalize();
        java.lang.String[] strArray16 = attributes14.keys;
        java.lang.String[] strArray17 = attributes14.keys;
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.getIgnoreCase("");
        attributes18.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        attributes24.normalize();
        java.lang.String[] strArray26 = attributes24.keys;
        java.lang.String[] strArray27 = attributes24.keys;
        attributes24.remove("hi!");
        java.lang.String[] strArray30 = attributes24.vals;
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes31.spliterator();
        java.lang.String[] strArray33 = new java.lang.String[] {};
        attributes31.keys = strArray33;
        boolean boolean35 = attributes24.equals((java.lang.Object) strArray33);
        boolean boolean36 = attributes18.equals((java.lang.Object) strArray33);
        attributes14.vals = strArray33;
        attributes0.keys = strArray33;
        int int40 = attributes0.indexOfKey("  hi!=\"data-\"=\"  null=&quot;&quot;=&quot; hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList41 = attributes0.asList();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(attributeList41);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.vals;
        java.lang.String str8 = attributes0.toString();
        attributes0.removeIgnoreCase("hi!");
        attributes0.removeIgnoreCase("");
        org.jsoup.nodes.Attributes attributes15 = attributes0.put("", "");
        attributes0.normalize();
        boolean boolean18 = attributes0.hasKey(" =\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        attributes0.remove("data-");
        int int7 = attributes0.size();
        java.lang.String str8 = attributes0.html();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes9.spliterator();
        java.lang.String str12 = attributes9.getIgnoreCase("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes9.asList();
        int int15 = attributes9.indexOfKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes9.iterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.normalize();
        java.lang.String[] strArray19 = attributes17.keys;
        java.lang.String[] strArray20 = attributes17.keys;
        boolean boolean22 = attributes17.hasKey("hi!");
        java.lang.String str23 = attributes17.html();
        java.lang.String[] strArray24 = attributes17.keys;
        attributes9.vals = strArray24;
        attributes0.vals = strArray24;
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        attributes0.html(appendable27, outputSettings28);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = attributes0.dataset();
        int int4 = attributes0.indexOfKey("");
        int int6 = attributes0.indexOfKey(" hi!=\"hi!\"");
        java.lang.String str7 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String[] strArray7 = attributes0.keys;
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        attributes8.html(appendable9, outputSettings10);
        java.lang.String str12 = attributes8.html();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.normalize();
        java.lang.String[] strArray15 = attributes13.keys;
        java.lang.String[] strArray16 = attributes13.keys;
        java.lang.String str18 = attributes13.getIgnoreCase("");
        int int19 = attributes13.size();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes20.spliterator();
        java.lang.String str23 = attributes20.getIgnoreCase("");
        attributes20.removeIgnoreCase("data-");
        attributes13.addAll(attributes20);
        attributes20.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes31 = attributes20.put("hi!", "hi!");
        java.lang.String str33 = attributes20.getIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator34 = attributes20.spliterator();
        attributes8.addAll(attributes20);
        attributes8.removeIgnoreCase(" data-=\" =&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        attributes38.normalize();
        org.jsoup.nodes.Attributes attributes42 = attributes38.put("", false);
        int int44 = attributes38.indexOfKey("hi!");
        java.lang.String[] strArray45 = attributes38.vals;
        boolean boolean47 = attributes38.hasKeyIgnoreCase("");
        java.lang.String str49 = attributes38.get("  hi!=\"\"");
        int int50 = attributes38.size();
        boolean boolean52 = attributes38.hasKey("hi!");
        attributes38.normalize();
        attributes8.addAll(attributes38);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = attributes38.dataset();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributeSpliterator34);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes7.dataset();
        java.lang.String[] strArray15 = attributes7.vals;
        java.lang.String str16 = attributes7.toString();
        int int18 = attributes7.indexOfKey(" =\"hi!\"");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        attributes7.html(appendable19, outputSettings20);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes3 = attributes0.clone();
        java.lang.String str5 = attributes3.getIgnoreCase("");
        attributes3.removeIgnoreCase("hi!");
        attributes3.putIgnoreCase("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        attributes11.normalize();
        java.lang.String[] strArray13 = attributes11.keys;
        java.lang.String[] strArray14 = attributes11.keys;
        java.lang.String str16 = attributes11.getIgnoreCase("");
        int int17 = attributes11.size();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.getIgnoreCase("");
        attributes18.removeIgnoreCase("data-");
        attributes11.addAll(attributes18);
        attributes18.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes29 = attributes18.put("hi!", "hi!");
        int int31 = attributes18.indexOfKey(" hi!=\"hi!\"");
        java.lang.String str32 = attributes18.html();
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        boolean boolean35 = attributes33.hasKeyIgnoreCase("hi!");
        java.lang.String str37 = attributes33.get("hi!");
        attributes33.normalize();
        boolean boolean40 = attributes33.hasKey("");
        int int41 = attributes33.size();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = attributes33.dataset();
        int int44 = attributes33.indexOfKey("data-");
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        attributes45.normalize();
        java.lang.String[] strArray47 = attributes45.keys;
        java.lang.String[] strArray48 = attributes45.keys;
        java.lang.String str50 = attributes45.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        boolean boolean53 = attributes51.hasKeyIgnoreCase("hi!");
        java.lang.String str55 = attributes51.get("hi!");
        attributes51.normalize();
        boolean boolean58 = attributes51.hasKey("");
        int int59 = attributes51.size();
        java.util.Map<java.lang.String, java.lang.String> strMap60 = attributes51.dataset();
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        boolean boolean63 = attributes61.hasKeyIgnoreCase("hi!");
        java.lang.String str65 = attributes61.get("hi!");
        attributes61.normalize();
        attributes61.remove("hi!");
        java.lang.String[] strArray69 = attributes61.vals;
        attributes51.vals = strArray69;
        attributes45.vals = strArray69;
        boolean boolean72 = attributes33.equals((java.lang.Object) strArray69);
        org.jsoup.nodes.Attributes attributes75 = attributes33.put(" hi!=\"hi!\"", true);
        boolean boolean76 = attributes18.equals((java.lang.Object) attributes75);
        boolean boolean77 = attributes3.equals((java.lang.Object) attributes18);
        attributes18.remove("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor80 = attributes18.iterator();
        java.lang.Appendable appendable81 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings82 = null;
        attributes18.html(appendable81, outputSettings82);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " hi!=\"hi!\"" + "'", str32, " hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(attributeItor80);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        java.lang.String str7 = attributes0.getIgnoreCase(" data-=\"\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes11 = attributes0.put(" data-=\"\"", false);
        java.lang.String str13 = attributes11.getIgnoreCase(" data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes14 = attributes11.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        attributes0.remove("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes8.spliterator();
        int int10 = attributes8.size();
        java.lang.String[] strArray11 = attributes8.vals;
        attributes8.remove("hi!");
        java.lang.String[] strArray14 = attributes8.vals;
        attributes0.vals = strArray14;
        org.jsoup.nodes.Attributes attributes18 = attributes0.put(" =\"\"", false);
        java.lang.String str19 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes0.spliterator();
        attributes0.remove(" =\" =&quot;hi!&quot;\"  hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributeSpliterator20);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        attributes4.normalize();
        java.lang.String[] strArray6 = attributes4.keys;
        java.lang.String[] strArray7 = attributes4.keys;
        boolean boolean9 = attributes4.hasKey("hi!");
        java.lang.String str10 = attributes4.html();
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        attributes0.normalize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("hi!", "hi!");
        attributes0.putIgnoreCase("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes0.asList();
        int int11 = attributes0.size();
        attributes0.removeIgnoreCase(" null=\"hi!\"");
        org.jsoup.nodes.Attributes attributes16 = attributes0.put("  hi!=\"\"  =\"\"=\" data-=&quot;&quot;\"", " null=\"hi!\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributeList17);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        attributes7.removeIgnoreCase("hi!");
        java.lang.String str17 = attributes7.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = attributes7.clone();
        org.jsoup.nodes.Attributes attributes19 = attributes18.clone();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.normalize();
        java.lang.String[] strArray22 = attributes20.keys;
        java.lang.String[] strArray23 = attributes20.keys;
        java.lang.String str25 = attributes20.getIgnoreCase("");
        int int26 = attributes20.size();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes27.spliterator();
        java.lang.String str30 = attributes27.getIgnoreCase("");
        attributes27.removeIgnoreCase("data-");
        attributes20.addAll(attributes27);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = attributes27.dataset();
        java.lang.String[] strArray35 = attributes27.vals;
        java.lang.String str36 = attributes27.toString();
        boolean boolean38 = attributes27.hasKeyIgnoreCase("  hi!=\"\"=\"data-\"");
        attributes19.addAll(attributes27);
        java.lang.String[] strArray40 = attributes27.vals;
        org.jsoup.nodes.Attributes attributes41 = attributes27.clone();
        java.lang.Appendable appendable42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        attributes27.html(appendable42, outputSettings43);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "data-");
        org.jsoup.nodes.Attributes attributes10 = attributes7.put("", "hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes10.put(" hi!=\"\"", true);
        attributes13.putIgnoreCase(" =\"\"", " hi!=\"\"");
        boolean boolean18 = attributes13.hasKey("  =\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        boolean boolean7 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        java.lang.String str10 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.put("data-", "data-");
        java.lang.String str14 = attributes13.toString();
        org.jsoup.nodes.Attributes attributes17 = attributes13.put("data-", " data-=\"data-\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes13.iterator();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        attributes19.normalize();
        java.lang.String[] strArray21 = attributes19.keys;
        java.lang.String[] strArray22 = attributes19.keys;
        attributes19.normalize();
        java.lang.String str24 = attributes19.html();
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        attributes25.normalize();
        java.lang.String[] strArray27 = attributes25.keys;
        java.lang.String[] strArray28 = attributes25.keys;
        java.lang.String str30 = attributes25.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes33 = attributes25.put("", "");
        attributes33.removeIgnoreCase("");
        java.lang.String[] strArray36 = attributes33.keys;
        org.jsoup.nodes.Attributes attributes39 = attributes33.put("data-", "");
        org.jsoup.nodes.Attributes attributes42 = attributes33.put("hi!", true);
        attributes33.normalize();
        attributes19.addAll(attributes33);
        java.lang.String[] strArray45 = attributes33.keys;
        attributes13.keys = strArray45;
        java.lang.String str48 = attributes13.get("  data-=\"data-\"=\"\"");
        attributes13.normalize();
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        attributes50.normalize();
        java.lang.String[] strArray52 = attributes50.keys;
        java.lang.String[] strArray53 = attributes50.keys;
        attributes50.remove("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList56 = attributes50.asList();
        boolean boolean58 = attributes50.hasKey(" data-=\" =&quot;&quot;\"");
        attributes13.addAll(attributes50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " data-=\"data-\"" + "'", str14, " data-=\"data-\"");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "data-", "hi!", null, null });
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "data-", "hi!", null, null });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeList56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        attributes0.keys = strArray2;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.normalize();
        java.lang.String[] strArray7 = attributes5.keys;
        java.lang.String[] strArray8 = attributes5.keys;
        java.lang.String str10 = attributes5.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes13 = attributes5.put("", "");
        attributes13.removeIgnoreCase("");
        java.lang.String[] strArray16 = attributes13.keys;
        org.jsoup.nodes.Attributes attributes19 = attributes13.put("data-", "");
        java.lang.String[] strArray20 = attributes19.vals;
        boolean boolean21 = attributes0.equals((java.lang.Object) attributes19);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        attributes22.normalize();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator25 = attributes24.spliterator();
        java.lang.String str27 = attributes24.getIgnoreCase("");
        attributes24.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        attributes30.normalize();
        java.lang.String[] strArray32 = attributes30.keys;
        java.lang.String[] strArray33 = attributes30.keys;
        attributes30.remove("hi!");
        java.lang.String[] strArray36 = attributes30.vals;
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes37.spliterator();
        java.lang.String[] strArray39 = new java.lang.String[] {};
        attributes37.keys = strArray39;
        boolean boolean41 = attributes30.equals((java.lang.Object) strArray39);
        boolean boolean42 = attributes24.equals((java.lang.Object) strArray39);
        attributes22.vals = strArray39;
        boolean boolean44 = attributes19.equals((java.lang.Object) attributes22);
        java.lang.String str46 = attributes22.get(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        attributes47.normalize();
        java.lang.String[] strArray49 = attributes47.keys;
        java.lang.String[] strArray50 = attributes47.keys;
        java.lang.String str52 = attributes47.getIgnoreCase("");
        int int53 = attributes47.size();
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator55 = attributes54.spliterator();
        java.lang.String str57 = attributes54.getIgnoreCase("");
        attributes54.removeIgnoreCase("data-");
        attributes47.addAll(attributes54);
        attributes54.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes65 = attributes54.put("hi!", "hi!");
        java.lang.String str67 = attributes54.getIgnoreCase("data-");
        attributes54.remove(" hi!=\"hi!\"");
        attributes54.remove(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes72 = new org.jsoup.nodes.Attributes();
        attributes72.normalize();
        java.lang.String[] strArray74 = attributes72.keys;
        java.lang.String[] strArray75 = attributes72.keys;
        java.lang.String str77 = attributes72.getIgnoreCase("");
        int int78 = attributes72.size();
        java.lang.String[] strArray79 = attributes72.vals;
        java.lang.String str80 = attributes72.toString();
        attributes72.removeIgnoreCase("hi!");
        attributes72.removeIgnoreCase("");
        attributes54.addAll(attributes72);
        attributes22.addAll(attributes72);
        attributes72.remove(" data-  null=\"\"=\"\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "data-", null, null, null });
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", null, null, null });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        attributes7.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = attributes7.put("hi!", "hi!");
        java.lang.String str20 = attributes7.getIgnoreCase("data-");
        attributes7.remove(" hi!=\"hi!\"");
        attributes7.remove(" hi!=\"hi!\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes7.iterator();
        java.lang.String str27 = attributes7.get(" data-=\"\"");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.normalize();
        java.lang.String[] strArray30 = attributes28.keys;
        java.lang.String[] strArray31 = attributes28.keys;
        java.lang.String str33 = attributes28.getIgnoreCase("");
        int int34 = attributes28.size();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator36 = attributes35.spliterator();
        java.lang.String str38 = attributes35.getIgnoreCase("");
        attributes35.removeIgnoreCase("data-");
        attributes28.addAll(attributes35);
        attributes35.removeIgnoreCase("hi!");
        java.lang.String str45 = attributes35.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes46 = attributes35.clone();
        attributes7.addAll(attributes46);
        attributes7.removeIgnoreCase("  hi!=\"hi!\"=\" data-=&quot;data-&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes46);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int2 = attributes0.indexOfKey("hi!");
        java.lang.String[] strArray3 = attributes0.keys;
        attributes0.normalize();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes0.dataset();
        java.lang.String str7 = attributes0.getIgnoreCase("   =\"\" data-=\"\"  hi!=\"hi!\"=\"\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        java.lang.String str4 = attributes0.toString();
        attributes0.normalize();
        boolean boolean7 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\"");
        java.lang.String[] strArray8 = attributes0.vals;
        attributes0.removeIgnoreCase("  data-=\" =&quot;&quot;\"=\" null=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        java.lang.String[] strArray10 = attributes7.keys;
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes11.spliterator();
        java.lang.String str14 = attributes11.getIgnoreCase("");
        attributes11.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.normalize();
        java.lang.String[] strArray19 = attributes17.keys;
        java.lang.String[] strArray20 = attributes17.keys;
        attributes17.remove("hi!");
        java.lang.String[] strArray23 = attributes17.vals;
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator25 = attributes24.spliterator();
        java.lang.String[] strArray26 = new java.lang.String[] {};
        attributes24.keys = strArray26;
        boolean boolean28 = attributes17.equals((java.lang.Object) strArray26);
        boolean boolean29 = attributes11.equals((java.lang.Object) strArray26);
        attributes7.vals = strArray26;
        attributes0.addAll(attributes7);
        boolean boolean33 = attributes7.hasKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes34 = attributes7.clone();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator35 = attributes34.spliterator();
        java.lang.String str36 = attributes34.toString();
        java.lang.String[] strArray37 = attributes34.keys;
        int int38 = attributes34.size();
        boolean boolean40 = attributes34.hasKey("  hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(attributeSpliterator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.lang.String[] strArray8 = attributes0.keys;
        boolean boolean10 = attributes0.hasKey("data-");
        org.jsoup.nodes.Attributes attributes13 = attributes0.put(" data-=\"data-\"", false);
        int int14 = attributes13.size();
        attributes13.putIgnoreCase("  hi!=\"hi!\"=\" data-=&quot;data-&quot;\"", "  data-=\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("hi!", "data-");
        org.jsoup.nodes.Attributes attributes10 = attributes7.put("", "hi!");
        java.lang.String[] strArray11 = attributes10.keys;
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", null, null });
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes0.put("", "");
        boolean boolean10 = attributes8.hasKeyIgnoreCase("hi!");
        int int12 = attributes8.indexOfKey(" data-=\"\"");
        attributes8.remove(" data-=\"\"");
        int int15 = attributes8.size();
        boolean boolean17 = attributes8.hasKeyIgnoreCase("  hi!=\"\"=\"data-\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes3 = attributes0.clone();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        int int6 = attributes0.indexOfKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        java.lang.String[] strArray9 = attributes7.keys;
        attributes7.removeIgnoreCase("");
        attributes0.addAll(attributes7);
        int int14 = attributes7.indexOfKey("  null=\"\"=\" hi!=&quot;hi!&quot;\"");
        java.lang.String str15 = attributes7.html();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.lang.String[] strArray8 = attributes0.keys;
        java.lang.String str10 = attributes0.get(" hi!=\"hi!\"");
        attributes0.remove(" =\"\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes16 = attributes0.put("  =\"hi!\"=\"hi!\"", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("");
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        attributes4.normalize();
        java.lang.String[] strArray6 = attributes4.keys;
        java.lang.String[] strArray7 = attributes4.keys;
        attributes4.remove("hi!");
        java.lang.String[] strArray10 = attributes4.vals;
        java.lang.String[] strArray11 = attributes4.keys;
        attributes0.keys = strArray11;
        java.lang.String str14 = attributes0.get("hi!");
        boolean boolean16 = attributes0.hasKey(" data-=\"\"");
        org.jsoup.nodes.Attributes attributes19 = attributes0.put("hi!", true);
        java.lang.String[] strArray20 = attributes19.vals;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { null, null, null, null });
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        int int13 = attributes11.indexOfKey("hi!");
        int int15 = attributes11.indexOfKey("");
        java.lang.String str17 = attributes11.getIgnoreCase("");
        attributes0.addAll(attributes11);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        attributes21.normalize();
        java.lang.String[] strArray23 = attributes21.keys;
        java.lang.String str25 = attributes21.get("");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        boolean boolean28 = attributes26.hasKeyIgnoreCase("hi!");
        java.lang.String str30 = attributes26.get("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes26.keys = strArray35;
        attributes21.keys = strArray35;
        java.lang.String[] strArray38 = attributes21.keys;
        java.lang.String[] strArray39 = attributes21.vals;
        boolean boolean41 = attributes21.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes42 = attributes21.clone();
        boolean boolean44 = attributes21.hasKey(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes47 = attributes21.put(" hi!=\"\"", false);
        attributes0.addAll(attributes47);
        attributes47.remove("  data-=\"\"=\" data-=&quot;&quot;  hi!=&quot;&quot;=&quot; null=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes47);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        java.lang.String str10 = attributes7.getIgnoreCase("");
        attributes7.removeIgnoreCase("data-");
        attributes0.addAll(attributes7);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes7.dataset();
        java.lang.String[] strArray15 = attributes7.vals;
        int int16 = attributes7.size();
        int int18 = attributes7.indexOfKey("");
        attributes7.remove(" data-=\"data-\"");
        boolean boolean22 = attributes7.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.normalize();
        java.lang.String[] strArray25 = attributes23.keys;
        int int27 = attributes23.indexOfKey("");
        boolean boolean29 = attributes23.hasKeyIgnoreCase("");
        boolean boolean31 = attributes23.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        attributes32.normalize();
        java.lang.String[] strArray34 = attributes32.keys;
        java.lang.String[] strArray35 = attributes32.keys;
        java.lang.String str37 = attributes32.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes40 = attributes32.put("", "");
        attributes40.removeIgnoreCase("");
        java.lang.String[] strArray43 = attributes40.keys;
        attributes23.keys = strArray43;
        org.jsoup.nodes.Attributes attributes47 = attributes23.put(" null=\"\"", false);
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator49 = attributes48.spliterator();
        int int50 = attributes48.size();
        int int51 = attributes48.size();
        org.jsoup.nodes.Attributes attributes54 = attributes48.put("", "hi!");
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        boolean boolean57 = attributes55.hasKeyIgnoreCase("hi!");
        java.lang.String str59 = attributes55.get("hi!");
        attributes55.normalize();
        boolean boolean62 = attributes55.hasKey("");
        java.lang.String str63 = attributes55.html();
        org.jsoup.nodes.Attributes attributes64 = new org.jsoup.nodes.Attributes();
        attributes64.normalize();
        java.lang.String[] strArray66 = attributes64.keys;
        int int68 = attributes64.indexOfKey("");
        attributes55.addAll(attributes64);
        boolean boolean70 = attributes48.equals((java.lang.Object) attributes55);
        boolean boolean72 = attributes48.hasKeyIgnoreCase("");
        attributes48.remove("");
        java.lang.String str76 = attributes48.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor77 = attributes48.iterator();
        int int78 = attributes48.size();
        java.lang.String[] strArray79 = attributes48.keys;
        attributes23.vals = strArray79;
        attributes7.keys = strArray79;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { null, null, null, null });
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(attributeSpliterator49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(attributeItor77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { null, null, null, null });
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.vals;
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.normalize();
        java.lang.String[] strArray10 = attributes8.keys;
        java.lang.String[] strArray11 = attributes8.keys;
        java.lang.String str13 = attributes8.getIgnoreCase("");
        java.lang.String[] strArray14 = attributes8.keys;
        attributes0.keys = strArray14;
        attributes0.remove("hi!");
        java.lang.String str18 = attributes0.toString();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        attributes0.html(appendable19, outputSettings20);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        attributes22.normalize();
        java.lang.String[] strArray24 = attributes22.keys;
        java.lang.String[] strArray25 = attributes22.keys;
        java.lang.String[] strArray26 = attributes22.keys;
        attributes0.keys = strArray26;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        java.lang.String[] strArray3 = attributes0.vals;
        int int4 = attributes0.size();
        attributes0.putIgnoreCase(" hi!=\"\"", " data-=\"data-\"");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        java.lang.String str10 = attributes0.getIgnoreCase(" =\"\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        int int13 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        attributes0.remove("hi!");
        attributes0.putIgnoreCase("hi!", "");
        java.lang.String str8 = attributes0.getIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes0.spliterator();
        java.lang.String str10 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.normalize();
        java.lang.String[] strArray14 = attributes12.keys;
        java.lang.String[] strArray15 = attributes12.keys;
        java.lang.String str17 = attributes12.getIgnoreCase("");
        int int18 = attributes12.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes19.spliterator();
        java.lang.String str22 = attributes19.getIgnoreCase("");
        attributes19.removeIgnoreCase("data-");
        attributes12.addAll(attributes19);
        org.jsoup.nodes.Attributes attributes28 = attributes12.put("hi!", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes28.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList30 = attributes28.asList();
        boolean boolean32 = attributes28.hasKeyIgnoreCase(" data-=\"data-\"");
        attributes0.addAll(attributes28);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = attributes0.dataset();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi!=\"\"" + "'", str10, " hi!=\"\"");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributeList29);
        org.junit.Assert.assertNotNull(attributeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        java.lang.String str7 = attributes0.getIgnoreCase(" data-=\"\"");
        int int9 = attributes0.indexOfKey("  null=\"\"=\" hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        boolean boolean12 = attributes10.hasKeyIgnoreCase("hi!");
        java.lang.String str14 = attributes10.get("hi!");
        attributes10.normalize();
        attributes10.putIgnoreCase("", "");
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        attributes19.normalize();
        java.lang.String[] strArray21 = attributes19.keys;
        int int23 = attributes19.indexOfKey("");
        boolean boolean25 = attributes19.hasKeyIgnoreCase("");
        boolean boolean27 = attributes19.hasKeyIgnoreCase("data-");
        attributes10.addAll(attributes19);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        attributes29.normalize();
        java.lang.String[] strArray31 = attributes29.keys;
        java.lang.String str33 = attributes29.get("");
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        boolean boolean36 = attributes34.hasKeyIgnoreCase("hi!");
        java.lang.String str38 = attributes34.get("hi!");
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes34.keys = strArray43;
        attributes29.keys = strArray43;
        attributes19.keys = strArray43;
        attributes0.keys = strArray43;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes3 = attributes0.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes7 = attributes0.put(" null=\"\"", true);
        java.lang.String[] strArray8 = attributes7.vals;
        org.jsoup.nodes.Attributes attributes9 = attributes7.clone();
        java.lang.String[] strArray10 = attributes7.vals;
        int int11 = attributes7.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { null, null, null, null });
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str4 = attributes0.get("hi!");
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        attributes6.normalize();
        java.lang.String[] strArray8 = attributes6.keys;
        java.lang.String[] strArray9 = attributes6.keys;
        attributes0.vals = strArray9;
        org.jsoup.nodes.Attributes attributes11 = attributes0.clone();
        java.lang.String str12 = attributes0.html();
        attributes0.removeIgnoreCase("data-");
        attributes0.normalize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String str4 = attributes0.get("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        attributes5.keys = strArray14;
        attributes0.keys = strArray14;
        java.lang.String[] strArray17 = attributes0.keys;
        java.lang.String[] strArray18 = attributes0.vals;
        boolean boolean20 = attributes0.hasKeyIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes21 = attributes0.clone();
        boolean boolean23 = attributes0.hasKeyIgnoreCase(" =\" =&quot;hi!&quot;\"");
        java.lang.String str25 = attributes0.getIgnoreCase("  null=\"\"=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        int int2 = attributes0.size();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put(" data-=\"data-\"", true);
        int int6 = attributes5.size();
        java.lang.Class<?> wildcardClass7 = attributes5.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        int int4 = attributes0.indexOfKey("");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.toString();
        java.lang.String[] strArray8 = attributes0.keys;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes10 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes11 = attributes10.clone();
        java.lang.String str12 = attributes10.toString();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        attributes10.html(appendable13, outputSettings14);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        int int6 = attributes0.size();
        java.lang.String[] strArray7 = attributes0.vals;
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        attributes9.removeIgnoreCase("");
        attributes9.removeIgnoreCase("data-");
        java.lang.String[] strArray14 = attributes9.vals;
        attributes0.keys = strArray14;
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes0.spliterator();
        boolean boolean18 = attributes0.hasKey(" null=\"\"");
        attributes0.putIgnoreCase("  data-=\" =&quot;&quot;\"=\" null=&quot;&quot;\"", "     hi!=\"\"=\"data-\"=\" data-=&quot;&quot;\"=\"  null=&quot;&quot;=&quot; hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        java.lang.String[] strArray2 = attributes0.keys;
        java.lang.String[] strArray3 = attributes0.keys;
        java.lang.String str5 = attributes0.getIgnoreCase("");
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.hasKeyIgnoreCase("hi!");
        java.lang.String str10 = attributes6.get("hi!");
        attributes6.normalize();
        boolean boolean13 = attributes6.hasKey("");
        int int14 = attributes6.size();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes6.dataset();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        boolean boolean18 = attributes16.hasKeyIgnoreCase("hi!");
        java.lang.String str20 = attributes16.get("hi!");
        attributes16.normalize();
        attributes16.remove("hi!");
        java.lang.String[] strArray24 = attributes16.vals;
        attributes6.vals = strArray24;
        attributes0.vals = strArray24;
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes31 = attributes0.put("", " =\"hi!\"");
        attributes31.putIgnoreCase(" hi!=\" null=&quot;&quot;\"", "");
        org.jsoup.nodes.Attributes attributes37 = attributes31.put(" data-=\"\"  hi!=\"\"=\" null=&quot;&quot;\"", false);
        boolean boolean39 = attributes31.hasKeyIgnoreCase("  hi!=\"\"=\" data-=&quot;data-&quot;\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes31.iterator();
        boolean boolean42 = attributes31.hasKeyIgnoreCase("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.lang.String str3 = attributes0.getIgnoreCase("");
        int int5 = attributes0.indexOfKey("hi!");
        java.lang.String[] strArray6 = attributes0.keys;
        java.lang.String[] strArray7 = attributes0.vals;
        int int9 = attributes0.indexOfKey("");
        java.lang.String str11 = attributes0.getIgnoreCase("   hi!=\"\"=\"data-\"=\" data-=&quot; =&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}

