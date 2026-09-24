package org.jsoup.parser;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterFrameset;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTableBody;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InHead;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InBody;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Initial;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InSelect;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHtml;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InCell;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterHead;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
        org.jsoup.parser.Token token4 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = null;
        boolean boolean6 = htmlTreeBuilderState0.process(token4, htmlTreeBuilder5);
        org.jsoup.parser.Token token7 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = null;
        boolean boolean9 = htmlTreeBuilderState0.process(token7, htmlTreeBuilder8);
        org.jsoup.parser.Token token10 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = null;
        boolean boolean12 = htmlTreeBuilderState0.process(token10, htmlTreeBuilder11);
        org.jsoup.parser.Token token13 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = null;
        boolean boolean15 = htmlTreeBuilderState0.process(token13, htmlTreeBuilder14);
        org.jsoup.parser.Token token16 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = null;
        boolean boolean18 = htmlTreeBuilderState0.process(token16, htmlTreeBuilder17);
        org.jsoup.parser.Token token19 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = null;
        boolean boolean21 = htmlTreeBuilderState0.process(token19, htmlTreeBuilder20);
        org.jsoup.parser.Token token22 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = null;
        boolean boolean24 = htmlTreeBuilderState0.process(token22, htmlTreeBuilder23);
        org.jsoup.parser.Token token25 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = null;
        boolean boolean27 = htmlTreeBuilderState0.process(token25, htmlTreeBuilder26);
        org.jsoup.parser.Token token28 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = null;
        boolean boolean30 = htmlTreeBuilderState0.process(token28, htmlTreeBuilder29);
        org.jsoup.parser.Token token31 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = null;
        boolean boolean33 = htmlTreeBuilderState0.process(token31, htmlTreeBuilder32);
        org.jsoup.parser.Token token34 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = null;
        boolean boolean36 = htmlTreeBuilderState0.process(token34, htmlTreeBuilder35);
        org.jsoup.parser.Token token37 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = null;
        boolean boolean39 = htmlTreeBuilderState0.process(token37, htmlTreeBuilder38);
        org.jsoup.parser.Token token40 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = null;
        boolean boolean42 = htmlTreeBuilderState0.process(token40, htmlTreeBuilder41);
        org.jsoup.parser.Token token43 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder44 = null;
        boolean boolean45 = htmlTreeBuilderState0.process(token43, htmlTreeBuilder44);
        org.jsoup.parser.Token token46 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder47 = null;
        boolean boolean48 = htmlTreeBuilderState0.process(token46, htmlTreeBuilder47);
        org.jsoup.parser.Token token49 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = null;
        boolean boolean51 = htmlTreeBuilderState0.process(token49, htmlTreeBuilder50);
        org.jsoup.parser.Token token52 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder53 = null;
        boolean boolean54 = htmlTreeBuilderState0.process(token52, htmlTreeBuilder53);
        org.jsoup.parser.Token token55 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder56 = null;
        boolean boolean57 = htmlTreeBuilderState0.process(token55, htmlTreeBuilder56);
        org.jsoup.parser.Token token58 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = null;
        boolean boolean60 = htmlTreeBuilderState0.process(token58, htmlTreeBuilder59);
        org.jsoup.parser.Token token61 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder62 = null;
        boolean boolean63 = htmlTreeBuilderState0.process(token61, htmlTreeBuilder62);
        org.jsoup.parser.Token token64 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder65 = null;
        boolean boolean66 = htmlTreeBuilderState0.process(token64, htmlTreeBuilder65);
        org.jsoup.parser.Token token67 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder68 = null;
        boolean boolean69 = htmlTreeBuilderState0.process(token67, htmlTreeBuilder68);
        org.jsoup.parser.Token token70 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder71 = null;
        boolean boolean72 = htmlTreeBuilderState0.process(token70, htmlTreeBuilder71);
        org.jsoup.parser.Token token73 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder74 = null;
        boolean boolean75 = htmlTreeBuilderState0.process(token73, htmlTreeBuilder74);
        org.jsoup.parser.Token token76 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder77 = null;
        boolean boolean78 = htmlTreeBuilderState0.process(token76, htmlTreeBuilder77);
        org.jsoup.parser.Token token79 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder80 = null;
        boolean boolean81 = htmlTreeBuilderState0.process(token79, htmlTreeBuilder80);
        org.jsoup.parser.Token token82 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder83 = null;
        boolean boolean84 = htmlTreeBuilderState0.process(token82, htmlTreeBuilder83);
        org.jsoup.parser.Token token85 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder86 = null;
        boolean boolean87 = htmlTreeBuilderState0.process(token85, htmlTreeBuilder86);
        org.jsoup.parser.Token token88 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder89 = null;
        boolean boolean90 = htmlTreeBuilderState0.process(token88, htmlTreeBuilder89);
        org.jsoup.parser.Token token91 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder92 = null;
        boolean boolean93 = htmlTreeBuilderState0.process(token91, htmlTreeBuilder92);
        org.jsoup.parser.Token token94 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder95 = null;
        boolean boolean96 = htmlTreeBuilderState0.process(token94, htmlTreeBuilder95);
        org.jsoup.parser.Token token97 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder98 = null;
        boolean boolean99 = htmlTreeBuilderState0.process(token97, htmlTreeBuilder98);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }
}

