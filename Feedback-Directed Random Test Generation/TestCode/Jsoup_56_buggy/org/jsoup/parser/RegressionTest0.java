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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RCDATAEndTagOpen;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.StringBuilder stringBuilder0 = null;
        org.jsoup.parser.Token.reset(stringBuilder0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = org.jsoup.nodes.DocumentType.SYSTEM_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SYSTEM" + "'", str0, "SYSTEM");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InHead;
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeName;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Rawtext;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CharacterReferenceInRcdata;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean11 = documentType9.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Initial;
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) eOF1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) eOF1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = eOF0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isDoctype();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) eOF1, htmlTreeBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusComment;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int12 = documentType11.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int12 = documentType11.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean12 = documentType10.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        java.lang.Class<?> wildcardClass1 = htmlTreeBuilderState0.getClass();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InCell;
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.TagName;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean13 = documentType11.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node14 = documentType11.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.Token.TokenType tokenType0 = org.jsoup.parser.Token.TokenType.Doctype;
        org.junit.Assert.assertTrue("'" + tokenType0 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType0.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.attr("", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.StartTag startTag4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = xmlTreeBuilder0.insert(startTag4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusDoctype;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node7.attr("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Rcdata;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "SYSTEM", "SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int12 = documentType11.siblingIndex();
        org.jsoup.nodes.Node node15 = documentType11.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.before("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node8.attr("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str10 = documentType9.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str10, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        java.lang.Class<?> wildcardClass1 = htmlTreeBuilderState0.getClass();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int12 = documentType11.siblingIndex();
        org.jsoup.nodes.Node node15 = documentType11.attr("hi!", "hi!");
        org.jsoup.nodes.Node node16 = documentType11.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        startTag1.newAttribute();
        java.lang.String str4 = startTag1.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = xmlTreeBuilder0.insert(startTag1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int13 = documentType12.siblingIndex();
        boolean boolean15 = documentType12.hasAttr("");
        org.jsoup.nodes.Node node16 = documentType12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = documentType4.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Comment comment1 = new org.jsoup.parser.Token.Comment();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.before("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag1 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype6.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.wrap("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeName;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        comment6.bogus = false;
        java.lang.StringBuilder stringBuilder9 = comment6.data;
        java.lang.String str10 = comment6.toString();
        xmlTreeBuilder0.insert(comment6);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder13 = doctype12.name;
        boolean boolean14 = doctype12.forceQuirks;
        java.lang.String str15 = doctype12.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str0 = org.jsoup.nodes.DocumentType.PUBLIC_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PUBLIC" + "'", str0, "PUBLIC");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        java.lang.String str18 = startTag17.name();
        startTag17.appendAttributeValue('4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token.TokenType tokenType3 = null;
        eOF0.type = tokenType3;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        java.lang.String str18 = startTag17.name();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag19.reset();
        tag20.finaliseTag();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean28 = documentType26.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes29 = documentType26.attributes();
        tag20.attributes = attributes29;
        startTag17.attributes = attributes29;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character32 = startTag17.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Comment;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = tag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype1 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str9 = startTag8.normalName;
        startTag8.newAttribute();
        java.lang.String str11 = startTag8.normalName();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        tag14.finaliseTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean22 = documentType20.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        tag14.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag25 = startTag8.nameAttr("<!---->", attributes23);
        java.lang.String str26 = startTag25.name();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
        tag28.finaliseTag();
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean36 = documentType34.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes37 = documentType34.attributes();
        tag28.attributes = attributes37;
        startTag25.attributes = attributes37;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document5.removeAttr("4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            node8.setBaseUri("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag1 = character0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder0.parseFragment("SYSTEM", "PUBLIC", parseErrorList15, parseSettings17);
        org.jsoup.parser.Token token19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = xmlTreeBuilder0.process(token19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEndTagName;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasAttr("hi!");
        int int15 = documentType12.childNodeSize();
        org.jsoup.nodes.Node node16 = documentType12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Character;
        doctype0.type = tokenType6;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        tag12.finaliseTag();
        org.jsoup.parser.Token.Tag tag14 = tag12.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("SYSTEM", "#doctype");
        boolean boolean14 = document12.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean16 = document12.hasAttr("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str10 = documentType9.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Attributes attributes13 = document12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("hi!", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType12.siblingNodes();
        documentType12.setBaseUri("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node7.before(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        int int8 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("PUBLIC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.Class<?> wildcardClass9 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        java.lang.String str2 = token1.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = character0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("PUBLIC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder2 = doctype1.name;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        boolean boolean4 = tag3.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = tag3.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        org.jsoup.nodes.Node node11 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str5 = startTag4.normalName;
        org.jsoup.nodes.Attributes attributes6 = startTag4.attributes;
        startTag3.attributes = attributes6;
        org.jsoup.parser.Token.EOF eOF8 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token9 = eOF8.reset();
        org.jsoup.parser.Token token10 = eOF8.reset();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.EndTag;
        token10.type = tokenType11;
        startTag3.type = tokenType11;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InSelect;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        tag2.finaliseTag();
        org.jsoup.parser.Token.Tag tag4 = tag2.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag2, htmlTreeBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int13 = documentType12.siblingIndex();
        org.jsoup.nodes.Node node16 = documentType12.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        org.jsoup.nodes.Attributes attributes5 = tag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag14.reset();
        tag15.finaliseTag();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean23 = documentType21.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        tag15.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = startTag9.nameAttr("<!---->", attributes24);
        tag7.attributes = attributes24;
        char[] charArray29 = new char[] { 'a' };
        tag7.appendAttributeValue(charArray29);
        tag1.appendAttributeValue(charArray29);
        tag1.appendTagName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.EOF;
        tag1.type = tokenType34;
        java.lang.Class<?> wildcardClass36 = tokenType34.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("hi!", "SYSTEM");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean25 = documentType23.hasAttr("hi!");
        org.jsoup.nodes.Node node26 = documentType23.previousSibling();
        java.lang.Object obj27 = new java.lang.Object();
        boolean boolean28 = documentType23.equals(obj27);
        java.lang.String str29 = documentType23.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = document18.before((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int14 = documentType13.siblingIndex();
        boolean boolean16 = documentType13.hasAttr("");
        org.jsoup.nodes.Node node17 = documentType13.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.after("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node9.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node10.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        xmlTreeBuilder0.initialiseParse("", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList4, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder0.parseFragment("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!---->", parseErrorList9, parseSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings11);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("hi!", "SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = document18.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        java.lang.String str8 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        boolean boolean4 = tag2.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = tag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int15 = documentType14.siblingIndex();
        boolean boolean17 = documentType14.hasAttr("");
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str19 = doctype18.getName();
        java.lang.String str20 = doctype18.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder21 = doctype18.systemIdentifier;
        java.lang.StringBuilder stringBuilder22 = documentType14.html(stringBuilder21);
        org.jsoup.nodes.Document document23 = documentType14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node8.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.Token.Comment comment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasAttr("hi!");
        int int15 = documentType12.childNodeSize();
        int int16 = documentType12.childNodeSize();
        java.lang.String str17 = documentType12.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SYSTEM" + "'", str17, "SYSTEM");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypeName;
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        comment0.bogus = true;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        org.jsoup.nodes.Attributes attributes11 = startTag9.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("SYSTEM", attributes11);
        // The following exception was thrown during execution in test generation
        try {
            startTag12.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        tag4.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = tag4.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Character;
        doctype0.type = tokenType6;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag1 = character0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.appendTagName(' ');
        boolean boolean11 = startTag0.isSelfClosing();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        xmlTreeBuilder10.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList13, parseSettings14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder10.parseFragment("", "#doctype", parseErrorList18, parseSettings19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        java.lang.String str23 = comment21.toString();
        org.jsoup.parser.Token token24 = comment21.reset();
        boolean boolean25 = xmlTreeBuilder10.process((org.jsoup.parser.Token) comment21);
        org.jsoup.nodes.Document document28 = xmlTreeBuilder10.parse("hi!", "SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.before((org.jsoup.nodes.Node) document28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertNotNull(token24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(document28);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.normalName;
        java.lang.String str13 = tag1.tokenType();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StartTag" + "'", str13, "StartTag");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendAttributeName("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        startTag0.appendAttributeName("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = eOF0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getName();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        startTag3.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        boolean boolean2 = eOF0.isEOF();
        org.jsoup.parser.Token token3 = eOF0.reset();
        boolean boolean4 = token3.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean11 = documentType9.hasAttr("hi!");
        int int12 = documentType9.childNodeSize();
        org.jsoup.nodes.Document document13 = documentType9.ownerDocument();
        java.lang.String str14 = documentType9.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        comment6.bogus = false;
        java.lang.StringBuilder stringBuilder9 = comment6.data;
        java.lang.String str10 = comment6.toString();
        xmlTreeBuilder0.insert(comment6);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder13 = doctype12.name;
        java.lang.StringBuilder stringBuilder14 = doctype12.systemIdentifier;
        boolean boolean15 = doctype12.isComment();
        java.lang.String str16 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder17 = doctype12.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        java.lang.String str14 = doctype6.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = doctype6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Attributes attributes4 = document3.attributes();
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document3.before((org.jsoup.nodes.Node) document10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        boolean boolean3 = tag1.selfClosing;
        tag1.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = tag1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int15 = documentType14.siblingIndex();
        boolean boolean17 = documentType14.hasAttr("");
        java.lang.String str18 = documentType14.baseUri();
        java.lang.String str19 = documentType14.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SYSTEM" + "'", str18, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str19, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        xmlTreeBuilder0.initialiseParse("", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList4, parseSettings5);
        org.jsoup.parser.Token.Character character7 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        xmlTreeBuilder0.initialiseParse("", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList4, parseSettings5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        java.lang.StringBuilder stringBuilder9 = doctype7.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str11 = startTag10.normalName;
        startTag10.newAttribute();
        java.lang.String str13 = startTag10.normalName();
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str15 = doctype14.getName();
        org.jsoup.parser.Token.TokenType tokenType16 = doctype14.type;
        startTag10.type = tokenType16;
        doctype7.type = tokenType16;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        java.lang.String str30 = startTag27.normalName();
        startTag27.appendAttributeName("");
        startTag27.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag35 = startTag27.reset();
        startTag27.appendTagName(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        java.lang.StringBuilder stringBuilder14 = doctype6.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        xmlTreeBuilder20.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        xmlTreeBuilder29.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder29.parseFragment("", "#doctype", parseErrorList37, parseSettings38);
        org.jsoup.parser.Token.Character character40 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder29.insert(character40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder29.parseFragment("SYSTEM", "PUBLIC", parseErrorList44, parseSettings46);
        xmlTreeBuilder20.initialiseParse("<SYSTEM>", "Doctype", parseErrorList28, parseSettings46);
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder0.parseFragment("StartTag", "#doctype", parseErrorList19, parseSettings46);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(nodeList49);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        boolean boolean14 = doctype6.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = doctype6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", "#doctype", "#doctype", "StartTag");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = documentType4.equals((java.lang.Object) str8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        java.lang.String str7 = node6.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">" + "'", str7, "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        org.jsoup.parser.Token.TokenType tokenType22 = tag1.type;
        java.lang.Class<?> wildcardClass23 = tokenType22.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("EOF");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.parser.Token token14 = doctype6.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = token14.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = documentType12.html(stringBuilder15);
        java.lang.StringBuilder stringBuilder17 = documentType4.html(stringBuilder15);
        org.jsoup.nodes.Node node18 = documentType4.parentNode();
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str20 = doctype19.getName();
        boolean boolean21 = doctype19.forceQuirks;
        org.jsoup.parser.Token token22 = doctype19.reset();
        org.jsoup.parser.Token.TokenType tokenType23 = doctype19.type;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = node18.hasSameValue((java.lang.Object) tokenType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(token22);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.after("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        org.jsoup.nodes.Node node11 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.wrap("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = node10.equals((java.lang.Object) attributes18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("4", "<SYSTEM>", "4", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = document10.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("StartTag");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEndDash;
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getName();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        startTag3.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        java.lang.String str13 = doctype0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder7 = doctype6.name;
        java.lang.StringBuilder stringBuilder8 = doctype6.systemIdentifier;
        boolean boolean9 = doctype6.isComment();
        boolean boolean10 = doctype6.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        java.lang.String str8 = character6.getData();
        java.lang.String str9 = character6.toString();
        java.lang.String str10 = character6.getData();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder12 = doctype11.name;
        java.lang.StringBuilder stringBuilder13 = doctype11.systemIdentifier;
        boolean boolean14 = doctype11.isComment();
        org.jsoup.parser.Token.Doctype doctype15 = doctype11.asDoctype();
        java.lang.String str16 = doctype11.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doctype15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        boolean boolean4 = doctype0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.nodes.Node node14 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int20 = documentType19.siblingIndex();
        boolean boolean22 = documentType19.hasAttr("");
        java.lang.String str23 = documentType19.baseUri();
        java.lang.String str24 = documentType19.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.before((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "SYSTEM" + "'", str23, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str24, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = tag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterHead;
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character();
        java.lang.String str2 = character1.getData();
        org.jsoup.parser.Token.Character character4 = character1.data("<!---->");
        java.lang.String str5 = character4.toString();
        java.lang.String str6 = character4.getData();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) character4, htmlTreeBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = tag1.isEndTag();
        java.lang.Class<?> wildcardClass3 = tag1.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        tag3.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = startTag6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        java.lang.String str5 = tag1.name();
        org.jsoup.parser.Token.Tag tag6 = tag1.reset();
        tag1.setEmptyAttributeValue();
        tag1.appendAttributeValue("<!---->");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("hi!", "SYSTEM");
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = document18.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = node7.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag0.nameAttr("4", attributes9);
        // The following exception was thrown during execution in test generation
        try {
            startTag0.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str8 = documentType7.nodeName();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.getName();
        boolean boolean11 = doctype9.forceQuirks;
        org.jsoup.parser.Token token12 = doctype9.reset();
        org.jsoup.parser.Token.TokenType tokenType13 = doctype9.type;
        boolean boolean14 = doctype9.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType15 = doctype9.type;
        boolean boolean16 = documentType7.hasSameValue((java.lang.Object) doctype9);
        boolean boolean17 = doctype9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType18 = doctype9.type;
        token2.type = tokenType18;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag20 = token2.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = document3.childNodes();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = documentType4.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        java.lang.StringBuilder stringBuilder14 = doctype6.publicIdentifier;
        boolean boolean15 = doctype6.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character16 = doctype6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder15 = doctype14.name;
        java.lang.StringBuilder stringBuilder16 = doctype14.systemIdentifier;
        boolean boolean17 = doctype14.isComment();
        org.jsoup.parser.Token.Doctype doctype18 = doctype14.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doctype18);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        startTag3.finaliseTag();
        boolean boolean5 = startTag3.isStartTag();
        boolean boolean6 = startTag3.isSelfClosing();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getName();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        startTag3.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = documentType12.html(stringBuilder15);
        java.lang.StringBuilder stringBuilder17 = documentType4.html(stringBuilder15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.before("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        comment6.bogus = false;
        java.lang.StringBuilder stringBuilder9 = comment6.data;
        java.lang.String str10 = comment6.toString();
        xmlTreeBuilder0.insert(comment6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        xmlTreeBuilder12.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList15, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        xmlTreeBuilder21.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList24, parseSettings25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder21.parseFragment("", "#doctype", parseErrorList29, parseSettings30);
        org.jsoup.parser.Token.Character character32 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder21.insert(character32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder21.parseFragment("SYSTEM", "PUBLIC", parseErrorList36, parseSettings38);
        xmlTreeBuilder12.initialiseParse("<SYSTEM>", "Doctype", parseErrorList20, parseSettings38);
        org.jsoup.nodes.DocumentType documentType45 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str46 = documentType45.nodeName();
        org.jsoup.parser.Token.Doctype doctype47 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str48 = doctype47.getName();
        boolean boolean49 = doctype47.forceQuirks;
        org.jsoup.parser.Token token50 = doctype47.reset();
        org.jsoup.parser.Token.TokenType tokenType51 = doctype47.type;
        boolean boolean52 = doctype47.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType53 = doctype47.type;
        boolean boolean54 = documentType45.hasSameValue((java.lang.Object) doctype47);
        xmlTreeBuilder12.insert(doctype47);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#doctype" + "'", str46, "#doctype");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(token50);
        org.junit.Assert.assertTrue("'" + tokenType51 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType51.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("StartTag");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str12, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node18 = documentType15.nextSibling();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder25 = doctype24.name;
        java.lang.StringBuilder stringBuilder26 = doctype24.systemIdentifier;
        java.lang.StringBuilder stringBuilder27 = documentType23.html(stringBuilder26);
        java.lang.StringBuilder stringBuilder28 = documentType15.html(stringBuilder26);
        org.jsoup.nodes.Node node29 = documentType15.parentNode();
        java.lang.String str30 = documentType15.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.after((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str15 = documentType14.nodeName();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str17 = doctype16.getName();
        boolean boolean18 = doctype16.forceQuirks;
        org.jsoup.parser.Token token19 = doctype16.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = doctype16.type;
        boolean boolean21 = doctype16.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType22 = doctype16.type;
        boolean boolean23 = documentType14.hasSameValue((java.lang.Object) doctype16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.before((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean11 = documentType9.hasAttr("hi!");
        int int12 = documentType9.childNodeSize();
        org.jsoup.nodes.Node node13 = documentType9.nextSibling();
        org.jsoup.nodes.Node node14 = documentType9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.parser.Token token14 = doctype6.reset();
        boolean boolean15 = token14.isEOF();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getName();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        startTag3.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean7 = document3.hasAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = document3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.isDoctype();
        comment0.bogus = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptData;
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        xmlTreeBuilder7.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character();
        java.lang.String str14 = character13.getData();
        org.jsoup.parser.Token.Character character16 = character13.data("<!---->");
        java.lang.String str17 = character16.getData();
        xmlTreeBuilder7.insert(character16);
        xmlTreeBuilder0.insert(character16);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        comment20.bogus = false;
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        java.lang.String str24 = comment20.getData();
        boolean boolean25 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment20);
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder27 = doctype26.name;
        boolean boolean28 = doctype26.forceQuirks;
        java.lang.String str29 = doctype26.getPublicIdentifier();
        org.jsoup.parser.Token token30 = doctype26.reset();
        java.lang.String str31 = doctype26.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType32 = org.jsoup.parser.Token.TokenType.Character;
        doctype26.type = tokenType32;
        boolean boolean34 = doctype26.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(token30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        java.lang.Class<?> wildcardClass4 = character0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        boolean boolean12 = documentType4.hasAttr("StartTag");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = document13.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token token8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xmlTreeBuilder0.process(token8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getName();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder15 = doctype12.systemIdentifier;
        java.lang.Appendable appendable16 = node7.html((java.lang.Appendable) stringBuilder15);
        org.jsoup.nodes.Document document17 = node7.ownerDocument();
        org.jsoup.nodes.Document document18 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = document18.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        startTag0.normalName = "StartTag";
        startTag0.appendAttributeValue("<!---->");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.attr("<SYSTEM>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Attributes attributes14 = document13.attributes();
        org.jsoup.nodes.Document document15 = document13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after((org.jsoup.nodes.Node) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str17 = startTag16.normalName;
        startTag16.newAttribute();
        java.lang.String str19 = startTag16.normalName();
        startTag16.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = xmlTreeBuilder0.insert(startTag16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        xmlTreeBuilder1.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList4, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder1.parseFragment("", "#doctype", parseErrorList9, parseSettings10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder13 = comment12.data;
        java.lang.String str14 = comment12.toString();
        org.jsoup.parser.Token token15 = comment12.reset();
        boolean boolean16 = xmlTreeBuilder1.process((org.jsoup.parser.Token) comment12);
        boolean boolean17 = comment12.isEOF();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) comment12, htmlTreeBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("hi!", "SYSTEM");
        org.jsoup.nodes.Node node19 = document18.parent();
        // The following exception was thrown during execution in test generation
        try {
            document18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("hi!", "SYSTEM");
        org.jsoup.nodes.Node node19 = document18.parent();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean26 = documentType24.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType24.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = document18.after((org.jsoup.nodes.Node) documentType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "EOF", "Doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "4", "PUBLIC", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document6.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        int[] intArray8 = new int[] { 0, ' ', '#' };
        tag1.appendAttributeValue(intArray8);
        boolean boolean10 = tag1.isSelfClosing();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 32, 35 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.Class<?> wildcardClass9 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getName();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype2.type;
        doctype0.type = tokenType4;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        xmlTreeBuilder1.insert(comment5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        xmlTreeBuilder8.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList11, parseSettings12);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character();
        java.lang.String str15 = character14.getData();
        org.jsoup.parser.Token.Character character17 = character14.data("<!---->");
        java.lang.String str18 = character17.getData();
        xmlTreeBuilder8.insert(character17);
        xmlTreeBuilder1.insert(character17);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        comment21.bogus = false;
        java.lang.StringBuilder stringBuilder24 = comment21.data;
        java.lang.String str25 = comment21.getData();
        boolean boolean26 = xmlTreeBuilder1.process((org.jsoup.parser.Token) comment21);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(character17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        int int10 = node9.siblingIndex();
        org.jsoup.nodes.Node node11 = node9.parent();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean18 = documentType16.hasAttr("hi!");
        int int19 = documentType16.childNodeSize();
        org.jsoup.nodes.Document document20 = documentType16.ownerDocument();
        java.lang.String str21 = documentType16.nodeName();
        int int22 = documentType16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node9.after((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.Class<?> wildcardClass8 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = node9.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = documentType12.html(stringBuilder15);
        java.lang.StringBuilder stringBuilder17 = documentType4.html(stringBuilder15);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder19 = comment18.data;
        java.lang.String str20 = comment18.toString();
        boolean boolean21 = comment18.isDoctype();
        boolean boolean22 = comment18.isCharacter();
        java.lang.StringBuilder stringBuilder23 = comment18.data;
        java.lang.StringBuilder stringBuilder24 = documentType4.html(stringBuilder23);
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean31 = documentType29.hasAttr("hi!");
        org.jsoup.nodes.Node node32 = documentType29.previousSibling();
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = documentType29.equals(obj33);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType29.siblingNodes();
        org.jsoup.nodes.Node node36 = documentType29.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        int int14 = document13.siblingIndex();
        java.lang.String str15 = document13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = document13.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE PUBLIC>" + "'", str15, "<!DOCTYPE PUBLIC>");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        doctype4.forceQuirks = true;
        java.lang.String str7 = doctype4.getName();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.String str3 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node6 = document3.clone();
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHtml;
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isDoctype();
        boolean boolean3 = eOF1.isEOF();
        org.jsoup.parser.Token token4 = eOF1.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) eOF1, htmlTreeBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getName();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        startTag3.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        java.lang.String str13 = doctype0.getPublicIdentifier();
        java.lang.String str14 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasAttr("hi!");
        java.lang.String str22 = documentType19.baseUri();
        org.jsoup.nodes.Node node23 = documentType19.clone();
        org.jsoup.nodes.Node node24 = documentType19.parentNode();
        java.lang.String str25 = documentType19.nodeName();
        boolean boolean27 = documentType19.hasAttr("StartTag");
        org.jsoup.nodes.Document document28 = documentType19.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SYSTEM" + "'", str22, "SYSTEM");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node15 = documentType13.removeAttr("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        comment2.bogus = false;
        java.lang.StringBuilder stringBuilder5 = comment2.data;
        org.jsoup.parser.Token.Comment comment6 = comment2.asComment();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(comment6);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        boolean boolean3 = tag1.isEndTag();
        org.jsoup.nodes.Attributes attributes4 = tag1.getAttributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder2 = doctype1.name;
        boolean boolean3 = doctype1.forceQuirks;
        java.lang.String str4 = doctype1.getPublicIdentifier();
        org.jsoup.parser.Token token5 = doctype1.reset();
        boolean boolean6 = doctype1.isForceQuirks();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = null;
        boolean boolean8 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder7);
        java.lang.String str9 = doctype1.getSystemIdentifier();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int11 = documentType10.siblingIndex();
        boolean boolean13 = documentType10.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType10.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder2 = doctype1.name;
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = null;
        boolean boolean5 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = null;
        boolean boolean10 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag7, htmlTreeBuilder9);
        tag7.finaliseTag();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        tag3.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        org.jsoup.parser.Token.TokenType tokenType22 = tag1.type;
        org.jsoup.parser.Token token23 = tag1.reset();
        boolean boolean24 = tag1.isEndTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        node7.setBaseUri("<<SYSTEM>>");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentStart;
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Data;
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "4", "PUBLIC", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.before("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.lang.String str8 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isCharacter();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        org.jsoup.parser.Token token5 = doctype4.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("StartTag");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = documentType15.clone();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag19.reset();
        org.jsoup.parser.Token.Tag tag21 = startTag19.reset();
        org.jsoup.parser.Token.StartTag startTag22 = tag21.asStartTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        org.jsoup.nodes.Attributes attributes25 = startTag23.attributes;
        startTag22.attributes = attributes25;
        boolean boolean27 = documentType15.equals((java.lang.Object) attributes25);
        int int28 = documentType15.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.before("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        java.lang.String str30 = startTag27.normalName();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        tag33.finaliseTag();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean41 = documentType39.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        tag33.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag27.nameAttr("<!---->", attributes42);
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag44);
        org.jsoup.parser.Token.Character character46 = new org.jsoup.parser.Token.Character();
        java.lang.String str47 = character46.toString();
        org.jsoup.parser.Token.Character character49 = character46.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str50 = character49.toString();
        xmlTreeBuilder0.insert(character49);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype52 = character49.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(character49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str50, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasAttr("hi!");
        org.jsoup.nodes.Node node22 = documentType19.previousSibling();
        org.jsoup.nodes.Node node23 = documentType19.parentNode();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean30 = documentType28.hasAttr("hi!");
        java.lang.String str31 = documentType28.baseUri();
        org.jsoup.nodes.Node node32 = documentType28.clone();
        org.jsoup.nodes.Node node33 = node32.clone();
        int int34 = node33.siblingIndex();
        org.jsoup.nodes.Node node35 = node33.parent();
        boolean boolean36 = documentType19.hasSameValue((java.lang.Object) node35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node14.after(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "SYSTEM" + "'", str31, "SYSTEM");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag8.reset();
        org.jsoup.parser.Token.StartTag startTag11 = tag10.asStartTag();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        org.jsoup.nodes.Attributes attributes14 = startTag12.attributes;
        startTag11.attributes = attributes14;
        boolean boolean16 = documentType4.equals((java.lang.Object) attributes14);
        int int17 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after("<!DOCTYPE PUBLIC>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        tag5.normalName = "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">";
        org.jsoup.parser.Token.Tag tag9 = tag5.name("#");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "4", "PUBLIC", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.before("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str9 = documentType8.nodeName();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = startTag11.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getName();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder15 = doctype12.systemIdentifier;
        java.lang.Appendable appendable16 = node7.html((java.lang.Appendable) stringBuilder15);
        org.jsoup.nodes.Document document17 = node7.ownerDocument();
        org.jsoup.nodes.Node node19 = node7.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            node19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag10 = tag8.name("Doctype");
        tag8.appendAttributeName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHtml;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        startTag1.newAttribute();
        java.lang.String str4 = startTag1.normalName();
        startTag1.appendAttributeName("");
        startTag1.normalName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.nameAttr("4", attributes10);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag11, htmlTreeBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str11 = node10.outerHtml();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str17 = documentType16.nodeName();
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str19 = doctype18.getName();
        boolean boolean20 = doctype18.forceQuirks;
        org.jsoup.parser.Token token21 = doctype18.reset();
        org.jsoup.parser.Token.TokenType tokenType22 = doctype18.type;
        boolean boolean23 = doctype18.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType24 = doctype18.type;
        boolean boolean25 = documentType16.hasSameValue((java.lang.Object) doctype18);
        org.jsoup.nodes.Node node26 = documentType16.clone();
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        java.lang.String str30 = startTag27.normalName();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        tag33.finaliseTag();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean41 = documentType39.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        tag33.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag27.nameAttr("<!---->", attributes42);
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag44);
        org.jsoup.parser.Token.Character character46 = new org.jsoup.parser.Token.Character();
        java.lang.String str47 = character46.toString();
        org.jsoup.parser.Token token48 = character46.reset();
        xmlTreeBuilder0.insert(character46);
        org.jsoup.parser.Token token50 = character46.reset();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(token48);
        org.junit.Assert.assertNotNull(token50);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder19 = comment18.data;
        xmlTreeBuilder14.insert(comment18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        xmlTreeBuilder21.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList24, parseSettings25);
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character();
        java.lang.String str28 = character27.getData();
        org.jsoup.parser.Token.Character character30 = character27.data("<!---->");
        java.lang.String str31 = character30.getData();
        xmlTreeBuilder21.insert(character30);
        xmlTreeBuilder14.insert(character30);
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder14.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder0.parseFragment("<!---->", "StartTag", parseErrorList13, parseSettings34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(character30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertNotNull(parseSettings34);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = node8.attributes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscaped;
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("hi!", "SYSTEM");
        org.jsoup.nodes.Node node19 = document18.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.removeAttr("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        boolean boolean3 = startTag0.isComment();
        startTag0.normalName = "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        boolean boolean12 = documentType4.hasAttr("StartTag");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = document8.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getName();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder15 = doctype12.systemIdentifier;
        java.lang.Appendable appendable16 = node7.html((java.lang.Appendable) stringBuilder15);
        org.jsoup.nodes.Document document17 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node7.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "4", "PUBLIC", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.before("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.Token.Character character14 = character11.data("<!---->");
        org.jsoup.parser.Token token15 = character11.reset();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<!DOCTYPE PUBLIC>", "Doctype");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.attr("<<SYSTEM>>", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        boolean boolean8 = doctype0.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EOF", "", "4", "hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        java.lang.String str6 = startTag0.tagName;
        boolean boolean7 = startTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int15 = documentType14.siblingIndex();
        boolean boolean17 = documentType14.hasAttr("");
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str19 = doctype18.getName();
        java.lang.String str20 = doctype18.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder21 = doctype18.systemIdentifier;
        java.lang.StringBuilder stringBuilder22 = documentType14.html(stringBuilder21);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        boolean boolean15 = document13.equals((java.lang.Object) tokeniserState14);
        org.jsoup.parser.Tokeniser tokeniser16 = null;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState14.read(tokeniser16, characterReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getName();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder15 = doctype12.systemIdentifier;
        java.lang.Appendable appendable16 = node7.html((java.lang.Appendable) stringBuilder15);
        org.jsoup.nodes.Document document17 = node7.ownerDocument();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int23 = documentType22.siblingIndex();
        boolean boolean25 = documentType22.hasAttr("");
        java.lang.String str26 = documentType22.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token token8 = character6.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = character6.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        tag5.normalName = "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = tag5.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        org.jsoup.parser.Token token3 = doctype0.reset();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        int int11 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("StartTag");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        org.jsoup.nodes.Attributes attributes5 = tag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag14.reset();
        tag15.finaliseTag();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean23 = documentType21.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        tag15.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = startTag9.nameAttr("<!---->", attributes24);
        tag7.attributes = attributes24;
        char[] charArray29 = new char[] { 'a' };
        tag7.appendAttributeValue(charArray29);
        tag1.appendAttributeValue(charArray29);
        tag1.appendTagName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.EOF;
        tag1.type = tokenType34;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str37 = startTag36.normalName;
        startTag36.newAttribute();
        java.lang.String str39 = startTag36.normalName();
        startTag36.appendAttributeName("");
        startTag36.normalName = "hi!";
        startTag36.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag47 = startTag46.reset();
        tag47.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str50 = startTag49.normalName;
        startTag49.newAttribute();
        java.lang.String str52 = startTag49.normalName();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag55 = startTag54.reset();
        tag55.finaliseTag();
        org.jsoup.nodes.DocumentType documentType61 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean63 = documentType61.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes64 = documentType61.attributes();
        tag55.attributes = attributes64;
        org.jsoup.parser.Token.StartTag startTag66 = startTag49.nameAttr("<!---->", attributes64);
        tag47.attributes = attributes64;
        char[] charArray69 = new char[] { 'a' };
        tag47.appendAttributeValue(charArray69);
        startTag36.appendAttributeValue(charArray69);
        tag1.appendAttributeValue(charArray69);
        tag1.appendAttributeName("");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { 'a' });
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.setEmptyAttributeValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag8.reset();
        org.jsoup.parser.Token.StartTag startTag11 = tag10.asStartTag();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        org.jsoup.nodes.Attributes attributes14 = startTag12.attributes;
        startTag11.attributes = attributes14;
        boolean boolean16 = documentType4.equals((java.lang.Object) attributes14);
        int int17 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        boolean boolean15 = document13.equals((java.lang.Object) tokeniserState14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = document13.after("<!DOCTYPE PUBLIC>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        java.lang.StringBuilder stringBuilder14 = doctype6.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag15 = doctype6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        org.jsoup.nodes.Node node9 = node7.parent();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.Character character7 = new org.jsoup.parser.Token.Character();
        java.lang.String str8 = character7.getData();
        org.jsoup.parser.Token.Character character10 = character7.data("<!---->");
        xmlTreeBuilder0.insert(character7);
        org.jsoup.parser.Token.TokenType tokenType12 = character7.type;
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "4", "PUBLIC", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.removeAttr("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        boolean boolean2 = eOF0.isEOF();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = token6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        startTag0.normalName = "<!---->";
        startTag0.normalName = "EOF";
        java.lang.String str15 = startTag0.normalName;
        java.lang.String str16 = startTag0.tagName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        org.jsoup.parser.Token.TokenType tokenType7 = tag6.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isDoctype();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        org.jsoup.nodes.Attributes attributes5 = tag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag14.reset();
        tag15.finaliseTag();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean23 = documentType21.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        tag15.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = startTag9.nameAttr("<!---->", attributes24);
        tag7.attributes = attributes24;
        char[] charArray29 = new char[] { 'a' };
        tag7.appendAttributeValue(charArray29);
        tag1.appendAttributeValue(charArray29);
        tag1.appendTagName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.EOF;
        tag1.type = tokenType34;
        tag1.appendAttributeValue(' ');
        tag1.selfClosing = false;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node13 = documentType11.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean15 = documentType11.hasSameValue((java.lang.Object) htmlTreeBuilderState14);
        int int16 = documentType11.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            node6.replaceWith((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        java.lang.Class<?> wildcardClass37 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        tag2.finaliseTag();
        boolean boolean4 = tag2.selfClosing;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag2, htmlTreeBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Attributes attributes13 = node12.attributes();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node12.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        int int10 = node9.siblingIndex();
        org.jsoup.nodes.Node node11 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag0.nameAttr("4", attributes9);
        // The following exception was thrown during execution in test generation
        try {
            startTag10.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str17 = startTag16.normalName;
        startTag16.newAttribute();
        java.lang.String str19 = startTag16.normalName();
        java.lang.String str20 = startTag16.normalName();
        org.jsoup.parser.Token.Tag tag21 = startTag16.reset();
        org.jsoup.parser.Token.Tag tag22 = tag21.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        boolean boolean4 = token3.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.absUrl("4");
        java.lang.String str11 = documentType4.baseUri();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        tag8.finaliseTag();
        org.jsoup.parser.Token.Tag tag10 = tag8.reset();
        boolean boolean11 = tag10.selfClosing;
        tag10.appendTagName("4");
        org.jsoup.nodes.Attributes attributes14 = tag10.attributes;
        startTag0.attributes = attributes14;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        node8.setBaseUri("");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean19 = documentType17.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = documentType17.previousSibling();
        java.lang.String str21 = documentType17.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node8.after((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str21, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        tag1.appendTagName("#doctype");
        tag1.newAttribute();
        tag1.selfClosing = false;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        comment6.bogus = false;
        java.lang.StringBuilder stringBuilder9 = comment6.data;
        java.lang.String str10 = comment6.toString();
        xmlTreeBuilder0.insert(comment6);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        comment12.bogus = false;
        java.lang.StringBuilder stringBuilder15 = comment12.data;
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("#doctype", "4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = document19.wrap("PUBLIC");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.wrap("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str16 = documentType15.nodeName();
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str18 = doctype17.getName();
        boolean boolean19 = doctype17.forceQuirks;
        org.jsoup.parser.Token token20 = doctype17.reset();
        org.jsoup.parser.Token.TokenType tokenType21 = doctype17.type;
        boolean boolean22 = doctype17.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType23 = doctype17.type;
        boolean boolean24 = documentType15.hasSameValue((java.lang.Object) doctype17);
        org.jsoup.nodes.Node node25 = documentType15.clone();
        int int26 = node25.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node10.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        java.lang.String str16 = comment11.toString();
        org.jsoup.parser.Token.Comment comment17 = comment11.asComment();
        org.jsoup.parser.Token token18 = comment17.reset();
        boolean boolean19 = token18.isCharacter();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        tag1.normalName = "<!---->";
        int[] intArray27 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag1.appendAttributeValue(intArray27);
        java.lang.Class<?> wildcardClass29 = intArray27.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str7 = startTag6.normalName;
        startTag6.newAttribute();
        java.lang.String str9 = startTag6.normalName();
        startTag6.appendAttributeName("");
        startTag6.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str16 = startTag15.normalName;
        org.jsoup.nodes.Attributes attributes17 = startTag15.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = startTag6.nameAttr("SYSTEM", attributes17);
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.nameAttr("PUBLIC", attributes17);
        startTag19.appendAttributeValue("hi!");
        java.lang.String str22 = startTag19.tagName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PUBLIC" + "'", str22, "PUBLIC");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasAttr("hi!");
        int int15 = documentType12.childNodeSize();
        org.jsoup.nodes.Node node16 = documentType12.nextSibling();
        java.lang.String str17 = documentType12.nodeName();
        java.lang.String str18 = documentType12.baseUri();
        org.jsoup.nodes.Attributes attributes19 = documentType12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SYSTEM" + "'", str18, "SYSTEM");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.setEmptyAttributeValue();
        boolean boolean9 = tag7.selfClosing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        java.lang.String str18 = startTag17.name();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag19.reset();
        tag20.finaliseTag();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean28 = documentType26.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes29 = documentType26.attributes();
        tag20.attributes = attributes29;
        startTag17.attributes = attributes29;
        org.jsoup.nodes.Attributes attributes32 = startTag17.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag33 = startTag17.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = tag7.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str11 = documentType4.attr("Doctype");
        java.lang.String str12 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean19 = documentType17.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = documentType17.previousSibling();
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = documentType17.equals(obj21);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str12, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        tag10.tagName = "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">";
        tag10.selfClosing = false;
        java.lang.String str15 = tag10.tagName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str15, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.lang.String str9 = node7.absUrl("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        java.lang.String str16 = comment11.toString();
        org.jsoup.parser.Token.Comment comment17 = comment11.asComment();
        org.jsoup.parser.Token token18 = comment17.reset();
        java.lang.Class<?> wildcardClass19 = comment17.getClass();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder2 = doctype1.name;
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = null;
        boolean boolean5 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder4);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType7 = endTag6.type;
        org.jsoup.parser.Token.EndTag endTag8 = endTag6.asEndTag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) endTag6, htmlTreeBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        tag10.tagName = "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">";
        boolean boolean13 = tag10.isCharacter();
        java.lang.String str14 = tag10.normalName;
        boolean boolean15 = tag10.isCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        node8.setBaseUri("");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean19 = documentType17.hasAttr("hi!");
        int int20 = documentType17.childNodeSize();
        int int21 = documentType17.childNodeSize();
        java.lang.String str22 = documentType17.baseUri();
        org.jsoup.nodes.Node node23 = documentType17.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType17.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node8.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "SYSTEM" + "'", str22, "SYSTEM");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean16 = documentType14.hasAttr("hi!");
        int int17 = documentType14.childNodeSize();
        org.jsoup.nodes.Node node18 = documentType14.nextSibling();
        org.jsoup.nodes.Node node20 = documentType14.removeAttr("StartTag");
        org.jsoup.nodes.Node node23 = documentType14.attr("#", "#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node8.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        boolean boolean4 = tag3.selfClosing;
        java.lang.String str5 = tag3.tagName;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        tag3.attributes = attributes7;
        tag3.appendAttributeValue("hi!");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str16 = documentType15.nodeName();
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str18 = doctype17.getName();
        boolean boolean19 = doctype17.forceQuirks;
        org.jsoup.parser.Token token20 = doctype17.reset();
        org.jsoup.parser.Token.TokenType tokenType21 = doctype17.type;
        boolean boolean22 = doctype17.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType23 = doctype17.type;
        boolean boolean24 = documentType15.hasSameValue((java.lang.Object) doctype17);
        java.lang.String str25 = doctype17.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Doctype" + "'", str25, "Doctype");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getName();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder15 = doctype12.systemIdentifier;
        java.lang.Appendable appendable16 = node7.html((java.lang.Appendable) stringBuilder15);
        org.jsoup.nodes.Document document17 = node7.ownerDocument();
        org.jsoup.nodes.Document document18 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node7.before("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.nodes.Attributes attributes10 = startTag0.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        boolean boolean9 = documentType4.hasAttr("EOF");
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag4.reset();
        tag5.finaliseTag();
        tag5.appendTagName('4');
        int[] intArray12 = new int[] { 0, ' ', '#' };
        tag5.appendAttributeValue(intArray12);
        startTag0.appendAttributeValue(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 32, 35 });
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("StartTag");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "4", "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int10 = documentType9.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType9.attr("hi!", "hi!");
        java.lang.String str15 = node13.absUrl("Doctype");
        node13.setBaseUri("");
        int int18 = node13.childNodeSize();
        java.lang.String str19 = node13.baseUri();
        org.jsoup.nodes.Node node22 = node13.attr("<!DOCTYPE PUBLIC>", "PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("Comment");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.after("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        java.lang.String str10 = node9.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        char[] charArray23 = new char[] { 'a' };
        tag1.appendAttributeValue(charArray23);
        tag1.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character27 = tag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a' });
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str12 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SYSTEM" + "'", str12, "SYSTEM");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        boolean boolean3 = comment0.isDoctype();
        boolean boolean4 = comment0.isCharacter();
        boolean boolean5 = comment0.isStartTag();
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        startTag0.appendAttributeName("Comment");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        comment11.bogus = false;
        java.lang.StringBuilder stringBuilder14 = comment11.data;
        org.jsoup.parser.Token.Comment comment15 = comment11.asComment();
        xmlTreeBuilder0.insert(comment11);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        java.lang.String str19 = comment17.toString();
        org.jsoup.parser.Token token20 = comment17.reset();
        org.jsoup.parser.Token token21 = comment17.reset();
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder24 = comment23.data;
        java.lang.String str25 = comment23.toString();
        org.jsoup.parser.Token token26 = comment23.reset();
        org.jsoup.parser.Token token27 = comment23.reset();
        java.lang.String str28 = comment23.toString();
        org.jsoup.parser.Token.Comment comment29 = comment23.asComment();
        xmlTreeBuilder0.insert(comment23);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        xmlTreeBuilder34.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "#doctype", parseErrorList42, parseSettings43);
        org.jsoup.nodes.Document document47 = xmlTreeBuilder34.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document54 = xmlTreeBuilder51.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment55 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder56 = comment55.data;
        xmlTreeBuilder51.insert(comment55);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        xmlTreeBuilder58.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList61, parseSettings62);
        org.jsoup.parser.Token.Character character64 = new org.jsoup.parser.Token.Character();
        java.lang.String str65 = character64.getData();
        org.jsoup.parser.Token.Character character67 = character64.data("<!---->");
        java.lang.String str68 = character67.getData();
        xmlTreeBuilder58.insert(character67);
        xmlTreeBuilder51.insert(character67);
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder51.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder34.parseFragment("#doctype", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", parseErrorList50, parseSettings71);
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC>", "SYSTEM", parseErrorList33, parseSettings71);
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str75 = startTag74.normalName;
        startTag74.newAttribute();
        java.lang.String str77 = startTag74.normalName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertNotNull(comment29);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(character67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<!---->" + "'", str68, "<!---->");
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str11 = documentType4.attr("StartTag");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean18 = documentType16.hasAttr("hi!");
        int int19 = documentType16.childNodeSize();
        int int20 = documentType16.childNodeSize();
        org.jsoup.nodes.Node node22 = documentType16.removeAttr("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        java.lang.String str2 = character0.getData();
        org.jsoup.parser.Token.Character character4 = character0.data("SYSTEM");
        org.jsoup.parser.Token.TokenType tokenType5 = character0.type;
        org.jsoup.parser.Token token6 = character0.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.newAttribute();
        org.jsoup.parser.Token token23 = tag1.reset();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(token23);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str11 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        boolean boolean7 = doctype6.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        boolean boolean22 = tag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        startTag23.newAttribute();
        java.lang.String str26 = startTag23.normalName();
        startTag23.appendAttributeName("");
        startTag23.normalName = "hi!";
        startTag23.appendTagName("PUBLIC");
        org.jsoup.nodes.Attributes attributes33 = startTag23.attributes;
        tag1.attributes = attributes33;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "4", "PUBLIC", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document6.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        startTag9.appendAttributeName("");
        startTag9.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str19 = startTag18.normalName;
        org.jsoup.nodes.Attributes attributes20 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = startTag9.nameAttr("SYSTEM", attributes20);
        boolean boolean22 = documentType4.equals((java.lang.Object) attributes20);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType4.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("Comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        java.lang.String str30 = startTag27.normalName();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        tag33.finaliseTag();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean41 = documentType39.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        tag33.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag27.nameAttr("<!---->", attributes42);
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag44);
        org.jsoup.parser.Token.Character character46 = new org.jsoup.parser.Token.Character();
        java.lang.String str47 = character46.toString();
        org.jsoup.parser.Token.Character character49 = character46.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str50 = character49.toString();
        xmlTreeBuilder0.insert(character49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        xmlTreeBuilder52.initialiseParse("#doctype", "hi!", parseErrorList55, parseSettings56);
        org.jsoup.parser.Token.Character character58 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder52.insert(character58);
        java.lang.String str60 = character58.getData();
        java.lang.String str61 = character58.toString();
        xmlTreeBuilder0.insert(character58);
        org.jsoup.parser.Token.Doctype doctype63 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder64 = doctype63.name;
        java.lang.StringBuilder stringBuilder65 = doctype63.publicIdentifier;
        xmlTreeBuilder0.insert(doctype63);
        java.lang.StringBuilder stringBuilder67 = doctype63.publicIdentifier;
        boolean boolean68 = doctype63.isEOF();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(character49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str50, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = node8.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        startTag0.attributes = attributes16;
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.newAttribute();
        boolean boolean23 = tag1.isCharacter();
        tag1.appendTagName('a');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = false;
        boolean boolean9 = comment0.bogus;
        java.lang.String str10 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        java.lang.String str14 = doctype6.tokenType();
        boolean boolean15 = doctype6.isForceQuirks();
        boolean boolean16 = doctype6.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag17 = doctype6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isCharacter();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.isEndTag();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Attributes attributes4 = document3.attributes();
        org.jsoup.nodes.Document document5 = document3.ownerDocument();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean12 = documentType10.hasAttr("hi!");
        int int13 = documentType10.childNodeSize();
        int int14 = documentType10.childNodeSize();
        java.lang.String str15 = documentType10.baseUri();
        org.jsoup.nodes.Node node16 = documentType10.clone();
        org.jsoup.nodes.Node node17 = documentType10.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType10.childNodes();
        java.lang.String str20 = documentType10.attr("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = document3.after((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SYSTEM" + "'", str15, "SYSTEM");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.bogus;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendAttributeName("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        startTag0.appendAttributeName("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag19.reset();
        tag20.finaliseTag();
        tag20.appendTagName('4');
        org.jsoup.nodes.Attributes attributes24 = tag20.getAttributes();
        tag20.appendTagName("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.newAttribute();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        startTag23.newAttribute();
        org.jsoup.parser.Token.Tag tag26 = startTag23.reset();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
        tag28.finaliseTag();
        tag28.appendTagName('4');
        int[] intArray35 = new int[] { 0, ' ', '#' };
        tag28.appendAttributeValue(intArray35);
        startTag23.appendAttributeValue(intArray35);
        tag1.appendAttributeValue(intArray35);
        tag1.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0, 32, 35 });
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.Character character7 = new org.jsoup.parser.Token.Character();
        java.lang.String str8 = character7.getData();
        org.jsoup.parser.Token.Character character10 = character7.data("<!---->");
        xmlTreeBuilder0.insert(character7);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("", "<!---->4");
        org.jsoup.nodes.Document document17 = xmlTreeBuilder0.parse("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<!DOCTYPE PUBLIC>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = document17.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = tag1.isEndTag();
        boolean boolean3 = tag1.isStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean16 = documentType14.hasAttr("hi!");
        org.jsoup.nodes.Node node17 = documentType14.clone();
        org.jsoup.nodes.Attributes attributes18 = node17.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("PUBLIC", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "StartTag", "#doctype");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        xmlTreeBuilder5.insert(comment9);
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean19 = documentType17.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node20 = documentType17.nextSibling();
        org.jsoup.parser.Token.Doctype doctype21 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder22 = doctype21.name;
        java.lang.StringBuilder stringBuilder23 = doctype21.systemIdentifier;
        boolean boolean24 = doctype21.isComment();
        boolean boolean25 = doctype21.isComment();
        boolean boolean26 = documentType17.hasSameValue((java.lang.Object) doctype21);
        xmlTreeBuilder5.insert(doctype21);
        org.jsoup.nodes.Document document30 = xmlTreeBuilder5.parse("Comment", "Comment");
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        comment31.bogus = false;
        java.lang.StringBuilder stringBuilder34 = comment31.data;
        org.jsoup.parser.Token.Comment comment35 = comment31.asComment();
        boolean boolean36 = document30.equals((java.lang.Object) comment35);
        org.jsoup.nodes.Node node38 = document30.removeAttr("4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = documentType4.before((org.jsoup.nodes.Node) document30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        comment6.bogus = false;
        java.lang.StringBuilder stringBuilder9 = comment6.data;
        java.lang.String str10 = comment6.toString();
        xmlTreeBuilder0.insert(comment6);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        comment12.bogus = false;
        java.lang.StringBuilder stringBuilder15 = comment12.data;
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token token17 = comment12.reset();
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str7 = startTag6.normalName;
        startTag6.newAttribute();
        java.lang.String str9 = startTag6.normalName();
        java.lang.String str10 = startTag6.normalName();
        org.jsoup.parser.Token.Tag tag11 = startTag6.reset();
        boolean boolean12 = startTag6.isDoctype();
        org.jsoup.parser.Token.Tag tag14 = startTag6.name("Doctype");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = startTag0.nameAttr("<!---->", attributes15);
        java.lang.String str17 = startTag0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<<!---->>" + "'", str17, "<<!---->>");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        boolean boolean5 = comment0.isEOF();
        boolean boolean6 = comment0.bogus;
        boolean boolean7 = comment0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        java.lang.String str7 = startTag0.normalName;
        startTag0.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            startTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = tag1.isEndTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag3.reset();
        tag4.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str7 = startTag6.normalName;
        startTag6.newAttribute();
        java.lang.String str9 = startTag6.normalName();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        tag12.finaliseTag();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean20 = documentType18.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        tag12.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag23 = startTag6.nameAttr("<!---->", attributes21);
        tag4.attributes = attributes21;
        char[] charArray26 = new char[] { 'a' };
        tag4.appendAttributeValue(charArray26);
        tag1.appendAttributeValue(charArray26);
        int[] intArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tag1.appendAttributeValue(intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'a' });
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.Class<?> wildcardClass8 = stringBuilder7.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getName();
        java.lang.String str10 = doctype8.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype8.systemIdentifier;
        java.lang.StringBuilder stringBuilder12 = documentType4.html(stringBuilder11);
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes14 = document13.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        org.jsoup.parser.Token.Character character3 = character0.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token token4 = character0.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        boolean boolean11 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.Token.TokenType tokenType13 = comment8.type;
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str14 = startTag13.normalName;
        org.jsoup.nodes.Attributes attributes15 = startTag13.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = startTag0.nameAttr("", attributes15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character17 = startTag16.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag16);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType12.clone();
        org.jsoup.nodes.Attributes attributes16 = node15.attributes();
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("EOF", attributes16);
        org.jsoup.parser.Token.Tag tag19 = startTag0.name("<<SYSTEM>>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = document5.attr("<SYSTEM>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        java.lang.String str15 = documentType4.attr("<!---->");
        org.jsoup.nodes.Node node16 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean23 = documentType21.hasAttr("hi!");
        int int24 = documentType21.childNodeSize();
        org.jsoup.nodes.Document document25 = documentType21.ownerDocument();
        java.lang.String str26 = documentType21.nodeName();
        boolean boolean28 = documentType21.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.before((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character3 = character0.data("<!---->");
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = token4.tokenType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes8 = tag7.getAttributes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        boolean boolean7 = startTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        java.lang.String str10 = documentType4.absUrl("PUBLIC");
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.nameAttr("Doctype", attributes13);
        startTag14.appendAttributeName("SYSTEM");
        startTag14.appendAttributeValue("#");
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag14.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag14.selfClosing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.newAttribute();
        org.jsoup.parser.Token.Tag tag24 = tag1.name("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment25 = tag24.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        org.jsoup.parser.Token.StartTag startTag14 = tag13.asStartTag();
        startTag14.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document3.before("PUBLIC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str14 = startTag13.normalName;
        org.jsoup.nodes.Attributes attributes15 = startTag13.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = startTag0.nameAttr("", attributes15);
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag16);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        org.jsoup.nodes.Document document9 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = document9.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        java.lang.String str29 = character28.getData();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        xmlTreeBuilder34.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "#doctype", parseErrorList42, parseSettings43);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder34.insert(character45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder34.parseFragment("SYSTEM", "PUBLIC", parseErrorList49, parseSettings51);
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder17.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList33, parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder17.defaultSettings();
        xmlTreeBuilder0.initialiseParse("SYSTEM", "EOF", parseErrorList16, parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag57.reset();
        org.jsoup.parser.Token.Tag tag59 = startTag57.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element60 = xmlTreeBuilder0.insert(startTag57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tag59);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node8.after("<<!---->>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.tagName = "<SYSTEM>";
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Comment");
        java.lang.Class<?> wildcardClass9 = startTag0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!---->4");
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str2 = doctype1.getName();
        boolean boolean3 = doctype1.forceQuirks;
        java.lang.String str4 = doctype1.getSystemIdentifier();
        java.lang.String str5 = doctype1.getSystemIdentifier();
        doctype1.forceQuirks = false;
        boolean boolean8 = doctype1.forceQuirks;
        java.lang.StringBuilder stringBuilder9 = doctype1.systemIdentifier;
        boolean boolean10 = doctype1.isDoctype();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        node8.setBaseUri("");
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node8.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.tagName = "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">";
        tag1.appendTagName('#');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->4");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        boolean boolean11 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        xmlTreeBuilder13.initialiseParse("#doctype", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder13.insert(character19);
        org.jsoup.parser.Token token21 = character19.reset();
        xmlTreeBuilder0.insert(character19);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        xmlTreeBuilder26.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList29, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder26.parseFragment("", "#doctype", parseErrorList34, parseSettings35);
        org.jsoup.nodes.Document document39 = xmlTreeBuilder26.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document46 = xmlTreeBuilder43.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment47 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder48 = comment47.data;
        xmlTreeBuilder43.insert(comment47);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        xmlTreeBuilder50.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList53, parseSettings54);
        org.jsoup.parser.Token.Character character56 = new org.jsoup.parser.Token.Character();
        java.lang.String str57 = character56.getData();
        org.jsoup.parser.Token.Character character59 = character56.data("<!---->");
        java.lang.String str60 = character59.getData();
        xmlTreeBuilder50.insert(character59);
        xmlTreeBuilder43.insert(character59);
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder43.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder26.parseFragment("#doctype", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", parseErrorList42, parseSettings63);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder0.parseFragment("<!---->4", "StartTag", parseErrorList25, parseSettings63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(character59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<!---->" + "'", str60, "<!---->");
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList64);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        comment6.bogus = false;
        java.lang.StringBuilder stringBuilder9 = comment6.data;
        java.lang.String str10 = comment6.toString();
        xmlTreeBuilder0.insert(comment6);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        startTag12.newAttribute();
        startTag12.finaliseTag();
        boolean boolean16 = startTag12.isComment();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        xmlTreeBuilder7.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character();
        java.lang.String str14 = character13.getData();
        org.jsoup.parser.Token.Character character16 = character13.data("<!---->");
        java.lang.String str17 = character16.getData();
        xmlTreeBuilder7.insert(character16);
        xmlTreeBuilder0.insert(character16);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        comment20.bogus = false;
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        java.lang.String str24 = comment20.getData();
        boolean boolean25 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment20);
        java.lang.StringBuilder stringBuilder26 = comment20.data;
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        tag1.normalName = "<!---->";
        int[] intArray27 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag1.appendAttributeValue(intArray27);
        org.jsoup.parser.Token.StartTag startTag29 = tag1.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype30 = tag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(startTag29);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.parser.Token token14 = doctype6.reset();
        java.lang.String str15 = doctype6.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag16 = doctype6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int15 = documentType14.siblingIndex();
        boolean boolean17 = documentType14.hasAttr("");
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str19 = doctype18.getName();
        java.lang.String str20 = doctype18.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder21 = doctype18.systemIdentifier;
        java.lang.StringBuilder stringBuilder22 = documentType14.html(stringBuilder21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.before((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }
}

