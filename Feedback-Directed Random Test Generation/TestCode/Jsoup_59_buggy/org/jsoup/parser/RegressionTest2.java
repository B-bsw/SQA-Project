package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        tag17.appendTagName("#");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.getData();
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        startTag0.appendAttributeName("<comment>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        boolean boolean4 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        startTag0.finaliseTag();
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        startTag0.normalName = "<comment>";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character19 = tag17.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        boolean boolean5 = startTag0.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        // The following exception was thrown during execution in test generation
        try {
            startTag11.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        char[] charArray9 = new char[] {};
        startTag8.appendAttributeValue(charArray9);
        org.jsoup.nodes.Attributes attributes11 = startTag8.getAttributes();
        boolean boolean12 = startTag8.isComment();
        startTag8.appendAttributeName("Comment");
        startTag8.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes17 = startTag8.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.nodes.Attributes attributes21 = null;
        startTag18.attributes = attributes21;
        org.jsoup.parser.Token.Tag tag23 = startTag18.reset();
        org.jsoup.nodes.Attributes attributes24 = tag23.attributes;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        org.jsoup.nodes.Attributes attributes28 = null;
        startTag25.attributes = attributes28;
        org.jsoup.parser.Token.Tag tag30 = startTag25.reset();
        org.jsoup.nodes.Attributes attributes31 = tag30.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        char[] charArray33 = new char[] {};
        startTag32.appendAttributeValue(charArray33);
        tag30.appendAttributeValue(charArray33);
        tag23.appendAttributeValue(charArray33);
        startTag8.appendAttributeValue(charArray33);
        startTag0.appendAttributeValue(charArray33);
        startTag0.normalName = "<<hi!>>";
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.lang.String str18 = startTag0.normalName();
        boolean boolean19 = startTag0.isStartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>" + "'", str18, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.tokenType();
        boolean boolean3 = comment0.bogus;
        boolean boolean4 = comment0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token token8 = comment0.reset();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        char[] charArray14 = new char[] {};
        startTag13.appendAttributeValue(charArray14);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = startTag16.attributes;
        startTag13.attributes = attributes17;
        startTag10.attributes = attributes17;
        startTag10.appendAttributeValue('4');
        boolean boolean22 = startTag10.selfClosing;
        org.jsoup.nodes.Attributes attributes23 = startTag10.attributes;
        startTag10.appendAttributeName("Character");
        startTag10.finaliseTag();
        startTag10.appendAttributeValue('#');
        org.jsoup.parser.Token.TokenType tokenType29 = startTag10.type;
        comment0.type = tokenType29;
        org.jsoup.parser.Token.TokenType tokenType31 = comment0.type;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        tag14.appendAttributeValue("<Commentcomment#>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.Class<?> wildcardClass10 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.getName();
        org.jsoup.parser.Token token7 = doctype0.reset();
        boolean boolean8 = token7.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        startTag0.appendTagName("");
        org.jsoup.parser.Token.Tag tag55 = startTag0.reset();
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
        org.junit.Assert.assertNotNull(tag55);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        startTag0.appendAttributeValue("<#>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.tokenType();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        startTag0.appendAttributeValue("Doctype");
        startTag0.appendAttributeName("#");
        org.jsoup.parser.Token token11 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = false;
        comment0.bogus = false;
        boolean boolean11 = comment0.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendAttributeValue("");
        startTag0.appendAttributeValue("<#>");
        startTag0.appendTagName("Character");
        boolean boolean12 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype4 = doctype2.asDoctype();
        doctype4.pubSysKey = "<Doctype>";
        java.lang.StringBuilder stringBuilder7 = doctype4.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token token10 = character8.reset();
        org.jsoup.parser.Token token11 = character8.reset();
        org.jsoup.parser.Token.Character character13 = character8.data("<Comment>");
        org.jsoup.parser.Token token14 = character8.reset();
        java.lang.Class<?> wildcardClass15 = token14.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag16 = tag15.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        org.jsoup.parser.Token token7 = doctype2.reset();
        java.lang.String str8 = doctype2.getName();
        boolean boolean9 = doctype2.forceQuirks;
        java.lang.String str10 = doctype2.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "Comment";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        startTag11.newAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.TokenType tokenType5 = character0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = character0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "hi!";
        java.lang.String str8 = doctype2.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        boolean boolean14 = startTag11.isDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName("");
        java.lang.String str23 = startTag20.tagName;
        startTag20.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = startTag26.attributes;
        startTag26.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes30 = startTag26.getAttributes();
        org.jsoup.parser.Token.StartTag startTag31 = startTag20.nameAttr("", attributes30);
        org.jsoup.parser.Token.TokenType tokenType32 = startTag31.type;
        org.jsoup.parser.Token.Tag tag34 = startTag31.name("StartTag");
        org.jsoup.nodes.Attributes attributes35 = tag34.getAttributes();
        org.jsoup.parser.Token.Character character36 = new org.jsoup.parser.Token.Character();
        java.lang.String str37 = character36.getData();
        java.lang.String str38 = character36.toString();
        org.jsoup.parser.Token token39 = character36.reset();
        java.lang.String str40 = character36.toString();
        org.jsoup.parser.Token.TokenType tokenType41 = character36.type;
        tag34.type = tokenType41;
        startTag11.type = tokenType41;
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(token39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = false;
        comment0.bogus = true;
        org.jsoup.parser.Token token11 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        org.jsoup.parser.Token.TokenType tokenType17 = startTag0.type;
        startTag0.appendAttributeName("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.isCharacter();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token.Comment comment8 = comment0.asComment();
        boolean boolean9 = comment0.bogus;
        comment0.bogus = false;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName("Comment");
        java.lang.String str11 = startTag0.tagName;
        startTag0.tagName = "<comment>";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Comment" + "'", str11, "Comment");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isEndTag();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        boolean boolean6 = comment0.isDoctype();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        java.lang.String str6 = comment4.getData();
        comment4.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.String str7 = comment0.getData();
        boolean boolean8 = comment0.bogus;
        boolean boolean9 = comment0.isCharacter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("comment");
        org.jsoup.parser.Token.Character character8 = character6.data("<Comment>");
        java.lang.String str9 = character6.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<Comment>" + "'", str9, "<Comment>");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character2.data("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = character2.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("comment");
        org.jsoup.parser.Token.Character character8 = character6.data("<Comment>");
        org.jsoup.parser.Token.Character character10 = character6.data("<Commentcomment>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        startTag18.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = startTag18.name();
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
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.lang.String str11 = comment0.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        java.lang.String str19 = tag18.normalName;
        org.jsoup.parser.Token.Tag tag20 = tag18.reset();
        tag18.selfClosing = false;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        startTag3.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag9 = startTag3.name("Comment");
        startTag3.appendTagName("comment");
        java.lang.String str12 = startTag3.normalName();
        char[] charArray15 = new char[] { '4', '#' };
        startTag3.appendAttributeValue(charArray15);
        startTag0.appendAttributeValue(charArray15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        startTag19.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag25.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes29 = startTag25.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = startTag19.nameAttr("", attributes29);
        org.jsoup.parser.Token.StartTag startTag31 = startTag0.nameAttr("#", attributes29);
        org.jsoup.nodes.Attributes attributes32 = startTag0.attributes;
        org.jsoup.nodes.Attributes attributes33 = startTag0.attributes;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "commentcomment" + "'", str12, "commentcomment");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        startTag0.appendTagName('4');
        java.lang.Class<?> wildcardClass17 = startTag0.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        boolean boolean5 = startTag0.isStartTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        tag11.appendTagName('#');
        tag11.appendTagName(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character16 = tag11.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = false;
        comment0.bogus = true;
        java.lang.String str11 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        tag14.appendAttributeName('4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        org.jsoup.nodes.Attributes attributes15 = startTag0.attributes;
        java.lang.Class<?> wildcardClass16 = startTag0.getClass();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        java.lang.String str6 = doctype2.pubSysKey;
        java.lang.StringBuilder stringBuilder7 = doctype2.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        java.lang.String str6 = doctype2.pubSysKey;
        java.lang.StringBuilder stringBuilder7 = doctype2.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.String str27 = startTag0.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<hi!>" + "'", str27, "<hi!>");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        startTag0.appendAttributeName("<<!---->>");
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
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token token5 = character0.reset();
        boolean boolean6 = token5.isEOF();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment17 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        boolean boolean12 = startTag0.selfClosing;
        boolean boolean13 = startTag0.isCharacter();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        doctype6.pubSysKey = "<!---->";
        doctype6.forceQuirks = false;
        java.lang.StringBuilder stringBuilder11 = doctype6.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        boolean boolean52 = startTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes53 = startTag0.attributes;
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributes53);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("Comment");
        boolean boolean11 = tag10.isDoctype();
        tag10.appendAttributeValue("<comment>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        tag10.normalName = "<hi!>";
        org.jsoup.parser.Token token14 = tag10.reset();
        boolean boolean15 = tag10.selfClosing;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.lang.String str21 = tag17.name();
        tag17.finaliseTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!>" + "'", str21, "<hi!>");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        org.jsoup.nodes.Attributes attributes22 = null;
        startTag19.attributes = attributes22;
        startTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes25 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        char[] charArray30 = new char[] {};
        startTag29.appendAttributeValue(charArray30);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = startTag32.attributes;
        startTag29.attributes = attributes33;
        startTag26.attributes = attributes33;
        startTag26.selfClosing = false;
        startTag26.appendAttributeName('4');
        startTag26.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes42 = startTag26.attributes;
        startTag19.attributes = attributes42;
        tag17.attributes = attributes42;
        tag17.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment46 = tag17.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        startTag0.tagName = " ";
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        startTag0.appendTagName("#");
        startTag0.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = startTag17.attributes;
        startTag14.attributes = attributes18;
        startTag11.attributes = attributes18;
        startTag11.selfClosing = false;
        startTag11.appendAttributeName('4');
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.String str26 = comment25.tokenType();
        boolean boolean27 = comment25.isComment();
        java.lang.StringBuilder stringBuilder28 = comment25.data;
        java.lang.StringBuilder stringBuilder29 = comment25.data;
        boolean boolean30 = comment25.isCharacter();
        java.lang.StringBuilder stringBuilder31 = comment25.data;
        org.jsoup.parser.Token.TokenType tokenType32 = comment25.type;
        startTag11.type = tokenType32;
        boolean boolean34 = startTag11.isCharacter();
        org.jsoup.nodes.Attributes attributes35 = startTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = startTag0.nameAttr("#", attributes35);
        boolean boolean37 = startTag0.isCharacter();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Comment" + "'", str26, "Comment");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        boolean boolean14 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        boolean boolean3 = startTag0.isDoctype();
        startTag0.tagName = "<!---->";
        java.lang.String str6 = startTag0.toString();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<<!---->>" + "'", str6, "<<!---->>");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.jsoup.parser.Token.Character character5 = character0.data("commentcomment");
        java.lang.String str6 = character5.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "commentcomment" + "'", str6, "commentcomment");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        doctype0.type = tokenType5;
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        boolean boolean3 = comment0.bogus;
        comment0.bogus = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.jsoup.nodes.Attributes attributes12 = startTag0.attributes;
        java.lang.Class<?> wildcardClass13 = startTag0.getClass();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        startTag11.normalName = "<!---->";
        boolean boolean19 = startTag11.selfClosing;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        boolean boolean5 = startTag0.isEOF();
        startTag0.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token9 = doctype8.reset();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str11 = doctype10.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType14 = doctype12.type;
        doctype10.type = tokenType14;
        doctype8.type = tokenType14;
        startTag0.type = tokenType14;
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
        startTag18.appendAttributeName('4');
        startTag18.newAttribute();
        startTag18.selfClosing = false;
        org.jsoup.parser.Token.Tag tag35 = startTag18.reset();
        tag35.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        org.jsoup.nodes.Attributes attributes41 = startTag38.getAttributes();
        boolean boolean42 = startTag38.isComment();
        startTag38.appendAttributeName("Comment");
        startTag38.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes47 = startTag38.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        char[] charArray49 = new char[] {};
        startTag48.appendAttributeValue(charArray49);
        startTag38.appendAttributeValue(charArray49);
        tag35.appendAttributeValue(charArray49);
        startTag0.appendAttributeValue(charArray49);
        org.jsoup.nodes.Attributes attributes54 = startTag0.attributes;
        boolean boolean55 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        java.lang.String str3 = comment2.toString();
        org.jsoup.parser.Token token4 = comment2.reset();
        java.lang.String str5 = comment2.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.tokenType();
        org.jsoup.parser.Token.Character character5 = character0.data("hi!");
        org.jsoup.parser.Token.Character character7 = character0.data("<StartTag>");
        org.jsoup.parser.Token token8 = character0.reset();
        boolean boolean9 = token8.isEOF();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        startTag11.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        startTag11.appendAttributeValue("Commentcomment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character17 = startTag11.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        startTag0.appendAttributeName("commentcomment");
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        java.lang.String str7 = startTag0.tagName;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        boolean boolean3 = startTag0.isComment();
        startTag0.appendAttributeValue(' ');
        startTag0.appendAttributeValue("comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype2.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        java.lang.String str5 = character4.toString();
        java.lang.String str6 = character4.getData();
        org.jsoup.parser.Token.Character character8 = character4.data("comment");
        org.jsoup.parser.Token token9 = character4.reset();
        boolean boolean10 = token9.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Character" + "'", str6, "Character");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        boolean boolean14 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        boolean boolean11 = tag10.isStartTag();
        tag10.appendAttributeName('4');
        boolean boolean14 = tag10.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = tag10.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.isStartTag();
        boolean boolean8 = comment0.isStartTag();
        java.lang.String str9 = comment0.getData();
        java.lang.String str10 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        startTag22.appendAttributeName("4");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        doctype0.type = tokenType5;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        boolean boolean5 = startTag0.isSelfClosing();
        org.jsoup.parser.Token token6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        java.lang.String str12 = startTag9.tagName;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        org.jsoup.nodes.Attributes attributes17 = startTag14.getAttributes();
        org.jsoup.nodes.Attributes attributes18 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag19 = startTag9.nameAttr("Doctype", attributes18);
        startTag0.attributes = attributes18;
        startTag0.appendAttributeValue("starttag");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag19);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        comment0.bogus = true;
        java.lang.String str5 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.String str12 = startTag0.tokenType();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        char[] charArray14 = new char[] {};
        startTag13.appendAttributeValue(charArray14);
        startTag13.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag19 = startTag13.name("Comment");
        startTag13.appendTagName("comment");
        java.lang.String str22 = startTag13.normalName();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        char[] charArray27 = new char[] {};
        startTag26.appendAttributeValue(charArray27);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = startTag29.attributes;
        startTag26.attributes = attributes30;
        startTag23.attributes = attributes30;
        org.jsoup.parser.Token.Tag tag34 = startTag23.name("Doctype");
        org.jsoup.nodes.Attributes attributes35 = startTag23.getAttributes();
        startTag13.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        startTag37.appendTagName("");
        java.lang.String str40 = startTag37.tagName;
        startTag37.normalName = "Doctype";
        startTag37.appendAttributeValue("Commentcomment");
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        startTag45.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        char[] charArray49 = new char[] {};
        startTag48.appendAttributeValue(charArray49);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = startTag51.attributes;
        startTag48.attributes = attributes52;
        startTag45.attributes = attributes52;
        startTag45.selfClosing = false;
        startTag45.appendAttributeName('4');
        startTag45.newAttribute();
        startTag45.selfClosing = false;
        org.jsoup.parser.Token.Tag tag62 = startTag45.reset();
        tag62.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        char[] charArray66 = new char[] {};
        startTag65.appendAttributeValue(charArray66);
        org.jsoup.nodes.Attributes attributes68 = startTag65.getAttributes();
        boolean boolean69 = startTag65.isComment();
        startTag65.appendAttributeName("Comment");
        startTag65.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes74 = startTag65.attributes;
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        char[] charArray76 = new char[] {};
        startTag75.appendAttributeValue(charArray76);
        startTag65.appendAttributeValue(charArray76);
        tag62.appendAttributeValue(charArray76);
        startTag37.appendAttributeValue(charArray76);
        startTag13.appendAttributeValue(charArray76);
        startTag0.appendAttributeValue(charArray76);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "commentcomment" + "'", str22, "commentcomment");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] {});
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] {});
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        org.jsoup.nodes.Attributes attributes19 = null;
        tag18.attributes = attributes19;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.lang.String str64 = startTag0.toString();
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<Commentcomment>" + "'", str64, "<Commentcomment>");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        tag6.appendAttributeValue("<!---->");
        tag6.finaliseTag();
        boolean boolean31 = tag6.isCharacter();
        tag6.setEmptyAttributeValue();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token token4 = comment0.reset();
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.name();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("Doctype");
        java.lang.String str12 = tag11.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Commentcomment" + "'", str9, "Commentcomment");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isStartTag();
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token token11 = tag10.reset();
        boolean boolean12 = token11.isDoctype();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        java.lang.String str30 = startTag27.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<a>" + "'", str30, "<a>");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        comment0.bogus = true;
        boolean boolean5 = comment0.bogus;
        boolean boolean6 = comment0.isStartTag();
        org.jsoup.parser.Token token7 = comment0.reset();
        boolean boolean8 = token7.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character37 = startTag36.asCharacter();
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
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        boolean boolean5 = character4.isEOF();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype6.type;
        character4.type = tokenType8;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        comment4.bogus = false;
        java.lang.String str7 = comment4.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        boolean boolean14 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        boolean boolean24 = startTag0.isStartTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        org.jsoup.parser.Token token7 = doctype2.reset();
        boolean boolean8 = doctype2.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = doctype2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        tag2.selfClosing = false;
        java.lang.String str5 = tag2.normalName;
        boolean boolean6 = tag2.isStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token token3 = comment0.reset();
        comment0.bogus = true;
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        startTag0.appendAttributeValue(' ');
        java.lang.String str15 = startTag0.normalName();
        java.lang.String str16 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag17 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.pubSysKey = "hi!";
        boolean boolean6 = doctype0.isForceQuirks();
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isComment();
        java.lang.String str9 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        boolean boolean32 = startTag11.isComment();
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
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        boolean boolean10 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        java.lang.String str5 = character4.getData();
        java.lang.String str6 = character4.getData();
        java.lang.String str7 = character4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Comment" + "'", str6, "Comment");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        boolean boolean7 = comment6.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendAttributeValue("");
        startTag0.appendAttributeValue("<#>");
        startTag0.appendTagName("Character");
        java.lang.String str12 = startTag0.toString();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<Character>" + "'", str12, "<Character>");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        org.jsoup.parser.Token.Tag tag14 = tag12.name("comment");
        java.lang.String str15 = tag14.tagName;
        java.lang.Class<?> wildcardClass16 = tag14.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "comment" + "'", str15, "comment");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.lang.String str18 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.asStartTag();
        boolean boolean20 = startTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>" + "'", str18, "<hi!>");
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        // The following exception was thrown during execution in test generation
        try {
            tag6.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.name();
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
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendTagName("");
        java.lang.String str27 = startTag24.tagName;
        startTag24.appendAttributeName("hi!");
        startTag24.appendTagName('#');
        startTag24.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        char[] charArray35 = new char[] {};
        startTag34.appendAttributeValue(charArray35);
        org.jsoup.nodes.Attributes attributes37 = startTag34.getAttributes();
        startTag34.appendTagName('#');
        startTag34.finaliseTag();
        boolean boolean41 = startTag34.isSelfClosing();
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
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendTagName("");
        org.jsoup.nodes.Attributes attributes65 = null;
        startTag62.attributes = attributes65;
        org.jsoup.parser.Token.Tag tag67 = startTag62.reset();
        org.jsoup.nodes.Attributes attributes68 = tag67.attributes;
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        char[] charArray70 = new char[] {};
        startTag69.appendAttributeValue(charArray70);
        tag67.appendAttributeValue(charArray70);
        startTag42.appendAttributeValue(charArray70);
        startTag34.appendAttributeValue(charArray70);
        startTag24.appendAttributeValue(charArray70);
        startTag10.appendAttributeValue(charArray70);
        startTag0.appendAttributeValue(charArray70);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Commentcomment" + "'", str9, "Commentcomment");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] {});
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        boolean boolean4 = doctype0.isCharacter();
        boolean boolean5 = doctype0.isCharacter();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str1 = endTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        org.jsoup.parser.Token.Tag tag38 = startTag37.reset();
        org.jsoup.nodes.Attributes attributes39 = startTag37.attributes;
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
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        java.lang.StringBuilder stringBuilder7 = doctype2.systemIdentifier;
        java.lang.String str8 = doctype2.pubSysKey;
        boolean boolean9 = doctype2.forceQuirks;
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
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        boolean boolean3 = startTag0.isComment();
        startTag0.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes6 = null;
        startTag0.attributes = attributes6;
        startTag0.appendTagName("<StartTag>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        org.jsoup.parser.Token token5 = character2.reset();
        org.jsoup.parser.Token.Character character7 = character2.data("Commentcomment");
        org.jsoup.parser.Token token8 = character2.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        boolean boolean20 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        boolean boolean13 = startTag11.isSelfClosing();
        startTag11.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        boolean boolean18 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Tag tag21 = startTag0.reset();
        tag21.appendTagName('a');
        tag21.appendAttributeName("<<Commentcomment>>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        boolean boolean12 = startTag0.selfClosing;
        boolean boolean13 = startTag0.isCharacter();
        boolean boolean14 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token token8 = comment0.reset();
        java.lang.String str9 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = false;
        comment0.bogus = false;
        comment0.bogus = false;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        org.jsoup.nodes.Attributes attributes13 = startTag0.attributes;
        java.lang.Class<?> wildcardClass14 = startTag0.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendTagName('a');
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        tag14.appendTagName("hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        boolean boolean5 = startTag0.isEOF();
        startTag0.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token9 = doctype8.reset();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str11 = doctype10.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType14 = doctype12.type;
        doctype10.type = tokenType14;
        doctype8.type = tokenType14;
        startTag0.type = tokenType14;
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
        startTag18.appendAttributeName('4');
        startTag18.newAttribute();
        startTag18.selfClosing = false;
        org.jsoup.parser.Token.Tag tag35 = startTag18.reset();
        tag35.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        org.jsoup.nodes.Attributes attributes41 = startTag38.getAttributes();
        boolean boolean42 = startTag38.isComment();
        startTag38.appendAttributeName("Comment");
        startTag38.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes47 = startTag38.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        char[] charArray49 = new char[] {};
        startTag48.appendAttributeValue(charArray49);
        startTag38.appendAttributeValue(charArray49);
        tag35.appendAttributeValue(charArray49);
        startTag0.appendAttributeValue(charArray49);
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        startTag55.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        char[] charArray59 = new char[] {};
        startTag58.appendAttributeValue(charArray59);
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes62 = startTag61.attributes;
        startTag58.attributes = attributes62;
        startTag55.attributes = attributes62;
        startTag55.appendAttributeValue('4');
        boolean boolean67 = startTag55.selfClosing;
        org.jsoup.nodes.Attributes attributes68 = startTag55.attributes;
        org.jsoup.parser.Token.StartTag startTag69 = startTag0.nameAttr("", attributes68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(startTag69);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.tokenType();
        boolean boolean8 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        org.jsoup.parser.Token.Tag tag26 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype27 = startTag0.asDoctype();
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
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype5.pubSysKey;
        doctype5.pubSysKey = "#";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        org.jsoup.nodes.Attributes attributes17 = startTag0.attributes;
        org.jsoup.parser.Token token18 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character19 = token18.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(token18);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        char[] charArray6 = new char[] {};
        startTag5.appendAttributeValue(charArray6);
        org.jsoup.nodes.Attributes attributes8 = startTag5.getAttributes();
        org.jsoup.nodes.Attributes attributes9 = startTag5.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = startTag0.nameAttr("Doctype", attributes9);
        boolean boolean11 = startTag10.isStartTag();
        java.lang.String str12 = startTag10.tokenType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.tagName = "<Commentcomment#>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        startTag0.appendAttributeName("commentcomment");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.lang.String str35 = startTag34.tagName;
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<StartTag>" + "'", str35, "<StartTag>");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        org.jsoup.parser.Token token12 = doctype2.reset();
        doctype2.pubSysKey = "<4>";
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        java.lang.String str15 = startTag0.name();
        java.lang.String str16 = startTag0.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<Commentcomment>" + "'", str11, "<Commentcomment>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<#>" + "'", str15, "<#>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<#>" + "'", str16, "<#>");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        boolean boolean4 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        doctype0.pubSysKey = "4";
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        java.lang.String str6 = character0.getData();
        org.jsoup.parser.Token.Character character7 = character0.asCharacter();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertNotNull(character7);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        startTag0.newAttribute();
        boolean boolean8 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.String str15 = doctype2.getPubSysKey();
        java.lang.String str16 = doctype2.getName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token token8 = comment7.reset();
        java.lang.String str9 = comment7.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character6.toString();
        boolean boolean8 = character6.isComment();
        org.jsoup.parser.Token.Character character10 = character6.data("4");
        java.lang.String str11 = character6.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        java.lang.String str67 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = startTag0.toString();
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
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName("");
        java.lang.String str10 = startTag7.tagName;
        startTag7.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag13.attributes;
        startTag13.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes17 = startTag13.getAttributes();
        org.jsoup.parser.Token.StartTag startTag18 = startTag7.nameAttr("", attributes17);
        org.jsoup.parser.Token.TokenType tokenType19 = startTag18.type;
        startTag0.type = tokenType19;
        java.lang.String str21 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.String str4 = comment2.getData();
        java.lang.String str5 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = comment2.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.lang.Class<?> wildcardClass22 = startTag0.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        java.lang.String str26 = startTag0.tokenType();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "StartTag" + "'", str26, "StartTag");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getName();
        java.lang.StringBuilder stringBuilder6 = doctype2.name;
        boolean boolean7 = doctype2.isForceQuirks();
        java.lang.String str8 = doctype2.getSystemIdentifier();
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        boolean boolean7 = tag5.isEOF();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        java.lang.String str6 = startTag0.toString();
        startTag0.newAttribute();
        startTag0.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = tag1.reset();
        tag2.appendAttributeName('4');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("comment");
        org.jsoup.parser.Token.Character character8 = character6.data("<Comment>");
        java.lang.String str9 = character8.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<Comment>" + "'", str9, "<Comment>");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag12 = startTag0.name("Doctype");
        org.jsoup.parser.Token.Tag tag13 = tag12.reset();
        boolean boolean14 = tag13.isSelfClosing();
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes4 = startTag3.attributes;
        startTag0.attributes = attributes4;
        boolean boolean6 = startTag0.isSelfClosing();
        boolean boolean7 = startTag0.isStartTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType6 = tag5.type;
        tag5.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        org.jsoup.nodes.Attributes attributes12 = startTag9.getAttributes();
        boolean boolean13 = startTag9.isComment();
        org.jsoup.parser.Token.TokenType tokenType14 = startTag9.type;
        startTag9.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag17 = startTag9.asStartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag9.name("<hi!>");
        org.jsoup.nodes.Attributes attributes20 = startTag9.attributes;
        tag5.attributes = attributes20;
        java.lang.String str22 = tag5.tagName;
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        startTag3.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag9 = startTag3.name("Comment");
        startTag3.appendTagName("comment");
        java.lang.String str12 = startTag3.normalName();
        char[] charArray15 = new char[] { '4', '#' };
        startTag3.appendAttributeValue(charArray15);
        startTag0.appendAttributeValue(charArray15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        startTag19.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag25.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes29 = startTag25.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = startTag19.nameAttr("", attributes29);
        org.jsoup.parser.Token.StartTag startTag31 = startTag0.nameAttr("#", attributes29);
        startTag0.selfClosing = true;
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "commentcomment" + "'", str12, "commentcomment");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(startTag31);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype6.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = doctype6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = tag14.asComment();
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
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.forceQuirks;
        doctype0.pubSysKey = "Doctype";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        startTag0.tagName = "<hi!>";
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        tag15.appendTagName("commentcomment");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.tokenType();
        org.jsoup.parser.Token.Character character5 = character0.data("a");
        java.lang.String str6 = character5.toString();
        java.lang.String str7 = character5.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character12 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        boolean boolean6 = doctype0.isEOF();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag0.appendAttributeName('a');
        boolean boolean9 = startTag0.isCharacter();
        java.lang.String str10 = startTag0.tagName;
        boolean boolean11 = startTag0.isComment();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.bogus;
        boolean boolean6 = comment0.bogus;
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        java.lang.String str8 = startTag0.normalName();
        boolean boolean9 = startTag0.selfClosing;
        startTag0.appendAttributeName("");
        startTag0.appendAttributeValue("Comment");
        java.lang.String str14 = startTag0.normalName;
        java.lang.String str15 = startTag0.name();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "comment" + "'", str8, "comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "comment" + "'", str14, "comment");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Comment" + "'", str15, "Comment");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        startTag0.tagName = "Character";
        org.jsoup.parser.Token.Tag tag32 = startTag0.reset();
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
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.lang.StringBuilder stringBuilder11 = doctype2.systemIdentifier;
        boolean boolean12 = doctype2.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        tag6.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag28 = tag6.reset();
        java.lang.String str29 = tag28.tokenType();
        boolean boolean30 = tag28.isEOF();
        boolean boolean31 = tag28.isCharacter();
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
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "StartTag" + "'", str29, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getPubSysKey();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        startTag0.appendAttributeValue("starttag");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        java.lang.String str4 = doctype2.pubSysKey;
        boolean boolean5 = doctype2.isDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        org.jsoup.nodes.Attributes attributes12 = startTag9.getAttributes();
        startTag9.appendTagName('#');
        org.jsoup.parser.Token.Tag tag16 = startTag9.name("Comment");
        startTag9.finaliseTag();
        startTag9.newAttribute();
        org.jsoup.nodes.Attributes attributes19 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        char[] charArray21 = new char[] {};
        startTag20.appendAttributeValue(charArray21);
        org.jsoup.nodes.Attributes attributes23 = startTag20.getAttributes();
        boolean boolean24 = startTag20.isComment();
        org.jsoup.parser.Token.TokenType tokenType25 = startTag20.type;
        org.jsoup.parser.Token.Tag tag26 = startTag20.reset();
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
        tag26.appendAttributeValue(intArray51);
        startTag9.appendAttributeValue(intArray51);
        startTag9.newAttribute();
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        startTag58.appendTagName("");
        org.jsoup.nodes.Attributes attributes61 = null;
        startTag58.attributes = attributes61;
        startTag58.appendTagName("");
        java.lang.String str65 = startTag58.tagName;
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag();
        startTag66.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        char[] charArray70 = new char[] {};
        startTag69.appendAttributeValue(charArray70);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes73 = startTag72.attributes;
        startTag69.attributes = attributes73;
        startTag66.attributes = attributes73;
        startTag66.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        startTag78.appendTagName("");
        java.lang.String str81 = startTag78.tagName;
        int[] intArray83 = new int[] { 0 };
        startTag78.appendAttributeValue(intArray83);
        startTag66.appendAttributeValue(intArray83);
        startTag58.appendAttributeValue(intArray83);
        startTag9.appendAttributeValue(intArray83);
        startTag0.appendAttributeValue(intArray83);
        startTag0.normalName = "Doctype";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] {});
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 0 });
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.lang.String str19 = tag18.normalName;
        tag18.appendAttributeName("<!---->");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.isDoctype();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.Class<?> wildcardClass6 = doctype0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        boolean boolean5 = doctype2.forceQuirks;
        java.lang.String str6 = doctype2.getSystemIdentifier();
        java.lang.String str7 = doctype2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        org.jsoup.parser.Token.reset(stringBuilder14);
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        boolean boolean18 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Tag tag21 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag23 = tag21.name("StartTag");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        org.jsoup.parser.Token token6 = character0.reset();
        boolean boolean7 = character0.isEndTag();
        java.lang.String str8 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.name();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("Doctype");
        boolean boolean12 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Commentcomment" + "'", str9, "Commentcomment");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.lang.String str26 = startTag0.normalName();
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
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.StringBuilder stringBuilder4 = comment2.data;
        org.jsoup.parser.Token token5 = comment2.reset();
        org.jsoup.parser.Token token6 = comment2.reset();
        java.lang.Class<?> wildcardClass7 = token6.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
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
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype6.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype2.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        boolean boolean19 = tag18.selfClosing;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        startTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isCharacter();
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<<<hi!>>>");
        tag9.appendAttributeValue('4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeValue("<<<hi!>>>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        java.lang.String str14 = startTag0.normalName;
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.TokenType tokenType17 = startTag0.type;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        boolean boolean7 = startTag0.selfClosing;
        java.lang.String str8 = startTag0.tokenType();
        startTag0.appendAttributeName('4');
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getPubSysKey();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.lang.StringBuilder stringBuilder12 = doctype2.systemIdentifier;
        boolean boolean13 = doctype2.forceQuirks;
        doctype2.forceQuirks = false;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = token5.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        startTag11.appendAttributeValue("Commentcomment");
        boolean boolean17 = startTag11.selfClosing;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.tagName = " ";
        java.lang.String str10 = startTag0.normalName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getName();
        java.lang.StringBuilder stringBuilder6 = doctype2.name;
        boolean boolean7 = doctype2.isForceQuirks();
        boolean boolean8 = doctype2.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        org.jsoup.nodes.Attributes attributes12 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        char[] charArray18 = new char[] {};
        startTag17.appendAttributeValue(charArray18);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = startTag20.attributes;
        startTag17.attributes = attributes21;
        startTag14.attributes = attributes21;
        startTag14.selfClosing = false;
        startTag14.appendAttributeName('#');
        java.lang.String str28 = startTag14.normalName;
        org.jsoup.nodes.Attributes attributes29 = startTag14.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = startTag0.nameAttr("Commentcomment", attributes29);
        java.lang.String str31 = startTag30.tagName;
        java.lang.String str32 = startTag30.tokenType();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Commentcomment" + "'", str31, "Commentcomment");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "StartTag" + "'", str32, "StartTag");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = startTag0.normalName();
        boolean boolean9 = startTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.bogus;
        boolean boolean3 = comment0.bogus;
        java.lang.String str4 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        doctype0.pubSysKey = "Character";
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token.Comment comment8 = comment0.asComment();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(comment8);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        java.lang.String str5 = character4.toString();
        java.lang.String str6 = character4.toString();
        java.lang.Class<?> wildcardClass7 = character4.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Character" + "'", str6, "Character");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getName();
        java.lang.StringBuilder stringBuilder9 = doctype2.name;
        org.jsoup.parser.Token token10 = doctype2.reset();
        boolean boolean11 = token10.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.String str4 = comment2.getData();
        java.lang.String str5 = comment2.toString();
        boolean boolean6 = comment2.bogus;
        java.lang.String str7 = comment2.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendTagName("");
        java.lang.String str16 = startTag13.tagName;
        startTag13.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = startTag19.attributes;
        startTag19.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes23 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag24 = startTag13.nameAttr("", attributes23);
        startTag11.attributes = attributes23;
        startTag11.finaliseTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = startTag22.attributes;
        startTag19.attributes = attributes23;
        startTag16.attributes = attributes23;
        startTag16.appendAttributeValue('4');
        boolean boolean28 = startTag16.selfClosing;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.nodes.Attributes attributes32 = null;
        startTag29.attributes = attributes32;
        org.jsoup.parser.Token.Tag tag34 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes35 = startTag29.attributes;
        startTag16.attributes = attributes35;
        java.lang.String str37 = startTag16.normalName();
        startTag16.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes40 = startTag16.attributes;
        tag15.attributes = attributes40;
        tag15.newAttribute();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes40);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        boolean boolean18 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Tag tag21 = startTag0.reset();
        tag21.appendTagName('a');
        tag21.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        org.jsoup.parser.Token.Tag tag17 = startTag0.reset();
        boolean boolean18 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment34 = startTag11.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.TokenType tokenType10 = startTag0.type;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendTagName("");
        org.jsoup.nodes.Attributes attributes15 = null;
        startTag12.attributes = attributes15;
        startTag12.newAttribute();
        org.jsoup.nodes.Attributes attributes18 = startTag12.getAttributes();
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.nameAttr("<Commentcomment>", attributes18);
        org.jsoup.parser.Token.Tag tag21 = startTag19.name("<<<hi!>>>");
        org.jsoup.parser.Token.Tag tag23 = tag21.name("<!---->");
        tag21.appendAttributeName("<4>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        startTag0.appendAttributeName("<Commentcomment#>");
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.String str10 = token9.tokenType();
        org.jsoup.parser.Token token11 = token9.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getName();
        java.lang.StringBuilder stringBuilder9 = doctype2.name;
        org.jsoup.parser.Token token10 = doctype2.reset();
        org.jsoup.parser.Token token11 = doctype2.reset();
        org.jsoup.parser.Token.Doctype doctype12 = token11.asDoctype();
        java.lang.Class<?> wildcardClass13 = doctype12.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        startTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        startTag11.appendAttributeName('a');
        boolean boolean19 = startTag11.isCharacter();
        boolean boolean20 = startTag11.isStartTag();
        startTag11.newAttribute();
        startTag11.appendAttributeValue(' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        char[] charArray9 = new char[] {};
        startTag8.appendAttributeValue(charArray9);
        org.jsoup.nodes.Attributes attributes11 = startTag8.getAttributes();
        boolean boolean12 = startTag8.isComment();
        startTag8.appendAttributeName("Comment");
        startTag8.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes17 = startTag8.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.nodes.Attributes attributes21 = null;
        startTag18.attributes = attributes21;
        org.jsoup.parser.Token.Tag tag23 = startTag18.reset();
        org.jsoup.nodes.Attributes attributes24 = tag23.attributes;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        org.jsoup.nodes.Attributes attributes28 = null;
        startTag25.attributes = attributes28;
        org.jsoup.parser.Token.Tag tag30 = startTag25.reset();
        org.jsoup.nodes.Attributes attributes31 = tag30.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        char[] charArray33 = new char[] {};
        startTag32.appendAttributeValue(charArray33);
        tag30.appendAttributeValue(charArray33);
        tag23.appendAttributeValue(charArray33);
        startTag8.appendAttributeValue(charArray33);
        startTag0.appendAttributeValue(charArray33);
        startTag0.appendAttributeValue("");
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        boolean boolean6 = doctype0.isEOF();
        org.jsoup.parser.Token token7 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName("comment");
        startTag0.normalName = "commentcomment";
        startTag0.finaliseTag();
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        java.lang.String str4 = character0.getData();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("<a>");
        org.jsoup.parser.Token.TokenType tokenType8 = character0.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "comment" + "'", str4, "comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "comment" + "'", str5, "comment");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        boolean boolean5 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("<!---->");
        org.jsoup.parser.Token token6 = character5.reset();
        org.jsoup.parser.Token token7 = character5.reset();
        org.jsoup.parser.Token token8 = character5.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        tag5.selfClosing = false;
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        java.lang.String str6 = startTag0.normalName();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token token3 = comment0.reset();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        boolean boolean6 = token5.isCharacter();
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        java.lang.StringBuilder stringBuilder3 = comment2.data;
        boolean boolean4 = comment2.bogus;
        comment2.bogus = false;
        comment2.bogus = false;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.pubSysKey = "commentcomment";
        boolean boolean10 = doctype0.isForceQuirks();
        boolean boolean11 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        java.lang.String str20 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeValue("<4>");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        boolean boolean2 = comment0.bogus;
        org.jsoup.parser.Token token3 = comment0.reset();
        java.lang.String str4 = comment0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        boolean boolean2 = eOF0.isEOF();
        boolean boolean3 = eOF0.isEndTag();
        boolean boolean4 = eOF0.isDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.appendAttributeValue("<!---->");
        startTag0.appendTagName('4');
        startTag0.appendAttributeValue("commenta");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.pubSysKey;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isStartTag();
        org.jsoup.parser.Token.Character character8 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = character8.type;
        org.jsoup.parser.Token token11 = character8.reset();
        java.lang.String str12 = character8.getData();
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token14 = doctype13.reset();
        java.lang.String str15 = doctype13.getPubSysKey();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.nodes.Attributes attributes19 = null;
        startTag16.attributes = attributes19;
        startTag16.appendAttributeValue("hi!");
        startTag16.tagName = "Comment";
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        org.jsoup.nodes.Attributes attributes28 = null;
        startTag25.attributes = attributes28;
        org.jsoup.parser.Token.Tag tag30 = startTag25.reset();
        org.jsoup.parser.Token.TokenType tokenType31 = tag30.type;
        startTag16.type = tokenType31;
        doctype13.type = tokenType31;
        character8.type = tokenType31;
        doctype0.type = tokenType31;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        startTag11.normalName = "<!---->";
        boolean boolean19 = startTag11.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag20 = startTag11.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder4);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        java.lang.String str8 = startTag0.name();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        tag9.normalName = "commentcomment";
        tag9.appendAttributeValue("<StartTag>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        java.lang.String str6 = character5.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        boolean boolean7 = doctype6.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        org.jsoup.parser.Token.Tag tag23 = startTag19.reset();
        java.lang.String str24 = startTag19.tagName;
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
        startTag19.appendAttributeValue(intArray42);
        tag17.appendAttributeValue(intArray42);
        tag17.appendAttributeName("");
        boolean boolean49 = tag17.isDoctype();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        tag53.appendAttributeValue("<<!---->>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype56 = tag53.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
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
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.appendAttributeName("<!---->");
        startTag0.setEmptyAttributeValue();
        startTag0.appendAttributeName("comment");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        boolean boolean5 = startTag0.isCharacter();
        startTag0.appendAttributeValue("Commentcomment");
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        org.jsoup.parser.Token.Tag tag15 = startTag11.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = startTag11.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        boolean boolean3 = startTag0.isComment();
        startTag0.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isEOF();
        org.jsoup.parser.Token token3 = eOF0.reset();
        boolean boolean4 = token3.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        boolean boolean8 = doctype0.isComment();
        boolean boolean9 = doctype0.isComment();
        java.lang.String str10 = doctype0.getName();
        java.lang.String str11 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType6 = tag5.type;
        tag5.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        org.jsoup.nodes.Attributes attributes12 = startTag9.getAttributes();
        boolean boolean13 = startTag9.isComment();
        org.jsoup.parser.Token.TokenType tokenType14 = startTag9.type;
        startTag9.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag17 = startTag9.asStartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag9.name("<hi!>");
        org.jsoup.nodes.Attributes attributes20 = startTag9.attributes;
        tag5.attributes = attributes20;
        tag5.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName("<!---->");
        startTag0.setEmptyAttributeValue();
        startTag0.selfClosing = true;
        boolean boolean10 = startTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        startTag11.appendAttributeValue('#');
        java.lang.String str15 = startTag11.tagName;
        boolean boolean16 = startTag11.isEndTag();
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str18 = doctype17.getPublicIdentifier();
        java.lang.String str19 = doctype17.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder20 = doctype17.name;
        boolean boolean21 = doctype17.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Doctype;
        doctype17.type = tokenType22;
        startTag11.type = tokenType22;
        org.jsoup.parser.Token.Tag tag26 = startTag11.name("<<Commentcomment>>");
        java.lang.Class<?> wildcardClass27 = tag26.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        boolean boolean3 = startTag0.isComment();
        java.lang.String str4 = startTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        doctype2.pubSysKey = "<#>";
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        java.lang.String str32 = startTag0.normalName();
        startTag0.appendAttributeValue('a');
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "starttag" + "'", str32, "starttag");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        boolean boolean3 = startTag0.isComment();
        startTag0.appendAttributeValue(' ');
        boolean boolean6 = startTag0.isSelfClosing();
        boolean boolean7 = startTag0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        boolean boolean10 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token.Character character10 = character8.data("Doctype");
        java.lang.String str11 = character10.tokenType();
        org.jsoup.parser.Token.Character character13 = character10.data("Character");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Character" + "'", str11, "Character");
        org.junit.Assert.assertNotNull(character13);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        boolean boolean7 = startTag0.isCharacter();
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        tag8.appendAttributeValue(' ');
        boolean boolean11 = tag8.isEndTag();
        org.jsoup.nodes.Attributes attributes12 = tag8.attributes;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.StringBuilder stringBuilder4 = comment2.data;
        boolean boolean5 = comment2.bogus;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype7.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.tokenType();
        org.jsoup.parser.Token.Character character5 = character0.data("hi!");
        java.lang.String str6 = character0.toString();
        java.lang.String str7 = character0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        java.lang.String str6 = comment4.getData();
        java.lang.String str7 = comment4.getData();
        boolean boolean8 = comment4.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = tag7.isSelfClosing();
        boolean boolean9 = tag7.isSelfClosing();
        boolean boolean10 = tag7.isSelfClosing();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.tokenType();
        org.jsoup.parser.Token.Character character5 = character0.data("a");
        java.lang.String str6 = character5.toString();
        java.lang.String str7 = character5.tokenType();
        boolean boolean8 = character5.isEndTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        startTag0.appendAttributeValue('a');
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes18 = startTag0.getAttributes();
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
        org.jsoup.parser.Token.StartTag startTag41 = startTag0.nameAttr("<Character>", attributes39);
        startTag0.normalName = "<<<hi!>>>";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag41);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        startTag0.appendAttributeValue("Commentcomment");
        startTag0.appendAttributeName("commentcomment");
        org.jsoup.nodes.Attributes attributes15 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes16 = startTag0.attributes;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getName();
        java.lang.StringBuilder stringBuilder6 = doctype2.name;
        boolean boolean7 = doctype2.isForceQuirks();
        java.lang.String str8 = doctype2.getName();
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.Class<?> wildcardClass5 = doctype0.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getName();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendTagName("");
        java.lang.String str35 = startTag32.tagName;
        startTag32.normalName = "Doctype";
        startTag32.appendAttributeValue("Commentcomment");
        org.jsoup.nodes.Attributes attributes40 = startTag32.getAttributes();
        org.jsoup.nodes.Attributes attributes41 = startTag32.attributes;
        startTag0.attributes = attributes41;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("");
        tag12.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character2.getData();
        boolean boolean4 = character2.isEndTag();
        java.lang.String str5 = character2.toString();
        java.lang.String str6 = character2.getData();
        java.lang.String str7 = character2.toString();
        org.jsoup.parser.Token.Character character9 = character2.data("");
        boolean boolean10 = character9.isEndTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character2.getData();
        boolean boolean4 = character2.isEndTag();
        java.lang.String str5 = character2.toString();
        org.jsoup.parser.Token.Character character7 = character2.data("commentcomment#");
        org.jsoup.parser.Token token8 = character7.reset();
        org.jsoup.parser.Token token9 = character7.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "hi!";
        java.lang.String str8 = doctype2.tokenType();
        boolean boolean9 = doctype2.isEOF();
        org.jsoup.parser.Token token10 = doctype2.reset();
        boolean boolean11 = token10.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        org.jsoup.nodes.Attributes attributes15 = startTag0.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag16 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        java.lang.String str14 = startTag0.tagName;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        java.lang.String str3 = comment2.toString();
        org.jsoup.parser.Token token4 = comment2.reset();
        java.lang.String str5 = comment2.toString();
        comment2.bogus = false;
        boolean boolean8 = comment2.bogus;
        org.jsoup.parser.Token.TokenType tokenType9 = comment2.type;
        comment0.type = tokenType9;
        boolean boolean11 = comment0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        startTag11.appendAttributeName(" ");
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
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = startTag22.attributes;
        startTag19.attributes = attributes23;
        startTag16.attributes = attributes23;
        startTag16.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        java.lang.String str31 = startTag28.tagName;
        int[] intArray33 = new int[] { 0 };
        startTag28.appendAttributeValue(intArray33);
        startTag16.appendAttributeValue(intArray33);
        startTag0.appendAttributeValue(intArray33);
        startTag0.appendAttributeValue("Comment");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        startTag0.appendAttributeValue("Commentcomment");
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
        tag25.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        char[] charArray29 = new char[] {};
        startTag28.appendAttributeValue(charArray29);
        org.jsoup.nodes.Attributes attributes31 = startTag28.getAttributes();
        boolean boolean32 = startTag28.isComment();
        startTag28.appendAttributeName("Comment");
        startTag28.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes37 = startTag28.attributes;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        startTag28.appendAttributeValue(charArray39);
        tag25.appendAttributeValue(charArray39);
        startTag0.appendAttributeValue(charArray39);
        java.lang.String str44 = startTag0.tokenType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "StartTag" + "'", str44, "StartTag");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character44 = startTag11.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.appendAttributeName("<4>");
        java.lang.String str8 = startTag0.toString();
        startTag0.tagName = "commentcomment";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<#>" + "'", str8, "<#>");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        startTag11.tagName = "<Comment>";
        startTag11.appendAttributeName('4');
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
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        boolean boolean7 = startTag0.selfClosing;
        java.lang.String str8 = startTag0.tokenType();
        startTag0.appendAttributeName('4');
        startTag0.appendAttributeName("<<!---->>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        java.lang.String str4 = doctype2.getPublicIdentifier();
        java.lang.String str5 = doctype2.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        boolean boolean36 = startTag0.isDoctype();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token token8 = comment0.reset();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        boolean boolean10 = comment0.bogus;
        boolean boolean11 = comment0.bogus;
        boolean boolean12 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        java.lang.String str5 = character2.toString();
        java.lang.String str6 = character2.toString();
        java.lang.String str7 = character2.toString();
        org.jsoup.parser.Token.Character character8 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token9 = character8.reset();
        boolean boolean10 = character8.isEndTag();
        org.jsoup.parser.Token token11 = character8.reset();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.EOF;
        character8.type = tokenType12;
        character2.type = tokenType12;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!>" + "'", str7, "<hi!>");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.forceQuirks;
        doctype0.pubSysKey = "";
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        java.lang.String str11 = startTag0.toString();
        startTag0.appendTagName(' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<#>" + "'", str11, "<#>");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        comment0.bogus = true;
        java.lang.String str7 = comment0.toString();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        startTag0.appendTagName('#');
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        startTag7.appendAttributeName("hi!");
        startTag7.appendAttributeName('a');
        java.lang.String str14 = startTag7.normalName;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        startTag16.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes20 = startTag16.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = startTag7.nameAttr("<!---->", attributes20);
        startTag0.attributes = attributes20;
        org.jsoup.nodes.Attributes attributes23 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag25.newAttribute();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        char[] charArray29 = new char[] {};
        startTag28.appendAttributeValue(charArray29);
        startTag28.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag34 = startTag28.name("Comment");
        startTag28.appendTagName("comment");
        java.lang.String str37 = startTag28.normalName();
        char[] charArray40 = new char[] { '4', '#' };
        startTag28.appendAttributeValue(charArray40);
        startTag25.appendAttributeValue(charArray40);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        startTag44.appendTagName("");
        java.lang.String str47 = startTag44.tagName;
        startTag44.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = startTag50.attributes;
        startTag50.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes54 = startTag50.getAttributes();
        org.jsoup.parser.Token.StartTag startTag55 = startTag44.nameAttr("", attributes54);
        org.jsoup.parser.Token.StartTag startTag56 = startTag25.nameAttr("#", attributes54);
        org.jsoup.nodes.Attributes attributes57 = startTag25.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = startTag0.nameAttr("#", attributes57);
        boolean boolean59 = startTag58.isStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "commentcomment" + "'", str37, "commentcomment");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        java.lang.String str18 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.asStartTag();
        java.lang.String str20 = startTag0.normalName();
        startTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>" + "'", str18, "<hi!>");
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!>" + "'", str20, "<hi!>");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        startTag0.appendAttributeValue("commenta");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        tag12.normalName = "<<<!---->>>";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        org.jsoup.parser.Token token11 = comment0.reset();
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
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.pubSysKey;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = startTag22.attributes;
        startTag19.attributes = attributes23;
        startTag16.attributes = attributes23;
        startTag16.selfClosing = false;
        startTag16.appendAttributeName('4');
        startTag16.newAttribute();
        startTag16.selfClosing = false;
        startTag16.selfClosing = true;
        org.jsoup.parser.Token token35 = startTag16.reset();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        startTag37.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        char[] charArray41 = new char[] {};
        startTag40.appendAttributeValue(charArray41);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = startTag43.attributes;
        startTag40.attributes = attributes44;
        startTag37.attributes = attributes44;
        startTag37.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        startTag50.appendTagName("");
        org.jsoup.nodes.Attributes attributes53 = null;
        startTag50.attributes = attributes53;
        org.jsoup.parser.Token.Tag tag55 = startTag50.reset();
        org.jsoup.nodes.Attributes attributes56 = startTag50.attributes;
        org.jsoup.parser.Token.StartTag startTag57 = startTag37.nameAttr("StartTag", attributes56);
        org.jsoup.parser.Token.StartTag startTag58 = startTag16.nameAttr("Commentcomment", attributes56);
        org.jsoup.parser.Token.StartTag startTag59 = startTag11.nameAttr("commentcomment", attributes56);
        startTag59.appendAttributeName('4');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(token35);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag59);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = startTag27.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        org.jsoup.parser.Token.Character character4 = character0.data("#");
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("commentcomment");
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        org.jsoup.parser.Token token10 = startTag0.reset();
        startTag0.appendTagName("<Commentcomment>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendTagName("");
        java.lang.String str16 = startTag13.tagName;
        startTag13.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = startTag19.attributes;
        startTag19.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes23 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag24 = startTag13.nameAttr("", attributes23);
        startTag11.attributes = attributes23;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = startTag11.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        java.lang.String str7 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        startTag9.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes13 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.nameAttr("<!---->", attributes13);
        startTag14.appendTagName('4');
        startTag14.appendTagName("<#>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        tag13.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        startTag0.normalName = "Comment";
        java.lang.String str6 = startTag0.tokenType();
        java.lang.String str7 = startTag0.normalName();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        tag6.newAttribute();
        tag6.tagName = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        startTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character24 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        java.lang.String str53 = startTag0.toString();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        startTag55.appendTagName("");
        java.lang.String str58 = startTag55.tagName;
        org.jsoup.parser.Token.Tag tag59 = startTag55.reset();
        boolean boolean60 = startTag55.isComment();
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        char[] charArray62 = new char[] {};
        startTag61.appendAttributeValue(charArray62);
        startTag61.setEmptyAttributeValue();
        startTag61.normalName = "Comment";
        startTag61.appendAttributeName(' ');
        org.jsoup.nodes.Attributes attributes69 = startTag61.getAttributes();
        startTag55.attributes = attributes69;
        org.jsoup.parser.Token.StartTag startTag71 = startTag0.nameAttr("<a>", attributes69);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<<<hi!>>>" + "'", str53, "<<<hi!>>>");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertNotNull(startTag71);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        java.lang.String str11 = tag7.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        java.lang.String str7 = startTag0.normalName;
        boolean boolean8 = startTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype74 = tag7.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        doctype0.pubSysKey = "<Commentcomment#>";
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        startTag0.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        int[] intArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            startTag0.appendAttributeValue(intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        org.jsoup.nodes.Attributes attributes10 = startTag0.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment4.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        org.jsoup.parser.Token token3 = token1.reset();
        org.jsoup.parser.Token token4 = token1.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        boolean boolean7 = startTag0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        java.lang.String str6 = character0.toString();
        java.lang.String str7 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#" + "'", str7, "#");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.forceQuirks;
        boolean boolean10 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        org.jsoup.parser.Token token5 = character2.reset();
        org.jsoup.parser.Token.Character character7 = character2.data("<hi!>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(character7);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.bogus;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        boolean boolean8 = comment0.isEOF();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = tag4.isDoctype();
        boolean boolean6 = tag4.selfClosing;
        tag4.selfClosing = true;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        comment0.bogus = false;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        boolean boolean15 = startTag0.isEndTag();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        startTag16.tagName = "Commentcomment";
        org.jsoup.nodes.Attributes attributes21 = startTag16.attributes;
        startTag0.attributes = attributes21;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        tag5.appendAttributeValue(intArray42);
        boolean boolean48 = tag5.selfClosing;
        tag5.appendTagName('a');
        org.jsoup.nodes.Attributes attributes51 = tag5.getAttributes();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(attributes51);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        java.lang.String str5 = character4.getData();
        java.lang.String str6 = character4.getData();
        boolean boolean7 = character4.isComment();
        org.jsoup.parser.Token token8 = character4.reset();
        org.jsoup.parser.Token token9 = character4.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Comment" + "'", str6, "Comment");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName("<!---->");
        startTag0.setEmptyAttributeValue();
        startTag0.selfClosing = true;
        boolean boolean10 = startTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            startTag0.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        tag7.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes50 = tag7.getAttributes();
        boolean boolean51 = tag7.isStartTag();
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
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        org.jsoup.nodes.Attributes attributes22 = null;
        startTag19.attributes = attributes22;
        org.jsoup.parser.Token.Tag tag24 = startTag19.reset();
        org.jsoup.nodes.Attributes attributes25 = startTag19.attributes;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        char[] charArray30 = new char[] {};
        startTag29.appendAttributeValue(charArray30);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = startTag32.attributes;
        startTag29.attributes = attributes33;
        startTag26.attributes = attributes33;
        startTag26.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName("");
        java.lang.String str41 = startTag38.tagName;
        int[] intArray43 = new int[] { 0 };
        startTag38.appendAttributeValue(intArray43);
        startTag26.appendAttributeValue(intArray43);
        startTag19.appendAttributeValue(intArray43);
        startTag18.appendAttributeValue(intArray43);
        boolean boolean48 = startTag18.isCharacter();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        boolean boolean17 = startTag0.isSelfClosing();
        startTag0.appendTagName('a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        startTag0.appendAttributeName("commentcomment");
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        char[] charArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            startTag0.appendAttributeValue(charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        startTag11.appendAttributeValue('#');
        boolean boolean15 = startTag11.isDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        boolean boolean11 = doctype0.isStartTag();
        java.lang.String str12 = doctype0.getPubSysKey();
        boolean boolean13 = doctype0.isForceQuirks();
        java.lang.String str14 = doctype0.getPubSysKey();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        startTag0.setEmptyAttributeValue();
        startTag0.setEmptyAttributeValue();
        startTag0.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        startTag24.appendTagName("<<Commentcomment>>");
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
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        org.jsoup.nodes.Attributes attributes16 = tag14.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag17 = tag14.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = true;
        java.lang.String str10 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        org.jsoup.parser.Token.Tag tag39 = startTag37.name("comment");
        boolean boolean40 = tag39.isSelfClosing();
        boolean boolean41 = tag39.isSelfClosing();
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
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        boolean boolean8 = comment0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        org.jsoup.parser.Token token5 = character2.reset();
        java.lang.String str6 = character2.toString();
        org.jsoup.parser.Token.Character character8 = character2.data("");
        org.jsoup.parser.Token.Character character10 = character2.data("4");
        java.lang.String str11 = character10.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("#");
        boolean boolean5 = character4.isCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token token7 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        boolean boolean8 = comment0.bogus;
        java.lang.String str9 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.String str19 = tag18.normalName;
        org.jsoup.parser.Token.Tag tag20 = tag18.reset();
        tag20.appendAttributeName('#');
        tag20.tagName = "hi!";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.lang.String str14 = startTag0.normalName();
        startTag0.normalName = "";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.pubSysKey;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        doctype0.pubSysKey = "<Doctype>";
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        startTag0.appendTagName(' ');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        startTag0.newAttribute();
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
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        org.jsoup.parser.Token token6 = doctype0.reset();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        boolean boolean6 = doctype0.isDoctype();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        org.jsoup.parser.Token.Tag tag24 = startTag0.reset();
        tag24.newAttribute();
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
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.Class<?> wildcardClass81 = startTag0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        startTag11.appendAttributeValue('#');
        startTag11.tagName = "#";
        startTag11.finaliseTag();
        startTag11.newAttribute();
        startTag11.selfClosing = true;
        java.lang.Class<?> wildcardClass21 = startTag11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        boolean boolean5 = startTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token token6 = doctype0.reset();
        boolean boolean7 = token6.isEndTag();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        startTag0.finaliseTag();
        startTag0.newAttribute();
        startTag0.appendAttributeValue('a');
        startTag0.appendTagName(' ');
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.asStartTag();
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        tag8.appendTagName('4');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        java.lang.String str18 = startTag15.tagName;
        startTag15.appendAttributeName("hi!");
        boolean boolean21 = startTag15.isSelfClosing();
        org.jsoup.parser.Token.Tag tag22 = startTag15.reset();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        char[] charArray24 = new char[] {};
        startTag23.appendAttributeValue(charArray24);
        startTag23.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag29 = startTag23.name("Comment");
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName("");
        org.jsoup.nodes.Attributes attributes33 = null;
        startTag30.attributes = attributes33;
        startTag30.appendTagName("");
        java.lang.String str37 = startTag30.tagName;
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
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        startTag50.appendTagName("");
        java.lang.String str53 = startTag50.tagName;
        int[] intArray55 = new int[] { 0 };
        startTag50.appendAttributeValue(intArray55);
        startTag38.appendAttributeValue(intArray55);
        startTag30.appendAttributeValue(intArray55);
        tag29.appendAttributeValue(intArray55);
        tag22.appendAttributeValue(intArray55);
        org.jsoup.parser.Token.Tag tag62 = tag22.name("<hi!>");
        org.jsoup.nodes.Attributes attributes63 = tag22.getAttributes();
        startTag0.attributes = attributes63;
        startTag0.appendAttributeName('#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(attributes63);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        startTag0.appendAttributeValue("Doctype");
        startTag0.appendAttributeName("#");
        org.jsoup.parser.Token token11 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes12 = startTag0.attributes;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.tokenType();
        doctype0.pubSysKey = "<Commentcomment#>";
        boolean boolean10 = doctype0.isCharacter();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        java.lang.String str8 = startTag0.normalName();
        boolean boolean9 = startTag0.selfClosing;
        startTag0.appendAttributeName("");
        startTag0.appendAttributeValue("Comment");
        java.lang.String str14 = startTag0.name();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "comment" + "'", str8, "comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Comment" + "'", str14, "Comment");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        org.jsoup.parser.Token token4 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token6 = doctype5.reset();
        java.lang.String str7 = doctype5.getPubSysKey();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        startTag8.appendAttributeValue("hi!");
        startTag8.tagName = "Comment";
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName("");
        org.jsoup.nodes.Attributes attributes20 = null;
        startTag17.attributes = attributes20;
        org.jsoup.parser.Token.Tag tag22 = startTag17.reset();
        org.jsoup.parser.Token.TokenType tokenType23 = tag22.type;
        startTag8.type = tokenType23;
        doctype5.type = tokenType23;
        token4.type = tokenType23;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        boolean boolean3 = startTag0.isDoctype();
        startTag0.appendTagName('a');
        startTag0.newAttribute();
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
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.String str23 = comment22.tokenType();
        boolean boolean24 = comment22.isComment();
        java.lang.StringBuilder stringBuilder25 = comment22.data;
        java.lang.StringBuilder stringBuilder26 = comment22.data;
        boolean boolean27 = comment22.isCharacter();
        java.lang.StringBuilder stringBuilder28 = comment22.data;
        org.jsoup.parser.Token.TokenType tokenType29 = comment22.type;
        startTag8.type = tokenType29;
        boolean boolean31 = startTag8.isCharacter();
        org.jsoup.nodes.Attributes attributes32 = startTag8.attributes;
        org.jsoup.nodes.Attributes attributes33 = startTag8.attributes;
        org.jsoup.parser.Token.StartTag startTag34 = startTag0.nameAttr("<Comment>", attributes33);
        org.jsoup.parser.Token.TokenType tokenType35 = startTag0.type;
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Comment" + "'", str23, "Comment");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("comment");
        java.lang.String str7 = character4.toString();
        java.lang.String str8 = character4.getData();
        java.lang.String str9 = character4.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag10 = character4.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "comment" + "'", str7, "comment");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "comment" + "'", str8, "comment");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "comment" + "'", str9, "comment");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.pubSysKey = "<Commentcomment>";
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.tokenType();
        org.jsoup.parser.Token.Character character5 = character0.data("hi!");
        java.lang.String str6 = character0.toString();
        java.lang.String str7 = character0.getData();
        java.lang.String str8 = character0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        startTag0.appendAttributeValue("Comment");
        boolean boolean12 = startTag0.isStartTag();
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        org.jsoup.parser.Token.TokenType tokenType52 = tag51.type;
        boolean boolean53 = tag51.isDoctype();
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
        org.junit.Assert.assertTrue("'" + tokenType52 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType52.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        startTag0.appendAttributeValue("Doctype");
        startTag0.appendAttributeName(' ');
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
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isEndTag();
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.jsoup.parser.Token token9 = token8.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = startTag11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.String str3 = doctype0.getPubSysKey();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("comment");
        java.lang.String str7 = character4.toString();
        org.jsoup.parser.Token token8 = character4.reset();
        java.lang.String str9 = character4.getData();
        java.lang.String str10 = character4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "comment" + "'", str7, "comment");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.pubSysKey;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
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
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        startTag0.appendAttributeValue('a');
        java.lang.String str10 = startTag0.normalName();
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType12 = startTag0.type;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendAttributeValue('#');
        tag7.finaliseTag();
        tag7.appendTagName(' ');
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isCharacter();
        boolean boolean4 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.StringBuilder stringBuilder11 = doctype2.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.appendAttributeName('4');
        java.lang.String str11 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character12 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        java.lang.String str6 = startTag0.tokenType();
        boolean boolean7 = startTag0.isStartTag();
        boolean boolean8 = startTag0.isEndTag();
        boolean boolean9 = startTag0.isEndTag();
        java.lang.String str10 = startTag0.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.TokenType tokenType1 = character0.type;
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data(" ");
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token.Character character7 = character0.data(" ");
        java.lang.String str8 = character7.getData();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag6.normalName = "hi!";
        startTag6.appendTagName("");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getSystemIdentifier();
        java.lang.String str6 = doctype2.getSystemIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] {};
        startTag9.appendAttributeValue(charArray10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = startTag12.attributes;
        startTag9.attributes = attributes13;
        startTag6.attributes = attributes13;
        java.lang.String str16 = startTag6.normalName;
        org.jsoup.parser.Token.Tag tag17 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag18 = startTag6.reset();
        startTag6.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        org.jsoup.nodes.Attributes attributes23 = startTag21.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = startTag6.nameAttr("", attributes23);
        startTag0.attributes = attributes23;
        startTag0.appendTagName("<comment>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("a");
        org.jsoup.parser.Token token5 = character4.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        boolean boolean9 = tag8.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            tag8.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        startTag11.appendTagName("<4>");
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
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendAttributeValue('#');
        boolean boolean10 = tag7.isEOF();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag8 = tag7.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = tag7.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        char[] charArray33 = new char[] {};
        startTag32.appendAttributeValue(charArray33);
        org.jsoup.nodes.Attributes attributes35 = startTag32.getAttributes();
        boolean boolean36 = startTag32.isComment();
        startTag32.appendAttributeName("Comment");
        startTag32.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes41 = startTag32.attributes;
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        char[] charArray43 = new char[] {};
        startTag42.appendAttributeValue(charArray43);
        startTag32.appendAttributeValue(charArray43);
        startTag11.appendAttributeValue(charArray43);
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
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = tag7.asStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        org.jsoup.parser.Token token5 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        tag10.appendAttributeName('#');
        org.jsoup.parser.Token token13 = tag10.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        startTag27.setEmptyAttributeValue();
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        startTag0.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        boolean boolean7 = startTag0.selfClosing;
        java.lang.String str8 = startTag0.tokenType();
        startTag0.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        startTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag14.reset();
        org.jsoup.nodes.Attributes attributes16 = startTag14.attributes;
        startTag14.appendTagName('#');
        startTag14.appendAttributeName('a');
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        char[] charArray22 = new char[] {};
        startTag21.appendAttributeValue(charArray22);
        startTag21.appendAttributeName("hi!");
        startTag21.appendAttributeName('a');
        java.lang.String str28 = startTag21.normalName;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        startTag30.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes34 = startTag30.getAttributes();
        org.jsoup.parser.Token.StartTag startTag35 = startTag21.nameAttr("<!---->", attributes34);
        startTag14.attributes = attributes34;
        org.jsoup.nodes.Attributes attributes37 = startTag14.attributes;
        org.jsoup.parser.Token.StartTag startTag38 = startTag0.nameAttr("a", attributes37);
        boolean boolean39 = startTag38.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.jsoup.parser.Token.StartTag startTag44 = startTag11.asStartTag();
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
        org.junit.Assert.assertNotNull(startTag44);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        boolean boolean5 = doctype2.forceQuirks;
        java.lang.String str6 = doctype2.tokenType();
        doctype2.forceQuirks = false;
        java.lang.StringBuilder stringBuilder9 = doctype2.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.normalName = "<Commentcomment#>";
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("<Commentcomment#>");
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag15 = startTag0.name("<<Commentcomment>>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes9 = tag8.attributes;
        org.jsoup.parser.Token.Tag tag10 = tag8.reset();
        org.jsoup.parser.Token token11 = tag8.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        boolean boolean23 = tag18.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendTagName("");
        org.jsoup.nodes.Attributes attributes16 = null;
        startTag13.attributes = attributes16;
        org.jsoup.parser.Token.Tag tag18 = startTag13.reset();
        org.jsoup.nodes.Attributes attributes19 = startTag13.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = startTag0.nameAttr("StartTag", attributes19);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        char[] charArray22 = new char[] {};
        startTag21.appendAttributeValue(charArray22);
        org.jsoup.nodes.Attributes attributes24 = startTag21.getAttributes();
        startTag21.appendTagName('#');
        startTag21.finaliseTag();
        boolean boolean28 = startTag21.isSelfClosing();
        org.jsoup.nodes.Attributes attributes29 = startTag21.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag31 = startTag30.reset();
        org.jsoup.nodes.Attributes attributes32 = startTag30.attributes;
        startTag21.attributes = attributes32;
        startTag0.attributes = attributes32;
        startTag0.tagName = "<hi!>";
        java.lang.String str37 = startTag0.tagName;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<hi!>" + "'", str37, "<hi!>");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = startTag22.attributes;
        startTag19.attributes = attributes23;
        startTag16.attributes = attributes23;
        startTag16.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        java.lang.String str31 = startTag28.tagName;
        int[] intArray33 = new int[] { 0 };
        startTag28.appendAttributeValue(intArray33);
        startTag16.appendAttributeValue(intArray33);
        startTag0.appendAttributeValue(intArray33);
        java.lang.String str37 = startTag0.normalName;
        org.jsoup.parser.Token.TokenType tokenType38 = startTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype39 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        startTag0.appendTagName("<<<hi!>>>");
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
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName("Comment");
        startTag0.finaliseTag();
        startTag0.appendTagName('a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.tokenType();
        boolean boolean16 = comment14.isComment();
        java.lang.StringBuilder stringBuilder17 = comment14.data;
        java.lang.StringBuilder stringBuilder18 = comment14.data;
        boolean boolean19 = comment14.isCharacter();
        java.lang.StringBuilder stringBuilder20 = comment14.data;
        org.jsoup.parser.Token.TokenType tokenType21 = comment14.type;
        startTag0.type = tokenType21;
        startTag0.appendTagName('4');
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.TokenType tokenType26 = character25.type;
        startTag0.type = tokenType26;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Comment" + "'", str15, "Comment");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token token8 = comment0.reset();
        boolean boolean9 = comment0.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        org.jsoup.parser.Token.StartTag startTag27 = startTag15.asStartTag();
        startTag15.appendAttributeValue(' ');
        boolean boolean30 = startTag15.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        startTag15.appendAttributeValue(charArray32);
        startTag11.appendAttributeValue(charArray32);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        startTag11.appendAttributeValue("commentcomment");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = startTag11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        org.jsoup.nodes.Attributes attributes16 = startTag0.attributes;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        org.jsoup.parser.Token.Tag tag39 = startTag37.name("comment");
        boolean boolean40 = tag39.isSelfClosing();
        org.jsoup.parser.Token.Tag tag41 = tag39.reset();
        org.jsoup.nodes.Attributes attributes42 = tag39.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character43 = tag39.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        boolean boolean5 = startTag0.isEOF();
        startTag0.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token9 = doctype8.reset();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str11 = doctype10.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType14 = doctype12.type;
        doctype10.type = tokenType14;
        doctype8.type = tokenType14;
        startTag0.type = tokenType14;
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
        startTag18.appendAttributeName('4');
        startTag18.newAttribute();
        startTag18.selfClosing = false;
        org.jsoup.parser.Token.Tag tag35 = startTag18.reset();
        tag35.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        org.jsoup.nodes.Attributes attributes41 = startTag38.getAttributes();
        boolean boolean42 = startTag38.isComment();
        startTag38.appendAttributeName("Comment");
        startTag38.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes47 = startTag38.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        char[] charArray49 = new char[] {};
        startTag48.appendAttributeValue(charArray49);
        startTag38.appendAttributeValue(charArray49);
        tag35.appendAttributeValue(charArray49);
        startTag0.appendAttributeValue(charArray49);
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag55 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.asStartTag();
        startTag0.setEmptyAttributeValue();
        boolean boolean11 = startTag0.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        startTag0.tagName = " ";
        boolean boolean5 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        startTag0.appendAttributeValue("#");
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
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        boolean boolean5 = startTag0.isSelfClosing();
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes7 = startTag0.attributes;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        boolean boolean3 = startTag0.isComment();
        startTag0.appendAttributeValue(' ');
        boolean boolean6 = startTag0.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        startTag0.appendAttributeValue("Commentcomment");
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token token11 = startTag0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        boolean boolean23 = startTag0.isEndTag();
        startTag0.normalName = "StartTag";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        boolean boolean5 = startTag0.isSelfClosing();
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        boolean boolean7 = startTag0.isStartTag();
        org.jsoup.parser.Token token8 = startTag0.reset();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.normalName = "Doctype";
        startTag0.appendAttributeValue("Commentcomment");
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
        tag25.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        char[] charArray29 = new char[] {};
        startTag28.appendAttributeValue(charArray29);
        org.jsoup.nodes.Attributes attributes31 = startTag28.getAttributes();
        boolean boolean32 = startTag28.isComment();
        startTag28.appendAttributeName("Comment");
        startTag28.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes37 = startTag28.attributes;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        startTag28.appendAttributeValue(charArray39);
        tag25.appendAttributeValue(charArray39);
        startTag0.appendAttributeValue(charArray39);
        org.jsoup.nodes.Attributes attributes44 = startTag0.attributes;
        java.lang.String str45 = startTag0.normalName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Doctype" + "'", str45, "Doctype");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        org.jsoup.parser.Token.StartTag startTag28 = startTag27.asStartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
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
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        java.lang.Class<?> wildcardClass9 = character6.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        tag6.appendTagName('a');
        tag6.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        startTag0.selfClosing = false;
        java.lang.String str34 = startTag0.name();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "StartTag" + "'", str34, "StartTag");
    }
}

