package com.google.javascript.rhino;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TokenStreamTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIsKeyword_NullInput() {
        assertNull(null);
        try {
            TokenStream.isKeyword(null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testIsKeyword_EmptyString() {
        assertEquals(false, TokenStream.isKeyword(""));
    }

    @Test
    public void testIsKeyword_NonKeywordShortStrings() {
        assertEquals(false, TokenStream.isKeyword("a"));
        assertEquals(false, TokenStream.isKeyword("ab"));
        assertEquals(false, TokenStream.isKeyword("abc"));
        assertEquals(false, TokenStream.isKeyword("abco"));
    }

    @Test
    public void testIsKeyword_ValidKeywords() {
        String[] keywords2 = {"do", "if", "in"};
        for (String kw : keywords2) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        String[] keywords3 = {"for", "int", "new", "try", "var"};
        for (String kw : keywords3) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        String[] keywords4 = {"byte", "case", "char", "else", "enum", "goto", "long", "null", "true", "this", "void", "with"};
        for (String kw : keywords4) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        String[] keywords5 = {"class", "break", "while", "false", "const", "final", "float", "short", "super", "throw", "catch"};
        for (String kw : keywords5) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        String[] keywords6 = {"native", "delete", "return", "throws", "import", "double", "static", "public", "switch", "export", "typeof"};
        for (String kw : keywords6) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        String[] keywords7 = {"package", "default", "finally", "boolean", "private", "extends"};
        for (String kw : keywords7) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        String[] keywords8 = {"abstract", "continue", "debugger", "function", "volatile"};
        for (String kw : keywords8) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        String[] keywords9 = {"interface", "protected", "transient"};
        for (String kw : keywords9) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        String[] keywords10 = {"implements", "instanceof"};
        for (String kw : keywords10) {
            assertEquals("Keyword: " + kw, true, TokenStream.isKeyword(kw));
        }

        assertEquals(true, TokenStream.isKeyword("synchronized"));
    }

    @Test
    public void testIsKeyword_NonKeywords_DifferentLengths() {
        // length 2 but not keywords
        assertFalse(TokenStream.isKeyword("ab"));
        assertFalse(TokenStream.isKeyword("de"));
        assertFalse(TokenStream.isKeyword("fg"));
        assertFalse(TokenStream.isKeyword("zz"));

        // length 3 but not keywords
        assertFalse(TokenStream.isKeyword("abc"));
        assertFalse(TokenStream.isKeyword("dfg"));
        assertFalse(TokenStream.isKeyword("ijk"));
        assertFalse(TokenStream.isKeyword("lmn"));
        assertFalse(TokenStream.isKeyword("xyz"));

        // length 4 but not keywords
        assertFalse(TokenStream.isKeyword("abcd"));
        assertFalse(TokenStream.isKeyword("efgh"));
        assertFalse(TokenStream.isKeyword("ijkl"));
        assertFalse(TokenStream.isKeyword("mnop"));
        assertFalse(TokenStream.isKeyword("qrst"));
        assertFalse(TokenStream.isKeyword("uvwx"));
        assertFalse(TokenStream.isKeyword("zbcd"));

        // length 5 but not keywords
        assertFalse(TokenStream.isKeyword("abcde"));
        assertFalse(TokenStream.isKeyword("fghij"));
        assertFalse(TokenStream.isKeyword("klmno"));
        assertFalse(TokenStream.isKeyword("pqrst"));
        assertFalse(TokenStream.isKeyword("uvwxy"));

        // length 6 but not keywords
        assertFalse(TokenStream.isKeyword("abcdef"));
        assertFalse(TokenStream.isKeyword("ghijkl"));
        assertFalse(TokenStream.isKeyword("mnopqr"));
        assertFalse(TokenStream.isKeyword("stuvwx"));
        assertFalse(TokenStream.isKeyword("yzabcd"));

        // length 7 but not keywords
        assertFalse(TokenStream.isKeyword("abcdefg"));
        assertFalse(TokenStream.isKeyword("hijklmn"));
        assertFalse(TokenStream.isKeyword("opqrstu"));
        assertFalse(TokenStream.isKeyword("vwxyzab"));

        // length 8 but not keywords
        assertFalse(TokenStream.isKeyword("abcdefgh"));
        assertFalse(TokenStream.isKeyword("ijklmnop"));
        assertFalse(TokenStream.isKeyword("qrstuvwx"));
        assertFalse(TokenStream.isKeyword("yzabcdefg"));

        // length 9 but not keywords
        assertFalse(TokenStream.isKeyword("abcdefghi"));
        assertFalse(TokenStream.isKeyword("jklmnopqr"));
        assertFalse(TokenStream.isKeyword("stuvwxyza"));

        // length 10 but not keywords
        assertFalse(TokenStream.isKeyword("abcdefghij"));
        assertFalse(TokenStream.isKeyword("klmnopqrst"));
        assertFalse(TokenStream.isKeyword("uvwxyzabcd"));

        // length 12 but not keyword
        assertFalse(TokenStream.isKeyword("abcdefghijkl"));
    }

    @Test
    public void testIsKeyword_CaseSensitive() {
        assertFalse(TokenStream.isKeyword("IF"));
        assertFalse(TokenStream.isKeyword("If"));
        assertFalse(TokenStream.isKeyword("iF"));
        assertFalse(TokenStream.isKeyword("Do"));
        assertFalse(TokenStream.isKeyword("dO"));
        assertFalse(TokenStream.isKeyword("ReturN"));
    }

    @Test
    public void testIsKeyword_UnicodeIdentifiers() {
        assertFalse(TokenStream.isKeyword("if\u00e9"));
        assertFalse(TokenStream.isKeyword("\u00e9if"));
        assertFalse(TokenStream.isKeyword("\u4e2d\u6587"));
        assertTrue(TokenStream.isJSIdentifier("\u4e2d\u6587"));
        assertTrue(TokenStream.isJSIdentifier("\u00e9"));
    }

    @Test
    public void testIsJSIdentifier_ValidIdentifiers() {
        assertTrue(TokenStream.isJSIdentifier("a"));
        assertTrue(TokenStream.isJSIdentifier("abc"));
        assertTrue(TokenStream.isJSIdentifier("a1"));
        assertTrue(TokenStream.isJSIdentifier("_abc"));
        assertTrue(TokenStream.isJSIdentifier("$abc"));
        assertTrue(TokenStream.isJSIdentifier("a_b_c"));
        assertTrue(TokenStream.isJSIdentifier("abc123"));
        assertTrue(TokenStream.isJSIdentifier("\u00e9abc"));
        assertTrue(TokenStream.isJSIdentifier("\u4e2d\u6587"));
    }

    @Test
    public void testIsJSIdentifier_InvalidIdentifiers() {
        assertFalse(TokenStream.isJSIdentifier(""));
        assertFalse(TokenStream.isJSIdentifier("1abc"));
        assertFalse(TokenStream.isJSIdentifier("-abc"));
        assertFalse(TokenStream.isJSIdentifier("abc "));
        assertFalse(TokenStream.isJSIdentifier(" abc"));
        assertFalse(TokenStream.isJSIdentifier("a b"));
        assertFalse(TokenStream.isJSIdentifier("a\nb"));
        assertFalse(TokenStream.isJSIdentifier("a\tb"));
        assertFalse(TokenStream.isJSIdentifier("a\u0000b"));
        assertFalse(TokenStream.isJSIdentifier("!abc"));
        assertFalse(TokenStream.isJSIdentifier("@abc"));
        assertFalse(TokenStream.isJSIdentifier("#abc"));
        assertFalse(TokenStream.isJSIdentifier("%abc"));
        assertFalse(TokenStream.isJSIdentifier("&abc"));
        assertFalse(TokenStream.isJSIdentifier("*abc"));
    }

    @Test
    public void testIsJSIdentifier_SingleCharacterValid() {
        assertTrue(TokenStream.isJSIdentifier("a"));
        assertTrue(TokenStream.isJSIdentifier("_"));
        assertTrue(TokenStream.isJSIdentifier("$"));
        assertTrue(TokenStream.isJSIdentifier("\u00e9"));
        assertTrue(TokenStream.isJSIdentifier("\u4e2d"));
    }

    @Test
    public void testIsJSIdentifier_LongIdentifiers() {
        assertTrue(TokenStream.isJSIdentifier("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(TokenStream.isJSIdentifier("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertTrue(TokenStream.isJSIdentifier("_abcdefghijklmnopqrstuvwxyz1234567890"));
        assertTrue(TokenStream.isJSIdentifier("$abcdefghijklmnopqrstuvwxyz1234567890"));
    }

    @Test
    public void testIsKeyword_MixedLengthNonKeywords() {
        assertFalse(TokenStream.isKeyword("abcdefghij"));
        assertFalse(TokenStream.isKeyword("a"));
        assertFalse(TokenStream.isKeyword("bb"));
        assertFalse(TokenStream.isKeyword("ccc"));
        assertFalse(TokenStream.isKeyword("dddd"));
        assertFalse(TokenStream.isKeyword("eeeee"));
        assertFalse(TokenStream.isKeyword("ffffff"));
        assertFalse(TokenStream.isKeyword("ggggggg"));
        assertFalse(TokenStream.isKeyword("hhhhhhhh"));
        assertFalse(TokenStream.isKeyword("iiiiiiiii"));
        assertFalse(TokenStream.isKeyword("jjjjjjjjjj"));
        assertFalse(TokenStream.isKeyword("kkkkkkkkkkk"));
        assertFalse(TokenStream.isKeyword("llllllllllll"));
    }

    @Test
    public void testIsKeyword_NonEnglishKeywords() {
        assertFalse(TokenStream.isKeyword("if\u00e9"));
        assertFalse(TokenStream.isKeyword("\u00e9"));
        assertFalse(TokenStream.isKeyword("\u4e2d"));
        assertFalse(TokenStream.isKeyword("\u00e9abc"));
    }
}