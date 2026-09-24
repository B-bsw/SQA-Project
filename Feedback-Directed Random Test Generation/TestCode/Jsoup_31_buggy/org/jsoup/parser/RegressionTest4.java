package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.toString();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.String str7 = comment0.toString();
        java.lang.String str8 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        org.jsoup.parser.Token.Tag tag9 = tag6.name("</<!---->>");
        java.lang.Class<?> wildcardClass10 = tag6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str14 = character13.toString();
        xmlTreeBuilder0.insert(character13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.toString();
        org.jsoup.parser.Token.TokenType tokenType23 = comment21.type;
        java.lang.String str24 = comment21.getData();
        xmlTreeBuilder16.insert(comment21);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.String str27 = comment26.toString();
        org.jsoup.parser.Token.TokenType tokenType28 = comment26.type;
        java.lang.String str29 = comment26.toString();
        xmlTreeBuilder16.insert(comment26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("</<!---->>", "StartTag", parseErrorList34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder31.initialiseParse("<!---->", "<<!---->>", parseErrorList38);
        org.jsoup.parser.Token.Character character41 = new org.jsoup.parser.Token.Character("");
        java.lang.String str42 = character41.toString();
        java.lang.String str43 = character41.getData();
        java.lang.String str44 = character41.toString();
        java.lang.String str45 = character41.toString();
        boolean boolean46 = xmlTreeBuilder31.process((org.jsoup.parser.Token) character41);
        xmlTreeBuilder16.insert(character41);
        xmlTreeBuilder0.insert(character41);
        org.jsoup.parser.Token.Doctype doctype49 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder50 = doctype49.publicIdentifier;
        java.lang.StringBuilder stringBuilder51 = doctype49.publicIdentifier;
        boolean boolean52 = doctype49.forceQuirks;
        java.lang.String str53 = doctype49.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder54 = doctype49.publicIdentifier;
        java.lang.StringBuilder stringBuilder55 = doctype49.publicIdentifier;
        boolean boolean56 = doctype49.forceQuirks;
        boolean boolean57 = doctype49.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<<!---->>" + "'", str14, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder0.initialiseParse("Comment", "hi!", parseErrorList25);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendAttributeValue('4');
        boolean boolean32 = startTag29.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType33 = startTag29.type;
        org.jsoup.nodes.Attributes attributes34 = startTag29.getAttributes();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("", attributes34);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes34);
        boolean boolean37 = startTag36.isStartTag();
        startTag36.appendAttributeName('a');
        java.lang.String str40 = startTag36.name();
        boolean boolean41 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag36);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder43 = doctype42.publicIdentifier;
        java.lang.StringBuilder stringBuilder44 = doctype42.publicIdentifier;
        boolean boolean45 = doctype42.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType46 = doctype42.type;
        boolean boolean47 = doctype42.forceQuirks;
        java.lang.StringBuilder stringBuilder48 = doctype42.publicIdentifier;
        java.lang.StringBuilder stringBuilder49 = doctype42.publicIdentifier;
        boolean boolean50 = doctype42.forceQuirks;
        java.lang.StringBuilder stringBuilder51 = doctype42.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<<<!---->>>" + "'", str40, "<<<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        boolean boolean6 = endTag5.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = endTag5.name("<!---->");
        boolean boolean9 = tag8.isCharacter();
        tag8.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes12 = tag8.attributes;
        org.jsoup.parser.Token.TokenType tokenType13 = tag8.type;
        doctype0.type = tokenType13;
        doctype0.forceQuirks = false;
        java.lang.String str17 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("<hi!</</<!---->>>>");
        boolean boolean4 = startTag1.isEOF();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        boolean boolean12 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendAttributeValue('4');
        boolean boolean52 = startTag49.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType53 = startTag49.type;
        java.lang.String str54 = startTag49.tagName;
        boolean boolean55 = startTag49.isEndTag();
        startTag49.appendAttributeValue("");
        startTag49.tagName = "<!----><<!---->>";
        boolean boolean60 = startTag49.isSelfClosing();
        boolean boolean61 = startTag49.isStartTag();
        boolean boolean62 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag49);
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str65 = endTag64.toString();
        boolean boolean66 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag64);
        org.jsoup.parser.Token.Doctype doctype67 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str68 = doctype67.getPublicIdentifier();
        boolean boolean69 = doctype67.forceQuirks;
        java.lang.StringBuilder stringBuilder70 = doctype67.publicIdentifier;
        java.lang.String str71 = doctype67.getName();
        boolean boolean72 = doctype67.forceQuirks;
        java.lang.StringBuilder stringBuilder73 = doctype67.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "</<!---->>" + "'", str65, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        java.lang.String str3 = doctype0.getName();
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        java.lang.String str6 = startTag2.tokenType();
        java.lang.String str7 = startTag2.tokenType();
        startTag2.appendAttributeValue("</<hi!>>");
        java.lang.String str10 = startTag2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Doctype");
        boolean boolean2 = character1.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        boolean boolean3 = startTag0.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str10 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEnd;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("<hi!>");
        tag7.appendTagName("<<<!---->>>");
        tag7.appendTagName("</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isEOF();
        java.lang.String str6 = endTag1.toString();
        java.lang.String str7 = endTag1.tokenType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</<!---->>" + "'", str6, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EndTag" + "'", str7, "EndTag");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<hi!>a>");
        java.lang.String str2 = endTag1.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<hi!>a>" + "'", str2, "</<hi!>a>");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder5 = doctype4.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype4.publicIdentifier;
        java.lang.String str7 = doctype4.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        org.jsoup.parser.Token.TokenType tokenType11 = startTag10.type;
        startTag10.finaliseTag();
        boolean boolean13 = startTag10.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType14 = startTag10.type;
        doctype4.type = tokenType14;
        boolean boolean16 = doctype4.forceQuirks;
        java.lang.StringBuilder stringBuilder17 = doctype4.publicIdentifier;
        java.lang.StringBuilder stringBuilder18 = doctype4.name;
        boolean boolean19 = doctype4.isForceQuirks();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("", attributes21);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        startTag27.newAttribute();
        startTag27.tagName = "";
        org.jsoup.nodes.Attributes attributes31 = startTag27.attributes;
        startTag24.attributes = attributes31;
        boolean boolean33 = startTag24.isDoctype();
        org.jsoup.parser.Token.StartTag startTag34 = startTag24.asStartTag();
        boolean boolean35 = startTag34.isEOF();
        startTag34.selfClosing = true;
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("hi!", attributes39);
        boolean boolean41 = startTag40.isComment();
        org.jsoup.parser.Token.Comment comment42 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType43 = org.jsoup.parser.Token.TokenType.Doctype;
        comment42.type = tokenType43;
        startTag40.type = tokenType43;
        startTag40.selfClosing = false;
        boolean boolean48 = startTag40.isCharacter();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag("hi!", attributes50);
        boolean boolean52 = startTag51.isComment();
        boolean boolean53 = startTag51.selfClosing;
        startTag51.newAttribute();
        org.jsoup.nodes.Attributes attributes55 = startTag51.getAttributes();
        startTag40.attributes = attributes55;
        startTag34.attributes = attributes55;
        org.jsoup.parser.Token.TokenType tokenType58 = startTag34.type;
        startTag22.type = tokenType58;
        doctype4.type = tokenType58;
        doctype0.type = tokenType58;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + tokenType58 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType58.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("</<!---->StartTag<!----><<!---->>>");
        startTag1.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType14 = startTag0.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str14 = character13.toString();
        xmlTreeBuilder0.insert(character13);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("<!---->4", "<hi!</</<!---->>>>", parseErrorList18);
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character("");
        java.lang.String str22 = character21.toString();
        java.lang.String str23 = character21.toString();
        java.lang.String str24 = character21.getData();
        java.lang.String str25 = character21.getData();
        java.lang.String str26 = character21.getData();
        xmlTreeBuilder0.insert(character21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<<!---->>" + "'", str14, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        java.lang.String str11 = startTag1.tagName;
        startTag1.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character13 = startTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag14 = startTag13.asStartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag13.getAttributes();
        boolean boolean16 = startTag13.isCharacter();
        startTag13.newAttribute();
        org.jsoup.nodes.Attributes attributes18 = startTag13.getAttributes();
        boolean boolean19 = startTag13.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = character9.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->hi!");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Character character23 = new org.jsoup.parser.Token.Character("");
        boolean boolean24 = character23.isEndTag();
        java.lang.String str25 = character23.toString();
        java.lang.String str26 = character23.getData();
        java.lang.String str27 = character23.toString();
        boolean boolean28 = character23.isEndTag();
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder30 = doctype29.publicIdentifier;
        java.lang.StringBuilder stringBuilder31 = doctype29.publicIdentifier;
        java.lang.String str32 = doctype29.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("hi!", attributes34);
        org.jsoup.parser.Token.TokenType tokenType36 = startTag35.type;
        startTag35.finaliseTag();
        boolean boolean38 = startTag35.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType39 = startTag35.type;
        doctype29.type = tokenType39;
        character23.type = tokenType39;
        java.lang.String str42 = character23.toString();
        boolean boolean43 = character23.isCharacter();
        xmlTreeBuilder0.insert(character23);
        boolean boolean45 = character23.isEOF();
        java.lang.String str46 = character23.getData();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str2 = endTag1.toString();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendAttributeValue('4');
        boolean boolean7 = startTag4.isEndTag();
        startTag4.newAttribute();
        boolean boolean9 = startTag4.isComment();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        startTag14.newAttribute();
        startTag14.tagName = "";
        org.jsoup.nodes.Attributes attributes18 = startTag14.attributes;
        startTag11.attributes = attributes18;
        startTag4.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->", attributes18);
        endTag1.attributes = attributes18;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        boolean boolean26 = comment25.isStartTag();
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType28 = org.jsoup.parser.Token.TokenType.Doctype;
        comment27.type = tokenType28;
        comment25.type = tokenType28;
        boolean boolean31 = comment25.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType32 = comment25.type;
        endTag1.type = tokenType32;
        endTag1.appendTagName("<hi!</</<!---->>>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.selfClosing;
        java.lang.String str4 = startTag1.toString();
        org.jsoup.parser.Token.StartTag startTag5 = startTag1.asStartTag();
        startTag5.appendAttributeName("<<hi!>StartTag>");
        startTag5.appendAttributeName("<hi!<!---->>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertNotNull(startTag5);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        java.lang.String str15 = doctype0.tokenType();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.finaliseTag();
        boolean boolean7 = startTag2.selfClosing;
        java.lang.String str8 = startTag2.tokenType();
        boolean boolean9 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        xmlTreeBuilder0.initialiseParse("Doctype", "</</<!---->>>", parseErrorList14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "</<!---->>", parseErrorList18);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!", attributes21);
        boolean boolean23 = startTag22.isComment();
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.Doctype;
        comment24.type = tokenType25;
        startTag22.type = tokenType25;
        java.lang.String str28 = startTag22.tagName;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("hi!", attributes32);
        startTag33.newAttribute();
        startTag33.tagName = "";
        org.jsoup.nodes.Attributes attributes37 = startTag33.attributes;
        startTag30.attributes = attributes37;
        startTag22.attributes = attributes37;
        java.lang.String str40 = startTag22.tagName;
        boolean boolean41 = startTag22.isCharacter();
        startTag22.appendAttributeValue("<<hi!>StartTag>");
        org.jsoup.nodes.Attributes attributes44 = startTag22.attributes;
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag22);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder46.initialiseParse("</<!---->>", "</<!---->>", parseErrorList49);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.String str52 = comment51.toString();
        org.jsoup.parser.Token.TokenType tokenType53 = comment51.type;
        java.lang.String str54 = comment51.getData();
        xmlTreeBuilder46.insert(comment51);
        org.jsoup.parser.Token.Comment comment56 = new org.jsoup.parser.Token.Comment();
        boolean boolean57 = comment56.isStartTag();
        java.lang.String str58 = comment56.toString();
        boolean boolean59 = comment56.isCharacter();
        xmlTreeBuilder46.insert(comment56);
        boolean boolean61 = comment56.isEOF();
        boolean boolean62 = comment56.isEOF();
        boolean boolean63 = comment56.isCharacter();
        java.lang.StringBuilder stringBuilder64 = comment56.data;
        boolean boolean65 = comment56.isStartTag();
        xmlTreeBuilder0.insert(comment56);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!---->" + "'", str58, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = startTag2.type;
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes7);
        boolean boolean10 = startTag9.isStartTag();
        startTag9.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("StartTag");
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder8.initialiseParse("</<!---->>", "</<!---->>", parseErrorList11);
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType14 = org.jsoup.parser.Token.TokenType.Doctype;
        comment13.type = tokenType14;
        java.lang.StringBuilder stringBuilder16 = comment13.data;
        xmlTreeBuilder8.insert(comment13);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.String str19 = comment18.toString();
        xmlTreeBuilder8.insert(comment18);
        org.jsoup.parser.Token.Character character22 = new org.jsoup.parser.Token.Character("");
        boolean boolean23 = character22.isEndTag();
        java.lang.String str24 = character22.toString();
        xmlTreeBuilder8.insert(character22);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.String str27 = comment26.toString();
        org.jsoup.parser.Token.TokenType tokenType28 = comment26.type;
        boolean boolean29 = comment26.isComment();
        java.lang.String str30 = comment26.getData();
        java.lang.StringBuilder stringBuilder31 = comment26.data;
        java.lang.String str32 = comment26.toString();
        xmlTreeBuilder8.insert(comment26);
        xmlTreeBuilder0.insert(comment26);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!---->" + "'", str32, "<!---->");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        boolean boolean4 = startTag3.isComment();
        boolean boolean5 = startTag3.selfClosing;
        boolean boolean6 = startTag3.isEndTag();
        startTag3.finaliseTag();
        boolean boolean8 = startTag3.selfClosing;
        org.jsoup.parser.Token.Tag tag10 = startTag3.name("EndTag");
        org.jsoup.parser.Token.Tag tag12 = startTag3.name("</<hi!>>");
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        startTag15.appendAttributeValue(' ');
        java.lang.String str18 = startTag15.tokenType();
        java.lang.String str19 = startTag15.name();
        startTag15.appendTagName("<!---->");
        startTag15.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.selfClosing = false;
        startTag24.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes29 = startTag24.getAttributes();
        startTag15.attributes = attributes29;
        startTag3.attributes = attributes29;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!<<!----><hi!>>", attributes29);
        org.jsoup.nodes.Attributes attributes33 = startTag32.attributes;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StartTag" + "'", str18, "StartTag");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        boolean boolean7 = startTag0.selfClosing;
        java.lang.String str8 = startTag0.tagName;
        startTag0.appendTagName("<</<hi!>>>");
        startTag0.appendTagName("<!---->");
        startTag0.appendTagName('4');
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        xmlTreeBuilder49.initialiseParse("</<!---->>", "</<!---->>", parseErrorList52);
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        java.lang.String str55 = comment54.toString();
        org.jsoup.parser.Token.TokenType tokenType56 = comment54.type;
        java.lang.String str57 = comment54.getData();
        xmlTreeBuilder49.insert(comment54);
        org.jsoup.parser.Token.Comment comment59 = new org.jsoup.parser.Token.Comment();
        boolean boolean60 = comment59.isStartTag();
        java.lang.String str61 = comment59.toString();
        boolean boolean62 = comment59.isCharacter();
        xmlTreeBuilder49.insert(comment59);
        boolean boolean64 = comment59.isEOF();
        java.lang.StringBuilder stringBuilder65 = comment59.data;
        xmlTreeBuilder0.insert(comment59);
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "<hi!EndTag>", parseErrorList69);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        xmlTreeBuilder71.initialiseParse("</<!---->>", "</<!---->>", parseErrorList74);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        java.lang.String str77 = comment76.toString();
        org.jsoup.parser.Token.TokenType tokenType78 = comment76.type;
        java.lang.String str79 = comment76.getData();
        xmlTreeBuilder71.insert(comment76);
        org.jsoup.parser.Token.Comment comment81 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType82 = org.jsoup.parser.Token.TokenType.Doctype;
        comment81.type = tokenType82;
        xmlTreeBuilder71.insert(comment81);
        java.lang.String str85 = comment81.toString();
        boolean boolean86 = comment81.isEOF();
        xmlTreeBuilder0.insert(comment81);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<!---->" + "'", str61, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "<!---->" + "'", str77, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType78 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType78.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + tokenType82 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType82.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "<!---->" + "'", str85, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        boolean boolean6 = startTag0.isEOF();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue('4');
        boolean boolean10 = startTag7.isDoctype();
        org.jsoup.nodes.Attributes attributes11 = startTag7.attributes;
        startTag0.attributes = attributes11;
        startTag0.appendAttributeName("</<hi!>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        boolean boolean10 = endTag9.selfClosing;
        org.jsoup.parser.Token.Tag tag12 = endTag9.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.StartTag;
        tag12.type = tokenType13;
        startTag0.type = tokenType13;
        org.jsoup.nodes.Attributes attributes16 = startTag0.getAttributes();
        startTag0.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        startTag0.appendTagName('#');
        boolean boolean11 = startTag0.selfClosing;
        java.lang.String str12 = startTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<4#>" + "'", str12, "<4#>");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!>");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isStartTag();
        endTag1.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<hi!>>" + "'", str2, "</<hi!>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.toString();
        org.jsoup.parser.Token.TokenType tokenType11 = comment9.type;
        boolean boolean12 = comment9.isComment();
        java.lang.String str13 = comment9.getData();
        java.lang.String str14 = comment9.toString();
        java.lang.String str15 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "StartTag", parseErrorList19);
        org.jsoup.parser.Token.Character character22 = new org.jsoup.parser.Token.Character("");
        java.lang.String str23 = character22.getData();
        java.lang.String str24 = character22.tokenType();
        xmlTreeBuilder0.insert(character22);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder26.initialiseParse("</<!---->>", "</<!---->>", parseErrorList29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder26.initialiseParse("StartTag", "<!---->", parseErrorList33);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        boolean boolean36 = comment35.isStartTag();
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.Doctype;
        comment37.type = tokenType38;
        comment35.type = tokenType38;
        boolean boolean41 = comment35.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType42 = comment35.type;
        xmlTreeBuilder26.insert(comment35);
        org.jsoup.parser.Token.Comment comment44 = comment35.asComment();
        xmlTreeBuilder0.insert(comment35);
        java.lang.StringBuilder stringBuilder46 = comment35.data;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Character" + "'", str24, "Character");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(comment44);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        startTag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        boolean boolean12 = startTag11.isComment();
        org.jsoup.nodes.Attributes attributes13 = startTag11.attributes;
        startTag11.finaliseTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!", attributes16);
        boolean boolean18 = startTag17.isComment();
        boolean boolean19 = startTag17.selfClosing;
        startTag17.newAttribute();
        org.jsoup.nodes.Attributes attributes21 = startTag17.getAttributes();
        startTag11.attributes = attributes21;
        startTag2.attributes = attributes21;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        startTag2.type = tokenType10;
        boolean boolean12 = startTag2.isSelfClosing();
        boolean boolean13 = startTag2.selfClosing;
        java.lang.String str14 = startTag2.name();
        boolean boolean15 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isStartTag();
        doctype0.forceQuirks = false;
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        java.lang.String str11 = startTag1.tagName;
        startTag1.finaliseTag();
        java.lang.String str13 = startTag1.name();
        org.jsoup.parser.Token.Tag tag15 = startTag1.name("4#");
        org.jsoup.nodes.Attributes attributes16 = tag15.attributes;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        java.lang.String str3 = startTag2.toString();
        org.jsoup.parser.Token.Tag tag5 = startTag2.name("</<<<!---->>>>");
        java.lang.String str6 = startTag2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!>" + "'", str3, "<hi!>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<</<<<!---->>>>>" + "'", str6, "<</<<<!---->>>>>");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder0.initialiseParse("<<<!---->>>", "<</EndTag>>", parseErrorList38);
        org.jsoup.parser.Token.Doctype doctype40 = new org.jsoup.parser.Token.Doctype();
        boolean boolean41 = doctype40.isForceQuirks();
        java.lang.String str42 = doctype40.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder43 = doctype40.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype44 = doctype40.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(doctype44);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("< >");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        java.lang.String str7 = startTag6.tokenType();
        startTag6.newAttribute();
        startTag6.finaliseTag();
        boolean boolean10 = startTag6.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        boolean boolean11 = comment10.isStartTag();
        java.lang.String str12 = comment10.toString();
        boolean boolean13 = comment10.isCharacter();
        xmlTreeBuilder0.insert(comment10);
        java.lang.String str15 = comment10.getData();
        boolean boolean16 = comment10.isCharacter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        boolean boolean17 = startTag16.isComment();
        startTag16.appendTagName("EndTag");
        org.jsoup.parser.Token.TokenType tokenType20 = startTag16.type;
        comment5.type = tokenType20;
        java.lang.StringBuilder stringBuilder22 = comment5.data;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType1 = org.jsoup.parser.Token.TokenType.Doctype;
        comment0.type = tokenType1;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        boolean boolean5 = comment0.isEOF();
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.isStartTag();
        java.lang.String str3 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.tagName = "<hi!>";
        startTag2.appendTagName('a');
        boolean boolean12 = startTag2.selfClosing;
        boolean boolean13 = startTag2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag9.appendTagName("<<!---->>");
        java.lang.String str12 = startTag9.name();
        boolean boolean13 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("", "<<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        boolean boolean20 = comment19.isStartTag();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Doctype;
        comment21.type = tokenType22;
        comment19.type = tokenType22;
        boolean boolean25 = comment19.isStartTag();
        java.lang.String str26 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        xmlTreeBuilder0.insert(comment19);
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        startTag32.newAttribute();
        startTag32.tagName = "";
        org.jsoup.nodes.Attributes attributes36 = startTag32.attributes;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("", attributes36);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendAttributeValue('4');
        boolean boolean41 = startTag38.isDoctype();
        org.jsoup.nodes.Attributes attributes42 = startTag38.attributes;
        startTag37.attributes = attributes42;
        startTag37.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isEndTag();
        endTag0.appendAttributeName("</<hi!>>");
        boolean boolean9 = endTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag10 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        startTag2.appendTagName("</<!---->StartTag>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = startTag2.asStartTag();
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        boolean boolean22 = comment16.isStartTag();
        java.lang.StringBuilder stringBuilder23 = comment16.data;
        boolean boolean24 = comment16.isStartTag();
        java.lang.String str25 = comment16.toString();
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isEndTag();
        startTag27.newAttribute();
        boolean boolean32 = startTag27.isComment();
        org.jsoup.parser.Token.Tag tag34 = startTag27.name("<hi!>");
        org.jsoup.nodes.Element element35 = xmlTreeBuilder0.insert(startTag27);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        boolean boolean37 = comment36.isStartTag();
        java.lang.String str38 = comment36.toString();
        java.lang.String str39 = comment36.getData();
        boolean boolean40 = comment36.isEOF();
        java.lang.String str41 = comment36.getData();
        java.lang.String str42 = comment36.getData();
        xmlTreeBuilder0.insert(comment36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.newAttribute();
        startTag10.tagName = "";
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        startTag7.attributes = attributes14;
        startTag0.attributes = attributes14;
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag0.attributes = attributes17;
        startTag0.appendAttributeName("<<hi!>StartTag>");
        boolean boolean21 = startTag0.selfClosing;
        boolean boolean22 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<<!---->>" + "'", str5, "<<!---->>");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.toString();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.getData();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str17 = doctype16.getName();
        boolean boolean18 = doctype16.isDoctype();
        doctype16.forceQuirks = true;
        java.lang.StringBuilder stringBuilder21 = doctype16.systemIdentifier;
        java.lang.String str22 = doctype16.getPublicIdentifier();
        boolean boolean23 = doctype16.forceQuirks;
        java.lang.StringBuilder stringBuilder24 = doctype16.systemIdentifier;
        java.lang.String str25 = doctype16.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        startTag2.newAttribute();
        startTag2.finaliseTag();
        java.lang.String str7 = startTag2.tagName;
        org.jsoup.nodes.Attributes attributes8 = startTag2.attributes;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<</<hi!>>>");
        boolean boolean11 = tag10.isCharacter();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        boolean boolean2 = character1.isEndTag();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.toString();
        boolean boolean6 = character1.isEndTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        boolean boolean10 = startTag9.isComment();
        boolean boolean11 = startTag9.selfClosing;
        boolean boolean12 = startTag9.isEndTag();
        startTag9.finaliseTag();
        boolean boolean14 = startTag9.selfClosing;
        org.jsoup.parser.Token.Tag tag16 = startTag9.name("EndTag");
        org.jsoup.parser.Token.Tag tag18 = startTag9.name("</<hi!>>");
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.isForceQuirks();
        java.lang.String str21 = doctype19.getName();
        boolean boolean22 = doctype19.isCharacter();
        java.lang.StringBuilder stringBuilder23 = doctype19.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        boolean boolean25 = endTag24.selfClosing;
        org.jsoup.parser.Token.Tag tag27 = endTag24.name("<!---->");
        boolean boolean28 = tag27.isCharacter();
        tag27.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes31 = tag27.attributes;
        org.jsoup.parser.Token.TokenType tokenType32 = tag27.type;
        doctype19.type = tokenType32;
        tag18.type = tokenType32;
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("hi!", attributes36);
        startTag37.appendAttributeValue(' ');
        java.lang.String str40 = startTag37.tokenType();
        boolean boolean41 = startTag37.isEOF();
        startTag37.appendTagName("Comment");
        boolean boolean44 = startTag37.isEndTag();
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag("hi!", attributes46);
        org.jsoup.parser.Token.TokenType tokenType48 = startTag47.type;
        startTag47.finaliseTag();
        boolean boolean50 = startTag47.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType51 = startTag47.type;
        java.lang.String str52 = startTag47.tokenType();
        org.jsoup.parser.Token.TokenType tokenType53 = startTag47.type;
        startTag37.type = tokenType53;
        tag18.type = tokenType53;
        character1.type = tokenType53;
        java.lang.String str57 = character1.toString();
        java.lang.String str58 = character1.getData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(attributes31);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "StartTag" + "'", str40, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + tokenType51 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType51.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "StartTag" + "'", str52, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<!----><<!---->>");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isEOF();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!----><<!---->>" + "'", str2, "<!----><<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!----><<!---->>" + "'", str3, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "<<!----><hi!>>", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.String str20 = comment19.toString();
        org.jsoup.parser.Token.TokenType tokenType21 = comment19.type;
        java.lang.String str22 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.Doctype;
        comment24.type = tokenType25;
        xmlTreeBuilder14.insert(comment24);
        java.lang.String str28 = comment24.getData();
        java.lang.String str29 = comment24.getData();
        boolean boolean30 = comment24.isDoctype();
        xmlTreeBuilder0.insert(comment24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = comment0.type;
        java.lang.String str8 = comment0.getData();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        java.lang.String str11 = comment0.getData();
        java.lang.StringBuilder stringBuilder12 = comment0.data;
        boolean boolean13 = comment0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        java.lang.String str5 = endTag1.toString();
        boolean boolean6 = endTag1.selfClosing;
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("</<!---->>");
        java.lang.String str10 = startTag9.tokenType();
        org.jsoup.nodes.Attributes attributes11 = startTag9.getAttributes();
        startTag9.finaliseTag();
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        endTag1.attributes = attributes13;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<!---->>" + "'", str5, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.finaliseTag();
        java.lang.String str5 = startTag1.tagName;
        startTag1.tagName = "<hi!<!---->>";
        startTag1.appendAttributeName('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.tagName = "<!---->";
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isCharacter();
        startTag0.appendTagName("</<hi!>>");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeValue('4');
        boolean boolean15 = startTag12.isEndTag();
        boolean boolean16 = startTag12.isEOF();
        startTag12.appendAttributeValue("hi!");
        startTag12.appendTagName('4');
        boolean boolean21 = startTag12.isSelfClosing();
        org.jsoup.parser.Token.Tag tag23 = startTag12.name("hi!");
        boolean boolean24 = startTag12.isComment();
        org.jsoup.parser.Token.StartTag startTag25 = startTag12.asStartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag12.attributes;
        startTag0.attributes = attributes26;
        startTag0.tagName = "<4>";
        boolean boolean30 = startTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder16.initialiseParse("", "<<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder16.initialiseParse("<!---->", "hi!", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str31 = startTag30.tokenType();
        boolean boolean32 = startTag30.selfClosing;
        org.jsoup.nodes.Element element33 = xmlTreeBuilder16.insert(startTag30);
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag30);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean37 = startTag36.isSelfClosing();
        boolean boolean38 = startTag36.isDoctype();
        boolean boolean39 = startTag36.isSelfClosing();
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag36);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        xmlTreeBuilder0.initialiseParse("4#", "<!---->hi!", parseErrorList43);
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str46 = doctype45.getName();
        java.lang.StringBuilder stringBuilder47 = doctype45.publicIdentifier;
        java.lang.StringBuilder stringBuilder48 = doctype45.systemIdentifier;
        boolean boolean49 = doctype45.isStartTag();
        java.lang.StringBuilder stringBuilder50 = doctype45.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.selfClosing = false;
        boolean boolean10 = startTag2.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType11 = startTag2.type;
        startTag2.tagName = "<</<<<!---->>>>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = startTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<!----><<!---->>");
        java.lang.String str14 = startTag0.tokenType();
        java.lang.String str15 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeValue('4');
        boolean boolean19 = startTag16.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag16.type;
        java.lang.String str21 = startTag16.tagName;
        boolean boolean22 = startTag16.isEndTag();
        org.jsoup.nodes.Attributes attributes23 = startTag16.getAttributes();
        startTag0.attributes = attributes23;
        org.jsoup.parser.Token.Tag tag26 = startTag0.name("<hi!</</<!---->>>>");
        org.jsoup.nodes.Attributes attributes27 = startTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag28 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        java.lang.String str7 = comment0.toString();
        boolean boolean8 = comment0.isCharacter();
        boolean boolean9 = comment0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isEOF();
        java.lang.String str6 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes9 = endTag1.getAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</<!---->>" + "'", str6, "</<!---->>");
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<!----><<!---->>");
        org.jsoup.parser.Token.Tag tag15 = startTag0.name("<<hi!>>");
        tag15.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str25 = startTag24.toString();
        java.lang.String str26 = startTag24.name();
        org.jsoup.parser.Token.Tag tag28 = startTag24.name("<hi!>");
        boolean boolean29 = startTag24.isComment();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        startTag32.finaliseTag();
        boolean boolean35 = startTag32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag32.type;
        startTag24.type = tokenType36;
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("", "<<!---->>", parseErrorList42);
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str46 = endTag45.toString();
        java.lang.String str47 = endTag45.toString();
        boolean boolean48 = xmlTreeBuilder39.process((org.jsoup.parser.Token) endTag45);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        xmlTreeBuilder39.initialiseParse("hi!<!---->", "", parseErrorList51);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EndTag");
        xmlTreeBuilder39.insert(character54);
        xmlTreeBuilder0.insert(character54);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder57.initialiseParse("</<!---->>", "</<!---->>", parseErrorList60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder57.initialiseParse("StartTag", "<hi!>", parseErrorList64);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        xmlTreeBuilder66.initialiseParse("</<!---->>", "</<!---->>", parseErrorList69);
        org.jsoup.parser.Token.Comment comment71 = new org.jsoup.parser.Token.Comment();
        java.lang.String str72 = comment71.toString();
        org.jsoup.parser.Token.TokenType tokenType73 = comment71.type;
        java.lang.String str74 = comment71.getData();
        xmlTreeBuilder66.insert(comment71);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType77 = org.jsoup.parser.Token.TokenType.Doctype;
        comment76.type = tokenType77;
        xmlTreeBuilder66.insert(comment76);
        xmlTreeBuilder57.insert(comment76);
        xmlTreeBuilder0.insert(comment76);
        java.lang.String str82 = comment76.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<<!---->>" + "'", str25, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</<!---->>" + "'", str46, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "</<!---->>" + "'", str47, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<!---->" + "'", str72, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + tokenType77 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType77.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "<!---->" + "'", str82, "<!---->");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.appendAttributeName("</<!---->>");
        boolean boolean7 = startTag0.isCharacter();
        boolean boolean8 = startTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        org.jsoup.parser.Token.TokenType tokenType12 = comment10.type;
        java.lang.String str13 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder15.initialiseParse("</<!---->>", "StartTag", parseErrorList18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder15.initialiseParse("<!---->", "<<!---->>", parseErrorList22);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("");
        java.lang.String str26 = character25.toString();
        java.lang.String str27 = character25.getData();
        java.lang.String str28 = character25.toString();
        java.lang.String str29 = character25.toString();
        boolean boolean30 = xmlTreeBuilder15.process((org.jsoup.parser.Token) character25);
        xmlTreeBuilder0.insert(character25);
        java.lang.String str32 = character25.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment33 = character25.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.tokenType();
        boolean boolean9 = doctype0.isForceQuirks();
        boolean boolean10 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        java.lang.String str7 = startTag6.tokenType();
        boolean boolean8 = startTag6.isDoctype();
        org.jsoup.parser.Token.Tag tag10 = startTag6.name("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = startTag6.asStartTag();
        startTag6.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("StartTag", attributes9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag13.attributes = attributes20;
        startTag11.attributes = attributes20;
        startTag11.newAttribute();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        boolean boolean27 = startTag26.isComment();
        startTag26.appendAttributeName('4');
        java.lang.String str30 = startTag26.tokenType();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("hi!", attributes32);
        startTag33.appendAttributeValue(' ');
        java.lang.String str36 = startTag33.tokenType();
        java.lang.String str37 = startTag33.name();
        startTag33.appendTagName("<!---->");
        startTag33.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.selfClosing = false;
        startTag42.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes47 = startTag42.getAttributes();
        startTag33.attributes = attributes47;
        startTag26.attributes = attributes47;
        startTag11.attributes = attributes47;
        startTag11.appendTagName(' ');
        boolean boolean53 = startTag11.isComment();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "StartTag" + "'", str30, "StartTag");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "StartTag" + "'", str36, "StartTag");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        boolean boolean4 = startTag1.isSelfClosing();
        startTag1.appendTagName(' ');
        boolean boolean7 = startTag1.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        java.lang.String str4 = startTag2.name();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->", attributes7);
        startTag8.tagName = "<<!---->>4";
        startTag8.appendAttributeName('a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag14 = startTag13.asStartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag13.getAttributes();
        boolean boolean16 = startTag13.isCharacter();
        boolean boolean17 = startTag13.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType18 = startTag13.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("<</EndTag>>");
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag37);
        boolean boolean39 = startTag37.selfClosing;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemKeyword;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        startTag2.selfClosing = true;
        org.jsoup.nodes.Attributes attributes8 = startTag2.attributes;
        startTag2.appendAttributeName("Comment");
        org.jsoup.parser.Token.TokenType tokenType11 = startTag2.type;
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        startTag12.newAttribute();
        boolean boolean14 = startTag12.isStartTag();
        boolean boolean15 = startTag12.isCharacter();
        org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</<!---->>", "StartTag", parseErrorList20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder17.initialiseParse("<!---->", "<<!---->>", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder17.initialiseParse("<!----><<!---->>", "<hi!>", parseErrorList28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder30.initialiseParse("</<!---->>", "</<!---->>", parseErrorList33);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        java.lang.String str36 = comment35.toString();
        org.jsoup.parser.Token.TokenType tokenType37 = comment35.type;
        java.lang.String str38 = comment35.getData();
        xmlTreeBuilder30.insert(comment35);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        java.lang.String str41 = comment40.toString();
        org.jsoup.parser.Token.TokenType tokenType42 = comment40.type;
        java.lang.String str43 = comment40.toString();
        xmlTreeBuilder30.insert(comment40);
        xmlTreeBuilder17.insert(comment40);
        xmlTreeBuilder0.insert(comment40);
        java.lang.String str47 = comment40.toString();
        java.lang.String str48 = comment40.getData();
        boolean boolean49 = comment40.isDoctype();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!---->" + "'", str36, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!---->" + "'", str47, "<!---->");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.selfClosing = false;
        startTag2.appendTagName("");
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        boolean boolean12 = startTag11.isComment();
        startTag11.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendAttributeValue('4');
        boolean boolean18 = startTag15.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType19 = startTag15.type;
        startTag11.type = tokenType19;
        boolean boolean21 = startTag11.isSelfClosing();
        boolean boolean22 = startTag11.selfClosing;
        org.jsoup.nodes.Attributes attributes23 = startTag11.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag11.type;
        startTag2.type = tokenType24;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(attributes23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder0.initialiseParse("</<4>>", "<<!---->StartTag>", parseErrorList24);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("</<hi!>>", attributes2);
        startTag3.appendAttributeName('4');
        startTag3.appendTagName("<StartTag>");
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4>");
        java.lang.String str2 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<4>>" + "'", str2, "</<4>>");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str14 = character13.toString();
        xmlTreeBuilder0.insert(character13);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("hi!", attributes17);
        org.jsoup.parser.Token.TokenType tokenType19 = startTag18.type;
        startTag18.finaliseTag();
        java.lang.String str21 = startTag18.toString();
        startTag18.selfClosing = false;
        startTag18.appendAttributeValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<<!---->>" + "'", str14, "<<!---->>");
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!>" + "'", str21, "<hi!>");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        java.lang.String str4 = startTag2.name();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = startTag8.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        java.lang.String str4 = startTag2.name();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->", attributes7);
        startTag8.tagName = "hi!Comment";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.tagName = "<!---->";
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isCharacter();
        startTag0.appendTagName("</<hi!>>");
        startTag0.appendTagName("<hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        java.lang.String str10 = startTag1.tagName;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        boolean boolean3 = doctype0.isForceQuirks();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        boolean boolean7 = startTag6.isComment();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Doctype;
        comment8.type = tokenType9;
        startTag6.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
        boolean boolean14 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Comment");
        boolean boolean2 = character1.isEndTag();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Comment" + "'", str3, "Comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Comment" + "'", str4, "Comment");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Character");
        java.lang.String str2 = character1.getData();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag("</<hi!>>");
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue('4');
        boolean boolean8 = startTag5.isEndTag();
        startTag5.newAttribute();
        boolean boolean10 = startTag5.isComment();
        boolean boolean11 = startTag5.selfClosing;
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        boolean boolean15 = startTag14.isComment();
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType17 = org.jsoup.parser.Token.TokenType.Doctype;
        comment16.type = tokenType17;
        startTag14.type = tokenType17;
        startTag5.type = tokenType17;
        endTag4.type = tokenType17;
        character1.type = tokenType17;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Character" + "'", str2, "Character");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        boolean boolean10 = doctype0.forceQuirks;
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str18 = character17.getData();
        java.lang.String str19 = character17.toString();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder21.initialiseParse("</<!---->>", "</<!---->>", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder21.initialiseParse("StartTag", "<!---->", parseErrorList28);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.String str31 = comment30.getData();
        xmlTreeBuilder21.insert(comment30);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        java.lang.String str34 = comment33.toString();
        boolean boolean35 = comment33.isEndTag();
        xmlTreeBuilder21.insert(comment33);
        org.jsoup.parser.Token.Character character38 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str39 = character38.getData();
        xmlTreeBuilder21.insert(character38);
        xmlTreeBuilder0.insert(character38);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder0.initialiseParse("<hi!4>", "<<hi!>StartTag>", parseErrorList44);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean48 = startTag47.isSelfClosing();
        boolean boolean49 = startTag47.isDoctype();
        startTag47.finaliseTag();
        startTag47.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes53 = startTag47.attributes;
        org.jsoup.nodes.Element element54 = xmlTreeBuilder0.insert(startTag47);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<<!---->>" + "'", str39, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.getName();
        boolean boolean4 = doctype0.isDoctype();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendAttributeValue('4');
        boolean boolean52 = startTag49.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType53 = startTag49.type;
        java.lang.String str54 = startTag49.tagName;
        boolean boolean55 = startTag49.isEndTag();
        startTag49.appendAttributeValue("");
        startTag49.tagName = "<!----><<!---->>";
        boolean boolean60 = startTag49.isSelfClosing();
        boolean boolean61 = startTag49.isStartTag();
        boolean boolean62 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag49);
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str65 = endTag64.toString();
        boolean boolean66 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag64);
        java.lang.String str67 = endTag64.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "</<!---->>" + "'", str65, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "</<!---->>" + "'", str67, "</<!---->>");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        java.lang.String str3 = startTag1.name();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<hi!>");
        boolean boolean6 = startTag1.isComment();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        org.jsoup.parser.Token.TokenType tokenType10 = startTag9.type;
        startTag9.finaliseTag();
        boolean boolean12 = startTag9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType13 = startTag9.type;
        startTag1.type = tokenType13;
        startTag1.appendAttributeValue("hi!EndTag");
        startTag1.appendAttributeName(' ');
        startTag1.tagName = "<hi!4>";
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        startTag26.newAttribute();
        startTag26.tagName = "";
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        startTag23.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("StartTag", attributes30);
        java.lang.String str33 = startTag32.tagName;
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        java.lang.String str35 = comment34.toString();
        org.jsoup.parser.Token.TokenType tokenType36 = comment34.type;
        boolean boolean37 = comment34.isComment();
        java.lang.String str38 = comment34.getData();
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag("");
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("hi!", attributes42);
        org.jsoup.parser.Token.TokenType tokenType44 = startTag43.type;
        endTag40.type = tokenType44;
        comment34.type = tokenType44;
        org.jsoup.parser.Token.TokenType tokenType47 = comment34.type;
        startTag32.type = tokenType47;
        startTag1.type = tokenType47;
        startTag1.tagName = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StartTag" + "'", str33, "StartTag");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        boolean boolean5 = startTag2.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType6 = startTag2.type;
        java.lang.String str7 = startTag2.tokenType();
        startTag2.appendTagName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        java.lang.String str13 = comment10.getData();
        org.jsoup.parser.Token.Comment comment14 = comment10.asComment();
        java.lang.StringBuilder stringBuilder15 = comment14.data;
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        boolean boolean4 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        boolean boolean14 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("");
        boolean boolean21 = character20.isEndTag();
        java.lang.String str22 = character20.toString();
        java.lang.String str23 = character20.getData();
        java.lang.String str24 = character20.toString();
        boolean boolean25 = character20.isEndTag();
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder27 = doctype26.publicIdentifier;
        java.lang.StringBuilder stringBuilder28 = doctype26.publicIdentifier;
        java.lang.String str29 = doctype26.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        startTag32.finaliseTag();
        boolean boolean35 = startTag32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag32.type;
        doctype26.type = tokenType36;
        character20.type = tokenType36;
        java.lang.String str39 = character20.toString();
        boolean boolean40 = character20.isCharacter();
        java.lang.String str41 = character20.getData();
        xmlTreeBuilder0.insert(character20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder43.initialiseParse("</<!---->>", "</<!---->>", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.toString();
        org.jsoup.parser.Token.TokenType tokenType50 = comment48.type;
        java.lang.String str51 = comment48.getData();
        xmlTreeBuilder43.insert(comment48);
        org.jsoup.parser.Token.Comment comment53 = new org.jsoup.parser.Token.Comment();
        boolean boolean54 = comment53.isStartTag();
        java.lang.String str55 = comment53.toString();
        boolean boolean56 = comment53.isCharacter();
        xmlTreeBuilder43.insert(comment53);
        java.lang.String str58 = comment53.getData();
        java.lang.StringBuilder stringBuilder59 = comment53.data;
        boolean boolean60 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment53);
        org.jsoup.parser.Token.Comment comment61 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!---->" + "'", str49, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isEOF();
        endTag1.appendAttributeValue('#');
        java.lang.String str8 = endTag1.toString();
        java.lang.String str9 = endTag1.tagName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        boolean boolean12 = startTag1.isStartTag();
        startTag1.appendAttributeValue("Doctype");
        startTag1.appendAttributeName('#');
        startTag1.finaliseTag();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        boolean boolean10 = comment9.isStartTag();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Doctype;
        comment11.type = tokenType12;
        comment9.type = tokenType12;
        boolean boolean15 = comment9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType16 = comment9.type;
        xmlTreeBuilder0.insert(comment9);
        java.lang.StringBuilder stringBuilder18 = comment9.data;
        java.lang.String str19 = comment9.getData();
        java.lang.StringBuilder stringBuilder20 = comment9.data;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName('a');
        endTag1.appendTagName(' ');
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        startTag2.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue("<hi!>");
        startTag0.appendAttributeValue("<!---->");
        boolean boolean10 = startTag0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.newAttribute();
        java.lang.String str6 = startTag2.tokenType();
        startTag2.finaliseTag();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        java.lang.String str9 = comment8.toString();
        org.jsoup.parser.Token.TokenType tokenType10 = comment8.type;
        boolean boolean11 = comment8.isComment();
        java.lang.String str12 = comment8.getData();
        java.lang.String str13 = comment8.toString();
        boolean boolean14 = comment8.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType15 = comment8.type;
        startTag2.type = tokenType15;
        startTag2.appendTagName('4');
        startTag2.appendTagName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        boolean boolean5 = doctype4.isForceQuirks();
        boolean boolean6 = doctype4.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype4.name;
        doctype4.forceQuirks = true;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.appendAttributeValue(' ');
        java.lang.String str16 = startTag13.tokenType();
        java.lang.String str17 = startTag13.name();
        startTag13.appendTagName("<!---->");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        startTag13.type = tokenType24;
        doctype4.type = tokenType24;
        org.jsoup.parser.Token.TokenType tokenType27 = doctype4.type;
        endTag1.type = tokenType27;
        boolean boolean29 = endTag1.isCharacter();
        org.jsoup.parser.Token.Tag tag31 = endTag1.name("<<hi!>>");
        java.lang.String str32 = endTag1.toString();
        boolean boolean33 = endTag1.isSelfClosing();
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        java.lang.String str35 = comment34.toString();
        org.jsoup.parser.Token.TokenType tokenType36 = comment34.type;
        boolean boolean37 = comment34.isComment();
        java.lang.String str38 = comment34.getData();
        java.lang.String str39 = comment34.toString();
        boolean boolean40 = comment34.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType41 = comment34.type;
        endTag1.type = tokenType41;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<<hi!>>>" + "'", str32, "</<<hi!>>>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!---->" + "'", str39, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        java.lang.String str7 = comment0.toString();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.String str9 = comment0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendTagName("Comment");
        boolean boolean9 = startTag2.isEndTag();
        startTag2.selfClosing = true;
        org.jsoup.nodes.Attributes attributes12 = startTag2.attributes;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        startTag0.appendAttributeValue("</</<!---->StartTag<!----><<!---->>>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        boolean boolean7 = startTag6.selfClosing;
        startTag6.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = startTag6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!----><<!---->>");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!----><<!---->>" + "'", str3, "<!----><<!---->>");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        boolean boolean10 = endTag9.selfClosing;
        org.jsoup.parser.Token.Tag tag12 = endTag9.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.StartTag;
        tag12.type = tokenType13;
        startTag0.type = tokenType13;
        org.jsoup.nodes.Attributes attributes16 = startTag0.getAttributes();
        boolean boolean17 = startTag0.isSelfClosing();
        boolean boolean18 = startTag0.isSelfClosing();
        startTag0.newAttribute();
        startTag0.appendTagName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character22 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.tagName = "<!---->";
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isCharacter();
        startTag0.appendTagName("</<hi!>>");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeValue('4');
        boolean boolean15 = startTag12.isEndTag();
        boolean boolean16 = startTag12.isEOF();
        startTag12.appendAttributeValue("hi!");
        startTag12.appendTagName('4');
        boolean boolean21 = startTag12.isSelfClosing();
        org.jsoup.parser.Token.Tag tag23 = startTag12.name("hi!");
        boolean boolean24 = startTag12.isComment();
        org.jsoup.parser.Token.StartTag startTag25 = startTag12.asStartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag12.attributes;
        startTag0.attributes = attributes26;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment28 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.newAttribute();
        endTag0.appendAttributeValue("");
        endTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        java.lang.String str11 = startTag6.tagName;
        boolean boolean12 = startTag6.isEndTag();
        org.jsoup.nodes.Attributes attributes13 = startTag6.getAttributes();
        org.jsoup.nodes.Attributes attributes14 = startTag6.getAttributes();
        startTag6.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType17 = startTag6.type;
        endTag0.type = tokenType17;
        endTag0.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder16.initialiseParse("", "<<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder16.initialiseParse("<!---->", "hi!", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str31 = startTag30.tokenType();
        boolean boolean32 = startTag30.selfClosing;
        org.jsoup.nodes.Element element33 = xmlTreeBuilder16.insert(startTag30);
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag30);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean37 = startTag36.isSelfClosing();
        boolean boolean38 = startTag36.isDoctype();
        boolean boolean39 = startTag36.isSelfClosing();
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag36);
        org.jsoup.parser.Token.Doctype doctype41 = new org.jsoup.parser.Token.Doctype();
        boolean boolean42 = doctype41.isForceQuirks();
        boolean boolean43 = doctype41.isForceQuirks();
        java.lang.StringBuilder stringBuilder44 = doctype41.systemIdentifier;
        java.lang.StringBuilder stringBuilder45 = doctype41.name;
        java.lang.StringBuilder stringBuilder46 = doctype41.publicIdentifier;
        boolean boolean47 = doctype41.isCharacter();
        java.lang.String str48 = doctype41.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.tagName = "<4>";
        boolean boolean13 = endTag1.isEOF();
        endTag1.appendTagName('a');
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        boolean boolean5 = startTag4.isComment();
        startTag4.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendAttributeValue('4');
        boolean boolean11 = startTag8.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = startTag8.type;
        startTag4.type = tokenType12;
        endTag1.type = tokenType12;
        java.lang.Class<?> wildcardClass15 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        boolean boolean4 = startTag2.isEndTag();
        boolean boolean5 = startTag2.isEOF();
        java.lang.String str6 = startTag2.name();
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("StartTag", attributes7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype10 = doctype0.asDoctype();
        java.lang.String str11 = doctype10.getPublicIdentifier();
        java.lang.String str12 = doctype10.getName();
        java.lang.String str13 = doctype10.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = doctype10.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        java.lang.String str23 = comment16.getData();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = comment0.type;
        java.lang.String str8 = comment0.getData();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        boolean boolean10 = comment0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder15 = doctype0.publicIdentifier;
        java.lang.String str16 = doctype0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Doctype" + "'", str16, "Doctype");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "StartTag", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("<!---->", "<<!---->>", parseErrorList29);
        org.jsoup.parser.Token.Character character32 = new org.jsoup.parser.Token.Character("");
        java.lang.String str33 = character32.toString();
        java.lang.String str34 = character32.getData();
        java.lang.String str35 = character32.toString();
        java.lang.String str36 = character32.toString();
        boolean boolean37 = xmlTreeBuilder22.process((org.jsoup.parser.Token) character32);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        boolean boolean39 = comment38.isStartTag();
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType41 = org.jsoup.parser.Token.TokenType.Doctype;
        comment40.type = tokenType41;
        comment38.type = tokenType41;
        boolean boolean44 = comment38.isStartTag();
        java.lang.StringBuilder stringBuilder45 = comment38.data;
        boolean boolean46 = comment38.isStartTag();
        java.lang.String str47 = comment38.toString();
        xmlTreeBuilder22.insert(comment38);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendAttributeValue('4');
        boolean boolean52 = startTag49.isEndTag();
        boolean boolean53 = startTag49.isEOF();
        startTag49.appendAttributeValue("hi!");
        startTag49.appendTagName('4');
        boolean boolean58 = startTag49.isSelfClosing();
        boolean boolean59 = startTag49.isComment();
        org.jsoup.nodes.Element element60 = xmlTreeBuilder22.insert(startTag49);
        org.jsoup.nodes.Element element61 = xmlTreeBuilder0.insert(startTag49);
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        startTag63.appendAttributeValue('4');
        boolean boolean66 = startTag63.isEndTag();
        boolean boolean67 = startTag63.isEOF();
        startTag63.appendAttributeValue("hi!");
        startTag63.appendAttributeName('#');
        boolean boolean72 = startTag63.isSelfClosing();
        org.jsoup.nodes.Attributes attributes74 = null;
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag("hi!", attributes74);
        startTag75.newAttribute();
        startTag75.tagName = "";
        org.jsoup.nodes.Attributes attributes79 = startTag75.attributes;
        startTag63.attributes = attributes79;
        org.jsoup.parser.Token.StartTag startTag81 = new org.jsoup.parser.Token.StartTag("hi!EndTag", attributes79);
        org.jsoup.nodes.Element element82 = xmlTreeBuilder0.insert(startTag81);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!---->" + "'", str47, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(element82);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag11.appendTagName('4');
        boolean boolean14 = startTag11.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = startTag11.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendAttributeValue('4');
        boolean boolean52 = startTag49.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType53 = startTag49.type;
        java.lang.String str54 = startTag49.tagName;
        boolean boolean55 = startTag49.isEndTag();
        startTag49.appendAttributeValue("");
        startTag49.tagName = "<!----><<!---->>";
        boolean boolean60 = startTag49.isSelfClosing();
        boolean boolean61 = startTag49.isStartTag();
        boolean boolean62 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag49);
        startTag49.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendAttributeValue('4');
        boolean boolean52 = startTag49.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType53 = startTag49.type;
        java.lang.String str54 = startTag49.tagName;
        boolean boolean55 = startTag49.isEndTag();
        startTag49.appendAttributeValue("");
        startTag49.tagName = "<!----><<!---->>";
        boolean boolean60 = startTag49.isSelfClosing();
        boolean boolean61 = startTag49.isStartTag();
        boolean boolean62 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag49);
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str65 = endTag64.toString();
        boolean boolean66 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag64);
        org.jsoup.nodes.Attributes attributes68 = null;
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag("hi!", attributes68);
        startTag69.newAttribute();
        startTag69.tagName = "";
        org.jsoup.nodes.Attributes attributes73 = startTag69.attributes;
        endTag64.attributes = attributes73;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "</<!---->>" + "'", str65, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(attributes73);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</<!---->StartTag>");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->StartTag>" + "'", str2, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->StartTag>" + "'", str3, "</<!---->StartTag>");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("EndTag");
        endTag1.selfClosing = true;
        java.lang.String str4 = endTag1.tokenType();
        boolean boolean5 = endTag1.isSelfClosing();
        org.jsoup.nodes.Attributes attributes6 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = comment0.type;
        java.lang.String str8 = comment0.getData();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        boolean boolean10 = comment0.isEndTag();
        boolean boolean11 = comment0.isStartTag();
        java.lang.StringBuilder stringBuilder12 = comment0.data;
        java.lang.String str13 = comment0.getData();
        java.lang.StringBuilder stringBuilder14 = comment0.data;
        boolean boolean15 = comment0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName("EndTag");
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        startTag2.appendTagName('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        startTag1.tagName = "<!---->";
        boolean boolean12 = startTag1.isCharacter();
        startTag1.finaliseTag();
        org.jsoup.nodes.Attributes attributes14 = startTag1.attributes;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        boolean boolean10 = endTag9.selfClosing;
        org.jsoup.parser.Token.Tag tag12 = endTag9.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.StartTag;
        tag12.type = tokenType13;
        startTag0.type = tokenType13;
        org.jsoup.nodes.Attributes attributes16 = startTag0.getAttributes();
        startTag0.appendTagName("</</<!---->>>");
        startTag0.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        boolean boolean10 = comment9.isStartTag();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Doctype;
        comment11.type = tokenType12;
        comment9.type = tokenType12;
        boolean boolean15 = comment9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType16 = comment9.type;
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character("");
        boolean boolean20 = character19.isEndTag();
        java.lang.String str21 = character19.toString();
        java.lang.String str22 = character19.getData();
        java.lang.String str23 = character19.toString();
        boolean boolean24 = character19.isEndTag();
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder26 = doctype25.publicIdentifier;
        java.lang.StringBuilder stringBuilder27 = doctype25.publicIdentifier;
        java.lang.String str28 = doctype25.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes30);
        org.jsoup.parser.Token.TokenType tokenType32 = startTag31.type;
        startTag31.finaliseTag();
        boolean boolean34 = startTag31.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType35 = startTag31.type;
        doctype25.type = tokenType35;
        character19.type = tokenType35;
        java.lang.String str38 = character19.toString();
        boolean boolean39 = character19.isCharacter();
        xmlTreeBuilder0.insert(character19);
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("hi!", attributes42);
        boolean boolean44 = startTag43.isComment();
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType46 = org.jsoup.parser.Token.TokenType.Doctype;
        comment45.type = tokenType46;
        startTag43.type = tokenType46;
        startTag43.appendAttributeName("hi!");
        boolean boolean51 = startTag43.isCharacter();
        java.lang.String str52 = startTag43.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element53 = xmlTreeBuilder0.insert(startTag43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType1 = org.jsoup.parser.Token.TokenType.Doctype;
        comment0.type = tokenType1;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        startTag2.appendAttributeValue('a');
        java.lang.String str7 = startTag2.tokenType();
        boolean boolean8 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.nodes.Attributes attributes3 = startTag2.attributes;
        boolean boolean4 = startTag2.isComment();
        startTag2.appendTagName('4');
        boolean boolean7 = startTag2.isDoctype();
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        boolean boolean10 = startTag9.isComment();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Doctype;
        comment11.type = tokenType12;
        startTag9.type = tokenType12;
        startTag0.type = tokenType12;
        org.jsoup.parser.Token.TokenType tokenType16 = startTag0.type;
        java.lang.String str17 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes18 = startTag0.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("<<<!---->>>");
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("</<!---->>", "StartTag", parseErrorList23);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.String str26 = comment25.toString();
        xmlTreeBuilder20.insert(comment25);
        org.jsoup.parser.Token.Character character29 = new org.jsoup.parser.Token.Character("");
        java.lang.String str30 = character29.toString();
        xmlTreeBuilder20.insert(character29);
        org.jsoup.parser.Token.Character character33 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str34 = character33.toString();
        xmlTreeBuilder20.insert(character33);
        java.lang.String str36 = character33.getData();
        xmlTreeBuilder0.insert(character33);
        java.lang.String str38 = character33.getData();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<<!---->>" + "'", str34, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<<!---->>" + "'", str36, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<<!---->>" + "'", str38, "<<!---->>");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        boolean boolean22 = comment16.isStartTag();
        java.lang.StringBuilder stringBuilder23 = comment16.data;
        boolean boolean24 = comment16.isStartTag();
        java.lang.String str25 = comment16.toString();
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isEndTag();
        boolean boolean31 = startTag27.isEOF();
        startTag27.appendAttributeValue("hi!");
        startTag27.appendTagName('4');
        boolean boolean36 = startTag27.isSelfClosing();
        boolean boolean37 = startTag27.isComment();
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("</<!---->>", "</<!---->>", parseErrorList42);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder39.initialiseParse("StartTag", "<!---->", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.getData();
        xmlTreeBuilder39.insert(comment48);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.String str52 = comment51.toString();
        boolean boolean53 = comment51.isEndTag();
        xmlTreeBuilder39.insert(comment51);
        org.jsoup.parser.Token.Character character56 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str57 = character56.getData();
        java.lang.String str58 = character56.toString();
        xmlTreeBuilder39.insert(character56);
        xmlTreeBuilder0.insert(character56);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag61 = character56.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.finaliseTag();
        java.lang.String str5 = startTag1.tagName;
        boolean boolean6 = startTag1.isEndTag();
        boolean boolean7 = startTag1.isComment();
        startTag1.appendAttributeValue('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        endTag1.finaliseTag();
        boolean boolean13 = endTag1.isComment();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        startTag0.appendTagName('a');
        boolean boolean8 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</<!---->>", "</<!---->>", parseErrorList20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder17.initialiseParse("", "<<!---->>", parseErrorList24);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.String str27 = comment26.toString();
        org.jsoup.parser.Token.TokenType tokenType28 = comment26.type;
        boolean boolean29 = comment26.isComment();
        java.lang.String str30 = comment26.getData();
        java.lang.String str31 = comment26.toString();
        java.lang.String str32 = comment26.getData();
        xmlTreeBuilder17.insert(comment26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</<!---->>", "</<!---->>", parseErrorList37);
        org.jsoup.parser.Token.Comment comment39 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType40 = org.jsoup.parser.Token.TokenType.Doctype;
        comment39.type = tokenType40;
        java.lang.StringBuilder stringBuilder42 = comment39.data;
        xmlTreeBuilder34.insert(comment39);
        org.jsoup.parser.Token.Comment comment44 = new org.jsoup.parser.Token.Comment();
        java.lang.String str45 = comment44.toString();
        xmlTreeBuilder34.insert(comment44);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder34.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList49);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType52 = org.jsoup.parser.Token.TokenType.Doctype;
        comment51.type = tokenType52;
        java.lang.StringBuilder stringBuilder54 = comment51.data;
        boolean boolean55 = comment51.isEOF();
        xmlTreeBuilder34.insert(comment51);
        xmlTreeBuilder17.insert(comment51);
        org.jsoup.parser.Token.TokenType tokenType58 = comment51.type;
        java.lang.String str59 = comment51.toString();
        java.lang.String str60 = comment51.getData();
        java.lang.String str61 = comment51.getData();
        xmlTreeBuilder0.insert(comment51);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + tokenType40 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType40.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType52 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType52.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + tokenType58 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType58.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<!---->" + "'", str59, "<!---->");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag9.appendTagName("<<!---->>");
        java.lang.String str12 = startTag9.name();
        boolean boolean13 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag9);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag15.newAttribute();
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "</<!---->>", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder18.initialiseParse("StartTag", "<!---->", parseErrorList25);
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        java.lang.String str28 = comment27.getData();
        xmlTreeBuilder18.insert(comment27);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.String str31 = comment30.toString();
        boolean boolean32 = comment30.isEndTag();
        xmlTreeBuilder18.insert(comment30);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        boolean boolean35 = comment34.isStartTag();
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.Doctype;
        comment36.type = tokenType37;
        comment34.type = tokenType37;
        xmlTreeBuilder18.insert(comment34);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str43 = startTag42.toString();
        java.lang.String str44 = startTag42.name();
        org.jsoup.parser.Token.Tag tag46 = startTag42.name("<hi!>");
        boolean boolean47 = startTag42.isComment();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("hi!", attributes49);
        org.jsoup.parser.Token.TokenType tokenType51 = startTag50.type;
        startTag50.finaliseTag();
        boolean boolean53 = startTag50.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType54 = startTag50.type;
        startTag42.type = tokenType54;
        org.jsoup.nodes.Element element56 = xmlTreeBuilder18.insert(startTag42);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag42);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        startTag58.appendAttributeValue('4');
        boolean boolean61 = startTag58.isEndTag();
        boolean boolean62 = startTag58.isEOF();
        startTag58.appendAttributeValue("hi!");
        startTag58.appendTagName('4');
        boolean boolean67 = startTag58.isSelfClosing();
        org.jsoup.parser.Token.Tag tag69 = startTag58.name("hi!");
        boolean boolean70 = startTag58.isComment();
        org.jsoup.parser.Token.StartTag startTag71 = startTag58.asStartTag();
        org.jsoup.parser.Token.StartTag startTag72 = startTag71.asStartTag();
        boolean boolean73 = startTag72.isEndTag();
        startTag72.appendTagName("</<hi!>>");
        boolean boolean76 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag72);
        boolean boolean77 = startTag72.isCharacter();
        boolean boolean78 = startTag72.isComment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<<!---->>" + "'", str43, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + tokenType51 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType51.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(startTag71);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.forceQuirks;
        boolean boolean9 = doctype7.isForceQuirks();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str12 = endTag11.toString();
        endTag11.appendAttributeValue('4');
        boolean boolean15 = endTag11.isEOF();
        java.lang.String str16 = endTag11.toString();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str19 = endTag18.toString();
        endTag18.appendAttributeValue('4');
        boolean boolean22 = endTag18.isSelfClosing();
        endTag18.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType24 = endTag18.type;
        endTag11.type = tokenType24;
        org.jsoup.parser.Token.TokenType tokenType26 = endTag11.type;
        doctype7.type = tokenType26;
        boolean boolean28 = doctype7.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</<!---->>" + "'", str12, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "</<!---->>" + "'", str16, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</<!---->>" + "'", str19, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype9 = doctype7.asDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.systemIdentifier;
        java.lang.String str11 = doctype9.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag9.appendTagName("<<!---->>");
        java.lang.String str12 = startTag9.name();
        boolean boolean13 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag9);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag15.newAttribute();
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "</<!---->>", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder18.initialiseParse("StartTag", "<!---->", parseErrorList25);
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        java.lang.String str28 = comment27.getData();
        xmlTreeBuilder18.insert(comment27);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.String str31 = comment30.toString();
        boolean boolean32 = comment30.isEndTag();
        xmlTreeBuilder18.insert(comment30);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        boolean boolean35 = comment34.isStartTag();
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.Doctype;
        comment36.type = tokenType37;
        comment34.type = tokenType37;
        xmlTreeBuilder18.insert(comment34);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str43 = startTag42.toString();
        java.lang.String str44 = startTag42.name();
        org.jsoup.parser.Token.Tag tag46 = startTag42.name("<hi!>");
        boolean boolean47 = startTag42.isComment();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("hi!", attributes49);
        org.jsoup.parser.Token.TokenType tokenType51 = startTag50.type;
        startTag50.finaliseTag();
        boolean boolean53 = startTag50.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType54 = startTag50.type;
        startTag42.type = tokenType54;
        org.jsoup.nodes.Element element56 = xmlTreeBuilder18.insert(startTag42);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag42);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        startTag58.appendAttributeValue('4');
        boolean boolean61 = startTag58.isEndTag();
        boolean boolean62 = startTag58.isEOF();
        startTag58.appendAttributeValue("hi!");
        startTag58.appendTagName('4');
        boolean boolean67 = startTag58.isSelfClosing();
        org.jsoup.parser.Token.Tag tag69 = startTag58.name("hi!");
        boolean boolean70 = startTag58.isComment();
        org.jsoup.parser.Token.StartTag startTag71 = startTag58.asStartTag();
        org.jsoup.parser.Token.StartTag startTag72 = startTag71.asStartTag();
        boolean boolean73 = startTag72.isEndTag();
        startTag72.appendTagName("</<hi!>>");
        boolean boolean76 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag72);
        boolean boolean77 = startTag72.isCharacter();
        java.lang.String str78 = startTag72.name();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<<!---->>" + "'", str43, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + tokenType51 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType51.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(startTag71);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!</<hi!>>" + "'", str78, "hi!</<hi!>>");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        java.lang.String str9 = startTag2.name();
        startTag2.appendAttributeValue('#');
        boolean boolean12 = startTag2.isCharacter();
        java.lang.String str13 = startTag2.toString();
        startTag2.tagName = "</</<!---->>>";
        org.jsoup.parser.Token.Tag tag17 = startTag2.name("hi!Comment");
        startTag2.appendAttributeName('#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!<!---->" + "'", str9, "hi!<!---->");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!<!---->>" + "'", str13, "<hi!<!---->>");
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        org.jsoup.parser.Token.TokenType tokenType4 = startTag3.type;
        startTag3.finaliseTag();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("hi!", attributes7);
        boolean boolean9 = startTag8.isComment();
        org.jsoup.nodes.Attributes attributes10 = startTag8.attributes;
        startTag8.finaliseTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        boolean boolean15 = startTag14.isComment();
        boolean boolean16 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.nodes.Attributes attributes18 = startTag14.getAttributes();
        startTag8.attributes = attributes18;
        startTag3.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("</</<!---->StartTag<!----><<!---->>>>", attributes18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment22 = startTag21.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        java.lang.String str10 = endTag6.toString();
        boolean boolean11 = endTag6.selfClosing;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->>" + "'", str10, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        startTag2.newAttribute();
        startTag2.finaliseTag();
        boolean boolean7 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("</<!---->>", "</<!---->>", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        org.jsoup.parser.Token.TokenType tokenType16 = comment14.type;
        java.lang.String str17 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        java.lang.String str19 = comment14.toString();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.selfClosing = false;
        startTag21.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes26 = startTag21.getAttributes();
        startTag21.appendAttributeValue('a');
        startTag21.finaliseTag();
        org.jsoup.nodes.Element element30 = xmlTreeBuilder0.insert(startTag21);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder0.initialiseParse("<hi!4hi!EndTag>", "<<</<hi!>>>>", parseErrorList33);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.selfClosing = true;
        java.lang.String str14 = startTag1.tagName;
        startTag1.appendAttributeValue("<<<hi!>>>");
        startTag1.finaliseTag();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType7 = endTag1.type;
        java.lang.String str8 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        startTag0.appendTagName('a');
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeValue('4');
        boolean boolean14 = startTag11.isEndTag();
        startTag11.newAttribute();
        boolean boolean16 = startTag11.isComment();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("hi!", attributes20);
        startTag21.newAttribute();
        startTag21.tagName = "";
        org.jsoup.nodes.Attributes attributes25 = startTag21.attributes;
        startTag18.attributes = attributes25;
        startTag11.attributes = attributes25;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->", attributes25);
        tag9.attributes = attributes25;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag30 = tag9.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.Class<?> wildcardClass10 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype4.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str3 = endTag2.toString();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue('4');
        boolean boolean8 = startTag5.isEndTag();
        startTag5.newAttribute();
        boolean boolean10 = startTag5.isComment();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        startTag15.newAttribute();
        startTag15.tagName = "";
        org.jsoup.nodes.Attributes attributes19 = startTag15.attributes;
        startTag12.attributes = attributes19;
        startTag5.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("<!---->", attributes19);
        endTag2.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("hi!EndTag", attributes19);
        startTag24.finaliseTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</</<!---->>>" + "'", str3, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("hi!", attributes17);
        startTag18.newAttribute();
        startTag18.tagName = "";
        org.jsoup.nodes.Attributes attributes22 = startTag18.attributes;
        startTag15.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("StartTag", attributes22);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("hi!", attributes28);
        startTag29.newAttribute();
        startTag29.tagName = "";
        org.jsoup.nodes.Attributes attributes33 = startTag29.attributes;
        startTag26.attributes = attributes33;
        startTag24.attributes = attributes33;
        startTag24.newAttribute();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("hi!", attributes38);
        boolean boolean40 = startTag39.isComment();
        startTag39.appendAttributeName('4');
        java.lang.String str43 = startTag39.tokenType();
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("hi!", attributes45);
        startTag46.appendAttributeValue(' ');
        java.lang.String str49 = startTag46.tokenType();
        java.lang.String str50 = startTag46.name();
        startTag46.appendTagName("<!---->");
        startTag46.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        startTag55.selfClosing = false;
        startTag55.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes60 = startTag55.getAttributes();
        startTag46.attributes = attributes60;
        startTag39.attributes = attributes60;
        startTag24.attributes = attributes60;
        endTag1.attributes = attributes60;
        endTag1.appendAttributeValue("StartTag");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "StartTag" + "'", str43, "StartTag");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "StartTag" + "'", str49, "StartTag");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(attributes60);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("< >");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        boolean boolean11 = startTag2.isDoctype();
        org.jsoup.parser.Token.StartTag startTag12 = startTag2.asStartTag();
        boolean boolean13 = startTag2.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = xmlTreeBuilder0.insert(startTag2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        java.lang.String str6 = startTag1.toString();
        boolean boolean7 = startTag1.isEndTag();
        startTag1.finaliseTag();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag11 = startTag1.name("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<<!---->>" + "'", str6, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        startTag0.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag0.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean3 = startTag2.isSelfClosing();
        boolean boolean4 = startTag2.isDoctype();
        startTag2.newAttribute();
        startTag2.tagName = "</<!---->>";
        org.jsoup.nodes.Attributes attributes8 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("</<!----><<!---->>>", attributes8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.selfClosing = true;
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str2 = endTag1.toString();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendAttributeValue('4');
        boolean boolean7 = startTag4.isEndTag();
        startTag4.newAttribute();
        boolean boolean9 = startTag4.isComment();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        startTag14.newAttribute();
        startTag14.tagName = "";
        org.jsoup.nodes.Attributes attributes18 = startTag14.attributes;
        startTag11.attributes = attributes18;
        startTag4.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->", attributes18);
        endTag1.attributes = attributes18;
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("hi!");
        endTag24.appendAttributeValue("");
        endTag24.appendAttributeValue('#');
        org.jsoup.parser.Token.TokenType tokenType29 = endTag24.type;
        endTag1.type = tokenType29;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        tag6.appendAttributeValue('#');
        tag6.appendTagName('4');
        java.lang.String str12 = tag6.tokenType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.selfClosing = false;
        boolean boolean10 = startTag2.isCharacter();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        boolean boolean14 = startTag13.isComment();
        boolean boolean15 = startTag13.selfClosing;
        startTag13.newAttribute();
        org.jsoup.nodes.Attributes attributes17 = startTag13.getAttributes();
        startTag2.attributes = attributes17;
        org.jsoup.nodes.Attributes attributes19 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        boolean boolean2 = character1.isEndTag();
        boolean boolean3 = character1.isCharacter();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<hi!>StartTag>");
        endTag1.finaliseTag();
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jsoup.parser.Token.EndTag endTag3 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str4 = endTag3.toString();
        endTag3.appendTagName("<<!---->>");
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        startTag12.newAttribute();
        startTag12.tagName = "";
        org.jsoup.nodes.Attributes attributes16 = startTag12.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("", attributes16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendAttributeValue('4');
        boolean boolean21 = startTag18.isDoctype();
        org.jsoup.nodes.Attributes attributes22 = startTag18.attributes;
        startTag17.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes22);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes22);
        endTag3.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!4hi!EndTag", attributes22);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<!---->>" + "'", str4, "</<!---->>");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName("EndTag");
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        startTag2.tagName = "hi!EndTag";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        boolean boolean11 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jsoup.parser.Token.EndTag endTag3 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str4 = endTag3.toString();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isEndTag();
        startTag6.newAttribute();
        boolean boolean11 = startTag6.isComment();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag13.attributes = attributes20;
        startTag6.attributes = attributes20;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("<!---->", attributes20);
        endTag3.attributes = attributes20;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("hi!EndTag", attributes20);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</</<!---->>>" + "'", str4, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isCharacter();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        startTag0.appendAttributeValue("Comment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<a>");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("");
        java.lang.String str15 = character14.toString();
        java.lang.String str16 = character14.getData();
        java.lang.String str17 = character14.getData();
        java.lang.String str18 = character14.toString();
        java.lang.String str19 = character14.getData();
        xmlTreeBuilder0.insert(character14);
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.getData();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("StartTag", attributes9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag13.attributes = attributes20;
        startTag11.attributes = attributes20;
        startTag11.newAttribute();
        boolean boolean24 = startTag11.isDoctype();
        startTag11.appendAttributeName(' ');
        java.lang.Class<?> wildcardClass27 = startTag11.getClass();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.getData();
        java.lang.String str18 = character15.toString();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("</<!---->>", "</<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder20.initialiseParse("StartTag", "<!---->", parseErrorList27);
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character("");
        java.lang.String str31 = character30.toString();
        xmlTreeBuilder20.insert(character30);
        xmlTreeBuilder0.insert(character30);
        java.lang.String str34 = character30.getData();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.getName();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!<!---->");
        java.lang.String str2 = endTag1.name();
        java.lang.String str3 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!<!---->" + "'", str2, "hi!<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!<!---->>" + "'", str3, "</hi!<!---->>");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        startTag1.appendAttributeValue('#');
        java.lang.String str5 = startTag1.name();
        boolean boolean6 = startTag1.isEndTag();
        boolean boolean7 = startTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str6 = startTag5.toString();
        java.lang.String str7 = startTag5.name();
        org.jsoup.parser.Token.Tag tag9 = startTag5.name("<hi!>");
        org.jsoup.nodes.Attributes attributes10 = startTag5.getAttributes();
        startTag1.attributes = attributes10;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<hi!  hi!=\"\">", attributes10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<<!---->>" + "'", str6, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        boolean boolean23 = comment16.isDoctype();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        boolean boolean5 = startTag2.isSelfClosing();
        java.lang.String str6 = startTag2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean3 = startTag2.isSelfClosing();
        boolean boolean4 = startTag2.isDoctype();
        startTag2.newAttribute();
        startTag2.tagName = "</<!---->>";
        org.jsoup.nodes.Attributes attributes8 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!4hi!EndTag", attributes8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeValue('4');
        boolean boolean13 = startTag10.isEndTag();
        startTag10.newAttribute();
        boolean boolean15 = startTag10.isComment();
        boolean boolean16 = startTag10.selfClosing;
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag10.attributes = attributes17;
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        boolean boolean20 = endTag19.selfClosing;
        org.jsoup.parser.Token.Tag tag22 = endTag19.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.StartTag;
        tag22.type = tokenType23;
        startTag10.type = tokenType23;
        org.jsoup.nodes.Attributes attributes26 = startTag10.getAttributes();
        boolean boolean27 = startTag10.isSelfClosing();
        boolean boolean28 = startTag10.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType29 = startTag10.type;
        doctype0.type = tokenType29;
        boolean boolean31 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.appendAttributeValue("EndTag");
        boolean boolean6 = startTag1.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag7 = startTag1.asStartTag();
        startTag1.finaliseTag();
        startTag1.appendAttributeName("<hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag7);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "<hi!>", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder14.initialiseParse("", "<<!---->>", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.toString();
        org.jsoup.parser.Token.TokenType tokenType25 = comment23.type;
        boolean boolean26 = comment23.isComment();
        java.lang.String str27 = comment23.getData();
        java.lang.String str28 = comment23.toString();
        java.lang.String str29 = comment23.getData();
        xmlTreeBuilder14.insert(comment23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("</<!---->>", "</<!---->>", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.Doctype;
        comment36.type = tokenType37;
        java.lang.StringBuilder stringBuilder39 = comment36.data;
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.String str42 = comment41.toString();
        xmlTreeBuilder31.insert(comment41);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder31.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType49 = org.jsoup.parser.Token.TokenType.Doctype;
        comment48.type = tokenType49;
        java.lang.StringBuilder stringBuilder51 = comment48.data;
        boolean boolean52 = comment48.isEOF();
        xmlTreeBuilder31.insert(comment48);
        xmlTreeBuilder14.insert(comment48);
        xmlTreeBuilder0.insert(comment48);
        org.jsoup.parser.Token.Comment comment56 = new org.jsoup.parser.Token.Comment();
        boolean boolean57 = comment56.isStartTag();
        java.lang.String str58 = comment56.toString();
        java.lang.String str59 = comment56.getData();
        java.lang.String str60 = comment56.getData();
        xmlTreeBuilder0.insert(comment56);
        java.lang.String str62 = comment56.getData();
        java.lang.String str63 = comment56.tokenType();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!---->" + "'", str58, "<!---->");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Comment" + "'", str63, "Comment");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.appendAttributeName('4');
        org.jsoup.nodes.Attributes attributes11 = startTag8.attributes;
        startTag8.tagName = "</<4>>";
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = doctype0.type;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("");
        startTag1.appendTagName('a');
        org.jsoup.nodes.Attributes attributes4 = startTag1.getAttributes();
        startTag1.appendAttributeName("</</hi!<!---->>>");
        startTag1.tagName = "<</<hi!>>>";
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        java.lang.String str4 = startTag2.name();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        boolean boolean9 = startTag8.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        java.lang.String str3 = startTag2.toString();
        startTag2.appendAttributeName('a');
        java.lang.String str6 = startTag2.toString();
        startTag2.appendAttributeName("hi!EndTag");
        startTag2.newAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!>" + "'", str3, "<hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        boolean boolean6 = startTag2.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag2.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = doctype8.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<<!---->>");
        org.jsoup.parser.Token.TokenType tokenType6 = tag5.type;
        boolean boolean7 = tag5.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = tag5.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        xmlTreeBuilder0.initialiseParse("Doctype", "</</<!---->>>", parseErrorList14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "</<!---->>", parseErrorList18);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!", attributes21);
        boolean boolean23 = startTag22.isComment();
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.Doctype;
        comment24.type = tokenType25;
        startTag22.type = tokenType25;
        java.lang.String str28 = startTag22.tagName;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("hi!", attributes32);
        startTag33.newAttribute();
        startTag33.tagName = "";
        org.jsoup.nodes.Attributes attributes37 = startTag33.attributes;
        startTag30.attributes = attributes37;
        startTag22.attributes = attributes37;
        java.lang.String str40 = startTag22.tagName;
        boolean boolean41 = startTag22.isCharacter();
        startTag22.appendAttributeValue("<<hi!>StartTag>");
        org.jsoup.nodes.Attributes attributes44 = startTag22.attributes;
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag22);
        org.jsoup.parser.Token.Tag tag47 = startTag22.name("</<<!---->>>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(tag47);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder16.initialiseParse("", "<<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder16.initialiseParse("<!---->", "hi!", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str31 = startTag30.tokenType();
        boolean boolean32 = startTag30.selfClosing;
        org.jsoup.nodes.Element element33 = xmlTreeBuilder16.insert(startTag30);
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag30);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        boolean boolean36 = comment35.isStartTag();
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.Doctype;
        comment37.type = tokenType38;
        comment35.type = tokenType38;
        boolean boolean41 = comment35.isStartTag();
        java.lang.String str42 = comment35.toString();
        xmlTreeBuilder0.insert(comment35);
        org.jsoup.parser.Token.TokenType tokenType44 = comment35.type;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        java.lang.String str36 = comment31.tokenType();
        java.lang.String str37 = comment31.getData();
        java.lang.String str38 = comment31.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Comment" + "'", str36, "Comment");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        startTag2.appendAttributeValue('a');
        java.lang.String str7 = startTag2.tokenType();
        java.lang.String str8 = startTag2.tagName;
        java.lang.String str9 = startTag2.toString();
        startTag2.appendTagName('#');
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('#');
        startTag0.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        startTag9.newAttribute();
        startTag9.tagName = "";
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        startTag6.attributes = attributes13;
        boolean boolean15 = startTag6.isDoctype();
        org.jsoup.parser.Token.StartTag startTag16 = startTag6.asStartTag();
        boolean boolean17 = startTag16.isEOF();
        startTag16.selfClosing = true;
        org.jsoup.nodes.Element element20 = xmlTreeBuilder0.insert(startTag16);
        org.jsoup.parser.Token.Character character22 = new org.jsoup.parser.Token.Character("<<!---->>4");
        xmlTreeBuilder0.insert(character22);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder24.initialiseParse("", "<<!---->>", parseErrorList27);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        boolean boolean30 = comment29.isStartTag();
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType32 = org.jsoup.parser.Token.TokenType.Doctype;
        comment31.type = tokenType32;
        comment29.type = tokenType32;
        boolean boolean35 = comment29.isStartTag();
        java.lang.String str36 = comment29.getData();
        xmlTreeBuilder24.insert(comment29);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        xmlTreeBuilder24.initialiseParse("Character", "<!----><<!---->>", parseErrorList40);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        xmlTreeBuilder42.initialiseParse("</<!---->>", "</<!---->>", parseErrorList45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder42.initialiseParse("StartTag", "<hi!>", parseErrorList49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        xmlTreeBuilder51.initialiseParse("</<!---->>", "</<!---->>", parseErrorList54);
        org.jsoup.parser.Token.Comment comment56 = new org.jsoup.parser.Token.Comment();
        java.lang.String str57 = comment56.toString();
        org.jsoup.parser.Token.TokenType tokenType58 = comment56.type;
        java.lang.String str59 = comment56.getData();
        xmlTreeBuilder51.insert(comment56);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType62 = org.jsoup.parser.Token.TokenType.Doctype;
        comment61.type = tokenType62;
        xmlTreeBuilder51.insert(comment61);
        xmlTreeBuilder42.insert(comment61);
        xmlTreeBuilder24.insert(comment61);
        xmlTreeBuilder0.insert(comment61);
        org.jsoup.parser.Token.Doctype doctype68 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType58 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType58.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType3;
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.isComment();
        java.lang.String str8 = doctype0.getName();
        java.lang.String str9 = doctype0.getName();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        startTag2.appendAttributeName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType9 = startTag2.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<!---->>", parseErrorList16);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("", "<<!---->>", parseErrorList21);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str25 = endTag24.toString();
        java.lang.String str26 = endTag24.toString();
        boolean boolean27 = xmlTreeBuilder18.process((org.jsoup.parser.Token) endTag24);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder18.initialiseParse("hi!<!---->", "", parseErrorList30);
        org.jsoup.parser.Token.Character character33 = new org.jsoup.parser.Token.Character("EndTag");
        xmlTreeBuilder18.insert(character33);
        xmlTreeBuilder0.insert(character33);
        java.lang.String str36 = character33.getData();
        java.lang.String str37 = character33.getData();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</<!---->>" + "'", str25, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</<!---->>" + "'", str26, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EndTag" + "'", str36, "EndTag");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EndTag" + "'", str37, "EndTag");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        boolean boolean4 = startTag2.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        java.lang.String str6 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("StartTag");
        boolean boolean9 = startTag2.selfClosing;
        startTag2.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        org.jsoup.parser.Token.Tag tag12 = startTag2.name("<!---->StartTag");
        startTag2.tagName = "</<!----><<!---->>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = startTag2.asStartTag();
        startTag2.appendAttributeValue(' ');
        boolean boolean10 = startTag2.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        tag11.appendTagName('4');
        boolean boolean14 = tag11.isDoctype();
        tag11.selfClosing = false;
        tag11.newAttribute();
        tag11.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag20 = tag11.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        java.lang.String str9 = startTag2.name();
        boolean boolean10 = startTag2.isCharacter();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!<!---->" + "'", str9, "hi!<!---->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->", attributes1);
        startTag2.tagName = "</<hi!>>";
        java.lang.String str5 = startTag2.name();
        boolean boolean6 = startTag2.isEndTag();
        java.lang.String str7 = startTag2.tokenType();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendAttributeValue('4');
        boolean boolean12 = startTag9.isEndTag();
        startTag9.newAttribute();
        boolean boolean14 = startTag9.isComment();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!", attributes18);
        startTag19.newAttribute();
        startTag19.tagName = "";
        org.jsoup.nodes.Attributes attributes23 = startTag19.attributes;
        startTag16.attributes = attributes23;
        startTag9.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("<!---->", attributes23);
        startTag2.attributes = attributes23;
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("hi!", attributes29);
        boolean boolean31 = startTag30.isComment();
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType33 = org.jsoup.parser.Token.TokenType.Doctype;
        comment32.type = tokenType33;
        startTag30.type = tokenType33;
        java.lang.String str36 = startTag30.tagName;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("hi!", attributes40);
        startTag41.newAttribute();
        startTag41.tagName = "";
        org.jsoup.nodes.Attributes attributes45 = startTag41.attributes;
        startTag38.attributes = attributes45;
        startTag30.attributes = attributes45;
        org.jsoup.nodes.Attributes attributes48 = startTag30.getAttributes();
        startTag2.attributes = attributes48;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<hi!>>" + "'", str5, "</<hi!>>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("");
        boolean boolean25 = character24.isEndTag();
        boolean boolean26 = character24.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType27 = character24.type;
        xmlTreeBuilder0.insert(character24);
        java.lang.String str29 = character24.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        boolean boolean10 = endTag9.selfClosing;
        org.jsoup.parser.Token.Tag tag12 = endTag9.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.StartTag;
        tag12.type = tokenType13;
        startTag0.type = tokenType13;
        org.jsoup.nodes.Attributes attributes16 = startTag0.getAttributes();
        boolean boolean17 = startTag0.isSelfClosing();
        boolean boolean18 = startTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType14 = startTag1.type;
        startTag1.appendTagName('4');
        startTag1.appendAttributeName("4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment19 = startTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<<!----><hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = startTag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        boolean boolean12 = doctype0.isForceQuirks();
        java.lang.String str13 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag14 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isStartTag();
        boolean boolean5 = startTag2.isCharacter();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("");
        org.jsoup.parser.Token.Tag tag9 = startTag2.name("<!----> ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        boolean boolean10 = comment9.isStartTag();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Doctype;
        comment11.type = tokenType12;
        comment9.type = tokenType12;
        boolean boolean15 = comment9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType16 = comment9.type;
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "</<!---->>", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder18.initialiseParse("StartTag", "<hi!>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "</<!---->StartTag>", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        boolean boolean32 = comment31.isStartTag();
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        comment31.type = tokenType34;
        boolean boolean37 = comment31.isStartTag();
        java.lang.String str38 = comment31.toString();
        xmlTreeBuilder18.insert(comment31);
        xmlTreeBuilder0.insert(comment31);
        java.lang.String str41 = comment31.getData();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        startTag3.newAttribute();
        startTag3.tagName = "";
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        startTag8.appendAttributeName('#');
        boolean boolean11 = startTag8.isSelfClosing();
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.appendAttributeName('4');
        endTag1.appendAttributeValue('#');
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str18 = character17.getData();
        java.lang.String str19 = character17.toString();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder21.initialiseParse("</<!---->>", "</<!---->>", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder21.initialiseParse("StartTag", "<!---->", parseErrorList28);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.String str31 = comment30.getData();
        xmlTreeBuilder21.insert(comment30);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        java.lang.String str34 = comment33.toString();
        boolean boolean35 = comment33.isEndTag();
        xmlTreeBuilder21.insert(comment33);
        org.jsoup.parser.Token.Character character38 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str39 = character38.getData();
        xmlTreeBuilder21.insert(character38);
        xmlTreeBuilder0.insert(character38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("");
        java.lang.String str44 = character43.toString();
        java.lang.String str45 = character43.getData();
        xmlTreeBuilder0.insert(character43);
        java.lang.String str47 = character43.toString();
        java.lang.String str48 = character43.getData();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<<!---->>" + "'", str39, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        boolean boolean7 = startTag0.selfClosing;
        java.lang.String str8 = startTag0.tagName;
        startTag0.appendAttributeName("<<!---->StartTag>");
        java.lang.String str11 = startTag0.name();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        org.jsoup.nodes.Attributes attributes2 = endTag1.attributes;
        java.lang.String str3 = endTag1.tagName;
        boolean boolean4 = endTag1.isDoctype();
        org.junit.Assert.assertNull(attributes2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        java.lang.String str7 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<<!----><hi!>>");
        boolean boolean11 = tag10.selfClosing;
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag24.appendAttributeValue('#');
        endTag24.finaliseTag();
        endTag24.appendTagName("StartTag");
        endTag24.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType31 = endTag24.type;
        java.lang.String str32 = endTag24.toString();
        boolean boolean33 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</<!---->>", "</<!---->>", parseErrorList37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        xmlTreeBuilder34.initialiseParse("StartTag", "<!---->", parseErrorList41);
        org.jsoup.parser.Token.Comment comment43 = new org.jsoup.parser.Token.Comment();
        boolean boolean44 = comment43.isStartTag();
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType46 = org.jsoup.parser.Token.TokenType.Doctype;
        comment45.type = tokenType46;
        comment43.type = tokenType46;
        boolean boolean49 = comment43.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType50 = comment43.type;
        xmlTreeBuilder34.insert(comment43);
        java.lang.StringBuilder stringBuilder52 = comment43.data;
        xmlTreeBuilder0.insert(comment43);
        org.jsoup.parser.Token.Character character55 = new org.jsoup.parser.Token.Character("");
        java.lang.String str56 = character55.toString();
        java.lang.String str57 = character55.getData();
        java.lang.String str58 = character55.toString();
        boolean boolean59 = character55.isCharacter();
        java.lang.String str60 = character55.getData();
        xmlTreeBuilder0.insert(character55);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder0.initialiseParse("Doctype", "</<!----><StartTag>>", parseErrorList64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->StartTag>" + "'", str32, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendAttributeValue('4');
        boolean boolean12 = startTag9.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType13 = startTag9.type;
        startTag2.type = tokenType13;
        boolean boolean15 = startTag2.selfClosing;
        boolean boolean16 = startTag2.isComment();
        org.jsoup.parser.Token.StartTag startTag17 = startTag2.asStartTag();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag17);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.tagName = "</</<!---->>>";
        org.jsoup.nodes.Attributes attributes7 = endTag1.getAttributes();
        boolean boolean8 = endTag1.selfClosing;
        boolean boolean9 = endTag1.isStartTag();
        org.jsoup.parser.Token.Tag tag11 = endTag1.name("hi!EndTag");
        boolean boolean12 = endTag1.isCharacter();
        endTag1.appendAttributeName("</<4>>");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isEndTag();
        startTag0.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        startTag6.newAttribute();
        startTag6.tagName = "";
        org.jsoup.nodes.Attributes attributes10 = startTag6.attributes;
        startTag3.attributes = attributes10;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("StartTag", attributes10);
        java.lang.String str13 = startTag12.tagName;
        org.jsoup.nodes.Attributes attributes14 = startTag12.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("StartTag<hi!<!---->> ", attributes14);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StartTag" + "'", str13, "StartTag");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.selfClosing;
        org.jsoup.nodes.Attributes attributes4 = startTag1.attributes;
        boolean boolean5 = startTag1.isDoctype();
        startTag1.appendAttributeName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        boolean boolean4 = startTag1.isEOF();
        java.lang.String str5 = startTag1.name();
        startTag1.appendAttributeValue('4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        boolean boolean10 = endTag9.selfClosing;
        org.jsoup.parser.Token.Tag tag12 = endTag9.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.StartTag;
        tag12.type = tokenType13;
        startTag0.type = tokenType13;
        org.jsoup.nodes.Attributes attributes16 = startTag0.getAttributes();
        startTag0.appendAttributeValue("<</<hi!>>>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.getData();
        java.lang.String str9 = character6.toString();
        boolean boolean10 = character6.isCharacter();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        boolean boolean13 = comment12.isStartTag();
        java.lang.String str14 = comment12.toString();
        java.lang.String str15 = comment12.getData();
        java.lang.StringBuilder stringBuilder16 = comment12.data;
        java.lang.String str17 = comment12.getData();
        java.lang.String str18 = comment12.toString();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isDoctype();
        boolean boolean24 = startTag20.isEOF();
        startTag20.newAttribute();
        boolean boolean26 = startTag20.isSelfClosing();
        boolean boolean27 = startTag20.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = xmlTreeBuilder0.insert(startTag20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<<!---->>");
        java.lang.Class<?> wildcardClass10 = tag7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag24.appendAttributeValue('#');
        endTag24.finaliseTag();
        endTag24.appendTagName("StartTag");
        endTag24.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType31 = endTag24.type;
        java.lang.String str32 = endTag24.toString();
        boolean boolean33 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag24);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("</</<!---->>>");
        org.jsoup.nodes.Element element36 = xmlTreeBuilder0.insert(startTag35);
        startTag35.newAttribute();
        java.lang.String str38 = startTag35.name();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->StartTag>" + "'", str32, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "</</<!---->>>" + "'", str38, "</</<!---->>>");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        java.lang.String str11 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        boolean boolean12 = endTag1.isComment();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.nodes.Attributes attributes3 = startTag2.attributes;
        boolean boolean4 = startTag2.isComment();
        boolean boolean5 = startTag2.isEndTag();
        startTag2.appendAttributeName(' ');
        boolean boolean8 = startTag2.selfClosing;
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        startTag2.type = tokenType10;
        boolean boolean12 = startTag2.isSelfClosing();
        startTag2.appendAttributeValue('#');
        java.lang.String str15 = startTag2.tagName;
        boolean boolean16 = startTag2.isStartTag();
        startTag2.appendAttributeValue("</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        startTag3.newAttribute();
        startTag3.tagName = "";
        boolean boolean7 = startTag3.isComment();
        startTag3.selfClosing = true;
        org.jsoup.nodes.Attributes attributes10 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes10);
        startTag11.appendAttributeValue('a');
        startTag11.appendAttributeName("<</<<<!---->>>>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        java.lang.Class<?> wildcardClass11 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        boolean boolean22 = comment16.isStartTag();
        java.lang.StringBuilder stringBuilder23 = comment16.data;
        boolean boolean24 = comment16.isStartTag();
        java.lang.String str25 = comment16.toString();
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.Doctype doctype27 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str28 = doctype27.getPublicIdentifier();
        java.lang.String str29 = doctype27.getName();
        java.lang.String str30 = doctype27.getSystemIdentifier();
        boolean boolean31 = doctype27.isForceQuirks();
        doctype27.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        boolean boolean10 = startTag0.isComment();
        boolean boolean11 = startTag0.isDoctype();
        boolean boolean12 = startTag0.isStartTag();
        java.lang.Class<?> wildcardClass13 = startTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.getData();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!----> ");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        boolean boolean10 = comment5.isComment();
        java.lang.StringBuilder stringBuilder11 = comment5.data;
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = startTag2.type;
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes7);
        boolean boolean10 = startTag9.isStartTag();
        startTag9.appendAttributeName('a');
        java.lang.String str13 = startTag9.name();
        org.jsoup.nodes.Attributes attributes14 = startTag9.attributes;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<<<!---->>>" + "'", str13, "<<<!---->>>");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.appendAttributeValue("EndTag");
        boolean boolean6 = startTag1.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag7 = startTag1.asStartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        boolean boolean11 = startTag10.isComment();
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.Doctype;
        comment12.type = tokenType13;
        startTag10.type = tokenType13;
        java.lang.String str16 = startTag10.tagName;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("hi!", attributes20);
        startTag21.newAttribute();
        startTag21.tagName = "";
        org.jsoup.nodes.Attributes attributes25 = startTag21.attributes;
        startTag18.attributes = attributes25;
        startTag10.attributes = attributes25;
        startTag7.attributes = attributes25;
        startTag7.finaliseTag();
        java.lang.Class<?> wildcardClass30 = startTag7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        boolean boolean18 = comment17.isStartTag();
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        comment17.type = tokenType20;
        boolean boolean23 = comment17.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType24 = comment17.type;
        java.lang.String str25 = comment17.getData();
        java.lang.StringBuilder stringBuilder26 = comment17.data;
        boolean boolean27 = comment17.isEndTag();
        xmlTreeBuilder0.insert(comment17);
        java.lang.Class<?> wildcardClass29 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        java.lang.String str5 = startTag2.toString();
        java.lang.String str6 = startTag2.name();
        java.lang.String str7 = startTag2.name();
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        endTag1.finaliseTag();
        java.lang.String str13 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag15 = endTag1.name("<hi!>");
        tag15.appendAttributeName("<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</<!---->StartTag>" + "'", str13, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.String str5 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<hi!>>");
        org.jsoup.nodes.Attributes attributes2 = endTag1.attributes;
        endTag1.selfClosing = false;
        endTag1.finaliseTag();
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        java.lang.String str6 = endTag1.tagName;
        boolean boolean7 = endTag1.isCharacter();
        boolean boolean8 = endTag1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("", "<<!---->>", parseErrorList16);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        boolean boolean19 = comment18.isStartTag();
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType21 = org.jsoup.parser.Token.TokenType.Doctype;
        comment20.type = tokenType21;
        comment18.type = tokenType21;
        boolean boolean24 = comment18.isStartTag();
        java.lang.String str25 = comment18.getData();
        xmlTreeBuilder13.insert(comment18);
        boolean boolean27 = comment18.isDoctype();
        java.lang.StringBuilder stringBuilder28 = comment18.data;
        java.lang.String str29 = comment18.tokenType();
        java.lang.String str30 = comment18.getData();
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        java.lang.String str33 = comment32.toString();
        org.jsoup.parser.Token.TokenType tokenType34 = comment32.type;
        boolean boolean35 = comment32.isComment();
        java.lang.StringBuilder stringBuilder36 = comment32.data;
        xmlTreeBuilder0.insert(comment32);
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("hi!", attributes39);
        boolean boolean41 = startTag40.isComment();
        org.jsoup.parser.Token.Comment comment42 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType43 = org.jsoup.parser.Token.TokenType.Doctype;
        comment42.type = tokenType43;
        startTag40.type = tokenType43;
        startTag40.appendAttributeName("hi!");
        boolean boolean48 = startTag40.isCharacter();
        startTag40.finaliseTag();
        java.lang.String str50 = startTag40.tokenType();
        java.lang.String str51 = startTag40.tagName;
        boolean boolean52 = startTag40.selfClosing;
        boolean boolean53 = startTag40.isDoctype();
        org.jsoup.parser.Token.Tag tag55 = startTag40.name("<<!---->>");
        org.jsoup.nodes.Element element56 = xmlTreeBuilder0.insert(startTag40);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag("hi!", attributes60);
        startTag61.newAttribute();
        startTag61.tagName = "";
        org.jsoup.nodes.Attributes attributes65 = startTag61.attributes;
        startTag58.attributes = attributes65;
        boolean boolean67 = startTag58.isDoctype();
        org.jsoup.parser.Token.StartTag startTag68 = startTag58.asStartTag();
        boolean boolean69 = startTag68.isEOF();
        java.lang.String str70 = startTag68.tagName;
        boolean boolean71 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag68);
        boolean boolean72 = startTag68.isSelfClosing();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Comment" + "'", str29, "Comment");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "StartTag" + "'", str50, "StartTag");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<!---->" + "'", str70, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        boolean boolean10 = startTag2.isCharacter();
        startTag2.finaliseTag();
        java.lang.String str12 = startTag2.tokenType();
        java.lang.String str13 = startTag2.tagName;
        boolean boolean14 = startTag2.selfClosing;
        boolean boolean15 = startTag2.isDoctype();
        startTag2.appendTagName('#');
        boolean boolean18 = startTag2.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.newAttribute();
        startTag0.appendAttributeName("<<<hi!>>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        boolean boolean8 = startTag7.isComment();
        startTag7.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeValue('4');
        boolean boolean14 = startTag11.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType15 = startTag11.type;
        startTag7.type = tokenType15;
        boolean boolean17 = startTag7.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType18 = startTag7.type;
        startTag0.type = tokenType18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str25 = startTag24.toString();
        java.lang.String str26 = startTag24.name();
        org.jsoup.parser.Token.Tag tag28 = startTag24.name("<hi!>");
        boolean boolean29 = startTag24.isComment();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        startTag32.finaliseTag();
        boolean boolean35 = startTag32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag32.type;
        startTag24.type = tokenType36;
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("", "<<!---->>", parseErrorList42);
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str46 = endTag45.toString();
        java.lang.String str47 = endTag45.toString();
        boolean boolean48 = xmlTreeBuilder39.process((org.jsoup.parser.Token) endTag45);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        xmlTreeBuilder39.initialiseParse("hi!<!---->", "", parseErrorList51);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EndTag");
        xmlTreeBuilder39.insert(character54);
        xmlTreeBuilder0.insert(character54);
        java.lang.String str57 = character54.toString();
        java.lang.String str58 = character54.getData();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<<!---->>" + "'", str25, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</<!---->>" + "'", str46, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "</<!---->>" + "'", str47, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "EndTag" + "'", str57, "EndTag");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EndTag" + "'", str58, "EndTag");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        startTag2.appendAttributeName("");
        startTag2.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("<!---->");
        startTag2.appendTagName(' ');
        java.lang.String str14 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType15 = startTag2.type;
        startTag2.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!----> " + "'", str14, "<!----> ");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        boolean boolean11 = tag10.isEOF();
        boolean boolean12 = tag10.isEOF();
        tag10.appendAttributeValue('#');
        java.lang.Class<?> wildcardClass15 = tag10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        boolean boolean11 = character10.isComment();
        boolean boolean12 = character10.isComment();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        boolean boolean16 = startTag15.isComment();
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        startTag15.type = tokenType18;
        startTag15.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        boolean boolean24 = endTag23.selfClosing;
        org.jsoup.parser.Token.Tag tag26 = endTag23.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType27 = org.jsoup.parser.Token.TokenType.StartTag;
        tag26.type = tokenType27;
        startTag15.type = tokenType27;
        character10.type = tokenType27;
        java.lang.String str31 = character10.toString();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("hi!", attributes34);
        startTag35.newAttribute();
        startTag35.tagName = "";
        boolean boolean39 = startTag35.isComment();
        startTag35.appendTagName('a');
        org.jsoup.nodes.Attributes attributes42 = startTag35.attributes;
        org.jsoup.nodes.Attributes attributes43 = startTag35.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = startTag35.asStartTag();
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag35);
        java.lang.Class<?> wildcardClass46 = element45.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!<!---->");
        endTag1.selfClosing = true;
        endTag1.newAttribute();
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.newAttribute();
        startTag10.tagName = "";
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        startTag7.attributes = attributes14;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("StartTag", attributes14);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("hi!", attributes20);
        startTag21.newAttribute();
        startTag21.tagName = "";
        org.jsoup.nodes.Attributes attributes25 = startTag21.attributes;
        startTag18.attributes = attributes25;
        startTag16.attributes = attributes25;
        java.lang.String str28 = startTag16.tagName;
        boolean boolean29 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag16);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder0.initialiseParse("</<<!---->>>", "<!----><<!---->>", parseErrorList32);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "StartTag" + "'", str28, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<!----><hi!>>");
        java.lang.String str2 = endTag1.tagName;
        java.lang.String str3 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!----><hi!>>" + "'", str2, "<<!----><hi!>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<<!----><hi!>>>" + "'", str3, "</<<!----><hi!>>>");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        startTag0.appendAttributeValue("");
        startTag0.appendAttributeValue('a');
        startTag0.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag14 = startTag0.name("</<hi!>a>");
        boolean boolean15 = tag14.selfClosing;
        boolean boolean16 = tag14.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        boolean boolean6 = endTag5.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = endTag5.name("<!---->");
        boolean boolean9 = tag8.isCharacter();
        tag8.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes12 = tag8.attributes;
        org.jsoup.parser.Token.TokenType tokenType13 = tag8.type;
        doctype0.type = tokenType13;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder17 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.getData();
        boolean boolean7 = comment0.isDoctype();
        boolean boolean8 = comment0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        boolean boolean5 = doctype4.isForceQuirks();
        boolean boolean6 = doctype4.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype4.name;
        doctype4.forceQuirks = true;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.appendAttributeValue(' ');
        java.lang.String str16 = startTag13.tokenType();
        java.lang.String str17 = startTag13.name();
        startTag13.appendTagName("<!---->");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        startTag13.type = tokenType24;
        doctype4.type = tokenType24;
        org.jsoup.parser.Token.TokenType tokenType27 = doctype4.type;
        endTag1.type = tokenType27;
        boolean boolean29 = endTag1.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype30 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<!----><<!---->>");
        java.lang.String str14 = startTag0.tokenType();
        java.lang.String str15 = startTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!>" + "'", str15, "<hi!>");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        java.lang.String str3 = startTag1.name();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<hi!>");
        boolean boolean6 = startTag1.isComment();
        org.jsoup.nodes.Attributes attributes7 = startTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str4 = startTag3.toString();
        java.lang.String str5 = startTag3.name();
        org.jsoup.parser.Token.Tag tag7 = startTag3.name("<hi!>");
        org.jsoup.nodes.Attributes attributes8 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("</<hi!>>", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes8);
        org.jsoup.nodes.Attributes attributes11 = startTag10.getAttributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("EndTag");
        endTag1.selfClosing = true;
        boolean boolean4 = endTag1.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<!---->>", parseErrorList16);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.String str19 = comment18.toString();
        boolean boolean20 = comment18.isEOF();
        java.lang.StringBuilder stringBuilder21 = comment18.data;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("");
        boolean boolean25 = character24.isComment();
        boolean boolean26 = character24.isComment();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("hi!", attributes28);
        boolean boolean30 = startTag29.isComment();
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType32 = org.jsoup.parser.Token.TokenType.Doctype;
        comment31.type = tokenType32;
        startTag29.type = tokenType32;
        startTag29.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        boolean boolean38 = endTag37.selfClosing;
        org.jsoup.parser.Token.Tag tag40 = endTag37.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType41 = org.jsoup.parser.Token.TokenType.StartTag;
        tag40.type = tokenType41;
        startTag29.type = tokenType41;
        character24.type = tokenType41;
        xmlTreeBuilder0.insert(character24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder46.initialiseParse("", "<<!---->>", parseErrorList49);
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str53 = endTag52.toString();
        java.lang.String str54 = endTag52.toString();
        boolean boolean55 = xmlTreeBuilder46.process((org.jsoup.parser.Token) endTag52);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        xmlTreeBuilder46.initialiseParse("hi!<!---->", "", parseErrorList58);
        org.jsoup.parser.Token.Character character61 = new org.jsoup.parser.Token.Character("");
        java.lang.String str62 = character61.toString();
        java.lang.String str63 = character61.toString();
        java.lang.String str64 = character61.getData();
        boolean boolean65 = character61.isComment();
        java.lang.String str66 = character61.toString();
        xmlTreeBuilder46.insert(character61);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        xmlTreeBuilder68.initialiseParse("</<!---->>", "</<!---->>", parseErrorList71);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        xmlTreeBuilder68.initialiseParse("StartTag", "<!---->", parseErrorList75);
        org.jsoup.parser.Token.Comment comment77 = new org.jsoup.parser.Token.Comment();
        java.lang.String str78 = comment77.getData();
        xmlTreeBuilder68.insert(comment77);
        java.lang.String str80 = comment77.toString();
        xmlTreeBuilder46.insert(comment77);
        org.jsoup.parser.Token.Comment comment82 = new org.jsoup.parser.Token.Comment();
        java.lang.String str83 = comment82.toString();
        org.jsoup.parser.Token.TokenType tokenType84 = comment82.type;
        boolean boolean85 = comment82.isComment();
        java.lang.String str86 = comment82.getData();
        java.lang.String str87 = comment82.toString();
        java.lang.String str88 = comment82.toString();
        xmlTreeBuilder46.insert(comment82);
        java.lang.StringBuilder stringBuilder90 = comment82.data;
        xmlTreeBuilder0.insert(comment82);
        java.lang.String str92 = comment82.getData();
        java.lang.String str93 = comment82.getData();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "</<!---->>" + "'", str53, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "</<!---->>" + "'", str54, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "<!---->" + "'", str80, "<!---->");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!---->" + "'", str83, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType84 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType84.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "<!---->" + "'", str87, "<!---->");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "<!---->" + "'", str88, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder90);
        org.junit.Assert.assertEquals(stringBuilder90.toString(), "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes3 = startTag0.attributes;
        boolean boolean4 = startTag0.selfClosing;
        boolean boolean5 = startTag0.isComment();
        startTag0.selfClosing = false;
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isEndTag();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.isEndTag();
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        startTag1.newAttribute();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes9 = startTag6.attributes;
        startTag1.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes9);
        boolean boolean12 = startTag11.isEOF();
        startTag11.appendAttributeValue("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes15 = startTag11.attributes;
        boolean boolean16 = startTag11.isDoctype();
        org.jsoup.nodes.Attributes attributes17 = startTag11.attributes;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        org.jsoup.parser.Token.TokenType tokenType12 = comment10.type;
        java.lang.String str13 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder15.initialiseParse("</<!---->>", "StartTag", parseErrorList18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder15.initialiseParse("<!---->", "<<!---->>", parseErrorList22);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("");
        java.lang.String str26 = character25.toString();
        java.lang.String str27 = character25.getData();
        java.lang.String str28 = character25.toString();
        java.lang.String str29 = character25.toString();
        boolean boolean30 = xmlTreeBuilder15.process((org.jsoup.parser.Token) character25);
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendAttributeValue('4');
        boolean boolean35 = startTag32.isDoctype();
        boolean boolean36 = startTag32.isDoctype();
        java.lang.String str37 = startTag32.tokenType();
        startTag32.appendTagName('a');
        org.jsoup.parser.Token.Tag tag41 = startTag32.name("hi!");
        boolean boolean42 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag32);
        org.jsoup.parser.Token.Doctype doctype43 = new org.jsoup.parser.Token.Doctype();
        boolean boolean44 = doctype43.isForceQuirks();
        java.lang.String str45 = doctype43.getName();
        boolean boolean46 = doctype43.isForceQuirks();
        java.lang.String str47 = doctype43.getPublicIdentifier();
        doctype43.forceQuirks = false;
        java.lang.StringBuilder stringBuilder50 = doctype43.name;
        java.lang.String str51 = doctype43.getPublicIdentifier();
        java.lang.String str52 = doctype43.getName();
        java.lang.StringBuilder stringBuilder53 = doctype43.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "StartTag" + "'", str37, "StartTag");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        boolean boolean10 = startTag9.isComment();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Doctype;
        comment11.type = tokenType12;
        startTag9.type = tokenType12;
        java.lang.String str15 = startTag9.tagName;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        startTag20.newAttribute();
        startTag20.tagName = "";
        org.jsoup.nodes.Attributes attributes24 = startTag20.attributes;
        startTag17.attributes = attributes24;
        startTag9.attributes = attributes24;
        org.jsoup.nodes.Attributes attributes27 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes27);
        startTag2.attributes = attributes27;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</</<!---->>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEOF();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        startTag0.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        startTag6.finaliseTag();
        startTag6.selfClosing = false;
        java.lang.String str10 = startTag6.toString();
        startTag6.finaliseTag();
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        endTag1.finaliseTag();
        java.lang.String str13 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag15 = endTag1.name("<hi!>");
        tag15.newAttribute();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</<!---->StartTag>" + "'", str13, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        java.lang.String str4 = startTag2.name();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->", attributes7);
        startTag8.tagName = "<<!---->>4";
        boolean boolean11 = startTag8.selfClosing;
        startTag8.appendTagName("</<<<!---->>>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendTagName("Comment");
        boolean boolean9 = startTag2.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</hi!>");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("<!---->");
        startTag0.appendTagName('#');
        java.lang.String str5 = startTag0.tagName;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->#" + "'", str5, "<!---->#");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        startTag3.appendAttributeValue(' ');
        startTag3.newAttribute();
        startTag3.finaliseTag();
        java.lang.String str8 = startTag3.tagName;
        org.jsoup.nodes.Attributes attributes9 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes9);
        startTag10.appendTagName(' ');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!----><<!---->>>");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        boolean boolean22 = comment16.isStartTag();
        java.lang.StringBuilder stringBuilder23 = comment16.data;
        boolean boolean24 = comment16.isStartTag();
        java.lang.String str25 = comment16.toString();
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isEndTag();
        boolean boolean31 = startTag27.isEOF();
        startTag27.appendAttributeValue("hi!");
        startTag27.appendTagName('4');
        boolean boolean36 = startTag27.isSelfClosing();
        boolean boolean37 = startTag27.isComment();
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("</<!---->>", "</<!---->>", parseErrorList42);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder39.initialiseParse("StartTag", "<!---->", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.getData();
        xmlTreeBuilder39.insert(comment48);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.String str52 = comment51.toString();
        boolean boolean53 = comment51.isEndTag();
        xmlTreeBuilder39.insert(comment51);
        org.jsoup.parser.Token.Character character56 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str57 = character56.getData();
        java.lang.String str58 = character56.toString();
        xmlTreeBuilder39.insert(character56);
        xmlTreeBuilder0.insert(character56);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendAttributeValue('4');
        boolean boolean65 = startTag62.isEndTag();
        startTag62.newAttribute();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        startTag67.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes70 = startTag67.attributes;
        startTag62.attributes = attributes70;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes70);
        boolean boolean73 = startTag72.isEOF();
        startTag72.appendAttributeValue("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes76 = startTag72.attributes;
        boolean boolean77 = startTag72.isSelfClosing();
        boolean boolean78 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag72);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder79 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList82 = null;
        xmlTreeBuilder79.initialiseParse("</<!---->>", "StartTag", parseErrorList82);
        org.jsoup.parser.Token.Character character85 = new org.jsoup.parser.Token.Character("");
        java.lang.String str86 = character85.toString();
        java.lang.String str87 = character85.getData();
        java.lang.String str88 = character85.toString();
        boolean boolean89 = character85.isCharacter();
        xmlTreeBuilder79.insert(character85);
        xmlTreeBuilder0.insert(character85);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        startTag0.appendTagName('a');
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!");
        boolean boolean10 = startTag0.isSelfClosing();
        startTag0.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder16.initialiseParse("", "<<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder16.initialiseParse("<!---->", "hi!", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str31 = startTag30.tokenType();
        boolean boolean32 = startTag30.selfClosing;
        org.jsoup.nodes.Element element33 = xmlTreeBuilder16.insert(startTag30);
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag30);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        boolean boolean36 = comment35.isStartTag();
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.Doctype;
        comment37.type = tokenType38;
        comment35.type = tokenType38;
        boolean boolean41 = comment35.isStartTag();
        java.lang.String str42 = comment35.toString();
        xmlTreeBuilder0.insert(comment35);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "</<!---->>", parseErrorList46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        xmlTreeBuilder0.initialiseParse("<hi!4>", "<<<!---->>>", parseErrorList50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EndTag", parseErrorList54);
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag("hi!", attributes57);
        boolean boolean59 = startTag58.isComment();
        startTag58.appendAttributeName('4');
        boolean boolean62 = startTag58.isDoctype();
        org.jsoup.parser.Token.Tag tag64 = startTag58.name("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(tag64);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        startTag0.appendAttributeValue("");
        startTag0.tagName = "<!----><<!---->>";
        startTag0.appendTagName('a');
        java.lang.Class<?> wildcardClass13 = startTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<<!---->>>");
        org.jsoup.parser.Token.Tag tag3 = endTag1.name("");
        boolean boolean4 = tag3.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = tag3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag9.appendTagName("<<!---->>");
        java.lang.String str12 = startTag9.name();
        boolean boolean13 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("", "<<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        boolean boolean20 = comment19.isStartTag();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Doctype;
        comment21.type = tokenType22;
        comment19.type = tokenType22;
        boolean boolean25 = comment19.isStartTag();
        java.lang.String str26 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        xmlTreeBuilder0.insert(comment19);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</<!---->>", "</<!---->>", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("", "<<!---->>", parseErrorList36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        xmlTreeBuilder29.initialiseParse("<!---->", "hi!", parseErrorList40);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        xmlTreeBuilder42.initialiseParse("</<!---->>", "StartTag", parseErrorList45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder42.initialiseParse("<!---->", "<<!---->>", parseErrorList49);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        boolean boolean52 = comment51.isStartTag();
        org.jsoup.parser.Token.Comment comment53 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType54 = org.jsoup.parser.Token.TokenType.Doctype;
        comment53.type = tokenType54;
        comment51.type = tokenType54;
        boolean boolean57 = comment51.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType58 = comment51.type;
        xmlTreeBuilder42.insert(comment51);
        xmlTreeBuilder29.insert(comment51);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder61.initialiseParse("</<!---->>", "</<!---->>", parseErrorList64);
        org.jsoup.parser.Token.Comment comment66 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType67 = org.jsoup.parser.Token.TokenType.Doctype;
        comment66.type = tokenType67;
        java.lang.StringBuilder stringBuilder69 = comment66.data;
        xmlTreeBuilder61.insert(comment66);
        org.jsoup.parser.Token.Comment comment71 = new org.jsoup.parser.Token.Comment();
        java.lang.String str72 = comment71.toString();
        xmlTreeBuilder61.insert(comment71);
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        xmlTreeBuilder61.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList76);
        org.jsoup.parser.Token.Character character79 = new org.jsoup.parser.Token.Character("");
        java.lang.String str80 = character79.toString();
        java.lang.String str81 = character79.toString();
        boolean boolean82 = character79.isDoctype();
        xmlTreeBuilder61.insert(character79);
        xmlTreeBuilder29.insert(character79);
        org.jsoup.parser.Token.Comment comment85 = new org.jsoup.parser.Token.Comment();
        boolean boolean86 = comment85.isStartTag();
        java.lang.String str87 = comment85.toString();
        java.lang.String str88 = comment85.getData();
        java.lang.StringBuilder stringBuilder89 = comment85.data;
        boolean boolean90 = comment85.isEndTag();
        java.lang.String str91 = comment85.toString();
        java.lang.StringBuilder stringBuilder92 = comment85.data;
        xmlTreeBuilder29.insert(comment85);
        xmlTreeBuilder0.insert(comment85);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + tokenType58 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType58.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType67 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType67.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder69);
        org.junit.Assert.assertEquals(stringBuilder69.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<!---->" + "'", str72, "<!---->");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "<!---->" + "'", str87, "<!---->");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "<!---->" + "'", str91, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        boolean boolean4 = doctype0.isDoctype();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("<<!---->>");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        boolean boolean9 = tag7.isEOF();
        tag7.newAttribute();
        tag7.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("<<!---->>");
        startTag2.appendTagName("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.appendAttributeName('4');
        java.lang.String str11 = startTag8.name();
        org.jsoup.parser.Token.Tag tag13 = startTag8.name("<hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = startTag8.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.getData();
        java.lang.String str9 = character6.toString();
        boolean boolean10 = character6.isCharacter();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "Comment", parseErrorList14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder16.initialiseParse("StartTag", "<!---->", parseErrorList23);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.String str26 = comment25.getData();
        xmlTreeBuilder16.insert(comment25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        xmlTreeBuilder28.initialiseParse("</<!---->>", "</<!---->>", parseErrorList31);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        java.lang.StringBuilder stringBuilder36 = comment33.data;
        xmlTreeBuilder28.insert(comment33);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        java.lang.String str39 = comment38.toString();
        xmlTreeBuilder28.insert(comment38);
        xmlTreeBuilder16.insert(comment38);
        xmlTreeBuilder0.insert(comment38);
        boolean boolean43 = comment38.isDoctype();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!---->" + "'", str39, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<<!---->>");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeValue('4');
        boolean boolean14 = startTag11.isEndTag();
        boolean boolean15 = startTag11.isEOF();
        startTag11.appendAttributeValue("hi!");
        startTag11.appendAttributeName('#');
        boolean boolean20 = startTag11.isSelfClosing();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("hi!", attributes22);
        startTag23.newAttribute();
        startTag23.tagName = "";
        org.jsoup.nodes.Attributes attributes27 = startTag23.attributes;
        startTag11.attributes = attributes27;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes27);
        tag9.attributes = attributes27;
        java.lang.String str31 = tag9.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<<!---->>" + "'", str31, "<<!---->>");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.getData();
        java.lang.String str18 = character15.toString();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character15);
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str22 = character21.getData();
        java.lang.String str23 = character21.toString();
        java.lang.String str24 = character21.getData();
        xmlTreeBuilder0.insert(character21);
        boolean boolean26 = character21.isComment();
        java.lang.String str27 = character21.getData();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<<!---->>" + "'", str22, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<<!---->>" + "'", str23, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<<!---->>" + "'", str24, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<<!---->>" + "'", str27, "<<!---->>");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.getData();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = character1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.jsoup.parser.Token.EndTag endTag3 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag3.appendAttributeValue('#');
        endTag3.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        boolean boolean8 = endTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag10 = endTag7.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.StartTag;
        tag10.type = tokenType11;
        endTag3.type = tokenType11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue('4');
        boolean boolean17 = startTag14.isEndTag();
        boolean boolean18 = startTag14.isEOF();
        startTag14.appendAttributeValue("hi!");
        startTag14.appendAttributeName('#');
        boolean boolean23 = startTag14.isSelfClosing();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        startTag26.newAttribute();
        startTag26.tagName = "";
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        startTag14.attributes = attributes30;
        endTag3.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes30);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("</</hi!<!---->>>", attributes30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype35 = startTag34.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str7 = character6.getData();
        java.lang.String str8 = character6.toString();
        java.lang.String str9 = character6.getData();
        java.lang.String str10 = character6.toString();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</<!---->>", "StartTag", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("");
        java.lang.String str19 = character18.toString();
        java.lang.String str20 = character18.toString();
        boolean boolean21 = character18.isDoctype();
        xmlTreeBuilder12.insert(character18);
        java.lang.String str23 = character18.getData();
        java.lang.String str24 = character18.toString();
        java.lang.String str25 = character18.getData();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character18);
        org.jsoup.parser.Token.Character character27 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<!---->>" + "'", str7, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<<!---->>" + "'", str8, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<!---->>" + "'", str9, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str18 = character17.getData();
        java.lang.String str19 = character17.toString();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder21.initialiseParse("</<!---->>", "</<!---->>", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder21.initialiseParse("StartTag", "<!---->", parseErrorList28);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.String str31 = comment30.getData();
        xmlTreeBuilder21.insert(comment30);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        java.lang.String str34 = comment33.toString();
        boolean boolean35 = comment33.isEndTag();
        xmlTreeBuilder21.insert(comment33);
        org.jsoup.parser.Token.Character character38 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str39 = character38.getData();
        xmlTreeBuilder21.insert(character38);
        xmlTreeBuilder0.insert(character38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("");
        java.lang.String str44 = character43.toString();
        java.lang.String str45 = character43.getData();
        xmlTreeBuilder0.insert(character43);
        java.lang.String str47 = character43.getData();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<<!---->>" + "'", str39, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue("<hi!>");
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.finaliseTag();
        startTag8.appendTagName("hi!EndTag");
        java.lang.String str12 = startTag8.tokenType();
        startTag8.appendTagName("</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        boolean boolean8 = startTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("hi!</<hi!>>");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("<!---->");
        boolean boolean4 = tag3.isCharacter();
        tag3.appendTagName("Comment");
        org.jsoup.parser.Token.Tag tag8 = tag3.name("<!---->4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.getData();
        boolean boolean7 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        java.lang.String str8 = comment5.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype0.type;
        boolean boolean9 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.getData();
        java.lang.String str18 = character15.toString();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character15);
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str21 = doctype20.getPublicIdentifier();
        boolean boolean22 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder23 = doctype20.publicIdentifier;
        java.lang.StringBuilder stringBuilder24 = doctype20.systemIdentifier;
        doctype20.forceQuirks = true;
        doctype20.forceQuirks = false;
        boolean boolean29 = doctype20.isForceQuirks();
        doctype20.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("</<!---->>", "</<!---->>", parseErrorList13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder10.initialiseParse("StartTag", "<hi!>", parseErrorList17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder10.initialiseParse("</<!---->>", "</<!---->StartTag>", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        boolean boolean24 = comment23.isStartTag();
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType26 = org.jsoup.parser.Token.TokenType.Doctype;
        comment25.type = tokenType26;
        comment23.type = tokenType26;
        boolean boolean29 = comment23.isStartTag();
        java.lang.String str30 = comment23.toString();
        xmlTreeBuilder10.insert(comment23);
        java.lang.StringBuilder stringBuilder32 = comment23.data;
        xmlTreeBuilder0.insert(comment23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</<!---->>", "StartTag", parseErrorList37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        xmlTreeBuilder34.initialiseParse("<hi!>", "<!---->", parseErrorList41);
        org.jsoup.parser.Token.Character character44 = new org.jsoup.parser.Token.Character("<!----><<!---->>");
        xmlTreeBuilder34.insert(character44);
        org.jsoup.parser.Token.Character character47 = new org.jsoup.parser.Token.Character("");
        java.lang.String str48 = character47.getData();
        xmlTreeBuilder34.insert(character47);
        java.lang.String str50 = character47.getData();
        xmlTreeBuilder0.insert(character47);
        java.lang.String str52 = character47.toString();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!---->" + "'", str30, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isCharacter();
        java.lang.String str7 = endTag0.tagName;
        boolean boolean8 = endTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str15 = startTag14.tokenType();
        boolean boolean16 = startTag14.selfClosing;
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag14);
        org.jsoup.nodes.Attributes attributes18 = startTag14.getAttributes();
        startTag14.appendAttributeName('#');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        tag11.appendTagName('4');
        boolean boolean14 = tag11.isDoctype();
        tag11.selfClosing = false;
        tag11.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isSelfClosing();
        startTag0.appendAttributeName(' ');
        boolean boolean6 = startTag0.isEndTag();
        boolean boolean7 = startTag0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        boolean boolean11 = comment10.isStartTag();
        java.lang.String str12 = comment10.toString();
        boolean boolean13 = comment10.isCharacter();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendAttributeValue('4');
        boolean boolean22 = startTag19.isEndTag();
        startTag19.newAttribute();
        boolean boolean24 = startTag19.isComment();
        org.jsoup.parser.Token.Tag tag26 = startTag19.name("</<!---->>");
        org.jsoup.nodes.Element element27 = xmlTreeBuilder0.insert(startTag19);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder0.initialiseParse("<!---->hi!", "<<<!---->>>", parseErrorList30);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendAttributeValue('4');
        boolean boolean35 = startTag32.isEndTag();
        boolean boolean36 = startTag32.isEOF();
        startTag32.appendAttributeValue("hi!");
        startTag32.appendTagName('4');
        boolean boolean41 = startTag32.isSelfClosing();
        org.jsoup.parser.Token.Tag tag43 = startTag32.name("hi!");
        boolean boolean44 = startTag32.isComment();
        org.jsoup.parser.Token.StartTag startTag45 = startTag32.asStartTag();
        org.jsoup.parser.Token.StartTag startTag46 = startTag45.asStartTag();
        org.jsoup.nodes.Attributes attributes47 = startTag45.getAttributes();
        boolean boolean48 = startTag45.isCharacter();
        boolean boolean49 = startTag45.isCharacter();
        org.jsoup.nodes.Element element50 = xmlTreeBuilder0.insert(startTag45);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element50);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getName();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getName();
        java.lang.Class<?> wildcardClass11 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        boolean boolean8 = doctype0.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("StartTag<hi!<!---->> ");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        java.lang.String str8 = startTag2.tokenType();
        org.jsoup.parser.Token.StartTag startTag9 = startTag2.asStartTag();
        boolean boolean10 = startTag2.isEndTag();
        startTag2.tagName = "<!----><<!---->>a";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendTagName('4');
        endTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag6 = endTag0.asEndTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        startTag11.newAttribute();
        startTag11.tagName = "";
        org.jsoup.nodes.Attributes attributes15 = startTag11.attributes;
        startTag8.attributes = attributes15;
        endTag6.attributes = attributes15;
        boolean boolean18 = endTag6.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType21 = startTag20.type;
        endTag6.type = tokenType21;
        org.jsoup.parser.Token.Tag tag24 = endTag6.name("<</<<<!---->>>>>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(endTag6);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        startTag1.appendAttributeValue('#');
        java.lang.String str5 = startTag1.name();
        boolean boolean6 = startTag1.isEndTag();
        startTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.String str37 = comment36.toString();
        org.jsoup.parser.Token.TokenType tokenType38 = comment36.type;
        boolean boolean39 = comment36.isComment();
        java.lang.String str40 = comment36.getData();
        java.lang.String str41 = comment36.toString();
        java.lang.String str42 = comment36.toString();
        xmlTreeBuilder0.insert(comment36);
        boolean boolean44 = comment36.isComment();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("<hi!>");
        startTag2.appendTagName(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        java.lang.StringBuilder stringBuilder10 = comment5.data;
        java.lang.StringBuilder stringBuilder11 = comment5.data;
        java.lang.StringBuilder stringBuilder12 = comment5.data;
        java.lang.String str13 = comment5.toString();
        java.lang.String str14 = comment5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.String str37 = comment36.toString();
        org.jsoup.parser.Token.TokenType tokenType38 = comment36.type;
        boolean boolean39 = comment36.isComment();
        java.lang.String str40 = comment36.getData();
        java.lang.String str41 = comment36.toString();
        java.lang.String str42 = comment36.toString();
        xmlTreeBuilder0.insert(comment36);
        java.lang.String str44 = comment36.getData();
        java.lang.String str45 = comment36.getData();
        java.lang.String str46 = comment36.tokenType();
        java.lang.String str47 = comment36.getData();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Comment" + "'", str46, "Comment");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</<!---->>", "</<!---->>", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        java.lang.StringBuilder stringBuilder20 = comment17.data;
        xmlTreeBuilder12.insert(comment17);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.String str23 = comment22.toString();
        xmlTreeBuilder12.insert(comment22);
        xmlTreeBuilder0.insert(comment22);
        boolean boolean26 = comment22.isDoctype();
        java.lang.String str27 = comment22.toString();
        java.lang.StringBuilder stringBuilder28 = comment22.data;
        boolean boolean29 = comment22.isStartTag();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType3;
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.isComment();
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        boolean boolean21 = startTag20.isComment();
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Doctype;
        comment22.type = tokenType23;
        startTag20.type = tokenType23;
        java.lang.String str26 = startTag20.tagName;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes30);
        startTag31.newAttribute();
        startTag31.tagName = "";
        org.jsoup.nodes.Attributes attributes35 = startTag31.attributes;
        startTag28.attributes = attributes35;
        startTag20.attributes = attributes35;
        org.jsoup.nodes.Attributes attributes38 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes38);
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag39);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder41.initialiseParse("</<!---->>", "StartTag", parseErrorList44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        xmlTreeBuilder41.initialiseParse("<!---->", "<<!---->>", parseErrorList48);
        org.jsoup.parser.Token.Character character51 = new org.jsoup.parser.Token.Character("");
        java.lang.String str52 = character51.toString();
        java.lang.String str53 = character51.getData();
        java.lang.String str54 = character51.toString();
        java.lang.String str55 = character51.toString();
        boolean boolean56 = xmlTreeBuilder41.process((org.jsoup.parser.Token) character51);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder57.initialiseParse("</<!---->>", "</<!---->>", parseErrorList60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder57.initialiseParse("", "<<!---->>", parseErrorList64);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        xmlTreeBuilder57.initialiseParse("<!---->", "hi!", parseErrorList68);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str72 = startTag71.tokenType();
        boolean boolean73 = startTag71.selfClosing;
        org.jsoup.nodes.Element element74 = xmlTreeBuilder57.insert(startTag71);
        boolean boolean75 = xmlTreeBuilder41.process((org.jsoup.parser.Token) startTag71);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        boolean boolean77 = comment76.isStartTag();
        org.jsoup.parser.Token.Comment comment78 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType79 = org.jsoup.parser.Token.TokenType.Doctype;
        comment78.type = tokenType79;
        comment76.type = tokenType79;
        boolean boolean82 = comment76.isStartTag();
        java.lang.String str83 = comment76.toString();
        xmlTreeBuilder41.insert(comment76);
        xmlTreeBuilder0.insert(comment76);
        java.lang.String str86 = comment76.getData();
        java.lang.String str87 = comment76.toString();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "StartTag" + "'", str72, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + tokenType79 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType79.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!---->" + "'", str83, "<!---->");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "<!---->" + "'", str87, "<!---->");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        startTag2.finaliseTag();
        startTag2.appendAttributeName("<hi!>");
        startTag2.appendTagName("</</<!---->>>");
        java.lang.String str10 = startTag2.toString();
        java.lang.String str11 = startTag2.tokenType();
        startTag2.finaliseTag();
        startTag2.tagName = "</<!----><StartTag>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!</</<!---->>>>" + "'", str10, "<hi!</</<!---->>>>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = character6.isDoctype();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder0.initialiseParse("<4>", "4", parseErrorList13);
        org.jsoup.parser.Token.Doctype doctype15 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder16 = doctype15.publicIdentifier;
        java.lang.StringBuilder stringBuilder17 = doctype15.publicIdentifier;
        boolean boolean18 = doctype15.forceQuirks;
        java.lang.String str19 = doctype15.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder20 = doctype15.publicIdentifier;
        java.lang.StringBuilder stringBuilder21 = doctype15.publicIdentifier;
        java.lang.String str22 = doctype15.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        boolean boolean22 = comment16.isStartTag();
        java.lang.StringBuilder stringBuilder23 = comment16.data;
        boolean boolean24 = comment16.isStartTag();
        java.lang.String str25 = comment16.toString();
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isEndTag();
        boolean boolean31 = startTag27.isEOF();
        startTag27.appendAttributeValue("hi!");
        startTag27.appendTagName('4');
        boolean boolean36 = startTag27.isSelfClosing();
        boolean boolean37 = startTag27.isComment();
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("</<!---->>", "</<!---->>", parseErrorList42);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder39.initialiseParse("StartTag", "<!---->", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.getData();
        xmlTreeBuilder39.insert(comment48);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.String str52 = comment51.toString();
        boolean boolean53 = comment51.isEndTag();
        xmlTreeBuilder39.insert(comment51);
        org.jsoup.parser.Token.Character character56 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str57 = character56.getData();
        java.lang.String str58 = character56.toString();
        xmlTreeBuilder39.insert(character56);
        xmlTreeBuilder0.insert(character56);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendAttributeValue('4');
        boolean boolean65 = startTag62.isEndTag();
        startTag62.newAttribute();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        startTag67.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes70 = startTag67.attributes;
        startTag62.attributes = attributes70;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes70);
        boolean boolean73 = startTag72.isEOF();
        startTag72.appendAttributeValue("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes76 = startTag72.attributes;
        boolean boolean77 = startTag72.isSelfClosing();
        boolean boolean78 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag72);
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<<</<hi!>>>>", parseErrorList81);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        java.lang.String str4 = startTag2.name();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->", attributes7);
        startTag8.tagName = "<<!---->>4";
        boolean boolean11 = startTag8.selfClosing;
        boolean boolean12 = startTag8.selfClosing;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        boolean boolean15 = comment14.isStartTag();
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType17 = org.jsoup.parser.Token.TokenType.Doctype;
        comment16.type = tokenType17;
        comment14.type = tokenType17;
        boolean boolean20 = comment14.isStartTag();
        java.lang.String str21 = comment14.getData();
        java.lang.String str22 = comment14.getData();
        org.jsoup.parser.Token.TokenType tokenType23 = comment14.type;
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder0.initialiseParse("", "</<hi!>>", parseErrorList27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</<!---->>", "</<!---->>", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("StartTag", "<!---->", parseErrorList36);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        java.lang.String str39 = comment38.getData();
        xmlTreeBuilder29.insert(comment38);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.String str42 = comment41.toString();
        boolean boolean43 = comment41.isEndTag();
        xmlTreeBuilder29.insert(comment41);
        org.jsoup.parser.Token.Character character46 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str47 = character46.getData();
        xmlTreeBuilder29.insert(character46);
        xmlTreeBuilder0.insert(character46);
        org.jsoup.parser.Token.Character character51 = new org.jsoup.parser.Token.Character("<!----><<!---->>");
        java.lang.String str52 = character51.getData();
        xmlTreeBuilder0.insert(character51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<<!---->>" + "'", str47, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!----><<!---->>" + "'", str52, "<!----><<!---->>");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        boolean boolean6 = endTag5.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = endTag5.name("<!---->");
        boolean boolean9 = tag8.isCharacter();
        tag8.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes12 = tag8.attributes;
        org.jsoup.parser.Token.TokenType tokenType13 = tag8.type;
        doctype0.type = tokenType13;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype17 = doctype0.asDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(doctype17);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.appendTagName("<hi!<!---->>");
        endTag1.appendAttributeName("a");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        java.lang.String str6 = startTag2.name();
        startTag2.appendAttributeValue(' ');
        java.lang.Class<?> wildcardClass9 = startTag2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!4hi!EndTag");
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        boolean boolean6 = startTag0.isEOF();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue('4');
        boolean boolean10 = startTag7.isDoctype();
        org.jsoup.nodes.Attributes attributes11 = startTag7.attributes;
        startTag0.attributes = attributes11;
        java.lang.String str13 = startTag0.tokenType();
        startTag0.finaliseTag();
        boolean boolean15 = startTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype16 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StartTag" + "'", str13, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.String str20 = comment19.toString();
        org.jsoup.parser.Token.TokenType tokenType21 = comment19.type;
        java.lang.String str22 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.String str25 = comment24.toString();
        org.jsoup.parser.Token.TokenType tokenType26 = comment24.type;
        java.lang.String str27 = comment24.toString();
        xmlTreeBuilder14.insert(comment24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</<!---->>", "StartTag", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("<!---->", "<<!---->>", parseErrorList36);
        org.jsoup.parser.Token.Character character39 = new org.jsoup.parser.Token.Character("");
        java.lang.String str40 = character39.toString();
        java.lang.String str41 = character39.getData();
        java.lang.String str42 = character39.toString();
        java.lang.String str43 = character39.toString();
        boolean boolean44 = xmlTreeBuilder29.process((org.jsoup.parser.Token) character39);
        xmlTreeBuilder14.insert(character39);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendAttributeValue('4');
        boolean boolean49 = startTag46.isDoctype();
        boolean boolean50 = startTag46.isDoctype();
        java.lang.String str51 = startTag46.tokenType();
        startTag46.appendTagName('a');
        org.jsoup.parser.Token.Tag tag55 = startTag46.name("hi!");
        boolean boolean56 = xmlTreeBuilder14.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag46);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        xmlTreeBuilder58.initialiseParse("</<!---->>", "</<!---->>", parseErrorList61);
        org.jsoup.parser.Token.Comment comment63 = new org.jsoup.parser.Token.Comment();
        java.lang.String str64 = comment63.toString();
        org.jsoup.parser.Token.TokenType tokenType65 = comment63.type;
        java.lang.String str66 = comment63.getData();
        xmlTreeBuilder58.insert(comment63);
        org.jsoup.parser.Token.Comment comment68 = new org.jsoup.parser.Token.Comment();
        boolean boolean69 = comment68.isStartTag();
        java.lang.String str70 = comment68.toString();
        boolean boolean71 = comment68.isCharacter();
        xmlTreeBuilder58.insert(comment68);
        java.lang.String str73 = comment68.getData();
        java.lang.StringBuilder stringBuilder74 = comment68.data;
        java.lang.StringBuilder stringBuilder75 = comment68.data;
        xmlTreeBuilder0.insert(comment68);
        org.jsoup.nodes.Attributes attributes78 = null;
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag("hi!", attributes78);
        boolean boolean80 = startTag79.isComment();
        boolean boolean81 = startTag79.selfClosing;
        startTag79.newAttribute();
        java.lang.String str83 = startTag79.tagName;
        org.jsoup.nodes.Element element84 = xmlTreeBuilder0.insert(startTag79);
        org.jsoup.parser.ParseErrorList parseErrorList87 = null;
        xmlTreeBuilder0.initialiseParse("<!---->4", "</</<!---->>>", parseErrorList87);
        java.lang.Class<?> wildcardClass89 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "StartTag" + "'", str51, "StartTag");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType65 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType65.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<!---->" + "'", str70, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        boolean boolean14 = comment5.isDoctype();
        java.lang.StringBuilder stringBuilder15 = comment5.data;
        java.lang.String str16 = comment5.tokenType();
        java.lang.String str17 = comment5.getData();
        java.lang.String str18 = comment5.getData();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Comment" + "'", str16, "Comment");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        org.jsoup.parser.Token.Tag tag12 = startTag2.name("<!---->StartTag");
        boolean boolean13 = tag12.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.tagName = "<hi!</</<!---->>>>";
        org.jsoup.parser.Token.Tag tag15 = startTag1.name("</</<!---->>>");
        org.jsoup.parser.Token.Tag tag17 = tag15.name("hi!4");
        tag17.appendTagName("<</hi!<!---->>>");
        java.lang.String str20 = tag17.name();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!4<</hi!<!---->>>" + "'", str20, "hi!4<</hi!<!---->>>");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.appendAttributeValue('4');
        endTag1.appendTagName("<!----><<!---->>");
        java.lang.String str11 = endTag1.toString();
        endTag1.appendAttributeName(' ');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag<!----><<!---->>>" + "'", str11, "</<!---->StartTag<!----><<!---->>>");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        tag6.appendAttributeValue('4');
        tag6.appendAttributeName('#');
        boolean boolean11 = tag6.isDoctype();
        java.lang.String str12 = tag6.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<<!---->>" + "'", str12, "<<!---->>");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = character6.isDoctype();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        boolean boolean14 = startTag13.isComment();
        boolean boolean15 = startTag13.selfClosing;
        startTag13.newAttribute();
        java.lang.String str17 = startTag13.tagName;
        org.jsoup.nodes.Element element18 = xmlTreeBuilder0.insert(startTag13);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("Comment", "", parseErrorList21);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.String str37 = comment36.toString();
        org.jsoup.parser.Token.TokenType tokenType38 = comment36.type;
        boolean boolean39 = comment36.isComment();
        java.lang.String str40 = comment36.getData();
        java.lang.String str41 = comment36.toString();
        java.lang.String str42 = comment36.toString();
        xmlTreeBuilder0.insert(comment36);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder0.initialiseParse("Comment", "hi!Comment", parseErrorList46);
        org.jsoup.parser.Token.Doctype doctype48 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str49 = doctype48.getName();
        java.lang.StringBuilder stringBuilder50 = doctype48.name;
        java.lang.StringBuilder stringBuilder51 = doctype48.name;
        doctype48.forceQuirks = true;
        java.lang.String str54 = doctype48.getPublicIdentifier();
        java.lang.String str55 = doctype48.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder56 = doctype48.publicIdentifier;
        boolean boolean57 = doctype48.isForceQuirks();
        java.lang.String str58 = doctype48.getName();
        doctype48.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes2 = null;
        startTag1.attributes = attributes2;
        java.lang.String str4 = startTag1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<<<!---->>>>" + "'", str4, "<<<<!---->>>>");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str20 = doctype19.getName();
        java.lang.StringBuilder stringBuilder21 = doctype19.name;
        doctype19.forceQuirks = false;
        java.lang.String str24 = doctype19.getName();
        java.lang.StringBuilder stringBuilder25 = doctype19.publicIdentifier;
        java.lang.StringBuilder stringBuilder26 = doctype19.publicIdentifier;
        java.lang.StringBuilder stringBuilder27 = doctype19.systemIdentifier;
        boolean boolean28 = doctype19.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes3 = startTag0.attributes;
        boolean boolean4 = startTag0.selfClosing;
        boolean boolean5 = startTag0.isStartTag();
        boolean boolean6 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        java.lang.String str9 = startTag2.name();
        startTag2.appendAttributeValue('#');
        boolean boolean12 = startTag2.isCharacter();
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("");
        boolean boolean15 = character14.isComment();
        boolean boolean16 = character14.isComment();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!", attributes18);
        boolean boolean20 = startTag19.isComment();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Doctype;
        comment21.type = tokenType22;
        startTag19.type = tokenType22;
        startTag19.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        boolean boolean28 = endTag27.selfClosing;
        org.jsoup.parser.Token.Tag tag30 = endTag27.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType31 = org.jsoup.parser.Token.TokenType.StartTag;
        tag30.type = tokenType31;
        startTag19.type = tokenType31;
        character14.type = tokenType31;
        startTag2.type = tokenType31;
        java.lang.String str36 = startTag2.tagName;
        org.jsoup.nodes.Attributes attributes37 = startTag2.getAttributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!<!---->" + "'", str9, "hi!<!---->");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!<!---->" + "'", str36, "hi!<!---->");
        org.junit.Assert.assertNull(attributes37);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.getData();
        java.lang.String str9 = character6.toString();
        boolean boolean10 = character6.isCharacter();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        boolean boolean13 = comment12.isStartTag();
        java.lang.String str14 = comment12.toString();
        java.lang.String str15 = comment12.getData();
        java.lang.StringBuilder stringBuilder16 = comment12.data;
        java.lang.String str17 = comment12.getData();
        java.lang.String str18 = comment12.toString();
        xmlTreeBuilder0.insert(comment12);
        java.lang.String str20 = comment12.toString();
        org.jsoup.parser.Token.TokenType tokenType21 = comment12.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag22 = comment12.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        boolean boolean5 = startTag1.isEOF();
        startTag1.appendAttributeValue("hi!");
        startTag1.appendTagName('4');
        boolean boolean10 = startTag1.isSelfClosing();
        org.jsoup.parser.Token.Tag tag12 = startTag1.name("hi!");
        startTag1.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str17 = startTag16.toString();
        java.lang.String str18 = startTag16.name();
        org.jsoup.parser.Token.Tag tag20 = startTag16.name("<hi!>");
        org.jsoup.nodes.Attributes attributes21 = startTag16.attributes;
        startTag1.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("<hi!4</<!---->>>", attributes21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<<!---->>" + "'", str17, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag10.appendTagName("<<!---->>");
        java.lang.String str13 = startTag10.name();
        boolean boolean14 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag10);
        org.jsoup.parser.Token.Doctype doctype15 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str16 = doctype15.getName();
        java.lang.StringBuilder stringBuilder17 = doctype15.publicIdentifier;
        java.lang.StringBuilder stringBuilder18 = doctype15.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype19 = doctype15.asDoctype();
        boolean boolean20 = doctype15.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!----><<!---->>" + "'", str13, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(doctype19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean3 = startTag2.isSelfClosing();
        boolean boolean4 = startTag2.isDoctype();
        startTag2.newAttribute();
        startTag2.tagName = "</<!---->>";
        org.jsoup.nodes.Attributes attributes8 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        boolean boolean10 = startTag9.selfClosing;
        startTag9.tagName = "<hi!4hi!EndTag>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder16.initialiseParse("", "<<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder16.initialiseParse("<!---->", "hi!", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str31 = startTag30.tokenType();
        boolean boolean32 = startTag30.selfClosing;
        org.jsoup.nodes.Element element33 = xmlTreeBuilder16.insert(startTag30);
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag30);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        boolean boolean36 = comment35.isStartTag();
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.Doctype;
        comment37.type = tokenType38;
        comment35.type = tokenType38;
        boolean boolean41 = comment35.isStartTag();
        java.lang.String str42 = comment35.toString();
        xmlTreeBuilder0.insert(comment35);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "</<!---->>", parseErrorList46);
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("hi!", attributes49);
        org.jsoup.nodes.Attributes attributes51 = startTag50.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element52 = xmlTreeBuilder0.insert(startTag50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertNull(attributes51);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag9.appendTagName("<<!---->>");
        java.lang.String str12 = startTag9.name();
        boolean boolean13 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag9);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag15.newAttribute();
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag15);
        boolean boolean18 = startTag15.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("StartTag", attributes9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag13.attributes = attributes20;
        startTag11.attributes = attributes20;
        startTag11.appendAttributeValue("hi!");
        org.jsoup.parser.Token.Tag tag26 = startTag11.name("EndTag");
        tag26.appendAttributeName("<hi!>");
        boolean boolean29 = tag26.isEOF();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeName("Comment");
        boolean boolean4 = endTag1.isDoctype();
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        startTag2.type = tokenType10;
        boolean boolean12 = startTag2.isSelfClosing();
        startTag2.appendAttributeValue("<hi!<!---->>");
        boolean boolean15 = startTag2.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype16 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = startTag1.getAttributes();
        org.jsoup.nodes.Attributes attributes6 = startTag1.attributes;
        startTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.forceQuirks;
        java.lang.String str14 = doctype0.getName();
        boolean boolean15 = doctype0.isForceQuirks();
        java.lang.String str16 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder17 = doctype0.name;
        boolean boolean18 = doctype0.isDoctype();
        java.lang.String str19 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("Comment");
        java.lang.String str2 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</Comment>" + "'", str2, "</Comment>");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("</<!---->StartTag<!----><<!---->>>");
        xmlTreeBuilder0.insert(character24);
        boolean boolean26 = character24.isComment();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str15 = startTag14.tokenType();
        boolean boolean16 = startTag14.selfClosing;
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag14);
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str19 = doctype18.getName();
        java.lang.StringBuilder stringBuilder20 = doctype18.name;
        doctype18.forceQuirks = false;
        java.lang.String str23 = doctype18.getPublicIdentifier();
        java.lang.String str24 = doctype18.getSystemIdentifier();
        doctype18.forceQuirks = true;
        java.lang.StringBuilder stringBuilder27 = doctype18.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeName("Comment");
        java.lang.String str4 = endTag1.tokenType();
        endTag1.appendTagName("</</<!---->StartTag<!----><<!---->>>>");
        java.lang.String str7 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!----></</<!---->StartTag<!----><<!---->>>>>" + "'", str7, "</<!----></</<!---->StartTag<!----><<!---->>>>>");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        boolean boolean4 = startTag1.isEOF();
        java.lang.String str5 = startTag1.name();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean8 = startTag7.isSelfClosing();
        boolean boolean9 = startTag7.isDoctype();
        startTag7.finaliseTag();
        startTag7.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes13 = startTag7.attributes;
        startTag1.attributes = attributes13;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        java.lang.String str6 = startTag1.toString();
        boolean boolean7 = startTag1.isEndTag();
        startTag1.appendAttributeValue("<!---->hi!");
        boolean boolean10 = startTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<<!---->>" + "'", str6, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<<!---->>");
        tag7.appendAttributeName('#');
        tag7.appendAttributeValue("<StartTag>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        org.jsoup.nodes.Attributes attributes11 = tag10.getAttributes();
        tag10.appendAttributeValue('4');
        tag10.appendTagName("<hi!Comment>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->#");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isCharacter();
        java.lang.String str7 = endTag0.tagName;
        org.jsoup.parser.Token.EndTag endTag8 = endTag0.asEndTag();
        boolean boolean9 = endTag8.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        java.lang.String str7 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        boolean boolean9 = startTag0.isCharacter();
        org.jsoup.nodes.Attributes attributes10 = startTag0.getAttributes();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = startTag7.type;
        startTag7.finaliseTag();
        java.lang.String str10 = startTag7.toString();
        startTag7.selfClosing = false;
        startTag7.appendAttributeValue(' ');
        startTag7.appendTagName("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag1.type;
        org.jsoup.nodes.Attributes attributes6 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->", attributes6);
        startTag7.appendTagName("hi!4hi!EndTag");
        boolean boolean10 = startTag7.isEOF();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("");
        java.lang.String str21 = character20.toString();
        java.lang.String str22 = character20.getData();
        java.lang.String str23 = character20.toString();
        java.lang.String str24 = character20.toString();
        xmlTreeBuilder0.insert(character20);
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("hi!", attributes27);
        startTag28.appendAttributeValue(' ');
        startTag28.newAttribute();
        startTag28.appendAttributeName('a');
        startTag28.appendAttributeName("");
        org.jsoup.nodes.Element element36 = xmlTreeBuilder0.insert(startTag28);
        startTag28.appendAttributeValue(' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        startTag2.type = tokenType10;
        boolean boolean12 = startTag2.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType13 = startTag2.type;
        boolean boolean14 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag1.type;
        org.jsoup.nodes.Attributes attributes6 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = startTag7.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.String str37 = comment36.toString();
        org.jsoup.parser.Token.TokenType tokenType38 = comment36.type;
        boolean boolean39 = comment36.isComment();
        java.lang.String str40 = comment36.getData();
        java.lang.String str41 = comment36.toString();
        java.lang.String str42 = comment36.toString();
        xmlTreeBuilder0.insert(comment36);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder0.initialiseParse("Comment", "hi!Comment", parseErrorList46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        xmlTreeBuilder0.initialiseParse("< >", "", parseErrorList50);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        startTag0.appendAttributeName('4');
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        boolean boolean11 = character10.isComment();
        boolean boolean12 = character10.isComment();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        boolean boolean16 = startTag15.isComment();
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        startTag15.type = tokenType18;
        startTag15.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        boolean boolean24 = endTag23.selfClosing;
        org.jsoup.parser.Token.Tag tag26 = endTag23.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType27 = org.jsoup.parser.Token.TokenType.StartTag;
        tag26.type = tokenType27;
        startTag15.type = tokenType27;
        character10.type = tokenType27;
        startTag0.type = tokenType27;
        java.lang.String str32 = startTag0.tokenType();
        startTag0.finaliseTag();
        boolean boolean34 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "StartTag" + "'", str32, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        xmlTreeBuilder0.initialiseParse("Doctype", "</</<!---->>>", parseErrorList14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.toString();
        org.jsoup.parser.Token.TokenType tokenType23 = comment21.type;
        java.lang.String str24 = comment21.getData();
        xmlTreeBuilder16.insert(comment21);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        boolean boolean27 = comment26.isStartTag();
        java.lang.String str28 = comment26.toString();
        boolean boolean29 = comment26.isCharacter();
        xmlTreeBuilder16.insert(comment26);
        java.lang.String str31 = comment26.getData();
        java.lang.StringBuilder stringBuilder32 = comment26.data;
        xmlTreeBuilder0.insert(comment26);
        java.lang.String str34 = comment26.getData();
        java.lang.StringBuilder stringBuilder35 = comment26.data;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        boolean boolean7 = startTag2.isDoctype();
        startTag2.tagName = "</</hi!<!---->>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        boolean boolean12 = startTag1.isStartTag();
        boolean boolean13 = startTag1.isStartTag();
        startTag1.newAttribute();
        startTag1.appendTagName("</Comment>");
        org.jsoup.parser.Token.Tag tag18 = startTag1.name("4#");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        java.lang.String str7 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<<!----><hi!>>");
        boolean boolean11 = tag10.isEndTag();
        org.jsoup.nodes.Attributes attributes12 = tag10.attributes;
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = startTag2.asStartTag();
        boolean boolean8 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        java.lang.String str3 = startTag1.name();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<hi!>");
        boolean boolean6 = startTag1.isComment();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        org.jsoup.parser.Token.TokenType tokenType10 = startTag9.type;
        startTag9.finaliseTag();
        boolean boolean12 = startTag9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType13 = startTag9.type;
        startTag1.type = tokenType13;
        startTag1.appendAttributeValue("<<<!---->>>");
        startTag1.selfClosing = true;
        boolean boolean19 = startTag1.isDoctype();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendTagName("Comment");
        boolean boolean9 = startTag2.isEndTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        org.jsoup.parser.Token.TokenType tokenType13 = startTag12.type;
        startTag12.finaliseTag();
        boolean boolean15 = startTag12.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType16 = startTag12.type;
        java.lang.String str17 = startTag12.tokenType();
        org.jsoup.parser.Token.TokenType tokenType18 = startTag12.type;
        startTag2.type = tokenType18;
        java.lang.String str20 = startTag2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<hi!Comment>" + "'", str20, "<hi!Comment>");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        boolean boolean5 = doctype4.isForceQuirks();
        boolean boolean6 = doctype4.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype4.name;
        doctype4.forceQuirks = true;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.appendAttributeValue(' ');
        java.lang.String str16 = startTag13.tokenType();
        java.lang.String str17 = startTag13.name();
        startTag13.appendTagName("<!---->");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        startTag13.type = tokenType24;
        doctype4.type = tokenType24;
        org.jsoup.parser.Token.TokenType tokenType27 = doctype4.type;
        endTag1.type = tokenType27;
        boolean boolean29 = endTag1.isCharacter();
        endTag1.appendAttributeName("hi!");
        java.lang.String str32 = endTag1.toString();
        endTag1.appendAttributeName("<!---->hi!");
        org.jsoup.parser.Token.Tag tag36 = endTag1.name("4#");
        boolean boolean37 = tag36.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->>" + "'", str32, "</<!---->>");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.finaliseTag();
        boolean boolean7 = startTag2.isEndTag();
        boolean boolean8 = startTag2.selfClosing;
        boolean boolean9 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        java.lang.String str6 = startTag2.tokenType();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        startTag9.appendAttributeValue(' ');
        java.lang.String str12 = startTag9.tokenType();
        java.lang.String str13 = startTag9.name();
        startTag9.appendTagName("<!---->");
        startTag9.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.selfClosing = false;
        startTag18.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes23 = startTag18.getAttributes();
        startTag9.attributes = attributes23;
        startTag2.attributes = attributes23;
        java.lang.String str26 = startTag2.tagName;
        boolean boolean27 = startTag2.isEndTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        startTag2.attributes = attributes28;
        startTag2.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        boolean boolean13 = startTag12.isComment();
        boolean boolean14 = startTag12.selfClosing;
        startTag12.newAttribute();
        org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag12);
        org.jsoup.nodes.Attributes attributes17 = startTag12.attributes;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.forceQuirks;
        java.lang.String str14 = doctype0.getName();
        java.lang.StringBuilder stringBuilder15 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.nodes.Attributes attributes3 = startTag2.attributes;
        boolean boolean4 = startTag2.isComment();
        boolean boolean5 = startTag2.isEndTag();
        startTag2.appendAttributeName(' ');
        boolean boolean8 = startTag2.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = startTag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.forceQuirks;
        boolean boolean14 = doctype0.isEndTag();
        boolean boolean15 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeName(' ');
        java.lang.String str10 = startTag2.toString();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str13 = startTag12.toString();
        java.lang.String str14 = startTag12.name();
        org.jsoup.parser.Token.Tag tag16 = startTag12.name("<hi!>");
        boolean boolean17 = startTag12.isComment();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        org.jsoup.parser.Token.TokenType tokenType21 = startTag20.type;
        startTag20.finaliseTag();
        boolean boolean23 = startTag20.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        startTag12.type = tokenType24;
        startTag2.type = tokenType24;
        boolean boolean27 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!4>" + "'", str10, "<hi!4>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<<!---->>" + "'", str13, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        java.lang.String str3 = startTag1.name();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<hi!>");
        boolean boolean6 = startTag1.isComment();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        org.jsoup.parser.Token.TokenType tokenType10 = startTag9.type;
        startTag9.finaliseTag();
        boolean boolean12 = startTag9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType13 = startTag9.type;
        startTag1.type = tokenType13;
        startTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str25 = startTag24.toString();
        java.lang.String str26 = startTag24.name();
        org.jsoup.parser.Token.Tag tag28 = startTag24.name("<hi!>");
        boolean boolean29 = startTag24.isComment();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        startTag32.finaliseTag();
        boolean boolean35 = startTag32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag32.type;
        startTag24.type = tokenType36;
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("", "<<!---->>", parseErrorList42);
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str46 = endTag45.toString();
        java.lang.String str47 = endTag45.toString();
        boolean boolean48 = xmlTreeBuilder39.process((org.jsoup.parser.Token) endTag45);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        xmlTreeBuilder39.initialiseParse("hi!<!---->", "", parseErrorList51);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EndTag");
        xmlTreeBuilder39.insert(character54);
        xmlTreeBuilder0.insert(character54);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder57.initialiseParse("</<!---->>", "</<!---->>", parseErrorList60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder57.initialiseParse("StartTag", "<hi!>", parseErrorList64);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        xmlTreeBuilder66.initialiseParse("</<!---->>", "</<!---->>", parseErrorList69);
        org.jsoup.parser.Token.Comment comment71 = new org.jsoup.parser.Token.Comment();
        java.lang.String str72 = comment71.toString();
        org.jsoup.parser.Token.TokenType tokenType73 = comment71.type;
        java.lang.String str74 = comment71.getData();
        xmlTreeBuilder66.insert(comment71);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType77 = org.jsoup.parser.Token.TokenType.Doctype;
        comment76.type = tokenType77;
        xmlTreeBuilder66.insert(comment76);
        xmlTreeBuilder57.insert(comment76);
        xmlTreeBuilder0.insert(comment76);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag82 = comment76.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<<!---->>" + "'", str25, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</<!---->>" + "'", str46, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "</<!---->>" + "'", str47, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<!---->" + "'", str72, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + tokenType77 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType77.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        startTag1.tagName = "</<!---->>";
        org.jsoup.nodes.Attributes attributes7 = startTag1.attributes;
        org.jsoup.parser.Token.Tag tag9 = startTag1.name("<<!---->>4");
        org.jsoup.nodes.Attributes attributes10 = tag9.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isEndTag();
        startTag2.newAttribute();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes10 = startTag7.attributes;
        startTag2.attributes = attributes10;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes10);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("</EndTag>", attributes10);
        boolean boolean14 = startTag13.selfClosing;
        boolean boolean15 = startTag13.isEOF();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        java.lang.String str7 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<<!----><hi!>>");
        boolean boolean11 = startTag0.isEndTag();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<!---->>");
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("StartTag");
        org.jsoup.nodes.Attributes attributes5 = null;
        startTag1.attributes = attributes5;
        startTag1.selfClosing = false;
        boolean boolean9 = startTag1.isStartTag();
        java.lang.String str10 = startTag1.name();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        org.jsoup.nodes.Attributes attributes8 = tag6.attributes;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.getName();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        java.lang.String str3 = startTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        startTag0.appendTagName('a');
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeValue('4');
        boolean boolean14 = startTag11.isEndTag();
        startTag11.newAttribute();
        boolean boolean16 = startTag11.isComment();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("hi!", attributes20);
        startTag21.newAttribute();
        startTag21.tagName = "";
        org.jsoup.nodes.Attributes attributes25 = startTag21.attributes;
        startTag18.attributes = attributes25;
        startTag11.attributes = attributes25;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->", attributes25);
        tag9.attributes = attributes25;
        org.jsoup.nodes.Attributes attributes30 = tag9.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag9.appendTagName("<<!---->>");
        java.lang.String str12 = startTag9.name();
        boolean boolean13 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag9);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag15.newAttribute();
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "</<!---->>", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder18.initialiseParse("StartTag", "<!---->", parseErrorList25);
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        java.lang.String str28 = comment27.getData();
        xmlTreeBuilder18.insert(comment27);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.String str31 = comment30.toString();
        boolean boolean32 = comment30.isEndTag();
        xmlTreeBuilder18.insert(comment30);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        boolean boolean35 = comment34.isStartTag();
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.Doctype;
        comment36.type = tokenType37;
        comment34.type = tokenType37;
        xmlTreeBuilder18.insert(comment34);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str43 = startTag42.toString();
        java.lang.String str44 = startTag42.name();
        org.jsoup.parser.Token.Tag tag46 = startTag42.name("<hi!>");
        boolean boolean47 = startTag42.isComment();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("hi!", attributes49);
        org.jsoup.parser.Token.TokenType tokenType51 = startTag50.type;
        startTag50.finaliseTag();
        boolean boolean53 = startTag50.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType54 = startTag50.type;
        startTag42.type = tokenType54;
        org.jsoup.nodes.Element element56 = xmlTreeBuilder18.insert(startTag42);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag42);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        startTag58.appendAttributeValue('4');
        boolean boolean61 = startTag58.isEndTag();
        boolean boolean62 = startTag58.isEOF();
        startTag58.appendAttributeValue("hi!");
        startTag58.appendTagName('4');
        boolean boolean67 = startTag58.isSelfClosing();
        org.jsoup.parser.Token.Tag tag69 = startTag58.name("hi!");
        boolean boolean70 = startTag58.isComment();
        org.jsoup.parser.Token.StartTag startTag71 = startTag58.asStartTag();
        org.jsoup.parser.Token.StartTag startTag72 = startTag71.asStartTag();
        boolean boolean73 = startTag72.isEndTag();
        startTag72.appendTagName("</<hi!>>");
        boolean boolean76 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag72);
        boolean boolean77 = startTag72.isCharacter();
        startTag72.appendTagName("hi!Comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<<!---->>" + "'", str43, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + tokenType51 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType51.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(startTag71);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->#");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        tag6.appendAttributeValue('4');
        tag6.finaliseTag();
        java.lang.String str10 = tag6.tagName;
        tag6.appendTagName("<</</<!---->>>>");
        boolean boolean13 = tag6.isDoctype();
        tag6.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character14 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("</<!---->>", "</<!---->>", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        org.jsoup.parser.Token.TokenType tokenType16 = comment14.type;
        java.lang.String str17 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        java.lang.String str19 = comment14.toString();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.selfClosing = false;
        startTag21.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes26 = startTag21.getAttributes();
        startTag21.appendAttributeValue('a');
        startTag21.finaliseTag();
        org.jsoup.nodes.Element element30 = xmlTreeBuilder0.insert(startTag21);
        startTag21.appendAttributeValue("hi!4");
        java.lang.String str33 = startTag21.tokenType();
        startTag21.finaliseTag();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StartTag" + "'", str33, "StartTag");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        startTag3.newAttribute();
        startTag3.tagName = "";
        boolean boolean7 = startTag3.isComment();
        startTag3.selfClosing = true;
        org.jsoup.nodes.Attributes attributes10 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes10);
        org.jsoup.nodes.Attributes attributes12 = startTag11.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.forceQuirks;
        java.lang.String str14 = doctype0.getName();
        boolean boolean15 = doctype0.isForceQuirks();
        java.lang.String str16 = doctype0.getSystemIdentifier();
        boolean boolean17 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        boolean boolean22 = comment16.isStartTag();
        java.lang.StringBuilder stringBuilder23 = comment16.data;
        boolean boolean24 = comment16.isStartTag();
        java.lang.String str25 = comment16.toString();
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isEndTag();
        startTag27.newAttribute();
        boolean boolean32 = startTag27.isComment();
        org.jsoup.parser.Token.Tag tag34 = startTag27.name("<hi!>");
        org.jsoup.nodes.Element element35 = xmlTreeBuilder0.insert(startTag27);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder0.initialiseParse("hi!4", "<<hi!>StartTag>", parseErrorList38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder0.initialiseParse("Comment", "<hi!EndTag>", parseErrorList42);
        org.jsoup.parser.Token.Comment comment44 = new org.jsoup.parser.Token.Comment();
        java.lang.String str45 = comment44.toString();
        boolean boolean46 = comment44.isEOF();
        boolean boolean47 = comment44.isEndTag();
        java.lang.String str48 = comment44.toString();
        xmlTreeBuilder0.insert(comment44);
        boolean boolean50 = comment44.isStartTag();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!---->" + "'", str48, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isCharacter();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("");
        org.jsoup.nodes.Attributes attributes2 = endTag1.getAttributes();
        endTag1.newAttribute();
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->StartTag<!----><<!---->>>", "</EndTag>", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.toString();
        java.lang.StringBuilder stringBuilder25 = comment23.data;
        java.lang.StringBuilder stringBuilder26 = comment23.data;
        java.lang.StringBuilder stringBuilder27 = comment23.data;
        java.lang.String str28 = comment23.toString();
        java.lang.String str29 = comment23.getData();
        java.lang.String str30 = comment23.getData();
        xmlTreeBuilder0.insert(comment23);
        java.lang.StringBuilder stringBuilder32 = comment23.data;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendAttributeValue('4');
        boolean boolean52 = startTag49.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType53 = startTag49.type;
        java.lang.String str54 = startTag49.tagName;
        boolean boolean55 = startTag49.isEndTag();
        startTag49.appendAttributeValue("");
        startTag49.tagName = "<!----><<!---->>";
        boolean boolean60 = startTag49.isSelfClosing();
        boolean boolean61 = startTag49.isStartTag();
        boolean boolean62 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag49);
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str65 = endTag64.toString();
        boolean boolean66 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag64);
        org.jsoup.nodes.Attributes attributes67 = endTag64.getAttributes();
        java.lang.String str68 = endTag64.tokenType();
        boolean boolean69 = endTag64.selfClosing;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "</<!---->>" + "'", str65, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(attributes67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "EndTag" + "'", str68, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

