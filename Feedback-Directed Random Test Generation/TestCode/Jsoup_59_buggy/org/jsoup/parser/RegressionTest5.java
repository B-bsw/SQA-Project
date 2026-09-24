package org.jsoup.parser;

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
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        java.lang.String str4 = character3.toString();
        java.lang.String str5 = character3.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "comment" + "'", str4, "comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "comment" + "'", str5, "comment");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        java.lang.String str7 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes14 = startTag8.attributes;
        startTag0.attributes = attributes14;
        org.jsoup.parser.Token.Tag tag17 = startTag0.name("<hi!>");
        boolean boolean18 = tag17.isDoctype();
        org.jsoup.parser.Token.Tag tag19 = tag17.reset();
        org.jsoup.nodes.Attributes attributes20 = tag17.getAttributes();
        org.jsoup.parser.Token.Tag tag22 = tag17.name("Commentcomment");
        org.jsoup.nodes.Attributes attributes23 = tag17.attributes;
        java.lang.String str24 = tag17.normalName();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "commentcomment" + "'", str24, "commentcomment");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = doctype0.isDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        boolean boolean7 = startTag0.isCharacter();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("Character");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.parser.Token.StartTag startTag12 = startTag11.asStartTag();
        startTag11.finaliseTag();
        org.jsoup.parser.Token.Tag tag14 = startTag11.reset();
        tag14.newAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        tag5.appendAttributeValue(charArray8);
        org.jsoup.parser.Token.Tag tag11 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        startTag12.appendAttributeName("hi!");
        startTag12.appendAttributeName('a');
        java.lang.String str19 = startTag12.normalName;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        org.jsoup.nodes.Attributes attributes23 = null;
        startTag20.attributes = attributes23;
        org.jsoup.parser.Token.Tag tag25 = startTag20.reset();
        org.jsoup.nodes.Attributes attributes26 = startTag20.attributes;
        startTag12.attributes = attributes26;
        org.jsoup.parser.Token.Tag tag29 = startTag12.name("<hi!>");
        boolean boolean30 = tag29.isDoctype();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        startTag31.appendTagName("");
        org.jsoup.nodes.Attributes attributes34 = null;
        startTag31.attributes = attributes34;
        startTag31.newAttribute();
        org.jsoup.nodes.Attributes attributes37 = startTag31.getAttributes();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        char[] charArray42 = new char[] {};
        startTag41.appendAttributeValue(charArray42);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes45 = startTag44.attributes;
        startTag41.attributes = attributes45;
        startTag38.attributes = attributes45;
        startTag38.selfClosing = false;
        startTag38.appendAttributeName('4');
        startTag38.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes54 = startTag38.attributes;
        startTag31.attributes = attributes54;
        tag29.attributes = attributes54;
        tag5.attributes = attributes54;
        tag5.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributes54);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag13 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag14 = startTag0.reset();
        startTag0.tagName = "<Doctype>";
        org.jsoup.nodes.Attributes attributes17 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag18 = startTag0.asStartTag();
        boolean boolean19 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag0.appendAttributeName("<!---->");
        boolean boolean25 = startTag0.isStartTag();
        startTag0.setEmptyAttributeValue();
        java.lang.Class<?> wildcardClass27 = startTag0.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes6 = startTag5.attributes;
        startTag5.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes9 = startTag5.getAttributes();
        java.lang.String str10 = startTag5.tagName;
        java.lang.String str11 = startTag5.toString();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        startTag12.appendAttributeName("hi!");
        startTag12.appendAttributeName('a');
        java.lang.String str19 = startTag12.normalName;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        org.jsoup.nodes.Attributes attributes23 = null;
        startTag20.attributes = attributes23;
        org.jsoup.parser.Token.Tag tag25 = startTag20.reset();
        org.jsoup.nodes.Attributes attributes26 = startTag20.attributes;
        startTag12.attributes = attributes26;
        startTag5.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag29 = startTag0.nameAttr("StartTag", attributes26);
        startTag0.appendAttributeName("<hi!>");
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag29);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        org.jsoup.nodes.Attributes attributes10 = null;
        startTag7.attributes = attributes10;
        startTag7.appendTagName("");
        java.lang.String str14 = startTag7.tagName;
        startTag7.appendTagName('#');
        org.jsoup.nodes.Attributes attributes17 = startTag7.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType18 = startTag7.type;
        startTag0.type = tokenType18;
        java.lang.String str20 = startTag0.normalName;
        java.lang.String str21 = startTag0.normalName();
        java.lang.String str22 = startTag0.toString();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#" + "'", str20, "#");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#" + "'", str21, "#");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<#>" + "'", str22, "<#>");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getName();
        java.lang.StringBuilder stringBuilder9 = doctype2.name;
        doctype2.forceQuirks = false;
        boolean boolean12 = doctype2.forceQuirks;
        java.lang.String str13 = doctype2.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.appendAttributeName("<!---->");
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        startTag7.appendAttributeName("hi!");
        startTag7.appendTagName("<!---->");
        startTag7.setEmptyAttributeValue();
        startTag7.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = startTag20.attributes;
        startTag17.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        org.jsoup.nodes.Attributes attributes27 = startTag24.getAttributes();
        org.jsoup.parser.Token.StartTag startTag28 = startTag17.nameAttr("", attributes27);
        java.lang.String str29 = startTag28.tagName;
        startTag28.appendAttributeName('a');
        startTag28.tagName = "";
        java.lang.String str34 = startTag28.normalName();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = startTag41.attributes;
        startTag38.attributes = attributes42;
        startTag35.attributes = attributes42;
        startTag35.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        startTag47.appendTagName("");
        java.lang.String str50 = startTag47.tagName;
        int[] intArray52 = new int[] { 0 };
        startTag47.appendAttributeValue(intArray52);
        startTag35.appendAttributeValue(intArray52);
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        startTag55.appendTagName("");
        org.jsoup.nodes.Attributes attributes58 = null;
        startTag55.attributes = attributes58;
        org.jsoup.parser.Token.Tag tag60 = startTag55.reset();
        org.jsoup.nodes.Attributes attributes61 = tag60.attributes;
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        char[] charArray63 = new char[] {};
        startTag62.appendAttributeValue(charArray63);
        tag60.appendAttributeValue(charArray63);
        startTag35.appendAttributeValue(charArray63);
        startTag28.appendAttributeValue(charArray63);
        startTag7.appendAttributeValue(charArray63);
        startTag0.appendAttributeValue(charArray63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] {});
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.getData();
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token.Character character5 = character0.data("<#>");
        org.jsoup.parser.Token token6 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        java.lang.String str10 = startTag0.tokenType();
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        boolean boolean13 = startTag0.isComment();
        org.jsoup.nodes.Attributes attributes14 = startTag0.attributes;
        boolean boolean15 = startTag0.selfClosing;
        boolean boolean16 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token token3 = character0.reset();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("starttag");
        java.lang.String str7 = character6.getData();
        java.lang.String str8 = character6.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "starttag" + "'", str7, "starttag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Character" + "'", str8, "Character");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = startTag0.type;
        java.lang.String str9 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("<a>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        boolean boolean6 = comment0.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag14 = startTag0.name("<StartTag>");
        tag14.appendTagName(' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        doctype0.pubSysKey = "Doctype";
        doctype0.pubSysKey = "<<Commentcomment>>";
        boolean boolean10 = doctype0.isStartTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = startTag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag22.attributes = attributes26;
        startTag19.attributes = attributes26;
        startTag19.appendAttributeValue('4');
        boolean boolean31 = startTag19.selfClosing;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendTagName("");
        org.jsoup.nodes.Attributes attributes35 = null;
        startTag32.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag37 = startTag32.reset();
        org.jsoup.nodes.Attributes attributes38 = startTag32.attributes;
        startTag19.attributes = attributes38;
        startTag17.attributes = attributes38;
        startTag11.attributes = attributes38;
        startTag11.appendAttributeName(' ');
        startTag11.appendAttributeValue("Character");
        java.lang.String str46 = startTag11.normalName;
        startTag11.selfClosing = false;
        startTag11.normalName = "<<hi!>>";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        startTag0.normalName = "a";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        org.jsoup.nodes.Attributes attributes17 = startTag14.getAttributes();
        boolean boolean18 = startTag14.isComment();
        org.jsoup.parser.Token.TokenType tokenType19 = startTag14.type;
        startTag14.selfClosing = true;
        org.jsoup.parser.Token.Tag tag22 = startTag14.reset();
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = startTag0.nameAttr("comment", attributes23);
        java.lang.String str25 = startTag24.normalName();
        java.lang.String str26 = startTag24.normalName();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "comment" + "'", str25, "comment");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "comment" + "'", str26, "comment");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isCharacter();
        comment0.bogus = true;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.StringBuilder stringBuilder4 = comment2.data;
        org.jsoup.parser.Token token5 = comment2.reset();
        boolean boolean6 = comment2.isEndTag();
        comment2.bogus = true;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        boolean boolean5 = comment0.isDoctype();
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.Character character11 = character8.data("StartTag");
        java.lang.String str12 = character8.getData();
        org.jsoup.parser.Token token13 = character8.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        java.lang.String str4 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        java.lang.Class<?> wildcardClass1 = endTag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        doctype0.pubSysKey = "Doctype";
        boolean boolean6 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        doctype2.forceQuirks = false;
        doctype2.pubSysKey = "#";
        org.jsoup.parser.Token token13 = doctype2.reset();
        boolean boolean14 = token13.isEOF();
        org.jsoup.parser.Token token15 = token13.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.appendAttributeValue("<!---->");
        java.lang.String str11 = startTag0.tagName;
        startTag0.finaliseTag();
        startTag0.appendTagName(' ');
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        org.jsoup.parser.Token.TokenType tokenType3 = comment0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        startTag0.tagName = "Commentcomment<<<hi!>>>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        startTag0.finaliseTag();
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.nodes.Attributes attributes14 = startTag11.getAttributes();
        boolean boolean15 = startTag11.isComment();
        org.jsoup.parser.Token.TokenType tokenType16 = startTag11.type;
        org.jsoup.parser.Token.Tag tag17 = startTag11.reset();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.nodes.Attributes attributes21 = null;
        startTag18.attributes = attributes21;
        org.jsoup.parser.Token.Tag tag23 = startTag18.reset();
        org.jsoup.nodes.Attributes attributes24 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        char[] charArray29 = new char[] {};
        startTag28.appendAttributeValue(charArray29);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = startTag31.attributes;
        startTag28.attributes = attributes32;
        startTag25.attributes = attributes32;
        startTag25.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        startTag37.appendTagName("");
        java.lang.String str40 = startTag37.tagName;
        int[] intArray42 = new int[] { 0 };
        startTag37.appendAttributeValue(intArray42);
        startTag25.appendAttributeValue(intArray42);
        startTag18.appendAttributeValue(intArray42);
        tag17.appendAttributeValue(intArray42);
        startTag0.appendAttributeValue(intArray42);
        startTag0.appendAttributeValue("commentcomment");
        startTag0.appendTagName(' ');
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 0 });
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        java.lang.String str8 = startTag0.normalName();
        boolean boolean9 = startTag0.selfClosing;
        startTag0.tagName = "<#>";
        boolean boolean12 = startTag0.isDoctype();
        java.lang.String str13 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "comment" + "'", str8, "comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "comment" + "'", str13, "comment");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.parser.Token.TokenType tokenType12 = startTag0.type;
        boolean boolean13 = startTag0.isSelfClosing();
        startTag0.appendTagName('4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isDoctype();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        startTag0.appendAttributeValue("Commentcomment");
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        boolean boolean9 = startTag0.isEndTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str12 = doctype11.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType13 = doctype11.type;
        doctype9.type = tokenType13;
        tag8.type = tokenType13;
        org.jsoup.parser.Token token16 = tag8.reset();
        tag8.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes18 = tag8.attributes;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag0.type = tokenType8;
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = tag10.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        startTag0.appendAttributeValue("Comment");
        startTag0.appendAttributeName("");
        startTag0.appendTagName('a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.normalName = "Doctype";
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = startTag11.attributes;
        startTag11.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes15 = startTag11.getAttributes();
        java.lang.String str16 = startTag11.tagName;
        boolean boolean17 = startTag11.isComment();
        boolean boolean18 = startTag11.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        java.lang.String str23 = startTag20.tagName;
        org.jsoup.parser.Token.Tag tag24 = startTag20.reset();
        boolean boolean25 = startTag20.isComment();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        char[] charArray30 = new char[] {};
        startTag29.appendAttributeValue(charArray30);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = startTag32.attributes;
        startTag29.attributes = attributes33;
        startTag26.attributes = attributes33;
        java.lang.String str36 = startTag26.normalName;
        org.jsoup.parser.Token.Tag tag37 = startTag26.reset();
        org.jsoup.parser.Token.Tag tag38 = startTag26.reset();
        startTag26.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag41.reset();
        org.jsoup.nodes.Attributes attributes43 = startTag41.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = startTag26.nameAttr("", attributes43);
        startTag20.attributes = attributes43;
        org.jsoup.parser.Token.StartTag startTag46 = startTag11.nameAttr("<#>", attributes43);
        startTag0.attributes = attributes43;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(startTag46);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPubSysKey();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.String str10 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        org.jsoup.nodes.Attributes attributes10 = null;
        startTag7.attributes = attributes10;
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes13 = tag12.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        tag12.appendAttributeValue(charArray15);
        tag5.appendAttributeValue(charArray15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        startTag19.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag25.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes29 = startTag25.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = startTag19.nameAttr("", attributes29);
        java.lang.String str31 = startTag30.tagName;
        startTag30.appendAttributeName("<!---->");
        startTag30.appendAttributeName('#');
        startTag30.appendAttributeName('a');
        startTag30.normalName = "commentcomment";
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        java.lang.String str43 = startTag40.tagName;
        startTag40.appendAttributeName("hi!");
        startTag40.appendTagName('#');
        startTag40.appendAttributeValue('a');
        java.lang.String str50 = startTag40.normalName();
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        char[] charArray55 = new char[] {};
        startTag54.appendAttributeValue(charArray55);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes58 = startTag57.attributes;
        startTag54.attributes = attributes58;
        startTag51.attributes = attributes58;
        startTag51.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        startTag63.appendTagName("");
        java.lang.String str66 = startTag63.tagName;
        int[] intArray68 = new int[] { 0 };
        startTag63.appendAttributeValue(intArray68);
        startTag51.appendAttributeValue(intArray68);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        startTag71.appendTagName("");
        org.jsoup.nodes.Attributes attributes74 = null;
        startTag71.attributes = attributes74;
        org.jsoup.parser.Token.Tag tag76 = startTag71.reset();
        org.jsoup.nodes.Attributes attributes77 = tag76.attributes;
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        char[] charArray79 = new char[] {};
        startTag78.appendAttributeValue(charArray79);
        tag76.appendAttributeValue(charArray79);
        startTag51.appendAttributeValue(charArray79);
        startTag40.appendAttributeValue(charArray79);
        startTag30.appendAttributeValue(charArray79);
        tag5.appendAttributeValue(charArray79);
        boolean boolean86 = tag5.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag87 = tag5.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#" + "'", str50, "#");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        startTag0.appendTagName("Doctype");
        boolean boolean15 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype2.name;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        char[] charArray11 = new char[] {};
        startTag10.appendAttributeValue(charArray11);
        org.jsoup.nodes.Attributes attributes13 = startTag10.getAttributes();
        startTag10.appendTagName('#');
        startTag10.finaliseTag();
        boolean boolean17 = startTag10.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        char[] charArray22 = new char[] {};
        startTag21.appendAttributeValue(charArray22);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = startTag24.attributes;
        startTag21.attributes = attributes25;
        startTag18.attributes = attributes25;
        startTag18.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName("");
        java.lang.String str33 = startTag30.tagName;
        int[] intArray35 = new int[] { 0 };
        startTag30.appendAttributeValue(intArray35);
        startTag18.appendAttributeValue(intArray35);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName("");
        org.jsoup.nodes.Attributes attributes41 = null;
        startTag38.attributes = attributes41;
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        org.jsoup.nodes.Attributes attributes44 = tag43.attributes;
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        char[] charArray46 = new char[] {};
        startTag45.appendAttributeValue(charArray46);
        tag43.appendAttributeValue(charArray46);
        startTag18.appendAttributeValue(charArray46);
        startTag10.appendAttributeValue(charArray46);
        startTag0.appendAttributeValue(charArray46);
        org.jsoup.parser.Token.Tag tag53 = startTag0.name("Commentcomment");
        org.jsoup.parser.Token.Doctype doctype54 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token55 = doctype54.reset();
        org.jsoup.parser.Token.Doctype doctype56 = token55.asDoctype();
        boolean boolean57 = doctype56.isForceQuirks();
        boolean boolean58 = doctype56.isForceQuirks();
        java.lang.String str59 = doctype56.getSystemIdentifier();
        doctype56.pubSysKey = "Doctype";
        org.jsoup.parser.Token.TokenType tokenType62 = doctype56.type;
        startTag0.type = tokenType62;
        java.lang.String str64 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment65 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(token55);
        org.junit.Assert.assertNotNull(doctype56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "commentcomment" + "'", str64, "commentcomment");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.Character character11 = character8.data("StartTag");
        org.jsoup.parser.Token token12 = character8.reset();
        org.jsoup.parser.Token token13 = character8.reset();
        java.lang.String str14 = character8.getData();
        java.lang.String str15 = character8.tokenType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Character" + "'", str15, "Character");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        startTag0.finaliseTag();
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.nodes.Attributes attributes14 = startTag11.getAttributes();
        boolean boolean15 = startTag11.isComment();
        org.jsoup.parser.Token.TokenType tokenType16 = startTag11.type;
        org.jsoup.parser.Token.Tag tag17 = startTag11.reset();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.nodes.Attributes attributes21 = null;
        startTag18.attributes = attributes21;
        org.jsoup.parser.Token.Tag tag23 = startTag18.reset();
        org.jsoup.nodes.Attributes attributes24 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        char[] charArray29 = new char[] {};
        startTag28.appendAttributeValue(charArray29);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = startTag31.attributes;
        startTag28.attributes = attributes32;
        startTag25.attributes = attributes32;
        startTag25.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        startTag37.appendTagName("");
        java.lang.String str40 = startTag37.tagName;
        int[] intArray42 = new int[] { 0 };
        startTag37.appendAttributeValue(intArray42);
        startTag25.appendAttributeValue(intArray42);
        startTag18.appendAttributeValue(intArray42);
        tag17.appendAttributeValue(intArray42);
        startTag0.appendAttributeValue(intArray42);
        startTag0.appendAttributeValue("commentcomment");
        org.jsoup.parser.Token.Tag tag50 = startTag0.reset();
        java.lang.String str51 = tag50.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        comment0.bogus = true;
        boolean boolean5 = comment0.bogus;
        boolean boolean6 = comment0.isStartTag();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes13 = startTag0.attributes;
        startTag0.appendAttributeName("Character");
        startTag0.tagName = "";
        startTag0.setEmptyAttributeValue();
        java.lang.String str19 = startTag0.normalName();
        startTag0.appendAttributeName("<hi!>");
        java.lang.String str22 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = tag4.isDoctype();
        tag4.appendTagName("<Commentcomment#>");
        tag4.appendAttributeValue("<commentcomment>");
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = tag4.isDoctype();
        tag4.appendTagName("<Commentcomment#>");
        tag4.appendAttributeName("Commentcomment<<<hi!>>>");
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = false;
        comment0.bogus = false;
        org.jsoup.parser.Token token11 = comment0.reset();
        java.lang.String str12 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.appendTagName("");
        org.jsoup.nodes.Attributes attributes6 = null;
        startTag3.attributes = attributes6;
        startTag3.appendAttributeValue("hi!");
        startTag3.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType12 = startTag3.type;
        comment0.type = tokenType12;
        java.lang.String str14 = comment0.getData();
        java.lang.StringBuilder stringBuilder15 = comment0.data;
        org.jsoup.parser.Token token16 = comment0.reset();
        java.lang.String str17 = comment0.toString();
        org.jsoup.parser.Token token18 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(token18);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        doctype0.pubSysKey = "<!---->";
        java.lang.String str12 = doctype0.getPublicIdentifier();
        java.lang.String str13 = doctype0.pubSysKey;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment14 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType2 = startTag0.type;
        boolean boolean3 = startTag0.isSelfClosing();
        boolean boolean4 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag0.type = tokenType8;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        char[] charArray14 = new char[] {};
        startTag13.appendAttributeValue(charArray14);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = startTag16.attributes;
        startTag13.attributes = attributes17;
        startTag10.attributes = attributes17;
        java.lang.String str20 = startTag10.normalName;
        org.jsoup.parser.Token.Tag tag21 = startTag10.reset();
        org.jsoup.parser.Token.Tag tag22 = startTag10.reset();
        startTag10.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        org.jsoup.nodes.Attributes attributes27 = startTag25.attributes;
        org.jsoup.parser.Token.StartTag startTag28 = startTag10.nameAttr("", attributes27);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.nodes.Attributes attributes32 = null;
        startTag29.attributes = attributes32;
        org.jsoup.parser.Token.Tag tag34 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes35 = startTag29.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = startTag42.attributes;
        startTag39.attributes = attributes43;
        startTag36.attributes = attributes43;
        startTag36.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        startTag48.appendTagName("");
        java.lang.String str51 = startTag48.tagName;
        int[] intArray53 = new int[] { 0 };
        startTag48.appendAttributeValue(intArray53);
        startTag36.appendAttributeValue(intArray53);
        startTag29.appendAttributeValue(intArray53);
        startTag28.appendAttributeValue(intArray53);
        startTag0.appendAttributeValue(intArray53);
        org.jsoup.parser.Token token59 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 0 });
        org.junit.Assert.assertNotNull(token59);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("Comment");
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes12 = startTag0.getAttributes();
        boolean boolean13 = startTag0.isStartTag();
        startTag0.tagName = "<comment>";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.StringBuilder stringBuilder4 = comment2.data;
        org.jsoup.parser.Token token5 = comment2.reset();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character2.getData();
        boolean boolean4 = character2.isEndTag();
        java.lang.String str5 = character2.toString();
        java.lang.String str6 = character2.getData();
        java.lang.String str7 = character2.toString();
        org.jsoup.parser.Token.Character character9 = character2.data("");
        org.jsoup.parser.Token.Character character10 = character2.asCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(character10);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.pubSysKey;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getSystemIdentifier();
        java.lang.String str6 = doctype2.getPublicIdentifier();
        java.lang.String str7 = doctype2.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        java.lang.String str6 = character0.getData();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag11.attributes = attributes15;
        startTag8.attributes = attributes15;
        startTag8.selfClosing = false;
        startTag8.appendAttributeName('4');
        startTag8.newAttribute();
        startTag8.selfClosing = false;
        org.jsoup.parser.Token.Tag tag25 = startTag8.reset();
        boolean boolean26 = startTag8.isSelfClosing();
        startTag8.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Tag tag29 = startTag8.reset();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName("");
        org.jsoup.nodes.Attributes attributes33 = null;
        startTag30.attributes = attributes33;
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        org.jsoup.nodes.Attributes attributes36 = startTag30.attributes;
        startTag30.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.EndTag;
        startTag30.type = tokenType38;
        startTag8.type = tokenType38;
        character0.type = tokenType38;
        java.lang.String str42 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        doctype2.forceQuirks = false;
        doctype2.pubSysKey = "#";
        boolean boolean13 = doctype2.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype2.name;
        java.lang.StringBuilder stringBuilder15 = doctype2.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = doctype2.systemIdentifier;
        java.lang.String str17 = doctype2.getSystemIdentifier();
        boolean boolean18 = doctype2.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token token7 = comment0.reset();
        boolean boolean8 = comment0.isCharacter();
        comment0.bogus = false;
        boolean boolean11 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        boolean boolean9 = doctype2.forceQuirks;
        java.lang.String str10 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = startTag11.attributes;
        startTag11.tagName = "hi!";
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.TokenType tokenType16 = character15.type;
        startTag11.type = tokenType16;
        doctype2.type = tokenType16;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        java.lang.String str10 = startTag0.tokenType();
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        startTag0.tagName = "<#>";
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        org.jsoup.nodes.Attributes attributes17 = startTag14.getAttributes();
        boolean boolean18 = startTag14.isComment();
        org.jsoup.parser.Token.TokenType tokenType19 = startTag14.type;
        startTag14.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag22 = startTag14.asStartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag14.name("Comment");
        org.jsoup.parser.Token.Tag tag25 = startTag14.reset();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        char[] charArray27 = new char[] {};
        startTag26.appendAttributeValue(charArray27);
        org.jsoup.nodes.Attributes attributes29 = startTag26.getAttributes();
        boolean boolean30 = startTag26.isComment();
        org.jsoup.parser.Token.TokenType tokenType31 = startTag26.type;
        startTag26.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag34 = startTag26.asStartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag26.name("Comment");
        startTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes38 = startTag26.getAttributes();
        startTag14.attributes = attributes38;
        startTag0.attributes = attributes38;
        startTag0.setEmptyAttributeValue();
        java.lang.String str42 = startTag0.normalName();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        boolean boolean7 = startTag0.isCharacter();
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        boolean boolean9 = startTag0.isSelfClosing();
        boolean boolean10 = startTag0.isCharacter();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        org.jsoup.nodes.Attributes attributes15 = startTag12.getAttributes();
        startTag12.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag18 = startTag12.asStartTag();
        startTag18.normalName = "hi!";
        java.lang.String str21 = startTag18.tokenType();
        boolean boolean22 = startTag18.isDoctype();
        startTag18.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes24 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        char[] charArray27 = new char[] {};
        startTag26.appendAttributeValue(charArray27);
        startTag26.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag32 = startTag26.name("Comment");
        startTag26.appendTagName("comment");
        java.lang.String str35 = startTag26.normalName();
        org.jsoup.parser.Token.Tag tag36 = startTag26.reset();
        boolean boolean37 = startTag26.isComment();
        org.jsoup.nodes.Attributes attributes38 = startTag26.attributes;
        org.jsoup.parser.Token.StartTag startTag39 = startTag18.nameAttr("Character", attributes38);
        org.jsoup.parser.Token.StartTag startTag40 = startTag0.nameAttr(" ", attributes38);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StartTag" + "'", str21, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "commentcomment" + "'", str35, "commentcomment");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(startTag40);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        org.jsoup.nodes.Attributes attributes17 = startTag15.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = startTag0.nameAttr("", attributes17);
        org.jsoup.parser.Token.Tag tag20 = startTag0.name("<Commentcomment#>");
        org.jsoup.parser.Token.Tag tag22 = tag20.name("Doctype");
        java.lang.String str23 = tag20.name();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Doctype" + "'", str23, "Doctype");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag14.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag19 = startTag14.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.jsoup.nodes.Attributes attributes21 = tag19.getAttributes();
        startTag0.attributes = attributes21;
        boolean boolean23 = startTag0.selfClosing;
        boolean boolean24 = startTag0.isEndTag();
        startTag0.appendAttributeValue("Commentcomment");
        org.jsoup.parser.Token.StartTag startTag27 = startTag0.asStartTag();
        org.jsoup.parser.Token.TokenType tokenType28 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag27.type = tokenType28;
        startTag27.setEmptyAttributeValue();
        java.lang.String str31 = startTag27.normalName();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<<hi!>>");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        boolean boolean14 = startTag0.isDoctype();
        startTag0.tagName = "<hi!>";
        java.lang.String str17 = startTag0.normalName();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        tag11.appendAttributeName(' ');
        java.lang.String str14 = tag11.normalName;
        tag11.normalName = "<<<!---->>>";
        java.lang.Class<?> wildcardClass17 = tag11.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        org.jsoup.parser.Token.Tag tag10 = tag8.name("commentcomment#");
        tag10.appendTagName('#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token6 = doctype0.reset();
        boolean boolean7 = doctype0.isDoctype();
        doctype0.pubSysKey = "<   a>";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        startTag0.normalName = "Comment";
        java.lang.String str6 = startTag0.tokenType();
        startTag0.appendAttributeName("StartTag");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.appendAttributeValue("<!---->");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendTagName("");
        java.lang.String str14 = startTag11.tagName;
        startTag11.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = startTag17.attributes;
        startTag17.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes21 = startTag17.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag11.nameAttr("", attributes21);
        org.jsoup.parser.Token.TokenType tokenType23 = startTag22.type;
        org.jsoup.parser.Token.Tag tag25 = startTag22.name("StartTag");
        org.jsoup.nodes.Attributes attributes26 = tag25.getAttributes();
        org.jsoup.parser.Token.Tag tag28 = tag25.name("<<hi!>>");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.nodes.Attributes attributes32 = null;
        startTag29.attributes = attributes32;
        startTag29.appendAttributeValue("hi!");
        startTag29.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType38 = startTag29.type;
        startTag29.appendAttributeValue("Comment");
        boolean boolean41 = startTag29.isCharacter();
        boolean boolean42 = startTag29.isSelfClosing();
        startTag29.appendAttributeValue("commentcomment#");
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        startTag45.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        char[] charArray49 = new char[] {};
        startTag48.appendAttributeValue(charArray49);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = startTag51.attributes;
        startTag48.attributes = attributes52;
        startTag45.attributes = attributes52;
        java.lang.String str55 = startTag45.normalName;
        org.jsoup.parser.Token.Tag tag56 = startTag45.reset();
        org.jsoup.parser.Token.Tag tag57 = startTag45.reset();
        startTag45.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag61 = startTag60.reset();
        org.jsoup.nodes.Attributes attributes62 = startTag60.attributes;
        org.jsoup.parser.Token.StartTag startTag63 = startTag45.nameAttr("", attributes62);
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        startTag64.appendTagName("");
        org.jsoup.nodes.Attributes attributes67 = null;
        startTag64.attributes = attributes67;
        org.jsoup.parser.Token.Tag tag69 = startTag64.reset();
        org.jsoup.nodes.Attributes attributes70 = startTag64.attributes;
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        startTag71.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        char[] charArray75 = new char[] {};
        startTag74.appendAttributeValue(charArray75);
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes78 = startTag77.attributes;
        startTag74.attributes = attributes78;
        startTag71.attributes = attributes78;
        startTag71.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag83 = new org.jsoup.parser.Token.StartTag();
        startTag83.appendTagName("");
        java.lang.String str86 = startTag83.tagName;
        int[] intArray88 = new int[] { 0 };
        startTag83.appendAttributeValue(intArray88);
        startTag71.appendAttributeValue(intArray88);
        startTag64.appendAttributeValue(intArray88);
        startTag63.appendAttributeValue(intArray88);
        startTag29.appendAttributeValue(intArray88);
        tag25.appendAttributeValue(intArray88);
        startTag0.appendAttributeValue(intArray88);
        boolean boolean96 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] {});
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag14.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag19 = startTag14.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.jsoup.nodes.Attributes attributes21 = tag19.getAttributes();
        startTag0.attributes = attributes21;
        boolean boolean23 = startTag0.selfClosing;
        boolean boolean24 = startTag0.isComment();
        startTag0.appendAttributeName('a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype2.name;
        boolean boolean7 = doctype2.forceQuirks;
        java.lang.String str8 = doctype2.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.Character character11 = character8.data("StartTag");
        org.jsoup.parser.Token token12 = character8.reset();
        org.jsoup.parser.Token token13 = character8.reset();
        boolean boolean14 = character8.isEndTag();
        java.lang.String str15 = character8.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag13 = startTag0.reset();
        boolean boolean14 = tag13.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        char[] charArray5 = new char[] {};
        startTag4.appendAttributeValue(charArray5);
        startTag4.appendAttributeName("hi!");
        startTag4.appendAttributeName('a');
        java.lang.String str11 = startTag4.normalName;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendTagName("");
        org.jsoup.nodes.Attributes attributes15 = null;
        startTag12.attributes = attributes15;
        org.jsoup.parser.Token.Tag tag17 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes18 = startTag12.attributes;
        startTag4.attributes = attributes18;
        org.jsoup.parser.Token.Tag tag21 = startTag4.name("<hi!>");
        boolean boolean22 = tag21.isDoctype();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendTagName("");
        java.lang.String str26 = startTag23.tagName;
        org.jsoup.parser.Token.Tag tag27 = startTag23.reset();
        java.lang.String str28 = startTag23.tagName;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        char[] charArray33 = new char[] {};
        startTag32.appendAttributeValue(charArray33);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = startTag35.attributes;
        startTag32.attributes = attributes36;
        startTag29.attributes = attributes36;
        startTag29.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        startTag41.appendTagName("");
        java.lang.String str44 = startTag41.tagName;
        int[] intArray46 = new int[] { 0 };
        startTag41.appendAttributeValue(intArray46);
        startTag29.appendAttributeValue(intArray46);
        startTag23.appendAttributeValue(intArray46);
        tag21.appendAttributeValue(intArray46);
        org.jsoup.nodes.Attributes attributes51 = tag21.getAttributes();
        startTag0.attributes = attributes51;
        startTag0.normalName = "";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 0 });
        org.junit.Assert.assertNotNull(attributes51);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        java.lang.String str4 = doctype2.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype2.name;
        java.lang.StringBuilder stringBuilder6 = doctype2.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = doctype2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        boolean boolean8 = comment0.bogus;
        boolean boolean9 = comment0.isEndTag();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        char[] charArray11 = new char[] {};
        startTag10.appendAttributeValue(charArray11);
        startTag0.appendAttributeValue(charArray11);
        java.lang.String str14 = startTag0.tagName;
        boolean boolean15 = startTag0.selfClosing;
        startTag0.appendTagName('a');
        java.lang.Class<?> wildcardClass18 = startTag0.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        java.lang.String str9 = startTag0.normalName();
        startTag0.appendAttributeName('4');
        startTag0.appendTagName("<#>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype7.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName("comment");
        boolean boolean11 = startTag0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        startTag0.appendAttributeName("<hi!>");
        java.lang.String str11 = startTag0.toString();
        org.jsoup.parser.Token.Tag tag13 = startTag0.name("<#>");
        tag13.appendTagName("<<hi!>>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<Commentcomment>" + "'", str11, "<Commentcomment>");
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.newAttribute();
        java.lang.String str10 = startTag8.normalName();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        boolean boolean14 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag0.name("");
        boolean boolean17 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        boolean boolean9 = doctype2.forceQuirks;
        java.lang.String str10 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token token11 = doctype2.reset();
        org.jsoup.parser.Token token12 = doctype2.reset();
        java.lang.StringBuilder stringBuilder13 = doctype2.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        boolean boolean14 = startTag0.isDoctype();
        startTag0.tagName = "<hi!>";
        startTag0.appendAttributeValue(' ');
        java.lang.String str19 = startTag0.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<<hi!>>" + "'", str19, "<<hi!>>");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = startTag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag22.attributes = attributes26;
        startTag19.attributes = attributes26;
        startTag19.appendAttributeValue('4');
        boolean boolean31 = startTag19.selfClosing;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendTagName("");
        org.jsoup.nodes.Attributes attributes35 = null;
        startTag32.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag37 = startTag32.reset();
        org.jsoup.nodes.Attributes attributes38 = startTag32.attributes;
        startTag19.attributes = attributes38;
        startTag17.attributes = attributes38;
        startTag11.attributes = attributes38;
        startTag11.appendAttributeName(' ');
        startTag11.appendAttributeValue("Character");
        startTag11.appendAttributeName("4");
        org.jsoup.nodes.Attributes attributes48 = startTag11.attributes;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag14.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag19 = startTag14.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.jsoup.nodes.Attributes attributes21 = tag19.getAttributes();
        startTag0.attributes = attributes21;
        boolean boolean23 = startTag0.selfClosing;
        boolean boolean24 = startTag0.isEndTag();
        startTag0.appendAttributeValue("Commentcomment");
        org.jsoup.parser.Token.StartTag startTag27 = startTag0.asStartTag();
        org.jsoup.parser.Token.TokenType tokenType28 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag27.type = tokenType28;
        org.jsoup.parser.Token token30 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        org.jsoup.nodes.Attributes attributes34 = startTag31.getAttributes();
        boolean boolean35 = startTag31.isComment();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag31.type;
        startTag31.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag39 = startTag31.asStartTag();
        java.lang.String str40 = startTag31.normalName();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = startTag42.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        startTag44.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        char[] charArray48 = new char[] {};
        startTag47.appendAttributeValue(charArray48);
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = startTag50.attributes;
        startTag47.attributes = attributes51;
        startTag44.attributes = attributes51;
        startTag44.appendAttributeValue('4');
        boolean boolean56 = startTag44.selfClosing;
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        startTag57.appendTagName("");
        org.jsoup.nodes.Attributes attributes60 = null;
        startTag57.attributes = attributes60;
        org.jsoup.parser.Token.Tag tag62 = startTag57.reset();
        org.jsoup.nodes.Attributes attributes63 = startTag57.attributes;
        startTag44.attributes = attributes63;
        startTag42.attributes = attributes63;
        org.jsoup.nodes.Attributes attributes66 = startTag42.attributes;
        org.jsoup.parser.Token.StartTag startTag67 = startTag31.nameAttr("<Commentcomment#>", attributes66);
        startTag27.attributes = attributes66;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token30);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(startTag67);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        java.lang.String str5 = character4.getData();
        org.jsoup.parser.Token.Character character7 = character4.data("Doctype");
        java.lang.String str8 = character4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag6.normalName = "hi!";
        java.lang.String str9 = startTag6.tokenType();
        java.lang.String str10 = startTag6.name();
        boolean boolean11 = startTag6.isSelfClosing();
        boolean boolean12 = startTag6.isDoctype();
        startTag6.newAttribute();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token token5 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<hi!>");
        tag9.newAttribute();
        tag9.appendTagName("a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        java.lang.StringBuilder stringBuilder7 = doctype2.systemIdentifier;
        java.lang.String str8 = doctype2.pubSysKey;
        java.lang.String str9 = doctype2.getName();
        org.jsoup.parser.Token token10 = doctype2.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        java.lang.StringBuilder stringBuilder7 = doctype2.systemIdentifier;
        java.lang.String str8 = doctype2.pubSysKey;
        doctype2.pubSysKey = "";
        java.lang.StringBuilder stringBuilder11 = doctype2.publicIdentifier;
        java.lang.String str12 = doctype2.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        startTag0.appendAttributeName('4');
        startTag0.newAttribute();
        startTag0.selfClosing = false;
        startTag0.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        startTag15.appendAttributeName("hi!");
        startTag15.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes22 = startTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag23 = startTag11.nameAttr("", attributes22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag23);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        boolean boolean12 = startTag11.isEOF();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = startTag20.attributes;
        startTag17.attributes = attributes21;
        startTag14.attributes = attributes21;
        java.lang.String str24 = startTag14.normalName;
        org.jsoup.parser.Token.Tag tag25 = startTag14.reset();
        org.jsoup.parser.Token.Tag tag26 = startTag14.reset();
        startTag14.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag30 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes31 = startTag29.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = startTag14.nameAttr("", attributes31);
        org.jsoup.parser.Token.StartTag startTag33 = startTag11.nameAttr("hi!", attributes31);
        java.lang.String str34 = startTag33.tokenType();
        org.jsoup.parser.Token.TokenType tokenType35 = startTag33.type;
        java.lang.String str36 = startTag33.name();
        java.lang.String str37 = startTag33.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "StartTag" + "'", str34, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<hi!>" + "'", str37, "<hi!>");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = token4.isEndTag();
        boolean boolean6 = token4.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        org.jsoup.parser.Token token5 = character4.reset();
        boolean boolean6 = token5.isCharacter();
        boolean boolean7 = token5.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        startTag0.appendAttributeName('4');
        startTag0.newAttribute();
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag17 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag18 = startTag0.reset();
        tag18.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes21 = tag18.attributes;
        boolean boolean22 = tag18.isCharacter();
        java.lang.String str23 = tag18.name();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        boolean boolean8 = doctype2.forceQuirks;
        doctype2.pubSysKey = "<StartTag>";
        java.lang.String str11 = doctype2.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<StartTag>" + "'", str11, "<StartTag>");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        boolean boolean9 = doctype2.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype2.name;
        boolean boolean11 = doctype2.isForceQuirks();
        boolean boolean12 = doctype2.isForceQuirks();
        java.lang.String str13 = doctype2.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = false;
        doctype0.pubSysKey = "commentcomment#";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        char[] charArray9 = new char[] {};
        startTag8.appendAttributeValue(charArray9);
        startTag8.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag14 = startTag8.name("Comment");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        org.jsoup.nodes.Attributes attributes18 = null;
        startTag15.attributes = attributes18;
        startTag15.appendTagName("");
        java.lang.String str22 = startTag15.tagName;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        char[] charArray27 = new char[] {};
        startTag26.appendAttributeValue(charArray27);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = startTag29.attributes;
        startTag26.attributes = attributes30;
        startTag23.attributes = attributes30;
        startTag23.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendTagName("");
        java.lang.String str38 = startTag35.tagName;
        int[] intArray40 = new int[] { 0 };
        startTag35.appendAttributeValue(intArray40);
        startTag23.appendAttributeValue(intArray40);
        startTag15.appendAttributeValue(intArray40);
        tag14.appendAttributeValue(intArray40);
        tag7.appendAttributeValue(intArray40);
        org.jsoup.parser.Token.Tag tag47 = tag7.name("<hi!>");
        tag47.appendAttributeName('a');
        boolean boolean50 = tag47.isDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isCharacter();
        comment0.bogus = true;
        java.lang.String str6 = comment0.getData();
        boolean boolean7 = comment0.bogus;
        java.lang.Class<?> wildcardClass8 = comment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        java.lang.String str9 = startTag0.normalName();
        java.lang.String str10 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        startTag12.appendAttributeName("hi!");
        startTag12.appendTagName("<!---->");
        org.jsoup.nodes.Attributes attributes19 = startTag12.getAttributes();
        org.jsoup.parser.Token.StartTag startTag20 = startTag0.nameAttr("commentcomment", attributes19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype21 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.tagName = "";
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        org.jsoup.nodes.Attributes attributes20 = startTag17.getAttributes();
        boolean boolean21 = startTag17.isComment();
        startTag17.appendAttributeName("Comment");
        startTag17.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes26 = startTag17.attributes;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        startTag17.appendAttributeValue(charArray28);
        startTag11.appendAttributeValue(charArray28);
        startTag11.appendTagName('4');
        org.jsoup.parser.Token.Tag tag35 = startTag11.name("");
        tag35.appendAttributeName("commentcomment#");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token token5 = character0.reset();
        boolean boolean6 = token5.isComment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.isCharacter();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token.Comment comment8 = comment0.asComment();
        java.lang.String str9 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag14.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag19 = startTag14.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.jsoup.nodes.Attributes attributes21 = tag19.getAttributes();
        startTag0.attributes = attributes21;
        boolean boolean23 = startTag0.selfClosing;
        boolean boolean24 = startTag0.isEndTag();
        startTag0.appendAttributeValue("Commentcomment");
        org.jsoup.parser.Token.StartTag startTag27 = startTag0.asStartTag();
        org.jsoup.parser.Token.TokenType tokenType28 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag27.type = tokenType28;
        startTag27.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        char[] charArray36 = new char[] {};
        startTag35.appendAttributeValue(charArray36);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = startTag38.attributes;
        startTag35.attributes = attributes39;
        startTag32.attributes = attributes39;
        startTag32.appendAttributeValue('4');
        boolean boolean44 = startTag32.selfClosing;
        boolean boolean45 = startTag32.selfClosing;
        boolean boolean46 = startTag32.isSelfClosing();
        startTag32.appendAttributeName("<Commentcomment>");
        boolean boolean49 = startTag32.isEOF();
        org.jsoup.nodes.Attributes attributes50 = startTag32.attributes;
        org.jsoup.parser.Token.StartTag startTag51 = startTag27.nameAttr("#", attributes50);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag51);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        boolean boolean6 = doctype2.isForceQuirks();
        org.jsoup.parser.Token token7 = doctype2.reset();
        boolean boolean8 = token7.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.asStartTag();
        boolean boolean10 = startTag0.isEndTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendAttributeValue("");
        startTag0.appendAttributeValue("<#>");
        startTag0.appendAttributeName('4');
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        boolean boolean8 = doctype2.forceQuirks;
        java.lang.String str9 = doctype2.getSystemIdentifier();
        java.lang.String str10 = doctype2.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<<!---->>");
        org.jsoup.parser.Token.Character character8 = character6.data("<Commentcomment>");
        java.lang.String str9 = character8.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<Commentcomment>" + "'", str9, "<Commentcomment>");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.parser.Token.TokenType tokenType12 = startTag11.type;
        org.jsoup.parser.Token.Tag tag14 = startTag11.name("StartTag");
        org.jsoup.nodes.Attributes attributes15 = tag14.getAttributes();
        org.jsoup.parser.Token.Tag tag17 = tag14.name("<<hi!>>");
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.nodes.Attributes attributes21 = null;
        startTag18.attributes = attributes21;
        startTag18.appendAttributeValue("hi!");
        startTag18.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType27 = startTag18.type;
        startTag18.appendAttributeValue("Comment");
        boolean boolean30 = startTag18.isCharacter();
        boolean boolean31 = startTag18.isSelfClosing();
        startTag18.appendAttributeValue("commentcomment#");
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        startTag34.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        char[] charArray38 = new char[] {};
        startTag37.appendAttributeValue(charArray38);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = startTag40.attributes;
        startTag37.attributes = attributes41;
        startTag34.attributes = attributes41;
        java.lang.String str44 = startTag34.normalName;
        org.jsoup.parser.Token.Tag tag45 = startTag34.reset();
        org.jsoup.parser.Token.Tag tag46 = startTag34.reset();
        startTag34.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag50 = startTag49.reset();
        org.jsoup.nodes.Attributes attributes51 = startTag49.attributes;
        org.jsoup.parser.Token.StartTag startTag52 = startTag34.nameAttr("", attributes51);
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        startTag53.appendTagName("");
        org.jsoup.nodes.Attributes attributes56 = null;
        startTag53.attributes = attributes56;
        org.jsoup.parser.Token.Tag tag58 = startTag53.reset();
        org.jsoup.nodes.Attributes attributes59 = startTag53.attributes;
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        startTag60.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        char[] charArray64 = new char[] {};
        startTag63.appendAttributeValue(charArray64);
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes67 = startTag66.attributes;
        startTag63.attributes = attributes67;
        startTag60.attributes = attributes67;
        startTag60.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName("");
        java.lang.String str75 = startTag72.tagName;
        int[] intArray77 = new int[] { 0 };
        startTag72.appendAttributeValue(intArray77);
        startTag60.appendAttributeValue(intArray77);
        startTag53.appendAttributeValue(intArray77);
        startTag52.appendAttributeValue(intArray77);
        startTag18.appendAttributeValue(intArray77);
        tag14.appendAttributeValue(intArray77);
        boolean boolean84 = tag14.selfClosing;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] {});
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        java.lang.StringBuilder stringBuilder7 = doctype2.systemIdentifier;
        java.lang.String str8 = doctype2.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        java.lang.String str6 = character0.getData();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag11.attributes = attributes15;
        startTag8.attributes = attributes15;
        startTag8.selfClosing = false;
        startTag8.appendAttributeName('4');
        startTag8.newAttribute();
        startTag8.selfClosing = false;
        org.jsoup.parser.Token.Tag tag25 = startTag8.reset();
        boolean boolean26 = startTag8.isSelfClosing();
        startTag8.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Tag tag29 = startTag8.reset();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName("");
        org.jsoup.nodes.Attributes attributes33 = null;
        startTag30.attributes = attributes33;
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        org.jsoup.nodes.Attributes attributes36 = startTag30.attributes;
        startTag30.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.EndTag;
        startTag30.type = tokenType38;
        startTag8.type = tokenType38;
        character0.type = tokenType38;
        boolean boolean42 = character0.isDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        boolean boolean6 = doctype0.isDoctype();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        comment0.bogus = true;
        boolean boolean5 = comment0.bogus;
        boolean boolean6 = comment0.isStartTag();
        boolean boolean7 = comment0.bogus;
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.String str3 = doctype0.getPubSysKey();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag0.appendAttributeName("<!---->");
        boolean boolean25 = startTag0.isStartTag();
        boolean boolean26 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = startTag34.attributes;
        startTag31.attributes = attributes35;
        startTag28.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag39 = startTag28.name("Doctype");
        org.jsoup.nodes.Attributes attributes40 = startTag28.getAttributes();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        char[] charArray46 = new char[] {};
        startTag45.appendAttributeValue(charArray46);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = startTag48.attributes;
        startTag45.attributes = attributes49;
        startTag42.attributes = attributes49;
        startTag42.selfClosing = false;
        startTag42.appendAttributeName('#');
        java.lang.String str56 = startTag42.normalName;
        org.jsoup.nodes.Attributes attributes57 = startTag42.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = startTag28.nameAttr("Commentcomment", attributes57);
        org.jsoup.parser.Token.StartTag startTag59 = startTag0.nameAttr("Doctype", attributes57);
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        char[] charArray62 = new char[] {};
        startTag61.appendAttributeValue(charArray62);
        startTag61.appendAttributeName("hi!");
        startTag61.appendAttributeName('a');
        boolean boolean68 = startTag61.selfClosing;
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        startTag69.appendTagName("");
        org.jsoup.nodes.Attributes attributes72 = null;
        startTag69.attributes = attributes72;
        startTag69.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag76 = new org.jsoup.parser.Token.StartTag();
        startTag76.appendTagName("");
        org.jsoup.nodes.Attributes attributes79 = null;
        startTag76.attributes = attributes79;
        org.jsoup.parser.Token.Tag tag81 = startTag76.reset();
        org.jsoup.nodes.Attributes attributes82 = startTag76.attributes;
        startTag69.attributes = attributes82;
        startTag61.attributes = attributes82;
        org.jsoup.parser.Token.StartTag startTag85 = startTag59.nameAttr("<<<!---->>>", attributes82);
        startTag85.appendAttributeValue("Character");
        startTag85.appendAttributeName("<<<hi!>>>");
        org.jsoup.parser.Token.StartTag startTag90 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes91 = startTag90.attributes;
        startTag90.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes94 = startTag90.getAttributes();
        startTag85.attributes = attributes94;
        org.jsoup.parser.Token token96 = startTag85.reset();
        startTag85.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertNotNull(attributes82);
        org.junit.Assert.assertNotNull(startTag85);
        org.junit.Assert.assertNotNull(attributes91);
        org.junit.Assert.assertNotNull(attributes94);
        org.junit.Assert.assertNotNull(token96);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        java.lang.StringBuilder stringBuilder7 = doctype2.systemIdentifier;
        java.lang.String str8 = doctype2.pubSysKey;
        boolean boolean9 = doctype2.isCharacter();
        java.lang.StringBuilder stringBuilder10 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.String str8 = comment0.toString();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        java.lang.String str7 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes14 = startTag8.attributes;
        startTag0.attributes = attributes14;
        org.jsoup.parser.Token.Tag tag17 = startTag0.name("<hi!>");
        boolean boolean18 = tag17.isDoctype();
        org.jsoup.parser.Token.Tag tag19 = tag17.reset();
        org.jsoup.nodes.Attributes attributes20 = tag17.getAttributes();
        org.jsoup.parser.Token.Tag tag22 = tag17.name("Commentcomment");
        org.jsoup.parser.Token.Tag tag24 = tag17.name("<!---->");
        tag17.selfClosing = false;
        tag17.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Character;
        startTag0.type = tokenType12;
        org.jsoup.nodes.Attributes attributes14 = startTag0.attributes;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        char[] charArray6 = new char[] {};
        startTag5.appendAttributeValue(charArray6);
        org.jsoup.nodes.Attributes attributes8 = startTag5.getAttributes();
        boolean boolean9 = startTag5.isComment();
        startTag5.appendAttributeName("Comment");
        startTag5.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes14 = startTag5.attributes;
        java.lang.String str15 = startTag5.tokenType();
        org.jsoup.parser.Token.Tag tag16 = startTag5.reset();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        org.jsoup.nodes.Attributes attributes20 = startTag17.getAttributes();
        boolean boolean21 = startTag17.isComment();
        startTag17.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag24 = startTag17.reset();
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag17.type = tokenType25;
        startTag5.type = tokenType25;
        doctype0.type = tokenType25;
        java.lang.Class<?> wildcardClass29 = tokenType25.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        char[] charArray6 = new char[] {};
        startTag5.appendAttributeValue(charArray6);
        org.jsoup.nodes.Attributes attributes8 = startTag5.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag5.type;
        startTag0.type = tokenType9;
        startTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype2.name;
        boolean boolean7 = doctype2.forceQuirks;
        java.lang.String str8 = doctype2.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        java.lang.String str6 = startTag0.toString();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        startTag7.appendAttributeName("hi!");
        startTag7.appendAttributeName('a');
        java.lang.String str14 = startTag7.normalName;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        org.jsoup.nodes.Attributes attributes18 = null;
        startTag15.attributes = attributes18;
        org.jsoup.parser.Token.Tag tag20 = startTag15.reset();
        org.jsoup.nodes.Attributes attributes21 = startTag15.attributes;
        startTag7.attributes = attributes21;
        startTag0.attributes = attributes21;
        startTag0.selfClosing = true;
        boolean boolean26 = startTag0.isEndTag();
        startTag0.appendAttributeValue('a');
        boolean boolean29 = startTag0.isComment();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag6.normalName = "<Commentcomment>";
        java.lang.String str9 = startTag6.normalName();
        boolean boolean10 = startTag6.isDoctype();
        java.lang.String str11 = startTag6.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<Commentcomment>" + "'", str9, "<Commentcomment>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<Commentcomment>" + "'", str11, "<Commentcomment>");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        java.lang.String str4 = doctype2.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype2.name;
        java.lang.Class<?> wildcardClass6 = doctype2.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        java.lang.String str5 = character4.getData();
        java.lang.String str6 = character4.getData();
        boolean boolean7 = character4.isComment();
        java.lang.String str8 = character4.getData();
        java.lang.String str9 = character4.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Comment" + "'", str6, "Comment");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Comment" + "'", str8, "Comment");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Comment" + "'", str9, "Comment");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("Commentcomment");
        startTag0.finaliseTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("Doctype");
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag13.attributes;
        startTag13.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes17 = startTag13.getAttributes();
        java.lang.String str18 = startTag13.tagName;
        java.lang.String str19 = startTag13.toString();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        char[] charArray21 = new char[] {};
        startTag20.appendAttributeValue(charArray21);
        startTag20.appendAttributeName("hi!");
        startTag20.appendAttributeName('a');
        java.lang.String str27 = startTag20.normalName;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.nodes.Attributes attributes31 = null;
        startTag28.attributes = attributes31;
        org.jsoup.parser.Token.Tag tag33 = startTag28.reset();
        org.jsoup.nodes.Attributes attributes34 = startTag28.attributes;
        startTag20.attributes = attributes34;
        startTag13.attributes = attributes34;
        org.jsoup.parser.Token.StartTag startTag37 = startTag0.nameAttr("comment", attributes34);
        org.jsoup.nodes.Attributes attributes38 = startTag37.getAttributes();
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str40 = doctype39.getPublicIdentifier();
        java.lang.String str41 = doctype39.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder42 = doctype39.name;
        java.lang.String str43 = doctype39.pubSysKey;
        org.jsoup.parser.Token token44 = doctype39.reset();
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        java.lang.String str46 = comment45.tokenType();
        java.lang.String str47 = comment45.getData();
        boolean boolean48 = comment45.bogus;
        org.jsoup.parser.Token.Doctype doctype49 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str50 = doctype49.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype51 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str52 = doctype51.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType53 = doctype51.type;
        doctype49.type = tokenType53;
        comment45.type = tokenType53;
        token44.type = tokenType53;
        startTag37.type = tokenType53;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>" + "'", str19, "<hi!>");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Comment" + "'", str46, "Comment");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.tagName = "";
        java.lang.String str17 = startTag11.normalName();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        char[] charArray22 = new char[] {};
        startTag21.appendAttributeValue(charArray22);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = startTag24.attributes;
        startTag21.attributes = attributes25;
        startTag18.attributes = attributes25;
        startTag18.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName("");
        java.lang.String str33 = startTag30.tagName;
        int[] intArray35 = new int[] { 0 };
        startTag30.appendAttributeValue(intArray35);
        startTag18.appendAttributeValue(intArray35);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName("");
        org.jsoup.nodes.Attributes attributes41 = null;
        startTag38.attributes = attributes41;
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        org.jsoup.nodes.Attributes attributes44 = tag43.attributes;
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        char[] charArray46 = new char[] {};
        startTag45.appendAttributeValue(charArray46);
        tag43.appendAttributeValue(charArray46);
        startTag18.appendAttributeValue(charArray46);
        startTag11.appendAttributeValue(charArray46);
        org.jsoup.parser.Token.Tag tag51 = startTag11.reset();
        tag51.appendTagName('a');
        tag51.appendTagName("<hi!>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertNotNull(tag51);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        startTag0.appendAttributeName('4');
        startTag0.newAttribute();
        boolean boolean15 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("<#>");
        startTag0.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        java.lang.String str5 = character4.getData();
        java.lang.String str6 = character4.getData();
        org.jsoup.parser.Token token7 = character4.reset();
        org.jsoup.parser.Token.Character character9 = character4.data("<Commentcomment>");
        org.jsoup.parser.Token token10 = character4.reset();
        java.lang.String str11 = character4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Comment" + "'", str6, "Comment");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        java.lang.String str6 = comment4.getData();
        java.lang.String str7 = comment4.toString();
        org.jsoup.parser.Token token8 = comment4.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendAttributeName("commentcomment#");
        org.jsoup.nodes.Attributes attributes10 = tag7.getAttributes();
        tag7.normalName = " ";
        java.lang.String str13 = tag7.normalName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        boolean boolean11 = startTag0.isEndTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("<<Comment>>");
        boolean boolean7 = character4.isEOF();
        org.jsoup.parser.Token.TokenType tokenType8 = character4.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.tokenType();
        org.jsoup.parser.Token.Character character5 = character0.data("a");
        org.jsoup.parser.Token.Character character6 = character5.asCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character6);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        comment0.bogus = false;
        comment0.bogus = true;
        org.jsoup.parser.Token token7 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character2.data("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = character6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token token8 = comment0.reset();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        java.lang.String str10 = comment0.toString();
        org.jsoup.parser.Token token11 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        startTag0.appendAttributeValue('a');
        startTag0.normalName = "Comment";
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = startTag26.attributes;
        startTag23.attributes = attributes27;
        startTag20.attributes = attributes27;
        org.jsoup.parser.Token.Tag tag31 = startTag20.name("Doctype");
        org.jsoup.nodes.Attributes attributes32 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag33 = startTag0.nameAttr("<!---->", attributes32);
        java.lang.String str34 = startTag33.normalName;
        startTag33.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        java.lang.String str9 = startTag0.normalName();
        startTag0.appendAttributeName('4');
        startTag0.appendTagName('#');
        java.lang.String str14 = startTag0.normalName;
        boolean boolean15 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        tag6.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        startTag9.appendAttributeName("hi!");
        startTag9.appendAttributeName('a');
        java.lang.String str16 = startTag9.normalName;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        startTag17.appendAttributeName("hi!");
        startTag17.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes24 = startTag17.getAttributes();
        startTag9.attributes = attributes24;
        tag6.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag27 = tag6.asStartTag();
        startTag27.appendAttributeName("<StartTag>");
        startTag27.appendTagName('a');
        startTag27.appendTagName("<#>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag27);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        boolean boolean3 = character0.isComment();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token token5 = character0.reset();
        java.lang.String str6 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName('#');
        boolean boolean7 = startTag0.isStartTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes14 = tag13.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        tag13.appendAttributeValue(charArray16);
        startTag0.appendAttributeValue(charArray16);
        startTag0.appendTagName("<#>");
        startTag0.appendAttributeValue("<<<hi!>>>");
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = startTag24.attributes;
        startTag24.newAttribute();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        startTag27.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag33 = startTag27.name("Comment");
        startTag27.appendTagName("comment");
        java.lang.String str36 = startTag27.normalName();
        char[] charArray39 = new char[] { '4', '#' };
        startTag27.appendAttributeValue(charArray39);
        startTag24.appendAttributeValue(charArray39);
        startTag0.appendAttributeValue(charArray39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "commentcomment" + "'", str36, "commentcomment");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', '#' });
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character6.toString();
        boolean boolean8 = character6.isComment();
        org.jsoup.parser.Token.Character character10 = character6.data("<Commentcomment>");
        org.jsoup.parser.Token.Character character12 = character10.data("hi!");
        org.jsoup.parser.Token token13 = character12.reset();
        org.jsoup.parser.Token.Character character15 = character12.data("<!---->#");
        java.lang.String str16 = character15.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->#" + "'", str16, "<!---->#");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        char[] charArray6 = new char[] {};
        startTag5.appendAttributeValue(charArray6);
        startTag5.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag11 = startTag5.name("Comment");
        boolean boolean12 = tag11.selfClosing;
        org.jsoup.nodes.Attributes attributes13 = tag11.attributes;
        startTag0.attributes = attributes13;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<hi!>");
        tag9.setEmptyAttributeValue();
        boolean boolean11 = tag9.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("comment");
        java.lang.String str7 = character4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = character4.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "comment" + "'", str7, "comment");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        startTag0.appendAttributeName("Doctype");
        startTag0.appendAttributeValue("Character");
        boolean boolean8 = startTag0.isStartTag();
        startTag0.normalName = "<<<!---->>>";
        java.lang.String str11 = startTag0.tagName;
        startTag0.normalName = "<Commentcomment>";
        startTag0.appendAttributeName("<<hi!>>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        startTag0.tagName = "";
        startTag0.setEmptyAttributeValue();
        boolean boolean17 = startTag0.isComment();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isDoctype();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isStartTag();
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getName();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType6 = tag5.type;
        java.lang.String str7 = tag5.normalName;
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        startTag0.appendAttributeValue('#');
        startTag0.tagName = "Commentcomment<<<hi!>>>";
        boolean boolean11 = startTag0.isEndTag();
        java.lang.String str12 = startTag0.normalName();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        doctype0.pubSysKey = "Doctype";
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        boolean boolean13 = startTag0.isEOF();
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        java.lang.String str18 = startTag15.tagName;
        org.jsoup.parser.Token.Tag tag19 = startTag15.reset();
        java.lang.String str20 = startTag15.tagName;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = startTag27.attributes;
        startTag24.attributes = attributes28;
        startTag21.attributes = attributes28;
        startTag21.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName("");
        java.lang.String str36 = startTag33.tagName;
        int[] intArray38 = new int[] { 0 };
        startTag33.appendAttributeValue(intArray38);
        startTag21.appendAttributeValue(intArray38);
        startTag15.appendAttributeValue(intArray38);
        endTag14.appendAttributeValue(intArray38);
        startTag0.appendAttributeValue(intArray38);
        org.jsoup.nodes.Attributes attributes44 = startTag0.attributes;
        startTag0.appendAttributeValue("<<Commentcomment>>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0 });
        org.junit.Assert.assertNotNull(attributes44);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        startTag0.appendAttributeValue("Comment");
        boolean boolean12 = startTag0.isCharacter();
        boolean boolean13 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("commentcomment#");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = startTag22.attributes;
        startTag19.attributes = attributes23;
        startTag16.attributes = attributes23;
        java.lang.String str26 = startTag16.normalName;
        org.jsoup.parser.Token.Tag tag27 = startTag16.reset();
        org.jsoup.parser.Token.Tag tag28 = startTag16.reset();
        startTag16.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        org.jsoup.nodes.Attributes attributes33 = startTag31.attributes;
        org.jsoup.parser.Token.StartTag startTag34 = startTag16.nameAttr("", attributes33);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendTagName("");
        org.jsoup.nodes.Attributes attributes38 = null;
        startTag35.attributes = attributes38;
        org.jsoup.parser.Token.Tag tag40 = startTag35.reset();
        org.jsoup.nodes.Attributes attributes41 = startTag35.attributes;
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        char[] charArray46 = new char[] {};
        startTag45.appendAttributeValue(charArray46);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = startTag48.attributes;
        startTag45.attributes = attributes49;
        startTag42.attributes = attributes49;
        startTag42.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        startTag54.appendTagName("");
        java.lang.String str57 = startTag54.tagName;
        int[] intArray59 = new int[] { 0 };
        startTag54.appendAttributeValue(intArray59);
        startTag42.appendAttributeValue(intArray59);
        startTag35.appendAttributeValue(intArray59);
        startTag34.appendAttributeValue(intArray59);
        startTag0.appendAttributeValue(intArray59);
        org.jsoup.parser.Token.TokenType tokenType65 = startTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + tokenType65 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType65.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.tagName = "";
        org.jsoup.parser.Token.StartTag startTag17 = startTag11.asStartTag();
        boolean boolean18 = startTag17.selfClosing;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.nodes.Attributes attributes22 = startTag19.getAttributes();
        boolean boolean23 = startTag19.isComment();
        startTag19.appendAttributeName("Comment");
        startTag19.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes28 = startTag19.attributes;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        char[] charArray30 = new char[] {};
        startTag29.appendAttributeValue(charArray30);
        startTag19.appendAttributeValue(charArray30);
        startTag17.appendAttributeValue(charArray30);
        org.jsoup.nodes.Attributes attributes34 = startTag17.attributes;
        java.lang.String str35 = startTag17.tokenType();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "StartTag" + "'", str35, "StartTag");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        tag6.appendTagName('a');
        boolean boolean9 = tag6.isDoctype();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isEndTag();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        boolean boolean6 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.appendAttributeValue("<!---->");
        startTag0.tagName = "Comment";
        startTag0.newAttribute();
        java.lang.String str14 = startTag0.toString();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<Comment  hi!=\"<!---->\">" + "'", str14, "<Comment  hi!=\"<!---->\">");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        java.lang.String str11 = startTag8.tagName;
        startTag8.setEmptyAttributeValue();
        startTag8.appendTagName('#');
        boolean boolean15 = startTag8.isStartTag();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.nodes.Attributes attributes19 = null;
        startTag16.attributes = attributes19;
        org.jsoup.parser.Token.Tag tag21 = startTag16.reset();
        org.jsoup.nodes.Attributes attributes22 = tag21.attributes;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        tag21.appendAttributeValue(charArray24);
        startTag8.appendAttributeValue(charArray24);
        startTag0.appendAttributeValue(charArray24);
        startTag0.setEmptyAttributeValue();
        startTag0.finaliseTag();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        org.jsoup.nodes.Attributes attributes10 = null;
        startTag7.attributes = attributes10;
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag7.attributes;
        startTag0.attributes = attributes13;
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag18 = startTag0.name("#");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        boolean boolean7 = startTag0.isCharacter();
        boolean boolean8 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        java.lang.String str12 = startTag9.tagName;
        startTag9.normalName = "Doctype";
        startTag9.appendAttributeValue("Commentcomment");
        org.jsoup.nodes.Attributes attributes17 = startTag9.getAttributes();
        startTag0.attributes = attributes17;
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.asStartTag();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag19);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype4 = doctype2.asDoctype();
        doctype4.pubSysKey = "<Doctype>";
        boolean boolean7 = doctype4.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype4.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype10 = doctype4.asDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype10);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str12 = doctype11.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType13 = doctype11.type;
        doctype9.type = tokenType13;
        tag8.type = tokenType13;
        org.jsoup.parser.Token token16 = tag8.reset();
        tag8.normalName = "a";
        org.jsoup.nodes.Attributes attributes19 = tag8.attributes;
        org.jsoup.parser.Token.Tag tag21 = tag8.name("<commentcomment#>");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.nodes.Attributes attributes25 = startTag22.getAttributes();
        startTag22.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag28 = startTag22.asStartTag();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        startTag30.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes34 = startTag30.getAttributes();
        boolean boolean35 = startTag30.isEOF();
        startTag30.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token39 = doctype38.reset();
        org.jsoup.parser.Token.Doctype doctype40 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str41 = doctype40.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str43 = doctype42.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType44 = doctype42.type;
        doctype40.type = tokenType44;
        doctype38.type = tokenType44;
        startTag30.type = tokenType44;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        startTag48.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        char[] charArray52 = new char[] {};
        startTag51.appendAttributeValue(charArray52);
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = startTag54.attributes;
        startTag51.attributes = attributes55;
        startTag48.attributes = attributes55;
        startTag48.selfClosing = false;
        startTag48.appendAttributeName('4');
        startTag48.newAttribute();
        startTag48.selfClosing = false;
        org.jsoup.parser.Token.Tag tag65 = startTag48.reset();
        tag65.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        char[] charArray69 = new char[] {};
        startTag68.appendAttributeValue(charArray69);
        org.jsoup.nodes.Attributes attributes71 = startTag68.getAttributes();
        boolean boolean72 = startTag68.isComment();
        startTag68.appendAttributeName("Comment");
        startTag68.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes77 = startTag68.attributes;
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        char[] charArray79 = new char[] {};
        startTag78.appendAttributeValue(charArray79);
        startTag68.appendAttributeValue(charArray79);
        tag65.appendAttributeValue(charArray79);
        startTag30.appendAttributeValue(charArray79);
        startTag29.appendAttributeValue(charArray79);
        startTag22.appendAttributeValue(charArray79);
        tag21.appendAttributeValue(charArray79);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(token39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] {});
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] {});
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        boolean boolean8 = comment0.bogus;
        org.jsoup.parser.Token.TokenType tokenType9 = comment0.type;
        boolean boolean10 = comment0.bogus;
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag22.tagName = "Doctype";
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        comment25.bogus = false;
        boolean boolean28 = comment25.bogus;
        org.jsoup.parser.Token.TokenType tokenType29 = comment25.type;
        startTag22.type = tokenType29;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendTagName("");
        org.jsoup.nodes.Attributes attributes16 = null;
        startTag13.attributes = attributes16;
        org.jsoup.parser.Token.Tag tag18 = startTag13.reset();
        org.jsoup.nodes.Attributes attributes19 = startTag13.attributes;
        startTag0.attributes = attributes19;
        java.lang.String str21 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        char[] charArray26 = new char[] {};
        startTag25.appendAttributeValue(charArray26);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes29 = startTag28.attributes;
        startTag25.attributes = attributes29;
        startTag22.attributes = attributes29;
        startTag22.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag34 = startTag22.asStartTag();
        startTag22.appendAttributeValue(' ');
        boolean boolean37 = startTag22.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName("");
        java.lang.String str41 = startTag38.tagName;
        org.jsoup.parser.Token.Tag tag42 = startTag38.reset();
        boolean boolean43 = startTag38.isCharacter();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        char[] charArray45 = new char[] {};
        startTag44.appendAttributeValue(charArray45);
        org.jsoup.nodes.Attributes attributes47 = startTag44.getAttributes();
        startTag44.appendTagName('#');
        startTag44.finaliseTag();
        boolean boolean51 = startTag44.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        startTag52.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        char[] charArray56 = new char[] {};
        startTag55.appendAttributeValue(charArray56);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes59 = startTag58.attributes;
        startTag55.attributes = attributes59;
        startTag52.attributes = attributes59;
        startTag52.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        startTag64.appendTagName("");
        java.lang.String str67 = startTag64.tagName;
        int[] intArray69 = new int[] { 0 };
        startTag64.appendAttributeValue(intArray69);
        startTag52.appendAttributeValue(intArray69);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName("");
        org.jsoup.nodes.Attributes attributes75 = null;
        startTag72.attributes = attributes75;
        org.jsoup.parser.Token.Tag tag77 = startTag72.reset();
        org.jsoup.nodes.Attributes attributes78 = tag77.attributes;
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        char[] charArray80 = new char[] {};
        startTag79.appendAttributeValue(charArray80);
        tag77.appendAttributeValue(charArray80);
        startTag52.appendAttributeValue(charArray80);
        startTag44.appendAttributeValue(charArray80);
        startTag38.appendAttributeValue(charArray80);
        startTag22.appendAttributeValue(charArray80);
        startTag0.appendAttributeValue(charArray80);
        java.lang.String str88 = startTag0.normalName();
        boolean boolean89 = startTag0.isEndTag();
        startTag0.appendAttributeName('a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] {});
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.toString();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.forceQuirks;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getName();
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.forceQuirks;
        boolean boolean14 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        boolean boolean8 = startTag0.selfClosing;
        startTag0.selfClosing = false;
        boolean boolean11 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        comment0.bogus = true;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.bogus;
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype4 = doctype2.asDoctype();
        doctype4.pubSysKey = "<Doctype>";
        java.lang.String str7 = doctype4.getPubSysKey();
        doctype4.pubSysKey = "Doctype";
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<Doctype>" + "'", str7, "<Doctype>");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = tag4.isDoctype();
        tag4.appendTagName("<Commentcomment#>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = tag4.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        boolean boolean5 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        tag6.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        startTag9.appendAttributeName("hi!");
        startTag9.appendAttributeName('a');
        java.lang.String str16 = startTag9.normalName;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        startTag17.appendAttributeName("hi!");
        startTag17.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes24 = startTag17.getAttributes();
        startTag9.attributes = attributes24;
        tag6.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag27 = tag6.asStartTag();
        startTag27.appendAttributeName("<StartTag>");
        startTag27.appendTagName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag32 = startTag27.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag27);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        org.jsoup.nodes.Attributes attributes15 = startTag12.getAttributes();
        boolean boolean16 = startTag12.isComment();
        org.jsoup.parser.Token.TokenType tokenType17 = startTag12.type;
        startTag12.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag20 = startTag12.asStartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag12.name("Comment");
        startTag12.newAttribute();
        org.jsoup.nodes.Attributes attributes24 = startTag12.getAttributes();
        startTag0.attributes = attributes24;
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag0.nameAttr("<!---->", attributes27);
        boolean boolean29 = startTag28.isDoctype();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        startTag31.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag37 = startTag31.name("Comment");
        boolean boolean38 = tag37.selfClosing;
        org.jsoup.nodes.Attributes attributes39 = tag37.attributes;
        org.jsoup.parser.Token.StartTag startTag40 = startTag28.nameAttr(" ", attributes39);
        startTag28.appendTagName("<   a>");
        char[] charArray43 = null;
        // The following exception was thrown during execution in test generation
        try {
            startTag28.appendAttributeValue(charArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag40);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character6.toString();
        boolean boolean8 = character6.isComment();
        org.jsoup.parser.Token.Character character10 = character6.data("<Commentcomment>");
        java.lang.String str11 = character6.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<Commentcomment>" + "'", str11, "<Commentcomment>");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName("<!---->");
        startTag0.setEmptyAttributeValue();
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        char[] charArray11 = new char[] {};
        startTag10.appendAttributeValue(charArray11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag13.attributes;
        startTag10.attributes = attributes14;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        org.jsoup.nodes.Attributes attributes20 = startTag17.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = startTag10.nameAttr("", attributes20);
        java.lang.String str22 = startTag21.tagName;
        startTag21.appendAttributeName('a');
        startTag21.tagName = "";
        java.lang.String str27 = startTag21.normalName();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = startTag34.attributes;
        startTag31.attributes = attributes35;
        startTag28.attributes = attributes35;
        startTag28.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        java.lang.String str43 = startTag40.tagName;
        int[] intArray45 = new int[] { 0 };
        startTag40.appendAttributeValue(intArray45);
        startTag28.appendAttributeValue(intArray45);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        startTag48.appendTagName("");
        org.jsoup.nodes.Attributes attributes51 = null;
        startTag48.attributes = attributes51;
        org.jsoup.parser.Token.Tag tag53 = startTag48.reset();
        org.jsoup.nodes.Attributes attributes54 = tag53.attributes;
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        char[] charArray56 = new char[] {};
        startTag55.appendAttributeValue(charArray56);
        tag53.appendAttributeValue(charArray56);
        startTag28.appendAttributeValue(charArray56);
        startTag21.appendAttributeValue(charArray56);
        startTag0.appendAttributeValue(charArray56);
        java.lang.String str62 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag11.attributes = attributes15;
        startTag8.attributes = attributes15;
        java.lang.String str18 = startTag8.normalName;
        org.jsoup.parser.Token.Tag tag19 = startTag8.reset();
        org.jsoup.parser.Token.Tag tag20 = startTag8.reset();
        startTag8.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag23.reset();
        org.jsoup.nodes.Attributes attributes25 = startTag23.attributes;
        org.jsoup.parser.Token.StartTag startTag26 = startTag8.nameAttr("", attributes25);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendTagName("");
        org.jsoup.nodes.Attributes attributes30 = null;
        startTag27.attributes = attributes30;
        org.jsoup.parser.Token.Tag tag32 = startTag27.reset();
        org.jsoup.nodes.Attributes attributes33 = startTag27.attributes;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        startTag34.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        char[] charArray38 = new char[] {};
        startTag37.appendAttributeValue(charArray38);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = startTag40.attributes;
        startTag37.attributes = attributes41;
        startTag34.attributes = attributes41;
        startTag34.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendTagName("");
        java.lang.String str49 = startTag46.tagName;
        int[] intArray51 = new int[] { 0 };
        startTag46.appendAttributeValue(intArray51);
        startTag34.appendAttributeValue(intArray51);
        startTag27.appendAttributeValue(intArray51);
        startTag26.appendAttributeValue(intArray51);
        tag7.appendAttributeValue(intArray51);
        tag7.finaliseTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 0 });
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        doctype0.pubSysKey = "Doctype";
        doctype0.pubSysKey = "<<Commentcomment>>";
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.TokenType tokenType1 = character0.type;
        org.jsoup.parser.Token token2 = character0.reset();
        org.jsoup.parser.Token token3 = character0.reset();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag14.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag19 = startTag14.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.jsoup.nodes.Attributes attributes21 = tag19.getAttributes();
        startTag0.attributes = attributes21;
        boolean boolean23 = startTag0.selfClosing;
        boolean boolean24 = startTag0.isEndTag();
        boolean boolean25 = startTag0.isComment();
        startTag0.normalName = "Character";
        java.lang.Class<?> wildcardClass28 = startTag0.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName('#');
        boolean boolean7 = startTag0.isStartTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes14 = tag13.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        tag13.appendAttributeValue(charArray16);
        startTag0.appendAttributeValue(charArray16);
        startTag0.appendTagName("<#>");
        startTag0.appendAttributeValue("<<<hi!>>>");
        startTag0.appendTagName("Comment");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.isCharacter();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.toString();
        comment0.bogus = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype2.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype2.name;
        java.lang.String str6 = doctype2.getSystemIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        char[] charArray12 = new char[] { '4', '#' };
        startTag0.appendAttributeValue(charArray12);
        startTag0.appendTagName('#');
        java.lang.String str16 = startTag0.normalName;
        java.lang.String str17 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "commentcomment#" + "'", str16, "commentcomment#");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "commentcomment#" + "'", str17, "commentcomment#");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        doctype2.forceQuirks = false;
        doctype2.pubSysKey = "#";
        boolean boolean13 = doctype2.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment14 = doctype2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag11.attributes = attributes15;
        startTag8.attributes = attributes15;
        startTag8.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag20 = startTag8.asStartTag();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.nodes.Attributes attributes25 = startTag22.getAttributes();
        boolean boolean26 = startTag22.isComment();
        org.jsoup.parser.Token.TokenType tokenType27 = startTag22.type;
        startTag22.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = startTag22.reset();
        org.jsoup.nodes.Attributes attributes31 = tag30.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = startTag8.nameAttr("comment", attributes31);
        org.jsoup.parser.Token.StartTag startTag33 = startTag0.nameAttr("Comment", attributes31);
        startTag0.appendAttributeValue("commentcomment#");
        boolean boolean36 = startTag0.isEOF();
        org.jsoup.parser.Token.StartTag startTag37 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        startTag39.appendAttributeName("hi!");
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        startTag44.appendTagName("");
        org.jsoup.nodes.Attributes attributes47 = null;
        startTag44.attributes = attributes47;
        org.jsoup.parser.Token.Tag tag49 = startTag44.reset();
        org.jsoup.nodes.Attributes attributes50 = startTag44.attributes;
        startTag39.attributes = attributes50;
        org.jsoup.parser.Token.StartTag startTag52 = startTag37.nameAttr("<<!---->>", attributes50);
        java.lang.String str53 = startTag37.toString();
        org.jsoup.parser.Token token54 = startTag37.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<<<!---->>>" + "'", str53, "<<<!---->>>");
        org.junit.Assert.assertNotNull(token54);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        startTag0.appendAttributeName('4');
        startTag0.newAttribute();
        boolean boolean15 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("<#>");
        boolean boolean18 = startTag0.isComment();
        java.lang.String str19 = startTag0.normalName();
        startTag0.appendTagName("<<comment>>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        tag2.selfClosing = false;
        tag2.setEmptyAttributeValue();
        tag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes8 = tag2.getAttributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        boolean boolean15 = tag14.selfClosing;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        boolean boolean7 = startTag0.isEndTag();
        java.lang.String str8 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        startTag9.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag15 = startTag9.name("Comment");
        startTag9.appendTagName("comment");
        java.lang.String str18 = startTag9.normalName();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag22.attributes = attributes26;
        startTag19.attributes = attributes26;
        org.jsoup.parser.Token.Tag tag30 = startTag19.name("Doctype");
        org.jsoup.nodes.Attributes attributes31 = startTag19.getAttributes();
        startTag9.attributes = attributes31;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName("");
        java.lang.String str36 = startTag33.tagName;
        startTag33.normalName = "Doctype";
        startTag33.appendAttributeValue("Commentcomment");
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        startTag41.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        char[] charArray45 = new char[] {};
        startTag44.appendAttributeValue(charArray45);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = startTag47.attributes;
        startTag44.attributes = attributes48;
        startTag41.attributes = attributes48;
        startTag41.selfClosing = false;
        startTag41.appendAttributeName('4');
        startTag41.newAttribute();
        startTag41.selfClosing = false;
        org.jsoup.parser.Token.Tag tag58 = startTag41.reset();
        tag58.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        char[] charArray62 = new char[] {};
        startTag61.appendAttributeValue(charArray62);
        org.jsoup.nodes.Attributes attributes64 = startTag61.getAttributes();
        boolean boolean65 = startTag61.isComment();
        startTag61.appendAttributeName("Comment");
        startTag61.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes70 = startTag61.attributes;
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        char[] charArray72 = new char[] {};
        startTag71.appendAttributeValue(charArray72);
        startTag61.appendAttributeValue(charArray72);
        tag58.appendAttributeValue(charArray72);
        startTag33.appendAttributeValue(charArray72);
        startTag9.appendAttributeValue(charArray72);
        startTag0.appendAttributeValue(charArray72);
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        startTag79.appendTagName("");
        org.jsoup.nodes.Attributes attributes82 = null;
        startTag79.attributes = attributes82;
        startTag79.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag86 = new org.jsoup.parser.Token.StartTag();
        startTag86.appendTagName("");
        org.jsoup.nodes.Attributes attributes89 = null;
        startTag86.attributes = attributes89;
        org.jsoup.parser.Token.Tag tag91 = startTag86.reset();
        org.jsoup.nodes.Attributes attributes92 = startTag86.attributes;
        startTag79.attributes = attributes92;
        startTag0.attributes = attributes92;
        java.lang.String str95 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "commentcomment" + "'", str18, "commentcomment");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] {});
        org.junit.Assert.assertNotNull(tag91);
        org.junit.Assert.assertNotNull(attributes92);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        startTag0.finaliseTag();
        startTag0.newAttribute();
        java.lang.String str10 = startTag0.toString();
        startTag0.appendTagName("#");
        boolean boolean13 = startTag0.isEOF();
        startTag0.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<Comment>" + "'", str10, "<Comment>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.tagName = "";
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        org.jsoup.nodes.Attributes attributes20 = startTag17.getAttributes();
        boolean boolean21 = startTag17.isComment();
        startTag17.appendAttributeName("Comment");
        startTag17.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes26 = startTag17.attributes;
        startTag11.attributes = attributes26;
        org.jsoup.nodes.Attributes attributes28 = startTag11.attributes;
        org.jsoup.parser.Token.Tag tag29 = startTag11.reset();
        tag29.appendTagName("<   a>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        org.jsoup.parser.Token token7 = doctype2.reset();
        java.lang.String str8 = doctype2.getName();
        java.lang.StringBuilder stringBuilder9 = doctype2.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendTagName('4');
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        char[] charArray14 = new char[] {};
        startTag13.appendAttributeValue(charArray14);
        org.jsoup.nodes.Attributes attributes16 = startTag13.getAttributes();
        boolean boolean17 = startTag13.isComment();
        org.jsoup.parser.Token.TokenType tokenType18 = startTag13.type;
        startTag13.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = startTag13.reset();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendTagName("");
        org.jsoup.nodes.Attributes attributes25 = null;
        startTag22.attributes = attributes25;
        org.jsoup.parser.Token.Tag tag27 = startTag22.reset();
        org.jsoup.nodes.Attributes attributes28 = tag27.attributes;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.nodes.Attributes attributes32 = null;
        startTag29.attributes = attributes32;
        org.jsoup.parser.Token.Tag tag34 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        char[] charArray37 = new char[] {};
        startTag36.appendAttributeValue(charArray37);
        tag34.appendAttributeValue(charArray37);
        tag27.appendAttributeValue(charArray37);
        tag21.appendAttributeValue(charArray37);
        startTag0.appendAttributeValue(charArray37);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = startTag0.getAttributes();
        startTag0.appendTagName("starttag");
        org.jsoup.parser.Token.Tag tag16 = startTag0.name("</commentcomment#>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag14.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag19 = startTag14.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.jsoup.nodes.Attributes attributes21 = tag19.getAttributes();
        startTag0.attributes = attributes21;
        boolean boolean23 = startTag0.selfClosing;
        boolean boolean24 = startTag0.isComment();
        startTag0.tagName = "Comment";
        boolean boolean27 = startTag0.isStartTag();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        char[] charArray33 = new char[] {};
        startTag32.appendAttributeValue(charArray33);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = startTag35.attributes;
        startTag32.attributes = attributes36;
        startTag29.attributes = attributes36;
        java.lang.String str39 = startTag29.normalName;
        startTag29.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes42 = startTag29.getAttributes();
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        startTag43.appendTagName("");
        org.jsoup.nodes.Attributes attributes46 = null;
        startTag43.attributes = attributes46;
        org.jsoup.parser.Token.Tag tag48 = startTag43.reset();
        org.jsoup.parser.Token.TokenType tokenType49 = tag48.type;
        org.jsoup.nodes.Attributes attributes50 = tag48.getAttributes();
        startTag29.attributes = attributes50;
        org.jsoup.parser.Token.StartTag startTag52 = startTag0.nameAttr("<<hi!>>", attributes50);
        startTag52.appendTagName("<<hi!>>");
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        startTag56.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        char[] charArray60 = new char[] {};
        startTag59.appendAttributeValue(charArray60);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes63 = startTag62.attributes;
        startTag59.attributes = attributes63;
        startTag56.attributes = attributes63;
        startTag56.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag68 = startTag56.asStartTag();
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        char[] charArray71 = new char[] {};
        startTag70.appendAttributeValue(charArray71);
        org.jsoup.nodes.Attributes attributes73 = startTag70.getAttributes();
        boolean boolean74 = startTag70.isComment();
        org.jsoup.parser.Token.TokenType tokenType75 = startTag70.type;
        startTag70.selfClosing = true;
        org.jsoup.parser.Token.Tag tag78 = startTag70.reset();
        org.jsoup.nodes.Attributes attributes79 = tag78.attributes;
        org.jsoup.parser.Token.StartTag startTag80 = startTag56.nameAttr("comment", attributes79);
        org.jsoup.parser.Token.StartTag startTag81 = startTag52.nameAttr("#", attributes79);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] {});
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] {});
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + tokenType75 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType75.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertNotNull(startTag81);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        boolean boolean6 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        org.jsoup.parser.Token.TokenType tokenType8 = doctype2.type;
        java.lang.String str9 = doctype2.getSystemIdentifier();
        java.lang.String str10 = doctype2.getPubSysKey();
        java.lang.String str11 = doctype2.pubSysKey;
        java.lang.String str12 = doctype2.pubSysKey;
        boolean boolean13 = doctype2.isDoctype();
        java.lang.String str14 = doctype2.pubSysKey;
        java.lang.String str15 = doctype2.getSystemIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEndTag();
        boolean boolean4 = comment0.bogus;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        boolean boolean13 = startTag0.isEOF();
        org.jsoup.nodes.Attributes attributes14 = startTag0.attributes;
        startTag0.appendAttributeValue('#');
        boolean boolean17 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<hi!>");
        org.jsoup.nodes.Attributes attributes11 = startTag0.attributes;
        boolean boolean12 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token token8 = comment0.reset();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        java.lang.String str12 = startTag9.tagName;
        startTag9.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = startTag15.attributes;
        startTag15.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes19 = startTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag20 = startTag9.nameAttr("", attributes19);
        java.lang.String str21 = startTag20.tagName;
        startTag20.appendAttributeName("<!---->");
        startTag20.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.nodes.Attributes attributes29 = null;
        startTag26.attributes = attributes29;
        startTag26.appendTagName("");
        java.lang.String str33 = startTag26.tagName;
        startTag26.appendTagName('#');
        org.jsoup.nodes.Attributes attributes36 = startTag26.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType37 = startTag26.type;
        startTag20.type = tokenType37;
        doctype0.type = tokenType37;
        java.lang.String str40 = doctype0.pubSysKey;
        java.lang.String str41 = doctype0.getSystemIdentifier();
        boolean boolean42 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(attributes36);
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        boolean boolean5 = comment0.isDoctype();
        boolean boolean6 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName("");
        org.jsoup.nodes.Attributes attributes13 = null;
        startTag10.attributes = attributes13;
        org.jsoup.parser.Token.Tag tag15 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes16 = tag15.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName("");
        org.jsoup.nodes.Attributes attributes20 = null;
        startTag17.attributes = attributes20;
        org.jsoup.parser.Token.Tag tag22 = startTag17.reset();
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        tag22.appendAttributeValue(charArray25);
        tag15.appendAttributeValue(charArray25);
        startTag0.appendAttributeValue(charArray25);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        char[] charArray34 = new char[] {};
        startTag33.appendAttributeValue(charArray34);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = startTag36.attributes;
        startTag33.attributes = attributes37;
        startTag30.attributes = attributes37;
        startTag30.appendAttributeValue('4');
        boolean boolean42 = startTag30.selfClosing;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        char[] charArray45 = new char[] {};
        startTag44.appendAttributeValue(charArray45);
        startTag44.appendAttributeName("hi!");
        startTag44.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes51 = startTag44.getAttributes();
        org.jsoup.parser.Token.StartTag startTag52 = startTag30.nameAttr("hi!", attributes51);
        startTag0.attributes = attributes51;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag52);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        doctype2.forceQuirks = false;
        doctype2.pubSysKey = "#";
        boolean boolean13 = doctype2.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype2.name;
        java.lang.String str15 = doctype2.tokenType();
        java.lang.String str16 = doctype2.getPubSysKey();
        boolean boolean17 = doctype2.forceQuirks;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.TokenType tokenType5 = character0.type;
        org.jsoup.parser.Token.Character character7 = character0.data("Comment");
        org.jsoup.parser.Token.TokenType tokenType8 = character0.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        boolean boolean5 = doctype2.forceQuirks;
        java.lang.String str6 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "<StartTag>";
        java.lang.String str9 = doctype2.getPublicIdentifier();
        java.lang.String str10 = doctype2.getName();
        java.lang.StringBuilder stringBuilder11 = doctype2.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        java.lang.String str10 = startTag0.toString();
        boolean boolean11 = startTag0.isComment();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<Commentcomment>" + "'", str10, "<Commentcomment>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendTagName("");
        java.lang.String str9 = startTag6.tagName;
        startTag6.appendAttributeName("hi!");
        startTag6.appendTagName('#');
        startTag6.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        org.jsoup.nodes.Attributes attributes19 = startTag16.getAttributes();
        startTag16.appendTagName('#');
        startTag16.finaliseTag();
        boolean boolean23 = startTag16.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = startTag30.attributes;
        startTag27.attributes = attributes31;
        startTag24.attributes = attributes31;
        startTag24.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.appendTagName("");
        java.lang.String str39 = startTag36.tagName;
        int[] intArray41 = new int[] { 0 };
        startTag36.appendAttributeValue(intArray41);
        startTag24.appendAttributeValue(intArray41);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        startTag44.appendTagName("");
        org.jsoup.nodes.Attributes attributes47 = null;
        startTag44.attributes = attributes47;
        org.jsoup.parser.Token.Tag tag49 = startTag44.reset();
        org.jsoup.nodes.Attributes attributes50 = tag49.attributes;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        char[] charArray52 = new char[] {};
        startTag51.appendAttributeValue(charArray52);
        tag49.appendAttributeValue(charArray52);
        startTag24.appendAttributeValue(charArray52);
        startTag16.appendAttributeValue(charArray52);
        startTag6.appendAttributeValue(charArray52);
        org.jsoup.parser.Token.Tag tag59 = startTag6.name("Commentcomment");
        java.lang.String str60 = startTag6.toString();
        org.jsoup.nodes.Attributes attributes61 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag62 = startTag0.nameAttr("<<hi!>>", attributes61);
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes64 = startTag63.attributes;
        startTag63.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes67 = startTag63.getAttributes();
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        char[] charArray69 = new char[] {};
        startTag68.appendAttributeValue(charArray69);
        org.jsoup.nodes.Attributes attributes71 = startTag68.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType72 = startTag68.type;
        startTag63.type = tokenType72;
        startTag63.finaliseTag();
        org.jsoup.nodes.Attributes attributes75 = startTag63.attributes;
        startTag0.attributes = attributes75;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<Commentcomment>" + "'", str60, "<Commentcomment>");
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] {});
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertTrue("'" + tokenType72 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType72.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes75);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        doctype0.type = tokenType5;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.pubSysKey;
        java.lang.String str9 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype6.getSystemIdentifier();
        java.lang.String str8 = doctype6.tokenType();
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        org.jsoup.parser.Token token5 = doctype2.reset();
        boolean boolean6 = doctype2.isStartTag();
        java.lang.StringBuilder stringBuilder7 = doctype2.name;
        java.lang.String str8 = doctype2.pubSysKey;
        java.lang.StringBuilder stringBuilder9 = doctype2.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        boolean boolean5 = comment0.bogus;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token token7 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        boolean boolean9 = startTag0.isDoctype();
        boolean boolean10 = startTag0.isComment();
        startTag0.normalName = " ";
        java.lang.String str13 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getName();
        java.lang.StringBuilder stringBuilder9 = doctype2.systemIdentifier;
        boolean boolean10 = doctype2.isForceQuirks();
        java.lang.StringBuilder stringBuilder11 = doctype2.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = true;
        org.jsoup.parser.Token token9 = comment0.reset();
        boolean boolean10 = comment0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName('a');
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        boolean boolean6 = comment0.bogus;
        org.jsoup.parser.Token.TokenType tokenType7 = comment0.type;
        java.lang.String str8 = comment0.toString();
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag0.appendAttributeName("<!---->");
        boolean boolean25 = startTag0.isStartTag();
        java.lang.String str26 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        java.lang.String str31 = startTag28.tagName;
        startTag28.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = startTag34.attributes;
        startTag34.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes38 = startTag34.getAttributes();
        org.jsoup.parser.Token.StartTag startTag39 = startTag28.nameAttr("", attributes38);
        org.jsoup.parser.Token.StartTag startTag40 = startTag0.nameAttr("<hi!>", attributes38);
        java.lang.String str41 = startTag40.tagName;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<hi!>" + "'", str41, "<hi!>");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.String str3 = doctype0.getPubSysKey();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str5 = doctype4.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype6.type;
        doctype4.type = tokenType8;
        comment0.type = tokenType8;
        java.lang.String str11 = comment0.toString();
        org.jsoup.parser.Token token12 = comment0.reset();
        boolean boolean13 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isDoctype();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.pubSysKey;
        java.lang.String str9 = doctype0.getPubSysKey();
        java.lang.String str10 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        char[] charArray9 = new char[] {};
        startTag8.appendAttributeValue(charArray9);
        org.jsoup.nodes.Attributes attributes11 = startTag8.getAttributes();
        boolean boolean12 = startTag8.isComment();
        org.jsoup.parser.Token.TokenType tokenType13 = startTag8.type;
        org.jsoup.parser.Token.Tag tag14 = startTag8.reset();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        org.jsoup.nodes.Attributes attributes18 = startTag15.getAttributes();
        boolean boolean19 = startTag15.isComment();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag15.type;
        org.jsoup.parser.Token.Tag tag21 = startTag15.reset();
        tag21.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        startTag24.appendAttributeName("hi!");
        startTag24.appendAttributeName('a');
        java.lang.String str31 = startTag24.normalName;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        char[] charArray33 = new char[] {};
        startTag32.appendAttributeValue(charArray33);
        startTag32.appendAttributeName("hi!");
        startTag32.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes39 = startTag32.getAttributes();
        startTag24.attributes = attributes39;
        tag21.attributes = attributes39;
        tag14.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag43 = startTag0.nameAttr("a", attributes39);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag43);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName("");
        org.jsoup.nodes.Attributes attributes13 = null;
        startTag10.attributes = attributes13;
        org.jsoup.parser.Token.Tag tag15 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes16 = tag15.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName("");
        org.jsoup.nodes.Attributes attributes20 = null;
        startTag17.attributes = attributes20;
        org.jsoup.parser.Token.Tag tag22 = startTag17.reset();
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        tag22.appendAttributeValue(charArray25);
        tag15.appendAttributeValue(charArray25);
        startTag0.appendAttributeValue(charArray25);
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag31 = startTag0.asStartTag();
        java.lang.String str32 = startTag31.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendTagName('4');
        java.lang.String str4 = tag1.normalName;
        org.jsoup.nodes.Attributes attributes5 = tag1.getAttributes();
        tag1.appendTagName("<<<hi!>>>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        boolean boolean5 = startTag0.isSelfClosing();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        doctype0.forceQuirks = false;
        boolean boolean4 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token token7 = doctype0.reset();
        boolean boolean8 = token7.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        java.lang.String str13 = tag12.tagName;
        tag12.selfClosing = false;
        tag12.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.tagName = "";
        org.jsoup.parser.Token.StartTag startTag17 = startTag11.asStartTag();
        boolean boolean18 = startTag11.isEOF();
        boolean boolean19 = startTag11.isStartTag();
        boolean boolean20 = startTag11.selfClosing;
        startTag11.appendAttributeValue("<Commentcomment>");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        startTag23.appendAttributeName("hi!");
        startTag23.appendAttributeName('a');
        boolean boolean30 = startTag23.isStartTag();
        startTag23.normalName = "4";
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        char[] charArray34 = new char[] {};
        startTag33.appendAttributeValue(charArray34);
        org.jsoup.nodes.Attributes attributes36 = startTag33.getAttributes();
        boolean boolean37 = startTag33.isComment();
        org.jsoup.parser.Token.TokenType tokenType38 = startTag33.type;
        startTag33.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag41 = startTag33.asStartTag();
        org.jsoup.parser.Token.Tag tag43 = startTag33.name("Comment");
        startTag33.newAttribute();
        org.jsoup.nodes.Attributes attributes45 = startTag33.getAttributes();
        char[] charArray52 = new char[] { ' ', 'a', '#', '#', '4', ' ' };
        startTag33.appendAttributeValue(charArray52);
        startTag23.appendAttributeValue(charArray52);
        startTag11.appendAttributeValue(charArray52);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { ' ', 'a', '#', '#', '4', ' ' });
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isComment();
        boolean boolean6 = comment0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.pubSysKey = "hi!";
        boolean boolean6 = doctype0.isForceQuirks();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        char[] charArray12 = new char[] { '4', '#' };
        startTag0.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        org.jsoup.nodes.Attributes attributes18 = startTag15.getAttributes();
        boolean boolean19 = startTag15.isComment();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag15.type;
        startTag15.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        char[] charArray27 = new char[] {};
        startTag26.appendAttributeValue(charArray27);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = startTag29.attributes;
        startTag26.attributes = attributes30;
        startTag23.attributes = attributes30;
        startTag23.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag35 = startTag23.asStartTag();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        char[] charArray38 = new char[] {};
        startTag37.appendAttributeValue(charArray38);
        org.jsoup.nodes.Attributes attributes40 = startTag37.getAttributes();
        boolean boolean41 = startTag37.isComment();
        org.jsoup.parser.Token.TokenType tokenType42 = startTag37.type;
        startTag37.selfClosing = true;
        org.jsoup.parser.Token.Tag tag45 = startTag37.reset();
        org.jsoup.nodes.Attributes attributes46 = tag45.attributes;
        org.jsoup.parser.Token.StartTag startTag47 = startTag23.nameAttr("comment", attributes46);
        org.jsoup.parser.Token.StartTag startTag48 = startTag15.nameAttr("Comment", attributes46);
        startTag15.appendAttributeValue("commentcomment#");
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        char[] charArray55 = new char[] {};
        startTag54.appendAttributeValue(charArray55);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes58 = startTag57.attributes;
        startTag54.attributes = attributes58;
        startTag51.attributes = attributes58;
        java.lang.String str61 = startTag51.normalName;
        startTag51.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes64 = startTag51.getAttributes();
        startTag15.attributes = attributes64;
        org.jsoup.parser.Token.StartTag startTag66 = startTag0.nameAttr("<<Commentcomment>>", attributes64);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(startTag66);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.getData();
        boolean boolean7 = comment0.bogus;
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        boolean boolean3 = startTag0.isDoctype();
        startTag0.tagName = "<!---->";
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendTagName("");
        java.lang.String str9 = startTag6.tagName;
        int[] intArray11 = new int[] { 0 };
        startTag6.appendAttributeValue(intArray11);
        org.jsoup.parser.Token.Tag tag13 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes14 = startTag6.getAttributes();
        java.lang.String str15 = startTag6.normalName();
        org.jsoup.parser.Token.Tag tag17 = startTag6.name("Commentcomment");
        org.jsoup.parser.Token.TokenType tokenType18 = startTag6.type;
        startTag0.type = tokenType18;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.pubSysKey = "<<!---->>";
        doctype0.pubSysKey = "a";
        boolean boolean10 = doctype0.isStartTag();
        boolean boolean11 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag22.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag25.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes29 = startTag25.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = startTag22.nameAttr("hi!", attributes29);
        boolean boolean31 = startTag22.isComment();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        startTag0.appendAttributeName("<hi!>");
        java.lang.String str11 = startTag0.toString();
        org.jsoup.parser.Token.Tag tag13 = startTag0.name("<#>");
        org.jsoup.parser.Token.Tag tag14 = startTag0.reset();
        startTag0.normalName = "";
        org.jsoup.parser.Token.Tag tag18 = startTag0.name("<Comment>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<Commentcomment>" + "'", str11, "<Commentcomment>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes9 = startTag0.getAttributes();
        java.lang.String str10 = startTag0.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.getData();
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token.Character character5 = character0.data("<#>");
        org.jsoup.parser.Token token6 = character5.reset();
        org.jsoup.parser.Token token7 = character5.reset();
        org.jsoup.parser.Token.Character character9 = character5.data("<Doctype>");
        java.lang.String str10 = character5.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<Doctype>" + "'", str10, "<Doctype>");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        java.lang.String str10 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        tag6.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        startTag9.appendAttributeName("hi!");
        startTag9.appendAttributeName('a');
        java.lang.String str16 = startTag9.normalName;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        startTag17.appendAttributeName("hi!");
        startTag17.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes24 = startTag17.getAttributes();
        startTag9.attributes = attributes24;
        tag6.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag27 = tag6.asStartTag();
        java.lang.String str28 = startTag27.normalName();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "a" + "'", str28, "a");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.forceQuirks = false;
        boolean boolean8 = doctype0.isCharacter();
        java.lang.String str9 = doctype0.getPubSysKey();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        boolean boolean11 = doctype0.forceQuirks;
        java.lang.String str12 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag6.normalName = "hi!";
        startTag6.newAttribute();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token.Character character7 = character0.data("");
        java.lang.Class<?> wildcardClass8 = character7.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        startTag0.setEmptyAttributeValue();
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName("<StartTag>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        java.lang.String str6 = character0.getData();
        boolean boolean7 = character0.isComment();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token.Character character10 = character0.data("<   a>");
        java.lang.String str11 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<   a>" + "'", str11, "<   a>");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        boolean boolean7 = startTag0.isEndTag();
        boolean boolean8 = startTag0.isCharacter();
        boolean boolean9 = startTag0.isEndTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        boolean boolean11 = tag10.selfClosing;
        tag10.newAttribute();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        boolean boolean2 = doctype0.isComment();
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.tagName = "comment";
        boolean boolean7 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = character4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        java.lang.String str6 = startTag0.tokenType();
        boolean boolean7 = startTag0.isStartTag();
        java.lang.String str8 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isDoctype();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isDoctype();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        java.lang.String str6 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes10 = startTag8.attributes;
        org.jsoup.parser.Token.Tag tag11 = startTag8.reset();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag13.attributes;
        startTag13.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes17 = startTag13.getAttributes();
        java.lang.String str18 = startTag13.tagName;
        java.lang.String str19 = startTag13.toString();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        char[] charArray21 = new char[] {};
        startTag20.appendAttributeValue(charArray21);
        startTag20.appendAttributeName("hi!");
        startTag20.appendAttributeName('a');
        java.lang.String str27 = startTag20.normalName;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.nodes.Attributes attributes31 = null;
        startTag28.attributes = attributes31;
        org.jsoup.parser.Token.Tag tag33 = startTag28.reset();
        org.jsoup.nodes.Attributes attributes34 = startTag28.attributes;
        startTag20.attributes = attributes34;
        startTag13.attributes = attributes34;
        org.jsoup.parser.Token.StartTag startTag37 = startTag8.nameAttr("StartTag", attributes34);
        org.jsoup.parser.Token.StartTag startTag38 = startTag0.nameAttr("Character", attributes34);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        org.jsoup.nodes.Attributes attributes43 = null;
        startTag40.attributes = attributes43;
        org.jsoup.parser.Token.Tag tag45 = startTag40.reset();
        startTag40.selfClosing = true;
        org.jsoup.parser.Token.Tag tag48 = startTag40.reset();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendTagName("");
        java.lang.String str52 = startTag49.tagName;
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        char[] charArray55 = new char[] {};
        startTag54.appendAttributeValue(charArray55);
        org.jsoup.nodes.Attributes attributes57 = startTag54.getAttributes();
        org.jsoup.nodes.Attributes attributes58 = startTag54.getAttributes();
        org.jsoup.parser.Token.StartTag startTag59 = startTag49.nameAttr("Doctype", attributes58);
        startTag40.attributes = attributes58;
        org.jsoup.parser.Token.StartTag startTag61 = startTag38.nameAttr("commentcomment#", attributes58);
        startTag38.appendAttributeName("commentcomment#");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>" + "'", str19, "<hi!>");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertNotNull(startTag61);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "hi!";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        java.lang.String str13 = tag12.tagName;
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token15 = doctype14.reset();
        java.lang.String str16 = doctype14.getPubSysKey();
        java.lang.String str17 = doctype14.getSystemIdentifier();
        org.jsoup.parser.Token token18 = doctype14.reset();
        java.lang.String str19 = doctype14.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token21 = doctype20.reset();
        org.jsoup.parser.Token.Doctype doctype22 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str23 = doctype22.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str25 = doctype24.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType26 = doctype24.type;
        doctype22.type = tokenType26;
        doctype20.type = tokenType26;
        doctype14.type = tokenType26;
        tag12.type = tokenType26;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getName();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("Comment");
        startTag0.setEmptyAttributeValue();
        startTag0.setEmptyAttributeValue();
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes14 = startTag0.attributes;
        java.lang.String str15 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "comment" + "'", str15, "comment");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        boolean boolean5 = doctype2.forceQuirks;
        java.lang.String str6 = doctype2.tokenType();
        java.lang.String str7 = doctype2.pubSysKey;
        java.lang.String str8 = doctype2.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.jsoup.parser.Token token8 = eOF0.reset();
        org.jsoup.parser.Token token9 = eOF0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        char[] charArray11 = new char[] {};
        startTag10.appendAttributeValue(charArray11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag13.attributes;
        startTag10.attributes = attributes14;
        startTag7.attributes = attributes14;
        startTag7.selfClosing = false;
        startTag7.appendAttributeName('4');
        startTag7.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes23 = startTag7.attributes;
        startTag0.attributes = attributes23;
        java.lang.String str25 = startTag0.tagName;
        startTag0.appendTagName("commentcomment");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token token4 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        java.lang.String str7 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes14 = startTag8.attributes;
        startTag0.attributes = attributes14;
        org.jsoup.parser.Token.Tag tag17 = startTag0.name("<hi!>");
        boolean boolean18 = tag17.isDoctype();
        tag17.appendAttributeValue("Commentcomment");
        tag17.appendTagName(' ');
        java.lang.String str23 = tag17.name();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!> " + "'", str23, "<hi!> ");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token token12 = doctype0.reset();
        boolean boolean13 = token12.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        java.lang.String str10 = startTag0.tokenType();
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        startTag0.tagName = "<#>";
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        org.jsoup.nodes.Attributes attributes17 = startTag14.getAttributes();
        boolean boolean18 = startTag14.isComment();
        org.jsoup.parser.Token.TokenType tokenType19 = startTag14.type;
        startTag14.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag22 = startTag14.asStartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag14.name("Comment");
        org.jsoup.parser.Token.Tag tag25 = startTag14.reset();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        char[] charArray27 = new char[] {};
        startTag26.appendAttributeValue(charArray27);
        org.jsoup.nodes.Attributes attributes29 = startTag26.getAttributes();
        boolean boolean30 = startTag26.isComment();
        org.jsoup.parser.Token.TokenType tokenType31 = startTag26.type;
        startTag26.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag34 = startTag26.asStartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag26.name("Comment");
        startTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes38 = startTag26.getAttributes();
        startTag14.attributes = attributes38;
        startTag0.attributes = attributes38;
        startTag0.appendTagName("starttag");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        startTag0.newAttribute();
        startTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag16 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag18 = tag16.name("<<<!---->>>");
        tag18.normalName = "4";
        org.jsoup.parser.Token.Tag tag22 = tag18.name("<Commentcomment>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        boolean boolean12 = startTag0.isCharacter();
        boolean boolean13 = startTag0.isCharacter();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        char[] charArray19 = new char[] {};
        startTag18.appendAttributeValue(charArray19);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes22 = startTag21.attributes;
        startTag18.attributes = attributes22;
        startTag15.attributes = attributes22;
        startTag15.appendAttributeValue('4');
        boolean boolean27 = startTag15.selfClosing;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.nodes.Attributes attributes31 = null;
        startTag28.attributes = attributes31;
        org.jsoup.parser.Token.Tag tag33 = startTag28.reset();
        org.jsoup.nodes.Attributes attributes34 = startTag28.attributes;
        startTag15.attributes = attributes34;
        org.jsoup.parser.Token.StartTag startTag36 = startTag0.nameAttr("4", attributes34);
        boolean boolean37 = startTag0.isEndTag();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.isDoctype();
        boolean boolean7 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        org.jsoup.parser.Token token5 = doctype0.reset();
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(doctype4);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        java.lang.String str7 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes14 = startTag8.attributes;
        startTag0.attributes = attributes14;
        org.jsoup.parser.Token.Tag tag17 = startTag0.name("<hi!>");
        boolean boolean18 = tag17.isDoctype();
        org.jsoup.parser.Token.Tag tag19 = tag17.reset();
        org.jsoup.nodes.Attributes attributes20 = tag17.getAttributes();
        org.jsoup.parser.Token.Tag tag22 = tag17.name("Commentcomment");
        org.jsoup.parser.Token.Tag tag24 = tag17.name("<!---->");
        boolean boolean25 = tag17.isCharacter();
        tag17.appendTagName("<#>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        boolean boolean11 = startTag7.isComment();
        org.jsoup.parser.Token.TokenType tokenType12 = startTag7.type;
        org.jsoup.parser.Token.Tag tag13 = startTag7.reset();
        tag13.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        startTag16.appendAttributeName("hi!");
        startTag16.appendAttributeName('a');
        java.lang.String str23 = startTag16.normalName;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        startTag24.appendAttributeName("hi!");
        startTag24.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes31 = startTag24.getAttributes();
        startTag16.attributes = attributes31;
        tag13.attributes = attributes31;
        tag6.attributes = attributes31;
        boolean boolean35 = tag6.isCharacter();
        tag6.finaliseTag();
        tag6.finaliseTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        boolean boolean13 = startTag0.selfClosing;
        boolean boolean14 = startTag0.isSelfClosing();
        boolean boolean15 = startTag0.selfClosing;
        java.lang.String str16 = startTag0.tokenType();
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        char[] charArray12 = new char[] { '4', '#' };
        startTag0.appendAttributeValue(charArray12);
        boolean boolean14 = startTag0.isCharacter();
        startTag0.tagName = "commentcomment#";
        startTag0.normalName = "";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        startTag0.appendAttributeName('4');
        startTag0.newAttribute();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag16 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        startTag0.appendAttributeValue('#');
        startTag0.tagName = "commentcomment#";
        startTag0.appendAttributeValue("Character");
        org.jsoup.parser.Token token16 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.asStartTag();
        java.lang.String str18 = startTag0.normalName();
        startTag0.appendTagName('a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag4.reset();
        org.jsoup.nodes.Attributes attributes6 = startTag4.attributes;
        startTag0.attributes = attributes6;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        org.jsoup.parser.Token.TokenType tokenType14 = tag13.type;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        startTag15.appendAttributeName("hi!");
        startTag15.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes22 = startTag15.getAttributes();
        tag13.attributes = attributes22;
        startTag0.attributes = attributes22;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        boolean boolean23 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("<Comment>");
        java.lang.String str26 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        boolean boolean7 = startTag0.isEndTag();
        boolean boolean8 = startTag0.isCharacter();
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token10 = character9.reset();
        org.jsoup.parser.Token.Character character12 = character9.data("comment");
        org.jsoup.parser.Token.Character character14 = character9.data("#");
        java.lang.String str15 = character9.getData();
        org.jsoup.parser.Token token16 = character9.reset();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        char[] charArray21 = new char[] {};
        startTag20.appendAttributeValue(charArray21);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = startTag23.attributes;
        startTag20.attributes = attributes24;
        startTag17.attributes = attributes24;
        startTag17.selfClosing = false;
        startTag17.appendAttributeName('4');
        startTag17.newAttribute();
        startTag17.selfClosing = false;
        org.jsoup.parser.Token.Tag tag34 = startTag17.reset();
        boolean boolean35 = startTag17.isSelfClosing();
        startTag17.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Tag tag38 = startTag17.reset();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        startTag39.appendTagName("");
        org.jsoup.nodes.Attributes attributes42 = null;
        startTag39.attributes = attributes42;
        org.jsoup.parser.Token.Tag tag44 = startTag39.reset();
        org.jsoup.nodes.Attributes attributes45 = startTag39.attributes;
        startTag39.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType47 = org.jsoup.parser.Token.TokenType.EndTag;
        startTag39.type = tokenType47;
        startTag17.type = tokenType47;
        character9.type = tokenType47;
        startTag0.type = tokenType47;
        java.lang.String str52 = startTag0.normalName();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        comment4.bogus = false;
        comment4.bogus = false;
        java.lang.String str9 = comment4.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        boolean boolean2 = eOF0.isEOF();
        boolean boolean3 = eOF0.isEndTag();
        boolean boolean4 = eOF0.isCharacter();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag11.attributes = attributes15;
        startTag8.attributes = attributes15;
        startTag8.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag20 = startTag8.asStartTag();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.nodes.Attributes attributes25 = startTag22.getAttributes();
        boolean boolean26 = startTag22.isComment();
        org.jsoup.parser.Token.TokenType tokenType27 = startTag22.type;
        startTag22.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = startTag22.reset();
        org.jsoup.nodes.Attributes attributes31 = tag30.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = startTag8.nameAttr("comment", attributes31);
        org.jsoup.parser.Token.StartTag startTag33 = startTag0.nameAttr("Comment", attributes31);
        startTag0.appendAttributeValue("commentcomment#");
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = startTag42.attributes;
        startTag39.attributes = attributes43;
        startTag36.attributes = attributes43;
        java.lang.String str46 = startTag36.normalName;
        startTag36.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes49 = startTag36.getAttributes();
        startTag0.attributes = attributes49;
        startTag0.appendAttributeName("commentcomment#");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(attributes49);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        java.lang.String str6 = tag5.tagName;
        java.lang.String str7 = tag5.normalName;
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        boolean boolean14 = startTag0.isDoctype();
        startTag0.tagName = "<hi!>";
        startTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag19 = startTag0.reset();
        tag19.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.pubSysKey = "<Commentcomment>";
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        boolean boolean12 = startTag0.isCharacter();
        boolean boolean13 = startTag0.isCharacter();
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag15 = startTag0.reset();
        boolean boolean16 = tag15.isEndTag();
        boolean boolean17 = tag15.isComment();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag22.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag25.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes29 = startTag25.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = startTag22.nameAttr("hi!", attributes29);
        org.jsoup.parser.Token.TokenType tokenType31 = startTag22.type;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        tag7.setEmptyAttributeValue();
        java.lang.String str10 = tag7.normalName();
        boolean boolean11 = tag7.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag4 = tag1.reset();
        boolean boolean5 = tag1.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.tagName = "";
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        org.jsoup.nodes.Attributes attributes20 = startTag17.getAttributes();
        boolean boolean21 = startTag17.isComment();
        startTag17.appendAttributeName("Comment");
        startTag17.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes26 = startTag17.attributes;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        startTag17.appendAttributeValue(charArray28);
        startTag11.appendAttributeValue(charArray28);
        boolean boolean32 = startTag11.isEOF();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName("");
        java.lang.String str36 = startTag33.tagName;
        org.jsoup.parser.Token.Tag tag37 = startTag33.reset();
        boolean boolean38 = startTag33.isCharacter();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        org.jsoup.nodes.Attributes attributes42 = startTag39.getAttributes();
        startTag39.appendTagName('#');
        startTag39.finaliseTag();
        boolean boolean46 = startTag39.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        startTag47.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        char[] charArray51 = new char[] {};
        startTag50.appendAttributeValue(charArray51);
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes54 = startTag53.attributes;
        startTag50.attributes = attributes54;
        startTag47.attributes = attributes54;
        startTag47.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        startTag59.appendTagName("");
        java.lang.String str62 = startTag59.tagName;
        int[] intArray64 = new int[] { 0 };
        startTag59.appendAttributeValue(intArray64);
        startTag47.appendAttributeValue(intArray64);
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        startTag67.appendTagName("");
        org.jsoup.nodes.Attributes attributes70 = null;
        startTag67.attributes = attributes70;
        org.jsoup.parser.Token.Tag tag72 = startTag67.reset();
        org.jsoup.nodes.Attributes attributes73 = tag72.attributes;
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        char[] charArray75 = new char[] {};
        startTag74.appendAttributeValue(charArray75);
        tag72.appendAttributeValue(charArray75);
        startTag47.appendAttributeValue(charArray75);
        startTag39.appendAttributeValue(charArray75);
        startTag33.appendAttributeValue(charArray75);
        startTag11.appendAttributeValue(charArray75);
        boolean boolean82 = startTag11.isSelfClosing();
        startTag11.appendAttributeName("Character");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        doctype0.pubSysKey = "<!---->";
        java.lang.String str12 = doctype0.getPublicIdentifier();
        java.lang.String str13 = doctype0.getName();
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        boolean boolean5 = startTag0.isEOF();
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        org.jsoup.nodes.Attributes attributes12 = null;
        startTag9.attributes = attributes12;
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        tag14.appendAttributeValue(charArray17);
        org.jsoup.nodes.Attributes attributes20 = tag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = startTag0.nameAttr("", attributes20);
        startTag21.normalName = "Commentcomment<<<hi!>>>";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        char[] charArray12 = new char[] { '4', '#' };
        startTag0.appendAttributeValue(charArray12);
        startTag0.appendTagName('#');
        startTag0.appendAttributeName('#');
        org.jsoup.parser.Token token18 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        char[] charArray21 = new char[] {};
        startTag20.appendAttributeValue(charArray21);
        org.jsoup.nodes.Attributes attributes23 = startTag20.getAttributes();
        boolean boolean24 = startTag20.isComment();
        org.jsoup.parser.Token.TokenType tokenType25 = startTag20.type;
        org.jsoup.parser.Token.Tag tag26 = startTag20.reset();
        tag26.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        char[] charArray30 = new char[] {};
        startTag29.appendAttributeValue(charArray30);
        startTag29.appendAttributeName("hi!");
        startTag29.appendAttributeName('a');
        java.lang.String str36 = startTag29.normalName;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        char[] charArray38 = new char[] {};
        startTag37.appendAttributeValue(charArray38);
        startTag37.appendAttributeName("hi!");
        startTag37.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes44 = startTag37.getAttributes();
        startTag29.attributes = attributes44;
        tag26.attributes = attributes44;
        org.jsoup.parser.Token.StartTag startTag47 = tag26.asStartTag();
        tag26.appendAttributeValue("<!---->");
        tag26.finaliseTag();
        boolean boolean51 = tag26.isCharacter();
        org.jsoup.nodes.Attributes attributes52 = tag26.attributes;
        org.jsoup.parser.Token.StartTag startTag53 = startTag0.nameAttr("<4>", attributes52);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#' });
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(startTag53);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        startTag0.appendAttributeValue('a');
        startTag0.normalName = "Comment";
        startTag0.selfClosing = false;
        boolean boolean19 = startTag0.isDoctype();
        boolean boolean20 = startTag0.isSelfClosing();
        boolean boolean21 = startTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag22 = startTag0.reset();
        startTag0.newAttribute();
        java.lang.String str24 = startTag0.tagName;
        startTag0.appendTagName(' ');
        org.jsoup.parser.Token token27 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(token27);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        java.lang.String str7 = startTag6.tokenType();
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getPublicIdentifier();
        java.lang.String str10 = doctype8.getPublicIdentifier();
        boolean boolean11 = doctype8.isDoctype();
        java.lang.String str12 = doctype8.getName();
        boolean boolean13 = doctype8.isForceQuirks();
        java.lang.String str14 = doctype8.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype15 = doctype8.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType16 = doctype8.type;
        startTag6.type = tokenType16;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(doctype15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("comment");
        java.lang.String str7 = character4.toString();
        java.lang.String str8 = character4.getData();
        org.jsoup.parser.Token.Character character10 = character4.data("");
        org.jsoup.parser.Token token11 = character10.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "comment" + "'", str7, "comment");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "comment" + "'", str8, "comment");
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        doctype0.pubSysKey = "";
        boolean boolean8 = doctype0.isDoctype();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doctype9);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype0.pubSysKey = "comment";
        doctype0.pubSysKey = "<commentcomment>";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        doctype6.pubSysKey = "<!---->";
        boolean boolean9 = doctype6.forceQuirks;
        java.lang.String str10 = doctype6.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        startTag0.appendAttributeValue("Commentcomment");
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName("Comment");
        startTag0.finaliseTag();
        startTag0.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag14.newAttribute();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        startTag17.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag23 = startTag17.name("Comment");
        startTag17.appendTagName("comment");
        java.lang.String str26 = startTag17.normalName();
        char[] charArray29 = new char[] { '4', '#' };
        startTag17.appendAttributeValue(charArray29);
        startTag14.appendAttributeValue(charArray29);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName("");
        java.lang.String str36 = startTag33.tagName;
        startTag33.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes40 = startTag39.attributes;
        startTag39.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes43 = startTag39.getAttributes();
        org.jsoup.parser.Token.StartTag startTag44 = startTag33.nameAttr("", attributes43);
        org.jsoup.parser.Token.StartTag startTag45 = startTag14.nameAttr("#", attributes43);
        org.jsoup.nodes.Attributes attributes46 = startTag45.attributes;
        startTag0.attributes = attributes46;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "commentcomment" + "'", str26, "commentcomment");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(attributes46);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = startTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = startTag19.attributes;
        startTag16.attributes = attributes20;
        startTag13.attributes = attributes20;
        startTag13.appendAttributeValue('4');
        boolean boolean25 = startTag13.selfClosing;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.nodes.Attributes attributes29 = null;
        startTag26.attributes = attributes29;
        org.jsoup.parser.Token.Tag tag31 = startTag26.reset();
        org.jsoup.nodes.Attributes attributes32 = startTag26.attributes;
        startTag13.attributes = attributes32;
        startTag11.attributes = attributes32;
        org.jsoup.nodes.Attributes attributes35 = startTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = startTag0.nameAttr("<Commentcomment#>", attributes35);
        org.jsoup.parser.Token.Tag tag38 = startTag0.name("comment");
        boolean boolean39 = tag38.isDoctype();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        startTag0.appendAttributeName('4');
        startTag0.newAttribute();
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag17 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag18 = startTag0.reset();
        tag18.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes21 = tag18.attributes;
        boolean boolean22 = tag18.isCharacter();
        org.jsoup.parser.Token.Tag tag24 = tag18.name("<StartTag>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        startTag0.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        java.lang.String str13 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag15 = startTag0.name("commentcomment");
        startTag0.tagName = "<Commentcomment>";
        startTag0.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment20 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName("");
        java.lang.String str13 = startTag10.tagName;
        startTag10.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = startTag16.attributes;
        startTag16.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes20 = startTag16.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = startTag10.nameAttr("", attributes20);
        org.jsoup.parser.Token.TokenType tokenType22 = startTag21.type;
        org.jsoup.parser.Token.Tag tag24 = startTag21.name("StartTag");
        org.jsoup.nodes.Attributes attributes25 = tag24.attributes;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        char[] charArray30 = new char[] {};
        startTag29.appendAttributeValue(charArray30);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = startTag32.attributes;
        startTag29.attributes = attributes33;
        startTag26.attributes = attributes33;
        java.lang.String str36 = startTag26.normalName;
        startTag26.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes39 = startTag26.getAttributes();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        org.jsoup.nodes.Attributes attributes43 = null;
        startTag40.attributes = attributes43;
        org.jsoup.parser.Token.Tag tag45 = startTag40.reset();
        org.jsoup.parser.Token.TokenType tokenType46 = tag45.type;
        org.jsoup.nodes.Attributes attributes47 = tag45.getAttributes();
        startTag26.attributes = attributes47;
        boolean boolean49 = startTag26.selfClosing;
        boolean boolean50 = startTag26.isComment();
        startTag26.tagName = "Comment";
        boolean boolean53 = startTag26.isStartTag();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        startTag55.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        char[] charArray59 = new char[] {};
        startTag58.appendAttributeValue(charArray59);
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes62 = startTag61.attributes;
        startTag58.attributes = attributes62;
        startTag55.attributes = attributes62;
        java.lang.String str65 = startTag55.normalName;
        startTag55.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes68 = startTag55.getAttributes();
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        startTag69.appendTagName("");
        org.jsoup.nodes.Attributes attributes72 = null;
        startTag69.attributes = attributes72;
        org.jsoup.parser.Token.Tag tag74 = startTag69.reset();
        org.jsoup.parser.Token.TokenType tokenType75 = tag74.type;
        org.jsoup.nodes.Attributes attributes76 = tag74.getAttributes();
        startTag55.attributes = attributes76;
        org.jsoup.parser.Token.StartTag startTag78 = startTag26.nameAttr("<<hi!>>", attributes76);
        tag24.attributes = attributes76;
        org.jsoup.parser.Token.StartTag startTag80 = startTag0.nameAttr("comment", attributes76);
        boolean boolean81 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertTrue("'" + tokenType75 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType75.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType2 = eOF0.type;
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        boolean boolean5 = eOF0.isCharacter();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.nodes.Attributes attributes21 = null;
        startTag18.attributes = attributes21;
        startTag18.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        org.jsoup.nodes.Attributes attributes28 = null;
        startTag25.attributes = attributes28;
        org.jsoup.parser.Token.Tag tag30 = startTag25.reset();
        org.jsoup.nodes.Attributes attributes31 = startTag25.attributes;
        startTag18.attributes = attributes31;
        org.jsoup.nodes.Attributes attributes33 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag34 = startTag11.nameAttr("Doctype", attributes33);
        boolean boolean35 = startTag11.isCharacter();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character2.getData();
        org.jsoup.parser.Token.Character character5 = character2.data("<<!---->>");
        java.lang.String str6 = character5.toString();
        java.lang.String str7 = character5.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<<!---->>" + "'", str6, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<!---->>" + "'", str7, "<<!---->>");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        org.jsoup.parser.Token token7 = doctype2.reset();
        boolean boolean8 = doctype2.isForceQuirks();
        doctype2.forceQuirks = false;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        boolean boolean9 = startTag0.isDoctype();
        startTag0.tagName = "<hi!>";
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        char[] charArray14 = new char[] {};
        startTag13.appendAttributeValue(charArray14);
        startTag13.appendAttributeName("hi!");
        startTag13.appendAttributeName('a');
        boolean boolean20 = startTag13.selfClosing;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendTagName("");
        org.jsoup.nodes.Attributes attributes24 = null;
        startTag21.attributes = attributes24;
        startTag21.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.nodes.Attributes attributes31 = null;
        startTag28.attributes = attributes31;
        org.jsoup.parser.Token.Tag tag33 = startTag28.reset();
        org.jsoup.nodes.Attributes attributes34 = startTag28.attributes;
        startTag21.attributes = attributes34;
        startTag13.attributes = attributes34;
        org.jsoup.parser.Token.StartTag startTag37 = startTag0.nameAttr("<Commentcomment#>", attributes34);
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        org.jsoup.nodes.Attributes attributes42 = startTag39.getAttributes();
        boolean boolean43 = startTag39.isComment();
        org.jsoup.parser.Token.TokenType tokenType44 = startTag39.type;
        startTag39.selfClosing = true;
        org.jsoup.parser.Token.Tag tag47 = startTag39.reset();
        org.jsoup.nodes.Attributes attributes48 = tag47.attributes;
        org.jsoup.parser.Token.StartTag startTag49 = startTag37.nameAttr("#", attributes48);
        org.jsoup.parser.Token.Tag tag50 = startTag37.reset();
        org.jsoup.parser.Token.TokenType tokenType51 = startTag37.type;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + tokenType51 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType51.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.bogus;
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        java.lang.String str8 = comment0.getData();
        boolean boolean9 = comment0.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        java.lang.String str10 = startTag0.tagName;
        startTag0.selfClosing = false;
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.isCharacter();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        java.lang.String str7 = comment0.toString();
        org.jsoup.parser.Token token8 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.tokenType();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isStartTag();
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        startTag0.appendAttributeName('4');
        startTag0.appendTagName('a');
        startTag0.finaliseTag();
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        char[] charArray14 = new char[] {};
        startTag13.appendAttributeValue(charArray14);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = startTag16.attributes;
        startTag13.attributes = attributes17;
        startTag10.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag21 = startTag10.name("Doctype");
        org.jsoup.nodes.Attributes attributes22 = startTag10.getAttributes();
        startTag0.attributes = attributes22;
        boolean boolean24 = startTag0.isEndTag();
        startTag0.appendAttributeName("<Comment  hi!=\"<!---->\">");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        java.lang.String str11 = startTag8.tagName;
        startTag8.setEmptyAttributeValue();
        startTag8.appendTagName('#');
        boolean boolean15 = startTag8.isStartTag();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.nodes.Attributes attributes19 = null;
        startTag16.attributes = attributes19;
        org.jsoup.parser.Token.Tag tag21 = startTag16.reset();
        org.jsoup.nodes.Attributes attributes22 = tag21.attributes;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        tag21.appendAttributeValue(charArray24);
        startTag8.appendAttributeValue(charArray24);
        startTag0.appendAttributeValue(charArray24);
        startTag0.setEmptyAttributeValue();
        startTag0.setEmptyAttributeValue();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = startTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = startTag19.attributes;
        startTag16.attributes = attributes20;
        startTag13.attributes = attributes20;
        startTag13.appendAttributeValue('4');
        boolean boolean25 = startTag13.selfClosing;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.nodes.Attributes attributes29 = null;
        startTag26.attributes = attributes29;
        org.jsoup.parser.Token.Tag tag31 = startTag26.reset();
        org.jsoup.nodes.Attributes attributes32 = startTag26.attributes;
        startTag13.attributes = attributes32;
        startTag11.attributes = attributes32;
        org.jsoup.nodes.Attributes attributes35 = startTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = startTag0.nameAttr("<Commentcomment#>", attributes35);
        boolean boolean37 = startTag0.selfClosing;
        java.lang.String str38 = startTag0.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<Commentcomment#>" + "'", str38, "<Commentcomment#>");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.getData();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.isComment();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        char[] charArray6 = new char[] {};
        startTag5.appendAttributeValue(charArray6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = startTag8.attributes;
        startTag5.attributes = attributes9;
        startTag2.attributes = attributes9;
        startTag2.appendAttributeValue('4');
        boolean boolean14 = startTag2.selfClosing;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        org.jsoup.nodes.Attributes attributes18 = null;
        startTag15.attributes = attributes18;
        org.jsoup.parser.Token.Tag tag20 = startTag15.reset();
        org.jsoup.nodes.Attributes attributes21 = startTag15.attributes;
        startTag2.attributes = attributes21;
        startTag0.attributes = attributes21;
        java.lang.String str24 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes25 = null;
        startTag0.attributes = attributes25;
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        java.lang.String str31 = startTag28.tagName;
        org.jsoup.parser.Token.Tag tag32 = startTag28.reset();
        java.lang.String str33 = startTag28.tagName;
        org.jsoup.parser.Token.Tag tag34 = startTag28.reset();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        char[] charArray36 = new char[] {};
        startTag35.appendAttributeValue(charArray36);
        org.jsoup.nodes.Attributes attributes38 = startTag35.getAttributes();
        boolean boolean39 = startTag35.isComment();
        startTag35.appendAttributeName("Comment");
        startTag35.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes44 = startTag35.attributes;
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        startTag45.appendTagName("");
        org.jsoup.nodes.Attributes attributes48 = null;
        startTag45.attributes = attributes48;
        org.jsoup.parser.Token.Tag tag50 = startTag45.reset();
        org.jsoup.nodes.Attributes attributes51 = tag50.attributes;
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        startTag52.appendTagName("");
        org.jsoup.nodes.Attributes attributes55 = null;
        startTag52.attributes = attributes55;
        org.jsoup.parser.Token.Tag tag57 = startTag52.reset();
        org.jsoup.nodes.Attributes attributes58 = tag57.attributes;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        char[] charArray60 = new char[] {};
        startTag59.appendAttributeValue(charArray60);
        tag57.appendAttributeValue(charArray60);
        tag50.appendAttributeValue(charArray60);
        startTag35.appendAttributeValue(charArray60);
        startTag28.appendAttributeValue(charArray60);
        startTag0.appendAttributeValue(charArray60);
        org.jsoup.parser.Token.Tag tag67 = startTag0.reset();
        java.lang.String str68 = tag67.normalName;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] {});
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.jsoup.parser.Token.Character character5 = character0.data("commentcomment");
        java.lang.String str6 = character5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = character5.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "commentcomment" + "'", str6, "commentcomment");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token.Comment comment6 = token5.asComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(comment6);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        boolean boolean10 = character8.isStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        org.jsoup.nodes.Attributes attributes17 = startTag15.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = startTag0.nameAttr("", attributes17);
        org.jsoup.nodes.Attributes attributes19 = startTag0.attributes;
        startTag0.normalName = "<#>";
        boolean boolean22 = startTag0.isEndTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        java.lang.String str4 = doctype2.getName();
        boolean boolean5 = doctype2.isForceQuirks();
        java.lang.String str6 = doctype2.getName();
        doctype2.pubSysKey = "<<hi!>>";
        java.lang.String str9 = doctype2.getPublicIdentifier();
        java.lang.String str10 = doctype2.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<hi!>>" + "'", str10, "<<hi!>>");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendAttributeValue('#');
        boolean boolean10 = tag7.selfClosing;
        tag7.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendTagName("");
        java.lang.String str16 = startTag13.tagName;
        startTag13.appendAttributeName("hi!");
        startTag13.appendTagName('#');
        startTag13.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        org.jsoup.nodes.Attributes attributes26 = startTag23.getAttributes();
        startTag23.appendTagName('#');
        startTag23.finaliseTag();
        boolean boolean30 = startTag23.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        startTag31.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        char[] charArray35 = new char[] {};
        startTag34.appendAttributeValue(charArray35);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = startTag37.attributes;
        startTag34.attributes = attributes38;
        startTag31.attributes = attributes38;
        startTag31.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        startTag43.appendTagName("");
        java.lang.String str46 = startTag43.tagName;
        int[] intArray48 = new int[] { 0 };
        startTag43.appendAttributeValue(intArray48);
        startTag31.appendAttributeValue(intArray48);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName("");
        org.jsoup.nodes.Attributes attributes54 = null;
        startTag51.attributes = attributes54;
        org.jsoup.parser.Token.Tag tag56 = startTag51.reset();
        org.jsoup.nodes.Attributes attributes57 = tag56.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        char[] charArray59 = new char[] {};
        startTag58.appendAttributeValue(charArray59);
        tag56.appendAttributeValue(charArray59);
        startTag31.appendAttributeValue(charArray59);
        startTag23.appendAttributeValue(charArray59);
        startTag13.appendAttributeValue(charArray59);
        tag7.appendAttributeValue(charArray59);
        boolean boolean66 = tag7.isCharacter();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        boolean boolean8 = startTag0.selfClosing;
        boolean boolean9 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType11 = startTag0.type;
        startTag0.setEmptyAttributeValue();
        java.lang.String str13 = startTag0.name();
        startTag0.appendTagName('a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        tag2.selfClosing = false;
        tag2.selfClosing = false;
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getPublicIdentifier();
        java.lang.String str9 = doctype7.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype7.name;
        boolean boolean11 = doctype7.isForceQuirks();
        java.lang.StringBuilder stringBuilder12 = doctype7.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType13 = doctype7.type;
        tag2.type = tokenType13;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype6.getSystemIdentifier();
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        boolean boolean12 = startTag11.isEOF();
        startTag11.appendTagName('4');
        startTag11.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag17 = startTag11.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.appendTagName("<Comment>");
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("commentcomment");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        java.lang.String str8 = startTag0.name();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        tag9.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = startTag18.attributes;
        startTag15.attributes = attributes19;
        startTag12.attributes = attributes19;
        startTag12.selfClosing = false;
        startTag12.appendAttributeName('4');
        startTag12.newAttribute();
        startTag12.selfClosing = false;
        org.jsoup.parser.Token.Tag tag29 = startTag12.reset();
        boolean boolean30 = startTag12.isSelfClosing();
        startTag12.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.TokenType tokenType33 = startTag12.type;
        tag9.type = tokenType33;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.selfClosing;
        java.lang.String str9 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.StringBuilder stringBuilder4 = comment2.data;
        java.lang.String str5 = comment2.toString();
        comment2.bogus = false;
        java.lang.StringBuilder stringBuilder8 = comment2.data;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName('a');
        startTag11.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = startTag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag22.attributes = attributes26;
        startTag19.attributes = attributes26;
        startTag19.appendAttributeValue('4');
        boolean boolean31 = startTag19.selfClosing;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendTagName("");
        org.jsoup.nodes.Attributes attributes35 = null;
        startTag32.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag37 = startTag32.reset();
        org.jsoup.nodes.Attributes attributes38 = startTag32.attributes;
        startTag19.attributes = attributes38;
        startTag17.attributes = attributes38;
        startTag11.attributes = attributes38;
        startTag11.appendAttributeName(' ');
        startTag11.appendAttributeValue("Character");
        java.lang.String str46 = startTag11.normalName;
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = startTag47.attributes;
        startTag47.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes51 = startTag47.getAttributes();
        startTag11.attributes = attributes51;
        startTag11.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag55 = startTag11.asStartTag();
        java.lang.String str56 = startTag11.toString();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<a>" + "'", str56, "<a>");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        startTag0.newAttribute();
        startTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag16 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag18 = startTag0.name("Comment");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = startTag26.attributes;
        startTag23.attributes = attributes27;
        startTag20.attributes = attributes27;
        startTag20.appendAttributeValue('4');
        boolean boolean32 = startTag20.selfClosing;
        org.jsoup.nodes.Attributes attributes33 = startTag20.attributes;
        startTag20.appendAttributeName("Character");
        startTag20.finaliseTag();
        startTag20.appendAttributeValue('#');
        startTag20.appendAttributeName("Character");
        org.jsoup.nodes.Attributes attributes41 = startTag20.attributes;
        org.jsoup.parser.Token.StartTag startTag42 = startTag0.nameAttr("<a>", attributes41);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(startTag42);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getName();
        java.lang.StringBuilder stringBuilder9 = doctype2.name;
        java.lang.StringBuilder stringBuilder10 = doctype2.name;
        java.lang.String str11 = doctype2.getSystemIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag0.appendAttributeName("<!---->");
        boolean boolean25 = startTag0.isStartTag();
        boolean boolean26 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = startTag34.attributes;
        startTag31.attributes = attributes35;
        startTag28.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag39 = startTag28.name("Doctype");
        org.jsoup.nodes.Attributes attributes40 = startTag28.getAttributes();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        char[] charArray46 = new char[] {};
        startTag45.appendAttributeValue(charArray46);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = startTag48.attributes;
        startTag45.attributes = attributes49;
        startTag42.attributes = attributes49;
        startTag42.selfClosing = false;
        startTag42.appendAttributeName('#');
        java.lang.String str56 = startTag42.normalName;
        org.jsoup.nodes.Attributes attributes57 = startTag42.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = startTag28.nameAttr("Commentcomment", attributes57);
        org.jsoup.parser.Token.StartTag startTag59 = startTag0.nameAttr("Doctype", attributes57);
        org.jsoup.parser.Token token60 = startTag59.reset();
        startTag59.appendAttributeName("<comment>");
        org.jsoup.parser.Token token63 = startTag59.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertNotNull(token60);
        org.junit.Assert.assertNotNull(token63);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        char[] charArray6 = new char[] {};
        startTag5.appendAttributeValue(charArray6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = startTag8.attributes;
        startTag5.attributes = attributes9;
        startTag2.attributes = attributes9;
        startTag2.appendAttributeValue('4');
        boolean boolean14 = startTag2.selfClosing;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        org.jsoup.nodes.Attributes attributes18 = null;
        startTag15.attributes = attributes18;
        org.jsoup.parser.Token.Tag tag20 = startTag15.reset();
        org.jsoup.nodes.Attributes attributes21 = startTag15.attributes;
        startTag2.attributes = attributes21;
        startTag0.attributes = attributes21;
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        char[] charArray27 = new char[] {};
        startTag26.appendAttributeValue(charArray27);
        startTag26.appendAttributeName("hi!");
        startTag26.appendAttributeName('a');
        java.lang.String str33 = startTag26.normalName;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        startTag34.appendTagName("");
        org.jsoup.nodes.Attributes attributes37 = null;
        startTag34.attributes = attributes37;
        org.jsoup.parser.Token.Tag tag39 = startTag34.reset();
        org.jsoup.nodes.Attributes attributes40 = startTag34.attributes;
        startTag26.attributes = attributes40;
        org.jsoup.parser.Token.Tag tag43 = startTag26.name("<hi!>");
        boolean boolean44 = tag43.isDoctype();
        org.jsoup.parser.Token.Tag tag45 = tag43.reset();
        org.jsoup.nodes.Attributes attributes46 = tag43.getAttributes();
        startTag0.attributes = attributes46;
        boolean boolean48 = startTag0.isDoctype();
        org.jsoup.parser.Token token49 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype50 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag0.appendAttributeValue("Character");
        org.jsoup.nodes.Attributes attributes11 = startTag0.attributes;
        startTag0.appendAttributeValue("");
        boolean boolean14 = startTag0.selfClosing;
        startTag0.appendTagName("a");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag14 = startTag0.name("");
        org.jsoup.parser.Token.Tag tag15 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag17 = tag15.name("<comment>");
        boolean boolean18 = tag15.isDoctype();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag14.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag19 = startTag14.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.jsoup.nodes.Attributes attributes21 = tag19.getAttributes();
        startTag0.attributes = attributes21;
        boolean boolean23 = startTag0.selfClosing;
        boolean boolean24 = startTag0.isComment();
        startTag0.tagName = "Comment";
        boolean boolean27 = startTag0.isStartTag();
        startTag0.finaliseTag();
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag30 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag22.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag25.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes29 = startTag25.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = startTag22.nameAttr("hi!", attributes29);
        startTag22.normalName = "";
        startTag22.appendAttributeValue("<Commentcomment>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        java.lang.String str6 = startTag0.toString();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        startTag7.appendAttributeName("hi!");
        startTag7.appendAttributeName('a');
        java.lang.String str14 = startTag7.normalName;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        org.jsoup.nodes.Attributes attributes18 = null;
        startTag15.attributes = attributes18;
        org.jsoup.parser.Token.Tag tag20 = startTag15.reset();
        org.jsoup.nodes.Attributes attributes21 = startTag15.attributes;
        startTag7.attributes = attributes21;
        startTag0.attributes = attributes21;
        startTag0.selfClosing = true;
        java.lang.String str26 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = startTag34.attributes;
        startTag31.attributes = attributes35;
        startTag28.attributes = attributes35;
        startTag28.selfClosing = false;
        startTag28.appendAttributeName('4');
        org.jsoup.parser.Token.Comment comment42 = new org.jsoup.parser.Token.Comment();
        java.lang.String str43 = comment42.tokenType();
        boolean boolean44 = comment42.isComment();
        java.lang.StringBuilder stringBuilder45 = comment42.data;
        java.lang.StringBuilder stringBuilder46 = comment42.data;
        boolean boolean47 = comment42.isCharacter();
        java.lang.StringBuilder stringBuilder48 = comment42.data;
        org.jsoup.parser.Token.TokenType tokenType49 = comment42.type;
        startTag28.type = tokenType49;
        boolean boolean51 = startTag28.isCharacter();
        org.jsoup.nodes.Attributes attributes52 = startTag28.attributes;
        org.jsoup.nodes.Attributes attributes53 = startTag28.getAttributes();
        org.jsoup.parser.Token.StartTag startTag54 = startTag0.nameAttr("hi!", attributes53);
        org.jsoup.parser.Token token55 = startTag0.reset();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Comment" + "'", str43, "Comment");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(token55);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isStartTag();
        java.lang.StringBuilder stringBuilder7 = doctype2.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<hi!>");
        java.lang.String str11 = startTag0.normalName();
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag14.attributes = attributes17;
        org.jsoup.parser.Token.Tag tag19 = startTag14.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        org.jsoup.nodes.Attributes attributes21 = tag19.getAttributes();
        startTag0.attributes = attributes21;
        boolean boolean23 = startTag0.selfClosing;
        boolean boolean24 = startTag0.isEndTag();
        boolean boolean25 = startTag0.isComment();
        startTag0.normalName = "Character";
        startTag0.appendTagName("starttag");
        org.jsoup.parser.Token.Tag tag30 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        startTag0.appendAttributeName("<hi!>");
        java.lang.String str11 = startTag0.toString();
        org.jsoup.parser.Token.Tag tag13 = startTag0.name("<#>");
        boolean boolean14 = startTag0.isEOF();
        java.lang.String str15 = startTag0.tagName;
        startTag0.appendTagName("comment");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<Commentcomment>" + "'", str11, "<Commentcomment>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<#>" + "'", str15, "<#>");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        doctype0.type = tokenType5;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        doctype0.pubSysKey = "commenta";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "";
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        java.lang.String str8 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        org.jsoup.nodes.Attributes attributes12 = null;
        startTag9.attributes = attributes12;
        startTag9.newAttribute();
        org.jsoup.nodes.Attributes attributes15 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        java.lang.String str19 = startTag16.tagName;
        startTag16.appendAttributeName("hi!");
        boolean boolean22 = startTag16.isSelfClosing();
        org.jsoup.parser.Token.Tag tag23 = startTag16.reset();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        startTag24.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag30 = startTag24.name("Comment");
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        startTag31.appendTagName("");
        org.jsoup.nodes.Attributes attributes34 = null;
        startTag31.attributes = attributes34;
        startTag31.appendTagName("");
        java.lang.String str38 = startTag31.tagName;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        startTag39.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        char[] charArray43 = new char[] {};
        startTag42.appendAttributeValue(charArray43);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes46 = startTag45.attributes;
        startTag42.attributes = attributes46;
        startTag39.attributes = attributes46;
        startTag39.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName("");
        java.lang.String str54 = startTag51.tagName;
        int[] intArray56 = new int[] { 0 };
        startTag51.appendAttributeValue(intArray56);
        startTag39.appendAttributeValue(intArray56);
        startTag31.appendAttributeValue(intArray56);
        tag30.appendAttributeValue(intArray56);
        tag23.appendAttributeValue(intArray56);
        startTag9.appendAttributeValue(intArray56);
        startTag0.appendAttributeValue(intArray56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 0 });
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.selfClosing = true;
        java.lang.String str10 = tag7.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = tag7.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        tag2.selfClosing = false;
        tag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag7 = tag2.reset();
        tag2.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = tag2.name("#");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype5.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doctype5);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        boolean boolean3 = startTag0.isDoctype();
        startTag0.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        char[] charArray11 = new char[] {};
        startTag10.appendAttributeValue(charArray11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag13.attributes;
        startTag10.attributes = attributes14;
        startTag7.attributes = attributes14;
        startTag7.selfClosing = false;
        startTag7.appendAttributeName('4');
        startTag7.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes23 = startTag7.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = startTag0.nameAttr("commentcomment#", attributes23);
        startTag24.finaliseTag();
        startTag24.appendTagName('#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        startTag14.appendAttributeName("hi!");
        startTag14.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = startTag0.nameAttr("hi!", attributes21);
        startTag0.appendAttributeName("<!---->");
        boolean boolean25 = startTag0.isStartTag();
        boolean boolean26 = startTag0.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype27 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName("");
        java.lang.String str13 = startTag10.tagName;
        startTag10.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = startTag16.attributes;
        startTag16.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes20 = startTag16.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = startTag10.nameAttr("", attributes20);
        org.jsoup.parser.Token.TokenType tokenType22 = startTag21.type;
        org.jsoup.parser.Token.Tag tag24 = startTag21.name("StartTag");
        org.jsoup.nodes.Attributes attributes25 = tag24.attributes;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        char[] charArray30 = new char[] {};
        startTag29.appendAttributeValue(charArray30);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = startTag32.attributes;
        startTag29.attributes = attributes33;
        startTag26.attributes = attributes33;
        java.lang.String str36 = startTag26.normalName;
        startTag26.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes39 = startTag26.getAttributes();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        org.jsoup.nodes.Attributes attributes43 = null;
        startTag40.attributes = attributes43;
        org.jsoup.parser.Token.Tag tag45 = startTag40.reset();
        org.jsoup.parser.Token.TokenType tokenType46 = tag45.type;
        org.jsoup.nodes.Attributes attributes47 = tag45.getAttributes();
        startTag26.attributes = attributes47;
        boolean boolean49 = startTag26.selfClosing;
        boolean boolean50 = startTag26.isComment();
        startTag26.tagName = "Comment";
        boolean boolean53 = startTag26.isStartTag();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        startTag55.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        char[] charArray59 = new char[] {};
        startTag58.appendAttributeValue(charArray59);
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes62 = startTag61.attributes;
        startTag58.attributes = attributes62;
        startTag55.attributes = attributes62;
        java.lang.String str65 = startTag55.normalName;
        startTag55.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes68 = startTag55.getAttributes();
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        startTag69.appendTagName("");
        org.jsoup.nodes.Attributes attributes72 = null;
        startTag69.attributes = attributes72;
        org.jsoup.parser.Token.Tag tag74 = startTag69.reset();
        org.jsoup.parser.Token.TokenType tokenType75 = tag74.type;
        org.jsoup.nodes.Attributes attributes76 = tag74.getAttributes();
        startTag55.attributes = attributes76;
        org.jsoup.parser.Token.StartTag startTag78 = startTag26.nameAttr("<<hi!>>", attributes76);
        tag24.attributes = attributes76;
        org.jsoup.parser.Token.StartTag startTag80 = startTag0.nameAttr("comment", attributes76);
        org.jsoup.parser.Token.Tag tag81 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertTrue("'" + tokenType75 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType75.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertNotNull(tag81);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName("<!---->");
        startTag11.appendAttributeName('#');
        startTag11.finaliseTag();
        boolean boolean18 = startTag11.selfClosing;
        startTag11.appendAttributeName(' ');
        boolean boolean21 = startTag11.selfClosing;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        startTag0.appendAttributeValue("Doctype");
        startTag0.appendAttributeName("#");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = startTag18.attributes;
        startTag15.attributes = attributes19;
        startTag12.attributes = attributes19;
        startTag12.appendAttributeValue('4');
        boolean boolean24 = startTag12.selfClosing;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        org.jsoup.nodes.Attributes attributes28 = null;
        startTag25.attributes = attributes28;
        org.jsoup.parser.Token.Tag tag30 = startTag25.reset();
        org.jsoup.nodes.Attributes attributes31 = startTag25.attributes;
        startTag12.attributes = attributes31;
        org.jsoup.parser.Token.StartTag startTag33 = startTag0.nameAttr("<!---->", attributes31);
        startTag0.appendTagName("<<<hi!>>>");
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        char[] charArray37 = new char[] {};
        startTag36.appendAttributeValue(charArray37);
        org.jsoup.nodes.Attributes attributes39 = startTag36.getAttributes();
        boolean boolean40 = startTag36.isComment();
        org.jsoup.parser.Token.TokenType tokenType41 = startTag36.type;
        startTag36.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag44 = startTag36.asStartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag36.name("Comment");
        startTag36.newAttribute();
        org.jsoup.nodes.Attributes attributes48 = startTag36.getAttributes();
        char[] charArray55 = new char[] { ' ', 'a', '#', '#', '4', ' ' };
        startTag36.appendAttributeValue(charArray55);
        startTag0.appendAttributeValue(charArray55);
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        startTag59.appendTagName("");
        boolean boolean62 = startTag59.isComment();
        startTag59.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes65 = startTag59.getAttributes();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        startTag67.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        char[] charArray71 = new char[] {};
        startTag70.appendAttributeValue(charArray71);
        org.jsoup.parser.Token.StartTag startTag73 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes74 = startTag73.attributes;
        startTag70.attributes = attributes74;
        startTag67.attributes = attributes74;
        org.jsoup.parser.Token.Tag tag78 = startTag67.name("Doctype");
        org.jsoup.nodes.Attributes attributes79 = startTag67.getAttributes();
        org.jsoup.parser.Token.StartTag startTag81 = new org.jsoup.parser.Token.StartTag();
        startTag81.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag84 = new org.jsoup.parser.Token.StartTag();
        char[] charArray85 = new char[] {};
        startTag84.appendAttributeValue(charArray85);
        org.jsoup.parser.Token.StartTag startTag87 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes88 = startTag87.attributes;
        startTag84.attributes = attributes88;
        startTag81.attributes = attributes88;
        startTag81.selfClosing = false;
        startTag81.appendAttributeName('#');
        java.lang.String str95 = startTag81.normalName;
        org.jsoup.nodes.Attributes attributes96 = startTag81.attributes;
        org.jsoup.parser.Token.StartTag startTag97 = startTag67.nameAttr("Commentcomment", attributes96);
        org.jsoup.parser.Token.StartTag startTag98 = startTag59.nameAttr("<hi!>", attributes96);
        org.jsoup.parser.Token.StartTag startTag99 = startTag0.nameAttr("<!---->", attributes96);
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ', 'a', '#', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] {});
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] {});
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertNotNull(attributes96);
        org.junit.Assert.assertNotNull(startTag97);
        org.junit.Assert.assertNotNull(startTag98);
        org.junit.Assert.assertNotNull(startTag99);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.pubSysKey;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        doctype0.pubSysKey = "Character";
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        java.lang.String str4 = comment0.toString();
        org.jsoup.parser.Token token5 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        boolean boolean7 = startTag0.isCharacter();
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        tag8.appendAttributeValue(' ');
        java.lang.String str11 = tag8.normalName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = tag8.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.appendTagName("");
        org.jsoup.nodes.Attributes attributes6 = null;
        startTag3.attributes = attributes6;
        startTag3.appendAttributeValue("hi!");
        startTag3.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType12 = startTag3.type;
        comment0.type = tokenType12;
        java.lang.String str14 = comment0.getData();
        java.lang.StringBuilder stringBuilder15 = comment0.data;
        comment0.bogus = true;
        boolean boolean18 = comment0.isCharacter();
        java.lang.StringBuilder stringBuilder19 = comment0.data;
        java.lang.String str20 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.toString();
        java.lang.String str4 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Comment" + "'", str4, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        java.lang.String str14 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        java.lang.String str18 = startTag15.tagName;
        org.jsoup.parser.Token.Tag tag19 = startTag15.reset();
        java.lang.String str20 = startTag15.tagName;
        org.jsoup.parser.Token token21 = startTag15.reset();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendTagName("");
        org.jsoup.nodes.Attributes attributes25 = null;
        startTag22.attributes = attributes25;
        org.jsoup.parser.Token.Tag tag27 = startTag22.reset();
        org.jsoup.nodes.Attributes attributes28 = tag27.attributes;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.nodes.Attributes attributes32 = null;
        startTag29.attributes = attributes32;
        org.jsoup.parser.Token.Tag tag34 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        char[] charArray37 = new char[] {};
        startTag36.appendAttributeValue(charArray37);
        tag34.appendAttributeValue(charArray37);
        tag27.appendAttributeValue(charArray37);
        startTag15.appendAttributeValue(charArray37);
        startTag0.appendAttributeValue(charArray37);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.selfClosing;
        startTag0.setEmptyAttributeValue();
        java.lang.String str10 = startTag0.normalName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        java.lang.String str9 = comment8.tokenType();
        boolean boolean10 = comment8.isComment();
        java.lang.StringBuilder stringBuilder11 = comment8.data;
        java.lang.StringBuilder stringBuilder12 = comment8.data;
        boolean boolean13 = comment8.isCharacter();
        java.lang.StringBuilder stringBuilder14 = comment8.data;
        org.jsoup.parser.Token token15 = comment8.reset();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = startTag16.attributes;
        startTag16.tagName = "hi!";
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.TokenType tokenType21 = character20.type;
        startTag16.type = tokenType21;
        comment8.type = tokenType21;
        tag7.type = tokenType21;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = startTag33.attributes;
        startTag30.attributes = attributes34;
        startTag27.attributes = attributes34;
        startTag27.appendAttributeValue('4');
        boolean boolean39 = startTag27.selfClosing;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        org.jsoup.nodes.Attributes attributes43 = null;
        startTag40.attributes = attributes43;
        org.jsoup.parser.Token.Tag tag45 = startTag40.reset();
        org.jsoup.nodes.Attributes attributes46 = startTag40.attributes;
        startTag27.attributes = attributes46;
        startTag25.attributes = attributes46;
        startTag25.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        char[] charArray52 = new char[] {};
        startTag51.appendAttributeValue(charArray52);
        startTag51.appendAttributeName("hi!");
        startTag51.appendAttributeName('a');
        java.lang.String str58 = startTag51.normalName;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        startTag59.appendTagName("");
        org.jsoup.nodes.Attributes attributes62 = null;
        startTag59.attributes = attributes62;
        org.jsoup.parser.Token.Tag tag64 = startTag59.reset();
        org.jsoup.nodes.Attributes attributes65 = startTag59.attributes;
        startTag51.attributes = attributes65;
        org.jsoup.parser.Token.Tag tag68 = startTag51.name("<hi!>");
        boolean boolean69 = tag68.isDoctype();
        org.jsoup.parser.Token.Tag tag70 = tag68.reset();
        org.jsoup.nodes.Attributes attributes71 = tag68.getAttributes();
        startTag25.attributes = attributes71;
        tag7.attributes = attributes71;
        boolean boolean74 = tag7.isStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Comment" + "'", str9, "Comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        boolean boolean11 = startTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag13 = startTag0.name("<comment>");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = startTag15.attributes;
        startTag15.newAttribute();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        char[] charArray19 = new char[] {};
        startTag18.appendAttributeValue(charArray19);
        startTag18.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag24 = startTag18.name("Comment");
        startTag18.appendTagName("comment");
        java.lang.String str27 = startTag18.normalName();
        char[] charArray30 = new char[] { '4', '#' };
        startTag18.appendAttributeValue(charArray30);
        startTag15.appendAttributeValue(charArray30);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        startTag34.appendTagName("");
        java.lang.String str37 = startTag34.tagName;
        startTag34.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = startTag40.attributes;
        startTag40.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes44 = startTag40.getAttributes();
        org.jsoup.parser.Token.StartTag startTag45 = startTag34.nameAttr("", attributes44);
        org.jsoup.parser.Token.StartTag startTag46 = startTag15.nameAttr("#", attributes44);
        org.jsoup.nodes.Attributes attributes47 = startTag15.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = startTag0.nameAttr("4", attributes47);
        org.jsoup.parser.Token.Tag tag49 = startTag0.reset();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "commentcomment" + "'", str27, "commentcomment");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(tag49);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        boolean boolean4 = doctype2.isComment();
        java.lang.StringBuilder stringBuilder5 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        startTag0.appendAttributeValue('a');
        startTag0.normalName = "Comment";
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = startTag26.attributes;
        startTag23.attributes = attributes27;
        startTag20.attributes = attributes27;
        org.jsoup.parser.Token.Tag tag31 = startTag20.name("Doctype");
        org.jsoup.nodes.Attributes attributes32 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag33 = startTag0.nameAttr("<!---->", attributes32);
        java.lang.String str34 = startTag0.normalName();
        boolean boolean35 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag11.attributes = attributes15;
        startTag8.attributes = attributes15;
        startTag8.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        java.lang.String str23 = startTag20.tagName;
        int[] intArray25 = new int[] { 0 };
        startTag20.appendAttributeValue(intArray25);
        startTag8.appendAttributeValue(intArray25);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.nodes.Attributes attributes31 = null;
        startTag28.attributes = attributes31;
        org.jsoup.parser.Token.Tag tag33 = startTag28.reset();
        org.jsoup.nodes.Attributes attributes34 = tag33.attributes;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        char[] charArray36 = new char[] {};
        startTag35.appendAttributeValue(charArray36);
        tag33.appendAttributeValue(charArray36);
        startTag8.appendAttributeValue(charArray36);
        startTag0.appendAttributeValue(charArray36);
        java.lang.String str41 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag42 = startTag0.asStartTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#" + "'", str41, "#");
        org.junit.Assert.assertNotNull(startTag42);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.jsoup.parser.Token token10 = doctype0.reset();
        java.lang.String str11 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        doctype0.forceQuirks = true;
        java.lang.String str8 = doctype0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.selfClosing = false;
        startTag0.appendAttributeName('#');
        java.lang.String str14 = startTag0.normalName;
        boolean boolean15 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName("");
        org.jsoup.nodes.Attributes attributes13 = null;
        startTag10.attributes = attributes13;
        org.jsoup.parser.Token.Tag tag15 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes16 = tag15.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName("");
        org.jsoup.nodes.Attributes attributes20 = null;
        startTag17.attributes = attributes20;
        org.jsoup.parser.Token.Tag tag22 = startTag17.reset();
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        tag22.appendAttributeValue(charArray25);
        tag15.appendAttributeValue(charArray25);
        startTag0.appendAttributeValue(charArray25);
        startTag0.appendAttributeName("");
        org.jsoup.parser.Token.Tag tag32 = startTag0.reset();
        java.lang.String str33 = tag32.tokenType();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StartTag" + "'", str33, "StartTag");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        boolean boolean4 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        java.lang.String str5 = character0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<hi!>");
        tag10.finaliseTag();
        tag10.appendTagName('4');
        java.lang.String str14 = tag10.name();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!>4" + "'", str14, "<hi!>4");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.pubSysKey = "hi!";
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag4.reset();
        org.jsoup.nodes.Attributes attributes6 = startTag4.attributes;
        startTag0.attributes = attributes6;
        startTag0.normalName = "<StartTag>";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.bogus;
        boolean boolean3 = comment0.bogus;
        comment0.bogus = false;
        boolean boolean6 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token token3 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token token5 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        boolean boolean8 = comment0.bogus;
        java.lang.String str9 = comment0.toString();
        org.jsoup.parser.Token token10 = comment0.reset();
        org.jsoup.parser.Token token11 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag11.attributes = attributes15;
        startTag8.attributes = attributes15;
        startTag8.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag20 = startTag8.asStartTag();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.nodes.Attributes attributes25 = startTag22.getAttributes();
        boolean boolean26 = startTag22.isComment();
        org.jsoup.parser.Token.TokenType tokenType27 = startTag22.type;
        startTag22.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = startTag22.reset();
        org.jsoup.nodes.Attributes attributes31 = tag30.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = startTag8.nameAttr("comment", attributes31);
        org.jsoup.parser.Token.StartTag startTag33 = startTag0.nameAttr("Comment", attributes31);
        startTag0.appendAttributeValue("commentcomment#");
        boolean boolean36 = startTag0.isEOF();
        org.jsoup.parser.Token.StartTag startTag37 = startTag0.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag38 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag37);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.tagName = "Character";
        boolean boolean15 = startTag11.selfClosing;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        boolean boolean9 = tag7.isCharacter();
        org.jsoup.nodes.Attributes attributes10 = tag7.attributes;
        boolean boolean11 = tag7.isEndTag();
        boolean boolean12 = tag7.isDoctype();
        java.lang.String str13 = tag7.normalName;
        tag7.normalName = "<a>";
        boolean boolean16 = tag7.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        boolean boolean8 = doctype2.forceQuirks;
        doctype2.pubSysKey = "Doctype";
        java.lang.StringBuilder stringBuilder11 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        org.jsoup.nodes.Attributes attributes10 = null;
        startTag7.attributes = attributes10;
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag7.attributes;
        startTag0.attributes = attributes13;
        org.jsoup.parser.Token.Tag tag15 = startTag0.reset();
        java.lang.String str16 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = startTag26.attributes;
        startTag23.attributes = attributes27;
        startTag20.attributes = attributes27;
        startTag20.appendAttributeValue('4');
        boolean boolean32 = startTag20.selfClosing;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName("");
        org.jsoup.nodes.Attributes attributes36 = null;
        startTag33.attributes = attributes36;
        org.jsoup.parser.Token.Tag tag38 = startTag33.reset();
        org.jsoup.nodes.Attributes attributes39 = startTag33.attributes;
        startTag20.attributes = attributes39;
        startTag18.attributes = attributes39;
        org.jsoup.nodes.Attributes attributes42 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag43 = startTag0.nameAttr("a", attributes42);
        startTag0.appendTagName('a');
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag43);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isDoctype();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = startTag17.attributes;
        startTag14.attributes = attributes18;
        startTag11.attributes = attributes18;
        boolean boolean21 = startTag11.isSelfClosing();
        startTag11.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.TokenType tokenType24 = startTag11.type;
        doctype0.type = tokenType24;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder28 = doctype0.systemIdentifier;
        java.lang.String str29 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<hi!>");
        tag9.newAttribute();
        tag9.newAttribute();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        startTag0.appendTagName('a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        startTag0.appendAttributeName("Doctype");
        startTag0.appendAttributeValue("Character");
        boolean boolean8 = startTag0.isSelfClosing();
        boolean boolean9 = startTag0.isEndTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        char[] charArray12 = new char[] { '4', '#' };
        startTag0.appendAttributeValue(charArray12);
        startTag0.appendTagName('#');
        java.lang.String str16 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        java.lang.String str21 = startTag18.tagName;
        startTag18.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = startTag24.attributes;
        startTag24.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes28 = startTag24.getAttributes();
        org.jsoup.parser.Token.StartTag startTag29 = startTag18.nameAttr("", attributes28);
        org.jsoup.parser.Token.TokenType tokenType30 = startTag29.type;
        org.jsoup.parser.Token.Tag tag32 = startTag29.name("StartTag");
        org.jsoup.nodes.Attributes attributes33 = tag32.getAttributes();
        org.jsoup.parser.Token.StartTag startTag34 = startTag0.nameAttr("<StartTag>", attributes33);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = startTag42.attributes;
        startTag39.attributes = attributes43;
        startTag36.attributes = attributes43;
        java.lang.String str46 = startTag36.normalName;
        startTag36.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes49 = startTag36.getAttributes();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        startTag50.appendTagName("");
        org.jsoup.nodes.Attributes attributes53 = null;
        startTag50.attributes = attributes53;
        org.jsoup.parser.Token.Tag tag55 = startTag50.reset();
        org.jsoup.parser.Token.TokenType tokenType56 = tag55.type;
        org.jsoup.nodes.Attributes attributes57 = tag55.getAttributes();
        startTag36.attributes = attributes57;
        boolean boolean59 = startTag36.selfClosing;
        boolean boolean60 = startTag36.isComment();
        startTag36.tagName = "Comment";
        boolean boolean63 = startTag36.isStartTag();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        startTag65.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        char[] charArray69 = new char[] {};
        startTag68.appendAttributeValue(charArray69);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes72 = startTag71.attributes;
        startTag68.attributes = attributes72;
        startTag65.attributes = attributes72;
        java.lang.String str75 = startTag65.normalName;
        startTag65.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes78 = startTag65.getAttributes();
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        startTag79.appendTagName("");
        org.jsoup.nodes.Attributes attributes82 = null;
        startTag79.attributes = attributes82;
        org.jsoup.parser.Token.Tag tag84 = startTag79.reset();
        org.jsoup.parser.Token.TokenType tokenType85 = tag84.type;
        org.jsoup.nodes.Attributes attributes86 = tag84.getAttributes();
        startTag65.attributes = attributes86;
        org.jsoup.parser.Token.StartTag startTag88 = startTag36.nameAttr("<<hi!>>", attributes86);
        org.jsoup.parser.Token.StartTag startTag89 = startTag34.nameAttr(" ", attributes86);
        java.lang.String str90 = startTag89.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "commentcomment#" + "'", str16, "commentcomment#");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] {});
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertTrue("'" + tokenType85 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType85.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes86);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + " " + "'", str90, " ");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = startTag0.normalName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        java.lang.String str17 = startTag14.tagName;
        startTag14.appendAttributeName("hi!");
        startTag14.appendTagName('#');
        startTag14.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        char[] charArray25 = new char[] {};
        startTag24.appendAttributeValue(charArray25);
        org.jsoup.nodes.Attributes attributes27 = startTag24.getAttributes();
        startTag24.appendTagName('#');
        startTag24.finaliseTag();
        boolean boolean31 = startTag24.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        char[] charArray36 = new char[] {};
        startTag35.appendAttributeValue(charArray36);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = startTag38.attributes;
        startTag35.attributes = attributes39;
        startTag32.attributes = attributes39;
        startTag32.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        startTag44.appendTagName("");
        java.lang.String str47 = startTag44.tagName;
        int[] intArray49 = new int[] { 0 };
        startTag44.appendAttributeValue(intArray49);
        startTag32.appendAttributeValue(intArray49);
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        startTag52.appendTagName("");
        org.jsoup.nodes.Attributes attributes55 = null;
        startTag52.attributes = attributes55;
        org.jsoup.parser.Token.Tag tag57 = startTag52.reset();
        org.jsoup.nodes.Attributes attributes58 = tag57.attributes;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        char[] charArray60 = new char[] {};
        startTag59.appendAttributeValue(charArray60);
        tag57.appendAttributeValue(charArray60);
        startTag32.appendAttributeValue(charArray60);
        startTag24.appendAttributeValue(charArray60);
        startTag14.appendAttributeValue(charArray60);
        startTag0.appendAttributeValue(charArray60);
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        char[] charArray69 = new char[] {};
        startTag68.appendAttributeValue(charArray69);
        org.jsoup.nodes.Attributes attributes71 = startTag68.getAttributes();
        boolean boolean72 = startTag68.isComment();
        org.jsoup.parser.Token.TokenType tokenType73 = startTag68.type;
        startTag68.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag76 = startTag68.asStartTag();
        java.lang.String str77 = startTag68.normalName();
        java.lang.String str78 = startTag68.normalName();
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag();
        char[] charArray81 = new char[] {};
        startTag80.appendAttributeValue(charArray81);
        startTag80.appendAttributeName("hi!");
        startTag80.appendTagName("<!---->");
        org.jsoup.nodes.Attributes attributes87 = startTag80.getAttributes();
        org.jsoup.parser.Token.StartTag startTag88 = startTag68.nameAttr("commentcomment", attributes87);
        org.jsoup.parser.Token.StartTag startTag89 = startTag0.nameAttr("<Commentcomment#>", attributes87);
        boolean boolean90 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] {});
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] {});
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        java.lang.String str7 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        boolean boolean9 = startTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        org.jsoup.parser.Token token5 = doctype2.reset();
        boolean boolean6 = doctype2.isStartTag();
        java.lang.StringBuilder stringBuilder7 = doctype2.name;
        java.lang.String str8 = doctype2.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        boolean boolean12 = startTag0.selfClosing;
        startTag0.appendAttributeValue('a');
        startTag0.normalName = "Comment";
        startTag0.selfClosing = false;
        startTag0.selfClosing = false;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.Character character11 = character8.data("StartTag");
        java.lang.String str12 = character8.getData();
        org.jsoup.parser.Token.Character character14 = character8.data("<Commentcomment#>");
        org.jsoup.parser.Token.Character character16 = character14.data("comment");
        org.jsoup.parser.Token.Character character18 = character16.data("Comment");
        org.jsoup.parser.Token token19 = character16.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertNotNull(character18);
        org.junit.Assert.assertNotNull(token19);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        org.jsoup.nodes.Attributes attributes10 = null;
        startTag7.attributes = attributes10;
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag7.attributes;
        startTag0.attributes = attributes13;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        org.jsoup.nodes.Attributes attributes18 = null;
        startTag15.attributes = attributes18;
        startTag15.appendTagName("");
        java.lang.String str22 = startTag15.tagName;
        startTag15.appendTagName('#');
        org.jsoup.nodes.Attributes attributes25 = startTag15.getAttributes();
        org.jsoup.nodes.Attributes attributes26 = startTag15.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType27 = org.jsoup.parser.Token.TokenType.Character;
        startTag15.type = tokenType27;
        startTag0.type = tokenType27;
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(attributes25);
        org.junit.Assert.assertNull(attributes26);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        startTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        org.jsoup.nodes.Attributes attributes19 = startTag16.getAttributes();
        boolean boolean20 = startTag16.isComment();
        startTag16.appendAttributeName("Comment");
        startTag16.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes25 = startTag16.attributes;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.nodes.Attributes attributes29 = null;
        startTag26.attributes = attributes29;
        org.jsoup.parser.Token.Tag tag31 = startTag26.reset();
        org.jsoup.nodes.Attributes attributes32 = tag31.attributes;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName("");
        org.jsoup.nodes.Attributes attributes36 = null;
        startTag33.attributes = attributes36;
        org.jsoup.parser.Token.Tag tag38 = startTag33.reset();
        org.jsoup.nodes.Attributes attributes39 = tag38.attributes;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        char[] charArray41 = new char[] {};
        startTag40.appendAttributeValue(charArray41);
        tag38.appendAttributeValue(charArray41);
        tag31.appendAttributeValue(charArray41);
        startTag16.appendAttributeValue(charArray41);
        startTag16.appendAttributeName("");
        boolean boolean48 = startTag16.isSelfClosing();
        org.jsoup.nodes.Attributes attributes49 = startTag16.getAttributes();
        org.jsoup.parser.Token.StartTag startTag50 = startTag0.nameAttr("<a>", attributes49);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(startTag50);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.appendTagName("");
        org.jsoup.nodes.Attributes attributes6 = null;
        startTag3.attributes = attributes6;
        startTag3.appendAttributeValue("hi!");
        startTag3.tagName = "Comment";
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendTagName("");
        org.jsoup.nodes.Attributes attributes15 = null;
        startTag12.attributes = attributes15;
        org.jsoup.parser.Token.Tag tag17 = startTag12.reset();
        org.jsoup.parser.Token.TokenType tokenType18 = tag17.type;
        startTag3.type = tokenType18;
        doctype0.type = tokenType18;
        boolean boolean21 = doctype0.isForceQuirks();
        java.lang.String str22 = doctype0.getPubSysKey();
        java.lang.String str23 = doctype0.getPubSysKey();
        java.lang.String str24 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = true;
        org.jsoup.parser.Token token9 = comment0.reset();
        java.lang.String str10 = comment0.tokenType();
        boolean boolean11 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Comment" + "'", str10, "Comment");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        boolean boolean9 = doctype2.forceQuirks;
        java.lang.String str10 = doctype2.getPublicIdentifier();
        java.lang.String str11 = doctype2.getSystemIdentifier();
        java.lang.String str12 = doctype2.getSystemIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        boolean boolean5 = doctype2.forceQuirks;
        java.lang.String str6 = doctype2.getSystemIdentifier();
        boolean boolean7 = doctype2.forceQuirks;
        java.lang.String str8 = doctype2.getSystemIdentifier();
        org.jsoup.parser.Token token9 = doctype2.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("Comment");
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes12 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag13 = startTag0.reset();
        tag13.appendTagName('a');
        org.jsoup.parser.Token.Tag tag16 = tag13.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character17 = tag13.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        java.lang.String str10 = startTag0.tokenType();
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        org.jsoup.nodes.Attributes attributes15 = startTag12.getAttributes();
        boolean boolean16 = startTag12.isComment();
        startTag12.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag19 = startTag12.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag12.type = tokenType20;
        startTag0.type = tokenType20;
        java.lang.String str23 = startTag0.normalName();
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("<Commentcomment>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag0.appendAttributeName('a');
        boolean boolean9 = startTag0.isCharacter();
        java.lang.String str10 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        org.jsoup.nodes.Attributes attributes15 = startTag12.getAttributes();
        boolean boolean16 = startTag12.isComment();
        org.jsoup.parser.Token.TokenType tokenType17 = startTag12.type;
        startTag12.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag20 = startTag12.asStartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag12.name("Comment");
        startTag12.newAttribute();
        org.jsoup.nodes.Attributes attributes24 = startTag12.getAttributes();
        org.jsoup.parser.Token.Tag tag25 = startTag12.reset();
        org.jsoup.parser.Token.Tag tag26 = startTag12.reset();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        startTag27.appendAttributeName("hi!");
        startTag27.appendTagName("<!---->");
        startTag27.setEmptyAttributeValue();
        startTag27.selfClosing = true;
        org.jsoup.parser.Token token37 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName("");
        org.jsoup.nodes.Attributes attributes41 = null;
        startTag38.attributes = attributes41;
        startTag38.newAttribute();
        org.jsoup.nodes.Attributes attributes44 = startTag38.getAttributes();
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        startTag45.appendTagName("");
        java.lang.String str48 = startTag45.tagName;
        startTag45.appendAttributeName("hi!");
        boolean boolean51 = startTag45.isSelfClosing();
        org.jsoup.parser.Token.Tag tag52 = startTag45.reset();
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        char[] charArray54 = new char[] {};
        startTag53.appendAttributeValue(charArray54);
        startTag53.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag59 = startTag53.name("Comment");
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        startTag60.appendTagName("");
        org.jsoup.nodes.Attributes attributes63 = null;
        startTag60.attributes = attributes63;
        startTag60.appendTagName("");
        java.lang.String str67 = startTag60.tagName;
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        startTag68.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        char[] charArray72 = new char[] {};
        startTag71.appendAttributeValue(charArray72);
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes75 = startTag74.attributes;
        startTag71.attributes = attributes75;
        startTag68.attributes = attributes75;
        startTag68.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag();
        startTag80.appendTagName("");
        java.lang.String str83 = startTag80.tagName;
        int[] intArray85 = new int[] { 0 };
        startTag80.appendAttributeValue(intArray85);
        startTag68.appendAttributeValue(intArray85);
        startTag60.appendAttributeValue(intArray85);
        tag59.appendAttributeValue(intArray85);
        tag52.appendAttributeValue(intArray85);
        startTag38.appendAttributeValue(intArray85);
        startTag27.appendAttributeValue(intArray85);
        startTag12.appendAttributeValue(intArray85);
        org.jsoup.nodes.Attributes attributes94 = startTag12.getAttributes();
        org.jsoup.parser.Token.StartTag startTag95 = startTag0.nameAttr("<a>", attributes94);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(token37);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] {});
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] {});
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 0 });
        org.junit.Assert.assertNotNull(attributes94);
        org.junit.Assert.assertNotNull(startTag95);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.getData();
        boolean boolean7 = comment0.bogus;
        java.lang.String str8 = comment0.toString();
        org.jsoup.parser.Token token9 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.String str3 = doctype0.getPubSysKey();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        org.jsoup.parser.Token token5 = character4.reset();
        org.jsoup.parser.Token.Character character7 = character4.data("hi!");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(character7);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        comment0.type = tokenType9;
        comment0.bogus = false;
        org.jsoup.parser.Token token13 = comment0.reset();
        java.lang.String str14 = comment0.getData();
        comment0.bogus = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character17 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        org.jsoup.parser.Token token7 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        java.lang.String str12 = startTag11.tagName;
        startTag11.appendAttributeName("<!---->");
        startTag11.normalName = "comment";
        org.jsoup.nodes.Attributes attributes17 = startTag11.getAttributes();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        char[] charArray19 = new char[] {};
        startTag18.appendAttributeValue(charArray19);
        startTag18.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag24 = startTag18.name("Comment");
        startTag18.appendTagName("comment");
        java.lang.String str27 = startTag18.normalName();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = startTag34.attributes;
        startTag31.attributes = attributes35;
        startTag28.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag39 = startTag28.name("Doctype");
        org.jsoup.nodes.Attributes attributes40 = startTag28.getAttributes();
        startTag18.attributes = attributes40;
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.appendTagName("");
        java.lang.String str45 = startTag42.tagName;
        startTag42.normalName = "Doctype";
        startTag42.appendAttributeValue("Commentcomment");
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        startTag50.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        char[] charArray54 = new char[] {};
        startTag53.appendAttributeValue(charArray54);
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes57 = startTag56.attributes;
        startTag53.attributes = attributes57;
        startTag50.attributes = attributes57;
        startTag50.selfClosing = false;
        startTag50.appendAttributeName('4');
        startTag50.newAttribute();
        startTag50.selfClosing = false;
        org.jsoup.parser.Token.Tag tag67 = startTag50.reset();
        tag67.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        char[] charArray71 = new char[] {};
        startTag70.appendAttributeValue(charArray71);
        org.jsoup.nodes.Attributes attributes73 = startTag70.getAttributes();
        boolean boolean74 = startTag70.isComment();
        startTag70.appendAttributeName("Comment");
        startTag70.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes79 = startTag70.attributes;
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag();
        char[] charArray81 = new char[] {};
        startTag80.appendAttributeValue(charArray81);
        startTag70.appendAttributeValue(charArray81);
        tag67.appendAttributeValue(charArray81);
        startTag42.appendAttributeValue(charArray81);
        startTag18.appendAttributeValue(charArray81);
        startTag11.appendAttributeValue(charArray81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "commentcomment" + "'", str27, "commentcomment");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] {});
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] {});
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] {});
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        comment0.type = tokenType9;
        comment0.bogus = false;
        org.jsoup.parser.Token.TokenType tokenType13 = comment0.type;
        java.lang.StringBuilder stringBuilder14 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        org.jsoup.nodes.Attributes attributes10 = null;
        startTag7.attributes = attributes10;
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag7.attributes;
        startTag0.attributes = attributes13;
        org.jsoup.parser.Token.Tag tag15 = startTag0.reset();
        java.lang.String str16 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = startTag26.attributes;
        startTag23.attributes = attributes27;
        startTag20.attributes = attributes27;
        startTag20.appendAttributeValue('4');
        boolean boolean32 = startTag20.selfClosing;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName("");
        org.jsoup.nodes.Attributes attributes36 = null;
        startTag33.attributes = attributes36;
        org.jsoup.parser.Token.Tag tag38 = startTag33.reset();
        org.jsoup.nodes.Attributes attributes39 = startTag33.attributes;
        startTag20.attributes = attributes39;
        startTag18.attributes = attributes39;
        org.jsoup.nodes.Attributes attributes42 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag43 = startTag0.nameAttr("a", attributes42);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        char[] charArray46 = new char[] {};
        startTag45.appendAttributeValue(charArray46);
        org.jsoup.nodes.Attributes attributes48 = startTag45.getAttributes();
        boolean boolean49 = startTag45.isComment();
        org.jsoup.parser.Token.TokenType tokenType50 = startTag45.type;
        startTag45.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag53 = startTag45.asStartTag();
        org.jsoup.parser.Token.Tag tag55 = startTag45.name("Comment");
        org.jsoup.parser.Token.Tag tag56 = startTag45.reset();
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        char[] charArray58 = new char[] {};
        startTag57.appendAttributeValue(charArray58);
        org.jsoup.nodes.Attributes attributes60 = startTag57.getAttributes();
        boolean boolean61 = startTag57.isComment();
        org.jsoup.parser.Token.TokenType tokenType62 = startTag57.type;
        startTag57.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag65 = startTag57.asStartTag();
        org.jsoup.parser.Token.Tag tag67 = startTag57.name("Comment");
        startTag57.newAttribute();
        org.jsoup.nodes.Attributes attributes69 = startTag57.getAttributes();
        startTag45.attributes = attributes69;
        org.jsoup.nodes.Attributes attributes71 = startTag45.getAttributes();
        org.jsoup.parser.Token.StartTag startTag72 = startTag43.nameAttr("<4>", attributes71);
        startTag72.finaliseTag();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] {});
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(startTag72);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        org.jsoup.parser.Token token2 = eOF0.reset();
        java.lang.String str3 = token2.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }
}

