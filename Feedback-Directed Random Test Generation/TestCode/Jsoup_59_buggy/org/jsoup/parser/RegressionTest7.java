package org.jsoup.parser;

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
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype5.getName();
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.String str8 = doctype5.pubSysKey;
        boolean boolean9 = doctype5.isForceQuirks();
        java.lang.String str10 = doctype5.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        startTag0.appendAttributeName("<a>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendTagName("");
        java.lang.String str24 = startTag21.tagName;
        startTag21.appendAttributeName("hi!");
        startTag21.appendTagName('#');
        startTag21.appendAttributeValue('a');
        java.lang.String str31 = startTag21.normalName();
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
        startTag21.appendAttributeValue(charArray60);
        startTag0.appendAttributeValue(charArray60);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#" + "'", str31, "#");
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
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.isCharacter();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = startTag8.attributes;
        startTag8.tagName = "hi!";
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.TokenType tokenType13 = character12.type;
        startTag8.type = tokenType13;
        comment0.type = tokenType13;
        boolean boolean16 = comment0.isStartTag();
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
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        java.lang.String str54 = startTag0.toString();
        org.jsoup.nodes.Attributes attributes55 = startTag0.getAttributes();
        boolean boolean56 = startTag0.selfClosing;
        boolean boolean57 = startTag0.isSelfClosing();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<Commentcomment>" + "'", str54, "<Commentcomment>");
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        java.lang.String str5 = character4.toString();
        java.lang.String str6 = character4.getData();
        java.lang.String str7 = character4.getData();
        java.lang.String str8 = character4.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Character" + "'", str6, "Character");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Character" + "'", str8, "Character");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        startTag0.appendAttributeValue("<#>");
        startTag0.finaliseTag();
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
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token token10 = character8.reset();
        java.lang.String str11 = character8.toString();
        org.jsoup.parser.Token.Character character12 = character8.asCharacter();
        boolean boolean13 = character8.isStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        startTag11.tagName = "<<<hi!>>>";
        startTag11.appendTagName("Doctype");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        startTag0.appendAttributeValue("<!---->");
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        char[] charArray16 = new char[] {};
        startTag15.appendAttributeValue(charArray16);
        org.jsoup.nodes.Attributes attributes18 = startTag15.getAttributes();
        boolean boolean19 = startTag15.isComment();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag15.type;
        startTag15.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag23 = startTag15.asStartTag();
        org.jsoup.parser.Token.Tag tag25 = startTag15.name("<hi!>");
        org.jsoup.nodes.Attributes attributes26 = startTag15.attributes;
        boolean boolean27 = startTag15.isSelfClosing();
        java.lang.String str28 = startTag15.tagName;
        boolean boolean29 = startTag15.isComment();
        org.jsoup.nodes.Attributes attributes30 = startTag15.attributes;
        org.jsoup.parser.Token.StartTag startTag31 = startTag0.nameAttr("</commentcomment#>", attributes30);
        java.lang.Class<?> wildcardClass32 = startTag31.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi!>" + "'", str28, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        java.lang.String str17 = token16.tokenType();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.tagName = "Comment";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        org.jsoup.nodes.Attributes attributes12 = null;
        startTag9.attributes = attributes12;
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.parser.Token.TokenType tokenType15 = tag14.type;
        startTag0.type = tokenType15;
        java.lang.String str17 = startTag0.tagName;
        java.lang.String str18 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes19 = startTag0.attributes;
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Comment" + "'", str17, "Comment");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Comment" + "'", str18, "Comment");
        org.junit.Assert.assertNull(attributes19);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        startTag0.normalName = "EOF";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.pubSysKey;
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.String str3 = doctype0.getPubSysKey();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = doctype0.type;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        tag24.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character27 = tag24.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        boolean boolean5 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.forceQuirks;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isDoctype();
        boolean boolean10 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        startTag0.appendAttributeName('4');
        startTag0.appendAttributeValue('#');
        java.lang.String str39 = startTag0.normalName();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "starttag" + "'", str39, "starttag");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        org.jsoup.parser.Token.TokenType tokenType8 = doctype2.type;
        java.lang.String str9 = doctype2.getName();
        java.lang.StringBuilder stringBuilder10 = doctype2.name;
        org.jsoup.parser.Token.reset(stringBuilder10);
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        boolean boolean13 = comment0.bogus;
        java.lang.String str14 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        startTag11.newAttribute();
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
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.nodes.Attributes attributes12 = startTag11.attributes;
        boolean boolean13 = startTag11.isCharacter();
        startTag11.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        java.lang.String str19 = startTag16.tagName;
        startTag16.normalName = "Doctype";
        org.jsoup.parser.Token.Tag tag22 = startTag16.reset();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendTagName("");
        org.jsoup.nodes.Attributes attributes26 = null;
        startTag23.attributes = attributes26;
        org.jsoup.parser.Token.Tag tag28 = startTag23.reset();
        org.jsoup.nodes.Attributes attributes29 = tag28.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        tag28.appendAttributeValue(charArray31);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        char[] charArray35 = new char[] {};
        startTag34.appendAttributeValue(charArray35);
        org.jsoup.nodes.Attributes attributes37 = startTag34.getAttributes();
        boolean boolean38 = startTag34.isComment();
        org.jsoup.parser.Token.TokenType tokenType39 = startTag34.type;
        org.jsoup.parser.Token.Tag tag40 = startTag34.reset();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        startTag41.appendTagName("");
        org.jsoup.nodes.Attributes attributes44 = null;
        startTag41.attributes = attributes44;
        org.jsoup.parser.Token.Tag tag46 = startTag41.reset();
        org.jsoup.nodes.Attributes attributes47 = startTag41.attributes;
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
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        startTag60.appendTagName("");
        java.lang.String str63 = startTag60.tagName;
        int[] intArray65 = new int[] { 0 };
        startTag60.appendAttributeValue(intArray65);
        startTag48.appendAttributeValue(intArray65);
        startTag41.appendAttributeValue(intArray65);
        tag40.appendAttributeValue(intArray65);
        tag28.appendAttributeValue(intArray65);
        tag22.appendAttributeValue(intArray65);
        startTag11.appendAttributeValue(intArray65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 0 });
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        org.jsoup.parser.Token token16 = startTag0.reset();
        startTag0.normalName = " ";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertNotNull(token16);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.String str3 = doctype0.getPubSysKey();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        doctype0.pubSysKey = "commenta";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character2.getData();
        org.jsoup.parser.Token.Character character5 = character2.data("<<!---->>");
        java.lang.String str6 = character2.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<<!---->>" + "'", str6, "<<!---->>");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        java.lang.StringBuilder stringBuilder11 = comment0.data;
        java.lang.String str12 = comment0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Comment" + "'", str12, "Comment");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        boolean boolean90 = startTag89.isSelfClosing();
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
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        java.lang.String str66 = startTag0.normalName();
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        org.jsoup.nodes.Attributes attributes34 = startTag33.getAttributes();
        org.jsoup.nodes.Attributes attributes35 = startTag33.getAttributes();
        java.lang.String str36 = startTag33.toString();
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
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<Comment>" + "'", str36, "<Comment>");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        java.lang.String str15 = startTag11.tagName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        boolean boolean10 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.TokenType tokenType13 = startTag0.type;
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        java.lang.String str12 = doctype2.pubSysKey;
        org.jsoup.parser.Token.EOF eOF13 = new org.jsoup.parser.Token.EOF();
        boolean boolean14 = eOF13.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType15 = eOF13.type;
        doctype2.type = tokenType15;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        boolean boolean37 = startTag36.isCharacter();
        startTag36.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        java.lang.String str43 = startTag40.tagName;
        startTag40.setEmptyAttributeValue();
        startTag40.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        char[] charArray48 = new char[] {};
        startTag47.appendAttributeValue(charArray48);
        org.jsoup.nodes.Attributes attributes50 = startTag47.getAttributes();
        boolean boolean51 = startTag47.isComment();
        org.jsoup.parser.Token.TokenType tokenType52 = startTag47.type;
        org.jsoup.parser.Token.Tag tag53 = startTag47.reset();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        startTag54.appendTagName("");
        org.jsoup.nodes.Attributes attributes57 = null;
        startTag54.attributes = attributes57;
        org.jsoup.parser.Token.Tag tag59 = startTag54.reset();
        org.jsoup.nodes.Attributes attributes60 = startTag54.attributes;
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        startTag61.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        char[] charArray65 = new char[] {};
        startTag64.appendAttributeValue(charArray65);
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes68 = startTag67.attributes;
        startTag64.attributes = attributes68;
        startTag61.attributes = attributes68;
        startTag61.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag73 = new org.jsoup.parser.Token.StartTag();
        startTag73.appendTagName("");
        java.lang.String str76 = startTag73.tagName;
        int[] intArray78 = new int[] { 0 };
        startTag73.appendAttributeValue(intArray78);
        startTag61.appendAttributeValue(intArray78);
        startTag54.appendAttributeValue(intArray78);
        tag53.appendAttributeValue(intArray78);
        startTag40.appendAttributeValue(intArray78);
        startTag36.appendAttributeValue(intArray78);
        org.jsoup.nodes.Attributes attributes85 = startTag36.getAttributes();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + tokenType52 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType52.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] {});
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 0 });
        org.junit.Assert.assertNotNull(attributes85);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        startTag0.normalName = "<Comment  hi!=\"<!---->\">";
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        startTag0.finaliseTag();
        boolean boolean15 = startTag0.isCharacter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        boolean boolean16 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        char[] charArray19 = new char[] {};
        startTag18.appendAttributeValue(charArray19);
        startTag18.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag24 = startTag18.name("Comment");
        boolean boolean25 = tag24.selfClosing;
        org.jsoup.nodes.Attributes attributes26 = tag24.attributes;
        org.jsoup.parser.Token.StartTag startTag27 = startTag0.nameAttr("4", attributes26);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag27);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.forceQuirks;
        doctype0.pubSysKey = "a";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        java.lang.String str25 = startTag0.tagName;
        java.lang.String str26 = startTag0.name();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        org.jsoup.parser.Token token4 = doctype0.reset();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        startTag0.finaliseTag();
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
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        java.lang.String str4 = doctype2.getName();
        java.lang.String str5 = doctype2.pubSysKey;
        java.lang.String str6 = doctype2.getName();
        doctype2.pubSysKey = "Comment";
        java.lang.StringBuilder stringBuilder9 = doctype2.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getName();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        boolean boolean15 = startTag11.isStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        java.lang.String str5 = character4.getData();
        org.jsoup.parser.Token.Character character7 = character4.data("Doctype");
        boolean boolean8 = character4.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = character4.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.tokenType();
        java.lang.String str9 = doctype2.getPublicIdentifier();
        java.lang.String str10 = doctype2.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.normalName;
        startTag0.tagName = "StartTag";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isCharacter();
        startTag0.appendAttributeValue('#');
        boolean boolean8 = startTag0.isSelfClosing();
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
        org.jsoup.parser.Token.Tag tag20 = tag14.reset();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        char[] charArray22 = new char[] {};
        startTag21.appendAttributeValue(charArray22);
        startTag21.appendAttributeName("hi!");
        startTag21.appendAttributeName('a');
        java.lang.String str28 = startTag21.normalName;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.nodes.Attributes attributes32 = null;
        startTag29.attributes = attributes32;
        org.jsoup.parser.Token.Tag tag34 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes35 = startTag29.attributes;
        startTag21.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag38 = startTag21.name("<hi!>");
        boolean boolean39 = tag38.isDoctype();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        org.jsoup.nodes.Attributes attributes43 = null;
        startTag40.attributes = attributes43;
        startTag40.newAttribute();
        org.jsoup.nodes.Attributes attributes46 = startTag40.getAttributes();
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
        startTag47.appendAttributeName('4');
        startTag47.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes63 = startTag47.attributes;
        startTag40.attributes = attributes63;
        tag38.attributes = attributes63;
        tag14.attributes = attributes63;
        startTag0.attributes = attributes63;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(attributes63);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        boolean boolean7 = doctype0.isEOF();
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        org.jsoup.parser.Token.TokenType tokenType28 = startTag27.type;
        startTag27.appendAttributeValue('a');
        org.jsoup.parser.Token.Tag tag31 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendTagName("");
        org.jsoup.nodes.Attributes attributes35 = null;
        startTag32.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag37 = startTag32.reset();
        org.jsoup.parser.Token.TokenType tokenType38 = tag37.type;
        org.jsoup.nodes.Attributes attributes39 = tag37.getAttributes();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendTagName("");
        org.jsoup.nodes.Attributes attributes43 = null;
        startTag40.attributes = attributes43;
        org.jsoup.parser.Token.Tag tag45 = startTag40.reset();
        org.jsoup.nodes.Attributes attributes46 = tag45.attributes;
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        char[] charArray48 = new char[] {};
        startTag47.appendAttributeValue(charArray48);
        tag45.appendAttributeValue(charArray48);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        char[] charArray52 = new char[] {};
        startTag51.appendAttributeValue(charArray52);
        org.jsoup.nodes.Attributes attributes54 = startTag51.getAttributes();
        boolean boolean55 = startTag51.isComment();
        org.jsoup.parser.Token.TokenType tokenType56 = startTag51.type;
        org.jsoup.parser.Token.Tag tag57 = startTag51.reset();
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        startTag58.appendTagName("");
        org.jsoup.nodes.Attributes attributes61 = null;
        startTag58.attributes = attributes61;
        org.jsoup.parser.Token.Tag tag63 = startTag58.reset();
        org.jsoup.nodes.Attributes attributes64 = startTag58.attributes;
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        startTag65.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        char[] charArray69 = new char[] {};
        startTag68.appendAttributeValue(charArray69);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes72 = startTag71.attributes;
        startTag68.attributes = attributes72;
        startTag65.attributes = attributes72;
        startTag65.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        startTag77.appendTagName("");
        java.lang.String str80 = startTag77.tagName;
        int[] intArray82 = new int[] { 0 };
        startTag77.appendAttributeValue(intArray82);
        startTag65.appendAttributeValue(intArray82);
        startTag58.appendAttributeValue(intArray82);
        tag57.appendAttributeValue(intArray82);
        tag45.appendAttributeValue(intArray82);
        tag37.appendAttributeValue(intArray82);
        tag31.appendAttributeValue(intArray82);
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
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] {});
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 0 });
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        org.jsoup.parser.Token token5 = character2.reset();
        boolean boolean6 = token5.isEndTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isCharacter();
        startTag0.appendAttributeName("StartTag");
        startTag0.appendAttributeValue(" ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getPubSysKey();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        startTag0.appendAttributeValue("<!---->");
        org.jsoup.nodes.Attributes attributes13 = startTag0.attributes;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.bogus;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.isEOF();
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getPublicIdentifier();
        java.lang.String str10 = doctype8.getPublicIdentifier();
        boolean boolean11 = doctype8.isDoctype();
        java.lang.String str12 = doctype8.getName();
        boolean boolean13 = doctype8.isForceQuirks();
        java.lang.String str14 = doctype8.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype15 = doctype8.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType16 = doctype8.type;
        comment0.type = tokenType16;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        char[] charArray4 = new char[] {};
        startTag3.appendAttributeValue(charArray4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag3.attributes = attributes7;
        startTag0.attributes = attributes7;
        boolean boolean10 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('#');
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        startTag0.appendTagName(' ');
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
        startTag18.appendAttributeName('#');
        java.lang.String str32 = startTag18.normalName;
        org.jsoup.nodes.Attributes attributes33 = startTag18.attributes;
        startTag0.attributes = attributes33;
        startTag0.appendAttributeValue("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character37 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        org.jsoup.parser.Token token5 = doctype2.reset();
        boolean boolean6 = doctype2.isDoctype();
        java.lang.String str7 = doctype2.getPubSysKey();
        java.lang.StringBuilder stringBuilder8 = doctype2.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype2.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        java.lang.String str42 = character0.toString();
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
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        tag2.selfClosing = false;
        tag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag7 = tag2.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = tag7.asStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag9);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        boolean boolean9 = startTag0.isStartTag();
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        startTag0.appendAttributeValue("Comment");
        java.lang.String str12 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag13 = startTag0.reset();
        boolean boolean14 = startTag0.isComment();
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.jsoup.parser.Token.Character character5 = character0.data("commentcomment");
        java.lang.String str6 = character5.tokenType();
        org.jsoup.parser.Token token7 = character5.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Character" + "'", str6, "Character");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("");
        org.jsoup.parser.Token.Tag tag17 = startTag11.reset();
        boolean boolean18 = startTag11.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        startTag19.appendAttributeName("hi!");
        boolean boolean25 = startTag19.isSelfClosing();
        org.jsoup.parser.Token.Tag tag26 = startTag19.reset();
        java.lang.String str27 = tag26.normalName;
        tag26.tagName = "<Commentcomment>";
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
        org.jsoup.nodes.Attributes attributes43 = startTag30.attributes;
        startTag30.appendAttributeName("Character");
        startTag30.finaliseTag();
        startTag30.appendAttributeValue('#');
        startTag30.appendAttributeName("Character");
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName("");
        java.lang.String str54 = startTag51.tagName;
        startTag51.setEmptyAttributeValue();
        startTag51.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        char[] charArray59 = new char[] {};
        startTag58.appendAttributeValue(charArray59);
        org.jsoup.nodes.Attributes attributes61 = startTag58.getAttributes();
        boolean boolean62 = startTag58.isComment();
        org.jsoup.parser.Token.TokenType tokenType63 = startTag58.type;
        org.jsoup.parser.Token.Tag tag64 = startTag58.reset();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        startTag65.appendTagName("");
        org.jsoup.nodes.Attributes attributes68 = null;
        startTag65.attributes = attributes68;
        org.jsoup.parser.Token.Tag tag70 = startTag65.reset();
        org.jsoup.nodes.Attributes attributes71 = startTag65.attributes;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        char[] charArray76 = new char[] {};
        startTag75.appendAttributeValue(charArray76);
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes79 = startTag78.attributes;
        startTag75.attributes = attributes79;
        startTag72.attributes = attributes79;
        startTag72.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag84 = new org.jsoup.parser.Token.StartTag();
        startTag84.appendTagName("");
        java.lang.String str87 = startTag84.tagName;
        int[] intArray89 = new int[] { 0 };
        startTag84.appendAttributeValue(intArray89);
        startTag72.appendAttributeValue(intArray89);
        startTag65.appendAttributeValue(intArray89);
        tag64.appendAttributeValue(intArray89);
        startTag51.appendAttributeValue(intArray89);
        startTag30.appendAttributeValue(intArray89);
        tag26.appendAttributeValue(intArray89);
        startTag11.appendAttributeValue(intArray89);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + tokenType63 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType63.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] {});
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 0 });
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        boolean boolean5 = startTag0.isCharacter();
        startTag0.appendTagName("");
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        startTag0.newAttribute();
        startTag0.normalName = "<Doctype>";
        startTag0.newAttribute();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        doctype0.pubSysKey = "<4>";
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        startTag0.selfClosing = false;
        java.lang.String str14 = startTag0.toString();
        org.jsoup.nodes.Attributes attributes15 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<4>" + "'", str14, "<4>");
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        org.jsoup.parser.Token.Tag tag19 = tag8.reset();
        tag19.appendTagName("<commentcomment#>");
        boolean boolean22 = tag19.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype5.getName();
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.String str8 = doctype5.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        startTag0.appendAttributeName("#");
        startTag0.tagName = "<StartTag>";
        startTag0.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        org.jsoup.parser.Token.StartTag startTag24 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag25 = startTag24.reset();
        org.jsoup.parser.Token.Tag tag27 = tag25.name("commentcomment#");
        tag25.selfClosing = true;
        tag25.appendTagName('a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        boolean boolean14 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        org.jsoup.nodes.Attributes attributes19 = startTag16.getAttributes();
        boolean boolean20 = startTag16.isComment();
        org.jsoup.parser.Token.TokenType tokenType21 = startTag16.type;
        startTag16.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = startTag30.attributes;
        startTag27.attributes = attributes31;
        startTag24.attributes = attributes31;
        startTag24.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag36 = startTag24.asStartTag();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        org.jsoup.nodes.Attributes attributes41 = startTag38.getAttributes();
        boolean boolean42 = startTag38.isComment();
        org.jsoup.parser.Token.TokenType tokenType43 = startTag38.type;
        startTag38.selfClosing = true;
        org.jsoup.parser.Token.Tag tag46 = startTag38.reset();
        org.jsoup.nodes.Attributes attributes47 = tag46.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = startTag24.nameAttr("comment", attributes47);
        org.jsoup.parser.Token.StartTag startTag49 = startTag16.nameAttr("Comment", attributes47);
        org.jsoup.nodes.Attributes attributes50 = startTag49.getAttributes();
        org.jsoup.nodes.Attributes attributes51 = startTag49.getAttributes();
        org.jsoup.parser.Token.StartTag startTag52 = startTag0.nameAttr("Commentcomment<<<hi!>>>", attributes51);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment53 = startTag52.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag52);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendTagName("");
        java.lang.String str8 = startTag5.tagName;
        org.jsoup.parser.Token.Tag tag9 = startTag5.reset();
        boolean boolean10 = startTag5.isCharacter();
        startTag5.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag14 = startTag5.name("<<<hi!>>>");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = startTag15.attributes;
        startTag15.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes19 = startTag15.getAttributes();
        tag14.attributes = attributes19;
        startTag0.attributes = attributes19;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("#");
        java.lang.String str5 = character4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        org.jsoup.parser.Token.Character character4 = character0.data("#");
        org.jsoup.parser.Token.Character character6 = character0.data("comment");
        java.lang.String str7 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "comment" + "'", str7, "comment");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        java.lang.String str44 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendTagName("");
        java.lang.String str49 = startTag46.tagName;
        startTag46.setEmptyAttributeValue();
        startTag46.appendTagName('#');
        boolean boolean53 = startTag46.isStartTag();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        startTag54.appendTagName("");
        org.jsoup.nodes.Attributes attributes57 = null;
        startTag54.attributes = attributes57;
        org.jsoup.parser.Token.Tag tag59 = startTag54.reset();
        org.jsoup.nodes.Attributes attributes60 = tag59.attributes;
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        char[] charArray62 = new char[] {};
        startTag61.appendAttributeValue(charArray62);
        tag59.appendAttributeValue(charArray62);
        startTag46.appendAttributeValue(charArray62);
        org.jsoup.nodes.Attributes attributes66 = startTag46.attributes;
        org.jsoup.parser.Token.StartTag startTag67 = startTag0.nameAttr("comment", attributes66);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Doctype" + "'", str44, "Doctype");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(startTag67);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendTagName("");
        java.lang.String str4 = startTag1.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag1.reset();
        java.lang.String str6 = startTag1.tagName;
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        int[] intArray24 = new int[] { 0 };
        startTag19.appendAttributeValue(intArray24);
        startTag7.appendAttributeValue(intArray24);
        startTag1.appendAttributeValue(intArray24);
        endTag0.appendAttributeValue(intArray24);
        java.lang.String str29 = endTag0.normalName;
        endTag0.tagName = "commentcomment#";
        endTag0.normalName = "<Commentcomment>";
        endTag0.appendTagName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
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
        org.junit.Assert.assertNotNull(tag28);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = eOF0.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        boolean boolean9 = startTag0.isStartTag();
        startTag0.appendTagName('#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        char[] charArray2 = new char[] {};
        startTag1.appendAttributeValue(charArray2);
        startTag1.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes5 = startTag1.getAttributes();
        boolean boolean6 = startTag1.isEOF();
        startTag1.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token10 = doctype9.reset();
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str12 = doctype11.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str14 = doctype13.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType15 = doctype13.type;
        doctype11.type = tokenType15;
        doctype9.type = tokenType15;
        startTag1.type = tokenType15;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag22.attributes = attributes26;
        startTag19.attributes = attributes26;
        startTag19.selfClosing = false;
        startTag19.appendAttributeName('4');
        startTag19.newAttribute();
        startTag19.selfClosing = false;
        org.jsoup.parser.Token.Tag tag36 = startTag19.reset();
        tag36.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        org.jsoup.nodes.Attributes attributes42 = startTag39.getAttributes();
        boolean boolean43 = startTag39.isComment();
        startTag39.appendAttributeName("Comment");
        startTag39.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes48 = startTag39.attributes;
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        char[] charArray50 = new char[] {};
        startTag49.appendAttributeValue(charArray50);
        startTag39.appendAttributeValue(charArray50);
        tag36.appendAttributeValue(charArray50);
        startTag1.appendAttributeValue(charArray50);
        startTag0.appendAttributeValue(charArray50);
        startTag0.tagName = "";
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        java.lang.String str25 = startTag22.name();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Doctype" + "'", str25, "Doctype");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        boolean boolean70 = startTag69.isSelfClosing();
        startTag69.normalName = "<commentcomment>";
        org.jsoup.parser.Token.Tag tag73 = startTag69.reset();
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(tag73);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        org.jsoup.parser.Token.Tag tag19 = tag8.reset();
        org.jsoup.nodes.Attributes attributes20 = tag8.attributes;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        startTag0.appendAttributeValue("Comment");
        java.lang.String str12 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype13 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        startTag0.appendAttributeValue(' ');
        startTag0.appendAttributeName("<commentcomment>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        boolean boolean15 = startTag11.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        java.lang.String str4 = doctype2.getName();
        java.lang.String str5 = doctype2.pubSysKey;
        java.lang.String str6 = doctype2.getName();
        doctype2.pubSysKey = "Comment";
        boolean boolean9 = doctype2.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        java.lang.Class<?> wildcardClass28 = tag6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendTagName("Doctype");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        startTag0.selfClosing = false;
        boolean boolean14 = startTag0.isEOF();
        startTag0.appendAttributeName('a');
        java.lang.String str17 = startTag0.name();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        tag26.tagName = "hi!";
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
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        startTag0.tagName = "EOF";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "comment" + "'", str8, "comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "comment" + "'", str14, "comment");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        boolean boolean7 = startTag0.isEndTag();
        startTag0.appendTagName(' ');
        java.lang.String str10 = startTag0.normalName();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        comment0.bogus = true;
        java.lang.String str7 = comment0.tokenType();
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        startTag0.setEmptyAttributeValue();
        boolean boolean15 = startTag0.isStartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag0.reset();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        org.jsoup.parser.Token.StartTag startTag15 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        org.jsoup.parser.Token token7 = doctype0.reset();
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("<!---->");
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token.Character character8 = character0.data("");
        org.jsoup.parser.Token.TokenType tokenType9 = character0.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag6.normalName = "<Commentcomment>";
        java.lang.String str9 = startTag6.normalName();
        boolean boolean10 = startTag6.isDoctype();
        org.jsoup.nodes.Attributes attributes11 = startTag6.getAttributes();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<Commentcomment>" + "'", str9, "<Commentcomment>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag17 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag9 = startTag8.asStartTag();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        char[] charArray11 = new char[] {};
        startTag10.appendAttributeValue(charArray11);
        org.jsoup.nodes.Attributes attributes13 = startTag10.getAttributes();
        startTag10.appendTagName('#');
        startTag10.finaliseTag();
        boolean boolean17 = startTag10.isStartTag();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        java.lang.String str21 = startTag18.tagName;
        org.jsoup.parser.Token.Tag tag22 = startTag18.reset();
        java.lang.String str23 = startTag18.tagName;
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
        startTag18.appendAttributeValue(intArray41);
        startTag10.appendAttributeValue(intArray41);
        startTag9.appendAttributeValue(intArray41);
        startTag9.appendAttributeValue("</commentcomment#>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0 });
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        startTag0.appendAttributeName("comment");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        boolean boolean10 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        java.lang.String str6 = startTag0.tokenType();
        boolean boolean7 = startTag0.isStartTag();
        boolean boolean8 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean10 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "hi!";
        java.lang.String str8 = doctype2.tokenType();
        java.lang.String str9 = doctype2.getPubSysKey();
        org.jsoup.parser.Token token10 = doctype2.reset();
        boolean boolean11 = doctype2.isForceQuirks();
        java.lang.String str12 = doctype2.getPubSysKey();
        boolean boolean13 = doctype2.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        startTag11.appendAttributeName("<#>");
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
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        tag21.setEmptyAttributeValue();
        tag21.tagName = "<hi!>";
        org.jsoup.parser.Token.Tag tag25 = tag21.reset();
        boolean boolean26 = tag25.isStartTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        java.lang.String str6 = startTag0.toString();
        java.lang.String str7 = startTag0.name();
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
        boolean boolean20 = startTag8.selfClosing;
        org.jsoup.nodes.Attributes attributes21 = startTag8.attributes;
        startTag8.appendAttributeName("Character");
        startTag8.finaliseTag();
        startTag8.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendTagName("");
        java.lang.String str30 = startTag27.tagName;
        startTag27.setEmptyAttributeValue();
        startTag27.appendTagName('#');
        boolean boolean34 = startTag27.isStartTag();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendTagName("");
        org.jsoup.nodes.Attributes attributes38 = null;
        startTag35.attributes = attributes38;
        org.jsoup.parser.Token.Tag tag40 = startTag35.reset();
        org.jsoup.nodes.Attributes attributes41 = tag40.attributes;
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        char[] charArray43 = new char[] {};
        startTag42.appendAttributeValue(charArray43);
        tag40.appendAttributeValue(charArray43);
        startTag27.appendAttributeValue(charArray43);
        startTag8.appendAttributeValue(charArray43);
        startTag0.appendAttributeValue(charArray43);
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] {});
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        startTag11.appendAttributeName("<!---->");
        startTag11.appendTagName("commenta");
        java.lang.String str19 = startTag11.normalName;
        startTag11.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4commenta" + "'", str19, "4commenta");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype4 = doctype2.asDoctype();
        doctype4.pubSysKey = "<Doctype>";
        boolean boolean7 = doctype4.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype4.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        startTag11.appendAttributeValue("");
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
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        java.lang.String str11 = startTag0.toString();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype13 = tag12.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<#>" + "'", str11, "<#>");
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag6.normalName = "hi!";
        java.lang.String str9 = startTag6.tokenType();
        java.lang.String str10 = startTag6.name();
        org.jsoup.parser.Token.Tag tag11 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag12 = tag11.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType2 = eOF0.type;
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = eOF0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<hi!>");
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag13 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes14 = tag13.attributes;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        boolean boolean7 = startTag0.isEndTag();
        boolean boolean8 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        startTag0.finaliseTag();
        startTag0.appendAttributeValue('#');
        startTag0.selfClosing = true;
        boolean boolean21 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        boolean boolean17 = startTag14.isStartTag();
        startTag14.appendAttributeValue('#');
        startTag14.appendTagName("#");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        org.jsoup.parser.Token.Tag tag13 = startTag0.name("commentcomment#");
        java.lang.String str14 = tag13.tagName;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "commentcomment#" + "'", str14, "commentcomment#");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype5.getName();
        java.lang.String str7 = doctype5.getPubSysKey();
        boolean boolean8 = doctype5.forceQuirks;
        boolean boolean9 = doctype5.isStartTag();
        java.lang.String str10 = doctype5.getPublicIdentifier();
        boolean boolean11 = doctype5.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        java.lang.String str11 = comment0.getData();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        tag6.finaliseTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        org.jsoup.parser.Token.Tag tag39 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = startTag41.attributes;
        startTag41.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes45 = startTag41.getAttributes();
        java.lang.String str46 = startTag41.tagName;
        boolean boolean47 = startTag41.isComment();
        boolean boolean48 = startTag41.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        startTag50.appendTagName("");
        java.lang.String str53 = startTag50.tagName;
        org.jsoup.parser.Token.Tag tag54 = startTag50.reset();
        boolean boolean55 = startTag50.isComment();
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        startTag56.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        char[] charArray60 = new char[] {};
        startTag59.appendAttributeValue(charArray60);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes63 = startTag62.attributes;
        startTag59.attributes = attributes63;
        startTag56.attributes = attributes63;
        java.lang.String str66 = startTag56.normalName;
        org.jsoup.parser.Token.Tag tag67 = startTag56.reset();
        org.jsoup.parser.Token.Tag tag68 = startTag56.reset();
        startTag56.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag72 = startTag71.reset();
        org.jsoup.nodes.Attributes attributes73 = startTag71.attributes;
        org.jsoup.parser.Token.StartTag startTag74 = startTag56.nameAttr("", attributes73);
        startTag50.attributes = attributes73;
        org.jsoup.parser.Token.StartTag startTag76 = startTag41.nameAttr("<#>", attributes73);
        org.jsoup.parser.Token.StartTag startTag77 = startTag0.nameAttr("Commentcomment<<<hi!>>>", attributes73);
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
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] {});
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertNotNull(startTag77);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        startTag0.appendTagName("StartTag");
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        startTag17.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.appendTagName("");
        java.lang.String str39 = startTag36.tagName;
        int[] intArray41 = new int[] { 0 };
        startTag36.appendAttributeValue(intArray41);
        org.jsoup.parser.Token.Tag tag43 = startTag36.reset();
        tag43.appendAttributeName("commentcomment#");
        org.jsoup.nodes.Attributes attributes46 = tag43.getAttributes();
        org.jsoup.parser.Token.StartTag startTag47 = startTag17.nameAttr(" ", attributes46);
        org.jsoup.parser.Token.Tag tag48 = startTag17.reset();
        java.lang.String str49 = startTag17.tagName;
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("Comment");
        tag10.selfClosing = false;
        java.lang.String str13 = tag10.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Comment" + "'", str13, "Comment");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        boolean boolean14 = startTag0.isStartTag();
        boolean boolean15 = startTag0.isEndTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendTagName('4');
        java.lang.String str4 = tag1.name();
        boolean boolean5 = tag1.isSelfClosing();
        boolean boolean6 = tag1.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "hi!";
        java.lang.String str8 = doctype2.tokenType();
        java.lang.String str9 = doctype2.getPubSysKey();
        org.jsoup.parser.Token token10 = doctype2.reset();
        java.lang.StringBuilder stringBuilder11 = doctype2.systemIdentifier;
        java.lang.String str12 = doctype2.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        org.jsoup.nodes.Attributes attributes16 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("<!---->");
        boolean boolean6 = character0.isCharacter();
        java.lang.String str7 = character0.toString();
        boolean boolean8 = character0.isStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.String str7 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.appendTagName('a');
        startTag0.appendTagName(" ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        tag19.tagName = "commentcomment";
        org.jsoup.parser.Token.Tag tag22 = tag19.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        startTag11.appendAttributeName("<<!---->>");
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendTagName("");
        org.jsoup.nodes.Attributes attributes52 = null;
        startTag49.attributes = attributes52;
        java.lang.String str54 = startTag49.tagName;
        org.jsoup.nodes.Attributes attributes55 = startTag49.getAttributes();
        startTag49.newAttribute();
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        startTag57.appendTagName("");
        java.lang.String str60 = startTag57.tagName;
        startTag57.setEmptyAttributeValue();
        startTag57.appendTagName('#');
        boolean boolean64 = startTag57.isStartTag();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        startTag65.appendTagName("");
        org.jsoup.nodes.Attributes attributes68 = null;
        startTag65.attributes = attributes68;
        org.jsoup.parser.Token.Tag tag70 = startTag65.reset();
        org.jsoup.nodes.Attributes attributes71 = tag70.attributes;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        char[] charArray73 = new char[] {};
        startTag72.appendAttributeValue(charArray73);
        tag70.appendAttributeValue(charArray73);
        startTag57.appendAttributeValue(charArray73);
        startTag49.appendAttributeValue(charArray73);
        startTag11.appendAttributeValue(charArray73);
        java.lang.String str79 = startTag11.normalName();
        org.jsoup.parser.Token.Doctype doctype80 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token81 = doctype80.reset();
        java.lang.String str82 = doctype80.getPubSysKey();
        java.lang.String str83 = doctype80.getSystemIdentifier();
        org.jsoup.parser.Token token84 = doctype80.reset();
        java.lang.String str85 = doctype80.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype86 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token87 = doctype86.reset();
        org.jsoup.parser.Token.Doctype doctype88 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str89 = doctype88.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype90 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str91 = doctype90.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType92 = doctype90.type;
        doctype88.type = tokenType92;
        doctype86.type = tokenType92;
        doctype80.type = tokenType92;
        startTag11.type = tokenType92;
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(attributes55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] {});
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(token81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(token84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(token87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + tokenType92 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType92.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        java.lang.String str14 = comment0.toString();
        org.jsoup.parser.Token token15 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("Commentcomment");
        java.lang.String str12 = startTag0.toString();
        org.jsoup.nodes.Attributes attributes13 = startTag0.getAttributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<Commentcomment>" + "'", str12, "<Commentcomment>");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        java.lang.String str32 = startTag0.normalName;
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
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        org.jsoup.parser.Token.Tag tag46 = tag7.reset();
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
        org.junit.Assert.assertNotNull(tag46);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        startTag0.appendAttributeValue("<<<!---->>>");
        boolean boolean19 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        doctype0.forceQuirks = false;
        boolean boolean4 = doctype0.isEndTag();
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.pubSysKey = "#";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        boolean boolean4 = comment0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        org.jsoup.parser.Token token5 = doctype2.reset();
        doctype2.forceQuirks = true;
        java.lang.String str8 = doctype2.pubSysKey;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag21 = startTag0.reset();
        tag21.normalName = "<<Commentcomment>>";
        org.jsoup.parser.Token token24 = tag21.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(token24);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        doctype0.pubSysKey = "Doctype";
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        org.jsoup.parser.Token.Tag tag24 = startTag11.name("#");
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
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.getData();
        org.jsoup.parser.Token.Character character8 = character0.data("Commentcomment<<<hi!>>>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Comment" + "'", str6, "Comment");
        org.junit.Assert.assertNotNull(character8);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        startTag0.normalName = " ";
        boolean boolean17 = startTag0.isSelfClosing();
        startTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype6.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        org.jsoup.parser.Token token16 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType17 = startTag0.type;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token token10 = character8.reset();
        org.jsoup.parser.Token token11 = character8.reset();
        java.lang.String str12 = character8.getData();
        org.jsoup.parser.Token.Character character14 = character8.data("<Character>");
        java.lang.String str15 = character8.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<Character>" + "'", str15, "<Character>");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = true;
        comment0.bogus = false;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token token8 = doctype0.reset();
        doctype0.forceQuirks = false;
        java.lang.String str11 = doctype0.getPubSysKey();
        org.jsoup.parser.Token.Doctype doctype12 = doctype0.asDoctype();
        java.lang.String str13 = doctype12.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "<#>";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        boolean boolean4 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName("<<!---->>");
        startTag0.newAttribute();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<hi!>");
        startTag0.appendAttributeValue(" ");
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        startTag0.appendAttributeValue("<commentcomment>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        boolean boolean7 = startTag0.isCharacter();
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        tag8.appendAttributeValue(' ');
        boolean boolean11 = tag8.isEndTag();
        boolean boolean12 = tag8.isEndTag();
        tag8.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.tokenType();
        boolean boolean14 = comment12.isComment();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        org.jsoup.nodes.Attributes attributes18 = null;
        startTag15.attributes = attributes18;
        startTag15.appendAttributeValue("hi!");
        startTag15.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType24 = startTag15.type;
        comment12.type = tokenType24;
        doctype0.type = tokenType24;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Comment" + "'", str13, "Comment");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        java.lang.String str9 = startTag0.normalName();
        startTag0.appendAttributeName("Doctype");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        java.lang.String str10 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        java.lang.String str33 = startTag12.normalName();
        org.jsoup.nodes.Attributes attributes34 = startTag12.getAttributes();
        org.jsoup.parser.Token.StartTag startTag35 = startTag0.nameAttr("comment", attributes34);
        boolean boolean36 = startTag0.selfClosing;
        startTag0.tagName = "Comment";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.isCharacter();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        startTag17.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.appendTagName("");
        java.lang.String str39 = startTag36.tagName;
        int[] intArray41 = new int[] { 0 };
        startTag36.appendAttributeValue(intArray41);
        org.jsoup.parser.Token.Tag tag43 = startTag36.reset();
        tag43.appendAttributeName("commentcomment#");
        org.jsoup.nodes.Attributes attributes46 = tag43.getAttributes();
        org.jsoup.parser.Token.StartTag startTag47 = startTag17.nameAttr(" ", attributes46);
        org.jsoup.parser.Token.Tag tag48 = startTag17.reset();
        startTag17.tagName = "Commentcomment<<<hi!>>>";
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(tag48);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype4 = doctype2.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype2.name;
        boolean boolean6 = doctype2.isEOF();
        java.lang.String str7 = doctype2.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        boolean boolean22 = startTag19.isComment();
        startTag19.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes25 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = startTag33.attributes;
        startTag30.attributes = attributes34;
        startTag27.attributes = attributes34;
        org.jsoup.parser.Token.Tag tag38 = startTag27.name("Doctype");
        org.jsoup.nodes.Attributes attributes39 = startTag27.getAttributes();
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
        startTag41.appendAttributeName('#');
        java.lang.String str55 = startTag41.normalName;
        org.jsoup.nodes.Attributes attributes56 = startTag41.attributes;
        org.jsoup.parser.Token.StartTag startTag57 = startTag27.nameAttr("Commentcomment", attributes56);
        org.jsoup.parser.Token.StartTag startTag58 = startTag19.nameAttr("<hi!>", attributes56);
        startTag11.attributes = attributes56;
        startTag11.appendTagName('a');
        org.jsoup.parser.Token.Tag tag63 = startTag11.name("<#>");
        boolean boolean64 = startTag11.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPubSysKey();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder10);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
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
        startTag7.newAttribute();
        startTag7.selfClosing = false;
        org.jsoup.parser.Token.Tag tag24 = startTag7.reset();
        org.jsoup.parser.Token.Tag tag25 = startTag7.reset();
        tag25.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes28 = tag25.attributes;
        startTag0.attributes = attributes28;
        java.lang.String str30 = startTag0.name();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        java.lang.StringBuilder stringBuilder12 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        startTag0.appendTagName("<hi!>");
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
        startTag17.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        char[] charArray44 = new char[] {};
        startTag43.appendAttributeValue(charArray44);
        startTag43.appendAttributeName("hi!");
        startTag43.appendAttributeName('a');
        java.lang.String str50 = startTag43.normalName;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName("");
        org.jsoup.nodes.Attributes attributes54 = null;
        startTag51.attributes = attributes54;
        org.jsoup.parser.Token.Tag tag56 = startTag51.reset();
        org.jsoup.nodes.Attributes attributes57 = startTag51.attributes;
        startTag43.attributes = attributes57;
        org.jsoup.parser.Token.Tag tag60 = startTag43.name("<hi!>");
        boolean boolean61 = tag60.isDoctype();
        org.jsoup.parser.Token.Tag tag62 = tag60.reset();
        org.jsoup.nodes.Attributes attributes63 = tag60.getAttributes();
        startTag17.attributes = attributes63;
        startTag0.attributes = attributes63;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] {});
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(attributes63);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        boolean boolean14 = startTag0.isDoctype();
        boolean boolean15 = startTag0.isComment();
        startTag0.appendTagName("");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token token9 = comment0.reset();
        boolean boolean10 = comment0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<hi!>");
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.forceQuirks = false;
        boolean boolean8 = doctype0.isCharacter();
        java.lang.String str9 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(attributes1);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        boolean boolean90 = startTag89.selfClosing;
        startTag89.appendAttributeValue('a');
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
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<hi!>");
        tag10.appendAttributeValue(' ');
        java.lang.String str13 = tag10.name();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!>" + "'", str13, "<hi!>");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.getData();
        boolean boolean5 = comment2.bogus;
        boolean boolean6 = comment2.bogus;
        boolean boolean7 = comment2.isEOF();
        java.lang.StringBuilder stringBuilder8 = comment2.data;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        boolean boolean11 = startTag0.selfClosing;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isDoctype();
        java.lang.String str7 = doctype0.getPubSysKey();
        boolean boolean8 = doctype0.isEndTag();
        java.lang.String str9 = doctype0.getName();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        startTag0.appendAttributeValue('a');
        startTag0.appendAttributeValue('#');
        startTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isStartTag();
        java.lang.String str8 = startTag0.toString();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<#>" + "'", str8, "<#>");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        startTag0.setEmptyAttributeValue();
        boolean boolean15 = startTag0.isDoctype();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        char[] charArray52 = new char[] {};
        startTag51.appendAttributeValue(charArray52);
        startTag51.appendAttributeName("hi!");
        startTag51.appendAttributeName('a');
        boolean boolean58 = startTag51.isStartTag();
        startTag51.normalName = "4";
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        char[] charArray62 = new char[] {};
        startTag61.appendAttributeValue(charArray62);
        org.jsoup.nodes.Attributes attributes64 = startTag61.getAttributes();
        boolean boolean65 = startTag61.isComment();
        org.jsoup.parser.Token.TokenType tokenType66 = startTag61.type;
        startTag61.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag69 = startTag61.asStartTag();
        org.jsoup.parser.Token.Tag tag71 = startTag61.name("Comment");
        startTag61.newAttribute();
        org.jsoup.nodes.Attributes attributes73 = startTag61.getAttributes();
        char[] charArray80 = new char[] { ' ', 'a', '#', '#', '4', ' ' };
        startTag61.appendAttributeValue(charArray80);
        startTag51.appendAttributeValue(charArray80);
        startTag0.appendAttributeValue(charArray80);
        boolean boolean84 = startTag0.isSelfClosing();
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
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + tokenType66 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType66.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag69);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { ' ', 'a', '#', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        org.jsoup.parser.Token token19 = startTag0.reset();
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(token19);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        java.lang.String str13 = startTag0.tagName;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = character0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        startTag0.appendTagName("<<Comment>>");
        startTag0.tagName = "<hi!>";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag32 = startTag0.name("<Comment>");
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
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        org.jsoup.parser.Token.TokenType tokenType28 = startTag27.type;
        startTag27.appendAttributeValue('a');
        org.jsoup.parser.Token.Tag tag31 = startTag27.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = startTag27.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag31);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        doctype0.type = tokenType5;
        java.lang.String str7 = doctype0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        boolean boolean18 = startTag0.isEndTag();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        char[] charArray21 = new char[] {};
        startTag20.appendAttributeValue(charArray21);
        startTag20.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag26 = startTag20.name("Comment");
        startTag20.appendTagName("comment");
        startTag20.appendAttributeName("<hi!>");
        java.lang.String str31 = startTag20.toString();
        org.jsoup.parser.Token.Tag tag33 = startTag20.name("<#>");
        boolean boolean34 = startTag20.isEOF();
        java.lang.String str35 = startTag20.name();
        org.jsoup.nodes.Attributes attributes36 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag37 = startTag0.nameAttr("</commentcomment#>", attributes36);
        boolean boolean38 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<Commentcomment>" + "'", str31, "<Commentcomment>");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<#>" + "'", str35, "<#>");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEndTag();
        java.lang.String str4 = comment0.getData();
        boolean boolean5 = comment0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token.Character character6 = character4.data("comment");
        java.lang.String str7 = character4.toString();
        org.jsoup.parser.Token token8 = character4.reset();
        java.lang.String str9 = character4.getData();
        boolean boolean10 = character4.isCharacter();
        boolean boolean11 = character4.isEOF();
        org.jsoup.parser.Token.Character character13 = character4.data("<4>");
        java.lang.String str14 = character13.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "comment" + "'", str7, "comment");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<4>" + "'", str14, "<4>");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        java.lang.StringBuilder stringBuilder14 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder9);
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
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.asStartTag();
        org.jsoup.parser.Token token10 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isCharacter();
        java.lang.String str4 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = tag1.reset();
        tag2.normalName = "4";
        tag2.selfClosing = false;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.String str6 = doctype0.getName();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.tokenType();
        boolean boolean9 = doctype0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        org.jsoup.parser.Token.TokenType tokenType25 = tag17.type;
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
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        org.jsoup.nodes.Attributes attributes12 = null;
        startTag9.attributes = attributes12;
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes15 = startTag9.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        char[] charArray17 = new char[] {};
        startTag16.appendAttributeValue(charArray17);
        org.jsoup.nodes.Attributes attributes19 = startTag16.getAttributes();
        boolean boolean20 = startTag16.isComment();
        startTag16.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag23 = startTag16.reset();
        java.lang.String str24 = tag23.tagName;
        boolean boolean25 = tag23.isCharacter();
        org.jsoup.nodes.Attributes attributes26 = tag23.attributes;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        org.jsoup.nodes.Attributes attributes30 = startTag27.getAttributes();
        boolean boolean31 = startTag27.isComment();
        org.jsoup.parser.Token.TokenType tokenType32 = startTag27.type;
        startTag27.selfClosing = true;
        org.jsoup.parser.Token.Tag tag35 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.appendTagName("");
        org.jsoup.nodes.Attributes attributes39 = null;
        startTag36.attributes = attributes39;
        org.jsoup.parser.Token.Tag tag41 = startTag36.reset();
        org.jsoup.nodes.Attributes attributes42 = tag41.attributes;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        startTag43.appendTagName("");
        org.jsoup.nodes.Attributes attributes46 = null;
        startTag43.attributes = attributes46;
        org.jsoup.parser.Token.Tag tag48 = startTag43.reset();
        org.jsoup.nodes.Attributes attributes49 = tag48.attributes;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        char[] charArray51 = new char[] {};
        startTag50.appendAttributeValue(charArray51);
        tag48.appendAttributeValue(charArray51);
        tag41.appendAttributeValue(charArray51);
        tag35.appendAttributeValue(charArray51);
        tag23.appendAttributeValue(charArray51);
        startTag9.appendAttributeValue(charArray51);
        startTag0.appendAttributeValue(charArray51);
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        tag8.appendTagName(' ');
        tag8.newAttribute();
        boolean boolean14 = tag8.selfClosing;
        tag8.normalName = "comment";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        java.lang.String str5 = character4.getData();
        org.jsoup.parser.Token.TokenType tokenType6 = character4.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        java.lang.String str18 = startTag0.tagName;
        boolean boolean19 = startTag0.isComment();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("<!---->");
        boolean boolean6 = character0.isCharacter();
        org.jsoup.parser.Token.Character character8 = character0.data("<Doctype>");
        org.jsoup.parser.Token.Character character10 = character0.data("hi!");
        org.jsoup.parser.Token.Character character12 = character0.data("<Commentcomment#>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(character12);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        startTag0.appendAttributeValue(' ');
        boolean boolean18 = startTag0.isCharacter();
        startTag0.appendTagName('#');
        startTag0.tagName = "starttag";
        startTag0.appendTagName("<Comment>");
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        java.lang.String str28 = startTag25.tagName;
        startTag25.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = startTag31.attributes;
        startTag31.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes35 = startTag31.getAttributes();
        org.jsoup.parser.Token.StartTag startTag36 = startTag25.nameAttr("", attributes35);
        org.jsoup.parser.Token.TokenType tokenType37 = startTag36.type;
        org.jsoup.parser.Token.Tag tag39 = startTag36.name("StartTag");
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        char[] charArray41 = new char[] {};
        startTag40.appendAttributeValue(charArray41);
        org.jsoup.nodes.Attributes attributes43 = startTag40.getAttributes();
        boolean boolean44 = startTag40.isComment();
        startTag40.appendAttributeName("Comment");
        startTag40.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes49 = startTag40.attributes;
        startTag40.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        char[] charArray53 = new char[] {};
        startTag52.appendAttributeValue(charArray53);
        startTag52.appendAttributeName("hi!");
        startTag52.appendAttributeName('a');
        java.lang.String str59 = startTag52.normalName;
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        startTag60.appendTagName("");
        org.jsoup.nodes.Attributes attributes63 = null;
        startTag60.attributes = attributes63;
        org.jsoup.parser.Token.Tag tag65 = startTag60.reset();
        org.jsoup.nodes.Attributes attributes66 = startTag60.attributes;
        startTag52.attributes = attributes66;
        org.jsoup.parser.Token.Tag tag69 = startTag52.name("<hi!>");
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        char[] charArray71 = new char[] {};
        startTag70.appendAttributeValue(charArray71);
        org.jsoup.nodes.Attributes attributes73 = startTag70.getAttributes();
        boolean boolean74 = startTag70.isComment();
        org.jsoup.parser.Token.TokenType tokenType75 = startTag70.type;
        startTag70.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag78 = startTag70.asStartTag();
        org.jsoup.parser.Token.Tag tag80 = startTag70.name("<hi!>");
        org.jsoup.nodes.Attributes attributes81 = startTag70.attributes;
        startTag52.attributes = attributes81;
        startTag40.attributes = attributes81;
        tag39.attributes = attributes81;
        startTag0.attributes = attributes81;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] {});
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + tokenType75 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType75.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(attributes81);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        java.lang.String str16 = startTag0.normalName();
        org.jsoup.nodes.Attributes attributes17 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.asStartTag();
        startTag0.appendAttributeName('a');
        startTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        org.jsoup.parser.Token.StartTag startTag11 = tag10.asStartTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.TokenType tokenType1 = character0.type;
        org.jsoup.parser.Token token2 = character0.reset();
        java.lang.String str3 = character0.getData();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        org.jsoup.parser.Token.Tag tag38 = startTag36.name("4commenta");
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
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isCharacter();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        comment0.bogus = false;
        boolean boolean9 = comment0.bogus;
        boolean boolean10 = comment0.isEOF();
        boolean boolean11 = comment0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes11 = startTag9.attributes;
        startTag0.attributes = attributes11;
        org.jsoup.nodes.Attributes attributes13 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.asStartTag();
        java.lang.String str15 = startTag0.tokenType();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName("");
        java.lang.String str20 = startTag17.tagName;
        startTag17.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = startTag23.attributes;
        startTag23.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes27 = startTag23.getAttributes();
        org.jsoup.parser.Token.StartTag startTag28 = startTag17.nameAttr("", attributes27);
        java.lang.String str29 = startTag28.tagName;
        startTag28.appendAttributeValue('#');
        java.lang.String str32 = startTag28.tagName;
        boolean boolean33 = startTag28.isEndTag();
        startTag28.selfClosing = false;
        org.jsoup.nodes.Attributes attributes36 = startTag28.getAttributes();
        org.jsoup.parser.Token.StartTag startTag37 = startTag0.nameAttr("<!---->#", attributes36);
        startTag0.appendAttributeValue("commenta");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(startTag37);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        startTag0.setEmptyAttributeValue();
        startTag0.setEmptyAttributeValue();
        startTag0.selfClosing = true;
        boolean boolean12 = startTag0.isCharacter();
        org.jsoup.parser.Token token13 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        startTag0.appendAttributeValue('a');
        java.lang.String str10 = startTag0.normalName();
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
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendTagName("");
        java.lang.String str26 = startTag23.tagName;
        int[] intArray28 = new int[] { 0 };
        startTag23.appendAttributeValue(intArray28);
        startTag11.appendAttributeValue(intArray28);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        startTag31.appendTagName("");
        org.jsoup.nodes.Attributes attributes34 = null;
        startTag31.attributes = attributes34;
        org.jsoup.parser.Token.Tag tag36 = startTag31.reset();
        org.jsoup.nodes.Attributes attributes37 = tag36.attributes;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        tag36.appendAttributeValue(charArray39);
        startTag11.appendAttributeValue(charArray39);
        startTag0.appendAttributeValue(charArray39);
        startTag0.setEmptyAttributeValue();
        boolean boolean45 = startTag0.isEOF();
        org.jsoup.parser.Token.Tag tag46 = startTag0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendAttributeName("commentcomment#");
        org.jsoup.nodes.Attributes attributes10 = tag7.getAttributes();
        tag7.normalName = " ";
        tag7.tagName = "<Character>";
        tag7.appendAttributeValue(' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        startTag0.appendAttributeValue(' ');
        boolean boolean23 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        doctype0.pubSysKey = "Doctype";
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        boolean boolean6 = doctype0.isEOF();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "hi!";
        java.lang.String str8 = doctype2.tokenType();
        java.lang.String str9 = doctype2.getPubSysKey();
        org.jsoup.parser.Token token10 = doctype2.reset();
        java.lang.String str11 = doctype2.getPublicIdentifier();
        boolean boolean12 = doctype2.isForceQuirks();
        java.lang.String str13 = doctype2.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        startTag11.newAttribute();
        startTag11.appendAttributeName("<<<hi!>>>");
        startTag11.appendTagName('#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        startTag0.newAttribute();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        org.jsoup.nodes.Attributes attributes12 = null;
        startTag9.attributes = attributes12;
        startTag9.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.nodes.Attributes attributes19 = null;
        startTag16.attributes = attributes19;
        org.jsoup.parser.Token.Tag tag21 = startTag16.reset();
        org.jsoup.nodes.Attributes attributes22 = startTag16.attributes;
        startTag9.attributes = attributes22;
        org.jsoup.parser.Token.Tag tag24 = startTag9.reset();
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
        startTag9.appendAttributeValue(intArray42);
        startTag0.appendAttributeValue(intArray42);
        java.lang.String str47 = startTag0.normalName;
        startTag0.newAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        boolean boolean6 = comment0.isDoctype();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        comment7.bogus = false;
        java.lang.String str10 = comment7.getData();
        org.jsoup.parser.Token token11 = comment7.reset();
        java.lang.StringBuilder stringBuilder12 = comment7.data;
        comment7.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        org.jsoup.parser.Token.Tag tag41 = tag39.name(" ");
        org.jsoup.nodes.Attributes attributes42 = tag39.attributes;
        tag39.appendAttributeName("<!---->4");
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
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        java.lang.String str5 = character4.toString();
        java.lang.String str6 = character4.getData();
        org.jsoup.parser.Token.Character character8 = character4.data("comment");
        org.jsoup.parser.Token token9 = character4.reset();
        java.lang.String str10 = character4.tokenType();
        org.jsoup.parser.Token.Character character12 = character4.data("<Commentcomment>");
        boolean boolean13 = character12.isDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Character" + "'", str6, "Character");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendTagName("");
        java.lang.String str4 = startTag1.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag1.reset();
        java.lang.String str6 = startTag1.tagName;
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        int[] intArray24 = new int[] { 0 };
        startTag19.appendAttributeValue(intArray24);
        startTag7.appendAttributeValue(intArray24);
        startTag1.appendAttributeValue(intArray24);
        endTag0.appendAttributeValue(intArray24);
        java.lang.String str29 = endTag0.normalName;
        endTag0.tagName = "commentcomment#";
        endTag0.normalName = "<Commentcomment>";
        org.jsoup.parser.Token.Tag tag35 = endTag0.name("Commentcomment");
        java.lang.String str36 = endTag0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "</Commentcomment>" + "'", str36, "</Commentcomment>");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        java.lang.String str11 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "comment";
        org.jsoup.parser.Token.TokenType tokenType14 = doctype2.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.Class<?> wildcardClass6 = comment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        boolean boolean3 = startTag0.isComment();
        startTag0.appendAttributeValue(' ');
        startTag0.appendAttributeValue("comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        tag8.tagName = "<<<hi!>>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        startTag0.appendAttributeName('4');
        boolean boolean9 = startTag0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        org.jsoup.nodes.Attributes attributes43 = startTag28.getAttributes();
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
        org.junit.Assert.assertNotNull(attributes43);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        startTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character17 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        java.lang.String str8 = startTag0.normalName();
        boolean boolean9 = startTag0.selfClosing;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        java.lang.String str12 = startTag0.toString();
        boolean boolean13 = startTag0.isStartTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "comment" + "'", str8, "comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "comment" + "'", str10, "comment");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<Comment>" + "'", str12, "<Comment>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        boolean boolean7 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        org.jsoup.parser.Token.TokenType tokenType8 = doctype2.type;
        doctype2.forceQuirks = false;
        boolean boolean11 = doctype2.forceQuirks;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.appendAttributeValue("<!---->");
        startTag0.tagName = "Comment";
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag14.attributes;
        startTag14.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes18 = startTag14.getAttributes();
        java.lang.String str19 = startTag14.tagName;
        java.lang.String str20 = startTag14.toString();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        char[] charArray22 = new char[] {};
        startTag21.appendAttributeValue(charArray22);
        startTag21.appendAttributeName("hi!");
        startTag21.appendAttributeName('a');
        java.lang.String str28 = startTag21.normalName;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.nodes.Attributes attributes32 = null;
        startTag29.attributes = attributes32;
        org.jsoup.parser.Token.Tag tag34 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes35 = startTag29.attributes;
        startTag21.attributes = attributes35;
        startTag14.attributes = attributes35;
        startTag14.appendAttributeValue('a');
        startTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.appendTagName("");
        java.lang.String str45 = startTag42.tagName;
        startTag42.appendAttributeName("hi!");
        boolean boolean48 = startTag42.isSelfClosing();
        org.jsoup.parser.Token.Tag tag49 = startTag42.reset();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        char[] charArray51 = new char[] {};
        startTag50.appendAttributeValue(charArray51);
        startTag50.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag56 = startTag50.name("Comment");
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        startTag57.appendTagName("");
        org.jsoup.nodes.Attributes attributes60 = null;
        startTag57.attributes = attributes60;
        startTag57.appendTagName("");
        java.lang.String str64 = startTag57.tagName;
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        startTag65.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        char[] charArray69 = new char[] {};
        startTag68.appendAttributeValue(charArray69);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes72 = startTag71.attributes;
        startTag68.attributes = attributes72;
        startTag65.attributes = attributes72;
        startTag65.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        startTag77.appendTagName("");
        java.lang.String str80 = startTag77.tagName;
        int[] intArray82 = new int[] { 0 };
        startTag77.appendAttributeValue(intArray82);
        startTag65.appendAttributeValue(intArray82);
        startTag57.appendAttributeValue(intArray82);
        tag56.appendAttributeValue(intArray82);
        tag49.appendAttributeValue(intArray82);
        startTag14.appendAttributeValue(intArray82);
        startTag0.appendAttributeValue(intArray82);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!>" + "'", str20, "<hi!>");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] {});
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] {});
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 0 });
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character3.data("</Commentcomment>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        java.lang.String str6 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        char[] charArray9 = new char[] {};
        startTag8.appendAttributeValue(charArray9);
        org.jsoup.nodes.Attributes attributes11 = startTag8.getAttributes();
        startTag8.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag14 = startTag8.asStartTag();
        startTag14.normalName = "hi!";
        java.lang.String str17 = startTag14.tokenType();
        java.lang.String str18 = startTag14.name();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        char[] charArray21 = new char[] {};
        startTag20.appendAttributeValue(charArray21);
        startTag20.appendAttributeName("hi!");
        startTag20.appendTagName("<!---->");
        org.jsoup.nodes.Attributes attributes27 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag28 = startTag14.nameAttr("4", attributes27);
        org.jsoup.parser.Token.StartTag startTag29 = startTag0.nameAttr("<Comment  hi!=\"<!---->\">", attributes27);
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#" + "'", str18, "#");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag29);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = startTag7.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = startTag15.attributes;
        startTag12.attributes = attributes16;
        startTag9.attributes = attributes16;
        startTag9.appendAttributeValue('4');
        boolean boolean21 = startTag9.selfClosing;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendTagName("");
        org.jsoup.nodes.Attributes attributes25 = null;
        startTag22.attributes = attributes25;
        org.jsoup.parser.Token.Tag tag27 = startTag22.reset();
        org.jsoup.nodes.Attributes attributes28 = startTag22.attributes;
        startTag9.attributes = attributes28;
        startTag7.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = startTag31.attributes;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        char[] charArray37 = new char[] {};
        startTag36.appendAttributeValue(charArray37);
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes40 = startTag39.attributes;
        startTag36.attributes = attributes40;
        startTag33.attributes = attributes40;
        startTag33.appendAttributeValue('4');
        boolean boolean45 = startTag33.selfClosing;
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendTagName("");
        org.jsoup.nodes.Attributes attributes49 = null;
        startTag46.attributes = attributes49;
        org.jsoup.parser.Token.Tag tag51 = startTag46.reset();
        org.jsoup.nodes.Attributes attributes52 = startTag46.attributes;
        startTag33.attributes = attributes52;
        startTag31.attributes = attributes52;
        java.lang.String str55 = startTag31.tagName;
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        startTag56.appendTagName("");
        java.lang.String str59 = startTag56.tagName;
        org.jsoup.parser.Token.Tag tag60 = startTag56.reset();
        java.lang.String str61 = startTag56.tagName;
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        char[] charArray66 = new char[] {};
        startTag65.appendAttributeValue(charArray66);
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes69 = startTag68.attributes;
        startTag65.attributes = attributes69;
        startTag62.attributes = attributes69;
        startTag62.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        startTag74.appendTagName("");
        java.lang.String str77 = startTag74.tagName;
        int[] intArray79 = new int[] { 0 };
        startTag74.appendAttributeValue(intArray79);
        startTag62.appendAttributeValue(intArray79);
        startTag56.appendAttributeValue(intArray79);
        startTag31.appendAttributeValue(intArray79);
        startTag7.appendAttributeValue(intArray79);
        startTag0.appendAttributeValue(intArray79);
        java.lang.String str86 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag87 = startTag0.asStartTag();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] {});
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 0 });
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(startTag87);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token token9 = comment0.reset();
        org.jsoup.parser.Token token10 = comment0.reset();
        java.lang.StringBuilder stringBuilder11 = comment0.data;
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        startTag0.appendTagName('#');
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
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token10 = doctype9.reset();
        java.lang.String str11 = doctype9.getPubSysKey();
        java.lang.String str12 = doctype9.getSystemIdentifier();
        org.jsoup.parser.Token token13 = doctype9.reset();
        java.lang.StringBuilder stringBuilder14 = doctype9.systemIdentifier;
        java.lang.StringBuilder stringBuilder15 = doctype9.name;
        java.lang.String str16 = doctype9.getPubSysKey();
        doctype9.forceQuirks = false;
        java.lang.String str19 = doctype9.getName();
        org.jsoup.parser.Token.TokenType tokenType20 = doctype9.type;
        doctype0.type = tokenType20;
        java.lang.StringBuilder stringBuilder22 = doctype0.name;
        boolean boolean23 = doctype0.forceQuirks;
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
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        java.lang.String str15 = startTag11.normalName;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        java.lang.String str19 = startTag16.tagName;
        org.jsoup.parser.Token.Tag tag20 = startTag16.reset();
        boolean boolean21 = startTag16.isComment();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        startTag22.setEmptyAttributeValue();
        startTag22.normalName = "Comment";
        startTag22.appendAttributeName(' ');
        org.jsoup.nodes.Attributes attributes30 = startTag22.getAttributes();
        startTag16.attributes = attributes30;
        startTag11.attributes = attributes30;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        org.jsoup.parser.Token.Tag tag37 = startTag0.reset();
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
        org.junit.Assert.assertNotNull(tag37);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        org.jsoup.parser.Token.Tag tag22 = startTag0.name("<<<!---->>>");
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
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.Class<?> wildcardClass9 = stringBuilder8.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        startTag0.tagName = "commentcomment";
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
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isEndTag();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        doctype0.pubSysKey = "a";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str10 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendTagName("");
        java.lang.String str4 = startTag1.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag1.reset();
        java.lang.String str6 = startTag1.tagName;
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        int[] intArray24 = new int[] { 0 };
        startTag19.appendAttributeValue(intArray24);
        startTag7.appendAttributeValue(intArray24);
        startTag1.appendAttributeValue(intArray24);
        endTag0.appendAttributeValue(intArray24);
        endTag0.setEmptyAttributeValue();
        boolean boolean30 = endTag0.isEOF();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        startTag0.selfClosing = false;
        java.lang.String str55 = startTag0.normalName();
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag0.nameAttr("a", attributes58);
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<<hi!>>" + "'", str55, "<<hi!>>");
        org.junit.Assert.assertNotNull(startTag59);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token token3 = comment0.reset();
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        char[] charArray22 = new char[] {};
        startTag21.appendAttributeValue(charArray22);
        startTag21.setEmptyAttributeValue();
        startTag21.normalName = "Comment";
        startTag21.appendAttributeName(' ');
        org.jsoup.nodes.Attributes attributes29 = startTag21.getAttributes();
        startTag21.selfClosing = false;
        org.jsoup.nodes.Attributes attributes32 = startTag21.getAttributes();
        boolean boolean33 = startTag21.selfClosing;
        org.jsoup.nodes.Attributes attributes34 = startTag21.attributes;
        org.jsoup.parser.Token.StartTag startTag35 = startTag19.nameAttr("<hi!>commentcomment", attributes34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag35);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        org.jsoup.parser.Token token7 = doctype0.reset();
        doctype0.pubSysKey = "StartTag";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        boolean boolean9 = tag8.isSelfClosing();
        java.lang.String str10 = tag8.tokenType();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        doctype0.pubSysKey = "Doctype";
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        startTag8.appendAttributeValue("");
        startTag8.appendAttributeValue("<#>");
        startTag8.appendTagName("Character");
        startTag8.appendAttributeName("Character");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        startTag22.appendAttributeName("hi!");
        startTag22.appendAttributeName('a');
        java.lang.String str29 = startTag22.normalName;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName("");
        org.jsoup.nodes.Attributes attributes33 = null;
        startTag30.attributes = attributes33;
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        org.jsoup.nodes.Attributes attributes36 = startTag30.attributes;
        startTag22.attributes = attributes36;
        org.jsoup.parser.Token.Tag tag39 = startTag22.name("<hi!>");
        boolean boolean40 = tag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = tag39.reset();
        org.jsoup.nodes.Attributes attributes42 = tag39.getAttributes();
        org.jsoup.parser.Token.Tag tag44 = tag39.name("Commentcomment");
        org.jsoup.parser.Token.Tag tag46 = tag39.name("<!---->");
        org.jsoup.nodes.Attributes attributes47 = tag46.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag49 = startTag48.reset();
        org.jsoup.nodes.Attributes attributes50 = startTag48.attributes;
        org.jsoup.parser.Token.Tag tag51 = startTag48.reset();
        tag51.tagName = "<hi!>";
        tag51.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        startTag56.appendTagName("");
        org.jsoup.nodes.Attributes attributes59 = null;
        startTag56.attributes = attributes59;
        startTag56.newAttribute();
        org.jsoup.nodes.Attributes attributes62 = startTag56.getAttributes();
        org.jsoup.parser.Token.Tag tag63 = startTag56.reset();
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        char[] charArray65 = new char[] {};
        startTag64.appendAttributeValue(charArray65);
        org.jsoup.nodes.Attributes attributes67 = startTag64.getAttributes();
        boolean boolean68 = startTag64.isComment();
        startTag64.appendAttributeName("Comment");
        startTag64.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes73 = startTag64.attributes;
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        startTag74.appendTagName("");
        org.jsoup.nodes.Attributes attributes77 = null;
        startTag74.attributes = attributes77;
        org.jsoup.parser.Token.Tag tag79 = startTag74.reset();
        org.jsoup.nodes.Attributes attributes80 = tag79.attributes;
        org.jsoup.parser.Token.StartTag startTag81 = new org.jsoup.parser.Token.StartTag();
        startTag81.appendTagName("");
        org.jsoup.nodes.Attributes attributes84 = null;
        startTag81.attributes = attributes84;
        org.jsoup.parser.Token.Tag tag86 = startTag81.reset();
        org.jsoup.nodes.Attributes attributes87 = tag86.attributes;
        org.jsoup.parser.Token.StartTag startTag88 = new org.jsoup.parser.Token.StartTag();
        char[] charArray89 = new char[] {};
        startTag88.appendAttributeValue(charArray89);
        tag86.appendAttributeValue(charArray89);
        tag79.appendAttributeValue(charArray89);
        startTag64.appendAttributeValue(charArray89);
        startTag56.appendAttributeValue(charArray89);
        tag51.appendAttributeValue(charArray89);
        tag46.appendAttributeValue(charArray89);
        startTag8.appendAttributeValue(charArray89);
        startTag0.appendAttributeValue(charArray89);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] {});
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(attributes80);
        org.junit.Assert.assertNotNull(tag86);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] {});
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        java.lang.String str53 = startTag52.name();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<<hi!>>" + "'", str53, "<<hi!>>");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        java.lang.StringBuilder stringBuilder11 = doctype2.systemIdentifier;
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
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        org.jsoup.parser.Token.Tag tag18 = startTag0.reset();
        boolean boolean19 = startTag0.isSelfClosing();
        startTag0.tagName = "Doctype";
        boolean boolean22 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.normalName = "<hi!>";
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        boolean boolean5 = comment0.isDoctype();
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        org.jsoup.parser.Token.Comment comment3 = comment2.asComment();
        comment3.bogus = true;
        org.jsoup.parser.Token token6 = comment3.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        startTag0.normalName = " ";
        java.lang.String str17 = startTag0.tokenType();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        org.jsoup.parser.Token.Character character4 = character0.data("#");
        org.jsoup.parser.Token.Character character6 = character0.data("4");
        org.jsoup.parser.Token.Character character8 = character6.data("a");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = character8.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        boolean boolean11 = doctype2.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        java.lang.String str3 = doctype0.getPubSysKey();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isEOF();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
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
        startTag0.appendTagName("</commentcomment#>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        tag2.selfClosing = false;
        tag2.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag7 = tag2.name("starttag");
        tag2.appendTagName("a");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        char[] charArray15 = new char[] {};
        startTag14.appendAttributeValue(charArray15);
        org.jsoup.nodes.Attributes attributes17 = startTag14.getAttributes();
        boolean boolean18 = startTag14.isComment();
        org.jsoup.parser.Token.TokenType tokenType19 = startTag14.type;
        startTag14.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag22 = startTag14.asStartTag();
        java.lang.String str23 = startTag14.normalName();
        startTag14.appendAttributeName('4');
        boolean boolean26 = startTag14.isStartTag();
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
        startTag14.appendAttributeValue(intArray85);
        startTag11.appendAttributeValue(intArray85);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
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
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        boolean boolean11 = tag10.selfClosing;
        tag10.newAttribute();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag49 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag50 = tag49.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment51 = tag50.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tag50);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
        org.jsoup.nodes.Attributes attributes16 = null;
        startTag0.attributes = attributes16;
        startTag0.normalName = "";
        boolean boolean20 = startTag0.selfClosing;
        java.lang.String str21 = startTag0.normalName();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
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
        startTag11.appendTagName("<a>");
        org.jsoup.nodes.Attributes attributes51 = startTag11.attributes;
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
        org.junit.Assert.assertNotNull(attributes51);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        org.jsoup.parser.Token.TokenType tokenType8 = doctype2.type;
        java.lang.String str9 = doctype2.getName();
        doctype2.forceQuirks = false;
        doctype2.forceQuirks = false;
        boolean boolean14 = doctype2.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        boolean boolean12 = startTag0.isComment();
        startTag0.tagName = "Commentcomment";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.getData();
        org.jsoup.parser.Token.TokenType tokenType7 = comment0.type;
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        boolean boolean12 = startTag0.isStartTag();
        java.lang.String str13 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag14 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        java.lang.String str4 = character0.getData();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("<a>");
        org.jsoup.parser.Token.Character character9 = character0.data("</commentcomment#>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "comment" + "'", str4, "comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "comment" + "'", str5, "comment");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.pubSysKey = "<Commentcomment>";
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.String str10 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.jsoup.parser.Token.Comment comment8 = comment0.asComment();
        boolean boolean9 = comment8.bogus;
        java.lang.String str10 = comment8.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.tokenType();
        java.lang.String str3 = comment0.tokenType();
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Comment" + "'", str3, "Comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPubSysKey();
        boolean boolean8 = doctype0.isCharacter();
        java.lang.String str9 = doctype0.pubSysKey;
        doctype0.pubSysKey = "";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        java.lang.String str5 = character4.toString();
        java.lang.String str6 = character4.getData();
        org.jsoup.parser.Token.Character character8 = character4.data("comment");
        org.jsoup.parser.Token token9 = character4.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = token9.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Character" + "'", str6, "Character");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isCharacter();
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.selfClosing;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        boolean boolean19 = tag17.isEOF();
        tag17.appendTagName('4');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes9 = tag8.attributes;
        tag8.newAttribute();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        boolean boolean17 = startTag0.isEndTag();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName("");
        org.jsoup.nodes.Attributes attributes21 = null;
        startTag18.attributes = attributes21;
        org.jsoup.parser.Token.Tag tag23 = startTag18.reset();
        org.jsoup.parser.Token.TokenType tokenType24 = tag23.type;
        org.jsoup.nodes.Attributes attributes25 = tag23.getAttributes();
        startTag0.attributes = attributes25;
        startTag0.normalName = "a";
        java.lang.String str29 = startTag0.name();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4" + "'", str29, "4");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        boolean boolean21 = startTag0.selfClosing;
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getSystemIdentifier();
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
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        startTag0.appendTagName('#');
        java.lang.String str7 = startTag0.normalName();
        boolean boolean8 = startTag0.selfClosing;
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#" + "'", str7, "#");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.pubSysKey = "hi!";
        boolean boolean6 = doctype0.isForceQuirks();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        java.lang.String str15 = startTag0.tagName;
        java.lang.String str16 = startTag0.normalName;
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype5.getName();
        org.jsoup.parser.Token token7 = doctype5.reset();
        java.lang.String str8 = doctype5.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getName();
        java.lang.String str4 = doctype0.tokenType();
        doctype0.pubSysKey = "comment";
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        tag12.appendAttributeValue("Character");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName("");
        java.lang.String str18 = startTag15.tagName;
        startTag15.appendAttributeName("hi!");
        boolean boolean21 = startTag15.isSelfClosing();
        startTag15.appendTagName('a');
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
        startTag25.appendAttributeName('4');
        startTag25.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes41 = startTag25.attributes;
        org.jsoup.parser.Token.StartTag startTag42 = startTag15.nameAttr("<Doctype>", attributes41);
        tag12.attributes = attributes41;
        tag12.appendTagName("EOF");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(startTag42);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        boolean boolean3 = comment0.bogus;
        boolean boolean4 = comment0.isEOF();
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        boolean boolean9 = tag8.isEOF();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isStartTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        java.lang.String str11 = startTag8.tagName;
        org.jsoup.parser.Token.Tag tag12 = startTag8.reset();
        java.lang.String str13 = startTag8.tagName;
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
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName("");
        java.lang.String str29 = startTag26.tagName;
        int[] intArray31 = new int[] { 0 };
        startTag26.appendAttributeValue(intArray31);
        startTag14.appendAttributeValue(intArray31);
        startTag8.appendAttributeValue(intArray31);
        startTag0.appendAttributeValue(intArray31);
        org.jsoup.parser.Token.Tag tag36 = startTag0.reset();
        boolean boolean37 = startTag0.isCharacter();
        boolean boolean38 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName("<!---->");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = character0.isEndTag();
        org.jsoup.parser.Token.Character character4 = character0.data("Character");
        java.lang.String str5 = character4.toString();
        java.lang.String str6 = character4.getData();
        org.jsoup.parser.Token.Character character8 = character4.data("comment");
        org.jsoup.parser.Token token9 = character4.reset();
        java.lang.String str10 = character4.tokenType();
        org.jsoup.parser.Token.Character character12 = character4.data("<Commentcomment>");
        java.lang.String str13 = character4.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Character" + "'", str6, "Character");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<Commentcomment>" + "'", str13, "<Commentcomment>");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName("<!---->");
        boolean boolean7 = startTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        boolean boolean5 = doctype2.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype2.name;
        java.lang.StringBuilder stringBuilder7 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        boolean boolean16 = tag7.selfClosing;
        tag7.appendTagName('a');
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
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.jsoup.parser.Token token11 = doctype0.reset();
        boolean boolean12 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        startTag0.appendAttributeName("Doctype");
        startTag0.appendAttributeValue("Character");
        boolean boolean8 = startTag0.isStartTag();
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        startTag0.appendAttributeValue("<Doctype>");
        startTag0.appendTagName("<Commentcomment#>");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        tag3.tagName = "<hi!>";
        tag3.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName("");
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag8.attributes = attributes11;
        startTag8.newAttribute();
        org.jsoup.nodes.Attributes attributes14 = startTag8.getAttributes();
        org.jsoup.parser.Token.Tag tag15 = startTag8.reset();
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
        startTag8.appendAttributeValue(charArray41);
        tag3.appendAttributeValue(charArray41);
        tag3.appendAttributeValue('#');
        java.lang.String str50 = tag3.name();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag15);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<hi!>" + "'", str50, "<hi!>");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token8 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        boolean boolean32 = startTag0.isSelfClosing();
        org.jsoup.parser.Token token33 = startTag0.reset();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(token33);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes11 = startTag9.attributes;
        startTag0.attributes = attributes11;
        startTag0.normalName = "EOF";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        tag18.appendAttributeValue(charArray79);
        java.lang.String str86 = tag18.tagName;
        boolean boolean87 = tag18.selfClosing;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
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
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Comment" + "'", str86, "Comment");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        org.jsoup.parser.Token token7 = doctype2.reset();
        doctype2.forceQuirks = true;
        doctype2.forceQuirks = false;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        boolean boolean18 = startTag0.selfClosing;
        startTag0.appendTagName('4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.tokenType();
        boolean boolean9 = doctype2.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character2.data("hi!");
        java.lang.String str7 = character6.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character6.data("");
        org.jsoup.parser.Token.Character character10 = character6.data("");
        boolean boolean11 = character6.isCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        java.lang.String str4 = character0.toString();
        boolean boolean5 = character0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = character0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "comment" + "'", str4, "comment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        org.jsoup.parser.Token.TokenType tokenType8 = doctype2.type;
        doctype2.forceQuirks = false;
        org.jsoup.parser.Token token11 = doctype2.reset();
        boolean boolean12 = token11.isDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        startTag37.appendTagName('a');
        startTag37.tagName = "Doctype";
        java.lang.String str44 = startTag37.tagName;
        org.jsoup.parser.Token.Tag tag45 = startTag37.reset();
        startTag37.appendTagName('4');
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Doctype" + "'", str44, "Doctype");
        org.junit.Assert.assertNotNull(tag45);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        java.lang.String str42 = tag15.normalName;
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "commentcomment" + "'", str42, "commentcomment");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.isEndTag();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        tag10.appendTagName('a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
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
        java.lang.String str16 = tag15.normalName();
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.tokenType();
        comment0.bogus = true;
        org.jsoup.parser.Token token5 = comment0.reset();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendTagName("");
        java.lang.String str4 = startTag1.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag1.reset();
        java.lang.String str6 = startTag1.tagName;
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
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        java.lang.String str22 = startTag19.tagName;
        int[] intArray24 = new int[] { 0 };
        startTag19.appendAttributeValue(intArray24);
        startTag7.appendAttributeValue(intArray24);
        startTag1.appendAttributeValue(intArray24);
        endTag0.appendAttributeValue(intArray24);
        java.lang.String str29 = endTag0.normalName;
        endTag0.tagName = "commentcomment#";
        endTag0.appendAttributeName('a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        boolean boolean11 = token9.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.tokenType();
        doctype0.pubSysKey = "<Commentcomment#>";
        doctype0.forceQuirks = false;
        boolean boolean12 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        java.lang.String str28 = startTag25.tagName;
        org.jsoup.parser.Token.Tag tag29 = startTag25.reset();
        java.lang.String str30 = startTag25.tagName;
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
        startTag25.appendAttributeValue(intArray48);
        startTag0.appendAttributeValue(intArray48);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character53 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 0 });
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        org.jsoup.parser.Token token3 = character0.reset();
        boolean boolean4 = token3.isDoctype();
        boolean boolean5 = token3.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token token7 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token token9 = comment0.reset();
        org.jsoup.parser.Token token10 = comment0.reset();
        boolean boolean11 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder12 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token token7 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "hi!";
        java.lang.String str8 = doctype2.tokenType();
        java.lang.String str9 = doctype2.getPubSysKey();
        java.lang.StringBuilder stringBuilder10 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        startTag11.appendTagName("4commenta");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.pubSysKey = "hi!";
        boolean boolean6 = doctype0.isForceQuirks();
        doctype0.pubSysKey = "hi!";
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        java.lang.String str8 = comment0.getData();
        java.lang.String str9 = comment0.getData();
        org.jsoup.parser.Token token10 = comment0.reset();
        boolean boolean11 = comment0.isEndTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.String str5 = doctype2.getPublicIdentifier();
        boolean boolean6 = doctype2.isEOF();
        org.jsoup.parser.Token token7 = doctype2.reset();
        java.lang.String str8 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype2.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        doctype0.pubSysKey = "";
        boolean boolean8 = doctype0.isDoctype();
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        java.lang.String str33 = startTag12.normalName();
        org.jsoup.nodes.Attributes attributes34 = startTag12.getAttributes();
        org.jsoup.parser.Token.StartTag startTag35 = startTag0.nameAttr("comment", attributes34);
        org.jsoup.parser.Token.TokenType tokenType36 = startTag0.type;
        java.lang.String str37 = startTag0.normalName();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "comment" + "'", str37, "comment");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        org.jsoup.parser.Token.Tag tag17 = tag11.reset();
        boolean boolean18 = tag11.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        char[] charArray2 = new char[] {};
        startTag1.appendAttributeValue(charArray2);
        startTag1.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes5 = startTag1.getAttributes();
        boolean boolean6 = startTag1.isEOF();
        startTag1.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token10 = doctype9.reset();
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str12 = doctype11.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str14 = doctype13.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType15 = doctype13.type;
        doctype11.type = tokenType15;
        doctype9.type = tokenType15;
        startTag1.type = tokenType15;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag25.attributes;
        startTag22.attributes = attributes26;
        startTag19.attributes = attributes26;
        startTag19.selfClosing = false;
        startTag19.appendAttributeName('4');
        startTag19.newAttribute();
        startTag19.selfClosing = false;
        org.jsoup.parser.Token.Tag tag36 = startTag19.reset();
        tag36.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        org.jsoup.nodes.Attributes attributes42 = startTag39.getAttributes();
        boolean boolean43 = startTag39.isComment();
        startTag39.appendAttributeName("Comment");
        startTag39.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes48 = startTag39.attributes;
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        char[] charArray50 = new char[] {};
        startTag49.appendAttributeValue(charArray50);
        startTag39.appendAttributeValue(charArray50);
        tag36.appendAttributeValue(charArray50);
        startTag1.appendAttributeValue(charArray50);
        startTag0.appendAttributeValue(charArray50);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        char[] charArray58 = new char[] {};
        startTag57.appendAttributeValue(charArray58);
        startTag57.appendAttributeName("hi!");
        startTag57.appendAttributeName('a');
        boolean boolean64 = startTag57.selfClosing;
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        startTag65.appendTagName("");
        org.jsoup.nodes.Attributes attributes68 = null;
        startTag65.attributes = attributes68;
        startTag65.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName("");
        org.jsoup.nodes.Attributes attributes75 = null;
        startTag72.attributes = attributes75;
        org.jsoup.parser.Token.Tag tag77 = startTag72.reset();
        org.jsoup.nodes.Attributes attributes78 = startTag72.attributes;
        startTag65.attributes = attributes78;
        startTag57.attributes = attributes78;
        org.jsoup.parser.Token.StartTag startTag81 = startTag0.nameAttr("4", attributes78);
        java.lang.String str82 = startTag0.toString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(startTag81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "<4>" + "'", str82, "<4>");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        tag2.selfClosing = false;
        tag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag7 = tag2.reset();
        org.jsoup.parser.Token.Tag tag9 = tag2.name("<#>");
        tag9.appendTagName(' ');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        java.lang.String str23 = doctype0.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        java.lang.String str8 = startTag0.name();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
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
        org.jsoup.nodes.Attributes attributes24 = startTag10.attributes;
        startTag0.attributes = attributes24;
        org.jsoup.parser.Token.Tag tag26 = startTag0.reset();
        tag26.finaliseTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.pubSysKey = "hi!";
        boolean boolean6 = doctype0.isForceQuirks();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        char[] charArray9 = new char[] {};
        startTag8.appendAttributeValue(charArray9);
        org.jsoup.nodes.Attributes attributes11 = startTag8.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType12 = startTag8.type;
        doctype0.type = tokenType12;
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder14);
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.isStartTag();
        doctype0.pubSysKey = "</commentcomment#>";
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        startTag0.normalName = "Comment";
        startTag0.appendAttributeName(' ');
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        startTag0.selfClosing = false;
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        boolean boolean12 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag14 = startTag0.name("<!---->4");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        java.lang.String str11 = doctype2.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder12 = doctype2.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.TokenType tokenType10 = startTag0.type;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendTagName("");
        java.lang.String str14 = startTag11.tagName;
        startTag11.setEmptyAttributeValue();
        startTag11.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        char[] charArray19 = new char[] {};
        startTag18.appendAttributeValue(charArray19);
        org.jsoup.nodes.Attributes attributes21 = startTag18.getAttributes();
        boolean boolean22 = startTag18.isComment();
        org.jsoup.parser.Token.TokenType tokenType23 = startTag18.type;
        org.jsoup.parser.Token.Tag tag24 = startTag18.reset();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("");
        org.jsoup.nodes.Attributes attributes28 = null;
        startTag25.attributes = attributes28;
        org.jsoup.parser.Token.Tag tag30 = startTag25.reset();
        org.jsoup.nodes.Attributes attributes31 = startTag25.attributes;
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
        startTag25.appendAttributeValue(intArray49);
        tag24.appendAttributeValue(intArray49);
        startTag11.appendAttributeValue(intArray49);
        startTag0.appendAttributeValue(intArray49);
        startTag0.appendAttributeName("<<comment>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0 });
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isEOF();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.jsoup.parser.Token token8 = eOF0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        boolean boolean7 = startTag0.isEndTag();
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.getData();
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token.Character character5 = character0.data("<#>");
        org.jsoup.parser.Token token6 = character5.reset();
        org.jsoup.parser.Token token7 = character5.reset();
        org.jsoup.parser.Token.Character character9 = character5.data("<Doctype>");
        java.lang.Class<?> wildcardClass10 = character9.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.tokenType();
        comment0.bogus = true;
        comment0.bogus = false;
        comment0.bogus = true;
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        java.lang.String str17 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.nodes.Attributes attributes22 = startTag19.getAttributes();
        startTag19.appendTagName('#');
        startTag19.finaliseTag();
        boolean boolean26 = startTag19.isSelfClosing();
        org.jsoup.nodes.Attributes attributes27 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag28 = startTag0.nameAttr("StartTag", attributes27);
        java.lang.String str29 = startTag28.normalName();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        org.jsoup.nodes.Attributes attributes33 = startTag30.getAttributes();
        boolean boolean34 = startTag30.isComment();
        startTag30.appendAttributeName("Comment");
        startTag30.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes39 = startTag30.attributes;
        startTag28.attributes = attributes39;
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "starttag" + "'", str29, "starttag");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
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
        org.jsoup.parser.Token.Tag tag20 = startTag0.name("hi!");
        java.lang.String str21 = startTag0.normalName;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        startTag16.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes29 = startTag16.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName("");
        org.jsoup.nodes.Attributes attributes33 = null;
        startTag30.attributes = attributes33;
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        org.jsoup.parser.Token.TokenType tokenType36 = tag35.type;
        org.jsoup.nodes.Attributes attributes37 = tag35.getAttributes();
        startTag16.attributes = attributes37;
        boolean boolean39 = startTag16.selfClosing;
        boolean boolean40 = startTag16.isComment();
        startTag16.tagName = "Comment";
        boolean boolean43 = startTag16.isStartTag();
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
        startTag45.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes58 = startTag45.getAttributes();
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        startTag59.appendTagName("");
        org.jsoup.nodes.Attributes attributes62 = null;
        startTag59.attributes = attributes62;
        org.jsoup.parser.Token.Tag tag64 = startTag59.reset();
        org.jsoup.parser.Token.TokenType tokenType65 = tag64.type;
        org.jsoup.nodes.Attributes attributes66 = tag64.getAttributes();
        startTag45.attributes = attributes66;
        org.jsoup.parser.Token.StartTag startTag68 = startTag16.nameAttr("<<hi!>>", attributes66);
        tag14.attributes = attributes66;
        tag14.appendTagName("Commentcomment<<<hi!>>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertTrue("'" + tokenType65 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType65.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(startTag68);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        char[] charArray22 = new char[] {};
        startTag21.appendAttributeValue(charArray22);
        startTag21.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag27 = startTag21.name("Comment");
        startTag21.appendTagName("comment");
        java.lang.String str30 = startTag21.normalName();
        char[] charArray33 = new char[] { '4', '#' };
        startTag21.appendAttributeValue(charArray33);
        startTag21.appendTagName('#');
        java.lang.String str37 = startTag21.normalName;
        org.jsoup.nodes.Attributes attributes38 = startTag21.attributes;
        startTag11.attributes = attributes38;
        org.jsoup.parser.Token.Tag tag41 = startTag11.name("<hi!> ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "commentcomment" + "'", str30, "commentcomment");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "commentcomment#" + "'", str37, "commentcomment#");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(tag41);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
        boolean boolean28 = startTag0.isCharacter();
        startTag0.tagName = "#";
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        org.jsoup.parser.Token.Tag tag26 = startTag11.reset();
        startTag11.appendTagName('a');
        startTag11.appendAttributeName('#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
        org.jsoup.parser.Token.StartTag startTag24 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag25 = startTag24.reset();
        startTag24.appendTagName("<!---->");
        java.lang.String str28 = startTag24.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<<!---->>" + "'", str28, "<<!---->>");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag8 = tag7.reset();
        boolean boolean9 = tag7.isEOF();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        boolean boolean17 = tag16.isSelfClosing();
        tag16.appendTagName('#');
        java.lang.String str20 = tag16.tagName;
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#" + "'", str20, "#");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        startTag0.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes21 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag22 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        boolean boolean8 = doctype2.forceQuirks;
        java.lang.String str9 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "<<<!---->>>";
        java.lang.StringBuilder stringBuilder12 = doctype2.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.TokenType tokenType5 = character0.type;
        org.jsoup.parser.Token.Character character7 = character0.data("Comment");
        java.lang.String str8 = character7.toString();
        boolean boolean9 = character7.isDoctype();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Comment" + "'", str8, "Comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        java.lang.String str4 = character0.toString();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        boolean boolean8 = doctype2.forceQuirks;
        doctype2.pubSysKey = "<<Commentcomment>>";
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        java.lang.String str13 = doctype2.getPublicIdentifier();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
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
        tag21.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes23 = tag21.getAttributes();
        tag21.appendTagName("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag5 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(startTag5);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character2.data("<hi!>");
        org.jsoup.parser.Token token5 = character2.reset();
        java.lang.String str6 = character2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = character2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes7 = startTag0.attributes;
        startTag0.finaliseTag();
        startTag0.selfClosing = false;
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
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
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag17 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        org.jsoup.parser.Token token5 = doctype2.reset();
        doctype2.forceQuirks = true;
        boolean boolean8 = doctype2.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype2.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("<!---->");
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token.Character character8 = character0.data("");
        org.jsoup.parser.Token token9 = character8.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        org.jsoup.parser.Token.StartTag startTag27 = tag26.asStartTag();
        tag26.selfClosing = false;
        org.jsoup.parser.Token.Tag tag30 = tag26.reset();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.asStartTag();
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag9);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        startTag11.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        startTag0.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        java.lang.String str10 = startTag0.tokenType();
        boolean boolean11 = startTag0.isEOF();
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
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
        startTag0.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes21 = startTag0.getAttributes();
        boolean boolean22 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        boolean boolean8 = tag7.isComment();
        java.lang.String str9 = tag7.tagName;
        org.jsoup.parser.Token.Tag tag10 = tag7.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Comment" + "'", str9, "Comment");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        boolean boolean5 = doctype2.forceQuirks;
        java.lang.String str6 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "<StartTag>";
        boolean boolean9 = doctype2.isForceQuirks();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        java.lang.String str19 = startTag0.normalName;
        boolean boolean20 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        startTag0.appendAttributeValue('a');
        java.lang.String str10 = startTag0.normalName();
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
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendTagName("");
        java.lang.String str26 = startTag23.tagName;
        int[] intArray28 = new int[] { 0 };
        startTag23.appendAttributeValue(intArray28);
        startTag11.appendAttributeValue(intArray28);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        startTag31.appendTagName("");
        org.jsoup.nodes.Attributes attributes34 = null;
        startTag31.attributes = attributes34;
        org.jsoup.parser.Token.Tag tag36 = startTag31.reset();
        org.jsoup.nodes.Attributes attributes37 = tag36.attributes;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        tag36.appendAttributeValue(charArray39);
        startTag11.appendAttributeValue(charArray39);
        startTag0.appendAttributeValue(charArray39);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes46 = startTag45.attributes;
        startTag45.tagName = "hi!";
        org.jsoup.parser.Token.Tag tag49 = startTag45.reset();
        java.lang.String str50 = tag49.tokenType();
        org.jsoup.nodes.Attributes attributes51 = tag49.attributes;
        org.jsoup.parser.Token.StartTag startTag52 = startTag0.nameAttr("<hi!>4", attributes51);
        boolean boolean53 = startTag52.isSelfClosing();
        startTag52.appendAttributeValue('#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "StartTag" + "'", str50, "StartTag");
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
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
        doctype2.pubSysKey = "<!---->";
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
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        tag10.appendAttributeName('#');
        tag10.appendAttributeName("Comment");
        tag10.appendTagName('#');
        boolean boolean17 = tag10.isEndTag();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        startTag11.finaliseTag();
        boolean boolean16 = startTag11.selfClosing;
        boolean boolean17 = startTag11.isEndTag();
        org.jsoup.parser.Token.Tag tag18 = startTag11.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token6 = doctype0.reset();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
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
        startTag0.appendAttributeValue(' ');
        boolean boolean21 = startTag0.isSelfClosing();
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
        char[] charArray39 = new char[] {};
        startTag38.appendAttributeValue(charArray39);
        startTag22.appendAttributeValue(charArray39);
        startTag0.appendAttributeValue(charArray39);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
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
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag49 = startTag0.reset();
        boolean boolean50 = startTag0.isSelfClosing();
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
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
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
        boolean boolean27 = startTag0.isEOF();
        startTag0.appendAttributeValue('4');
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
        startTag30.appendAttributeName("<!---->");
        boolean boolean55 = startTag30.isStartTag();
        boolean boolean56 = startTag30.selfClosing;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        startTag58.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        char[] charArray62 = new char[] {};
        startTag61.appendAttributeValue(charArray62);
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes65 = startTag64.attributes;
        startTag61.attributes = attributes65;
        startTag58.attributes = attributes65;
        org.jsoup.parser.Token.Tag tag69 = startTag58.name("Doctype");
        org.jsoup.nodes.Attributes attributes70 = startTag58.getAttributes();
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        char[] charArray76 = new char[] {};
        startTag75.appendAttributeValue(charArray76);
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes79 = startTag78.attributes;
        startTag75.attributes = attributes79;
        startTag72.attributes = attributes79;
        startTag72.selfClosing = false;
        startTag72.appendAttributeName('#');
        java.lang.String str86 = startTag72.normalName;
        org.jsoup.nodes.Attributes attributes87 = startTag72.attributes;
        org.jsoup.parser.Token.StartTag startTag88 = startTag58.nameAttr("Commentcomment", attributes87);
        org.jsoup.parser.Token.StartTag startTag89 = startTag30.nameAttr("Doctype", attributes87);
        org.jsoup.parser.Token.Tag tag90 = startTag89.reset();
        org.jsoup.nodes.Attributes attributes91 = startTag89.getAttributes();
        startTag0.attributes = attributes91;
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] {});
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertNotNull(tag90);
        org.junit.Assert.assertNotNull(attributes91);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token.Character character5 = character0.data("commentcomment#");
        org.jsoup.parser.Token token6 = character5.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        java.lang.String str8 = comment0.getData();
        java.lang.String str9 = comment0.getData();
        org.jsoup.parser.Token token10 = comment0.reset();
        boolean boolean11 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
        startTag0.appendAttributeValue('a');
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName("");
        java.lang.String str31 = startTag28.tagName;
        startTag28.appendAttributeName("hi!");
        boolean boolean34 = startTag28.isSelfClosing();
        org.jsoup.parser.Token.Tag tag35 = startTag28.reset();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        char[] charArray37 = new char[] {};
        startTag36.appendAttributeValue(charArray37);
        startTag36.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag42 = startTag36.name("Comment");
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        startTag43.appendTagName("");
        org.jsoup.nodes.Attributes attributes46 = null;
        startTag43.attributes = attributes46;
        startTag43.appendTagName("");
        java.lang.String str50 = startTag43.tagName;
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
        startTag43.appendAttributeValue(intArray68);
        tag42.appendAttributeValue(intArray68);
        tag35.appendAttributeValue(intArray68);
        startTag0.appendAttributeValue(intArray68);
        java.lang.String str75 = startTag0.normalName;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] {});
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 0 });
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        org.jsoup.parser.Token.Tag tag14 = tag7.reset();
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
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        boolean boolean8 = doctype2.forceQuirks;
        java.lang.String str9 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "<<<!---->>>";
        java.lang.String str12 = doctype2.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("Comment");
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
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
        startTag0.appendAttributeValue("comment");
        startTag0.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag29 = startTag0.reset();
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
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        tag47.appendTagName("commentcomment");
        java.lang.String str50 = tag47.name();
        org.jsoup.nodes.Attributes attributes51 = tag47.attributes;
        boolean boolean52 = tag47.isStartTag();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<hi!>commentcomment" + "'", str50, "<hi!>commentcomment");
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName('#');
        java.lang.String str8 = startTag0.name();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
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
        org.jsoup.nodes.Attributes attributes24 = startTag10.attributes;
        startTag0.attributes = attributes24;
        org.jsoup.nodes.Attributes attributes26 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes27 = startTag0.getAttributes();
        java.lang.String str28 = startTag0.normalName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character5 = character0.asCharacter();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("Comment");
        java.lang.String str8 = startTag0.normalName();
        boolean boolean9 = startTag0.selfClosing;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        boolean boolean12 = tag11.isEOF();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "comment" + "'", str8, "comment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "comment" + "'", str10, "comment");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        java.lang.String str17 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.nodes.Attributes attributes22 = startTag19.getAttributes();
        startTag19.appendTagName('#');
        startTag19.finaliseTag();
        boolean boolean26 = startTag19.isSelfClosing();
        org.jsoup.nodes.Attributes attributes27 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag28 = startTag0.nameAttr("StartTag", attributes27);
        startTag28.finaliseTag();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag28);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isComment();
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<a>");
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
        boolean boolean29 = doctype0.isStartTag();
        java.lang.String str30 = doctype0.getName();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        tag6.normalName = "starttag";
        java.lang.String str9 = tag6.normalName;
        tag6.appendTagName("");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "starttag" + "'", str9, "starttag");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character5 = character0.asCharacter();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendTagName("");
        java.lang.String str9 = startTag6.tagName;
        startTag6.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = startTag12.attributes;
        startTag12.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes16 = startTag12.getAttributes();
        org.jsoup.parser.Token.StartTag startTag17 = startTag6.nameAttr("", attributes16);
        java.lang.String str18 = startTag17.tagName;
        startTag17.appendAttributeName("<!---->");
        startTag17.appendAttributeName('#');
        startTag17.normalName = "<!---->";
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str26 = doctype25.getPublicIdentifier();
        java.lang.String str27 = doctype25.getPublicIdentifier();
        boolean boolean28 = doctype25.isDoctype();
        java.lang.String str29 = doctype25.getName();
        boolean boolean30 = doctype25.isForceQuirks();
        org.jsoup.parser.Token token31 = doctype25.reset();
        boolean boolean32 = doctype25.isDoctype();
        java.lang.String str33 = doctype25.getName();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.EndTag;
        doctype25.type = tokenType34;
        startTag17.type = tokenType34;
        character0.type = tokenType34;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(token31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        org.jsoup.parser.Token.Tag tag31 = startTag27.reset();
        startTag27.appendAttributeValue("<commentcomment>");
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
        org.junit.Assert.assertNotNull(tag31);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        startTag59.appendTagName(' ');
        startTag59.appendAttributeName("");
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
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getName();
        java.lang.StringBuilder stringBuilder9 = doctype2.name;
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.tokenType();
        boolean boolean2 = comment0.isComment();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.isCharacter();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        org.jsoup.parser.Token token7 = comment6.reset();
        boolean boolean8 = comment6.bogus;
        comment6.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        boolean boolean54 = tag53.isCharacter();
        boolean boolean55 = tag53.isStartTag();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
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
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("");
        org.jsoup.parser.Token.Tag tag17 = startTag11.reset();
        boolean boolean18 = startTag11.isSelfClosing();
        startTag11.appendAttributeName("<<Comment>>");
        startTag11.normalName = "<StartTag>";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = startTag11.name();
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
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isCharacter();
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<<<hi!>>>");
        boolean boolean10 = startTag0.isDoctype();
        startTag0.newAttribute();
        java.lang.String str12 = startTag0.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<<<hi!>>>" + "'", str12, "<<<hi!>>>");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        java.lang.String str32 = startTag30.toString();
        boolean boolean33 = startTag30.isCharacter();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<Commentcomment>" + "'", str32, "<Commentcomment>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        tag7.setEmptyAttributeValue();
        java.lang.String str10 = tag7.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = tag7.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        startTag0.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.normalName = "<Commentcomment#>";
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("<Commentcomment#>");
        tag11.tagName = "<<<!---->>>";
        org.jsoup.parser.Token.Tag tag15 = tag11.name("<Commentcomment#>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.StringBuilder stringBuilder4 = comment2.data;
        org.jsoup.parser.Token token5 = comment2.reset();
        boolean boolean6 = comment2.isEndTag();
        org.jsoup.parser.Token token7 = comment2.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
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
        org.jsoup.parser.Token token11 = doctype0.reset();
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
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.tokenType();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token token5 = character0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = character0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        char[] charArray32 = new char[] {};
        startTag31.appendAttributeValue(charArray32);
        startTag31.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes35 = startTag31.getAttributes();
        boolean boolean36 = startTag31.isEOF();
        startTag31.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token40 = doctype39.reset();
        org.jsoup.parser.Token.Doctype doctype41 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str42 = doctype41.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype43 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str44 = doctype43.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType45 = doctype43.type;
        doctype41.type = tokenType45;
        doctype39.type = tokenType45;
        startTag31.type = tokenType45;
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        char[] charArray53 = new char[] {};
        startTag52.appendAttributeValue(charArray53);
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = startTag55.attributes;
        startTag52.attributes = attributes56;
        startTag49.attributes = attributes56;
        startTag49.selfClosing = false;
        startTag49.appendAttributeName('4');
        startTag49.newAttribute();
        startTag49.selfClosing = false;
        org.jsoup.parser.Token.Tag tag66 = startTag49.reset();
        tag66.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        char[] charArray70 = new char[] {};
        startTag69.appendAttributeValue(charArray70);
        org.jsoup.nodes.Attributes attributes72 = startTag69.getAttributes();
        boolean boolean73 = startTag69.isComment();
        startTag69.appendAttributeName("Comment");
        startTag69.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes78 = startTag69.attributes;
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        char[] charArray80 = new char[] {};
        startTag79.appendAttributeValue(charArray80);
        startTag69.appendAttributeValue(charArray80);
        tag66.appendAttributeValue(charArray80);
        startTag31.appendAttributeValue(charArray80);
        startTag30.appendAttributeValue(charArray80);
        startTag0.appendAttributeValue(charArray80);
        startTag0.newAttribute();
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
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] {});
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] {});
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        java.lang.String str4 = doctype2.getSystemIdentifier();
        java.lang.String str5 = doctype2.pubSysKey;
        doctype2.forceQuirks = false;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        startTag0.appendTagName(' ');
        org.jsoup.parser.Token.Tag tag18 = startTag0.reset();
        tag18.appendTagName("Commentcomment");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag0.appendAttributeValue("Character");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.nodes.Attributes attributes14 = startTag11.getAttributes();
        startTag11.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag17 = startTag11.asStartTag();
        startTag17.normalName = "<Commentcomment>";
        java.lang.String str20 = startTag17.normalName();
        boolean boolean21 = startTag17.isDoctype();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.nodes.Attributes attributes25 = startTag22.getAttributes();
        boolean boolean26 = startTag22.isComment();
        startTag22.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag29 = startTag22.reset();
        org.jsoup.parser.Token.TokenType tokenType30 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag22.type = tokenType30;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        char[] charArray36 = new char[] {};
        startTag35.appendAttributeValue(charArray36);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = startTag38.attributes;
        startTag35.attributes = attributes39;
        startTag32.attributes = attributes39;
        java.lang.String str42 = startTag32.normalName;
        org.jsoup.parser.Token.Tag tag43 = startTag32.reset();
        org.jsoup.parser.Token.Tag tag44 = startTag32.reset();
        startTag32.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag48 = startTag47.reset();
        org.jsoup.nodes.Attributes attributes49 = startTag47.attributes;
        org.jsoup.parser.Token.StartTag startTag50 = startTag32.nameAttr("", attributes49);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName("");
        org.jsoup.nodes.Attributes attributes54 = null;
        startTag51.attributes = attributes54;
        org.jsoup.parser.Token.Tag tag56 = startTag51.reset();
        org.jsoup.nodes.Attributes attributes57 = startTag51.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        startTag58.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        char[] charArray62 = new char[] {};
        startTag61.appendAttributeValue(charArray62);
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes65 = startTag64.attributes;
        startTag61.attributes = attributes65;
        startTag58.attributes = attributes65;
        startTag58.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        startTag70.appendTagName("");
        java.lang.String str73 = startTag70.tagName;
        int[] intArray75 = new int[] { 0 };
        startTag70.appendAttributeValue(intArray75);
        startTag58.appendAttributeValue(intArray75);
        startTag51.appendAttributeValue(intArray75);
        startTag50.appendAttributeValue(intArray75);
        startTag22.appendAttributeValue(intArray75);
        startTag17.appendAttributeValue(intArray75);
        startTag0.appendAttributeValue(intArray75);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<Commentcomment>" + "'", str20, "<Commentcomment>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] {});
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 0 });
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token token7 = startTag0.reset();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        startTag6.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        boolean boolean12 = startTag11.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = startTag11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        boolean boolean3 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        char[] charArray8 = new char[] {};
        startTag7.appendAttributeValue(charArray8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = startTag10.attributes;
        startTag7.attributes = attributes11;
        startTag4.attributes = attributes11;
        startTag4.selfClosing = false;
        startTag4.appendAttributeName('4');
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.String str19 = comment18.tokenType();
        boolean boolean20 = comment18.isComment();
        java.lang.StringBuilder stringBuilder21 = comment18.data;
        java.lang.StringBuilder stringBuilder22 = comment18.data;
        boolean boolean23 = comment18.isCharacter();
        java.lang.StringBuilder stringBuilder24 = comment18.data;
        org.jsoup.parser.Token.TokenType tokenType25 = comment18.type;
        startTag4.type = tokenType25;
        startTag0.type = tokenType25;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        char[] charArray29 = new char[] {};
        startTag28.appendAttributeValue(charArray29);
        startTag0.appendAttributeValue(charArray29);
        startTag0.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Comment" + "'", str19, "Comment");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        char[] charArray13 = new char[] {};
        startTag12.appendAttributeValue(charArray13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = startTag15.attributes;
        startTag12.attributes = attributes16;
        startTag9.attributes = attributes16;
        startTag9.selfClosing = false;
        startTag9.appendAttributeName('4');
        startTag9.newAttribute();
        startTag9.selfClosing = false;
        org.jsoup.parser.Token.Tag tag26 = startTag9.reset();
        tag26.appendAttributeName("Comment");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        char[] charArray30 = new char[] {};
        startTag29.appendAttributeValue(charArray30);
        org.jsoup.nodes.Attributes attributes32 = startTag29.getAttributes();
        boolean boolean33 = startTag29.isComment();
        startTag29.appendAttributeName("Comment");
        startTag29.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes38 = startTag29.attributes;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        char[] charArray40 = new char[] {};
        startTag39.appendAttributeValue(charArray40);
        startTag29.appendAttributeValue(charArray40);
        tag26.appendAttributeValue(charArray40);
        startTag0.appendAttributeValue(charArray40);
        java.lang.String str45 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        startTag24.normalName = "";
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
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character0.getData();
        boolean boolean4 = character0.isEOF();
        java.lang.String str5 = character0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = character0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character0.getData();
        boolean boolean4 = character0.isEOF();
        org.jsoup.parser.Token token5 = character0.reset();
        java.lang.String str6 = character0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        doctype0.pubSysKey = "4";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isCharacter();
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<<<hi!>>>");
        boolean boolean10 = startTag0.isDoctype();
        startTag0.newAttribute();
        startTag0.normalName = "<<<!---->>>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str11 = doctype10.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype10.type;
        doctype8.type = tokenType12;
        doctype6.type = tokenType12;
        doctype0.type = tokenType12;
        java.lang.StringBuilder stringBuilder16 = doctype0.name;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        java.lang.String str3 = character0.toString();
        boolean boolean4 = character0.isEOF();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!");
        org.jsoup.parser.Token.Character character8 = character0.data("Commentcomment<<<hi!>>>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        java.lang.String str21 = startTag0.name();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>" + "'", str18, "<hi!>");
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!>" + "'", str20, "<hi!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!>" + "'", str21, "<hi!>");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
        startTag0.appendAttributeValue('a');
        boolean boolean40 = startTag0.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.forceQuirks = false;
        boolean boolean8 = doctype0.isCharacter();
        java.lang.String str9 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        java.lang.String str11 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.pubSysKey = "<Commentcomment>";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.tokenType();
        doctype0.pubSysKey = "Doctype";
        doctype0.pubSysKey = "#";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.tokenType();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token token7 = doctype0.reset();
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendAttributeName('a');
        boolean boolean7 = startTag0.isStartTag();
        startTag0.normalName = "4";
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        char[] charArray11 = new char[] {};
        startTag10.appendAttributeValue(charArray11);
        org.jsoup.nodes.Attributes attributes13 = startTag10.getAttributes();
        boolean boolean14 = startTag10.isComment();
        org.jsoup.parser.Token.TokenType tokenType15 = startTag10.type;
        startTag10.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag18 = startTag10.asStartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag10.name("Comment");
        startTag10.newAttribute();
        org.jsoup.nodes.Attributes attributes22 = startTag10.getAttributes();
        char[] charArray29 = new char[] { ' ', 'a', '#', '#', '4', ' ' };
        startTag10.appendAttributeValue(charArray29);
        startTag0.appendAttributeValue(charArray29);
        org.jsoup.parser.Token.Tag tag33 = startTag0.name("4commenta");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', 'a', '#', '#', '4', ' ' });
        org.junit.Assert.assertNotNull(tag33);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<hi!>");
        startTag0.appendAttributeValue(" ");
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        startTag12.appendTagName('a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag16 = startTag0.asStartTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag16);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.getData();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token token8 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
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
        startTag0.appendAttributeValue(' ');
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
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.jsoup.parser.Token.Character character5 = character0.data("commentcomment");
        java.lang.String str6 = character5.toString();
        java.lang.String str7 = character5.tokenType();
        org.jsoup.parser.Token token8 = character5.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "commentcomment" + "'", str6, "commentcomment");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        startTag0.appendAttributeValue(' ');
        boolean boolean18 = startTag0.isCharacter();
        startTag0.appendTagName('#');
        startTag0.normalName = "StartTag";
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
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
        java.lang.String str31 = comment0.getData();
        java.lang.String str32 = comment0.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!---->" + "'", str32, "<!---->");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        boolean boolean5 = doctype2.forceQuirks;
        java.lang.String str6 = doctype2.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype2.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype2.publicIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        org.jsoup.parser.Token token3 = character0.reset();
        java.lang.String str4 = character0.getData();
        org.jsoup.parser.Token.TokenType tokenType5 = character0.type;
        java.lang.String str6 = character0.getData();
        boolean boolean7 = character0.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        doctype0.forceQuirks = false;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.pubSysKey;
        boolean boolean6 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
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
        boolean boolean16 = comment0.bogus;
        java.lang.String str17 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Comment" + "'", str1, "Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.jsoup.parser.Token.Comment comment2 = token1.asComment();
        boolean boolean3 = comment2.isStartTag();
        java.lang.StringBuilder stringBuilder4 = comment2.data;
        java.lang.String str5 = comment2.toString();
        java.lang.String str6 = comment2.getData();
        org.jsoup.parser.Token token7 = comment2.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.isStartTag();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType11 = comment0.type;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
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
        startTag37.appendTagName('a');
        java.lang.String str42 = startTag37.tagName;
        org.jsoup.nodes.Attributes attributes43 = startTag37.getAttributes();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "commenta" + "'", str42, "commenta");
        org.junit.Assert.assertNotNull(attributes43);
    }
}

