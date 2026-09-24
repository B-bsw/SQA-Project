package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.getData();
        org.jsoup.parser.Token.Character character4 = character0.data("<Commentcomment>");
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token.Character character7 = character0.data("<Comment>");
        java.lang.String str8 = character7.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<Commentcomment>" + "'", str5, "<Commentcomment>");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<Comment>" + "'", str8, "<Comment>");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token token5 = character0.reset();
        java.lang.String str6 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        startTag0.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes24 = startTag0.attributes;
        startTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.String str2 = doctype0.getPubSysKey();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype7.pubSysKey;
        java.lang.StringBuilder stringBuilder9 = doctype7.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        tag4.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes6 = tag4.attributes;
        tag4.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes8 = tag4.getAttributes();
        tag4.appendTagName("<a>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendAttributeValue("<Doctype>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag0.type;
        java.lang.String str10 = startTag0.normalName;
        startTag0.newAttribute();
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
        org.jsoup.parser.Token.StartTag startTag25 = startTag13.asStartTag();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        org.jsoup.nodes.Attributes attributes30 = startTag27.getAttributes();
        boolean boolean31 = startTag27.isComment();
        org.jsoup.parser.Token.TokenType tokenType32 = startTag27.type;
        startTag27.selfClosing = true;
        org.jsoup.parser.Token.Tag tag35 = startTag27.reset();
        org.jsoup.nodes.Attributes attributes36 = tag35.attributes;
        org.jsoup.parser.Token.StartTag startTag37 = startTag13.nameAttr("comment", attributes36);
        org.jsoup.parser.Token.StartTag startTag38 = startTag0.nameAttr("<Commentcomment>", attributes36);
        boolean boolean39 = startTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = startTag0.type;
        java.lang.String str9 = startTag0.normalName;
        startTag0.finaliseTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        startTag0.tagName = "hi!";
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.tagName = "<<!---->>";
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "a";
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token token6 = doctype0.reset();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        startTag0.appendTagName("comment");
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token token11 = tag10.reset();
        org.jsoup.parser.Token.TokenType tokenType12 = token11.type;
        java.lang.Class<?> wildcardClass13 = token11.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "commentcomment" + "'", str9, "commentcomment");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character6.toString();
        boolean boolean8 = character6.isComment();
        org.jsoup.parser.Token.Character character10 = character6.data("4");
        java.lang.String str11 = character10.toString();
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
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        java.lang.String str13 = startTag0.tagName;
        boolean boolean14 = startTag0.isComment();
        org.jsoup.nodes.Attributes attributes15 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        char[] charArray20 = new char[] {};
        startTag19.appendAttributeValue(charArray20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = startTag22.attributes;
        startTag19.attributes = attributes23;
        startTag16.attributes = attributes23;
        boolean boolean26 = startTag16.isSelfClosing();
        startTag16.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.TokenType tokenType29 = startTag16.type;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        org.jsoup.nodes.Attributes attributes33 = startTag30.getAttributes();
        boolean boolean34 = startTag30.isComment();
        startTag30.appendAttributeName("Comment");
        startTag30.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes39 = startTag30.attributes;
        java.lang.String str40 = startTag30.tokenType();
        org.jsoup.parser.Token.Tag tag41 = startTag30.reset();
        startTag30.tagName = "<#>";
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        startTag44.appendTagName("");
        java.lang.String str47 = startTag44.tagName;
        startTag44.appendAttributeName("hi!");
        boolean boolean50 = startTag44.isSelfClosing();
        org.jsoup.parser.Token.Tag tag51 = startTag44.reset();
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        char[] charArray53 = new char[] {};
        startTag52.appendAttributeValue(charArray53);
        startTag52.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag58 = startTag52.name("Comment");
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        startTag59.appendTagName("");
        org.jsoup.nodes.Attributes attributes62 = null;
        startTag59.attributes = attributes62;
        startTag59.appendTagName("");
        java.lang.String str66 = startTag59.tagName;
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        startTag67.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        char[] charArray71 = new char[] {};
        startTag70.appendAttributeValue(charArray71);
        org.jsoup.parser.Token.StartTag startTag73 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes74 = startTag73.attributes;
        startTag70.attributes = attributes74;
        startTag67.attributes = attributes74;
        startTag67.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        startTag79.appendTagName("");
        java.lang.String str82 = startTag79.tagName;
        int[] intArray84 = new int[] { 0 };
        startTag79.appendAttributeValue(intArray84);
        startTag67.appendAttributeValue(intArray84);
        startTag59.appendAttributeValue(intArray84);
        tag58.appendAttributeValue(intArray84);
        tag51.appendAttributeValue(intArray84);
        startTag30.appendAttributeValue(intArray84);
        startTag16.appendAttributeValue(intArray84);
        startTag0.appendAttributeValue(intArray84);
        java.lang.String str93 = startTag0.normalName();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!>" + "'", str13, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "StartTag" + "'", str40, "StartTag");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] {});
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] {});
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "<hi!>" + "'", str93, "<hi!>");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character6.toString();
        boolean boolean8 = character6.isComment();
        org.jsoup.parser.Token token9 = character6.reset();
        org.jsoup.parser.Token token10 = character6.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        java.lang.String str12 = doctype0.getName();
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        startTag14.appendTagName("");
        java.lang.String str17 = startTag14.tagName;
        startTag14.appendAttributeName("hi!");
        boolean boolean20 = startTag14.isSelfClosing();
        org.jsoup.parser.Token.Tag tag21 = startTag14.reset();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        startTag22.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag28 = startTag22.name("Comment");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("");
        org.jsoup.nodes.Attributes attributes32 = null;
        startTag29.attributes = attributes32;
        startTag29.appendTagName("");
        java.lang.String str36 = startTag29.tagName;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        startTag37.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        char[] charArray41 = new char[] {};
        startTag40.appendAttributeValue(charArray41);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = startTag43.attributes;
        startTag40.attributes = attributes44;
        startTag37.attributes = attributes44;
        startTag37.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendTagName("");
        java.lang.String str52 = startTag49.tagName;
        int[] intArray54 = new int[] { 0 };
        startTag49.appendAttributeValue(intArray54);
        startTag37.appendAttributeValue(intArray54);
        startTag29.appendAttributeValue(intArray54);
        tag28.appendAttributeValue(intArray54);
        tag21.appendAttributeValue(intArray54);
        startTag0.appendAttributeValue(intArray54);
        boolean boolean61 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        tag16.newAttribute();
        tag16.appendAttributeValue("commentcomment#");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName("<!---->");
        startTag0.setEmptyAttributeValue();
        startTag0.selfClosing = true;
        org.jsoup.parser.Token token10 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        java.lang.String str12 = startTag0.normalName;
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
        org.jsoup.nodes.Attributes attributes26 = startTag13.attributes;
        startTag13.appendAttributeName("Character");
        startTag13.finaliseTag();
        startTag13.appendAttributeValue('#');
        startTag13.appendAttributeName("Character");
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        startTag34.appendTagName("");
        java.lang.String str37 = startTag34.tagName;
        startTag34.setEmptyAttributeValue();
        startTag34.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        char[] charArray42 = new char[] {};
        startTag41.appendAttributeValue(charArray42);
        org.jsoup.nodes.Attributes attributes44 = startTag41.getAttributes();
        boolean boolean45 = startTag41.isComment();
        org.jsoup.parser.Token.TokenType tokenType46 = startTag41.type;
        org.jsoup.parser.Token.Tag tag47 = startTag41.reset();
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        startTag48.appendTagName("");
        org.jsoup.nodes.Attributes attributes51 = null;
        startTag48.attributes = attributes51;
        org.jsoup.parser.Token.Tag tag53 = startTag48.reset();
        org.jsoup.nodes.Attributes attributes54 = startTag48.attributes;
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        startTag55.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        char[] charArray59 = new char[] {};
        startTag58.appendAttributeValue(charArray59);
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes62 = startTag61.attributes;
        startTag58.attributes = attributes62;
        startTag55.attributes = attributes62;
        startTag55.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        startTag67.appendTagName("");
        java.lang.String str70 = startTag67.tagName;
        int[] intArray72 = new int[] { 0 };
        startTag67.appendAttributeValue(intArray72);
        startTag55.appendAttributeValue(intArray72);
        startTag48.appendAttributeValue(intArray72);
        tag47.appendAttributeValue(intArray72);
        startTag34.appendAttributeValue(intArray72);
        startTag13.appendAttributeValue(intArray72);
        startTag0.appendAttributeValue(intArray72);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 0 });
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        comment0.bogus = false;
        java.lang.String str16 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        tag16.normalName = "<<hi!>>";
        org.jsoup.parser.Token.Tag tag20 = tag16.name("<Commentcomment>");
        tag16.appendAttributeValue("<<Comment>>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        java.lang.String str13 = startTag0.normalName();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isCharacter();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.String str8 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        java.lang.String str32 = endTag0.toString();
        java.lang.String str33 = endTag0.toString();
        java.lang.String str34 = endTag0.toString();
        java.lang.String str35 = endTag0.toString();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</commentcomment#>" + "'", str32, "</commentcomment#>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "</commentcomment#>" + "'", str33, "</commentcomment#>");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "</commentcomment#>" + "'", str34, "</commentcomment#>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "</commentcomment#>" + "'", str35, "</commentcomment#>");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        org.jsoup.parser.Token.TokenType tokenType25 = startTag11.type;
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
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.tokenType();
        boolean boolean9 = doctype2.isDoctype();
        java.lang.String str10 = doctype2.getPublicIdentifier();
        boolean boolean11 = doctype2.isDoctype();
        java.lang.String str12 = doctype2.getPubSysKey();
        org.jsoup.parser.Token.TokenType tokenType13 = doctype2.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        startTag0.finaliseTag();
        startTag0.appendAttributeName("<StartTag>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        java.lang.String str53 = startTag37.normalName();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<<!---->>" + "'", str53, "<<!---->>");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        startTag0.appendTagName("<!---->");
        boolean boolean7 = startTag0.selfClosing;
        startTag0.appendTagName("Doctype");
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.nodes.Attributes attributes14 = startTag11.getAttributes();
        boolean boolean15 = startTag11.isComment();
        startTag11.appendAttributeName("Comment");
        org.jsoup.parser.Token.Tag tag18 = startTag11.reset();
        java.lang.String str19 = tag18.tagName;
        boolean boolean20 = tag18.isCharacter();
        org.jsoup.nodes.Attributes attributes21 = tag18.attributes;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        char[] charArray23 = new char[] {};
        startTag22.appendAttributeValue(charArray23);
        org.jsoup.nodes.Attributes attributes25 = startTag22.getAttributes();
        boolean boolean26 = startTag22.isComment();
        org.jsoup.parser.Token.TokenType tokenType27 = startTag22.type;
        startTag22.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = startTag22.reset();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        startTag31.appendTagName("");
        org.jsoup.nodes.Attributes attributes34 = null;
        startTag31.attributes = attributes34;
        org.jsoup.parser.Token.Tag tag36 = startTag31.reset();
        org.jsoup.nodes.Attributes attributes37 = tag36.attributes;
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
        tag36.appendAttributeValue(charArray46);
        tag30.appendAttributeValue(charArray46);
        tag18.appendAttributeValue(charArray46);
        startTag0.appendAttributeValue(charArray46);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        startTag11.normalName = "<<Commentcomment>>";
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
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType6 = tag5.type;
        boolean boolean7 = tag5.isComment();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        startTag0.appendTagName("Commentcomment");
        java.lang.String str47 = startTag0.normalName;
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "commentcomment" + "'", str47, "commentcomment");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        boolean boolean4 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag0.appendAttributeName(' ');
        startTag0.tagName = "starttag";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str5 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.appendTagName('4');
        java.lang.String str4 = tag1.name();
        boolean boolean5 = tag1.isDoctype();
        boolean boolean6 = tag1.selfClosing;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        tag6.appendTagName('4');
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
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        boolean boolean62 = startTag0.isEOF();
        startTag0.tagName = "<4>";
        org.jsoup.parser.Token.StartTag startTag65 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag66 = startTag65.reset();
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertNotNull(tag66);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        java.lang.String str6 = character5.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str5 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        char[] charArray19 = new char[] {};
        startTag18.appendAttributeValue(charArray19);
        org.jsoup.nodes.Attributes attributes21 = startTag18.getAttributes();
        boolean boolean22 = startTag18.isComment();
        org.jsoup.parser.Token.TokenType tokenType23 = startTag18.type;
        startTag18.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag26 = startTag18.asStartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag18.name("Comment");
        org.jsoup.parser.Token.Tag tag29 = startTag18.reset();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        org.jsoup.nodes.Attributes attributes33 = startTag30.getAttributes();
        boolean boolean34 = startTag30.isComment();
        org.jsoup.parser.Token.TokenType tokenType35 = startTag30.type;
        startTag30.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag38 = startTag30.asStartTag();
        org.jsoup.parser.Token.Tag tag40 = startTag30.name("Comment");
        startTag30.newAttribute();
        org.jsoup.nodes.Attributes attributes42 = startTag30.getAttributes();
        startTag18.attributes = attributes42;
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag18.nameAttr("<!---->", attributes45);
        boolean boolean47 = startTag46.isDoctype();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        char[] charArray50 = new char[] {};
        startTag49.appendAttributeValue(charArray50);
        startTag49.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag55 = startTag49.name("Comment");
        boolean boolean56 = tag55.selfClosing;
        org.jsoup.nodes.Attributes attributes57 = tag55.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = startTag46.nameAttr(" ", attributes57);
        org.jsoup.parser.Token.StartTag startTag59 = startTag0.nameAttr("<!---->", attributes57);
        java.lang.String str60 = startTag0.normalName;
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<!---->" + "'", str60, "<!---->");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("Comment");
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<!---->");
        startTag0.appendAttributeValue("<!---->");
        startTag0.tagName = "Comment";
        startTag0.newAttribute();
        startTag0.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        boolean boolean18 = startTag0.isStartTag();
        startTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        java.lang.String str25 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes26 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] {};
        startTag30.appendAttributeValue(charArray31);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = startTag33.attributes;
        startTag30.attributes = attributes34;
        startTag27.attributes = attributes34;
        startTag27.selfClosing = false;
        startTag27.appendAttributeName('4');
        startTag27.newAttribute();
        startTag27.selfClosing = false;
        org.jsoup.parser.Token.Tag tag44 = startTag27.reset();
        boolean boolean45 = startTag27.isSelfClosing();
        startTag27.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes48 = startTag27.getAttributes();
        startTag0.attributes = attributes48;
        boolean boolean50 = startTag0.isEndTag();
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.getData();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        java.lang.String str8 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        tag11.appendAttributeName('a');
        java.lang.String str14 = tag11.tokenType();
        tag11.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        startTag0.normalName = "Comment";
        startTag0.appendAttributeName(' ');
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        startTag0.selfClosing = false;
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        boolean boolean12 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes13 = startTag0.attributes;
        startTag0.tagName = "a";
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        boolean boolean2 = eOF0.isEOF();
        boolean boolean3 = eOF0.isEndTag();
        org.jsoup.parser.Token token4 = eOF0.reset();
        boolean boolean5 = eOF0.isDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        org.jsoup.parser.Token.Tag tag18 = startTag0.reset();
        tag18.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        org.jsoup.nodes.Attributes attributes11 = tag5.getAttributes();
        org.jsoup.parser.Token.Tag tag12 = tag5.reset();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("<hi!>");
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token.Character character7 = character0.data("");
        org.jsoup.parser.Token.Character character9 = character7.data("<<Comment>>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character2 = character0.asCharacter();
        org.jsoup.parser.Token.Character character4 = character0.data("Comment");
        org.jsoup.parser.Token token5 = character0.reset();
        java.lang.String str6 = character0.getData();
        boolean boolean7 = character0.isEndTag();
        java.lang.String str8 = character0.getData();
        java.lang.String str9 = character0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        java.lang.String str27 = startTag0.normalName();
        java.lang.String str28 = startTag0.tokenType();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "StartTag" + "'", str28, "StartTag");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isStartTag();
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        comment0.bogus = true;
        org.jsoup.parser.Token token9 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        org.jsoup.parser.Token.Tag tag23 = startTag11.reset();
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
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token2 = doctype0.reset();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        comment0.bogus = true;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.forceQuirks;
        org.jsoup.parser.Token token5 = doctype2.reset();
        boolean boolean6 = doctype2.isDoctype();
        org.jsoup.parser.Token token7 = doctype2.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype2.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        boolean boolean34 = endTag0.selfClosing;
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendTagName("");
        org.jsoup.nodes.Attributes attributes24 = null;
        startTag21.attributes = attributes24;
        startTag21.appendAttributeValue("hi!");
        startTag21.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType30 = startTag21.type;
        startTag21.appendAttributeValue("Comment");
        boolean boolean33 = startTag21.isCharacter();
        boolean boolean34 = startTag21.isSelfClosing();
        startTag21.appendAttributeValue("commentcomment#");
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        startTag37.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        char[] charArray41 = new char[] {};
        startTag40.appendAttributeValue(charArray41);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = startTag43.attributes;
        startTag40.attributes = attributes44;
        startTag37.attributes = attributes44;
        java.lang.String str47 = startTag37.normalName;
        org.jsoup.parser.Token.Tag tag48 = startTag37.reset();
        org.jsoup.parser.Token.Tag tag49 = startTag37.reset();
        startTag37.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag53 = startTag52.reset();
        org.jsoup.nodes.Attributes attributes54 = startTag52.attributes;
        org.jsoup.parser.Token.StartTag startTag55 = startTag37.nameAttr("", attributes54);
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        startTag56.appendTagName("");
        org.jsoup.nodes.Attributes attributes59 = null;
        startTag56.attributes = attributes59;
        org.jsoup.parser.Token.Tag tag61 = startTag56.reset();
        org.jsoup.nodes.Attributes attributes62 = startTag56.attributes;
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        startTag63.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag();
        char[] charArray67 = new char[] {};
        startTag66.appendAttributeValue(charArray67);
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes70 = startTag69.attributes;
        startTag66.attributes = attributes70;
        startTag63.attributes = attributes70;
        startTag63.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        startTag75.appendTagName("");
        java.lang.String str78 = startTag75.tagName;
        int[] intArray80 = new int[] { 0 };
        startTag75.appendAttributeValue(intArray80);
        startTag63.appendAttributeValue(intArray80);
        startTag56.appendAttributeValue(intArray80);
        startTag55.appendAttributeValue(intArray80);
        startTag21.appendAttributeValue(intArray80);
        startTag0.appendAttributeValue(intArray80);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>" + "'", str18, "<hi!>");
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 0 });
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.appendTagName('a');
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
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray28 = new char[] {};
        startTag27.appendAttributeValue(charArray28);
        org.jsoup.nodes.Attributes attributes30 = startTag27.getAttributes();
        boolean boolean31 = startTag27.isComment();
        startTag27.appendAttributeName("Comment");
        startTag27.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes36 = startTag27.attributes;
        startTag21.attributes = attributes36;
        org.jsoup.nodes.Attributes attributes38 = startTag21.attributes;
        startTag21.tagName = "<Comment>";
        org.jsoup.nodes.Attributes attributes41 = startTag21.getAttributes();
        tag7.attributes = attributes41;
        tag7.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isDoctype();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.getData();
        boolean boolean9 = comment0.bogus;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        java.lang.StringBuilder stringBuilder18 = doctype2.name;
        org.jsoup.parser.Token.reset(stringBuilder18);
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
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        tag17.appendAttributeName("Doctype");
        tag17.appendTagName('a');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        org.jsoup.parser.Token token11 = startTag0.reset();
        java.lang.String str12 = token11.tokenType();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        java.lang.String str20 = startTag0.normalName;
        org.jsoup.parser.Token.Tag tag21 = startTag0.reset();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>" + "'", str18, "<hi!>");
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!>" + "'", str20, "<hi!>");
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        java.lang.String str28 = startTag11.normalName();
        startTag11.setEmptyAttributeValue();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.TokenType tokenType3 = character0.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        startTag0.appendAttributeValue("<<Comment>>");
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
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        java.lang.String str3 = startTag0.tagName;
        int[] intArray5 = new int[] { 0 };
        startTag0.appendAttributeValue(intArray5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        java.lang.String str9 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("Commentcomment");
        tag11.appendAttributeName("<   a>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes3 = null;
        startTag0.attributes = attributes3;
        startTag0.appendTagName("");
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendTagName('#');
        startTag0.tagName = "";
        startTag0.finaliseTag();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype2 = token1.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getSystemIdentifier();
        doctype2.pubSysKey = "Doctype";
        java.lang.String str8 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token token9 = doctype2.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = token9.type;
        boolean boolean11 = token9.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        org.jsoup.parser.Token token2 = eOF0.reset();
        boolean boolean3 = eOF0.isDoctype();
        java.lang.String str4 = eOF0.tokenType();
        java.lang.Class<?> wildcardClass5 = eOF0.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        tag14.selfClosing = false;
        tag14.finaliseTag();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.Character character3 = character0.data("comment");
        org.jsoup.parser.Token.Character character5 = character0.data("#");
        java.lang.String str6 = character0.getData();
        boolean boolean7 = character0.isComment();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token token9 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName("");
        java.lang.String str19 = startTag16.tagName;
        org.jsoup.parser.Token.Tag tag20 = startTag16.reset();
        tag20.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes22 = tag20.attributes;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendTagName("");
        org.jsoup.nodes.Attributes attributes26 = null;
        startTag23.attributes = attributes26;
        startTag23.appendTagName("");
        java.lang.String str30 = startTag23.tagName;
        startTag23.appendTagName('#');
        org.jsoup.nodes.Attributes attributes33 = startTag23.getAttributes();
        org.jsoup.nodes.Attributes attributes34 = startTag23.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Character;
        startTag23.type = tokenType35;
        tag20.type = tokenType35;
        startTag0.type = tokenType35;
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(attributes33);
        org.junit.Assert.assertNull(attributes34);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        startTag0.normalName = "Comment";
        startTag0.appendAttributeName(' ');
        org.jsoup.parser.Token token8 = startTag0.reset();
        startTag0.appendAttributeValue("");
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes12 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.tokenType();
        org.jsoup.parser.Token.Character character5 = character0.data("a");
        org.jsoup.parser.Token token6 = character5.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag15 = startTag0.name("<<comment>>");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        char[] charArray1 = new char[] {};
        startTag0.appendAttributeValue(charArray1);
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        startTag0.appendAttributeValue("<<Commentcomment>>");
        startTag0.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        char[] charArray12 = new char[] {};
        startTag11.appendAttributeValue(charArray12);
        org.jsoup.nodes.Attributes attributes14 = startTag11.getAttributes();
        startTag11.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag17 = startTag11.asStartTag();
        startTag17.normalName = "hi!";
        java.lang.String str20 = startTag17.tokenType();
        boolean boolean21 = startTag17.isDoctype();
        startTag17.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes23 = startTag17.attributes;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        char[] charArray26 = new char[] {};
        startTag25.appendAttributeValue(charArray26);
        startTag25.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag31 = startTag25.name("Comment");
        startTag25.appendTagName("comment");
        java.lang.String str34 = startTag25.normalName();
        org.jsoup.parser.Token.Tag tag35 = startTag25.reset();
        boolean boolean36 = startTag25.isComment();
        org.jsoup.nodes.Attributes attributes37 = startTag25.attributes;
        org.jsoup.parser.Token.StartTag startTag38 = startTag17.nameAttr("Character", attributes37);
        org.jsoup.parser.Token.StartTag startTag39 = startTag0.nameAttr("<commentcomment#>", attributes37);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "StartTag" + "'", str20, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "commentcomment" + "'", str34, "commentcomment");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertNotNull(startTag39);
    }
}

