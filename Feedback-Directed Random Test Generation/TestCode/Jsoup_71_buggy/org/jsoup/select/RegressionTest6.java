package org.jsoup.select;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        int int5 = indexLessThan1.index;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        boolean boolean8 = indexLessThan1.matches(element6, element7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 100, (int) (byte) -1);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        int int5 = isNthOfType2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = isRoot0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = isRoot0.matches(element7, element8);
        java.lang.String str10 = isRoot0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":root" + "'", str10, ":root");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 0);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        int int5 = isNthLastChild2.a;
        java.lang.String str6 = isNthLastChild2.toString();
        java.lang.String str7 = isNthLastChild2.toString();
        int int8 = isNthLastChild2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-last-child(0)" + "'", str6, ":nth-last-child(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":nth-last-child(0)" + "'", str7, ":nth-last-child(0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[nth-last-child!=[:last-child]]", "[[^:lt(-1)]$=nth-of-type]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[nth-last-child!=[:last-child]]*=[[^:lt(-1)]$=nth-of-type]]" + "'", str3, "[[nth-last-child!=[:last-child]]*=[[^:lt(-1)]$=nth-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[nth-last-child!=[:last-child]]*=[[^:lt(-1)]$=nth-of-type]]" + "'", str4, "[[nth-last-child!=[:last-child]]*=[[^:lt(-1)]$=nth-of-type]]");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(52, (int) (short) 10);
        int int3 = isNthLastChild2.a;
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        int int6 = isNthLastChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":matchesown(null)");
        java.lang.String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matchesown(null)" + "'", str2, ":matchesown(null)");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = null;
        attributeWithValueMatching2.pattern = pattern4;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsOwn(:containsown([nth-last-child!=:root]))", ":containsOwn([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])");
        java.lang.String str3 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsown([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])" + "'", str3, ":containsown([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[^:nth-of-type(35n+100)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attributeStarting1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[^:nth-last-child(-1n+100)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = id1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((-1), 32);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 0);
        java.lang.String str3 = isNthLastChild2.toString();
        int int4 = isNthLastChild2.a;
        int int5 = isNthLastChild2.a;
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(0)" + "'", str3, ":nth-last-child(0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 10, (int) (short) 0);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:eq(10)*=[^:lt(-1)]]");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[:last-child]!=#.:matchesown(null)]", "[^:first-of-type]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.key = "[:matches(null)!=:lt(-1)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[:last-child]!=#.:matchesown(null)]$=[^:first-of-type]]" + "'", str3, "[[[:last-child]!=#.:matchesown(null)]$=[^:first-of-type]]");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(10, (-1));
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) -1);
        indexGreaterThan1.index = (byte) 100;
        indexGreaterThan1.index = 'a';
        java.lang.String str6 = indexGreaterThan1.toString();
        java.lang.String str7 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 0;
        java.lang.String str10 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":gt(97)" + "'", str6, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":gt(97)" + "'", str7, ":gt(97)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":gt(0)" + "'", str10, ":gt(0)");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(".[[:matches(null)]!=:contains(:eq(10))]");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:containsdata(hi!)]", "[:root$=[:containsdata(hi!)=:last-of-type]]");
        attributeWithValueNot2.key = ":eq(100)";
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:eq(0)=[nth-of-type=:matchesown(null)]]");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tag1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:eq(0)=[nth-of-type=:matchesown(null)]]" + "'", str2, "[:eq(0)=[nth-of-type=:matchesown(null)]]");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsData([:nth-last-of-type(52n+1)$=:containsdata(:last-child)])");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[:eq(10)*=[^:lt(-1)]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.getPseudoClass();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isLastOfType0.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-last-of-type" + "'", str2, "nth-last-of-type");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 10);
        indexGreaterThan1.index = (byte) -1;
        int int4 = indexGreaterThan1.index;
        java.lang.String str5 = indexGreaterThan1.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(-1)" + "'", str5, ":gt(-1)");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[:contains(:containsown(:gt(97)))]$=[nth-last-child!=[:last-child]]]", "[:containsown(:lt(100))=[:lt(0)$=nth-of-type]]");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:last-child]", "*");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.value;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValue2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]=*]" + "'", str3, "[[:last-child]=*]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child]=*]" + "'", str4, "[[:last-child]=*]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "*" + "'", str5, "*");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) '4', 0);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:gt(10)=nth-last-child]", ":matches(null)");
        attributeWithValueNot2.value = "[:last-child]";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueNot2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":eq(52)");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) -1);
        java.lang.String str2 = indexEquals1.toString();
        java.lang.String str3 = indexEquals1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = indexEquals1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(-1)" + "'", str2, ":eq(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(-1)" + "'", str3, ":eq(-1)");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[#.:matchesOwn(null)]");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":root", pattern1);
        attributeWithValueMatching2.key = ":lt(-1)";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        attributeWithValueMatching2.key = ":containsOwn(:root)";
        attributeWithValueMatching2.key = ":containsOwn(:gt(97))";
        java.util.regex.Pattern pattern11 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern12 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertNull(pattern12);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:containsData(hi!)=:last-of-type]");
        java.lang.String str2 = containsData1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsData1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([:containsdata(hi!)=:last-of-type])" + "'", str2, ":containsData([:containsdata(hi!)=:last-of-type])");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":first-of-type");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-of-type", "nth-last-child");
        java.lang.String str3 = attributeWithValue2.value;
        java.lang.String str4 = attributeWithValue2.toString();
        java.lang.String str5 = attributeWithValue2.toString();
        attributeWithValue2.key = ":gt(10)";
        java.lang.String str8 = attributeWithValue2.value;
        java.lang.String str9 = attributeWithValue2.toString();
        java.lang.String str10 = attributeWithValue2.toString();
        java.lang.String str11 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-of-type=nth-last-child]" + "'", str4, "[nth-of-type=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-of-type=nth-last-child]" + "'", str5, "[nth-of-type=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-child" + "'", str8, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[:gt(10)=nth-last-child]" + "'", str9, "[:gt(10)=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[:gt(10)=nth-last-child]" + "'", str10, "[:gt(10)=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[:gt(10)=nth-last-child]" + "'", str11, "[:gt(10)=nth-last-child]");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) ' ', (int) (byte) 10);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        java.lang.String str5 = indexLessThan1.toString();
        indexLessThan1.index = 97;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(10)" + "'", str5, ":lt(10)");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[:contains(:containsown(:gt(97)))]$=[nth-last-child!=[:last-child]]]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsOwnText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = allElements0.matches(element7, element8);
        java.lang.String str10 = allElements0.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = allElements0.matches(element11, element12);
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = allElements0.matches(element14, element15);
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = allElements0.matches(element17, element18);
        java.lang.String str20 = allElements0.toString();
        java.lang.String str21 = allElements0.toString();
        java.lang.String str22 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "*" + "'", str20, "*");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "*" + "'", str21, "*");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "*" + "'", str22, "*");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#*", "[^[:empty!=:nth-last-of-type(52n+1)]]");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) (byte) 10);
        int int3 = isNthLastChild2.a;
        int int4 = isNthLastChild2.b;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthLastChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":empty", ":nth-last-child(0)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:empty!=:nth-last-child(0)]" + "'", str3, "[:empty!=:nth-last-child(0)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(0)" + "'", str4, ":nth-last-child(0)");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^[[:last-of-type!=:gt(10)]$=nth-of-type]]");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([^[[:last-of-type!=:gt(10)]$=nth-of-type]])" + "'", str2, ":containsOwn([^[[:last-of-type!=:gt(10)]$=nth-of-type]])");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[nth-of-type=:nth-of-type(52n+100)]");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[nth-of-type=:nth-of-type(52n+100)]" + "'", str2, "#[nth-of-type=:nth-of-type(52n+100)]");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsOwn([:gt(0)])");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[:last-child]!=[:last-of-type!=:gt(10)]]");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":gt(32)");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(32)" + "'", str2, ":gt(32)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(32)" + "'", str3, ":gt(32)");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = indexLessThan1.matches(element5, element6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.String str4 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = ":containsOwn(.:nth-child(10))";
        java.lang.String str9 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern10 = null;
        attributeWithValueMatching2.pattern = pattern10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertNull(pattern5);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":containsOwn(.:nth-child(10))" + "'", str9, ":containsOwn(.:nth-child(10))");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:empty!=:nth-last-of-type(52n+1)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsOwnText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":gt(1)");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:gt(1))" + "'", str2, ":containsOwn(:gt(1))");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[^:lt(-1)]", "nth-of-type");
        java.lang.String str3 = attributeWithValueEnding2.key;
        attributeWithValueEnding2.key = "nth-last-of-type";
        java.lang.String str6 = attributeWithValueEnding2.key;
        attributeWithValueEnding2.key = ":lt(0)";
        java.lang.String str9 = attributeWithValueEnding2.toString();
        java.lang.String str10 = attributeWithValueEnding2.toString();
        java.lang.String str11 = attributeWithValueEnding2.key;
        java.lang.String str12 = attributeWithValueEnding2.toString();
        java.lang.String str13 = attributeWithValueEnding2.toString();
        java.lang.String str14 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^:lt(-1)]" + "'", str3, "[^:lt(-1)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[:lt(0)$=nth-of-type]" + "'", str9, "[:lt(0)$=nth-of-type]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[:lt(0)$=nth-of-type]" + "'", str10, "[:lt(0)$=nth-of-type]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":lt(0)" + "'", str11, ":lt(0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[:lt(0)$=nth-of-type]" + "'", str12, "[:lt(0)$=nth-of-type]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[:lt(0)$=nth-of-type]" + "'", str13, "[:lt(0)$=nth-of-type]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[:lt(0)$=nth-of-type]" + "'", str14, "[:lt(0)$=nth-of-type]");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsOwn([:containsdata(hi!)=:last-of-type])");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-last-of-type(10n+100)", pattern1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueMatching2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:first-child$=[nth-last-child!=:root]]", "[^:nth-of-type(35n+100)]");
        java.lang.Class<?> wildcardClass3 = attributeWithValueNot2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":first-child", "[nth-last-child!=:root]");
        java.lang.String str3 = attributeWithValueEnding2.value;
        java.lang.String str4 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.key = ":containsown([nth-last-child!=:root])";
        java.lang.String str7 = attributeWithValueEnding2.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueEnding2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-last-child!=:root]" + "'", str3, "[nth-last-child!=:root]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:first-child$=[nth-last-child!=:root]]" + "'", str4, "[:first-child$=[nth-last-child!=:root]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:containsown([nth-last-child!=:root])$=[nth-last-child!=:root]]" + "'", str7, "[:containsown([nth-last-child!=:root])$=[nth-last-child!=:root]]");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[:last-of-type!=[^:containsown([nth-last-child!=:root])]]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsData(nth-of-type)");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[nth-last-child!=[:last-child]]*=[[^:lt(-1)]$=nth-of-type]]", ".[^:nth-last-child(-1n+100)]");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":eq(97)", pattern1);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsData(nth-of-type)", "[:eq(100)*=:containsdata(hi!)]");
        attributeWithValueContaining2.value = "[:containsown(nth-of-type)$=:nth-child(97n)]";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueContaining2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("#[[:first-child$=hi!]*=[hi!=nth-of-type]]", "[:containsData(:nth-last-child(52n+10))]");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsData(:root)");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":containsOwn(:lt(100))");
        java.lang.String str2 = containsOwnText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsOwnText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:containsown(:lt(100)))" + "'", str2, ":containsOwn(:containsown(:lt(100)))");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(35, 32);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:containsown([nth-last-child!=:root])*=#[^:first-of-type]]");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":root");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = containsOwnText1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:root)" + "'", str2, ":containsOwn(:root)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(:root)" + "'", str3, ":containsOwn(:root)");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:last-child]", "*");
        attributeWithValue2.key = "[.[[:matches(null)]!=:contains(:eq(10))]]";
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:containsData(hi!)=]");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-child", "nth-child");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        java.lang.String str5 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-child*=nth-child]" + "'", str3, "[nth-child*=nth-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-child*=nth-child]" + "'", str4, "[nth-child*=nth-child]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, (int) (byte) 10);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-of-type", "nth-last-child");
        attributeWithValue2.value = ":last-of-type";
        java.lang.String str5 = attributeWithValue2.toString();
        java.lang.String str6 = attributeWithValue2.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValue2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-of-type=:last-of-type]" + "'", str5, "[nth-of-type=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-of-type=:last-of-type]" + "'", str6, "[nth-of-type=:last-of-type]");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":matches(null)", ":lt(-1)");
        attributeWithValueNot2.value = ":lt(0)";
        attributeWithValueNot2.key = "[:gt(10)=nth-last-child]";
        attributeWithValueNot2.value = "[:last-child]";
        java.lang.String str9 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeWithValueNot2.matches(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[:gt(10)=nth-last-child]!=[:last-child]]" + "'", str9, "[[:gt(10)=nth-last-child]!=[:last-child]]");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (short) 10);
        indexEquals1.index = '4';
        java.lang.String str4 = indexEquals1.toString();
        indexEquals1.index = (short) 100;
        java.lang.String str7 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(52)" + "'", str4, ":eq(52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":eq(100)" + "'", str7, ":eq(100)");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(0);
        indexLessThan1.index = 0;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = indexLessThan1.matches(element4, element5);
        int int7 = indexLessThan1.index;
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = indexLessThan1.matches(element8, element9);
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = indexLessThan1.matches(element11, element12);
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = indexLessThan1.matches(element14, element15);
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = indexLessThan1.matches(element17, element18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":gt(-1)", ":only-of-type");
        java.lang.String str3 = attributeWithValueEnding2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(-1)" + "'", str3, ":gt(-1)");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[[:last-of-type!=:gt(10)]$=nth-of-type]");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = containsData1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData([[:last-of-type!=:gt(10)]$=nth-of-type])" + "'", str2, ":containsData([[:last-of-type!=:gt(10)]$=nth-of-type])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData([[:last-of-type!=:gt(10)]$=nth-of-type])" + "'", str3, ":containsData([[:last-of-type!=:gt(10)]$=nth-of-type])");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) 'a');
        java.lang.String str3 = isNthLastChild2.toString();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthLastChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(97)" + "'", str3, ":nth-last-child(97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(97, 0);
        int int3 = isNthChild2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) ' ', (int) (byte) 10);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        java.lang.String str6 = isNthOfType2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-of-type(32n+10)" + "'", str6, ":nth-of-type(32n+10)");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]", ":nth-child(35n+1)");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]$=:nth-child(35n+1)]" + "'", str3, "[[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]$=:nth-child(35n+1)]");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) ' ', (int) (byte) 100);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        java.lang.String str6 = isNthChild2.getPseudoClass();
        java.lang.String str7 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = isNthChild2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-child" + "'", str7, "nth-child");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":root", pattern1);
        attributeWithValueMatching2.key = ":lt(-1)";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        attributeWithValueMatching2.key = ":containsOwn(:root)";
        java.lang.String str9 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern10 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeWithValueMatching2.matches(element11, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":containsOwn(:root)" + "'", str9, ":containsOwn(:root)");
        org.junit.Assert.assertNull(pattern10);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-last-child", ":root");
        java.lang.String str3 = attributeWithValueNot2.toString();
        attributeWithValueNot2.value = "[:last-child]";
        java.lang.String str6 = attributeWithValueNot2.toString();
        attributeWithValueNot2.key = ":eq(10)";
        attributeWithValueNot2.key = "[:lt(-1)!=nth-child]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-last-child!=:root]" + "'", str3, "[nth-last-child!=:root]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[nth-last-child!=[:last-child]]" + "'", str6, "[nth-last-child!=[:last-child]]");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:containsData(hi!)=:last-of-type]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("#[:last-of-type!=:gt(10)]");
        java.lang.String str2 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(#[:last-of-type!=:gt(10)])" + "'", str2, ":contains(#[:last-of-type!=:gt(10)])");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":eq(52)", ":nth-last-of-type(100n+100)");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValue2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:containsown([nth-last-child!=:root])*=#[^:first-of-type]]");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[#[:first-child$=hi!]^=:only-child]", "[!=:gt(0)]");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 0, 52);
        int int3 = isNthLastOfType2.a;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:containsData(hi!)]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.String str4 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern5 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsdata(hi!)]" + "'", str3, "[:containsdata(hi!)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:containsdata(hi!)]" + "'", str4, "[:containsdata(hi!)]");
        org.junit.Assert.assertNull(pattern5);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.String str4 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = attributeWithValueMatching2.pattern;
        java.lang.String str8 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern9 = null;
        attributeWithValueMatching2.pattern = pattern9;
        attributeWithValueMatching2.key = "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]";
        java.util.regex.Pattern pattern13 = null;
        attributeWithValueMatching2.pattern = pattern13;
        java.util.regex.Pattern pattern15 = null;
        attributeWithValueMatching2.pattern = pattern15;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-child" + "'", str8, "nth-child");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) -1, 1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((-1), 100);
        int int3 = isNthChild2.a;
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#[[:matches(null)]^=:nth-last-child(-1n+100)]", ":containsData(:empty)");
        java.lang.String str3 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsdata(:empty)" + "'", str3, ":containsdata(:empty)");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsData(:last-child)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[^=:contains(:eq(10))]", ".:contains(.:matchesown(null))");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[^=:contains(:eq(10))]*=.:contains(.:matchesown(null))]" + "'", str3, "[[^=:contains(:eq(10))]*=.:contains(.:matchesown(null))]");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:last-of-type!=:gt(10)]");
        java.lang.String str2 = id1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = id1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:last-of-type!=:gt(10)]" + "'", str2, "#[:last-of-type!=:gt(10)]");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 10, 10);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":empty", ":nth-last-of-type(52n+1)");
        attributeWithValueNot2.key = "";
        java.lang.String str5 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-of-type(52n+1)" + "'", str5, ":nth-last-of-type(52n+1)");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[:matches(null)]", ":nth-last-child(-1n+100)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueStarting2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:matches(null)]^=:nth-last-child(-1n+100)]" + "'", str3, "[[:matches(null)]^=:nth-last-child(-1n+100)]");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":lt(100)");
        java.lang.String str2 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:lt(100))" + "'", str2, ":contains(:lt(100))");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:last-of-type!=:gt(10)]!=:nth-last-child(52n+10)]", "[:empty!=:nth-last-of-type(52n+1)]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueNot2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#.:matchesOwn(null)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#.:matchesown(null)" + "'", str3, "#.:matchesown(null)");
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
        int int4 = isLastOfType0.b;
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[nth-of-type=:matchesown(null)]^=[:lt(0)$=nth-of-type]]");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-of-type", "nth-last-child");
        attributeWithValue2.value = ":last-of-type";
        java.lang.String str5 = attributeWithValue2.toString();
        attributeWithValue2.key = "[^[[^:lt(-1)]$=:gt(97)]]";
        java.lang.String str8 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-of-type=:last-of-type]" + "'", str5, "[nth-of-type=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[^[[^:lt(-1)]$=:gt(97)]]=:last-of-type]" + "'", str8, "[[^[[^:lt(-1)]$=:gt(97)]]=:last-of-type]");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[:last-child]!=#.:matchesown(null)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tagEndsWith1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, 52);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[:lt(0)$=nth-of-type]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        attributeWithValueMatching2.key = "hi!";
        attributeWithValueMatching2.key = ":containsOwn(:nth-last-of-type(10n+100))";
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsData(nth-of-type)", ":containsOwn(:containsown([nth-last-child!=:root]))");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":containsOwn(nth-of-type)", ":nth-child(97n)");
        attributeWithValueEnding2.key = ":lt(0)";
        java.lang.String str5 = attributeWithValueEnding2.toString();
        java.lang.String str6 = attributeWithValueEnding2.key;
        java.lang.String str7 = attributeWithValueEnding2.key;
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueEnding2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:lt(0)$=:nth-child(97n)]" + "'", str5, "[:lt(0)$=:nth-child(97n)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(0)" + "'", str6, ":lt(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":lt(0)" + "'", str7, ":lt(0)");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        int int2 = isFirstOfType0.b;
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.String str4 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.lang.String str7 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-child" + "'", str7, "nth-child");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isFirstOfType0.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[:matches(null)*=[:matchesown(null)^=nth-of-type]]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[nth-of-type=:matchesOwn(null)]");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tag1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[nth-of-type=:matchesOwn(null)]" + "'", str2, "[nth-of-type=:matchesOwn(null)]");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) ' ', (int) ' ');
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsOwn([nth-child*=nth-child])", "#[^hi!]");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsData(:nth-last-child(0))", pattern1);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 0, (int) '4');
        int int3 = isNthLastOfType2.b;
        java.lang.String str4 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#.[^[:lt(100)=:root]]", pattern1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":containsOwn([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        java.lang.String str4 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])" + "'", str2, ":containsOwn([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])" + "'", str3, ":containsOwn([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])" + "'", str4, ":containsOwn([[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]])");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        attributeWithValueMatching2.key = ":last-child";
        attributeWithValueMatching2.key = ":last-of-type";
        attributeWithValueMatching2.key = "[^:lt(0)]";
        attributeWithValueMatching2.key = ":nth-child(32n+100)";
        java.util.regex.Pattern pattern13 = null;
        attributeWithValueMatching2.pattern = pattern13;
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attributeWithValueMatching2.matches(element15, element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) ' ');
        indexGreaterThan1.index = (short) 1;
        java.lang.String str4 = indexGreaterThan1.toString();
        int int5 = indexGreaterThan1.index;
        indexGreaterThan1.index = '#';
        indexGreaterThan1.index = (-1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(1)" + "'", str4, ":gt(1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(0);
        int int2 = indexEquals1.index;
        int int3 = indexEquals1.index;
        int int4 = indexEquals1.index;
        java.lang.String str5 = indexEquals1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":eq(0)" + "'", str5, ":eq(0)");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        java.lang.String str2 = allElements0.toString();
        java.lang.String str3 = allElements0.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        java.lang.String str7 = allElements0.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = allElements0.matches(element8, element9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "*" + "'", str2, "*");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "*" + "'", str3, "*");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":containsOwn([[:first-child$=hi!]!=:contains([:first-child$=hi!])])", ":containsOwn(:root)");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":contains(#[hi!])");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        java.lang.String str4 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:contains(#[hi!])" + "'", str2, ".:contains(#[hi!])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".:contains(#[hi!])" + "'", str3, ".:contains(#[hi!])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".:contains(#[hi!])" + "'", str4, ".:contains(#[hi!])");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) 'a', (int) (short) 0);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.toString();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        java.lang.String str6 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-child(97n)" + "'", str4, ":nth-child(97n)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-child" + "'", str6, "nth-child");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsOwn(:lt(100))", ":containsData(:last-child)");
        java.lang.String str3 = attributeWithValueStarting2.value;
        java.lang.String str4 = attributeWithValueStarting2.toString();
        java.lang.String str5 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsdata(:last-child)" + "'", str3, ":containsdata(:last-child)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:containsown(:lt(100))^=:containsdata(:last-child)]" + "'", str4, "[:containsown(:lt(100))^=:containsdata(:last-child)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:containsown(:lt(100))^=:containsdata(:last-child)]" + "'", str5, "[:containsown(:lt(100))^=:containsdata(:last-child)]");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        attributeWithValueMatching2.key = "hi!";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-of-type(97)", "[[^=:contains(:eq(10))]^=nth-last-of-type]");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type=nth-last-child]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueMatching2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[^:lt(-1)]$=nth-of-type]", "[#:nth-child(10)^=[nth-last-child!=:root]]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueContaining2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsOwn(..:matchesown(null))");
        java.lang.String str2 = containsText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:containsown(..:matchesown(null)))" + "'", str2, ":contains(:containsown(..:matchesown(null)))");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-of-type(52n)", ":nth-last-child(97)");
        java.lang.String str3 = attributeWithValueNot2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-of-type(52n)" + "'", str3, ":nth-of-type(52n)");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(1);
        java.lang.String str2 = indexEquals1.toString();
        indexEquals1.index = 'a';
        int int5 = indexEquals1.index;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = indexEquals1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(1)" + "'", str2, ":eq(1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[:lt(0)$=nth-of-type]=:nth-of-type(32n+10)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[nth-of-type=:last-of-type]^=:only-child]", ":eq(10)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[[nth-of-type=:last-of-type]^=:only-child]^=:eq(10)]" + "'", str3, "[[[nth-of-type=:last-of-type]^=:only-child]^=:eq(10)]");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        java.lang.String str2 = isFirstChild0.toString();
        java.lang.String str3 = isFirstChild0.toString();
        java.lang.String str4 = isFirstChild0.toString();
        java.lang.String str5 = isFirstChild0.toString();
        java.lang.String str6 = isFirstChild0.toString();
        java.lang.String str7 = isFirstChild0.toString();
        java.lang.String str8 = isFirstChild0.toString();
        java.lang.String str9 = isFirstChild0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = isFirstChild0.matches(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-child" + "'", str2, ":first-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-child" + "'", str3, ":first-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-child" + "'", str4, ":first-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-child" + "'", str5, ":first-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-child" + "'", str6, ":first-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-child" + "'", str7, ":first-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-child" + "'", str8, ":first-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-child" + "'", str9, ":first-child");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.getPseudoClass();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isFirstOfType0.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-of-type" + "'", str2, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]");
        java.lang.String str2 = id1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = id1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]" + "'", str2, "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[nth-of-type=nth-last-child]", "[nth-last-child!=[:last-child]]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.value = "[[:last-child]=*]";
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueStarting2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]]" + "'", str3, "[[nth-of-type=nth-last-child]^=[nth-last-child!=[:last-child]]]");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":containsData([[:gt(10)=nth-last-child]*=[nth-last-child!=:root]])");
        java.lang.String str2 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#:containsData([[:gt(10)=nth-last-child]*=[nth-last-child!=:root]])" + "'", str2, "#:containsData([[:gt(10)=nth-last-child]*=[nth-last-child!=:root]])");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":contains([:containsdata(hi!)])", "[[nth-of-type=:last-of-type]=:last-of-type]");
        attributeWithValueStarting2.key = ":nth-child(97n)";
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[nth-last-child*=[:eq(10)*=[^:lt(-1)]]]");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 0);
        indexGreaterThan1.index = 32;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = indexGreaterThan1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsData([^:nth-last-of-type(52n+1)])", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsdata([^:nth-last-of-type(52n+1)])" + "'", str3, ":containsdata([^:nth-last-of-type(52n+1)])");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":gt(32)", ":containsData()");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValue2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:first-child$=hi!]");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        java.lang.String str4 = id1.toString();
        java.lang.String str5 = id1.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = id1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:first-child$=hi!]" + "'", str2, "#[:first-child$=hi!]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[:first-child$=hi!]" + "'", str3, "#[:first-child$=hi!]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#[:first-child$=hi!]" + "'", str4, "#[:first-child$=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#[:first-child$=hi!]" + "'", str5, "#[:first-child$=hi!]");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[nth-last-child*=[:eq(10)*=[^:lt(-1)]]]", "[:first-of-type^=#[hi!]]");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        java.lang.String str7 = allElements0.toString();
        java.lang.String str8 = allElements0.toString();
        java.lang.String str9 = allElements0.toString();
        java.lang.String str10 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:matches(null)!=:lt(0)]");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(10, (int) ' ');
        int int3 = isNthLastOfType2.a;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 10, (int) (short) 100);
        int int3 = isNthChild2.b;
        java.lang.String str4 = isNthChild2.getPseudoClass();
        int int5 = isNthChild2.b;
        java.lang.String str6 = isNthChild2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":nth-child(10n+100)" + "'", str6, ":nth-child(10n+100)");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) ' ');
        indexGreaterThan1.index = (short) 1;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = indexGreaterThan1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-child(10)", pattern1);
        java.lang.Class<?> wildcardClass3 = attributeWithValueMatching2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(10, (int) (byte) -1);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthChild2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(0, 100);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-of-type(32n+10)", "#:nth-of-type(32n-1)");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":containsData(:containsdata(:last-child))", ":containsData([[:last-of-type!=:gt(10)]$=nth-of-type])");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":nth-child(35n+1)");
        java.lang.String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":nth-child(35n+1)" + "'", str2, ":nth-child(35n+1)");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[:contains(.:matchesown(null))$=:first-of-type]*=[:eq(10)*=[^:lt(-1)]]]", ":containsOwn(:containsown([:gt(0)]))");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = allElements0.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = allElements0.matches(element5, element6);
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = allElements0.matches(element8, element9);
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = allElements0.matches(element11, element12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsOwn([[:contains(.:matchesown(null))$=:first-of-type]*=[:eq(10)*=[^:lt(-1)]]])");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tag1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([[:contains(.:matchesown(null))$=:first-of-type]*=[:eq(10)*=[^:lt(-1)]]])" + "'", str2, ":containsOwn([[:contains(.:matchesown(null))$=:first-of-type]*=[:eq(10)*=[^:lt(-1)]]])");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]]");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]])" + "'", str2, ":contains([:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains([:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]])" + "'", str3, ":contains([:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]])");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) -1);
        java.lang.String str2 = indexLessThan1.toString();
        java.lang.String str3 = indexLessThan1.toString();
        indexLessThan1.index = (short) 100;
        java.lang.String str6 = indexLessThan1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = indexLessThan1.matches(element10, element11);
        indexLessThan1.index = (byte) 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(-1)" + "'", str2, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(100)" + "'", str6, ":lt(100)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsOwn(:containsown([:gt(0)]))");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:containsOwn(:containsown([:gt(0)]))]" + "'", str2, "[:containsOwn(:containsown([:gt(0)]))]");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isFirstOfType0.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[:lt(0)$=nth-of-type]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        attributeWithValueMatching2.key = "hi!";
        java.lang.String str10 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeWithValueMatching2.matches(element11, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((-1), (int) (byte) 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        int int5 = isNthLastChild2.b;
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = isNthLastChild2.calculatePosition(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) -1, (int) (byte) 10);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isNthChild2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 10);
        java.lang.String str2 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 100;
        java.lang.String str5 = indexGreaterThan1.toString();
        int int6 = indexGreaterThan1.index;
        java.lang.String str7 = indexGreaterThan1.toString();
        java.lang.String str8 = indexGreaterThan1.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = indexGreaterThan1.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(10)" + "'", str2, ":gt(10)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(100)" + "'", str5, ":gt(100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":gt(100)" + "'", str7, ":gt(100)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":gt(100)" + "'", str8, ":gt(100)");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.toString();
        int int5 = isFirstOfType0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":containsData([:containsdata(hi!)=:last-of-type])", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsdata([:containsdata(hi!)=:last-of-type])" + "'", str3, ":containsdata([:containsdata(hi!)=:last-of-type])");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":nth-child(97n)");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:nth-child(97n))" + "'", str2, ":containsOwn(:nth-child(97n))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(:nth-child(97n))" + "'", str3, ":containsOwn(:nth-child(97n))");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":empty", ":nth-last-of-type(52n+1)");
        attributeWithValueNot2.key = "";
        java.lang.String str5 = attributeWithValueNot2.toString();
        attributeWithValueNot2.value = "[#.:matchesOwn(null)]";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[!=:nth-last-of-type(52n+1)]" + "'", str5, "[!=:nth-last-of-type(52n+1)]");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) '4', 52);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 0, 100);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 10, (int) (byte) -1);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":lt(100)", ":root");
        java.lang.String str3 = attributeWithValue2.toString();
        java.lang.String str4 = attributeWithValue2.value;
        attributeWithValue2.value = ":contains([:first-child$=hi!])";
        java.lang.String str7 = attributeWithValue2.toString();
        java.lang.String str8 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:lt(100)=:root]" + "'", str3, "[:lt(100)=:root]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:lt(100)=:contains([:first-child$=hi!])]" + "'", str7, "[:lt(100)=:contains([:first-child$=hi!])]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[:lt(100)=:contains([:first-child$=hi!])]" + "'", str8, "[:lt(100)=:contains([:first-child$=hi!])]");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[^:lt(-1)]", ":lt(-1)");
        java.lang.String str3 = attributeWithValueNot2.value;
        attributeWithValueNot2.key = ":nth-of-type(100n-1)";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":lt(-1)" + "'", str3, ":lt(-1)");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":first-child", "hi!");
        java.lang.String str3 = attributeWithValueEnding2.value;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueEnding2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = allElements0.matches(element7, element8);
        java.lang.String str10 = allElements0.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = allElements0.matches(element11, element12);
        java.lang.String str14 = allElements0.toString();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = allElements0.matches(element15, element16);
        java.lang.String str18 = allElements0.toString();
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.nodes.Element element20 = null;
        boolean boolean21 = allElements0.matches(element19, element20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "*" + "'", str14, "*");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "*" + "'", str18, "*");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":matchesOwn(null)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matchesown(null)" + "'", str3, ":matchesown(null)");
        org.junit.Assert.assertNull(pattern4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":matchesown(null)" + "'", str5, ":matchesown(null)");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsOwn([nth-last-child!=:root])", "#[^:first-of-type]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueContaining2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(97, (int) (short) 10);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 10, (int) 'a');
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[^:first-of-type]", ":containsOwn(:root)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        java.lang.String str5 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[^:first-of-type]^=:containsown(:root)]" + "'", str3, "[[^:first-of-type]^=:containsown(:root)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[^:first-of-type]^=:containsown(:root)]" + "'", str4, "[[^:first-of-type]^=:containsown(:root)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[^:first-of-type]" + "'", str5, "[^:first-of-type]");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 100, (int) (short) 0);
        int int3 = isNthLastOfType2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":eq(0)", "[nth-of-type=:matchesown(null)]");
        java.lang.String str3 = attributeWithValue2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[nth-of-type=:matchesown(null)]" + "'", str3, "[nth-of-type=:matchesown(null)]");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":last-of-type");
        java.lang.String str2 = tagEndsWith1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tagEndsWith1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-of-type", "nth-last-child");
        attributeWithValue2.value = ":last-of-type";
        attributeWithValue2.key = ":containsData(hi!)";
        attributeWithValue2.value = ":gt(0)";
        attributeWithValue2.value = ":matches(null)";
        java.lang.String str11 = attributeWithValue2.value;
        java.lang.String str12 = attributeWithValue2.key;
        java.lang.String str13 = attributeWithValue2.toString();
        java.lang.String str14 = attributeWithValue2.toString();
        java.lang.String str15 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":matches(null)" + "'", str11, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":containsData(hi!)" + "'", str12, ":containsData(hi!)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[:containsData(hi!)=:matches(null)]" + "'", str13, "[:containsData(hi!)=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[:containsData(hi!)=:matches(null)]" + "'", str14, "[:containsData(hi!)=:matches(null)]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[:containsData(hi!)=:matches(null)]" + "'", str15, "[:containsData(hi!)=:matches(null)]");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[[^[:nth-last-of-type(52n+1)$=:containsdata(:last-child)]]]");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[[^:first-of-type]^=:containsown(:root)]", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        java.lang.String str7 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:eq(10)^=:nth-child(35n+1)]");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = class1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:eq(10)^=:nth-child(35n+1)]" + "'", str2, ".[:eq(10)^=:nth-child(35n+1)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".[:eq(10)^=:nth-child(35n+1)]" + "'", str3, ".[:eq(10)^=:nth-child(35n+1)]");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-of-type", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":containsOwn(.:nth-child(10))";
        attributeWithValueMatching2.key = ":contains([[^:first-of-type]])";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":containsOwn(:root)", ":lt(32)");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsown(:root)*=:lt(32)]" + "'", str3, "[:containsown(:root)*=:lt(32)]");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:containsdata(hi!)]", "[..:matchesOwn(null)]");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":containsOwn([:gt(0)])");
        java.lang.String str2 = containsOwnText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsOwnText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:containsown([:gt(0)]))" + "'", str2, ":containsOwn(:containsown([:gt(0)]))");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("..:matchesown(null)");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[..:matchesown(null)]" + "'", str2, "[..:matchesown(null)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[..:matchesown(null)]" + "'", str3, "[..:matchesown(null)]");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsData(hi!)", "[hi!]");
        attributeWithValueStarting2.value = "";
        attributeWithValueStarting2.key = "nth-last-of-type";
        java.lang.String str7 = attributeWithValueStarting2.key;
        attributeWithValueStarting2.key = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":last-child");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:last-child]" + "'", str2, "[:last-child]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-child]" + "'", str3, "[:last-child]");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 1, 0);
        int int3 = isNthChild2.b;
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthChild2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#:nth-of-type(32n-1)", ":contains(:containsdata([:containsdata(hi!)=:gt(0)]))");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(10, (int) (byte) 0);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":contains(:containsown(:gt(97)))");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        java.lang.String str4 = attribute1.toString();
        java.lang.String str5 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[:contains(:containsown(:gt(97)))]" + "'", str2, "[:contains(:containsown(:gt(97)))]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(:containsown(:gt(97)))]" + "'", str3, "[:contains(:containsown(:gt(97)))]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:contains(:containsown(:gt(97)))]" + "'", str4, "[:contains(:containsown(:gt(97)))]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[:contains(:containsown(:gt(97)))]" + "'", str5, "[:contains(:containsown(:gt(97)))]");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[nth-last-of-type^=]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":nth-last-of-type(52n+1)", "[^:matches(null)]");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueNot2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-last-of-type(52n+1)!=[^:matches(null)]]" + "'", str3, "[:nth-last-of-type(52n+1)!=[^:matches(null)]]");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 0);
        java.lang.String str3 = isNthLastChild2.toString();
        int int4 = isNthLastChild2.a;
        java.lang.String str5 = isNthLastChild2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthLastChild2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(0)" + "'", str3, ":nth-last-child(0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-last-child(0)" + "'", str5, ":nth-last-child(0)");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(52, (int) (short) 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.toString();
        int int5 = isNthLastChild2.a;
        int int6 = isNthLastChild2.a;
        int int7 = isNthLastChild2.a;
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = isNthLastChild2.calculatePosition(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-last-child(52n+10)" + "'", str4, ":nth-last-child(52n+10)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) ' ', (int) (byte) 10);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":nth-of-type(32n+10)" + "'", str4, ":nth-of-type(32n+10)");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":contains(.:matchesown(null))", ":first-of-type");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = "[:matchesown(null)^=nth-of-type]";
        java.lang.String str7 = attributeWithValueEnding2.value;
        java.lang.String str8 = attributeWithValueEnding2.toString();
        attributeWithValueEnding2.value = ":containsData(:containsdata([nth-of-type=:matchesown(null)]))";
        java.lang.String str11 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:contains(.:matchesown(null))$=:first-of-type]" + "'", str3, "[:contains(.:matchesown(null))$=:first-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:contains(.:matchesown(null))$=:first-of-type]" + "'", str4, "[:contains(.:matchesown(null))$=:first-of-type]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:matchesown(null)^=nth-of-type]" + "'", str7, "[:matchesown(null)^=nth-of-type]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[:contains(.:matchesown(null))$=[:matchesown(null)^=nth-of-type]]" + "'", str8, "[:contains(.:matchesown(null))$=[:matchesown(null)^=nth-of-type]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[:contains(.:matchesown(null))$=:containsData(:containsdata([nth-of-type=:matchesown(null)]))]" + "'", str11, "[:contains(.:matchesown(null))$=:containsData(:containsdata([nth-of-type=:matchesown(null)]))]");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(35, 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = null;
        attributeWithValueMatching2.pattern = pattern4;
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = ":nth-of-type(32n+10)";
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[:root!=[nth-of-type=nth-last-child]]^=:gt(97)]");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        int int4 = isFirstOfType0.a;
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(0);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 97;
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = indexGreaterThan1.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(0)" + "'", str3, ":gt(0)");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) '#', (int) (short) 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.a;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = isNthLastChild2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, 32);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[#.:matchesown(null)$=[:lt(100)=:root]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[[:last-child]=[:lt(0)$=nth-of-type]]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":matchesOwn(null)", "nth-of-type");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueStarting2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matchesown(null)^=nth-of-type]" + "'", str3, "[:matchesown(null)^=nth-of-type]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:matchesown(null)^=nth-of-type]" + "'", str4, "[:matchesown(null)^=nth-of-type]");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) ' ', (int) (byte) 10);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        int int5 = isNthOfType2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-last-child(52n+10)", ".[hi!]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueContaining2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) '#', (int) (short) 100);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        java.lang.String str5 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthOfType2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsOwn()");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tag1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn()" + "'", str2, ":containsOwn()");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[[^:lt(-1)]*=[^:nth-of-type(35n+100)]]", ":nth-last-of-type(97n-1)");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = allElements0.matches(element7, element8);
        java.lang.String str10 = allElements0.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = allElements0.matches(element11, element12);
        java.lang.String str14 = allElements0.toString();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        boolean boolean17 = allElements0.matches(element15, element16);
        org.jsoup.nodes.Element element18 = null;
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = allElements0.matches(element18, element19);
        org.jsoup.nodes.Element element21 = null;
        org.jsoup.nodes.Element element22 = null;
        boolean boolean23 = allElements0.matches(element21, element22);
        org.jsoup.nodes.Element element24 = null;
        org.jsoup.nodes.Element element25 = null;
        boolean boolean26 = allElements0.matches(element24, element25);
        java.lang.String str27 = allElements0.toString();
        org.jsoup.nodes.Element element28 = null;
        org.jsoup.nodes.Element element29 = null;
        boolean boolean30 = allElements0.matches(element28, element29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "*" + "'", str14, "*");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "*" + "'", str27, "*");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":empty");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:first-child$=hi!]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([:first-child$=hi!])" + "'", str2, ":containsOwn([:first-child$=hi!])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([:first-child$=hi!])" + "'", str3, ":containsOwn([:first-child$=hi!])");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) -1, 0);
        int int3 = isNthChild2.b;
        java.lang.String str4 = isNthChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        int int2 = isLastOfType0.b;
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        int int5 = isLastOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]])" + "'", str2, ":containsOwn(#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]])");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#[[:matches(null)]^=:nth-last-child(-1n+100)]", ":containsData(:empty)");
        java.lang.Class<?> wildcardClass3 = attributeWithValueContaining2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        int int4 = isLastOfType0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsData([:containsdata(hi!)=:gt(0)])");
        java.lang.String str2 = containsText1.toString();
        java.lang.String str3 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:containsdata([:containsdata(hi!)=:gt(0)]))" + "'", str2, ":contains(:containsdata([:containsdata(hi!)=:gt(0)]))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(:containsdata([:containsdata(hi!)=:gt(0)]))" + "'", str3, ":contains(:containsdata([:containsdata(hi!)=:gt(0)]))");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        int int5 = isLastOfType0.b;
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.getPseudoClass();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isFirstOfType0.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-of-type" + "'", str2, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = isFirstOfType0.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(0, (int) (short) -1);
        java.lang.String str3 = isNthLastOfType2.getPseudoClass();
        int int4 = isNthLastOfType2.b;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 10);
        int int2 = indexGreaterThan1.index;
        java.lang.String str3 = indexGreaterThan1.toString();
        java.lang.String str4 = indexGreaterThan1.toString();
        indexGreaterThan1.index = 'a';
        indexGreaterThan1.index = 10;
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = indexGreaterThan1.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(10)" + "'", str3, ":gt(10)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":gt(10)" + "'", str4, ":gt(10)");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":contains([:first-child$=hi!])");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tag1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        java.util.regex.Pattern pattern7 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        java.util.regex.Pattern pattern10 = attributeWithValueMatching2.pattern;
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeWithValueMatching2.matches(element11, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertNull(pattern10);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:nth-child(97n)!=[:matchesown(null)^=nth-of-type]]", "[^:lt(-1)]");
        java.lang.String str3 = attributeWithValueNot2.key;
        java.lang.String str4 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(97n)!=[:matchesown(null)^=nth-of-type]]" + "'", str3, "[:nth-child(97n)!=[:matchesown(null)^=nth-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:nth-child(97n)!=[:matchesown(null)^=nth-of-type]]!=[^:lt(-1)]]" + "'", str4, "[[:nth-child(97n)!=[:matchesown(null)^=nth-of-type]]!=[^:lt(-1)]]");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:nth-child(10)^=[]]");
        java.lang.String str2 = containsText1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = containsText1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([:nth-child(10)^=[]])" + "'", str2, ":contains([:nth-child(10)^=[]])");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[:last-of-type!=:gt(10)]", ":eq(-1)");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueEnding2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:contains(:eq(10))!=:nth-of-type(32n+10)]");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 100, (int) (byte) 0);
        int int3 = isNthLastChild2.a;
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthLastChild2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#:first-of-type");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = class1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("");
        java.lang.String str2 = attribute1.toString();
        java.lang.String str3 = attribute1.toString();
        java.lang.String str4 = attribute1.toString();
        java.lang.String str5 = attribute1.toString();
        java.lang.String str6 = attribute1.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attribute1.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[^:matchesown(null)]", "#[hi!]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueStarting2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[[^:lt(-1)]$=nth-of-type]", "[#:nth-child(10)^=[nth-last-child!=:root]]");
        java.lang.String str3 = attributeWithValueContaining2.value;
        java.lang.String str4 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#:nth-child(10)^=[nth-last-child!=:root]]" + "'", str3, "[#:nth-child(10)^=[nth-last-child!=:root]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[[^:lt(-1)]$=nth-of-type]*=[#:nth-child(10)^=[nth-last-child!=:root]]]" + "'", str4, "[[[^:lt(-1)]$=nth-of-type]*=[#:nth-child(10)^=[nth-last-child!=:root]]]");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type=nth-last-child]";
        attributeWithValueMatching2.key = "[:contains(.:matchesown(null))$=[:matchesown(null)^=nth-of-type]]";
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueMatching2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        indexLessThan1.index = (-1);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = indexLessThan1.matches(element10, element11);
        java.lang.String str13 = indexLessThan1.toString();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = indexLessThan1.matches(element14, element15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":lt(-1)" + "'", str13, ":lt(-1)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.getPseudoClass();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.getPseudoClass();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.toString();
        int int8 = isFirstOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-of-type" + "'", str2, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-of-type" + "'", str5, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:containsData(hi!)]", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.String str4 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueMatching2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:containsdata(hi!)]" + "'", str3, "[:containsdata(hi!)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:containsdata(hi!)]" + "'", str4, "[:containsdata(hi!)]");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 100, (int) 'a');
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(".[[:last-child]!=#.:matchesown(null)]", "#.[^[:lt(100)=:root]]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[.[[:last-child]!=#.:matchesown(null)]^=#.[^[:lt(100)=:root]]]" + "'", str3, "[.[[:last-child]!=#.:matchesown(null)]^=#.[^[:lt(100)=:root]]]");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":matches(null)", "[:matchesown(null)^=nth-of-type]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueContaining2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:matches(null)*=[:matchesown(null)^=nth-of-type]]" + "'", str3, "[:matches(null)*=[:matchesown(null)^=nth-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:matches(null)*=[:matchesown(null)^=nth-of-type]]" + "'", str4, "[:matches(null)*=[:matchesown(null)^=nth-of-type]]");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (byte) 100);
        java.lang.String str2 = indexGreaterThan1.toString();
        java.lang.String str3 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(100)" + "'", str2, ":gt(100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gt(100)" + "'", str3, ":gt(100)");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(".[[:matches(null)]!=:contains(:eq(10))]", "[:lt(-1)*=[:gt(10)=nth-last-child]]");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = allElements0.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = allElements0.matches(element10, element11);
        java.lang.String str13 = allElements0.toString();
        java.lang.String str14 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "*" + "'", str13, "*");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "*" + "'", str14, "*");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(".:contains(.:matchesown(null))");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:contains(.:matchesown(null))" + "'", str2, ".:contains(.:matchesown(null))");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) ' ', (int) (byte) 1);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":nth-last-of-type(35n+10)");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("nth-child", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":containsOwn(:gt(1))");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":nth-child(35n+1)");
        java.lang.String str2 = containsData1.toString();
        java.lang.String str3 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:nth-child(35n+1))" + "'", str2, ":containsData(:nth-child(35n+1))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsData(:nth-child(35n+1))" + "'", str3, ":containsData(:nth-child(35n+1))");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(".[[:matches(null)]!=:contains(:eq(10))]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[^:contains(:eq(10))]");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, (int) (byte) 10);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.getPseudoClass();
        int int6 = isNthChild2.a;
        java.lang.String str7 = isNthChild2.getPseudoClass();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = isNthChild2.calculatePosition(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-child" + "'", str7, "nth-child");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[:gt(10)=nth-last-child]");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:gt(10)=nth-last-child]", "[nth-last-child!=:root]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        java.lang.String str4 = attributeWithValueContaining2.value;
        java.lang.String str5 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:gt(10)=nth-last-child]*=[nth-last-child!=:root]]" + "'", str3, "[[:gt(10)=nth-last-child]*=[nth-last-child!=:root]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-last-child!=:root]" + "'", str4, "[nth-last-child!=:root]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:gt(10)=nth-last-child]*=[nth-last-child!=:root]]" + "'", str5, "[[:gt(10)=nth-last-child]*=[nth-last-child!=:root]]");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(0)", ":only-of-type");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueNot2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, (int) ' ');
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("nth-last-of-type", "nth-of-type");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueEnding2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("#[:containsData(hi!)=:last-of-type]", "[[^[:lt(100)=:root]]!=:gt(97)]");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[^:lt(-1)]", "nth-of-type");
        java.lang.String str3 = attributeWithValueEnding2.key;
        attributeWithValueEnding2.key = "nth-last-of-type";
        java.lang.String str6 = attributeWithValueEnding2.key;
        attributeWithValueEnding2.key = ":lt(0)";
        attributeWithValueEnding2.key = "[:last-of-type!=:gt(10)]";
        java.lang.String str11 = attributeWithValueEnding2.toString();
        java.lang.String str12 = attributeWithValueEnding2.key;
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeWithValueEnding2.matches(element13, element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^:lt(-1)]" + "'", str3, "[^:lt(-1)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[:last-of-type!=:gt(10)]$=nth-of-type]" + "'", str11, "[[:last-of-type!=:gt(10)]$=nth-of-type]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[:last-of-type!=:gt(10)]" + "'", str12, "[:last-of-type!=:gt(10)]");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) ' ', (int) (byte) 10);
        int int3 = isNthOfType2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) 'a');
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        int int4 = isNthLastChild2.a;
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = isNthLastChild2.calculatePosition(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.String str4 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[[:last-child]!=#.:matchesown(null)]";
        java.lang.String str7 = attributeWithValueMatching2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[:last-child]!=#.:matchesown(null)]" + "'", str7, "[[:last-child]!=#.:matchesown(null)]");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":contains([[:first-child$=[nth-last-child!=:root]]!=[^:nth-of-type(35n+100)]])");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#:containsData([[:gt(10)=nth-last-child]*=[nth-last-child!=:root]])");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type=nth-last-child]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        attributeWithValueMatching2.key = "[[nth-of-type=nth-last-child]]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan(97);
        indexGreaterThan1.index = 52;
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(35, (int) (byte) 0);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-of-type(32n+10)", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern4 = null;
        attributeWithValueMatching2.pattern = pattern4;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = allElements0.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = allElements0.matches(element10, element11);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        boolean boolean15 = allElements0.matches(element13, element14);
        java.lang.String str16 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "*" + "'", str16, "*");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:matches(null)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attributeStarting1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-last-of-type(52n-1)", "[:first-child$=[nth-last-child!=:root]]");
        attributeWithValueContaining2.value = ".:matchesOwn(null)";
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsData(hi!)", "[hi!]");
        attributeWithValueStarting2.value = "";
        attributeWithValueStarting2.key = "nth-last-of-type";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        java.lang.String str8 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueStarting2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[nth-last-of-type^=]" + "'", str7, "[nth-last-of-type^=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[nth-last-of-type^=]" + "'", str8, "[nth-last-of-type^=]");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":containsOwn([:lt(100)=:root])");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":lt(-1)");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = isRoot0.matches(element2, element3);
        java.lang.String str5 = isRoot0.toString();
        java.lang.String str6 = isRoot0.toString();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = isRoot0.matches(element7, element8);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = isRoot0.matches(element10, element11);
        java.lang.String str13 = isRoot0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":root" + "'", str5, ":root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":root" + "'", str6, ":root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":root" + "'", str13, ":root");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) 0);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        indexLessThan1.index = (-1);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = indexLessThan1.matches(element7, element8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsOwn([:lt(100)=:root])");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:containsown([:lt(100)=:root])]" + "'", str2, "[^:containsown([:lt(100)=:root])]");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[:lt(0)$=nth-of-type]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        attributeWithValueMatching2.key = "hi!";
        java.lang.String str10 = attributeWithValueMatching2.key;
        java.lang.String str11 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = ":containsOwn(nth-of-type)";
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, 100);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthLastChild2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":lt(-1)");
        java.lang.String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(-1)" + "'", str2, ":lt(-1)");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.toString();
        int int5 = isFirstOfType0.b;
        java.lang.String str6 = isFirstOfType0.toString();
        java.lang.String str7 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-of-type" + "'", str7, ":first-of-type");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[^:eq(35)]", "[nth-child*=nth-child]");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":eq(35)");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:eq(35)" + "'", str2, ".:eq(35)");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        java.lang.String str7 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#[:lt(0)$=nth-of-type]");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":eq(52)", ":contains(:last-child)");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:eq(52)^=:contains(:last-child)]" + "'", str3, "[:eq(52)^=:contains(:last-child)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":eq(52)" + "'", str4, ":eq(52)");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.toString();
        int int7 = isFirstOfType0.b;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[:last-of-type!=:gt(10)]!=:nth-last-child(52n+10)]", "[:empty!=:nth-last-of-type(52n+1)]");
        java.lang.String str3 = attributeWithValueNot2.value;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:empty!=:nth-last-of-type(52n+1)]" + "'", str3, "[:empty!=:nth-last-of-type(52n+1)]");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) (byte) 10);
        int int3 = isNthLastChild2.a;
        int int4 = isNthLastChild2.b;
        java.lang.String str5 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-child" + "'", str5, "nth-last-child");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:gt(97)=..:matchesown(null)]", "[[:last-child]*=hi!]");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]", "[[^hi!]$=[nth-last-child!=:root]]");
        attributeWithValueEnding2.value = "[:contains(:nth-child(35n+1))^=[]]";
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":containsData(:contains(:lt(10)))", "[:eq(10)*=nth-of-type]");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueNot2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[hi!*=nth-of-type]", "[[nth-of-type=:last-of-type]=:last-of-type]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        java.lang.String str4 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[hi!*=nth-of-type]^=[[nth-of-type=:last-of-type]=:last-of-type]]" + "'", str3, "[[hi!*=nth-of-type]^=[[nth-of-type=:last-of-type]=:last-of-type]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[hi!*=nth-of-type]^=[[nth-of-type=:last-of-type]=:last-of-type]]" + "'", str4, "[[hi!*=nth-of-type]^=[[nth-of-type=:last-of-type]=:last-of-type]]");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[[nth-of-type=:last-of-type]^=:only-child]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsData1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, (-1));
        int int3 = isNthOfType2.a;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'a', 0);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#[[[nth-of-type=:last-of-type]^=:only-child]]", pattern1);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[:first-child$=:nth-child(10n+1)]");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:containsData(hi!)]", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        java.lang.String str4 = attributeWithValueMatching2.key;
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueMatching2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pattern3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:containsdata(hi!)]" + "'", str4, "[:containsdata(hi!)]");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":contains(:lt(10))", ":contains(.:matchesown(null))");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:gt(10)=nth-last-child]");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = class1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:gt(10)=nth-last-child]" + "'", str2, ".[:gt(10)=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".[:gt(10)=nth-last-child]" + "'", str3, ".[:gt(10)=nth-last-child]");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        int int6 = isLastOfType0.b;
        java.lang.String str7 = isLastOfType0.toString();
        java.lang.String str8 = isLastOfType0.toString();
        int int9 = isLastOfType0.a;
        java.lang.String str10 = isLastOfType0.toString();
        java.lang.String str11 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":last-of-type" + "'", str10, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":last-of-type" + "'", str11, ":last-of-type");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(0);
        indexLessThan1.index = 0;
        indexLessThan1.index = (byte) 100;
        indexLessThan1.index = 10;
        java.lang.String str8 = indexLessThan1.toString();
        java.lang.String str9 = indexLessThan1.toString();
        java.lang.String str10 = indexLessThan1.toString();
        java.lang.String str11 = indexLessThan1.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(10)" + "'", str8, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(10)" + "'", str9, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":lt(10)" + "'", str10, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":lt(10)" + "'", str11, ":lt(10)");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type=nth-last-child]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern9 = null;
        attributeWithValueMatching2.pattern = pattern9;
        java.util.regex.Pattern pattern11 = null;
        attributeWithValueMatching2.pattern = pattern11;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        java.lang.String str7 = allElements0.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = allElements0.matches(element8, element9);
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = allElements0.matches(element11, element12);
        java.lang.String str14 = allElements0.toString();
        java.lang.String str15 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "*" + "'", str14, "*");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "*" + "'", str15, "*");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = indexLessThan1.matches(element2, element3);
        java.lang.String str5 = indexLessThan1.toString();
        java.lang.String str6 = indexLessThan1.toString();
        indexLessThan1.index = '#';
        java.lang.String str9 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":lt(10)" + "'", str5, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(10)" + "'", str6, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(35)" + "'", str9, ":lt(35)");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[^[:nth-last-of-type(52n+1)$=:containsdata(:last-child)]]]");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:containsData(hi!)=:last-of-type]");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = id1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:containsData(hi!)=:last-of-type]" + "'", str2, "#[:containsData(hi!)=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[:containsData(hi!)=:last-of-type]" + "'", str3, "#[:containsData(hi!)=:last-of-type]");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[^:lt(-1)]", "nth-of-type");
        java.lang.String str3 = attributeWithValueEnding2.key;
        attributeWithValueEnding2.key = "nth-last-of-type";
        java.lang.String str6 = attributeWithValueEnding2.key;
        attributeWithValueEnding2.key = ":lt(0)";
        attributeWithValueEnding2.key = "[:last-of-type!=:gt(10)]";
        attributeWithValueEnding2.key = ":lt(52)";
        java.lang.String str13 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[^:lt(-1)]" + "'", str3, "[^:lt(-1)]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[:lt(52)$=nth-of-type]" + "'", str13, "[:lt(52)$=nth-of-type]");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-of-type(52n+100)", ":gt(-1)");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(0);
        indexLessThan1.index = 0;
        indexLessThan1.index = (byte) 100;
        indexLessThan1.index = 10;
        java.lang.String str8 = indexLessThan1.toString();
        java.lang.String str9 = indexLessThan1.toString();
        java.lang.String str10 = indexLessThan1.toString();
        int int11 = indexLessThan1.index;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":lt(10)" + "'", str8, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":lt(10)" + "'", str9, ":lt(10)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":lt(10)" + "'", str10, ":lt(10)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:gt(10)=nth-last-child]", "#[[[nth-of-type=:last-of-type]^=:only-child]]");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("nth-child");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type=nth-last-child]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.util.regex.Pattern pattern8 = attributeWithValueMatching2.pattern;
        java.util.regex.Pattern pattern9 = null;
        attributeWithValueMatching2.pattern = pattern9;
        attributeWithValueMatching2.key = "[nth-of-type=:nth-of-type(52n+100)]";
        java.util.regex.Pattern pattern13 = null;
        attributeWithValueMatching2.pattern = pattern13;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":gt(-1)", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("", ":containsData(:containsdata(:last-child))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) -1, 0);
        int int3 = isNthChild2.b;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthChild2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-child", "nth-child");
        attributeWithValueContaining2.value = ":nth-last-child(52n+10)";
        attributeWithValueContaining2.key = "[[^:lt(-1)]$=nth-of-type]";
        attributeWithValueContaining2.key = "#[:containsData(hi!)=:last-of-type]";
        attributeWithValueContaining2.value = ":eq(1)";
        java.lang.String str11 = attributeWithValueContaining2.value;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":eq(1)" + "'", str11, ":eq(1)");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[^[^:nth-of-type(35n+100)]]*=:nth-last-of-type(52)]");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[[nth-of-type=:last-of-type]=:last-of-type]");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:matchesown(null)$=[nth-of-type=:matchesown(null)]]", pattern1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueMatching2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.toString();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.toString();
        java.lang.String str5 = isFirstOfType0.toString();
        java.lang.String str6 = isFirstOfType0.getPseudoClass();
        java.lang.String str7 = isFirstOfType0.getPseudoClass();
        java.lang.String str8 = isFirstOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-of-type" + "'", str7, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-of-type" + "'", str8, "nth-of-type");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[:containsData(hi!)=:matches(null)]");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = isRoot0.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = isRoot0.matches(element5, element6);
        java.lang.String str8 = isRoot0.toString();
        java.lang.String str9 = isRoot0.toString();
        java.lang.String str10 = isRoot0.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = isRoot0.matches(element11, element12);
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        boolean boolean16 = isRoot0.matches(element14, element15);
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        boolean boolean19 = isRoot0.matches(element17, element18);
        java.lang.String str20 = isRoot0.toString();
        java.lang.String str21 = isRoot0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":root" + "'", str9, ":root");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":root" + "'", str10, ":root");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":root" + "'", str20, ":root");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":root" + "'", str21, ":root");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[:nth-last-of-type(52n+1)$=:containsData(:last-child)]";
        attributeWithValueMatching2.key = "[[:matches(null)]*=:gt(97)]";
        java.lang.String str8 = attributeWithValueMatching2.key;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[:matches(null)]*=:gt(97)]" + "'", str8, "[[:matches(null)]*=:gt(97)]");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        java.lang.String str7 = isLastOfType0.getPseudoClass();
        java.lang.String str8 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":last-of-type" + "'", str8, ":last-of-type");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(10, 52);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("..:matchesown(null)");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 100, (int) (byte) 100);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isNthOfType2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[[[:last-of-type!=:gt(10)]$=nth-of-type]=nth-last-child]");
        java.lang.String str2 = tagEndsWith1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tagEndsWith1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[[:last-of-type!=:gt(10)]$=nth-of-type]=nth-last-child]" + "'", str2, "[[[:last-of-type!=:gt(10)]$=nth-of-type]=nth-last-child]");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-of-type", "nth-last-child");
        attributeWithValue2.value = ":last-of-type";
        java.lang.String str5 = attributeWithValue2.toString();
        attributeWithValue2.value = "nth-last-of-type";
        java.lang.String str8 = attributeWithValue2.toString();
        java.lang.String str9 = attributeWithValue2.toString();
        java.lang.String str10 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-of-type=:last-of-type]" + "'", str5, "[nth-of-type=:last-of-type]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[nth-of-type=nth-last-of-type]" + "'", str8, "[nth-of-type=nth-last-of-type]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[nth-of-type=nth-last-of-type]" + "'", str9, "[nth-of-type=nth-last-of-type]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[nth-of-type=nth-last-of-type]" + "'", str10, "[nth-of-type=nth-last-of-type]");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsData([[:gt(10)=nth-last-child]*=[nth-last-child!=:root]])", "[:lt(0)$=:nth-child(97n)]");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":matchesown(null)", ":empty");
        java.lang.String str3 = attributeWithValue2.key;
        attributeWithValue2.value = ":contains([:containsdata(hi!)])";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matchesown(null)" + "'", str3, ":matchesown(null)");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type=nth-last-child]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        java.lang.String str10 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern11 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[[[:last-child]=*]*=:containsown([nth-last-child!=:root])]";
        java.util.regex.Pattern pattern14 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[nth-of-type=nth-last-child]" + "'", str10, "[nth-of-type=nth-last-child]");
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertNull(pattern14);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        java.lang.String str1 = isRoot0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        boolean boolean4 = isRoot0.matches(element2, element3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = isRoot0.matches(element5, element6);
        java.lang.String str8 = isRoot0.toString();
        java.lang.String str9 = isRoot0.toString();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        boolean boolean12 = isRoot0.matches(element10, element11);
        java.lang.String str13 = isRoot0.toString();
        java.lang.String str14 = isRoot0.toString();
        java.lang.String str15 = isRoot0.toString();
        java.lang.String str16 = isRoot0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":root" + "'", str1, ":root");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":root" + "'", str8, ":root");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":root" + "'", str9, ":root");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":root" + "'", str13, ":root");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":root" + "'", str14, ":root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":root" + "'", str15, ":root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":root" + "'", str16, ":root");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":containsOwn([nth-child^=:nth-last-of-type(52n+1)])");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsOwnText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsData(:lt(-1))");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^:containsdata(:lt(-1))]" + "'", str2, "[^:containsdata(:lt(-1))]");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 100, 52);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":contains(#[hi!])");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tagEndsWith1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:containsown(:containsown([nth-last-child!=:root]))$=[#[hi!]]]");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:only-of-type]", pattern1);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[nth-of-type=nth-last-of-type]");
        java.lang.String str2 = attribute1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[nth-of-type=nth-last-of-type]]" + "'", str2, "[[nth-of-type=nth-last-of-type]]");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:containsData(hi!)=:gt(0)]");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        int int4 = isFirstOfType0.a;
        int int5 = isFirstOfType0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[#:nth-child(10)^=[nth-last-child!=:root]]", "[nth-child^=:nth-last-of-type(52n+1)]");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (byte) 0, (int) (short) 1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":nth-child(32n+100)");
        java.lang.String str2 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:nth-child(32n+100))" + "'", str2, ":contains(:nth-child(32n+100))");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[..:matchesown(null)!=:gt(0)]");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) -1);
        indexEquals1.index = 32;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = indexEquals1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":containsOwn(:root)");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(:containsown(:root))" + "'", str2, ":containsOwn(:containsown(:root))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(:containsown(:root))" + "'", str3, ":containsOwn(:containsown(:root))");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:last-child]", "#.:matchesOwn(null)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.toString();
        java.lang.String str5 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueNot2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:last-child]!=#.:matchesown(null)]" + "'", str3, "[[:last-child]!=#.:matchesown(null)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[[:last-child]!=#.:matchesown(null)]" + "'", str4, "[[:last-child]!=#.:matchesown(null)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[:last-child]!=#.:matchesown(null)]" + "'", str5, "[[:last-child]!=#.:matchesown(null)]");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":nth-child(10)", ".:matchesOwn(null)");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.key = "[:containsData(hi!)=]";
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeWithValueContaining2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(10)*=.:matchesown(null)]" + "'", str3, "[:nth-child(10)*=.:matchesown(null)]");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":contains(:nth-child(35n+1))");
        java.lang.String str2 = containsData1.toString();
        java.lang.Class<?> wildcardClass3 = containsData1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData(:contains(:nth-child(35n+1)))" + "'", str2, ":containsData(:contains(:nth-child(35n+1)))");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.jsoup.select.Evaluator.IsEmpty isEmpty0 = new org.jsoup.select.Evaluator.IsEmpty();
        java.lang.String str1 = isEmpty0.toString();
        java.lang.String str2 = isEmpty0.toString();
        java.lang.String str3 = isEmpty0.toString();
        java.lang.String str4 = isEmpty0.toString();
        java.lang.String str5 = isEmpty0.toString();
        java.lang.String str6 = isEmpty0.toString();
        java.lang.String str7 = isEmpty0.toString();
        java.lang.String str8 = isEmpty0.toString();
        java.lang.String str9 = isEmpty0.toString();
        java.lang.String str10 = isEmpty0.toString();
        java.lang.String str11 = isEmpty0.toString();
        java.lang.String str12 = isEmpty0.toString();
        java.lang.String str13 = isEmpty0.toString();
        java.lang.String str14 = isEmpty0.toString();
        java.lang.String str15 = isEmpty0.toString();
        java.lang.String str16 = isEmpty0.toString();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = isEmpty0.matches(element17, element18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":empty" + "'", str1, ":empty");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":empty" + "'", str2, ":empty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":empty" + "'", str3, ":empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":empty" + "'", str4, ":empty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":empty" + "'", str5, ":empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":empty" + "'", str6, ":empty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":empty" + "'", str7, ":empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":empty" + "'", str8, ":empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":empty" + "'", str9, ":empty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":empty" + "'", str10, ":empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":empty" + "'", str11, ":empty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":empty" + "'", str12, ":empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":empty" + "'", str13, ":empty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":empty" + "'", str14, ":empty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":empty" + "'", str15, ":empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":empty" + "'", str16, ":empty");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse(":nth-last-of-type(97n-1)");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("nth-of-type", "nth-of-type");
        attributeWithValueContaining2.key = "hi!";
        attributeWithValueContaining2.key = ":eq(10)";
        attributeWithValueContaining2.value = "[hi!^=[^:nth-last-child(-1n+100)]]";
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) -1);
        java.lang.String str2 = indexEquals1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = indexEquals1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(-1)" + "'", str2, ":eq(-1)");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[[^:first-of-type]^=:containsown(:root)]", "[[^hi!]$=[nth-last-child!=:root]]");
        java.lang.Class<?> wildcardClass3 = attributeWithValueNot2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":containsData(:nth-last-child(97))");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tagEndsWith1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(0, 97);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.toString();
        int int4 = isFirstOfType0.a;
        java.lang.String str5 = isFirstOfType0.toString();
        int int6 = isFirstOfType0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-of-type" + "'", str5, ":first-of-type");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 0);
        indexLessThan1.index = 32;
        indexLessThan1.index = 97;
        java.lang.String str6 = indexLessThan1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":lt(97)" + "'", str6, ":lt(97)");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.Matches matches1 = new org.jsoup.select.Evaluator.Matches(pattern0);
        java.lang.String str2 = matches1.toString();
        java.lang.String str3 = matches1.toString();
        java.lang.String str4 = matches1.toString();
        java.lang.String str5 = matches1.toString();
        java.lang.String str6 = matches1.toString();
        java.lang.String str7 = matches1.toString();
        java.lang.String str8 = matches1.toString();
        java.lang.String str9 = matches1.toString();
        java.lang.String str10 = matches1.toString();
        java.lang.String str11 = matches1.toString();
        java.lang.String str12 = matches1.toString();
        java.lang.String str13 = matches1.toString();
        java.lang.String str14 = matches1.toString();
        java.lang.String str15 = matches1.toString();
        java.lang.String str16 = matches1.toString();
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = matches1.matches(element17, element18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matches(null)" + "'", str2, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":matches(null)" + "'", str4, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":matches(null)" + "'", str5, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":matches(null)" + "'", str6, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":matches(null)" + "'", str7, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":matches(null)" + "'", str8, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":matches(null)" + "'", str9, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":matches(null)" + "'", str10, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":matches(null)" + "'", str11, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":matches(null)" + "'", str12, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":matches(null)" + "'", str13, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":matches(null)" + "'", str14, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":matches(null)" + "'", str15, ":matches(null)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":matches(null)" + "'", str16, ":matches(null)");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.lang.String str4 = attributeWithValueMatching2.key;
        java.lang.String str5 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern6 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-child" + "'", str5, "nth-child");
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("nth-last-of-type");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-last-of-type" + "'", str2, "nth-last-of-type");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#.:matchesOwn(null)");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".#.:matchesOwn(null)" + "'", str2, ".#.:matchesOwn(null)");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(":containsOwn()", "[:containsData(hi!)=:gt(0)]");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":nth-child(10)", "[]");
        java.lang.String str3 = attributeWithValueStarting2.toString();
        attributeWithValueStarting2.key = ":contains(:nth-child(35n+1))";
        java.lang.String str6 = attributeWithValueStarting2.value;
        java.lang.String str7 = attributeWithValueStarting2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(10)^=[]]" + "'", str3, "[:nth-child(10)^=[]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[:contains(:nth-child(35n+1))^=[]]" + "'", str7, "[:contains(:nth-child(35n+1))^=[]]");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'a');
        indexGreaterThan1.index = (short) 10;
        indexGreaterThan1.index = 0;
        int int6 = indexGreaterThan1.index;
        indexGreaterThan1.index = (short) -1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = isRoot0.matches(element1, element2);
        java.lang.String str4 = isRoot0.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        boolean boolean7 = isRoot0.matches(element5, element6);
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        boolean boolean10 = isRoot0.matches(element8, element9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":root" + "'", str4, ":root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild(0, 32);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("[:contains(:containsown(:gt(97)))]", pattern1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeWithValueMatching2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText(":containsOwn(nth-last-child)");
        java.lang.String str2 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(:containsown(nth-last-child))" + "'", str2, ":contains(:containsown(nth-last-child))");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":containsData(:nth-last-child(52n+10))");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue(".:containsOwn(:gt(97))", "[:eq(10)*=nth-of-type]");
        attributeWithValue2.key = "[:lt(-1)!=nth-child]";
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        int int3 = isLastOfType0.a;
        int int4 = isLastOfType0.b;
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.getPseudoClass();
        java.lang.String str7 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-of-type" + "'", str6, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":last-of-type" + "'", str7, ":last-of-type");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[..:matchesown(null)*=..:matchesown(null)]");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":contains(#:nth-child(10))", pattern1);
        java.util.regex.Pattern pattern3 = attributeWithValueMatching2.pattern;
        org.junit.Assert.assertNull(pattern3);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[:matchesown(null)^=nth-of-type]");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^[:matchesown(null)^=nth-of-type]]" + "'", str2, "[^[:matchesown(null)^=nth-of-type]]");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[#[hi!]]", ":containsData(:last-child)");
        attributeWithValueStarting2.key = "";
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValueStarting2.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[^:containsdata(:lt(-1))]");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("#[^:first-of-type]");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":contains([:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]])");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = class1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[^:eq(35)]", ":contains(:containsown(nth-last-child))");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#[:containsData(hi!)=:last-of-type]");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText(":matchesOwn(null)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsOwnText1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute(":contains(#[:last-of-type!=:gt(10)])");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) 'a', 97);
        int int3 = isNthOfType2.b;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = isNthOfType2.calculatePosition(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":containsOwn([^[[:last-of-type!=:gt(10)]$=nth-of-type]])");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("nth-last-child");
        java.lang.String str2 = attributeStarting1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[^nth-last-child]" + "'", str2, "[^nth-last-child]");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[^hi!]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = id1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(1, 100);
        int int3 = isNthOfType2.b;
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = isNthOfType2.calculatePosition(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:contains(.:matchesown(null))$=:first-of-type]", "[:eq(10)*=[^:lt(-1)]]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.value = "[[^:lt(-1)]$=:gt(97)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:contains(.:matchesown(null))$=:first-of-type]*=[:eq(10)*=[^:lt(-1)]]]" + "'", str3, "[[:contains(.:matchesown(null))$=:first-of-type]*=[:eq(10)*=[^:lt(-1)]]]");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#.:matchesOwn(null)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = class1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) ' ', (int) (byte) 10);
        java.lang.String str3 = isNthOfType2.getPseudoClass();
        java.lang.String str4 = isNthOfType2.getPseudoClass();
        int int5 = isNthOfType2.b;
        java.lang.String str6 = isNthOfType2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-of-type" + "'", str6, "nth-of-type");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("[[:root!=[nth-of-type=nth-last-child]]^=:gt(97)]");
        java.lang.String str2 = tag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[:root!=[nth-of-type=nth-last-child]]^=:gt(97)]" + "'", str2, "[[:root!=[nth-of-type=nth-last-child]]^=:gt(97)]");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.toString();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.getPseudoClass();
        int int5 = isFirstOfType0.b;
        java.lang.String str6 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-of-type" + "'", str4, "nth-of-type");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-of-type" + "'", str6, ":first-of-type");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 1, (int) '#');
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:eq(10)^=:nth-child(35n+1)]");
        java.lang.String str2 = class1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = class1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:eq(10)^=:nth-child(35n+1)]" + "'", str2, ".[:eq(10)^=:nth-child(35n+1)]");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[hi!]");
        java.lang.String str2 = tagEndsWith1.toString();
        java.lang.String str3 = tagEndsWith1.toString();
        java.lang.String str4 = tagEndsWith1.toString();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tagEndsWith1.matches(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[hi!]" + "'", str2, "[hi!]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[hi!]" + "'", str3, "[hi!]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!]" + "'", str4, "[hi!]");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting(":gt(0)");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        java.lang.String str2 = isFirstChild0.toString();
        java.lang.String str3 = isFirstChild0.toString();
        java.lang.String str4 = isFirstChild0.toString();
        java.lang.String str5 = isFirstChild0.toString();
        java.lang.String str6 = isFirstChild0.toString();
        java.lang.String str7 = isFirstChild0.toString();
        java.lang.String str8 = isFirstChild0.toString();
        java.lang.String str9 = isFirstChild0.toString();
        java.lang.String str10 = isFirstChild0.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = isFirstChild0.matches(element11, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-child" + "'", str2, ":first-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-child" + "'", str3, ":first-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-child" + "'", str4, ":first-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":first-child" + "'", str5, ":first-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":first-child" + "'", str6, ":first-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-child" + "'", str7, ":first-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":first-child" + "'", str8, ":first-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":first-child" + "'", str9, ":first-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":first-child" + "'", str10, ":first-child");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":matches(null)", "[:eq(1)!=:nth-last-child(0)]");
        java.lang.String str3 = attributeWithValueStarting2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matches(null)" + "'", str3, ":matches(null)");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) 0, 10);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastChild2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[^[:lt(100)=:root]]!=:gt(97)]");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (byte) -1);
        int int2 = indexLessThan1.index;
        int int3 = indexLessThan1.index;
        java.lang.String str4 = indexLessThan1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":lt(-1)" + "'", str4, ":lt(-1)");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting(":containsOwn(..:matchesown(null))", ":containsOwn(nth-of-type)");
        java.lang.String str3 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeWithValueStarting2.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsown(nth-of-type)" + "'", str3, ":containsown(nth-of-type)");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(".:contains(.:matchesown(null))");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = id1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":root", pattern1);
        attributeWithValueMatching2.key = ":lt(-1)";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        attributeWithValueMatching2.key = ":containsOwn(:root)";
        java.lang.String str9 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]";
        attributeWithValueMatching2.key = "[^[nth-last-child!=[:last-child]]]";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":containsOwn(:root)" + "'", str9, ":containsOwn(:root)");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":nth-last-of-type(52n-1)");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tag1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) '#', (int) (byte) 1);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[nth-last-child!=:root]", "[^:nth-of-type(35n+100)]");
        attributeWithValueContaining2.key = ":containsData([nth-of-type=:matchesown(null)])";
        attributeWithValueContaining2.key = "[^:lt(-1)]";
        java.lang.String str7 = attributeWithValueContaining2.toString();
        java.lang.String str8 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[^:lt(-1)]*=[^:nth-of-type(35n+100)]]" + "'", str7, "[[^:lt(-1)]*=[^:nth-of-type(35n+100)]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[^:lt(-1)]*=[^:nth-of-type(35n+100)]]" + "'", str8, "[[^:lt(-1)]*=[^:nth-of-type(35n+100)]]");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((-1), (int) (byte) 10);
        java.lang.String str3 = isNthLastChild2.getPseudoClass();
        java.lang.String str4 = isNthLastChild2.getPseudoClass();
        int int5 = isNthLastChild2.b;
        java.lang.String str6 = isNthLastChild2.getPseudoClass();
        java.lang.String str7 = isNthLastChild2.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nth-last-child" + "'", str6, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-child" + "'", str7, "nth-last-child");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.toString();
        java.lang.String str7 = isLastOfType0.getPseudoClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-child*=nth-child]");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("[nth-of-type=:matchesown(null)]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = containsData1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":contains([:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]])");
        java.lang.String str2 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".:contains([:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]])" + "'", str2, ".:contains([:gt(1)$=[:empty!=:nth-last-of-type(52n+1)]])");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[nth-last-child!=:root]", "[^:nth-of-type(35n+100)]");
        attributeWithValueContaining2.key = ":containsData([nth-of-type=:matchesown(null)])";
        attributeWithValueContaining2.key = "[:gt(-1)$=:only-of-type]";
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeWithValueContaining2.matches(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.jsoup.select.Evaluator.IsNthChild isNthChild2 = new org.jsoup.select.Evaluator.IsNthChild((int) (short) 100, 52);
        java.lang.String str3 = isNthChild2.getPseudoClass();
        java.lang.String str4 = isNthChild2.getPseudoClass();
        java.lang.String str5 = isNthChild2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-child" + "'", str3, "nth-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-child" + "'", str4, "nth-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":nth-child(100n+52)" + "'", str5, ":nth-child(100n+52)");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("#:containsData()", pattern1);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.toString();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isLastOfType0.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[nth-child*=nth-child]");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        java.lang.String str4 = id1.toString();
        java.lang.String str5 = id1.toString();
        java.lang.String str6 = id1.toString();
        java.lang.String str7 = id1.toString();
        java.lang.String str8 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[nth-child*=nth-child]" + "'", str2, "#[nth-child*=nth-child]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[nth-child*=nth-child]" + "'", str3, "#[nth-child*=nth-child]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#[nth-child*=nth-child]" + "'", str4, "#[nth-child*=nth-child]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#[nth-child*=nth-child]" + "'", str5, "#[nth-child*=nth-child]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#[nth-child*=nth-child]" + "'", str6, "#[nth-child*=nth-child]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#[nth-child*=nth-child]" + "'", str7, "#[nth-child*=nth-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#[nth-child*=nth-child]" + "'", str8, "#[nth-child*=nth-child]");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild(32, 0);
        int int3 = isNthLastChild2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("[:first-child$=[nth-last-child!=:root]]", ":containsOwn(:lt(100))");
        java.lang.String str3 = attributeWithValue2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:first-child$=[nth-last-child!=:root]]" + "'", str3, "[:first-child$=[nth-last-child!=:root]]");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Element element2 = null;
        boolean boolean3 = allElements0.matches(element1, element2);
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        boolean boolean6 = allElements0.matches(element4, element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = allElements0.matches(element7, element8);
        java.lang.String str10 = allElements0.toString();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        boolean boolean13 = allElements0.matches(element11, element12);
        java.lang.String str14 = allElements0.toString();
        java.lang.String str15 = allElements0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "*" + "'", str14, "*");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "*" + "'", str15, "*");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":nth-child(97n)", "[^:contains(:last-child)]");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:nth-child(97n)$=[^:contains(:last-child)]]" + "'", str3, "[:nth-child(97n)$=[^:contains(:last-child)]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:nth-child(97n)$=[^:contains(:last-child)]]" + "'", str4, "[:nth-child(97n)$=[^:contains(:last-child)]]");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining(":eq(10)", "[^:lt(-1)]");
        attributeWithValueContaining2.value = "[:empty!=:nth-last-of-type(52n+1)]";
        attributeWithValueContaining2.key = ":nth-child(97n)";
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals(1);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = indexEquals1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:gt(-1)$=:only-of-type]");
        java.lang.String str2 = class1.toString();
        java.lang.String str3 = class1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:gt(-1)$=:only-of-type]" + "'", str2, ".[:gt(-1)$=:only-of-type]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".[:gt(-1)$=:only-of-type]" + "'", str3, ".[:gt(-1)$=:only-of-type]");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        java.lang.String str6 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":last-of-type" + "'", str6, ":last-of-type");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("", "[[:containsown([nth-last-child!=:root])*=#[^:first-of-type]]=[nth-last-of-type$=nth-of-type]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[:lt(0)$=[^:nth-of-type(35n+100)]]");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("[[hi!*=nth-of-type]*=:containsown([:first-child$=hi!])]");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        int int4 = isLastOfType0.b;
        int int5 = isLastOfType0.a;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("[:gt(10)=nth-last-child]", "[nth-last-child!=:root]");
        java.lang.String str3 = attributeWithValueContaining2.toString();
        attributeWithValueContaining2.key = "[nth-last-child*=[:eq(10)*=[^:lt(-1)]]]";
        attributeWithValueContaining2.key = "[^:eq(35)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[[:gt(10)=nth-last-child]*=[nth-last-child!=:root]]" + "'", str3, "[[:gt(10)=nth-last-child]*=[nth-last-child!=:root]]");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[^:containsown([:lt(100)=:root])]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":containsOwn(nth-last-child)");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str1 = isFirstOfType0.getPseudoClass();
        java.lang.String str2 = isFirstOfType0.getPseudoClass();
        java.lang.String str3 = isFirstOfType0.getPseudoClass();
        java.lang.String str4 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-of-type" + "'", str1, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nth-of-type" + "'", str2, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-of-type" + "'", str3, "nth-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":first-of-type" + "'", str4, ":first-of-type");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("nth-last-child");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = containsOwnText1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(nth-last-child)" + "'", str2, ":containsOwn(nth-last-child)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(nth-last-child)" + "'", str3, ":containsOwn(nth-last-child)");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[^[^:nth-of-type(35n+100)]]");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching(":nth-child(10)", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern4 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[nth-of-type=:nth-of-type(52n+100)]";
        attributeWithValueMatching2.key = "[[:gt(97)=..:matchesown(null)]!=..:matchesown(null)]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-child(10)" + "'", str3, ":nth-child(10)");
        org.junit.Assert.assertNull(pattern4);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type=nth-last-child]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        java.lang.String str10 = attributeWithValueMatching2.key;
        java.util.regex.Pattern pattern11 = attributeWithValueMatching2.pattern;
        attributeWithValueMatching2.key = "[:containsData(hi!)=:last-of-type]";
        attributeWithValueMatching2.key = ":eq(100)";
        attributeWithValueMatching2.key = "[:eq(10)*=[^:lt(-1)]]";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[nth-of-type=nth-last-child]" + "'", str10, "[nth-of-type=nth-last-child]");
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild0 = new org.jsoup.select.Evaluator.IsOnlyChild();
        java.lang.String str1 = isOnlyChild0.toString();
        java.lang.String str2 = isOnlyChild0.toString();
        java.lang.String str3 = isOnlyChild0.toString();
        java.lang.String str4 = isOnlyChild0.toString();
        java.lang.String str5 = isOnlyChild0.toString();
        java.lang.String str6 = isOnlyChild0.toString();
        java.lang.String str7 = isOnlyChild0.toString();
        java.lang.String str8 = isOnlyChild0.toString();
        java.lang.String str9 = isOnlyChild0.toString();
        java.lang.String str10 = isOnlyChild0.toString();
        java.lang.String str11 = isOnlyChild0.toString();
        java.lang.String str12 = isOnlyChild0.toString();
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = isOnlyChild0.matches(element13, element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":only-child" + "'", str1, ":only-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":only-child" + "'", str2, ":only-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":only-child" + "'", str3, ":only-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":only-child" + "'", str4, ":only-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":only-child" + "'", str5, ":only-child");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":only-child" + "'", str6, ":only-child");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":only-child" + "'", str7, ":only-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":only-child" + "'", str8, ":only-child");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":only-child" + "'", str9, ":only-child");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":only-child" + "'", str10, ":only-child");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":only-child" + "'", str11, ":only-child");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":only-child" + "'", str12, ":only-child");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(52, (int) 'a');
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 100, 10);
        java.lang.String str3 = isNthLastChild2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":nth-last-child(100n+10)" + "'", str3, ":nth-last-child(100n+10)");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":last-of-type", ":gt(10)");
        java.lang.String str3 = attributeWithValueNot2.toString();
        java.lang.String str4 = attributeWithValueNot2.toString();
        java.lang.String str5 = attributeWithValueNot2.value;
        attributeWithValueNot2.value = "[^:containsown([nth-last-child!=:root])]";
        java.lang.String str8 = attributeWithValueNot2.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueNot2.matches(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:last-of-type!=:gt(10)]" + "'", str3, "[:last-of-type!=:gt(10)]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:last-of-type!=:gt(10)]" + "'", str4, "[:last-of-type!=:gt(10)]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(10)" + "'", str5, ":gt(10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[:last-of-type!=[^:containsown([nth-last-child!=:root])]]" + "'", str8, "[:last-of-type!=[^:containsown([nth-last-child!=:root])]]");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("[..:matchesown(null)!=:gt(0)]");
        java.lang.Class<?> wildcardClass2 = attributeStarting1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.getPseudoClass();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.getPseudoClass();
        java.lang.String str4 = isLastOfType0.getPseudoClass();
        java.lang.String str5 = isLastOfType0.getPseudoClass();
        int int6 = isLastOfType0.b;
        java.lang.String str7 = isLastOfType0.getPseudoClass();
        java.lang.String str8 = isLastOfType0.getPseudoClass();
        java.lang.String str9 = isLastOfType0.getPseudoClass();
        java.lang.String str10 = isLastOfType0.getPseudoClass();
        java.lang.String str11 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nth-last-of-type" + "'", str1, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-of-type" + "'", str3, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-of-type" + "'", str4, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nth-last-of-type" + "'", str5, "nth-last-of-type");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nth-last-of-type" + "'", str7, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-last-of-type" + "'", str8, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nth-last-of-type" + "'", str9, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nth-last-of-type" + "'", str10, "nth-last-of-type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":last-of-type" + "'", str11, ":last-of-type");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("[nth-of-type=nth-last-child]", ":contains([[:first-child$=[nth-last-child!=:root]]!=[^:nth-of-type(35n+100)]])");
        java.lang.String str3 = attributeWithValueEnding2.value;
        java.lang.String str4 = attributeWithValueEnding2.key;
        attributeWithValueEnding2.key = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains([[:first-child$=[nth-last-child!=:root]]!=[^:nth-of-type(35n+100)]])" + "'", str3, ":contains([[:first-child$=[nth-last-child!=:root]]!=[^:nth-of-type(35n+100)]])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[nth-of-type=nth-last-child]" + "'", str4, "[nth-of-type=nth-last-child]");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        java.lang.String str4 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]" + "'", str2, "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]" + "'", str3, "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]" + "'", str4, "#[[nth-last-of-type$=nth-of-type]=#[nth-child*=nth-child]]");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsown([nth-last-child!=:root])");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tag1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-of-type", pattern1);
        java.util.regex.Pattern pattern3 = null;
        attributeWithValueMatching2.pattern = pattern3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attributeWithValueMatching2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("[[^:first-of-type]^=:containsown(:root)]", ":only-child");
        attributeWithValueStarting2.key = "[nth-of-type=:last-of-type]";
        attributeWithValueStarting2.key = "#[:first-child$=hi!]";
        java.lang.String str7 = attributeWithValueStarting2.toString();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeWithValueStarting2.matches(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[#[:first-child$=hi!]^=:only-child]" + "'", str7, "[#[:first-child$=hi!]^=:only-child]");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("[#[:containsdata(hi!)=:last-of-type]^=:nth-last-of-type(52n+1)]");
        java.lang.String str2 = containsText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains([#[:containsdata(hi!)=:last-of-type]^=:nth-last-of-type(52n+1)])" + "'", str2, ":contains([#[:containsdata(hi!)=:last-of-type]^=:nth-last-of-type(52n+1)])");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[:only-of-type]");
        java.lang.String str2 = class1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = class1.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".[:only-of-type]" + "'", str2, ".[:only-of-type]");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("nth-of-type", "nth-last-child");
        java.lang.String str3 = attributeWithValue2.value;
        java.lang.String str4 = attributeWithValue2.value;
        java.lang.String str5 = attributeWithValue2.toString();
        attributeWithValue2.value = "hi!";
        java.lang.String str8 = attributeWithValue2.key;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nth-last-child" + "'", str4, "nth-last-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[nth-of-type=nth-last-child]" + "'", str5, "[nth-of-type=nth-last-child]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nth-of-type" + "'", str8, "nth-of-type");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("[nth-child^=:nth-last-of-type(52n+1)]");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn([nth-child^=:nth-last-of-type(52n+1)])" + "'", str2, ":containsOwn([nth-child^=:nth-last-of-type(52n+1)])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn([nth-child^=:nth-last-of-type(52n+1)])" + "'", str3, ":containsOwn([nth-child^=:nth-last-of-type(52n+1)])");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 1, (int) ' ');
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = isNthOfType2.matches(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(".:contains(.:matchesown(null))");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = tag1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[:last-of-type!=:gt(10)]");
        java.lang.String str2 = id1.toString();
        java.lang.String str3 = id1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#[:last-of-type!=:gt(10)]" + "'", str2, "#[:last-of-type!=:gt(10)]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#[:last-of-type!=:gt(10)]" + "'", str3, "#[:last-of-type!=:gt(10)]");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(0, (int) (short) -1);
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = isNthLastOfType2.calculatePosition(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("[:contains([:containsdata(hi!)])=.[:eq(0)$=[nth-last-child!=:root]]]", "[:containsData(hi!)=:last-of-type]");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.select.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.select.Evaluator.AttributeWithValueMatching("nth-last-child", pattern1);
        java.lang.String str3 = attributeWithValueMatching2.key;
        attributeWithValueMatching2.key = "[nth-of-type=nth-last-child]";
        java.util.regex.Pattern pattern6 = null;
        attributeWithValueMatching2.pattern = pattern6;
        java.util.regex.Pattern pattern8 = null;
        attributeWithValueMatching2.pattern = pattern8;
        java.util.regex.Pattern pattern10 = null;
        attributeWithValueMatching2.pattern = pattern10;
        java.util.regex.Pattern pattern12 = null;
        attributeWithValueMatching2.pattern = pattern12;
        attributeWithValueMatching2.key = ":lt(1)";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nth-last-child" + "'", str3, "nth-last-child");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[^:containsdata(:lt(-1))]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("[^[:empty!=:nth-last-of-type(52n+1)]]");
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = id1.matches(element2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag(":containsOwn()");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.toString();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = tag1.matches(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn()" + "'", str2, ":containsOwn()");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn()" + "'", str3, ":containsOwn()");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) 'a', 0);
        int int3 = isNthOfType2.b;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }
}

