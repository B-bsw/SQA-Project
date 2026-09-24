package org.jsoup.parser;

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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes67 = null;
        boolean boolean68 = xmlTreeBuilder0.processStartTag("hi!", attributes67);
        org.jsoup.nodes.Document document71 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token token72 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = xmlTreeBuilder0.process(token72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document71);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token token11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.process(token11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.nodes.Attributes attributes60 = null;
        boolean boolean61 = xmlTreeBuilder0.processStartTag("hi!", attributes60);
        org.jsoup.nodes.Attributes attributes63 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = xmlTreeBuilder0.processStartTag("", attributes63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token token13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.process(token13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder37.parseFragment("hi!", "hi!", parseErrorList40, parseSettings42);
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList36, parseSettings42);
        org.jsoup.nodes.Document document47 = xmlTreeBuilder27.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder55.parseFragment("hi!", "hi!", parseErrorList58, parseSettings59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.ParseSettings parseSettings64 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder55.parseFragment("", "hi!", parseErrorList63, parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder51.parseFragment("hi!", "hi!", parseErrorList54, parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder51.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder51.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder27.parseFragment("hi!", "", parseErrorList50, parseSettings69);
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder0.parseFragment("", "", parseErrorList26, parseSettings69);
        org.jsoup.nodes.Document document74 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes76 = null;
        boolean boolean77 = xmlTreeBuilder0.processStartTag("hi!", attributes76);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes80 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = xmlTreeBuilder0.processStartTag("", attributes80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(parseSettings78);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList22, parseSettings40);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document47 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document50 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlTreeBuilder54.parseFragment("hi!", "hi!", parseErrorList57, parseSettings58);
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder54.parseFragment("", "", parseErrorList62, parseSettings63);
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder68.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder68.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder54.parseFragment("hi!", "hi!", parseErrorList67, parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder0.parseFragment("", "", parseErrorList53, parseSettings72);
        org.jsoup.nodes.Document document76 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document79 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document83 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(document83);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings31);
        org.jsoup.nodes.Attributes attributes34 = null;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("hi!", attributes34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.Token token44 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = xmlTreeBuilder0.process(token44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document67 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        org.jsoup.parser.Token.StartTag startTag71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element72 = xmlTreeBuilder0.insert(startTag71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList61, parseSettings63);
        java.lang.Class<?> wildcardClass65 = parseSettings63.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder22.parseFragment("", "", parseErrorList30, parseSettings31);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder46.parseFragment("hi!", "hi!", parseErrorList49, parseSettings50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder46.parseFragment("", "hi!", parseErrorList54, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder42.parseFragment("hi!", "hi!", parseErrorList45, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document65 = xmlTreeBuilder62.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder42.parseFragment("", "hi!", parseErrorList61, parseSettings66);
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder22.parseFragment("", "", parseErrorList41, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder72.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder22.parseFragment("", "hi!", parseErrorList71, parseSettings73);
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder17.parseFragment("hi!", "hi!", parseErrorList21, parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder0.parseFragment("", "", parseErrorList16, parseSettings76);
        org.jsoup.nodes.Document document80 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document83 = xmlTreeBuilder0.parse("", "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(document83);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes67 = null;
        boolean boolean68 = xmlTreeBuilder0.processStartTag("hi!", attributes67);
        org.jsoup.nodes.Document document71 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document74 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag76 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element77 = xmlTreeBuilder0.insert(startTag76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(parseSettings75);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder35.parse("hi!", "hi!");
        org.jsoup.nodes.Document document41 = xmlTreeBuilder35.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList34, parseSettings42);
        org.jsoup.nodes.Attributes attributes45 = null;
        boolean boolean46 = xmlTreeBuilder0.processStartTag("hi!", attributes45);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document50 = xmlTreeBuilder0.parse(reader48, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(parseSettings47);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings39);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document47 = xmlTreeBuilder44.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder24.parseFragment("", "hi!", parseErrorList43, parseSettings48);
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder19.parseFragment("", "", parseErrorList23, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document57 = xmlTreeBuilder54.parse("hi!", "hi!");
        org.jsoup.nodes.Document document60 = xmlTreeBuilder54.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder19.parseFragment("", "hi!", parseErrorList53, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList18, parseSettings61);
        org.jsoup.parser.Token.Character character64 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder10.parseFragment("", "", parseErrorList18, parseSettings19);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder34.parseFragment("hi!", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList49, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder10.parseFragment("", "", parseErrorList29, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList9, parseSettings54);
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder65.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder61.parseFragment("hi!", "hi!", parseErrorList64, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder75.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder71.parseFragment("hi!", "hi!", parseErrorList74, parseSettings76);
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder61.parseFragment("", "hi!", parseErrorList70, parseSettings76);
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList60, parseSettings76);
        org.jsoup.parser.Token.Doctype doctype80 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(nodeList79);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.nodes.Document document51 = xmlTreeBuilder45.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList44, parseSettings52);
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList27, parseSettings52);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder65.parseFragment("hi!", "hi!", parseErrorList68, parseSettings69);
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.ParseSettings parseSettings74 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder65.parseFragment("", "hi!", parseErrorList73, parseSettings74);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder65.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder61.parseFragment("hi!", "hi!", parseErrorList64, parseSettings76);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder61.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings79 = xmlTreeBuilder61.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList60, parseSettings79);
        org.jsoup.parser.Token.Comment comment81 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(nodeList80);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList22, parseSettings40);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes46 = null;
        boolean boolean47 = xmlTreeBuilder0.processStartTag("hi!", attributes46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder51.parseFragment("hi!", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "", parseErrorList50, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass60 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder21.parseFragment("hi!", "hi!", parseErrorList24, parseSettings25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder30.parseFragment("", "", parseErrorList38, parseSettings39);
        org.jsoup.nodes.Document document43 = xmlTreeBuilder30.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder21.parseFragment("hi!", "hi!", parseErrorList29, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder49.parseFragment("hi!", "hi!", parseErrorList52, parseSettings53);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlTreeBuilder49.parseFragment("", "", parseErrorList57, parseSettings58);
        org.jsoup.nodes.Document document62 = xmlTreeBuilder49.parse("hi!", "");
        org.jsoup.nodes.Document document65 = xmlTreeBuilder49.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.ParseSettings parseSettings73 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder69.parseFragment("hi!", "hi!", parseErrorList72, parseSettings73);
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.ParseSettings parseSettings78 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder69.parseFragment("", "", parseErrorList77, parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder69.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder49.parseFragment("", "hi!", parseErrorList68, parseSettings80);
        java.util.List<org.jsoup.nodes.Node> nodeList82 = xmlTreeBuilder21.parseFragment("hi!", "", parseErrorList48, parseSettings80);
        org.jsoup.nodes.Document document85 = xmlTreeBuilder21.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings86 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList20, parseSettings86);
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document91 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token.Character character92 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(document91);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass61 = parseSettings60.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList21, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder18.parseFragment("", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder14.parseFragment("hi!", "hi!", parseErrorList17, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document37 = xmlTreeBuilder34.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList33, parseSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder9.parseFragment("", "", parseErrorList13, parseSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings38);
        org.jsoup.nodes.Attributes attributes43 = null;
        boolean boolean44 = xmlTreeBuilder0.processStartTag("hi!", attributes43);
        org.jsoup.nodes.Attributes attributes46 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = xmlTreeBuilder0.processStartTag("", attributes46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("hi!", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings13);
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes19 = null;
        boolean boolean20 = xmlTreeBuilder0.processStartTag("hi!", attributes19);
        org.jsoup.parser.Token.Comment comment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass22 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.nodes.Document document44 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder48.parseFragment("hi!", "hi!", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder48.parseFragment("", "", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList47, parseSettings59);
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList27, parseSettings59);
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document68 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes70 = null;
        boolean boolean71 = xmlTreeBuilder0.processStartTag("hi!", attributes70);
        org.jsoup.parser.Token.StartTag startTag72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element73 = xmlTreeBuilder0.insert(startTag72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList34, parseSettings36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder45.parseFragment("hi!", "hi!", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder45.parseFragment("", "hi!", parseErrorList53, parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder41.parseFragment("hi!", "hi!", parseErrorList44, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.nodes.Document document61 = xmlTreeBuilder41.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList40, parseSettings62);
        org.jsoup.nodes.Document document66 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document70 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes72 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = xmlTreeBuilder0.processStartTag("", attributes72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(document70);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings31);
        org.jsoup.nodes.Attributes attributes34 = null;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("hi!", attributes34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList22, parseSettings40);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document47 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document50 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token.StartTag startTag51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element52 = xmlTreeBuilder0.insert(startTag51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(document50);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes67 = null;
        boolean boolean68 = xmlTreeBuilder0.processStartTag("hi!", attributes67);
        org.jsoup.nodes.Document document71 = xmlTreeBuilder0.parse("hi!", "");
        java.lang.Class<?> wildcardClass72 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("hi!", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder35.parseFragment("hi!", "hi!", parseErrorList38, parseSettings39);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder35.parseFragment("", "", parseErrorList43, parseSettings44);
        org.jsoup.nodes.Document document48 = xmlTreeBuilder35.parse("hi!", "");
        org.jsoup.nodes.Document document51 = xmlTreeBuilder35.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder55.parseFragment("hi!", "hi!", parseErrorList58, parseSettings59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.ParseSettings parseSettings64 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder55.parseFragment("", "", parseErrorList63, parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder35.parseFragment("", "hi!", parseErrorList54, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder75.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder71.parseFragment("hi!", "hi!", parseErrorList74, parseSettings76);
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder35.parseFragment("hi!", "hi!", parseErrorList70, parseSettings76);
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder13.parseFragment("hi!", "", parseErrorList34, parseSettings76);
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList12, parseSettings76);
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass83 = parseSettings82.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("hi!", "hi!");
        org.jsoup.nodes.Document document39 = xmlTreeBuilder33.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder27.parseFragment("hi!", "", parseErrorList32, parseSettings40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder0.parseFragment("", "", parseErrorList26, parseSettings40);
        org.jsoup.nodes.Document document45 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes47 = null;
        boolean boolean48 = xmlTreeBuilder0.processStartTag("hi!", attributes47);
        org.jsoup.nodes.Document document51 = xmlTreeBuilder0.parse("hi!", "hi!");
        java.io.Reader reader52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document54 = xmlTreeBuilder0.parse(reader52, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(document51);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document8 = xmlTreeBuilder0.parse("", "hi!");
        java.lang.Class<?> wildcardClass9 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("hi!", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList21, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder18.parseFragment("", "", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder0.parseFragment("", "", parseErrorList17, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = xmlTreeBuilder0.processStartTag("", attributes40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character30 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings16);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token.Character character21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings14);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList21, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder18.parseFragment("", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder14.parseFragment("hi!", "hi!", parseErrorList17, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document37 = xmlTreeBuilder34.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList33, parseSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder9.parseFragment("", "", parseErrorList13, parseSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass46 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder7.parseFragment("", "", parseErrorList15, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList20, parseSettings23);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder0.parseFragment("", "", parseErrorList6, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "hi!", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder56.parseFragment("", "hi!", parseErrorList64, parseSettings65);
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder56.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder52.parseFragment("hi!", "hi!", parseErrorList55, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList51, parseSettings69);
        org.jsoup.nodes.Document document73 = xmlTreeBuilder29.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes75 = null;
        boolean boolean76 = xmlTreeBuilder29.processStartTag("hi!", attributes75);
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder80 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder84 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder84.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList86 = xmlTreeBuilder80.parseFragment("hi!", "hi!", parseErrorList83, parseSettings85);
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder29.parseFragment("", "", parseErrorList79, parseSettings85);
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList28, parseSettings88);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document95 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes97 = null;
        boolean boolean98 = xmlTreeBuilder0.processStartTag("hi!", attributes97);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(nodeList86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertNotNull(document95);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes16 = null;
        boolean boolean17 = xmlTreeBuilder0.processStartTag("hi!", attributes16);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parseSettings18);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder16.parseFragment("hi!", "hi!", parseErrorList19, parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder31.parseFragment("hi!", "hi!", parseErrorList34, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder31.parseFragment("", "hi!", parseErrorList39, parseSettings40);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder16.parseFragment("", "hi!", parseErrorList26, parseSettings46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder51.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder51.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder16.parseFragment("hi!", "", parseErrorList50, parseSettings53);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList15, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document60 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList64, parseSettings65);
        org.jsoup.nodes.Document document69 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token.Doctype doctype70 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(document69);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes20 = null;
        boolean boolean21 = xmlTreeBuilder0.processStartTag("hi!", attributes20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass24 = parseSettings23.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder11.parseFragment("hi!", "hi!", parseErrorList14, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder11.parseFragment("", "hi!", parseErrorList30, parseSettings35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder0.parseFragment("", "", parseErrorList10, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder41.parseFragment("hi!", "hi!", parseErrorList44, parseSettings46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder51.parseFragment("hi!", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder41.parseFragment("", "hi!", parseErrorList50, parseSettings56);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder41.parse("", "");
        org.jsoup.nodes.Attributes attributes63 = null;
        boolean boolean64 = xmlTreeBuilder41.processStartTag("hi!", attributes63);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder0.parseFragment("", "", parseErrorList40, parseSettings65);
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes34 = null;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("hi!", attributes34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder39.parseFragment("", "", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList52, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList38, parseSettings57);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        java.lang.Class<?> wildcardClass62 = document61.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder38.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder32.parseFragment("", "", parseErrorList37, parseSettings40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList31, parseSettings40);
        org.jsoup.nodes.Document document45 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token.Comment comment46 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document45);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("hi!", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList21, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder18.parseFragment("", "", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder0.parseFragment("", "", parseErrorList17, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder50.parseFragment("hi!", "hi!", parseErrorList53, parseSettings54);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder50.parseFragment("", "hi!", parseErrorList58, parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder46.parseFragment("hi!", "hi!", parseErrorList49, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder42.parseFragment("hi!", "hi!", parseErrorList45, parseSettings64);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder73 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.ParseSettings parseSettings77 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder73.parseFragment("hi!", "hi!", parseErrorList76, parseSettings77);
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.parser.ParseSettings parseSettings82 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder73.parseFragment("", "hi!", parseErrorList81, parseSettings82);
        org.jsoup.parser.ParseSettings parseSettings84 = xmlTreeBuilder73.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList85 = xmlTreeBuilder69.parseFragment("hi!", "hi!", parseErrorList72, parseSettings84);
        org.jsoup.parser.ParseSettings parseSettings86 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings87 = xmlTreeBuilder69.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList88 = xmlTreeBuilder42.parseFragment("hi!", "hi!", parseErrorList68, parseSettings87);
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList90 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList41, parseSettings89);
        org.jsoup.nodes.Document document93 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Character character94 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(parseSettings87);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertNotNull(parseSettings89);
        org.junit.Assert.assertNotNull(nodeList90);
        org.junit.Assert.assertNotNull(document93);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder21.parseFragment("hi!", "hi!", parseErrorList24, parseSettings25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder30.parseFragment("", "", parseErrorList38, parseSettings39);
        org.jsoup.nodes.Document document43 = xmlTreeBuilder30.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder21.parseFragment("hi!", "hi!", parseErrorList29, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder49.parseFragment("hi!", "hi!", parseErrorList52, parseSettings53);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlTreeBuilder49.parseFragment("", "", parseErrorList57, parseSettings58);
        org.jsoup.nodes.Document document62 = xmlTreeBuilder49.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document69 = xmlTreeBuilder66.parse("hi!", "hi!");
        org.jsoup.nodes.Document document72 = xmlTreeBuilder66.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder66.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder49.parseFragment("", "hi!", parseErrorList65, parseSettings73);
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder21.parseFragment("", "hi!", parseErrorList48, parseSettings73);
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder0.parseFragment("", "", parseErrorList20, parseSettings73);
        org.jsoup.nodes.Attributes attributes78 = null;
        boolean boolean79 = xmlTreeBuilder0.processStartTag("hi!", attributes78);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("hi!", "hi!");
        org.jsoup.nodes.Document document39 = xmlTreeBuilder33.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder27.parseFragment("hi!", "", parseErrorList32, parseSettings40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder0.parseFragment("", "", parseErrorList26, parseSettings40);
        org.jsoup.nodes.Document document45 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document48 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Doctype doctype49 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(document48);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder10.parseFragment("", "", parseErrorList18, parseSettings19);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder34.parseFragment("hi!", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList49, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder10.parseFragment("", "", parseErrorList29, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList9, parseSettings54);
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder65.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder61.parseFragment("hi!", "hi!", parseErrorList64, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder75.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder71.parseFragment("hi!", "hi!", parseErrorList74, parseSettings76);
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder61.parseFragment("", "hi!", parseErrorList70, parseSettings76);
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList60, parseSettings76);
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader82 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document84 = xmlTreeBuilder0.parse(reader82, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(parseSettings81);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList22, parseSettings40);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes46 = null;
        boolean boolean47 = xmlTreeBuilder0.processStartTag("hi!", attributes46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder51.parseFragment("hi!", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "", parseErrorList50, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document65 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(document65);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList22, parseSettings40);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes46 = null;
        boolean boolean47 = xmlTreeBuilder0.processStartTag("hi!", attributes46);
        org.jsoup.nodes.Attributes attributes49 = null;
        boolean boolean50 = xmlTreeBuilder0.processStartTag("hi!", attributes49);
        org.jsoup.nodes.Document document53 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes55 = null;
        boolean boolean56 = xmlTreeBuilder0.processStartTag("hi!", attributes55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character58 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(parseSettings57);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder7.parseFragment("", "", parseErrorList15, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList20, parseSettings23);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder0.parseFragment("", "", parseErrorList6, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "hi!", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder56.parseFragment("", "hi!", parseErrorList64, parseSettings65);
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder56.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder52.parseFragment("hi!", "hi!", parseErrorList55, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList51, parseSettings69);
        org.jsoup.nodes.Document document73 = xmlTreeBuilder29.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes75 = null;
        boolean boolean76 = xmlTreeBuilder29.processStartTag("hi!", attributes75);
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder80 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder84 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder84.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList86 = xmlTreeBuilder80.parseFragment("hi!", "hi!", parseErrorList83, parseSettings85);
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder29.parseFragment("", "", parseErrorList79, parseSettings85);
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList28, parseSettings88);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token.Comment comment93 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(nodeList86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(document92);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("", "");
        java.io.Reader reader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder21.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder39.parseFragment("", "hi!", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder35.parseFragment("hi!", "hi!", parseErrorList38, parseSettings50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document58 = xmlTreeBuilder55.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder35.parseFragment("", "hi!", parseErrorList54, parseSettings59);
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder30.parseFragment("", "", parseErrorList34, parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder21.parseFragment("hi!", "", parseErrorList29, parseSettings62);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader18, "", parseErrorList20, parseSettings62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder17.parseFragment("hi!", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList16, parseSettings28);
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass31 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes21 = null;
        boolean boolean22 = xmlTreeBuilder0.processStartTag("hi!", attributes21);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes27 = null;
        boolean boolean28 = xmlTreeBuilder0.processStartTag("hi!", attributes27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character30 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("hi!", "hi!");
        org.jsoup.nodes.Document document39 = xmlTreeBuilder33.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder27.parseFragment("hi!", "", parseErrorList32, parseSettings40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder0.parseFragment("", "", parseErrorList26, parseSettings40);
        org.jsoup.nodes.Document document45 = xmlTreeBuilder0.parse("", "hi!");
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document45);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes21 = null;
        boolean boolean22 = xmlTreeBuilder0.processStartTag("hi!", attributes21);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token.Character character29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("hi!", "hi!");
        org.jsoup.nodes.Document document32 = xmlTreeBuilder26.parse("", "hi!");
        org.jsoup.nodes.Document document35 = xmlTreeBuilder26.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes37 = null;
        boolean boolean38 = xmlTreeBuilder26.processStartTag("hi!", attributes37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder26.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList25, parseSettings42);
        org.jsoup.parser.Token.Doctype doctype44 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder14.parseFragment("hi!", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder14.parseFragment("", "", parseErrorList22, parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList13, parseSettings25);
        java.lang.Class<?> wildcardClass27 = nodeList26.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.nodes.Document document44 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder48.parseFragment("hi!", "hi!", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder48.parseFragment("", "", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList47, parseSettings59);
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList27, parseSettings59);
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Doctype doctype65 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(document64);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder22.parseFragment("", "", parseErrorList30, parseSettings31);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder46.parseFragment("hi!", "hi!", parseErrorList49, parseSettings50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder46.parseFragment("", "hi!", parseErrorList54, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder42.parseFragment("hi!", "hi!", parseErrorList45, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document65 = xmlTreeBuilder62.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder42.parseFragment("", "hi!", parseErrorList61, parseSettings66);
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder22.parseFragment("", "", parseErrorList41, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder72.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder22.parseFragment("", "hi!", parseErrorList71, parseSettings73);
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder17.parseFragment("hi!", "hi!", parseErrorList21, parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder0.parseFragment("", "", parseErrorList16, parseSettings76);
        org.jsoup.nodes.Document document80 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document85 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList88 = null;
        org.jsoup.parser.ParseSettings parseSettings89 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList90 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList88, parseSettings89);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(nodeList90);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.nodes.Attributes attributes66 = null;
        boolean boolean67 = xmlTreeBuilder0.processStartTag("hi!", attributes66);
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.ParseSettings parseSettings74 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList73, parseSettings74);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype77 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings76);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes26 = null;
        boolean boolean27 = xmlTreeBuilder0.processStartTag("hi!", attributes26);
        org.jsoup.parser.Token token28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = xmlTreeBuilder0.process(token28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes21 = null;
        boolean boolean22 = xmlTreeBuilder0.processStartTag("hi!", attributes21);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character24 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(parseSettings23);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder39.parseFragment("", "hi!", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder35.parseFragment("hi!", "hi!", parseErrorList38, parseSettings50);
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder24.parseFragment("", "hi!", parseErrorList34, parseSettings54);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder59.parseFragment("hi!", "hi!", parseErrorList62, parseSettings63);
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.ParseSettings parseSettings68 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder59.parseFragment("", "", parseErrorList67, parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder59.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder24.parseFragment("hi!", "", parseErrorList58, parseSettings70);
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList23, parseSettings70);
        org.jsoup.nodes.Attributes attributes74 = null;
        boolean boolean75 = xmlTreeBuilder0.processStartTag("hi!", attributes74);
        org.jsoup.parser.Token.Character character76 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder25.parseFragment("", "", parseErrorList33, parseSettings34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder25.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder25.defaultSettings();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder25.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList24, parseSettings43);
        org.jsoup.parser.Token.Comment comment45 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(nodeList44);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes7 = null;
        boolean boolean8 = xmlTreeBuilder0.processStartTag("hi!", attributes7);
        org.jsoup.nodes.Document document11 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes14 = null;
        boolean boolean15 = xmlTreeBuilder0.processStartTag("hi!", attributes14);
        java.io.Reader reader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder19.parseFragment("hi!", "hi!", parseErrorList22, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder19.parseFragment("", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.nodes.Document document32 = xmlTreeBuilder19.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder41.parseFragment("hi!", "hi!", parseErrorList44, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder41.parseFragment("", "", parseErrorList49, parseSettings50);
        org.jsoup.nodes.Document document54 = xmlTreeBuilder41.parse("hi!", "");
        org.jsoup.nodes.Document document57 = xmlTreeBuilder41.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder65.parseFragment("hi!", "hi!", parseErrorList68, parseSettings69);
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.ParseSettings parseSettings74 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder65.parseFragment("", "hi!", parseErrorList73, parseSettings74);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder65.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder61.parseFragment("hi!", "hi!", parseErrorList64, parseSettings76);
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder81 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document84 = xmlTreeBuilder81.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder81.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList86 = xmlTreeBuilder61.parseFragment("", "hi!", parseErrorList80, parseSettings85);
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder41.parseFragment("", "", parseErrorList60, parseSettings85);
        org.jsoup.parser.ParseErrorList parseErrorList90 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder91 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings92 = xmlTreeBuilder91.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList93 = xmlTreeBuilder41.parseFragment("", "hi!", parseErrorList90, parseSettings92);
        java.util.List<org.jsoup.nodes.Node> nodeList94 = xmlTreeBuilder36.parseFragment("hi!", "hi!", parseErrorList40, parseSettings92);
        org.jsoup.parser.ParseSettings parseSettings95 = xmlTreeBuilder36.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList96 = xmlTreeBuilder19.parseFragment("", "", parseErrorList35, parseSettings95);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader16, "hi!", parseErrorList18, parseSettings95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(document84);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(nodeList86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(parseSettings92);
        org.junit.Assert.assertNotNull(nodeList93);
        org.junit.Assert.assertNotNull(nodeList94);
        org.junit.Assert.assertNotNull(parseSettings95);
        org.junit.Assert.assertNotNull(nodeList96);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder24.parseFragment("", "", parseErrorList32, parseSettings33);
        org.jsoup.nodes.Document document37 = xmlTreeBuilder24.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList23, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder43.parseFragment("hi!", "hi!", parseErrorList46, parseSettings47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder43.parseFragment("", "", parseErrorList51, parseSettings52);
        org.jsoup.nodes.Document document56 = xmlTreeBuilder43.parse("hi!", "");
        org.jsoup.nodes.Document document59 = xmlTreeBuilder43.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder63.parseFragment("hi!", "hi!", parseErrorList66, parseSettings67);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.ParseSettings parseSettings72 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder63.parseFragment("", "", parseErrorList71, parseSettings72);
        org.jsoup.parser.ParseSettings parseSettings74 = xmlTreeBuilder63.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder43.parseFragment("", "hi!", parseErrorList62, parseSettings74);
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder15.parseFragment("hi!", "", parseErrorList42, parseSettings74);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder0.parseFragment("", "", parseErrorList14, parseSettings77);
        org.jsoup.nodes.Attributes attributes80 = null;
        boolean boolean81 = xmlTreeBuilder0.processStartTag("hi!", attributes80);
        org.jsoup.nodes.Document document84 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(document84);
        org.junit.Assert.assertNotNull(parseSettings85);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder16.parseFragment("hi!", "hi!", parseErrorList19, parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder31.parseFragment("hi!", "hi!", parseErrorList34, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder31.parseFragment("", "hi!", parseErrorList39, parseSettings40);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder16.parseFragment("", "hi!", parseErrorList26, parseSettings46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder51.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder51.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder16.parseFragment("hi!", "", parseErrorList50, parseSettings53);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList15, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document60 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes64 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = xmlTreeBuilder0.processStartTag("", attributes64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parseSettings62);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.Token.Character character32 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "hi!", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder49.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList48, parseSettings53);
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder24.parseFragment("", "", parseErrorList28, parseSettings53);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder59.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder24.parseFragment("hi!", "", parseErrorList58, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.ParseSettings parseSettings73 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder69.parseFragment("hi!", "hi!", parseErrorList72, parseSettings73);
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.ParseSettings parseSettings78 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder69.parseFragment("", "hi!", parseErrorList77, parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder69.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder65.parseFragment("hi!", "hi!", parseErrorList68, parseSettings80);
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder65.defaultSettings();
        org.jsoup.nodes.Document document85 = xmlTreeBuilder65.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings86 = xmlTreeBuilder65.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList64, parseSettings86);
        java.util.List<org.jsoup.nodes.Node> nodeList88 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList23, parseSettings86);
        org.jsoup.nodes.Document document91 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token.Doctype doctype92 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertNotNull(document91);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder10.parseFragment("", "", parseErrorList18, parseSettings19);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder10.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes25 = null;
        boolean boolean26 = xmlTreeBuilder10.processStartTag("hi!", attributes25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder45.parseFragment("hi!", "hi!", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder45.parseFragment("", "hi!", parseErrorList53, parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder41.parseFragment("hi!", "hi!", parseErrorList44, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList40, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder65.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder65.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document74 = xmlTreeBuilder71.parse("hi!", "hi!");
        org.jsoup.nodes.Document document77 = xmlTreeBuilder71.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder71.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder65.parseFragment("hi!", "", parseErrorList70, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList64, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder10.parseFragment("", "", parseErrorList29, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList82 = xmlTreeBuilder0.parseFragment("", "", parseErrorList9, parseSettings78);
        java.lang.Class<?> wildcardClass83 = parseSettings78.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder22.parseFragment("", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder22.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList21, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document41 = xmlTreeBuilder38.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder38.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder18.parseFragment("", "hi!", parseErrorList37, parseSettings42);
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder13.parseFragment("", "", parseErrorList17, parseSettings42);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document51 = xmlTreeBuilder48.parse("hi!", "hi!");
        org.jsoup.nodes.Document document54 = xmlTreeBuilder48.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder13.parseFragment("", "hi!", parseErrorList47, parseSettings55);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder0.parseFragment("", "", parseErrorList12, parseSettings55);
        org.jsoup.nodes.Attributes attributes59 = null;
        boolean boolean60 = xmlTreeBuilder0.processStartTag("hi!", attributes59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.ParseSettings parseSettings64 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList63, parseSettings64);
        org.jsoup.parser.Token.StartTag startTag66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element67 = xmlTreeBuilder0.insert(startTag66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(nodeList65);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes34 = null;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("hi!", attributes34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder39.parseFragment("", "", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList52, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList38, parseSettings57);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token token62 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = xmlTreeBuilder0.process(token62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token.Character character27 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList21, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder18.parseFragment("", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder14.parseFragment("hi!", "hi!", parseErrorList17, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document37 = xmlTreeBuilder34.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList33, parseSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder9.parseFragment("", "", parseErrorList13, parseSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment43 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(parseSettings42);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder11.parseFragment("hi!", "hi!", parseErrorList14, parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder11.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList10, parseSettings30);
        org.jsoup.nodes.Document document34 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder38.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder38.parseFragment("", "", parseErrorList43, parseSettings46);
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList37, parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder53.parseFragment("hi!", "hi!", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder53.parseFragment("", "", parseErrorList61, parseSettings62);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.ParseSettings parseSettings71 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder67.parseFragment("hi!", "hi!", parseErrorList70, parseSettings71);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder67.parseFragment("", "", parseErrorList75, parseSettings76);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder67.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder53.parseFragment("", "hi!", parseErrorList66, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder0.parseFragment("", "", parseErrorList52, parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList84 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder85 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document88 = xmlTreeBuilder85.parse("hi!", "hi!");
        org.jsoup.nodes.Document document91 = xmlTreeBuilder85.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings92 = xmlTreeBuilder85.defaultSettings();
        org.jsoup.nodes.Document document95 = xmlTreeBuilder85.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings96 = xmlTreeBuilder85.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings97 = xmlTreeBuilder85.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList98 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList84, parseSettings97);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertNotNull(document91);
        org.junit.Assert.assertNotNull(parseSettings92);
        org.junit.Assert.assertNotNull(document95);
        org.junit.Assert.assertNotNull(parseSettings96);
        org.junit.Assert.assertNotNull(parseSettings97);
        org.junit.Assert.assertNotNull(nodeList98);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("hi!", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder13.parseFragment("", "hi!", parseErrorList32, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList12, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document52 = xmlTreeBuilder0.parse(reader50, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes21 = null;
        boolean boolean22 = xmlTreeBuilder0.processStartTag("hi!", attributes21);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token.Character character26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("hi!", "hi!");
        org.jsoup.nodes.Document document39 = xmlTreeBuilder33.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder27.parseFragment("hi!", "", parseErrorList32, parseSettings40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder0.parseFragment("", "", parseErrorList26, parseSettings40);
        org.jsoup.nodes.Document document45 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder49.parseFragment("hi!", "hi!", parseErrorList52, parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.ParseSettings parseSettings68 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder64.parseFragment("hi!", "hi!", parseErrorList67, parseSettings68);
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.ParseSettings parseSettings73 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder64.parseFragment("", "hi!", parseErrorList72, parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder64.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder60.parseFragment("hi!", "hi!", parseErrorList63, parseSettings75);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder60.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder60.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings79 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder49.parseFragment("", "hi!", parseErrorList59, parseSettings79);
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder84 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder84.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings86 = xmlTreeBuilder84.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder49.parseFragment("hi!", "", parseErrorList83, parseSettings86);
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList48, parseSettings88);
        org.jsoup.parser.Token token90 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = xmlTreeBuilder0.process(token90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder10.parseFragment("", "", parseErrorList18, parseSettings19);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder34.parseFragment("hi!", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList49, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder10.parseFragment("", "", parseErrorList29, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList9, parseSettings54);
        org.jsoup.nodes.Document document60 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.ParseSettings parseSettings64 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList63, parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(parseSettings66);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        java.io.Reader reader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder24.parseFragment("", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings35);
        org.jsoup.nodes.Document document39 = xmlTreeBuilder20.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.ParseSettings parseSettings51 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder47.parseFragment("hi!", "hi!", parseErrorList50, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder47.parseFragment("", "hi!", parseErrorList55, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlTreeBuilder43.parseFragment("hi!", "hi!", parseErrorList46, parseSettings58);
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder70 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.ParseSettings parseSettings74 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder70.parseFragment("hi!", "hi!", parseErrorList73, parseSettings74);
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        org.jsoup.parser.ParseSettings parseSettings79 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder70.parseFragment("", "hi!", parseErrorList78, parseSettings79);
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder70.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList82 = xmlTreeBuilder66.parseFragment("hi!", "hi!", parseErrorList69, parseSettings81);
        org.jsoup.parser.ParseSettings parseSettings83 = xmlTreeBuilder66.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder43.parseFragment("", "hi!", parseErrorList65, parseSettings83);
        java.util.List<org.jsoup.nodes.Node> nodeList85 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList42, parseSettings83);
        org.jsoup.parser.ParseSettings parseSettings86 = xmlTreeBuilder20.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader17, "", parseErrorList19, parseSettings86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertNotNull(parseSettings86);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Doctype doctype23 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder24.parseFragment("", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList19, parseSettings44);
        org.jsoup.nodes.Document document49 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document52 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parseSettings53);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes7 = null;
        boolean boolean8 = xmlTreeBuilder0.processStartTag("hi!", attributes7);
        org.jsoup.nodes.Attributes attributes10 = null;
        boolean boolean11 = xmlTreeBuilder0.processStartTag("hi!", attributes10);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder24.parseFragment("", "", parseErrorList32, parseSettings33);
        org.jsoup.nodes.Document document37 = xmlTreeBuilder24.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList23, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder43.parseFragment("hi!", "hi!", parseErrorList46, parseSettings47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder43.parseFragment("", "", parseErrorList51, parseSettings52);
        org.jsoup.nodes.Document document56 = xmlTreeBuilder43.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document63 = xmlTreeBuilder60.parse("hi!", "hi!");
        org.jsoup.nodes.Document document66 = xmlTreeBuilder60.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder43.parseFragment("", "hi!", parseErrorList59, parseSettings67);
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList42, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder0.parseFragment("", "", parseErrorList14, parseSettings70);
        org.jsoup.parser.Token.Doctype doctype72 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(nodeList71);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList34, parseSettings36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder45.parseFragment("hi!", "hi!", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder45.parseFragment("", "hi!", parseErrorList53, parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder41.parseFragment("hi!", "hi!", parseErrorList44, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.nodes.Document document61 = xmlTreeBuilder41.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList40, parseSettings62);
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes66 = null;
        boolean boolean67 = xmlTreeBuilder0.processStartTag("hi!", attributes66);
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder35.parseFragment("hi!", "hi!", parseErrorList38, parseSettings39);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder35.parseFragment("", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder31.parseFragment("hi!", "hi!", parseErrorList34, parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList30, parseSettings50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document64 = xmlTreeBuilder61.parse("hi!", "hi!");
        org.jsoup.nodes.Document document67 = xmlTreeBuilder61.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder61.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder55.parseFragment("hi!", "", parseErrorList60, parseSettings68);
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList54, parseSettings68);
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings68);
        org.jsoup.nodes.Attributes attributes73 = null;
        boolean boolean74 = xmlTreeBuilder0.processStartTag("hi!", attributes73);
        org.jsoup.nodes.Document document77 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document80 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document83 = xmlTreeBuilder0.parse("hi!", "hi!");
        java.io.Reader reader84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document86 = xmlTreeBuilder0.parse(reader84, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(document83);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("", "");
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse(reader17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder36.parseFragment("hi!", "hi!", parseErrorList39, parseSettings41);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList35, parseSettings41);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes52 = null;
        boolean boolean53 = xmlTreeBuilder0.processStartTag("hi!", attributes52);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder58.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder0.parseFragment("", "", parseErrorList57, parseSettings59);
        org.jsoup.nodes.Document document63 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Comment comment64 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(document63);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token.Doctype doctype15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("hi!", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder13.parseFragment("", "hi!", parseErrorList32, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList12, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes51 = null;
        boolean boolean52 = xmlTreeBuilder0.processStartTag("hi!", attributes51);
        java.lang.Class<?> wildcardClass53 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("hi!", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder13.parseFragment("", "hi!", parseErrorList32, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList12, parseSettings44);
        org.jsoup.nodes.Attributes attributes48 = null;
        boolean boolean49 = xmlTreeBuilder0.processStartTag("hi!", attributes48);
        org.jsoup.nodes.Document document52 = xmlTreeBuilder0.parse("", "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(document52);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document31 = xmlTreeBuilder0.parse("hi!", "");
        java.lang.Class<?> wildcardClass32 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.nodes.Attributes attributes66 = null;
        boolean boolean67 = xmlTreeBuilder0.processStartTag("hi!", attributes66);
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass73 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes25 = null;
        boolean boolean26 = xmlTreeBuilder0.processStartTag("hi!", attributes25);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes15 = null;
        boolean boolean16 = xmlTreeBuilder0.processStartTag("hi!", attributes15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document40 = xmlTreeBuilder37.parse("hi!", "hi!");
        org.jsoup.nodes.Document document43 = xmlTreeBuilder37.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder37.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList36, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings44);
        org.jsoup.nodes.Document document49 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document52 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(document52);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes34 = null;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("hi!", attributes34);
        org.jsoup.nodes.Attributes attributes37 = null;
        boolean boolean38 = xmlTreeBuilder0.processStartTag("hi!", attributes37);
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment40 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(parseSettings39);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList22, parseSettings40);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes46 = null;
        boolean boolean47 = xmlTreeBuilder0.processStartTag("hi!", attributes46);
        org.jsoup.nodes.Document document50 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document54 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token.StartTag startTag55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = xmlTreeBuilder0.insert(startTag55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(document54);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder11.parseFragment("hi!", "hi!", parseErrorList14, parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder11.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList10, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder41.parse("hi!", "hi!");
        org.jsoup.nodes.Document document47 = xmlTreeBuilder41.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder35.parseFragment("hi!", "", parseErrorList40, parseSettings48);
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList34, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder55.parseFragment("hi!", "hi!", parseErrorList58, parseSettings59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.ParseSettings parseSettings64 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder55.parseFragment("", "", parseErrorList63, parseSettings64);
        org.jsoup.nodes.Document document68 = xmlTreeBuilder55.parse("hi!", "");
        org.jsoup.nodes.Document document71 = xmlTreeBuilder55.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList54, parseSettings73);
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder82 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings83 = xmlTreeBuilder82.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder78.parseFragment("hi!", "hi!", parseErrorList81, parseSettings83);
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder78.defaultSettings();
        org.jsoup.nodes.Attributes attributes87 = null;
        boolean boolean88 = xmlTreeBuilder78.processStartTag("hi!", attributes87);
        org.jsoup.nodes.Document document91 = xmlTreeBuilder78.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings92 = xmlTreeBuilder78.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList93 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList77, parseSettings92);
        org.jsoup.nodes.Document document96 = xmlTreeBuilder0.parse("hi!", "hi!");
        java.lang.Class<?> wildcardClass97 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(document91);
        org.junit.Assert.assertNotNull(parseSettings92);
        org.junit.Assert.assertNotNull(nodeList93);
        org.junit.Assert.assertNotNull(document96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder36.parseFragment("hi!", "hi!", parseErrorList39, parseSettings41);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList35, parseSettings41);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes52 = null;
        boolean boolean53 = xmlTreeBuilder0.processStartTag("hi!", attributes52);
        org.jsoup.nodes.Attributes attributes55 = null;
        boolean boolean56 = xmlTreeBuilder0.processStartTag("hi!", attributes55);
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.ParseSettings parseSettings64 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder60.parseFragment("hi!", "hi!", parseErrorList63, parseSettings64);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder60.parseFragment("", "", parseErrorList68, parseSettings69);
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder60.defaultSettings();
        org.jsoup.nodes.Document document74 = xmlTreeBuilder60.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList59, parseSettings75);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("hi!", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder13.parseFragment("", "hi!", parseErrorList32, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList12, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype49 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = xmlTreeBuilder0.insert(startTag13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings12);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes12 = null;
        boolean boolean13 = xmlTreeBuilder0.processStartTag("hi!", attributes12);
        java.io.Reader reader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder21.parseFragment("hi!", "hi!", parseErrorList24, parseSettings25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder21.parseFragment("", "hi!", parseErrorList29, parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder17.parseFragment("hi!", "hi!", parseErrorList20, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder37.parseFragment("hi!", "hi!", parseErrorList40, parseSettings41);
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder37.parseFragment("", "", parseErrorList45, parseSettings46);
        org.jsoup.nodes.Document document50 = xmlTreeBuilder37.parse("hi!", "");
        org.jsoup.nodes.Document document53 = xmlTreeBuilder37.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder57.parseFragment("hi!", "hi!", parseErrorList60, parseSettings61);
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.ParseSettings parseSettings66 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder57.parseFragment("", "", parseErrorList65, parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder57.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder37.parseFragment("", "hi!", parseErrorList56, parseSettings68);
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder73 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder77 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder77.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder73.parseFragment("hi!", "hi!", parseErrorList76, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder37.parseFragment("hi!", "hi!", parseErrorList72, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder17.parseFragment("hi!", "hi!", parseErrorList36, parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings83 = xmlTreeBuilder17.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader14, "hi!", parseErrorList16, parseSettings83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parseSettings83);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document67 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token.StartTag startTag68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element69 = xmlTreeBuilder0.insert(startTag68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document67);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token.Character character18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("hi!", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder13.parseFragment("", "hi!", parseErrorList32, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList12, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList52, parseSettings53);
        org.jsoup.nodes.Document document57 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(document57);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = null;
        boolean boolean9 = xmlTreeBuilder0.processStartTag("hi!", attributes8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("hi!", "hi!");
        org.jsoup.nodes.Document document19 = xmlTreeBuilder13.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings39);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document47 = xmlTreeBuilder44.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder24.parseFragment("", "hi!", parseErrorList43, parseSettings48);
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder13.parseFragment("", "", parseErrorList23, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder58.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder54.parseFragment("hi!", "hi!", parseErrorList57, parseSettings59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder68.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder64.parseFragment("hi!", "hi!", parseErrorList67, parseSettings69);
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder54.parseFragment("", "hi!", parseErrorList63, parseSettings69);
        org.jsoup.nodes.Document document74 = xmlTreeBuilder54.parse("", "");
        org.jsoup.nodes.Attributes attributes76 = null;
        boolean boolean77 = xmlTreeBuilder54.processStartTag("hi!", attributes76);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder13.parseFragment("", "", parseErrorList53, parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder13.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList12, parseSettings80);
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes84 = null;
        boolean boolean85 = xmlTreeBuilder0.processStartTag("hi!", attributes84);
        org.jsoup.parser.Token token86 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = xmlTreeBuilder0.process(token86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.nodes.Attributes attributes66 = null;
        boolean boolean67 = xmlTreeBuilder0.processStartTag("hi!", attributes66);
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.ParseSettings parseSettings75 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder71.parseFragment("hi!", "hi!", parseErrorList74, parseSettings75);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder71.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList70, parseSettings77);
        org.jsoup.parser.Token token79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = xmlTreeBuilder0.process(token79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList78);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList22, parseSettings40);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes46 = null;
        boolean boolean47 = xmlTreeBuilder0.processStartTag("hi!", attributes46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder51.parseFragment("hi!", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "", parseErrorList50, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader64 = null;
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.ParseSettings parseSettings75 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder71.parseFragment("hi!", "hi!", parseErrorList74, parseSettings75);
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.ParseSettings parseSettings80 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder71.parseFragment("", "hi!", parseErrorList79, parseSettings80);
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder71.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder67.parseFragment("hi!", "hi!", parseErrorList70, parseSettings82);
        org.jsoup.parser.ParseSettings parseSettings84 = xmlTreeBuilder67.defaultSettings();
        org.jsoup.nodes.Document document87 = xmlTreeBuilder67.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder67.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder67.defaultSettings();
        org.jsoup.nodes.Document document92 = xmlTreeBuilder67.parse("hi!", "");
        org.jsoup.nodes.Document document95 = xmlTreeBuilder67.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings96 = xmlTreeBuilder67.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader64, "hi!", parseErrorList66, parseSettings96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(parseSettings89);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertNotNull(document95);
        org.junit.Assert.assertNotNull(parseSettings96);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder35.parse("hi!", "hi!");
        org.jsoup.nodes.Document document41 = xmlTreeBuilder35.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList34, parseSettings42);
        org.jsoup.nodes.Attributes attributes45 = null;
        boolean boolean46 = xmlTreeBuilder0.processStartTag("hi!", attributes45);
        org.jsoup.nodes.Attributes attributes48 = null;
        boolean boolean49 = xmlTreeBuilder0.processStartTag("hi!", attributes48);
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder54.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document63 = xmlTreeBuilder60.parse("hi!", "hi!");
        org.jsoup.nodes.Document document66 = xmlTreeBuilder60.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder54.parseFragment("hi!", "", parseErrorList59, parseSettings67);
        org.jsoup.nodes.Document document71 = xmlTreeBuilder54.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder54.defaultSettings();
        org.jsoup.nodes.Attributes attributes74 = null;
        boolean boolean75 = xmlTreeBuilder54.processStartTag("hi!", attributes74);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList53, parseSettings76);
        java.io.Reader reader78 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document80 = xmlTreeBuilder0.parse(reader78, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes20 = null;
        boolean boolean21 = xmlTreeBuilder0.processStartTag("hi!", attributes20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(document27);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes20 = null;
        boolean boolean21 = xmlTreeBuilder0.processStartTag("hi!", attributes20);
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes26 = null;
        boolean boolean27 = xmlTreeBuilder0.processStartTag("hi!", attributes26);
        org.jsoup.nodes.Attributes attributes29 = null;
        boolean boolean30 = xmlTreeBuilder0.processStartTag("hi!", attributes29);
        java.io.Reader reader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document33 = xmlTreeBuilder0.parse(reader31, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder7.parseFragment("", "", parseErrorList15, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList20, parseSettings23);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder0.parseFragment("", "", parseErrorList6, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "hi!", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder56.parseFragment("", "hi!", parseErrorList64, parseSettings65);
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder56.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder52.parseFragment("hi!", "hi!", parseErrorList55, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList51, parseSettings69);
        org.jsoup.nodes.Document document73 = xmlTreeBuilder29.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes75 = null;
        boolean boolean76 = xmlTreeBuilder29.processStartTag("hi!", attributes75);
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder80 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder84 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder84.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList86 = xmlTreeBuilder80.parseFragment("hi!", "hi!", parseErrorList83, parseSettings85);
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder29.parseFragment("", "", parseErrorList79, parseSettings85);
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList28, parseSettings88);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document95 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document98 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings99 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(nodeList86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertNotNull(document95);
        org.junit.Assert.assertNotNull(document98);
        org.junit.Assert.assertNotNull(parseSettings99);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.nodes.Document document51 = xmlTreeBuilder45.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList44, parseSettings52);
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList27, parseSettings52);
        org.jsoup.nodes.Attributes attributes56 = null;
        boolean boolean57 = xmlTreeBuilder0.processStartTag("hi!", attributes56);
        org.jsoup.parser.Token.Comment comment58 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder11.parseFragment("hi!", "hi!", parseErrorList14, parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder11.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList10, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder41.parse("hi!", "hi!");
        org.jsoup.nodes.Document document47 = xmlTreeBuilder41.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder35.parseFragment("hi!", "", parseErrorList40, parseSettings48);
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList34, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder55.parseFragment("hi!", "hi!", parseErrorList58, parseSettings59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.ParseSettings parseSettings64 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder55.parseFragment("", "", parseErrorList63, parseSettings64);
        org.jsoup.nodes.Document document68 = xmlTreeBuilder55.parse("hi!", "");
        org.jsoup.nodes.Document document71 = xmlTreeBuilder55.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList54, parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes77 = null;
        boolean boolean78 = xmlTreeBuilder0.processStartTag("hi!", attributes77);
        org.jsoup.nodes.Document document81 = xmlTreeBuilder0.parse("", "");
        java.io.Reader reader82 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document84 = xmlTreeBuilder0.parse(reader82, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(document81);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList23, parseSettings42);
        org.jsoup.nodes.Attributes attributes45 = null;
        boolean boolean46 = xmlTreeBuilder0.processStartTag("hi!", attributes45);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment48 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(parseSettings47);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype27 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseSettings26);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder31.parseFragment("hi!", "hi!", parseErrorList34, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder31.parseFragment("", "hi!", parseErrorList39, parseSettings40);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder27.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader24, "hi!", parseErrorList26, parseSettings47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder7.parseFragment("", "", parseErrorList15, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList20, parseSettings23);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder0.parseFragment("", "", parseErrorList6, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "hi!", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder56.parseFragment("", "hi!", parseErrorList64, parseSettings65);
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder56.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder52.parseFragment("hi!", "hi!", parseErrorList55, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList51, parseSettings69);
        org.jsoup.nodes.Document document73 = xmlTreeBuilder29.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes75 = null;
        boolean boolean76 = xmlTreeBuilder29.processStartTag("hi!", attributes75);
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder80 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder84 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder84.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList86 = xmlTreeBuilder80.parseFragment("hi!", "hi!", parseErrorList83, parseSettings85);
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder29.parseFragment("", "", parseErrorList79, parseSettings85);
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList28, parseSettings88);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings93 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(nodeList86);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertNotNull(parseSettings93);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes67 = null;
        boolean boolean68 = xmlTreeBuilder0.processStartTag("hi!", attributes67);
        org.jsoup.nodes.Document document71 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document74 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes76 = null;
        boolean boolean77 = xmlTreeBuilder0.processStartTag("hi!", attributes76);
        org.jsoup.parser.Token.Comment comment78 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes15 = null;
        boolean boolean16 = xmlTreeBuilder0.processStartTag("hi!", attributes15);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings27);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token.Character character62 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings31);
        org.jsoup.nodes.Attributes attributes34 = null;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("hi!", attributes34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder0.parse("hi!", "hi!");
        java.io.Reader reader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder42.parseFragment("hi!", "hi!", parseErrorList45, parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder42.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder57.parseFragment("hi!", "hi!", parseErrorList60, parseSettings61);
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.ParseSettings parseSettings66 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder57.parseFragment("", "hi!", parseErrorList65, parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder57.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder53.parseFragment("hi!", "hi!", parseErrorList56, parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder42.parseFragment("", "hi!", parseErrorList52, parseSettings72);
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder77 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.ParseSettings parseSettings81 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList82 = xmlTreeBuilder77.parseFragment("hi!", "hi!", parseErrorList80, parseSettings81);
        org.jsoup.parser.ParseErrorList parseErrorList85 = null;
        org.jsoup.parser.ParseSettings parseSettings86 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList87 = xmlTreeBuilder77.parseFragment("", "", parseErrorList85, parseSettings86);
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder77.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder42.parseFragment("hi!", "", parseErrorList76, parseSettings88);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader39, "hi!", parseErrorList41, parseSettings88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(nodeList87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document15 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes17 = null;
        boolean boolean18 = xmlTreeBuilder0.processStartTag("hi!", attributes17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList21, parseSettings22);
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse(reader24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("hi!", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings13);
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token.Character character23 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList38, parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder26.parseFragment("hi!", "hi!", parseErrorList29, parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList25, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder53.parseFragment("hi!", "hi!", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder53.parseFragment("", "hi!", parseErrorList61, parseSettings62);
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder49.parseFragment("hi!", "hi!", parseErrorList52, parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList48, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder22.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder0.parseFragment("", "", parseErrorList21, parseSettings69);
        org.jsoup.nodes.Document document73 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes75 = null;
        boolean boolean76 = xmlTreeBuilder0.processStartTag("hi!", attributes75);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = null;
        boolean boolean12 = xmlTreeBuilder0.processStartTag("hi!", attributes11);
        org.jsoup.nodes.Document document15 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder22.parseFragment("", "", parseErrorList30, parseSettings31);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder42.parseFragment("hi!", "hi!", parseErrorList45, parseSettings46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.ParseSettings parseSettings51 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder42.parseFragment("", "", parseErrorList50, parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder22.parseFragment("", "hi!", parseErrorList41, parseSettings53);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder58.parseFragment("hi!", "hi!", parseErrorList61, parseSettings63);
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList57, parseSettings63);
        org.jsoup.nodes.Document document68 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder22.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList21, parseSettings71);
        org.jsoup.nodes.Attributes attributes74 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = xmlTreeBuilder0.processStartTag("", attributes74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(nodeList72);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes67 = null;
        boolean boolean68 = xmlTreeBuilder0.processStartTag("hi!", attributes67);
        org.jsoup.nodes.Document document71 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes73 = null;
        boolean boolean74 = xmlTreeBuilder0.processStartTag("hi!", attributes73);
        java.io.Reader reader75 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document77 = xmlTreeBuilder0.parse(reader75, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder0.parseFragment("", "", parseErrorList21, parseSettings22);
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse(reader24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("hi!", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder13.parseFragment("", "hi!", parseErrorList32, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList12, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype50 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.nodes.Document document44 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder48.parseFragment("hi!", "hi!", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder48.parseFragment("", "", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList47, parseSettings59);
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList27, parseSettings59);
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document68 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes70 = null;
        boolean boolean71 = xmlTreeBuilder0.processStartTag("hi!", attributes70);
        org.jsoup.nodes.Attributes attributes73 = null;
        boolean boolean74 = xmlTreeBuilder0.processStartTag("hi!", attributes73);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder17.parseFragment("hi!", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList16, parseSettings28);
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder0.parse("hi!", "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(document33);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("", "");
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder36.parseFragment("hi!", "hi!", parseErrorList39, parseSettings41);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList35, parseSettings41);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder47.parse("hi!", "hi!");
        org.jsoup.nodes.Document document53 = xmlTreeBuilder47.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.ParseSettings parseSettings66 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder62.parseFragment("hi!", "hi!", parseErrorList65, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.ParseSettings parseSettings71 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder62.parseFragment("", "hi!", parseErrorList70, parseSettings71);
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder58.parseFragment("hi!", "hi!", parseErrorList61, parseSettings73);
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document81 = xmlTreeBuilder78.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder78.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder58.parseFragment("", "hi!", parseErrorList77, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder47.parseFragment("", "", parseErrorList57, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList85 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList46, parseSettings82);
        org.jsoup.nodes.Document document88 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes90 = null;
        boolean boolean91 = xmlTreeBuilder0.processStartTag("hi!", attributes90);
        org.jsoup.parser.Token.StartTag startTag92 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element93 = xmlTreeBuilder0.insert(startTag92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.StartTag startTag23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document7 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder14.parseFragment("hi!", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder14.parseFragment("", "", parseErrorList22, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList27, parseSettings39);
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList13, parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character43 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(parseSettings42);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder11.parseFragment("hi!", "hi!", parseErrorList14, parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder11.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList10, parseSettings30);
        org.jsoup.nodes.Document document34 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder38.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder38.parseFragment("", "", parseErrorList43, parseSettings46);
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList37, parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder53.parseFragment("hi!", "hi!", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder53.parseFragment("", "", parseErrorList61, parseSettings62);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.ParseSettings parseSettings71 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder67.parseFragment("hi!", "hi!", parseErrorList70, parseSettings71);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder67.parseFragment("", "", parseErrorList75, parseSettings76);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder67.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder53.parseFragment("", "hi!", parseErrorList66, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder0.parseFragment("", "", parseErrorList52, parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype82 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(parseSettings81);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Comment comment26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes16 = null;
        boolean boolean17 = xmlTreeBuilder0.processStartTag("hi!", attributes16);
        org.jsoup.parser.Token.Comment comment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes34 = null;
        boolean boolean35 = xmlTreeBuilder0.processStartTag("hi!", attributes34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder39.parseFragment("", "", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList52, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList38, parseSettings57);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token.StartTag startTag65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element66 = xmlTreeBuilder0.insert(startTag65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document64);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder26.parseFragment("hi!", "hi!", parseErrorList29, parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder36.parseFragment("hi!", "hi!", parseErrorList39, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder36.parseFragment("", "", parseErrorList44, parseSettings45);
        org.jsoup.nodes.Document document49 = xmlTreeBuilder36.parse("hi!", "");
        org.jsoup.nodes.Document document52 = xmlTreeBuilder36.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder56.parseFragment("", "", parseErrorList64, parseSettings65);
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder56.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder36.parseFragment("", "hi!", parseErrorList55, parseSettings67);
        org.jsoup.nodes.Attributes attributes70 = null;
        boolean boolean71 = xmlTreeBuilder36.processStartTag("hi!", attributes70);
        org.jsoup.nodes.Document document74 = xmlTreeBuilder36.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document81 = xmlTreeBuilder78.parse("hi!", "hi!");
        org.jsoup.nodes.Document document84 = xmlTreeBuilder78.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder78.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList86 = xmlTreeBuilder36.parseFragment("hi!", "", parseErrorList77, parseSettings85);
        org.jsoup.parser.ParseSettings parseSettings87 = xmlTreeBuilder36.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList88 = xmlTreeBuilder26.parseFragment("hi!", "", parseErrorList35, parseSettings87);
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList25, parseSettings87);
        java.io.Reader reader90 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse(reader90, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(document84);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(nodeList86);
        org.junit.Assert.assertNotNull(parseSettings87);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertNotNull(nodeList89);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList21, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder18.parseFragment("", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder14.parseFragment("hi!", "hi!", parseErrorList17, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document37 = xmlTreeBuilder34.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList33, parseSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder9.parseFragment("", "", parseErrorList13, parseSettings38);
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings38);
        org.jsoup.nodes.Attributes attributes43 = null;
        boolean boolean44 = xmlTreeBuilder0.processStartTag("hi!", attributes43);
        org.jsoup.parser.Token.Comment comment45 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder7.parseFragment("", "", parseErrorList15, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList20, parseSettings23);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder0.parseFragment("", "", parseErrorList6, parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings45);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList39, parseSettings45);
        org.jsoup.nodes.Document document50 = xmlTreeBuilder30.parse("", "");
        org.jsoup.nodes.Attributes attributes52 = null;
        boolean boolean53 = xmlTreeBuilder30.processStartTag("hi!", attributes52);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.nodes.Document document57 = xmlTreeBuilder30.parse("hi!", "");
        org.jsoup.nodes.Document document60 = xmlTreeBuilder30.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder0.parseFragment("", "", parseErrorList29, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(parseSettings63);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token token39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = xmlTreeBuilder0.process(token39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings16);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse("hi!", "");
        java.io.Reader reader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder37.parseFragment("hi!", "hi!", parseErrorList40, parseSettings41);
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder37.parseFragment("", "", parseErrorList45, parseSettings46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder51.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder51.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder37.parseFragment("hi!", "hi!", parseErrorList50, parseSettings53);
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder30.parseFragment("", "", parseErrorList36, parseSettings53);
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder30.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader27, "", parseErrorList29, parseSettings56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(parseSettings56);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings24);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList38, parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder26.parseFragment("hi!", "hi!", parseErrorList29, parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList25, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder53.parseFragment("hi!", "hi!", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder53.parseFragment("", "hi!", parseErrorList61, parseSettings62);
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder49.parseFragment("hi!", "hi!", parseErrorList52, parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList48, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder22.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder0.parseFragment("", "", parseErrorList21, parseSettings69);
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token token73 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = xmlTreeBuilder0.process(token73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings72);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("hi!", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList22, parseSettings40);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document47 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document50 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlTreeBuilder54.parseFragment("hi!", "hi!", parseErrorList57, parseSettings58);
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder54.parseFragment("", "", parseErrorList62, parseSettings63);
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder68.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder68.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder54.parseFragment("hi!", "hi!", parseErrorList67, parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder0.parseFragment("", "", parseErrorList53, parseSettings72);
        org.jsoup.nodes.Document document76 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document79 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype81 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertNotNull(parseSettings80);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes38 = null;
        boolean boolean39 = xmlTreeBuilder0.processStartTag("hi!", attributes38);
        org.jsoup.parser.Token.Comment comment40 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Token.Character character14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder10.parseFragment("", "", parseErrorList18, parseSettings19);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder34.parseFragment("hi!", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList49, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder10.parseFragment("", "", parseErrorList29, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList9, parseSettings54);
        org.jsoup.nodes.Attributes attributes59 = null;
        boolean boolean60 = xmlTreeBuilder0.processStartTag("hi!", attributes59);
        org.jsoup.nodes.Attributes attributes62 = null;
        boolean boolean63 = xmlTreeBuilder0.processStartTag("hi!", attributes62);
        java.lang.Class<?> wildcardClass64 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("hi!", "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document67 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token token68 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = xmlTreeBuilder0.process(token68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document67);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings16);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder33.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList32, parseSettings47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder52.parseFragment("hi!", "hi!", parseErrorList55, parseSettings56);
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder52.parseFragment("", "", parseErrorList60, parseSettings61);
        org.jsoup.nodes.Document document65 = xmlTreeBuilder52.parse("hi!", "");
        org.jsoup.nodes.Document document68 = xmlTreeBuilder52.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder72.parseFragment("hi!", "hi!", parseErrorList75, parseSettings76);
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.ParseSettings parseSettings81 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList82 = xmlTreeBuilder72.parseFragment("", "", parseErrorList80, parseSettings81);
        org.jsoup.parser.ParseSettings parseSettings83 = xmlTreeBuilder72.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder52.parseFragment("", "hi!", parseErrorList71, parseSettings83);
        java.util.List<org.jsoup.nodes.Node> nodeList85 = xmlTreeBuilder24.parseFragment("hi!", "", parseErrorList51, parseSettings83);
        org.jsoup.nodes.Document document88 = xmlTreeBuilder24.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings90 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList91 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList23, parseSettings90);
        org.jsoup.nodes.Attributes attributes93 = null;
        boolean boolean94 = xmlTreeBuilder0.processStartTag("hi!", attributes93);
        org.jsoup.parser.Token.Doctype doctype95 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertNotNull(parseSettings89);
        org.junit.Assert.assertNotNull(parseSettings90);
        org.junit.Assert.assertNotNull(nodeList91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder10.parseFragment("", "", parseErrorList18, parseSettings19);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder10.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder34.parseFragment("hi!", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList49, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder10.parseFragment("", "", parseErrorList29, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList9, parseSettings54);
        org.jsoup.nodes.Document document60 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document63 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes65 = null;
        boolean boolean66 = xmlTreeBuilder0.processStartTag("hi!", attributes65);
        org.jsoup.nodes.Attributes attributes68 = null;
        boolean boolean69 = xmlTreeBuilder0.processStartTag("hi!", attributes68);
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(parseSettings70);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document15 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder0.parseFragment("", "", parseErrorList35, parseSettings36);
        org.jsoup.parser.Token token38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = xmlTreeBuilder0.process(token38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.nodes.Attributes attributes33 = null;
        boolean boolean34 = xmlTreeBuilder0.processStartTag("hi!", attributes33);
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder39.parse("", "hi!");
        org.jsoup.nodes.Document document46 = xmlTreeBuilder39.parse("", "");
        org.jsoup.nodes.Document document49 = xmlTreeBuilder39.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder53.parseFragment("hi!", "hi!", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder53.parseFragment("", "", parseErrorList61, parseSettings62);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.ParseSettings parseSettings71 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder67.parseFragment("hi!", "hi!", parseErrorList70, parseSettings71);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder67.parseFragment("", "", parseErrorList75, parseSettings76);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder67.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder53.parseFragment("", "hi!", parseErrorList66, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder39.parseFragment("", "hi!", parseErrorList52, parseSettings78);
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList38, parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token token83 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = xmlTreeBuilder0.process(token83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings82);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder35.parse("hi!", "hi!");
        org.jsoup.nodes.Document document41 = xmlTreeBuilder35.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList34, parseSettings42);
        org.jsoup.nodes.Attributes attributes45 = null;
        boolean boolean46 = xmlTreeBuilder0.processStartTag("hi!", attributes45);
        org.jsoup.nodes.Attributes attributes48 = null;
        boolean boolean49 = xmlTreeBuilder0.processStartTag("hi!", attributes48);
        org.jsoup.nodes.Attributes attributes51 = null;
        boolean boolean52 = xmlTreeBuilder0.processStartTag("hi!", attributes51);
        org.jsoup.nodes.Document document55 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token.Comment comment56 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(document55);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder22.parseFragment("", "", parseErrorList30, parseSettings31);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder46.parseFragment("hi!", "hi!", parseErrorList49, parseSettings50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder46.parseFragment("", "hi!", parseErrorList54, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder42.parseFragment("hi!", "hi!", parseErrorList45, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document65 = xmlTreeBuilder62.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder42.parseFragment("", "hi!", parseErrorList61, parseSettings66);
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder22.parseFragment("", "", parseErrorList41, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder72.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder22.parseFragment("", "hi!", parseErrorList71, parseSettings73);
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder17.parseFragment("hi!", "hi!", parseErrorList21, parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder0.parseFragment("", "", parseErrorList16, parseSettings76);
        org.jsoup.nodes.Document document80 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass83 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings16);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder33.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList32, parseSettings47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder52.parseFragment("hi!", "hi!", parseErrorList55, parseSettings56);
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder52.parseFragment("", "", parseErrorList60, parseSettings61);
        org.jsoup.nodes.Document document65 = xmlTreeBuilder52.parse("hi!", "");
        org.jsoup.nodes.Document document68 = xmlTreeBuilder52.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder72.parseFragment("hi!", "hi!", parseErrorList75, parseSettings76);
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.ParseSettings parseSettings81 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList82 = xmlTreeBuilder72.parseFragment("", "", parseErrorList80, parseSettings81);
        org.jsoup.parser.ParseSettings parseSettings83 = xmlTreeBuilder72.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder52.parseFragment("", "hi!", parseErrorList71, parseSettings83);
        java.util.List<org.jsoup.nodes.Node> nodeList85 = xmlTreeBuilder24.parseFragment("hi!", "", parseErrorList51, parseSettings83);
        org.jsoup.nodes.Document document88 = xmlTreeBuilder24.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings90 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList91 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList23, parseSettings90);
        org.jsoup.parser.ParseSettings parseSettings92 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes94 = null;
        boolean boolean95 = xmlTreeBuilder0.processStartTag("hi!", attributes94);
        org.jsoup.parser.ParseSettings parseSettings96 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes98 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = xmlTreeBuilder0.processStartTag("", attributes98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertNotNull(parseSettings89);
        org.junit.Assert.assertNotNull(parseSettings90);
        org.junit.Assert.assertNotNull(nodeList91);
        org.junit.Assert.assertNotNull(parseSettings92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(parseSettings96);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder7.parseFragment("", "", parseErrorList15, parseSettings16);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder7.parse("hi!", "");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder7.parse("hi!", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder7.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder39.parseFragment("hi!", "hi!", parseErrorList42, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder39.parseFragment("", "", parseErrorList47, parseSettings48);
        org.jsoup.nodes.Document document52 = xmlTreeBuilder39.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList38, parseSettings53);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder58.parseFragment("hi!", "hi!", parseErrorList61, parseSettings62);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder58.parseFragment("", "", parseErrorList66, parseSettings67);
        org.jsoup.nodes.Document document71 = xmlTreeBuilder58.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document78 = xmlTreeBuilder75.parse("hi!", "hi!");
        org.jsoup.nodes.Document document81 = xmlTreeBuilder75.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder75.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder58.parseFragment("", "hi!", parseErrorList74, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList57, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList85 = xmlTreeBuilder7.parseFragment("hi!", "", parseErrorList29, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList86 = xmlTreeBuilder0.parseFragment("", "", parseErrorList6, parseSettings82);
        org.jsoup.parser.Token.StartTag startTag87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element88 = xmlTreeBuilder0.insert(startTag87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertNotNull(nodeList86);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder36.parseFragment("hi!", "hi!", parseErrorList39, parseSettings41);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList35, parseSettings41);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder47.parse("hi!", "hi!");
        org.jsoup.nodes.Document document53 = xmlTreeBuilder47.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.ParseSettings parseSettings66 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder62.parseFragment("hi!", "hi!", parseErrorList65, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.ParseSettings parseSettings71 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder62.parseFragment("", "hi!", parseErrorList70, parseSettings71);
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder58.parseFragment("hi!", "hi!", parseErrorList61, parseSettings73);
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document81 = xmlTreeBuilder78.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder78.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder58.parseFragment("", "hi!", parseErrorList77, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder47.parseFragment("", "", parseErrorList57, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList85 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList46, parseSettings82);
        org.jsoup.nodes.Document document88 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertNotNull(parseSettings89);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder11.parseFragment("hi!", "hi!", parseErrorList14, parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder11.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList10, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder41.parse("hi!", "hi!");
        org.jsoup.nodes.Document document47 = xmlTreeBuilder41.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder35.parseFragment("hi!", "", parseErrorList40, parseSettings48);
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList34, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder55.parseFragment("hi!", "hi!", parseErrorList58, parseSettings59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.ParseSettings parseSettings64 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder55.parseFragment("", "", parseErrorList63, parseSettings64);
        org.jsoup.nodes.Document document68 = xmlTreeBuilder55.parse("hi!", "");
        org.jsoup.nodes.Document document71 = xmlTreeBuilder55.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList54, parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes77 = null;
        boolean boolean78 = xmlTreeBuilder0.processStartTag("hi!", attributes77);
        org.jsoup.nodes.Document document81 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document84 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token.Doctype doctype85 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(document84);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder24.parseFragment("", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList19, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList49, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder0.parseFragment("", "", parseErrorList55, parseSettings56);
        org.jsoup.nodes.Document document60 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse(reader62, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parseSettings61);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder7.parseFragment("", "", parseErrorList15, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder7.parseFragment("hi!", "hi!", parseErrorList20, parseSettings23);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder0.parseFragment("", "", parseErrorList6, parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder30.parseFragment("hi!", "hi!", parseErrorList33, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings45);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList39, parseSettings45);
        org.jsoup.nodes.Document document50 = xmlTreeBuilder30.parse("", "");
        org.jsoup.nodes.Attributes attributes52 = null;
        boolean boolean53 = xmlTreeBuilder30.processStartTag("hi!", attributes52);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.nodes.Document document57 = xmlTreeBuilder30.parse("hi!", "");
        org.jsoup.nodes.Document document60 = xmlTreeBuilder30.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder0.parseFragment("", "", parseErrorList29, parseSettings61);
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder70 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.ParseSettings parseSettings74 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder70.parseFragment("hi!", "hi!", parseErrorList73, parseSettings74);
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        org.jsoup.parser.ParseSettings parseSettings79 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder70.parseFragment("", "hi!", parseErrorList78, parseSettings79);
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder70.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList82 = xmlTreeBuilder66.parseFragment("hi!", "hi!", parseErrorList69, parseSettings81);
        org.jsoup.parser.ParseSettings parseSettings83 = xmlTreeBuilder66.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings84 = xmlTreeBuilder66.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList85 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList65, parseSettings84);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertNotNull(nodeList85);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList19, parseSettings24);
        org.jsoup.nodes.Document document28 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder36.parseFragment("hi!", "hi!", parseErrorList39, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder36.parseFragment("", "hi!", parseErrorList44, parseSettings45);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder36.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder32.parseFragment("hi!", "hi!", parseErrorList35, parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder59.parseFragment("hi!", "hi!", parseErrorList62, parseSettings63);
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.ParseSettings parseSettings68 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder59.parseFragment("", "hi!", parseErrorList67, parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder59.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder55.parseFragment("hi!", "hi!", parseErrorList58, parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder32.parseFragment("", "hi!", parseErrorList54, parseSettings72);
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList31, parseSettings72);
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.parser.ParseSettings parseSettings82 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder78.parseFragment("hi!", "hi!", parseErrorList81, parseSettings82);
        org.jsoup.parser.ParseErrorList parseErrorList86 = null;
        org.jsoup.parser.ParseSettings parseSettings87 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList88 = xmlTreeBuilder78.parseFragment("", "hi!", parseErrorList86, parseSettings87);
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder78.defaultSettings();
        org.jsoup.nodes.Document document92 = xmlTreeBuilder78.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings93 = xmlTreeBuilder78.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings94 = xmlTreeBuilder78.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList95 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList77, parseSettings94);
        java.io.Reader reader96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document98 = xmlTreeBuilder0.parse(reader96, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertNotNull(parseSettings89);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertNotNull(parseSettings93);
        org.junit.Assert.assertNotNull(parseSettings94);
        org.junit.Assert.assertNotNull(nodeList95);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document31 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = xmlTreeBuilder0.insert(startTag33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseSettings32);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("hi!", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings13);
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder0.parse("hi!", "");
        java.lang.Class<?> wildcardClass22 = document21.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("hi!", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList21, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder18.parseFragment("", "", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder0.parseFragment("", "", parseErrorList17, parseSettings29);
        org.jsoup.nodes.Attributes attributes32 = null;
        boolean boolean33 = xmlTreeBuilder0.processStartTag("hi!", attributes32);
        org.jsoup.nodes.Attributes attributes35 = null;
        boolean boolean36 = xmlTreeBuilder0.processStartTag("hi!", attributes35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder50.parseFragment("hi!", "hi!", parseErrorList53, parseSettings55);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder40.parseFragment("", "hi!", parseErrorList49, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.nodes.Document document61 = xmlTreeBuilder40.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder0.parseFragment("", "", parseErrorList39, parseSettings62);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("hi!", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder13.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder33.parseFragment("hi!", "hi!", parseErrorList36, parseSettings37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder33.parseFragment("", "", parseErrorList41, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder13.parseFragment("", "hi!", parseErrorList32, parseSettings44);
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder0.parseFragment("", "", parseErrorList12, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder50.parseFragment("hi!", "hi!", parseErrorList53, parseSettings54);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder50.parseFragment("", "", parseErrorList58, parseSettings59);
        org.jsoup.nodes.Document document63 = xmlTreeBuilder50.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.nodes.Document document67 = xmlTreeBuilder50.parse("hi!", "");
        org.jsoup.nodes.Document document70 = xmlTreeBuilder50.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList49, parseSettings72);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(nodeList73);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse("", "");
        java.io.Reader reader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document29 = xmlTreeBuilder0.parse(reader27, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document67 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        org.jsoup.parser.Token token71 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = xmlTreeBuilder0.process(token71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token token26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = xmlTreeBuilder0.process(token26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("hi!", "hi!");
        org.jsoup.nodes.Document document39 = xmlTreeBuilder33.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder27.parseFragment("hi!", "", parseErrorList32, parseSettings40);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder0.parseFragment("", "", parseErrorList26, parseSettings40);
        org.jsoup.nodes.Document document45 = xmlTreeBuilder0.parse("hi!", "");
        java.io.Reader reader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder49.parseFragment("hi!", "hi!", parseErrorList52, parseSettings53);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlTreeBuilder49.parseFragment("", "", parseErrorList57, parseSettings58);
        org.jsoup.nodes.Document document62 = xmlTreeBuilder49.parse("hi!", "");
        org.jsoup.nodes.Document document65 = xmlTreeBuilder49.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.nodes.Document document69 = xmlTreeBuilder49.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder49.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader46, "", parseErrorList48, parseSettings70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(parseSettings70);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes15 = null;
        boolean boolean16 = xmlTreeBuilder0.processStartTag("hi!", attributes15);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("hi!", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder22.parseFragment("", "", parseErrorList30, parseSettings31);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder22.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder46.parseFragment("hi!", "hi!", parseErrorList49, parseSettings50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder46.parseFragment("", "hi!", parseErrorList54, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder42.parseFragment("hi!", "hi!", parseErrorList45, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document65 = xmlTreeBuilder62.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder42.parseFragment("", "hi!", parseErrorList61, parseSettings66);
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder22.parseFragment("", "", parseErrorList41, parseSettings66);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder72.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder22.parseFragment("", "hi!", parseErrorList71, parseSettings73);
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder17.parseFragment("hi!", "hi!", parseErrorList21, parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder0.parseFragment("", "", parseErrorList16, parseSettings76);
        org.jsoup.nodes.Document document80 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document84 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token.Doctype doctype85 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(document84);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.nodes.Document document44 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder48.parseFragment("hi!", "hi!", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder48.parseFragment("", "", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList47, parseSettings59);
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList27, parseSettings59);
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes66 = null;
        boolean boolean67 = xmlTreeBuilder0.processStartTag("hi!", attributes66);
        org.jsoup.nodes.Document document70 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes72 = null;
        boolean boolean73 = xmlTreeBuilder0.processStartTag("hi!", attributes72);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes38 = null;
        boolean boolean39 = xmlTreeBuilder0.processStartTag("hi!", attributes38);
        org.jsoup.parser.Token token40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = xmlTreeBuilder0.process(token40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("", "hi!");
        java.io.Reader reader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader23, "hi!", parseErrorList25, parseSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder11.parseFragment("hi!", "hi!", parseErrorList14, parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder11.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList10, parseSettings30);
        org.jsoup.nodes.Document document34 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document37 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token.StartTag startTag38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = xmlTreeBuilder0.insert(startTag38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document37);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.nodes.Document document51 = xmlTreeBuilder45.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList44, parseSettings52);
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList27, parseSettings52);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder59.parse("hi!", "hi!");
        org.jsoup.nodes.Document document65 = xmlTreeBuilder59.parse("", "hi!");
        org.jsoup.nodes.Document document68 = xmlTreeBuilder59.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes70 = null;
        boolean boolean71 = xmlTreeBuilder59.processStartTag("hi!", attributes70);
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder59.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder0.parseFragment("", "", parseErrorList58, parseSettings72);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(nodeList73);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document15 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("hi!", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "", parseErrorList28, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder20.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("hi!", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder40.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList39, parseSettings51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder56.parseFragment("hi!", "hi!", parseErrorList59, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList55, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes67 = null;
        boolean boolean68 = xmlTreeBuilder0.processStartTag("hi!", attributes67);
        org.jsoup.nodes.Document document71 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parseSettings72);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder25.parseFragment("", "", parseErrorList33, parseSettings34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder25.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder25.defaultSettings();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder25.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList24, parseSettings43);
        org.jsoup.nodes.Document document47 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token token48 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = xmlTreeBuilder0.process(token48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(document47);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder37.parseFragment("hi!", "hi!", parseErrorList40, parseSettings41);
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder37.parseFragment("", "", parseErrorList45, parseSettings46);
        org.jsoup.nodes.Document document50 = xmlTreeBuilder37.parse("hi!", "");
        org.jsoup.nodes.Document document53 = xmlTreeBuilder37.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder61.parseFragment("hi!", "hi!", parseErrorList64, parseSettings65);
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder61.parseFragment("", "hi!", parseErrorList69, parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder61.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder57.parseFragment("hi!", "hi!", parseErrorList60, parseSettings72);
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder77 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document80 = xmlTreeBuilder77.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder77.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList82 = xmlTreeBuilder57.parseFragment("", "hi!", parseErrorList76, parseSettings81);
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder37.parseFragment("", "", parseErrorList56, parseSettings81);
        org.jsoup.parser.ParseErrorList parseErrorList86 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder87 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder87.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder37.parseFragment("", "hi!", parseErrorList86, parseSettings88);
        java.util.List<org.jsoup.nodes.Node> nodeList90 = xmlTreeBuilder32.parseFragment("hi!", "hi!", parseErrorList36, parseSettings88);
        org.jsoup.nodes.Document document93 = xmlTreeBuilder32.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings94 = xmlTreeBuilder32.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader29, "hi!", parseErrorList31, parseSettings94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(nodeList82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(nodeList90);
        org.junit.Assert.assertNotNull(document93);
        org.junit.Assert.assertNotNull(parseSettings94);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("hi!", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings13);
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes20 = null;
        boolean boolean21 = xmlTreeBuilder0.processStartTag("hi!", attributes20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass24 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes7 = null;
        boolean boolean8 = xmlTreeBuilder0.processStartTag("hi!", attributes7);
        org.jsoup.nodes.Document document11 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes14 = null;
        boolean boolean15 = xmlTreeBuilder0.processStartTag("hi!", attributes14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder24.parseFragment("hi!", "hi!", parseErrorList27, parseSettings28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder24.parseFragment("", "", parseErrorList32, parseSettings33);
        org.jsoup.nodes.Document document37 = xmlTreeBuilder24.parse("hi!", "");
        org.jsoup.nodes.Document document40 = xmlTreeBuilder24.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder48.parseFragment("hi!", "hi!", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder48.parseFragment("", "hi!", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder44.parseFragment("hi!", "hi!", parseErrorList47, parseSettings59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document67 = xmlTreeBuilder64.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder64.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder44.parseFragment("", "hi!", parseErrorList63, parseSettings68);
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder24.parseFragment("", "", parseErrorList43, parseSettings68);
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder74 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder74.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder24.parseFragment("", "hi!", parseErrorList73, parseSettings75);
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder19.parseFragment("hi!", "hi!", parseErrorList23, parseSettings75);
        org.jsoup.nodes.Document document80 = xmlTreeBuilder19.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList18, parseSettings82);
        java.lang.Class<?> wildcardClass84 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings4 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder8.parseFragment("hi!", "hi!", parseErrorList11, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder8.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder23.parseFragment("hi!", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder23.parseFragment("", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder19.parseFragment("hi!", "hi!", parseErrorList22, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder8.parseFragment("", "hi!", parseErrorList18, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder49.parse("hi!", "hi!");
        org.jsoup.nodes.Document document55 = xmlTreeBuilder49.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder43.parseFragment("hi!", "", parseErrorList48, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder8.parseFragment("hi!", "hi!", parseErrorList42, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder8.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList7, parseSettings59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder68.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder64.parseFragment("hi!", "hi!", parseErrorList67, parseSettings69);
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder0.parseFragment("", "", parseErrorList63, parseSettings69);
        org.jsoup.nodes.Attributes attributes73 = null;
        boolean boolean74 = xmlTreeBuilder0.processStartTag("hi!", attributes73);
        org.jsoup.nodes.Document document77 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes79 = null;
        boolean boolean80 = xmlTreeBuilder0.processStartTag("hi!", attributes79);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.nodes.Document document51 = xmlTreeBuilder45.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList44, parseSettings52);
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList27, parseSettings52);
        org.jsoup.nodes.Attributes attributes56 = null;
        boolean boolean57 = xmlTreeBuilder0.processStartTag("hi!", attributes56);
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment63 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseSettings62);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Doctype doctype14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder5.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder5.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList28, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder25.parseFragment("", "hi!", parseErrorList44, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder5.parseFragment("", "", parseErrorList24, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList4, parseSettings56);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document67 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        org.jsoup.nodes.Document document73 = xmlTreeBuilder0.parse("", "");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(document73);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList34, parseSettings36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder45.parseFragment("hi!", "hi!", parseErrorList48, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder45.parseFragment("", "hi!", parseErrorList53, parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder41.parseFragment("hi!", "hi!", parseErrorList44, parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.nodes.Document document61 = xmlTreeBuilder41.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList40, parseSettings62);
        org.jsoup.nodes.Document document66 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "hi!", parseErrorList13, parseSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList9, parseSettings15);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder0.processStartTag("hi!", attributes22);
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document30 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype32 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "hi!", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder5.parseFragment("hi!", "hi!", parseErrorList8, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder5.parseFragment("", "hi!", parseErrorList24, parseSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings29);
        org.jsoup.nodes.Attributes attributes33 = null;
        boolean boolean34 = xmlTreeBuilder0.processStartTag("hi!", attributes33);
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes37 = null;
        boolean boolean38 = xmlTreeBuilder0.processStartTag("hi!", attributes37);
        org.jsoup.nodes.Attributes attributes40 = null;
        boolean boolean41 = xmlTreeBuilder0.processStartTag("hi!", attributes40);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes44 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = xmlTreeBuilder0.processStartTag("", attributes44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(parseSettings42);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("hi!", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList8, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("hi!", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder28.parseFragment("", "", parseErrorList36, parseSettings37);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.nodes.Document document44 = xmlTreeBuilder28.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder48.parseFragment("hi!", "hi!", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder48.parseFragment("", "", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList47, parseSettings59);
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList27, parseSettings59);
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document68 = xmlTreeBuilder0.parse("", "hi!");
        java.io.Reader reader69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document71 = xmlTreeBuilder0.parse(reader69, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(document68);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList23, parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder35.parseFragment("hi!", "hi!", parseErrorList38, parseSettings39);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder35.parseFragment("", "hi!", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder31.parseFragment("hi!", "hi!", parseErrorList34, parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder20.parseFragment("", "hi!", parseErrorList30, parseSettings50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document64 = xmlTreeBuilder61.parse("hi!", "hi!");
        org.jsoup.nodes.Document document67 = xmlTreeBuilder61.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder61.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder55.parseFragment("hi!", "", parseErrorList60, parseSettings68);
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder20.parseFragment("hi!", "hi!", parseErrorList54, parseSettings68);
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList19, parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document75 = xmlTreeBuilder0.parse("hi!", "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(document75);
    }
}

