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
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.AfterFrameset;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InFrameset;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InTableBody;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InHead;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InBody;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.Initial;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.AfterAfterFrameset;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InCaption;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.AfterAfterBody;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InSelect;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InTableText;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.Text;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InTable;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.BeforeHead;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InRow;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InColumnGroup;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InSelectInTable;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.BeforeHtml;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InCell;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.InHeadNoscript;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.AfterBody;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.AfterHead;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(treeBuilderState0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.jsoup.parser.TreeBuilderState treeBuilderState0 = org.jsoup.parser.TreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        boolean boolean3 = treeBuilderState0.process(token1, treeBuilder2);
        org.jsoup.parser.Token token4 = null;
        org.jsoup.parser.TreeBuilder treeBuilder5 = null;
        boolean boolean6 = treeBuilderState0.process(token4, treeBuilder5);
        org.jsoup.parser.Token token7 = null;
        org.jsoup.parser.TreeBuilder treeBuilder8 = null;
        boolean boolean9 = treeBuilderState0.process(token7, treeBuilder8);
        org.jsoup.parser.Token token10 = null;
        org.jsoup.parser.TreeBuilder treeBuilder11 = null;
        boolean boolean12 = treeBuilderState0.process(token10, treeBuilder11);
        org.jsoup.parser.Token token13 = null;
        org.jsoup.parser.TreeBuilder treeBuilder14 = null;
        boolean boolean15 = treeBuilderState0.process(token13, treeBuilder14);
        org.jsoup.parser.Token token16 = null;
        org.jsoup.parser.TreeBuilder treeBuilder17 = null;
        boolean boolean18 = treeBuilderState0.process(token16, treeBuilder17);
        org.jsoup.parser.Token token19 = null;
        org.jsoup.parser.TreeBuilder treeBuilder20 = null;
        boolean boolean21 = treeBuilderState0.process(token19, treeBuilder20);
        org.jsoup.parser.Token token22 = null;
        org.jsoup.parser.TreeBuilder treeBuilder23 = null;
        boolean boolean24 = treeBuilderState0.process(token22, treeBuilder23);
        org.jsoup.parser.Token token25 = null;
        org.jsoup.parser.TreeBuilder treeBuilder26 = null;
        boolean boolean27 = treeBuilderState0.process(token25, treeBuilder26);
        org.jsoup.parser.Token token28 = null;
        org.jsoup.parser.TreeBuilder treeBuilder29 = null;
        boolean boolean30 = treeBuilderState0.process(token28, treeBuilder29);
        org.jsoup.parser.Token token31 = null;
        org.jsoup.parser.TreeBuilder treeBuilder32 = null;
        boolean boolean33 = treeBuilderState0.process(token31, treeBuilder32);
        org.jsoup.parser.Token token34 = null;
        org.jsoup.parser.TreeBuilder treeBuilder35 = null;
        boolean boolean36 = treeBuilderState0.process(token34, treeBuilder35);
        org.jsoup.parser.Token token37 = null;
        org.jsoup.parser.TreeBuilder treeBuilder38 = null;
        boolean boolean39 = treeBuilderState0.process(token37, treeBuilder38);
        org.jsoup.parser.Token token40 = null;
        org.jsoup.parser.TreeBuilder treeBuilder41 = null;
        boolean boolean42 = treeBuilderState0.process(token40, treeBuilder41);
        org.jsoup.parser.Token token43 = null;
        org.jsoup.parser.TreeBuilder treeBuilder44 = null;
        boolean boolean45 = treeBuilderState0.process(token43, treeBuilder44);
        org.jsoup.parser.Token token46 = null;
        org.jsoup.parser.TreeBuilder treeBuilder47 = null;
        boolean boolean48 = treeBuilderState0.process(token46, treeBuilder47);
        org.jsoup.parser.Token token49 = null;
        org.jsoup.parser.TreeBuilder treeBuilder50 = null;
        boolean boolean51 = treeBuilderState0.process(token49, treeBuilder50);
        org.jsoup.parser.Token token52 = null;
        org.jsoup.parser.TreeBuilder treeBuilder53 = null;
        boolean boolean54 = treeBuilderState0.process(token52, treeBuilder53);
        org.jsoup.parser.Token token55 = null;
        org.jsoup.parser.TreeBuilder treeBuilder56 = null;
        boolean boolean57 = treeBuilderState0.process(token55, treeBuilder56);
        org.jsoup.parser.Token token58 = null;
        org.jsoup.parser.TreeBuilder treeBuilder59 = null;
        boolean boolean60 = treeBuilderState0.process(token58, treeBuilder59);
        org.jsoup.parser.Token token61 = null;
        org.jsoup.parser.TreeBuilder treeBuilder62 = null;
        boolean boolean63 = treeBuilderState0.process(token61, treeBuilder62);
        org.jsoup.parser.Token token64 = null;
        org.jsoup.parser.TreeBuilder treeBuilder65 = null;
        boolean boolean66 = treeBuilderState0.process(token64, treeBuilder65);
        org.jsoup.parser.Token token67 = null;
        org.jsoup.parser.TreeBuilder treeBuilder68 = null;
        boolean boolean69 = treeBuilderState0.process(token67, treeBuilder68);
        org.jsoup.parser.Token token70 = null;
        org.jsoup.parser.TreeBuilder treeBuilder71 = null;
        boolean boolean72 = treeBuilderState0.process(token70, treeBuilder71);
        org.jsoup.parser.Token token73 = null;
        org.jsoup.parser.TreeBuilder treeBuilder74 = null;
        boolean boolean75 = treeBuilderState0.process(token73, treeBuilder74);
        org.jsoup.parser.Token token76 = null;
        org.jsoup.parser.TreeBuilder treeBuilder77 = null;
        boolean boolean78 = treeBuilderState0.process(token76, treeBuilder77);
        org.jsoup.parser.Token token79 = null;
        org.jsoup.parser.TreeBuilder treeBuilder80 = null;
        boolean boolean81 = treeBuilderState0.process(token79, treeBuilder80);
        org.jsoup.parser.Token token82 = null;
        org.jsoup.parser.TreeBuilder treeBuilder83 = null;
        boolean boolean84 = treeBuilderState0.process(token82, treeBuilder83);
        org.jsoup.parser.Token token85 = null;
        org.jsoup.parser.TreeBuilder treeBuilder86 = null;
        boolean boolean87 = treeBuilderState0.process(token85, treeBuilder86);
        org.jsoup.parser.Token token88 = null;
        org.jsoup.parser.TreeBuilder treeBuilder89 = null;
        boolean boolean90 = treeBuilderState0.process(token88, treeBuilder89);
        org.jsoup.parser.Token token91 = null;
        org.jsoup.parser.TreeBuilder treeBuilder92 = null;
        boolean boolean93 = treeBuilderState0.process(token91, treeBuilder92);
        org.jsoup.parser.Token token94 = null;
        org.jsoup.parser.TreeBuilder treeBuilder95 = null;
        boolean boolean96 = treeBuilderState0.process(token94, treeBuilder95);
        org.jsoup.parser.Token token97 = null;
        org.jsoup.parser.TreeBuilder treeBuilder98 = null;
        boolean boolean99 = treeBuilderState0.process(token97, treeBuilder98);
        org.junit.Assert.assertNotNull(treeBuilderState0);
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

