package org.mockito;

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
        org.hamcrest.Matcher<java.lang.Short> shortMatcher0 = null;
        short short1 = org.mockito.Matchers.shortThat(shortMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        long long0 = org.mockito.Matchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int1 = org.mockito.Matchers.eq((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        byte byte0 = org.mockito.Matchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.hamcrest.Matcher<java.lang.Character> charMatcher0 = null;
        char char1 = org.mockito.Matchers.charThat(charMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        char char1 = org.mockito.Matchers.eq(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        short short0 = org.mockito.Matchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.hamcrest.Matcher<java.lang.Boolean> booleanMatcher0 = null;
        boolean boolean1 = org.mockito.Matchers.booleanThat(booleanMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = org.mockito.Matchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.eq((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str1 = org.mockito.Matchers.matches("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object obj0 = org.mockito.Matchers.isNotNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        float float1 = org.mockito.Matchers.eq((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        byte byte1 = org.mockito.Matchers.eq((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        boolean boolean0 = org.mockito.Matchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.reflect.Type type0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.hamcrest.Matcher<java.lang.Long> longMatcher0 = null;
        long long1 = org.mockito.Matchers.longThat(longMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        float float1 = org.mockito.Matchers.eq((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.hamcrest.Matcher<java.lang.Byte> byteMatcher0 = null;
        byte byte1 = org.mockito.Matchers.byteThat(byteMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Collection collection0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str1 = org.mockito.Matchers.contains("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        float float1 = org.mockito.Matchers.eq((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        short short1 = org.mockito.Matchers.eq((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        byte byte1 = org.mockito.Matchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str1 = org.mockito.Matchers.startsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        char char1 = org.mockito.Matchers.eq('#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.mockito.Matchers matchers0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(matchers0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.hamcrest.Matcher<java.lang.Integer> intMatcher0 = null;
        int int1 = org.mockito.Matchers.intThat(intMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        double double1 = org.mockito.Matchers.eq((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj0 = org.mockito.Matchers.notNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str1 = org.mockito.Matchers.matches("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = list1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        short short1 = org.mockito.Matchers.eq((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.List list2 = org.mockito.Matchers.refEq(list0, strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = list2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        short short1 = org.mockito.Matchers.eq((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str1 = org.mockito.Matchers.contains("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        long long1 = org.mockito.Matchers.eq((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Set set0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(set0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        boolean boolean1 = org.mockito.Matchers.eq(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        double double1 = org.mockito.Matchers.eq((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        float float0 = org.mockito.Matchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.hamcrest.Matcher<java.lang.Float> floatMatcher0 = null;
        float float1 = org.mockito.Matchers.floatThat(floatMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        char char0 = org.mockito.Matchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str1 = org.mockito.Matchers.endsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        double double0 = org.mockito.Matchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str0 = org.mockito.Matchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.hamcrest.Matcher<java.lang.Double> doubleMatcher0 = null;
        double double1 = org.mockito.Matchers.doubleThat(doubleMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        byte byte1 = org.mockito.Matchers.eq((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int int1 = org.mockito.Matchers.eq(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str1 = org.mockito.Matchers.startsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object obj0 = org.mockito.Matchers.isNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.mockito.Matchers.eq((java.lang.reflect.AnnotatedElement) genericDeclaration2);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNull(annotatedElement3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        double double1 = org.mockito.Matchers.eq((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj1 = org.mockito.Matchers.eq((java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        long long1 = org.mockito.Matchers.eq((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        double double1 = org.mockito.Matchers.eq((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        float float1 = org.mockito.Matchers.eq(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.Serializable serializable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        double double1 = org.mockito.Matchers.eq(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        long long1 = org.mockito.Matchers.eq((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        char char1 = org.mockito.Matchers.eq('4');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.List list2 = org.mockito.Matchers.refEq(list0, strArray1);
        java.lang.Iterable iterable3 = org.mockito.Matchers.same((java.lang.Iterable) list2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(iterable3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        long long1 = org.mockito.Matchers.eq(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        byte byte1 = org.mockito.Matchers.eq((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        long long1 = org.mockito.Matchers.eq((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        short short1 = org.mockito.Matchers.eq((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        float float1 = org.mockito.Matchers.eq((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.reflect.Type type0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int int1 = org.mockito.Matchers.eq(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Iterable iterable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(iterable0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str1 = org.mockito.Matchers.endsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        long long1 = org.mockito.Matchers.eq(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int1 = org.mockito.Matchers.eq((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        short short1 = org.mockito.Matchers.eq((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        long long1 = org.mockito.Matchers.eq((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.Class<?> wildcardClass2 = org.mockito.Matchers.same(wildcardClass1);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        short short1 = org.mockito.Matchers.eq((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = iterable1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int int1 = org.mockito.Matchers.eq((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        short short1 = org.mockito.Matchers.eq((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.mockito.Matchers matchers0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(matchers0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        float float1 = org.mockito.Matchers.eq((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj6 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        long long1 = org.mockito.Matchers.eq(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int1 = org.mockito.Matchers.eq((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        boolean boolean1 = org.mockito.Matchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        float float1 = org.mockito.Matchers.eq((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.List list0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(list0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.eq((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        double double1 = org.mockito.Matchers.eq((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String[] strArray0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        double double1 = org.mockito.Matchers.eq((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        char char1 = org.mockito.Matchers.eq('a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.List list0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(list0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int int1 = org.mockito.Matchers.eq((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int int1 = org.mockito.Matchers.eq((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        long long1 = org.mockito.Matchers.eq((long) '\000');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        double double1 = org.mockito.Matchers.eq((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        float float1 = org.mockito.Matchers.eq((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map1 = org.mockito.Matchers.eq(map0);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNull(map1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        short short1 = org.mockito.Matchers.eq((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        double double1 = org.mockito.Matchers.eq(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        long long1 = org.mockito.Matchers.eq((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        long long1 = org.mockito.Matchers.eq((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        float float1 = org.mockito.Matchers.eq((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.List list0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(list0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        float float1 = org.mockito.Matchers.eq(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.Serializable serializable1 = org.mockito.Matchers.same((java.io.Serializable) (-1.0d));
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str1 = org.mockito.Matchers.same("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        double double1 = org.mockito.Matchers.eq((double) '\000');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double double1 = org.mockito.Matchers.eq((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray4);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass7 = map6.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass7, strArray10);
        java.lang.reflect.AnnotatedElement annotatedElement12 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray10);
        java.lang.Class<?> wildcardClass13 = strArray10.getClass();
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNull(annotatedElement12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        short short1 = org.mockito.Matchers.eq((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.Class<?> wildcardClass1 = collection0.getClass();
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int int1 = org.mockito.Matchers.eq((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        char char1 = org.mockito.Matchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.reflect.Type type0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        float float1 = org.mockito.Matchers.eq((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        float float1 = org.mockito.Matchers.eq((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.List list2 = org.mockito.Matchers.refEq(list0, strArray1);
        java.lang.Iterable iterable3 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.lang.Class<?> wildcardClass4 = list0.getClass();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(iterable3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int1 = org.mockito.Matchers.eq((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        double double1 = org.mockito.Matchers.eq((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        float float1 = org.mockito.Matchers.eq((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        float float1 = org.mockito.Matchers.eq((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        long long1 = org.mockito.Matchers.eq(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        double double1 = org.mockito.Matchers.eq(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        float float1 = org.mockito.Matchers.eq((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        float float1 = org.mockito.Matchers.eq((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Set set0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(set0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.Serializable serializable0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj7 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        double double1 = org.mockito.Matchers.eq((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int int1 = org.mockito.Matchers.eq((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.Serializable serializable0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.List list2 = org.mockito.Matchers.refEq(list0, strArray1);
        java.util.List list3 = org.mockito.Matchers.same(list2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        org.junit.Assert.assertNull(matchers1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Collection collection0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj10 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray9);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.reflect.Type type12 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        double double1 = org.mockito.Matchers.eq((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.util.List list2 = org.mockito.Matchers.same(list1);
        java.lang.Class<?> wildcardClass3 = list1.getClass();
        java.lang.Object obj4 = org.mockito.Matchers.eq((java.lang.Object) wildcardClass3);
        java.io.Serializable serializable5 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass3);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        org.mockito.Matchers matchers7 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass8 = matchers7.getClass();
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration14 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass10, strArray13);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass16 = map15.getClass();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration20 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass16, strArray19);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass10, strArray19);
        java.lang.reflect.AnnotatedElement annotatedElement22 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass8, strArray19);
        java.util.Map map23 = org.mockito.Matchers.refEq(map6, strArray19);
        java.lang.reflect.Type type24 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass3, strArray19);
        java.lang.String str25 = org.mockito.Matchers.refEq("", strArray19);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(serializable5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(annotatedElement22);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(type24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        float float1 = org.mockito.Matchers.eq((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.List list2 = org.mockito.Matchers.refEq(list0, strArray1);
        java.util.List list3 = org.mockito.Matchers.eq(list2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        long long1 = org.mockito.Matchers.eq((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double double1 = org.mockito.Matchers.eq((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass2 = matchers1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj11 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray10);
        java.lang.CharSequence charSequence12 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray10);
        java.lang.reflect.Type type13 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass2, strArray10);
        org.mockito.Matchers matchers14 = org.mockito.Matchers.refEq(matchers0, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = matchers14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(matchers14);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String str0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Iterable iterable0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(iterable0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        double double1 = org.mockito.Matchers.eq((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Iterable iterable0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(iterable0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = org.mockito.Matchers.same(type0);
        org.junit.Assert.assertNull(type1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Map map0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        short short1 = org.mockito.Matchers.eq((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        byte byte1 = org.mockito.Matchers.eq((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        float float1 = org.mockito.Matchers.eq((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass3 = map2.getClass();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass3, strArray6);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass9 = map8.getClass();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration13 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass9, strArray12);
        java.lang.reflect.AnnotatedElement annotatedElement14 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass3, strArray12);
        java.lang.reflect.AnnotatedElement annotatedElement15 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray12);
        java.lang.reflect.Type type16 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration13);
        org.junit.Assert.assertNull(annotatedElement14);
        org.junit.Assert.assertNull(annotatedElement15);
        org.junit.Assert.assertNull(type16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int int1 = org.mockito.Matchers.eq((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        double double1 = org.mockito.Matchers.eq((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        long long1 = org.mockito.Matchers.eq((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.util.Collection collection1 = org.mockito.Matchers.same(collection0);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNull(collection1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        long long1 = org.mockito.Matchers.eq((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass2 = map1.getClass();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray5);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass8 = map7.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass8, strArray11);
        java.lang.reflect.AnnotatedElement annotatedElement13 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray11);
        java.io.Serializable serializable14 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = serializable14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNull(annotatedElement13);
        org.junit.Assert.assertNull(serializable14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Map map0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Map map0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        long long1 = org.mockito.Matchers.eq((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.same((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass2 = map1.getClass();
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        org.mockito.Matchers matchers4 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass5 = matchers4.getClass();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass7 = map6.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass7, strArray10);
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass13 = map12.getClass();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration17 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass13, strArray16);
        java.lang.reflect.AnnotatedElement annotatedElement18 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass7, strArray16);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray16);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass21 = map20.getClass();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration25 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass21, strArray24);
        java.lang.reflect.GenericDeclaration genericDeclaration26 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass5, strArray24);
        java.lang.Class<?> wildcardClass27 = org.mockito.Matchers.refEq(wildcardClass2, strArray24);
        java.lang.CharSequence charSequence28 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray24);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration17);
        org.junit.Assert.assertNull(annotatedElement18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration25);
        org.junit.Assert.assertNull(genericDeclaration26);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertNull(charSequence28);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable6 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(strComparable6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        double double1 = org.mockito.Matchers.eq((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = org.mockito.Matchers.same(obj0);
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        int int1 = org.mockito.Matchers.eq((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Collection collection0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass2 = map1.getClass();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray5);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass8 = map7.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass8, strArray11);
        java.lang.reflect.AnnotatedElement annotatedElement13 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray11);
        java.util.Set set14 = org.mockito.Matchers.refEq(set0, strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Collection collection16 = org.mockito.Matchers.refEq((java.util.Collection) set14, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = set14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNull(annotatedElement13);
        org.junit.Assert.assertNull(set14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass1);
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass4 = matchers3.getClass();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass6 = map5.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration10 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass6, strArray9);
        java.util.Map map11 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass12 = map11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration16 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass12, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement18 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray15);
        java.util.Map map19 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass20 = map19.getClass();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass20, strArray23);
        java.lang.reflect.GenericDeclaration genericDeclaration25 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray23);
        java.lang.Class<?> wildcardClass26 = org.mockito.Matchers.refEq(wildcardClass1, strArray23);
        java.lang.Class<?> wildcardClass27 = strArray23.getClass();
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(annotatedElement18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNull(genericDeclaration25);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        double double1 = org.mockito.Matchers.eq((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        long long1 = org.mockito.Matchers.eq((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass2 = matchers1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj11 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray10);
        java.lang.CharSequence charSequence12 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray10);
        java.lang.reflect.Type type13 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass2, strArray10);
        org.mockito.Matchers matchers14 = org.mockito.Matchers.refEq(matchers0, strArray10);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.same(matchers0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(matchers14);
        org.junit.Assert.assertNull(matchers15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.io.Serializable serializable1 = org.mockito.Matchers.same((java.io.Serializable) "hi!");
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.eq(matchers0);
        org.junit.Assert.assertNull(matchers1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int int1 = org.mockito.Matchers.eq(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj8 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray7);
        java.util.List list9 = org.mockito.Matchers.refEq(list1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = list1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.same(strComparable0);
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass1);
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass4 = matchers3.getClass();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass6 = map5.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration10 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass6, strArray9);
        java.util.Map map11 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass12 = map11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration16 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass12, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement18 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray15);
        java.util.Map map19 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass20 = map19.getClass();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass20, strArray23);
        java.lang.reflect.GenericDeclaration genericDeclaration25 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray23);
        java.lang.Class<?> wildcardClass26 = org.mockito.Matchers.refEq(wildcardClass1, strArray23);
        java.lang.Class<?> wildcardClass27 = org.mockito.Matchers.eq(wildcardClass26);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(annotatedElement18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNull(genericDeclaration25);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNull(wildcardClass27);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        org.mockito.Matchers matchers1 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass2 = matchers1.getClass();
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray7);
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration14 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass10, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement15 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray13);
        java.util.Map map17 = org.mockito.Matchers.refEq(map0, strArray13);
        java.util.Map map19 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass20 = map19.getClass();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass20, strArray23);
        java.util.Map map25 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass26 = map25.getClass();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration30 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass26, strArray29);
        java.lang.reflect.AnnotatedElement annotatedElement31 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass20, strArray29);
        java.io.Serializable serializable32 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray29);
        java.util.Map map33 = org.mockito.Matchers.refEq(map0, strArray29);
        java.lang.Object obj34 = org.mockito.Matchers.same((java.lang.Object) map33);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration14);
        org.junit.Assert.assertNull(annotatedElement15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration30);
        org.junit.Assert.assertNull(annotatedElement31);
        org.junit.Assert.assertNull(serializable32);
        org.junit.Assert.assertNull(map33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        java.util.Set set2 = org.mockito.Matchers.anySet();
        java.lang.Object obj3 = org.mockito.Matchers.same((java.lang.Object) set2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.Set set7 = org.mockito.Matchers.refEq(set2, strArray6);
        java.util.List list8 = org.mockito.Matchers.refEq(list0, strArray6);
        java.util.List list9 = org.mockito.Matchers.same(list8);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(set7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass2 = map1.getClass();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray5);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass8 = map7.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass8, strArray11);
        java.lang.reflect.AnnotatedElement annotatedElement13 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray11);
        java.util.Set set14 = org.mockito.Matchers.refEq(set0, strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Collection collection16 = org.mockito.Matchers.refEq((java.util.Collection) set14, strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.util.Map map19 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass20 = map19.getClass();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass20, strArray23);
        java.util.Map map25 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass26 = map25.getClass();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration30 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass26, strArray29);
        java.lang.reflect.AnnotatedElement annotatedElement31 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass20, strArray29);
        java.io.Serializable serializable32 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray29);
        java.lang.reflect.Type type33 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass17, strArray29);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNull(annotatedElement13);
        org.junit.Assert.assertNull(set14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration30);
        org.junit.Assert.assertNull(annotatedElement31);
        org.junit.Assert.assertNull(serializable32);
        org.junit.Assert.assertNull(type33);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj10 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray9);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.reflect.Type type12 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray9);
        java.io.Serializable serializable13 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass1);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj20 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray19);
        java.lang.reflect.GenericDeclaration genericDeclaration21 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray19);
        java.lang.String[] strArray22 = null;
        java.io.Serializable serializable23 = org.mockito.Matchers.refEq((java.io.Serializable) strArray19, strArray22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(serializable13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(genericDeclaration21);
        org.junit.Assert.assertNull(serializable23);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        double double1 = org.mockito.Matchers.eq((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        double double1 = org.mockito.Matchers.eq((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int int1 = org.mockito.Matchers.eq((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        float float1 = org.mockito.Matchers.eq((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        long long1 = org.mockito.Matchers.eq((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        double double1 = org.mockito.Matchers.eq((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.mockito.Matchers.same(annotatedElement0);
        org.junit.Assert.assertNull(annotatedElement1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass2 = map1.getClass();
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.util.Set set5 = org.mockito.Matchers.anySet();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass7 = map6.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass7, strArray10);
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass13 = map12.getClass();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration17 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass13, strArray16);
        java.lang.reflect.AnnotatedElement annotatedElement18 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass7, strArray16);
        java.util.Set set19 = org.mockito.Matchers.refEq(set5, strArray16);
        java.lang.Class<?> wildcardClass20 = org.mockito.Matchers.refEq(wildcardClass2, strArray16);
        java.lang.String str21 = org.mockito.Matchers.refEq("", strArray16);
        java.lang.Class<?> wildcardClass22 = strArray16.getClass();
        java.util.Map map24 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass25 = map24.getClass();
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration29 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass25, strArray28);
        java.util.Map map30 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass31 = map30.getClass();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration35 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass31, strArray34);
        java.lang.reflect.AnnotatedElement annotatedElement36 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass25, strArray34);
        java.io.Serializable serializable37 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray34);
        java.lang.reflect.GenericDeclaration genericDeclaration38 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass22, strArray34);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(genericDeclaration4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration17);
        org.junit.Assert.assertNull(annotatedElement18);
        org.junit.Assert.assertNull(set19);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration35);
        org.junit.Assert.assertNull(annotatedElement36);
        org.junit.Assert.assertNull(serializable37);
        org.junit.Assert.assertNull(genericDeclaration38);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        double double1 = org.mockito.Matchers.eq((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        double double1 = org.mockito.Matchers.eq((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass3 = map2.getClass();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass3, strArray6);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass9 = map8.getClass();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration13 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass9, strArray12);
        java.lang.reflect.AnnotatedElement annotatedElement14 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass3, strArray12);
        java.lang.Object obj15 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray12);
        java.io.Serializable serializable16 = org.mockito.Matchers.refEq((java.io.Serializable) 10L, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = serializable16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration13);
        org.junit.Assert.assertNull(annotatedElement14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(serializable16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        float float1 = org.mockito.Matchers.eq((float) '\000');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        long long1 = org.mockito.Matchers.eq((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.List list2 = org.mockito.Matchers.refEq(list0, strArray1);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass5 = map4.getClass();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration9 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass5, strArray8);
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass11 = map10.getClass();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration15 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass11, strArray14);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray14);
        java.lang.Object obj17 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray14);
        java.util.Collection collection18 = org.mockito.Matchers.refEq((java.util.Collection) list2, strArray14);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(collection18);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj6 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(annotatedElement8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String[] strArray0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray4);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass7 = map6.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass7, strArray10);
        java.lang.reflect.AnnotatedElement annotatedElement12 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray10);
        java.io.Serializable serializable13 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement14 = org.mockito.Matchers.eq((java.lang.reflect.AnnotatedElement) wildcardClass1);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNull(annotatedElement12);
        org.junit.Assert.assertNull(serializable13);
        org.junit.Assert.assertNull(annotatedElement14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        float float1 = org.mockito.Matchers.eq((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        org.mockito.Matchers matchers1 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass2 = matchers1.getClass();
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray7);
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration14 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass10, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement15 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray13);
        java.util.Map map17 = org.mockito.Matchers.refEq(map0, strArray13);
        java.lang.Class<?> wildcardClass18 = strArray13.getClass();
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration14);
        org.junit.Assert.assertNull(annotatedElement15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.same(set0);
        java.util.List list4 = org.mockito.Matchers.anyList();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass6 = map5.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration10 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass6, strArray9);
        java.util.Map map11 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass12 = map11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration16 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass12, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray15);
        java.lang.String[] strArray18 = org.mockito.Matchers.same(strArray15);
        java.lang.Object obj19 = org.mockito.Matchers.refEq((java.lang.Object) list4, strArray15);
        java.util.Collection collection20 = org.mockito.Matchers.refEq((java.util.Collection) set3, strArray15);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(collection20);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.Set set5 = org.mockito.Matchers.refEq(set0, strArray4);
        java.lang.Class<?> wildcardClass6 = set0.getClass();
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.lang.Object obj3 = org.mockito.Matchers.eq((java.lang.Object) wildcardClass2);
        java.io.Serializable serializable4 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(genericDeclaration5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int int1 = org.mockito.Matchers.eq((int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        int int1 = org.mockito.Matchers.eq((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        float float1 = org.mockito.Matchers.eq((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration1 = org.mockito.Matchers.same(genericDeclaration0);
        org.junit.Assert.assertNull(genericDeclaration1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        double double1 = org.mockito.Matchers.eq((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.lang.Object obj3 = org.mockito.Matchers.eq((java.lang.Object) wildcardClass2);
        java.io.Serializable serializable4 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass2);
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        org.mockito.Matchers matchers6 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass7 = matchers6.getClass();
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass9 = map8.getClass();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration13 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass9, strArray12);
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass15 = map14.getClass();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass15, strArray18);
        java.lang.reflect.AnnotatedElement annotatedElement20 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass9, strArray18);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass7, strArray18);
        java.util.Map map22 = org.mockito.Matchers.refEq(map5, strArray18);
        java.lang.reflect.Type type23 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass2, strArray18);
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNull(annotatedElement20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(type23);
        org.junit.Assert.assertNull(genericDeclaration24);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.same((java.util.Collection) list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = collection1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj8 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray7);
        java.util.List list9 = org.mockito.Matchers.refEq(list1, strArray7);
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass11 = map10.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        java.lang.reflect.GenericDeclaration genericDeclaration13 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass11);
        java.util.Set set14 = org.mockito.Matchers.anySet();
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass16 = map15.getClass();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration20 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass16, strArray19);
        java.util.Map map21 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass22 = map21.getClass();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration26 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass22, strArray25);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass16, strArray25);
        java.util.Set set28 = org.mockito.Matchers.refEq(set14, strArray25);
        java.lang.Class<?> wildcardClass29 = org.mockito.Matchers.refEq(wildcardClass11, strArray25);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray7, strArray25);
        java.lang.Class<?> wildcardClass31 = strArray7.getClass();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(genericDeclaration13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(set28);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj10 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray9);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.reflect.Type type12 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray9);
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass15 = map14.getClass();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass15, strArray18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass21 = map20.getClass();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration25 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass21, strArray24);
        java.lang.reflect.AnnotatedElement annotatedElement26 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray24);
        java.lang.Object obj27 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray24);
        java.lang.Object obj28 = org.mockito.Matchers.refEq((java.lang.Object) strArray9, strArray24);
        java.lang.Class<?> wildcardClass29 = strArray24.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration25);
        org.junit.Assert.assertNull(annotatedElement26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        java.lang.Class<?> wildcardClass2 = org.mockito.Matchers.eq(wildcardClass1);
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass4 = matchers3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj13 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.reflect.Type type15 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass4, strArray12);
        java.util.Map map17 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass18 = map17.getClass();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass18, strArray21);
        java.util.Map map23 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass24 = map23.getClass();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration28 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass24, strArray27);
        java.lang.reflect.AnnotatedElement annotatedElement29 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass18, strArray27);
        java.lang.Object obj30 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray27);
        java.lang.Object obj31 = org.mockito.Matchers.refEq((java.lang.Object) strArray12, strArray27);
        java.lang.Object obj32 = org.mockito.Matchers.refEq((java.lang.Object) wildcardClass1, strArray27);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration28);
        org.junit.Assert.assertNull(annotatedElement29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.Set set5 = org.mockito.Matchers.refEq(set0, strArray4);
        java.util.Set set6 = org.mockito.Matchers.eq(set0);
        java.util.Set set7 = org.mockito.Matchers.same(set0);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(set5);
        org.junit.Assert.assertNull(set6);
        org.junit.Assert.assertNull(set7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int int1 = org.mockito.Matchers.eq((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        int int1 = org.mockito.Matchers.eq((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        org.mockito.Matchers matchers4 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass5 = matchers4.getClass();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass7 = map6.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass7, strArray10);
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass13 = map12.getClass();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration17 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass13, strArray16);
        java.lang.reflect.AnnotatedElement annotatedElement18 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass7, strArray16);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray16);
        java.util.Map map20 = org.mockito.Matchers.refEq(map3, strArray16);
        java.util.Collection collection21 = org.mockito.Matchers.refEq((java.util.Collection) set2, strArray16);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration17);
        org.junit.Assert.assertNull(annotatedElement18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(collection21);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        float float1 = org.mockito.Matchers.eq(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass3 = map2.getClass();
        java.lang.reflect.Type type4 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass3);
        java.util.Set set6 = org.mockito.Matchers.anySet();
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass8 = map7.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass8, strArray11);
        java.util.Map map13 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass14 = map13.getClass();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration18 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass14, strArray17);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass8, strArray17);
        java.util.Set set20 = org.mockito.Matchers.refEq(set6, strArray17);
        java.lang.Class<?> wildcardClass21 = org.mockito.Matchers.refEq(wildcardClass3, strArray17);
        java.lang.String str22 = org.mockito.Matchers.refEq("", strArray17);
        java.util.Map map23 = org.mockito.Matchers.refEq(map0, strArray17);
        java.util.Map map24 = org.mockito.Matchers.eq(map23);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNull(set20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map24);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj8 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray7);
        java.util.List list9 = org.mockito.Matchers.refEq(list0, strArray7);
        java.lang.reflect.GenericDeclaration genericDeclaration10 = null;
        org.mockito.Matchers matchers11 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass12 = matchers11.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration13 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj21 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray20);
        java.lang.CharSequence charSequence22 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray20);
        java.lang.reflect.Type type23 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass12, strArray20);
        java.io.Serializable serializable24 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass12);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj31 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray30);
        java.lang.reflect.GenericDeclaration genericDeclaration32 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass12, strArray30);
        java.lang.reflect.GenericDeclaration genericDeclaration33 = org.mockito.Matchers.refEq(genericDeclaration10, strArray30);
        java.util.List list34 = org.mockito.Matchers.refEq(list0, strArray30);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(genericDeclaration13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(type23);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(genericDeclaration32);
        org.junit.Assert.assertNull(genericDeclaration33);
        org.junit.Assert.assertNull(list34);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration1 = org.mockito.Matchers.eq(genericDeclaration0);
        org.junit.Assert.assertNull(genericDeclaration1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.Set set5 = org.mockito.Matchers.refEq(set0, strArray4);
        java.lang.Iterable iterable6 = org.mockito.Matchers.eq((java.lang.Iterable) set0);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(set5);
        org.junit.Assert.assertNull(iterable6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj10 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray9);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.reflect.Type type12 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray9);
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass15 = map14.getClass();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass15, strArray18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass21 = map20.getClass();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration25 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass21, strArray24);
        java.lang.reflect.AnnotatedElement annotatedElement26 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray24);
        java.lang.Object obj27 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray24);
        java.lang.Object obj28 = org.mockito.Matchers.refEq((java.lang.Object) strArray9, strArray24);
        java.lang.Object obj29 = org.mockito.Matchers.same((java.lang.Object) strArray9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration25);
        org.junit.Assert.assertNull(annotatedElement26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.lang.String str1 = org.mockito.Matchers.eq("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass2 = map1.getClass();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray5);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass8 = map7.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass8, strArray11);
        java.lang.reflect.AnnotatedElement annotatedElement13 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray11);
        java.io.Serializable serializable14 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass2);
        org.mockito.Matchers matchers15 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass16 = matchers15.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration17 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj25 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray24);
        java.lang.CharSequence charSequence26 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray24);
        java.lang.reflect.Type type27 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass16, strArray24);
        java.util.Map map29 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass30 = map29.getClass();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration34 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass30, strArray33);
        java.util.Map map35 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass36 = map35.getClass();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration40 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass36, strArray39);
        java.lang.reflect.AnnotatedElement annotatedElement41 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass30, strArray39);
        java.lang.Object obj42 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray39);
        java.lang.Object obj43 = org.mockito.Matchers.refEq((java.lang.Object) strArray24, strArray39);
        java.lang.reflect.GenericDeclaration genericDeclaration44 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray24);
        java.util.List list45 = org.mockito.Matchers.anyList();
        java.util.List list46 = org.mockito.Matchers.same(list45);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj53 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray52);
        java.util.List list54 = org.mockito.Matchers.refEq(list46, strArray52);
        java.lang.reflect.GenericDeclaration genericDeclaration55 = org.mockito.Matchers.refEq(genericDeclaration44, strArray52);
        java.lang.Comparable<java.lang.String> strComparable56 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "", strArray52);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNull(annotatedElement13);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(genericDeclaration17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(charSequence26);
        org.junit.Assert.assertNull(type27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration40);
        org.junit.Assert.assertNull(annotatedElement41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(genericDeclaration44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(list46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(list54);
        org.junit.Assert.assertNull(genericDeclaration55);
        org.junit.Assert.assertNull(strComparable56);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        org.mockito.Matchers matchers1 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass2 = matchers1.getClass();
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray7);
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration14 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass10, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement15 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray13);
        java.util.Map map17 = org.mockito.Matchers.refEq(map0, strArray13);
        java.util.Map map18 = org.mockito.Matchers.eq(map0);
        java.util.Map map19 = org.mockito.Matchers.eq(map0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = map19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration14);
        org.junit.Assert.assertNull(annotatedElement15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.lang.String str1 = org.mockito.Matchers.eq("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray4);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass7 = map6.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass7, strArray10);
        java.lang.reflect.AnnotatedElement annotatedElement12 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray10);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass14 = matchers13.getClass();
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass16 = map15.getClass();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration20 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass16, strArray19);
        java.util.Map map21 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass22 = map21.getClass();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration26 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass22, strArray25);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass16, strArray25);
        java.lang.reflect.AnnotatedElement annotatedElement28 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass14, strArray25);
        java.util.Map map29 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass30 = map29.getClass();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration34 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass30, strArray33);
        java.lang.reflect.GenericDeclaration genericDeclaration35 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass14, strArray33);
        java.lang.String[] strArray36 = org.mockito.Matchers.refEq(strArray10, strArray33);
        java.lang.Class<?> wildcardClass37 = strArray33.getClass();
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNull(annotatedElement12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(annotatedElement28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration34);
        org.junit.Assert.assertNull(genericDeclaration35);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Set set4 = org.mockito.Matchers.anySet();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass6 = map5.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration10 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass6, strArray9);
        java.util.Map map11 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass12 = map11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration16 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass12, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray15);
        java.util.Set set18 = org.mockito.Matchers.refEq(set4, strArray15);
        java.lang.Class<?> wildcardClass19 = org.mockito.Matchers.refEq(wildcardClass1, strArray15);
        java.util.Set set20 = org.mockito.Matchers.anySet();
        java.util.Map map21 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass22 = map21.getClass();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration26 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass22, strArray25);
        java.util.Map map27 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass28 = map27.getClass();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration32 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass28, strArray31);
        java.lang.reflect.AnnotatedElement annotatedElement33 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass22, strArray31);
        java.util.Set set34 = org.mockito.Matchers.refEq(set20, strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Collection collection36 = org.mockito.Matchers.refEq((java.util.Collection) set34, strArray35);
        java.lang.reflect.AnnotatedElement annotatedElement37 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass19, strArray35);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(set18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration32);
        org.junit.Assert.assertNull(annotatedElement33);
        org.junit.Assert.assertNull(set34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertNull(collection36);
        org.junit.Assert.assertNull(annotatedElement37);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass4 = matchers3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj13 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.reflect.Type type15 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass4, strArray12);
        java.util.Map map17 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass18 = map17.getClass();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass18, strArray21);
        java.util.Map map23 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass24 = map23.getClass();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration28 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass24, strArray27);
        java.lang.reflect.AnnotatedElement annotatedElement29 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass18, strArray27);
        java.lang.Object obj30 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray27);
        java.lang.Object obj31 = org.mockito.Matchers.refEq((java.lang.Object) strArray12, strArray27);
        java.lang.CharSequence charSequence32 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray27);
        java.lang.reflect.AnnotatedElement annotatedElement33 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray27);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration28);
        org.junit.Assert.assertNull(annotatedElement29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(charSequence32);
        org.junit.Assert.assertNull(annotatedElement33);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray7);
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration14 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass10, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement15 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray13);
        java.lang.Object obj16 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray13);
        org.mockito.Matchers matchers17 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass18 = matchers17.getClass();
        java.util.Map map19 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass20 = map19.getClass();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass20, strArray23);
        java.util.Map map25 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass26 = map25.getClass();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration30 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass26, strArray29);
        java.lang.reflect.AnnotatedElement annotatedElement31 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass20, strArray29);
        java.lang.reflect.AnnotatedElement annotatedElement32 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass18, strArray29);
        java.util.Map map33 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass34 = map33.getClass();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration38 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass34, strArray37);
        java.lang.reflect.GenericDeclaration genericDeclaration39 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass18, strArray37);
        java.io.Serializable serializable40 = org.mockito.Matchers.refEq((java.io.Serializable) 10, strArray37);
        java.lang.Iterable iterable41 = org.mockito.Matchers.refEq(iterable1, strArray37);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration14);
        org.junit.Assert.assertNull(annotatedElement15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration30);
        org.junit.Assert.assertNull(annotatedElement31);
        org.junit.Assert.assertNull(annotatedElement32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration38);
        org.junit.Assert.assertNull(genericDeclaration39);
        org.junit.Assert.assertNull(serializable40);
        org.junit.Assert.assertNull(iterable41);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        double double1 = org.mockito.Matchers.eq((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj10 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray9);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.reflect.Type type12 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray9);
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass15 = map14.getClass();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass15, strArray18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass21 = map20.getClass();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration25 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass21, strArray24);
        java.lang.reflect.AnnotatedElement annotatedElement26 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray24);
        java.lang.Object obj27 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray24);
        java.lang.Object obj28 = org.mockito.Matchers.refEq((java.lang.Object) strArray9, strArray24);
        java.lang.Class<?> wildcardClass29 = strArray9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration25);
        org.junit.Assert.assertNull(annotatedElement26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.Set set5 = org.mockito.Matchers.refEq(set0, strArray4);
        java.util.Set set6 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection7 = org.mockito.Matchers.eq((java.util.Collection) set6);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(set5);
        org.junit.Assert.assertNull(set6);
        org.junit.Assert.assertNull(collection7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj8 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray7);
        java.util.List list9 = org.mockito.Matchers.refEq(list0, strArray7);
        java.lang.Class<?> wildcardClass10 = strArray7.getClass();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        long long1 = org.mockito.Matchers.eq((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.mockito.Matchers matchers1 = new org.mockito.Matchers();
        org.mockito.Matchers matchers2 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass3 = matchers2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass3);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj12 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray11);
        java.lang.CharSequence charSequence13 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray11);
        java.lang.reflect.Type type14 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass3, strArray11);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers1, strArray11);
        java.io.Serializable serializable16 = org.mockito.Matchers.refEq((java.io.Serializable) (byte) 0, strArray11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(genericDeclaration4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNull(serializable16);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Collection collection1 = org.mockito.Matchers.same((java.util.Collection) set0);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(collection1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Iterable iterable1 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(iterable1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.anyList();
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray7);
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration14 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass10, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement15 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.same(strArray13);
        java.lang.Object obj17 = org.mockito.Matchers.refEq((java.lang.Object) list2, strArray13);
        java.util.List list18 = org.mockito.Matchers.refEq(list0, strArray13);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration14);
        org.junit.Assert.assertNull(annotatedElement15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class<?> wildcardClass1 = org.mockito.Matchers.same(wildcardClass0);
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.same(list0);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(list2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.same(list0);
        java.lang.Iterable iterable3 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(iterable3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.String str1 = org.mockito.Matchers.same("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj7 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray6);
        java.lang.Comparable<java.lang.String> strComparable8 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        double double1 = org.mockito.Matchers.eq((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.same(set0);
        java.lang.Class<?> wildcardClass4 = set0.getClass();
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.Set set0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(set0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj14 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.reflect.Type type16 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass6, strArray13);
        org.mockito.Matchers matchers19 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass20 = matchers19.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration21 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object obj29 = org.mockito.Matchers.refEq((java.lang.Object) 'a', strArray28);
        java.lang.CharSequence charSequence30 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray28);
        java.lang.reflect.Type type31 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass20, strArray28);
        java.util.Map map33 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass34 = map33.getClass();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration38 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass34, strArray37);
        java.util.Map map39 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass40 = map39.getClass();
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.lang.reflect.GenericDeclaration genericDeclaration44 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass40, strArray43);
        java.lang.reflect.AnnotatedElement annotatedElement45 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass34, strArray43);
        java.lang.Object obj46 = org.mockito.Matchers.refEq((java.lang.Object) 10, strArray43);
        java.lang.Object obj47 = org.mockito.Matchers.refEq((java.lang.Object) strArray28, strArray43);
        java.lang.CharSequence charSequence48 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray43);
        java.lang.CharSequence charSequence49 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray43);
        java.lang.reflect.AnnotatedElement annotatedElement50 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray43);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(genericDeclaration21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(charSequence30);
        org.junit.Assert.assertNull(type31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(genericDeclaration44);
        org.junit.Assert.assertNull(annotatedElement45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(charSequence48);
        org.junit.Assert.assertNull(charSequence49);
        org.junit.Assert.assertNull(annotatedElement50);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.List list2 = org.mockito.Matchers.refEq(list0, strArray1);
        java.lang.Class<?> wildcardClass3 = list0.getClass();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

