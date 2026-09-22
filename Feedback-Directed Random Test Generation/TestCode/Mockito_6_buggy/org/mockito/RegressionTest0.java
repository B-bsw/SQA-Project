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
        java.lang.String str1 = org.mockito.Matchers.startsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        char char1 = org.mockito.Matchers.eq(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str1 = org.mockito.Matchers.endsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean0 = org.mockito.Matchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.hamcrest.Matcher<java.lang.Byte> byteMatcher0 = null;
        byte byte1 = org.mockito.Matchers.byteThat(byteMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.Serializable serializable0 = null;
        java.io.Serializable serializable1 = org.mockito.Matchers.same(serializable0);
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        long long1 = org.mockito.Matchers.eq((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = org.mockito.Matchers.notNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        char char0 = org.mockito.Matchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        byte byte1 = org.mockito.Matchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        float float1 = org.mockito.Matchers.eq((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        byte byte1 = org.mockito.Matchers.eq((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object obj0 = org.mockito.Matchers.isNotNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        double double1 = org.mockito.Matchers.eq(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str1 = org.mockito.Matchers.contains("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        double double0 = org.mockito.Matchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        char char1 = org.mockito.Matchers.eq('a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.hamcrest.Matcher<java.lang.Boolean> booleanMatcher0 = null;
        boolean boolean1 = org.mockito.Matchers.booleanThat(booleanMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.hamcrest.Matcher<java.lang.Float> floatMatcher0 = null;
        float float1 = org.mockito.Matchers.floatThat(floatMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = org.mockito.Matchers.isNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.hamcrest.Matcher<java.lang.Character> charMatcher0 = null;
        char char1 = org.mockito.Matchers.charThat(charMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        short short0 = org.mockito.Matchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str1 = org.mockito.Matchers.endsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) (short) 100);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (short) 0 + "'", obj1, (short) 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.mockito.Matchers matchers0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(matchers0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        float float0 = org.mockito.Matchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.hamcrest.Matcher<java.lang.Double> doubleMatcher0 = null;
        double double1 = org.mockito.Matchers.doubleThat(doubleMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        long long1 = org.mockito.Matchers.eq((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        boolean boolean1 = org.mockito.Matchers.eq(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str0 = org.mockito.Matchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.hamcrest.Matcher<java.lang.Integer> intMatcher0 = null;
        int int1 = org.mockito.Matchers.intThat(intMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.hamcrest.Matcher<java.lang.Long> longMatcher0 = null;
        long long1 = org.mockito.Matchers.longThat(longMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.mockito.Matchers matchers0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(matchers0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        byte byte1 = org.mockito.Matchers.eq((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        float float1 = org.mockito.Matchers.eq((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        short short1 = org.mockito.Matchers.eq((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Map map0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        float float1 = org.mockito.Matchers.eq((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        char char1 = org.mockito.Matchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        long long0 = org.mockito.Matchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str1 = org.mockito.Matchers.contains("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        double double1 = org.mockito.Matchers.eq((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str1 = org.mockito.Matchers.matches("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        byte byte0 = org.mockito.Matchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int int0 = org.mockito.Matchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str1 = org.mockito.Matchers.matches("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str1 = org.mockito.Matchers.startsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.reflect.Type type0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        short short1 = org.mockito.Matchers.eq((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Map map0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.lang.Class<?> wildcardClass1 = set0.getClass();
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String[] strArray0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int1 = org.mockito.Matchers.eq((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        float float1 = org.mockito.Matchers.eq(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        double double1 = org.mockito.Matchers.eq((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence6 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray5);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = genericDeclaration7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(genericDeclaration7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        char char1 = org.mockito.Matchers.eq('4');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        double double1 = org.mockito.Matchers.eq(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.same(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set1);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.Serializable serializable1 = org.mockito.Matchers.same((java.io.Serializable) false);
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + false + "'", serializable1, false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        short short1 = org.mockito.Matchers.eq((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        char char1 = org.mockito.Matchers.eq('#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int1 = org.mockito.Matchers.eq((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        long long1 = org.mockito.Matchers.eq((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        short short1 = org.mockito.Matchers.eq((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        long long1 = org.mockito.Matchers.eq((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        long long1 = org.mockito.Matchers.eq((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int int1 = org.mockito.Matchers.eq(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Class<?> wildcardClass1 = matchers0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) 100);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 0 + "'", obj1, 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int int1 = org.mockito.Matchers.eq((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        short short1 = org.mockito.Matchers.eq((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        long long1 = org.mockito.Matchers.eq((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = strArray10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.reflect.Type type0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map1 = org.mockito.Matchers.same(map0);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNull(map1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.util.Collection collection1 = org.mockito.Matchers.same(collection0);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNull(collection1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        double double1 = org.mockito.Matchers.eq((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        double double1 = org.mockito.Matchers.eq((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        double double1 = org.mockito.Matchers.eq((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.same(list1);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        long long1 = org.mockito.Matchers.eq(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        double double1 = org.mockito.Matchers.eq((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        short short1 = org.mockito.Matchers.eq((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Iterable iterable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(iterable0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        double double1 = org.mockito.Matchers.eq((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        double double1 = org.mockito.Matchers.eq((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        double double1 = org.mockito.Matchers.eq((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        short short1 = org.mockito.Matchers.eq((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        float float1 = org.mockito.Matchers.eq(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        float float1 = org.mockito.Matchers.eq((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        long long1 = org.mockito.Matchers.eq((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        double double1 = org.mockito.Matchers.eq((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        short short1 = org.mockito.Matchers.eq((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.Serializable serializable0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.CharSequence charSequence1 = org.mockito.Matchers.same((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object obj0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.Serializable serializable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        byte byte1 = org.mockito.Matchers.eq((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int int1 = org.mockito.Matchers.eq((int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        long long1 = org.mockito.Matchers.eq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        boolean boolean1 = org.mockito.Matchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.List list0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(list0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement12 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass11);
        java.lang.reflect.AnnotatedElement annotatedElement13 = org.mockito.Matchers.same(annotatedElement12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(annotatedElement12);
        org.junit.Assert.assertNull(annotatedElement13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        double double1 = org.mockito.Matchers.eq((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int int1 = org.mockito.Matchers.eq((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int1 = org.mockito.Matchers.eq((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Collection collection0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        short short1 = org.mockito.Matchers.eq((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.same(set0);
        java.util.Collection collection2 = org.mockito.Matchers.same((java.util.Collection) set0);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.List list0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(list0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.same(list0);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(list2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        byte byte1 = org.mockito.Matchers.eq((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        float float1 = org.mockito.Matchers.eq((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int int1 = org.mockito.Matchers.eq((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int int1 = org.mockito.Matchers.eq(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Map map0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int1 = org.mockito.Matchers.eq(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        long long1 = org.mockito.Matchers.eq((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        float float1 = org.mockito.Matchers.eq((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        double double1 = org.mockito.Matchers.eq((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        double double1 = org.mockito.Matchers.eq((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence5 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.String[] strArray11 = org.mockito.Matchers.refEq(strArray4, strArray9);
        java.lang.Iterable iterable12 = org.mockito.Matchers.refEq((java.lang.Iterable) collection0, strArray9);
        java.util.Collection collection13 = org.mockito.Matchers.same(collection0);
        java.lang.Iterable iterable14 = org.mockito.Matchers.same((java.lang.Iterable) collection13);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(iterable12);
        org.junit.Assert.assertNull(collection13);
        org.junit.Assert.assertNull(iterable14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        float float1 = org.mockito.Matchers.eq(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        short short1 = org.mockito.Matchers.eq((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        double double1 = org.mockito.Matchers.eq((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        float float1 = org.mockito.Matchers.eq((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement12 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = org.mockito.Matchers.same(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(annotatedElement12);
        org.junit.Assert.assertNull(wildcardClass13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int int1 = org.mockito.Matchers.eq((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int int1 = org.mockito.Matchers.eq((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.String[] strArray11 = org.mockito.Matchers.same(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = strArray11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        long long1 = org.mockito.Matchers.eq((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        double double1 = org.mockito.Matchers.eq((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        long long1 = org.mockito.Matchers.eq((long) '\000');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        int int1 = org.mockito.Matchers.eq((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence16 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence21 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray20);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray15, strArray20);
        java.lang.reflect.AnnotatedElement annotatedElement23 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass11, strArray22);
        java.lang.Class<?> wildcardClass24 = org.mockito.Matchers.same(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(annotatedElement23);
        org.junit.Assert.assertNull(wildcardClass24);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.Object obj11 = org.mockito.Matchers.same((java.lang.Object) strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int int1 = org.mockito.Matchers.eq((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence5 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.String[] strArray11 = org.mockito.Matchers.refEq(strArray4, strArray9);
        java.lang.Iterable iterable12 = org.mockito.Matchers.refEq((java.lang.Iterable) collection0, strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(iterable12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        long long1 = org.mockito.Matchers.eq((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.Set set1 = org.mockito.Matchers.anySet();
        java.util.Set set2 = org.mockito.Matchers.same(set1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence7 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence12 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray11);
        java.lang.String[] strArray13 = org.mockito.Matchers.refEq(strArray6, strArray11);
        java.util.Collection collection14 = org.mockito.Matchers.refEq((java.util.Collection) set2, strArray6);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.Class<?> wildcardClass16 = strArray6.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        float float1 = org.mockito.Matchers.eq(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        double double1 = org.mockito.Matchers.eq((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.io.Serializable serializable1 = org.mockito.Matchers.same((java.io.Serializable) (byte) 100);
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + (byte) 0 + "'", serializable1, (byte) 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        int int1 = org.mockito.Matchers.eq((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass5 = map4.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass5, strArray9);
        java.util.Map map12 = org.mockito.Matchers.refEq(map3, strArray9);
        java.lang.reflect.AnnotatedElement annotatedElement13 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) genericDeclaration2, strArray9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(annotatedElement13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        long long1 = org.mockito.Matchers.eq((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.same(set0);
        java.lang.Class<?> wildcardClass2 = set0.getClass();
        java.lang.reflect.Type type3 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.reflect.Type type0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String[] strArray0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.reflect.GenericDeclaration genericDeclaration10 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray8);
        java.lang.reflect.AnnotatedElement annotatedElement11 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray8);
        org.mockito.Matchers matchers12 = org.mockito.Matchers.refEq(matchers0, strArray8);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass17 = map16.getClass();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence22 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray21);
        java.lang.reflect.GenericDeclaration genericDeclaration23 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray21);
        java.lang.reflect.AnnotatedElement annotatedElement24 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray21);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers13, strArray21);
        org.mockito.Matchers matchers26 = org.mockito.Matchers.refEq(matchers12, strArray21);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(genericDeclaration10);
        org.junit.Assert.assertNull(annotatedElement11);
        org.junit.Assert.assertNull(matchers12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(genericDeclaration23);
        org.junit.Assert.assertNull(annotatedElement24);
        org.junit.Assert.assertNull(matchers25);
        org.junit.Assert.assertNull(matchers26);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence5 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.String[] strArray11 = org.mockito.Matchers.refEq(strArray4, strArray9);
        java.lang.Iterable iterable12 = org.mockito.Matchers.refEq((java.lang.Iterable) collection0, strArray9);
        java.util.Collection collection13 = org.mockito.Matchers.same(collection0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence19 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence24 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray23);
        java.lang.String[] strArray25 = org.mockito.Matchers.refEq(strArray18, strArray23);
        java.lang.Class<?> wildcardClass26 = strArray18.getClass();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence31 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence36 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray35);
        java.lang.String[] strArray37 = org.mockito.Matchers.refEq(strArray30, strArray35);
        java.lang.reflect.AnnotatedElement annotatedElement38 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass26, strArray37);
        java.util.Set set40 = org.mockito.Matchers.anySet();
        java.util.Set set41 = org.mockito.Matchers.same(set40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence46 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence51 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray50);
        java.lang.String[] strArray52 = org.mockito.Matchers.refEq(strArray45, strArray50);
        java.util.Collection collection53 = org.mockito.Matchers.refEq((java.util.Collection) set41, strArray45);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray45);
        java.lang.reflect.GenericDeclaration genericDeclaration55 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass26, strArray45);
        java.lang.Comparable<java.lang.String> strComparable56 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray45);
        java.lang.Iterable iterable57 = org.mockito.Matchers.refEq((java.lang.Iterable) collection13, strArray45);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(iterable12);
        org.junit.Assert.assertNull(collection13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNull(annotatedElement38);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(set41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNull(collection53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(genericDeclaration55);
        org.junit.Assert.assertNull(strComparable56);
        org.junit.Assert.assertNull(iterable57);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        java.io.Serializable serializable12 = org.mockito.Matchers.same((java.io.Serializable) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(serializable12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int int1 = org.mockito.Matchers.eq((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence5 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.String[] strArray11 = org.mockito.Matchers.refEq(strArray4, strArray9);
        java.lang.Iterable iterable12 = org.mockito.Matchers.refEq((java.lang.Iterable) collection0, strArray9);
        java.io.Serializable serializable13 = org.mockito.Matchers.eq((java.io.Serializable) strArray9);
        java.lang.String[] strArray14 = org.mockito.Matchers.same(strArray9);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(iterable12);
        org.junit.Assert.assertNull(serializable13);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        long long1 = org.mockito.Matchers.eq((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence5 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.lang.String[] strArray11 = org.mockito.Matchers.refEq(strArray4, strArray9);
        java.util.List list12 = org.mockito.Matchers.refEq(list0, strArray4);
        java.util.Collection collection13 = org.mockito.Matchers.eq((java.util.Collection) list0);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(collection13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.String[] strArray2 = null;
        java.util.List list3 = org.mockito.Matchers.refEq(list1, strArray2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass2 = map1.getClass();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence7 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.reflect.GenericDeclaration genericDeclaration8 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray6);
        java.lang.reflect.AnnotatedElement annotatedElement9 = org.mockito.Matchers.refEq(annotatedElement0, strArray6);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(genericDeclaration8);
        org.junit.Assert.assertNull(annotatedElement9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Collection collection0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        double double1 = org.mockito.Matchers.eq(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        float float1 = org.mockito.Matchers.eq((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        long long1 = org.mockito.Matchers.eq(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        int int1 = org.mockito.Matchers.eq((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        java.lang.Class<?> wildcardClass12 = org.mockito.Matchers.same(wildcardClass11);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence17 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence22 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray21);
        java.lang.String[] strArray23 = org.mockito.Matchers.refEq(strArray16, strArray21);
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass12, strArray23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(genericDeclaration24);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.Set set0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(set0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + 0 + "'", obj1, 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.reflect.GenericDeclaration genericDeclaration10 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray8);
        java.lang.reflect.AnnotatedElement annotatedElement11 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray8);
        java.lang.Comparable<java.lang.String> strComparable12 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray8);
        java.lang.reflect.Type type14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence19 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence24 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray23);
        java.lang.String[] strArray25 = org.mockito.Matchers.refEq(strArray18, strArray23);
        java.lang.Class<?> wildcardClass26 = strArray18.getClass();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence31 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence36 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray35);
        java.lang.String[] strArray37 = org.mockito.Matchers.refEq(strArray30, strArray35);
        java.lang.reflect.AnnotatedElement annotatedElement38 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass26, strArray37);
        java.util.Set set40 = org.mockito.Matchers.anySet();
        java.util.Set set41 = org.mockito.Matchers.same(set40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence46 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence51 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray50);
        java.lang.String[] strArray52 = org.mockito.Matchers.refEq(strArray45, strArray50);
        java.util.Collection collection53 = org.mockito.Matchers.refEq((java.util.Collection) set41, strArray45);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray45);
        java.lang.reflect.GenericDeclaration genericDeclaration55 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass26, strArray45);
        java.lang.reflect.Type type56 = org.mockito.Matchers.refEq(type14, strArray45);
        java.lang.Object obj57 = org.mockito.Matchers.refEq((java.lang.Object) (short) -1, strArray45);
        java.lang.String[] strArray58 = org.mockito.Matchers.refEq(strArray8, strArray45);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(genericDeclaration10);
        org.junit.Assert.assertNull(annotatedElement11);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNull(annotatedElement38);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(set41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNull(collection53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(genericDeclaration55);
        org.junit.Assert.assertNull(type56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(strArray58);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.same(set0);
        java.lang.Class<?> wildcardClass2 = set0.getClass();
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type4 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        long long1 = org.mockito.Matchers.eq((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence4 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.refEq(strArray3, strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass11);
        java.lang.reflect.Type type13 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNull(type13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        long long1 = org.mockito.Matchers.eq((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        float float1 = org.mockito.Matchers.eq((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }
}

