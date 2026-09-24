package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        java.lang.Object[] objArray5 = elements3.toArray();
        org.jsoup.select.Elements elements7 = elements3.select("hi!");
        org.jsoup.nodes.Element element8 = elements7.first();
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements10 = elements9.unwrap();
        org.jsoup.select.Elements elements11 = elements9.parents();
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements14 = elements13.unwrap();
        java.lang.String str15 = elements13.outerHtml();
        boolean boolean16 = elements11.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean17 = elements7.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements19 = elements7.tagName("");
        org.jsoup.select.Elements elements21 = elements7.toggleClass("");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream22 = elements7.parallelStream();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = elements7.removeAll(elementCollection23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementStream22);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        java.lang.Object[] objArray5 = elements3.toArray();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements7 = elements6.unwrap();
        org.jsoup.select.Elements elements8 = elements6.parents();
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements11 = elements10.unwrap();
        java.lang.String str12 = elements10.outerHtml();
        boolean boolean13 = elements8.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements10);
        org.jsoup.select.Elements elements15 = elements10.append("");
        org.jsoup.select.Elements elements17 = elements10.append("");
        java.lang.Object obj18 = null;
        int int19 = elements17.indexOf(obj18);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream20 = elements17.stream();
        boolean boolean21 = elements3.remove((java.lang.Object) elementStream20);
        org.jsoup.select.Elements elements23 = elements3.addClass("");
        org.jsoup.select.Elements elements24 = elements23.parents();
        org.jsoup.nodes.Element element25 = elements23.last();
        org.jsoup.select.Elements elements27 = elements23.select("hi!");
        org.jsoup.select.Elements elements28 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements29 = elements28.unwrap();
        org.jsoup.select.Elements elements30 = elements28.parents();
        org.jsoup.select.Elements elements31 = elements30.unwrap();
        org.jsoup.select.Elements elements32 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements33 = elements32.unwrap();
        org.jsoup.select.Elements elements34 = elements32.parents();
        org.jsoup.select.Elements elements35 = elements34.unwrap();
        org.jsoup.select.Elements elements36 = elements35.empty();
        java.lang.Object[] objArray37 = elements35.toArray();
        org.jsoup.select.Elements elements39 = elements35.select("hi!");
        boolean boolean40 = elements31.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements39);
        org.jsoup.select.Elements elements41 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements39);
        org.jsoup.select.Elements elements43 = elements39.tagName("");
        org.jsoup.select.Elements elements45 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements46 = elements45.unwrap();
        org.jsoup.select.Elements elements47 = elements45.parents();
        org.jsoup.select.Elements elements48 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements49 = elements48.unwrap();
        org.jsoup.select.Elements elements50 = elements48.parents();
        org.jsoup.select.Elements elements52 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements53 = elements52.unwrap();
        java.lang.String str54 = elements52.outerHtml();
        boolean boolean55 = elements50.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.select.Elements elements57 = elements52.append("");
        org.jsoup.select.Elements elements58 = elements52.parents();
        org.jsoup.select.Elements elements59 = elements52.clone();
        org.jsoup.select.Elements elements61 = elements52.wrap("hi!");
        boolean boolean62 = elements47.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.select.Elements elements63 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements64 = elements63.unwrap();
        java.lang.Object[] objArray65 = elements63.toArray();
        org.jsoup.select.Elements elements66 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements63);
        boolean boolean67 = elements66.hasText();
        boolean boolean68 = elements47.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements66);
        int int69 = elements66.size();
        org.jsoup.select.Elements elements71 = elements66.append("hi!");
        boolean boolean72 = elements43.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements66);
        java.lang.String[][] strArray73 = new java.lang.String[][] {};
        java.lang.String[][] strArray74 = new java.lang.String[][] {};
        java.lang.String[][] strArray75 = new java.lang.String[][] {};
        java.lang.String[][][] strArray76 = new java.lang.String[][][] { strArray73, strArray74, strArray75 };
        java.lang.String[][][] strArray77 = elements43.toArray(strArray76);
        java.io.Serializable[][][] serializableArray78 = elements27.toArray((java.io.Serializable[][][]) strArray77);
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(elementStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertArrayEquals(objArray65, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(serializableArray78);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        java.lang.Object[] objArray5 = elements3.toArray();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements7 = elements6.unwrap();
        org.jsoup.select.Elements elements8 = elements6.parents();
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements11 = elements10.unwrap();
        java.lang.String str12 = elements10.outerHtml();
        boolean boolean13 = elements8.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements10);
        org.jsoup.select.Elements elements15 = elements10.append("");
        org.jsoup.select.Elements elements17 = elements10.append("");
        java.lang.Object obj18 = null;
        int int19 = elements17.indexOf(obj18);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream20 = elements17.stream();
        boolean boolean21 = elements3.remove((java.lang.Object) elementStream20);
        org.jsoup.select.Elements elements23 = elements3.after("hi!");
        org.jsoup.select.Elements elements25 = elements3.after("hi!");
        org.jsoup.select.Elements elements26 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.select.Elements elements27 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements28 = elements27.unwrap();
        java.lang.Object[] objArray29 = elements27.toArray();
        org.jsoup.select.Elements elements30 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements27);
        org.jsoup.select.Elements elements31 = new org.jsoup.select.Elements();
        java.lang.String str32 = elements31.text();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream33 = elements31.parallelStream();
        org.jsoup.select.Elements elements34 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements35 = elements34.unwrap();
        org.jsoup.select.Elements elements37 = elements34.removeClass("hi!");
        org.jsoup.select.Elements elements38 = elements37.remove();
        org.jsoup.select.Elements elements40 = elements38.eq(0);
        org.jsoup.select.Elements elements41 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements38);
        int int42 = elements31.lastIndexOf((java.lang.Object) elements38);
        boolean boolean43 = elements27.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.select.Elements elements44 = elements27.parents();
        org.jsoup.select.Elements elements45 = elements27.remove();
        boolean boolean46 = elements26.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements27);
        java.util.Iterator<org.jsoup.nodes.Element> elementItor47 = elements26.iterator();
        boolean boolean48 = elements26.isEmpty();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(elementStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertArrayEquals(objArray29, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(elementStream33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(elementItor47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.remove();
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements0);
        org.jsoup.select.Elements elements3 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements2);
        org.junit.Assert.assertNotNull(elements1);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        org.jsoup.select.Elements elements5 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements6 = elements5.unwrap();
        boolean boolean7 = elements4.equals((java.lang.Object) elements5);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements4.parallelStream();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream9 = elements4.stream();
        java.lang.Class<?> wildcardClass10 = elements4.getClass();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elementStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        java.lang.String str2 = elements0.outerHtml();
        org.jsoup.select.Elements elements4 = elements0.toggleClass("hi!");
        org.jsoup.nodes.Element element5 = elements0.first();
        org.jsoup.select.Elements elements7 = elements0.before("hi!");
        java.lang.String str8 = elements0.toString();
        org.jsoup.select.Elements elements9 = elements0.empty();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements4 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements5 = elements4.unwrap();
        java.lang.String str6 = elements4.outerHtml();
        boolean boolean7 = elements2.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements4);
        org.jsoup.select.Elements elements9 = elements4.tagName("");
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements11 = elements10.unwrap();
        org.jsoup.select.Elements elements12 = elements10.parents();
        org.jsoup.select.Elements elements14 = elements12.val("");
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements12);
        org.jsoup.select.Elements elements17 = elements12.before("hi!");
        java.lang.String str18 = elements12.toString();
        boolean boolean19 = elements9.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        org.jsoup.select.Elements elements20 = elements12.empty();
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements12.replaceAll(elementUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements3 = elements0.removeClass("hi!");
        org.jsoup.select.Elements elements4 = elements3.remove();
        boolean boolean6 = elements3.hasAttr("hi!");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream7 = elements3.parallelStream();
        org.jsoup.select.Elements elements8 = elements3.empty();
        java.lang.String str9 = elements3.html();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elementStream7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements4 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements5 = elements4.unwrap();
        java.lang.String str6 = elements4.outerHtml();
        boolean boolean7 = elements2.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements4);
        org.jsoup.select.Elements elements9 = elements4.append("");
        org.jsoup.select.Elements elements11 = elements9.removeAttr("");
        org.jsoup.select.Elements elements12 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements13 = elements12.unwrap();
        java.lang.Object[] objArray14 = elements12.toArray();
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements12.listIterator();
        boolean boolean17 = elements11.contains((java.lang.Object) elements12);
        org.jsoup.select.Elements elements18 = elements11.clone();
        java.lang.String[][] strArray19 = new java.lang.String[][] {};
        java.lang.String[][] strArray20 = elements11.toArray(strArray19);
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements22 = elements21.unwrap();
        org.jsoup.select.Elements elements23 = elements21.parents();
        org.jsoup.select.Elements elements24 = elements23.unwrap();
        org.jsoup.select.Elements elements25 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        java.lang.String str26 = elements23.html();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream27 = elements23.stream();
        org.jsoup.select.Elements elements29 = elements23.wrap("hi!");
        boolean boolean30 = elements11.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.select.Elements elements32 = elements23.append("");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elementItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elementStream27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        java.lang.String str2 = elements0.outerHtml();
        org.jsoup.select.Elements elements3 = elements0.parents();
        org.jsoup.select.Elements elements5 = elements0.html("");
        org.jsoup.select.Elements elements7 = elements5.before("hi!");
        org.jsoup.nodes.Element element8 = elements7.first();
        java.lang.Object[] objArray9 = elements7.toArray();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements3 = elements1.removeClass("");
        org.jsoup.select.Elements elements4 = elements3.unwrap();
        org.jsoup.select.Elements elements5 = elements3.empty();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements7 = elements6.unwrap();
        java.lang.Object[] objArray8 = elements6.toArray();
        java.lang.String str9 = elements6.toString();
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements6);
        int int11 = elements6.size();
        org.jsoup.select.Elements elements12 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements13 = elements12.unwrap();
        org.jsoup.select.Elements elements14 = elements12.parents();
        org.jsoup.select.Elements elements16 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements17 = elements16.unwrap();
        java.lang.String str18 = elements16.outerHtml();
        boolean boolean19 = elements14.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements16);
        org.jsoup.select.Elements elements21 = elements16.append("");
        org.jsoup.select.Elements elements22 = elements16.parents();
        org.jsoup.select.Elements elements23 = elements16.clone();
        org.jsoup.select.Elements elements25 = elements23.val("");
        java.lang.String str26 = elements23.toString();
        org.jsoup.select.Elements elements27 = elements23.empty();
        org.jsoup.select.Elements elements29 = elements23.after("hi!");
        org.jsoup.select.Elements elements30 = elements23.parents();
        boolean boolean31 = elements6.contains((java.lang.Object) elements23);
        org.jsoup.select.Elements elements33 = elements6.select("hi!");
        org.jsoup.select.Elements elements35 = elements33.tagName("");
        org.jsoup.select.Elements elements37 = elements33.removeAttr("");
        boolean boolean38 = elements3.contains((java.lang.Object) "");
        boolean boolean40 = elements3.hasClass("hi!");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        org.jsoup.select.Elements elements5 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements6 = elements5.unwrap();
        org.jsoup.nodes.Element element7 = elements5.first();
        boolean boolean8 = elements4.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = elements5.add(element9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = elements5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements3 = elements0.removeClass("hi!");
        boolean boolean4 = elements3.hasText();
        elements3.clear();
        java.lang.String str6 = elements3.toString();
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements8 = elements7.unwrap();
        boolean boolean9 = elements8.hasText();
        org.jsoup.select.Elements elements12 = elements8.attr("hi!", "hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("hi!");
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements16 = elements15.unwrap();
        java.lang.String str17 = elements15.outerHtml();
        org.jsoup.select.Elements elements18 = elements15.parents();
        org.jsoup.select.Elements elements19 = elements15.remove();
        boolean boolean21 = elements19.remove((java.lang.Object) 100L);
        java.lang.String str22 = elements19.html();
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements24 = elements23.unwrap();
        org.jsoup.select.Elements elements25 = elements23.parents();
        org.jsoup.select.Elements elements26 = elements25.unwrap();
        org.jsoup.select.Elements elements27 = elements26.empty();
        java.lang.Object[] objArray28 = elements26.toArray();
        org.jsoup.select.Elements elements30 = elements26.select("hi!");
        org.jsoup.select.Elements elements32 = elements30.removeClass("hi!");
        org.jsoup.select.Elements elements34 = elements32.removeAttr("hi!");
        org.jsoup.select.Elements elements36 = elements32.toggleClass("");
        org.jsoup.select.Elements elements39 = elements36.attr("", "");
        boolean boolean40 = elements19.contains((java.lang.Object) elements39);
        boolean boolean41 = elements12.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Element[] elementArray42 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList43 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList43, elementArray42);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream45 = elementList43.stream();
        org.jsoup.nodes.Element[] elementArray46 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList47 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList47, elementArray46);
        org.jsoup.select.Elements elements49 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elementList47);
        org.jsoup.nodes.Element[] elementArray50 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList51 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList51, elementArray50);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream53 = elementList51.stream();
        org.jsoup.nodes.Element[] elementArray54 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList55 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList55, elementArray54);
        org.jsoup.select.Elements elements57 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elementList55);
        org.jsoup.nodes.Element[] elementArray58 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList59, elementArray58);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream61 = elementList59.stream();
        org.jsoup.nodes.Element[] elementArray62 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList63 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList63, elementArray62);
        org.jsoup.select.Elements elements65 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elementList63);
        java.util.RandomAccess[] randomAccessArray66 = new java.util.RandomAccess[] { elementList43, elementList47, elementList51, elementList55, elementList59, elementList63 };
        java.util.RandomAccess[][] randomAccessArray67 = new java.util.RandomAccess[][] { randomAccessArray66 };
        org.jsoup.nodes.Element[] elementArray68 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList69 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList69, elementArray68);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream71 = elementList69.stream();
        org.jsoup.nodes.Element[] elementArray72 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList73 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList73, elementArray72);
        org.jsoup.select.Elements elements75 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elementList73);
        org.jsoup.nodes.Element[] elementArray76 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList77 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList77, elementArray76);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream79 = elementList77.stream();
        org.jsoup.nodes.Element[] elementArray80 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList81 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList81, elementArray80);
        org.jsoup.select.Elements elements83 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elementList81);
        org.jsoup.nodes.Element[] elementArray84 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList85 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList85, elementArray84);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream87 = elementList85.stream();
        org.jsoup.nodes.Element[] elementArray88 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList89 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList89, elementArray88);
        org.jsoup.select.Elements elements91 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elementList89);
        java.util.RandomAccess[] randomAccessArray92 = new java.util.RandomAccess[] { elementList69, elementList73, elementList77, elementList81, elementList85, elementList89 };
        java.util.RandomAccess[][] randomAccessArray93 = new java.util.RandomAccess[][] { randomAccessArray92 };
        java.util.RandomAccess[][][] randomAccessArray94 = new java.util.RandomAccess[][][] { randomAccessArray67, randomAccessArray93 };
        java.util.RandomAccess[][][] randomAccessArray95 = elements19.toArray(randomAccessArray94);
        int int96 = elements3.indexOf((java.lang.Object) elements19);
        elements3.clear();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elementArray42);
        org.junit.Assert.assertArrayEquals(elementArray42, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elementStream45);
        org.junit.Assert.assertNotNull(elementArray46);
        org.junit.Assert.assertArrayEquals(elementArray46, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elementArray50);
        org.junit.Assert.assertArrayEquals(elementArray50, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(elementStream53);
        org.junit.Assert.assertNotNull(elementArray54);
        org.junit.Assert.assertArrayEquals(elementArray54, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(elementArray58);
        org.junit.Assert.assertArrayEquals(elementArray58, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(elementStream61);
        org.junit.Assert.assertNotNull(elementArray62);
        org.junit.Assert.assertArrayEquals(elementArray62, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(randomAccessArray66);
        org.junit.Assert.assertNotNull(randomAccessArray67);
        org.junit.Assert.assertNotNull(elementArray68);
        org.junit.Assert.assertArrayEquals(elementArray68, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(elementStream71);
        org.junit.Assert.assertNotNull(elementArray72);
        org.junit.Assert.assertArrayEquals(elementArray72, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(elementArray76);
        org.junit.Assert.assertArrayEquals(elementArray76, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(elementStream79);
        org.junit.Assert.assertNotNull(elementArray80);
        org.junit.Assert.assertArrayEquals(elementArray80, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(elementArray84);
        org.junit.Assert.assertArrayEquals(elementArray84, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(elementStream87);
        org.junit.Assert.assertNotNull(elementArray88);
        org.junit.Assert.assertArrayEquals(elementArray88, new org.jsoup.nodes.Element[] {});
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(randomAccessArray92);
        org.junit.Assert.assertNotNull(randomAccessArray93);
        org.junit.Assert.assertNotNull(randomAccessArray94);
        org.junit.Assert.assertNotNull(randomAccessArray95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements4 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements5 = elements4.unwrap();
        java.lang.String str6 = elements4.outerHtml();
        boolean boolean7 = elements2.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements4);
        org.jsoup.select.Elements elements9 = elements4.tagName("");
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements11 = elements10.unwrap();
        org.jsoup.select.Elements elements12 = elements10.parents();
        org.jsoup.select.Elements elements14 = elements12.val("");
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements12);
        org.jsoup.select.Elements elements17 = elements12.before("hi!");
        java.lang.String str18 = elements12.toString();
        boolean boolean19 = elements9.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        org.jsoup.nodes.Element element21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = elements9.set((int) '4', element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements4 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements5 = elements4.unwrap();
        java.lang.String str6 = elements4.outerHtml();
        boolean boolean7 = elements2.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements4);
        org.jsoup.select.Elements elements9 = elements4.tagName("");
        java.util.List<org.jsoup.nodes.Element> elementList12 = elements4.subList(0, (int) (short) 0);
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements(elementList12);
        org.jsoup.select.Elements elements14 = elements13.remove();
        org.jsoup.select.Elements elements16 = elements14.prepend("");
        org.jsoup.select.Elements elements18 = elements16.tagName("");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementList12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements4 = elements3.unwrap();
        org.jsoup.select.Elements elements5 = elements3.parents();
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements8 = elements7.unwrap();
        java.lang.String str9 = elements7.outerHtml();
        boolean boolean10 = elements5.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements7);
        org.jsoup.select.Elements elements12 = elements7.append("");
        org.jsoup.select.Elements elements13 = elements7.parents();
        org.jsoup.select.Elements elements14 = elements7.clone();
        org.jsoup.select.Elements elements16 = elements7.wrap("hi!");
        boolean boolean17 = elements2.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements7);
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements19 = elements18.unwrap();
        java.lang.Object[] objArray20 = elements18.toArray();
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        boolean boolean22 = elements21.hasText();
        boolean boolean23 = elements2.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        int int24 = elements21.size();
        org.jsoup.select.Elements elements26 = elements21.append("hi!");
        org.jsoup.select.Elements elements28 = elements26.before("hi!");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements26.replaceAll(elementUnaryOperator29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        java.lang.Object[] objArray5 = elements3.toArray();
        org.jsoup.select.Elements elements7 = elements3.select("hi!");
        org.jsoup.select.Elements elements9 = elements7.removeClass("hi!");
        org.jsoup.select.Elements elements11 = elements9.removeAttr("hi!");
        org.jsoup.nodes.Element element12 = elements11.first();
        org.jsoup.select.Elements elements14 = elements11.val("");
        org.jsoup.select.Elements elements16 = elements11.html("");
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements18 = elements17.unwrap();
        org.jsoup.select.Elements elements19 = elements17.parents();
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements22 = elements21.unwrap();
        java.lang.String str23 = elements21.outerHtml();
        boolean boolean24 = elements19.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.select.Elements elements26 = elements21.append("");
        java.lang.Object[] objArray27 = elements21.toArray();
        org.jsoup.select.Elements elements28 = elements21.remove();
        org.jsoup.select.Elements elements30 = elements28.append("hi!");
        boolean boolean31 = elements16.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements32 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements16);
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements4 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements5 = elements4.unwrap();
        java.lang.String str6 = elements4.outerHtml();
        boolean boolean7 = elements2.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements4);
        org.jsoup.select.Elements elements9 = elements4.append("");
        org.jsoup.select.Elements elements10 = elements4.parents();
        org.jsoup.select.Elements elements11 = elements4.clone();
        org.jsoup.select.Elements elements13 = elements11.val("");
        java.lang.String str14 = elements11.toString();
        org.jsoup.select.Elements elements15 = elements11.empty();
        org.jsoup.select.Elements elements17 = elements11.after("hi!");
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements21 = elements20.unwrap();
        org.jsoup.select.Elements elements23 = elements20.removeClass("hi!");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor24 = elements23.iterator();
        org.jsoup.select.Elements elements26 = elements23.tagName("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = elements11.addAll(3, (java.util.Collection<org.jsoup.nodes.Element>) elements26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementItor24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements4 = elements3.unwrap();
        org.jsoup.select.Elements elements5 = elements3.parents();
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements8 = elements7.unwrap();
        java.lang.String str9 = elements7.outerHtml();
        boolean boolean10 = elements5.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements7);
        org.jsoup.select.Elements elements12 = elements7.append("");
        org.jsoup.select.Elements elements13 = elements7.parents();
        org.jsoup.select.Elements elements14 = elements7.clone();
        org.jsoup.select.Elements elements16 = elements7.wrap("hi!");
        int int17 = elements2.lastIndexOf((java.lang.Object) elements16);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream18 = elements16.stream();
        org.jsoup.select.Elements elements20 = elements16.addClass("");
        boolean boolean22 = elements16.hasAttr("");
        java.lang.String str23 = elements16.toString();
        org.jsoup.select.Elements elements25 = elements16.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = elements16.is("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(elementStream18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        java.lang.Object[] objArray5 = elements3.toArray();
        org.jsoup.select.Elements elements7 = elements3.select("hi!");
        org.jsoup.select.Elements elements9 = elements3.not("hi!");
        org.jsoup.select.Elements elements11 = elements9.tagName("");
        org.jsoup.select.Elements elements13 = elements9.append("");
        org.jsoup.select.Elements elements16 = elements13.attr("", "hi!");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements4 = elements0.append("");
        org.jsoup.select.Elements elements7 = elements4.attr("", "hi!");
        org.jsoup.select.Elements elements9 = elements4.append("hi!");
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements11 = elements10.unwrap();
        org.jsoup.select.Elements elements12 = elements10.parents();
        org.jsoup.select.Elements elements13 = elements12.unwrap();
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements15 = elements14.unwrap();
        org.jsoup.select.Elements elements16 = elements14.parents();
        org.jsoup.select.Elements elements17 = elements16.unwrap();
        org.jsoup.select.Elements elements18 = elements17.empty();
        java.lang.Object[] objArray19 = elements17.toArray();
        org.jsoup.select.Elements elements21 = elements17.select("hi!");
        boolean boolean22 = elements13.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.select.Elements elements24 = elements21.toggleClass("hi!");
        org.jsoup.select.Elements elements25 = elements21.clone();
        org.jsoup.select.Elements elements27 = elements25.eq((int) (short) 10);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream28 = elements25.parallelStream();
        org.jsoup.select.Elements elements29 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements30 = elements29.unwrap();
        org.jsoup.select.Elements elements31 = elements29.parents();
        org.jsoup.select.Elements elements32 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements33 = elements32.unwrap();
        org.jsoup.select.Elements elements34 = elements32.parents();
        org.jsoup.select.Elements elements36 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements37 = elements36.unwrap();
        java.lang.String str38 = elements36.outerHtml();
        boolean boolean39 = elements34.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.jsoup.select.Elements elements41 = elements36.append("");
        org.jsoup.select.Elements elements42 = elements36.parents();
        org.jsoup.select.Elements elements43 = elements36.clone();
        org.jsoup.select.Elements elements45 = elements36.wrap("hi!");
        boolean boolean46 = elements31.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.jsoup.select.Elements elements47 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements48 = elements47.unwrap();
        org.jsoup.select.Elements elements49 = elements47.parents();
        org.jsoup.select.Elements elements50 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements51 = elements50.unwrap();
        org.jsoup.select.Elements elements52 = elements50.parents();
        org.jsoup.select.Elements elements54 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements55 = elements54.unwrap();
        java.lang.String str56 = elements54.outerHtml();
        boolean boolean57 = elements52.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements54);
        org.jsoup.select.Elements elements59 = elements54.append("");
        org.jsoup.select.Elements elements60 = elements54.parents();
        org.jsoup.select.Elements elements61 = elements54.clone();
        org.jsoup.select.Elements elements63 = elements54.wrap("hi!");
        boolean boolean64 = elements49.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements54);
        org.jsoup.select.Elements elements65 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements66 = elements65.unwrap();
        java.lang.Object[] objArray67 = elements65.toArray();
        org.jsoup.select.Elements elements68 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements65);
        boolean boolean69 = elements68.hasText();
        boolean boolean70 = elements49.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements68);
        org.jsoup.select.Elements elements72 = elements68.select("hi!");
        boolean boolean73 = elements31.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements68);
        org.jsoup.select.Elements elements75 = elements31.addClass("hi!");
        boolean boolean76 = elements25.contains((java.lang.Object) "hi!");
        boolean boolean77 = elements9.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.select.Elements elements79 = elements25.select("hi!");
        org.jsoup.select.Elements elements81 = elements79.before("");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elementStream28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(elements72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertNotNull(elements81);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream5 = elements4.parallelStream();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements4.listIterator();
        org.jsoup.select.Elements elements8 = elements4.append("");
        boolean boolean10 = elements4.hasAttr("");
        org.jsoup.nodes.Element element11 = elements4.last();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = elements4.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementStream5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements4 = elements3.unwrap();
        org.jsoup.select.Elements elements5 = elements3.parents();
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements8 = elements7.unwrap();
        java.lang.String str9 = elements7.outerHtml();
        boolean boolean10 = elements5.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements7);
        org.jsoup.select.Elements elements12 = elements7.append("");
        org.jsoup.select.Elements elements13 = elements7.parents();
        org.jsoup.select.Elements elements14 = elements7.clone();
        org.jsoup.select.Elements elements16 = elements7.wrap("hi!");
        boolean boolean17 = elements2.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements7);
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements19 = elements18.unwrap();
        org.jsoup.select.Elements elements20 = elements18.parents();
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements22 = elements21.unwrap();
        org.jsoup.select.Elements elements23 = elements21.parents();
        org.jsoup.select.Elements elements25 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements26 = elements25.unwrap();
        java.lang.String str27 = elements25.outerHtml();
        boolean boolean28 = elements23.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.select.Elements elements30 = elements25.append("");
        org.jsoup.select.Elements elements31 = elements25.parents();
        org.jsoup.select.Elements elements32 = elements25.clone();
        org.jsoup.select.Elements elements34 = elements25.wrap("hi!");
        boolean boolean35 = elements20.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.select.Elements elements36 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements37 = elements36.unwrap();
        java.lang.Object[] objArray38 = elements36.toArray();
        org.jsoup.select.Elements elements39 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements36);
        boolean boolean40 = elements39.hasText();
        boolean boolean41 = elements20.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements39);
        org.jsoup.select.Elements elements43 = elements39.select("hi!");
        boolean boolean44 = elements2.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements39);
        org.jsoup.select.Elements elements46 = elements2.addClass("hi!");
        org.jsoup.select.Elements elements48 = elements2.select("hi!");
        org.jsoup.select.Elements elements50 = elements2.html("hi!");
        java.lang.String str52 = elements50.attr("");
        org.jsoup.nodes.Element element54 = null;
        elements50.add(0, element54);
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertArrayEquals(objArray38, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements4 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements5 = elements4.unwrap();
        java.lang.String str6 = elements4.outerHtml();
        boolean boolean7 = elements2.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements4);
        org.jsoup.select.Elements elements9 = elements4.tagName("");
        org.jsoup.select.Elements elements11 = elements4.tagName("");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elements11.spliterator();
        org.jsoup.select.Elements elements14 = elements11.not("hi!");
        java.lang.String str15 = elements11.val();
        org.jsoup.select.Elements elements17 = elements11.prepend("hi!");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor18 = elements11.iterator();
        org.jsoup.select.Elements elements19 = elements11.clone();
        org.jsoup.select.Elements elements21 = elements11.html("hi!");
        org.jsoup.select.Elements elements23 = elements11.toggleClass("hi!");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elementItor18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.remove();
        org.jsoup.select.Elements elements3 = elements1.after("");
        org.jsoup.select.Elements elements5 = elements1.before("");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        java.lang.String str2 = elements0.outerHtml();
        org.jsoup.select.Elements elements4 = elements0.toggleClass("hi!");
        org.jsoup.select.Elements elements5 = elements4.clone();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        java.lang.String str7 = elements5.outerHtml();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.parallelStream();
        java.lang.String str9 = elements5.toString();
        org.jsoup.select.Elements elements10 = elements5.empty();
        org.jsoup.select.Elements elements12 = elements5.tagName("hi!");
        org.jsoup.select.Elements elements14 = elements5.prepend("hi!");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements4 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements5 = elements4.unwrap();
        java.lang.String str6 = elements4.outerHtml();
        boolean boolean7 = elements2.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements4);
        org.jsoup.select.Elements elements9 = elements2.prepend("");
        org.jsoup.select.Elements elements11 = elements9.prepend("hi!");
        org.jsoup.nodes.Element element12 = elements11.first();
        org.jsoup.select.Elements elements14 = elements11.wrap("hi!");
        org.jsoup.select.Elements elements16 = elements14.eq((int) '#');
        org.jsoup.select.Elements elements18 = elements14.addClass("");
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements20 = elements19.unwrap();
        org.jsoup.select.Elements elements21 = elements19.parents();
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements24 = elements23.unwrap();
        java.lang.String str25 = elements23.outerHtml();
        boolean boolean26 = elements21.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.select.Elements elements27 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements28 = elements27.unwrap();
        org.jsoup.select.Elements elements29 = elements27.parents();
        org.jsoup.select.Elements elements31 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements32 = elements31.unwrap();
        java.lang.String str33 = elements31.outerHtml();
        boolean boolean34 = elements29.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.select.Elements elements36 = elements31.append("");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements31.listIterator();
        boolean boolean38 = elements23.contains((java.lang.Object) elements31);
        java.lang.String str39 = elements23.val();
        org.jsoup.select.Elements elements41 = elements23.not("hi!");
        java.lang.String str42 = elements23.toString();
        org.jsoup.select.Elements elements44 = elements23.prepend("");
        org.jsoup.select.Elements elements46 = elements44.addClass("");
        boolean boolean47 = elements14.contains((java.lang.Object) elements46);
        boolean boolean49 = elements14.hasAttr("hi!");
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elementItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        java.lang.String str2 = elements0.outerHtml();
        org.jsoup.select.Elements elements3 = elements0.parents();
        boolean boolean5 = elements3.equals((java.lang.Object) (short) 1);
        java.lang.String str6 = elements3.html();
        java.lang.String str7 = elements3.val();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements3 = elements0.removeClass("hi!");
        org.jsoup.select.Elements elements4 = elements3.remove();
        org.jsoup.select.Elements elements6 = elements4.eq(0);
        org.jsoup.select.Elements elements7 = elements6.clone();
        org.jsoup.select.Elements elements9 = elements6.prepend("");
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements11 = elements10.unwrap();
        org.jsoup.select.Elements elements12 = elements10.parents();
        org.jsoup.select.Elements elements13 = elements12.unwrap();
        org.jsoup.select.Elements elements14 = elements13.empty();
        java.lang.Object[] objArray15 = elements13.toArray();
        org.jsoup.select.Elements elements17 = elements13.select("hi!");
        org.jsoup.select.Elements elements19 = elements17.removeClass("hi!");
        org.jsoup.select.Elements elements21 = elements19.removeAttr("hi!");
        org.jsoup.select.Elements elements23 = elements19.toggleClass("");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator24 = elements19.spliterator();
        boolean boolean25 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.select.Elements elements26 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements27 = elements26.unwrap();
        org.jsoup.select.Elements elements28 = elements26.parents();
        org.jsoup.select.Elements elements30 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements31 = elements30.unwrap();
        java.lang.String str32 = elements30.outerHtml();
        boolean boolean33 = elements28.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.tagName("");
        org.jsoup.select.Elements elements37 = elements30.select("hi!");
        boolean boolean39 = elements37.hasAttr("hi!");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream40 = elements37.stream();
        int int41 = elements19.indexOf((java.lang.Object) elementStream40);
        org.jsoup.select.Elements elements43 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements44 = elements43.unwrap();
        org.jsoup.select.Elements elements45 = elements43.parents();
        org.jsoup.select.Elements elements47 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements48 = elements47.unwrap();
        java.lang.String str49 = elements47.outerHtml();
        boolean boolean50 = elements45.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements47);
        org.jsoup.select.Elements elements52 = elements45.append("hi!");
        org.jsoup.select.Elements elements54 = elements52.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = elements19.addAll((int) (short) 10, (java.util.Collection<org.jsoup.nodes.Element>) elements52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elementStream40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        java.lang.String str2 = elements0.outerHtml();
        org.jsoup.select.Elements elements4 = elements0.toggleClass("hi!");
        org.jsoup.nodes.Element element5 = elements0.first();
        org.jsoup.select.Elements elements7 = elements0.before("hi!");
        org.jsoup.select.Elements elements8 = elements0.unwrap();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor9 = elements0.iterator();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor9);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        java.lang.Object[] objArray5 = elements3.toArray();
        org.jsoup.select.Elements elements7 = elements3.select("hi!");
        org.jsoup.select.Elements elements9 = elements3.not("hi!");
        elements3.clear();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream11 = elements3.parallelStream();
        org.jsoup.select.Elements elements12 = elements3.remove();
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements14 = elements13.unwrap();
        org.jsoup.select.Elements elements15 = elements13.parents();
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements18 = elements17.unwrap();
        java.lang.String str19 = elements17.outerHtml();
        boolean boolean20 = elements15.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements17);
        org.jsoup.select.Elements elements22 = elements17.tagName("");
        org.jsoup.select.Elements elements24 = elements17.tagName("");
        org.jsoup.select.Elements elements25 = elements24.remove();
        boolean boolean26 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements24);
        int int27 = elements12.size();
        org.jsoup.select.Elements elements28 = elements12.parents();
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementStream11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements1 = elements0.unwrap();
        org.jsoup.select.Elements elements2 = elements0.parents();
        org.jsoup.select.Elements elements3 = elements2.unwrap();
        org.jsoup.select.Elements elements4 = elements3.empty();
        java.lang.Object[] objArray5 = elements3.toArray();
        org.jsoup.select.Elements elements7 = elements3.select("hi!");
        org.jsoup.select.Elements elements9 = elements3.not("hi!");
        elements3.clear();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream11 = elements3.parallelStream();
        org.jsoup.select.Elements elements13 = elements3.removeClass("");
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements();
        org.jsoup.select.Elements elements15 = elements14.unwrap();
        org.jsoup.select.Elements elements16 = elements14.parents();
        org.jsoup.select.Elements elements17 = elements16.unwrap();
        org.jsoup.select.Elements elements18 = elements17.empty();
        java.lang.Object[] objArray19 = elements17.toArray();
        org.jsoup.select.Elements elements21 = elements17.select("hi!");
        org.jsoup.select.Elements elements23 = elements17.not("hi!");
        elements17.clear();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream25 = elements17.parallelStream();
        boolean boolean26 = elements13.remove((java.lang.Object) elements17);
        org.jsoup.select.Elements elements28 = elements13.eq((int) '#');
        org.jsoup.nodes.Element element30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = elements28.set((int) '#', element30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementStream11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
    }
}

