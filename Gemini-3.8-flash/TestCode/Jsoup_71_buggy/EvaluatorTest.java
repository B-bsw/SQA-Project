package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class EvaluatorTest {

    @Test
    public void tag_givenMatchingTag_shouldReturnTrue() {
        // Arrange
        Evaluator.Tag evaluator = new Evaluator.Tag("div");
        Document doc = Jsoup.parse("<div><p>text</p></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("div", evaluator.toString());
    }

    @Test
    public void tag_givenCaseInsensitiveMatch_shouldReturnTrue() {
        // Arrange
        Evaluator.Tag evaluator = new Evaluator.Tag("DIV");
        Document doc = Jsoup.parse("<div></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void tag_givenDifferentTag_shouldReturnFalse() {
        // Arrange
        Evaluator.Tag evaluator = new Evaluator.Tag("span");
        Document doc = Jsoup.parse("<div></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void tagEndsWith_givenMatchingSuffix_shouldReturnTrue() {
        // Arrange
        Evaluator.TagEndsWith evaluator = new Evaluator.TagEndsWith("div");
        Document doc = Jsoup.parse("<div></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("div", evaluator.toString());
    }

    @Test
    public void tagEndsWith_givenCustomXmlTagMatchingSuffix_shouldReturnTrue() {
        // Arrange
        Evaluator.TagEndsWith evaluator = new Evaluator.TagEndsWith("entry");
        Element element = new Element(Tag.valueOf("my-entry"), "");

        // Act
        boolean result = evaluator.matches(null, element);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void tagEndsWith_givenNonMatchingSuffix_shouldReturnFalse() {
        // Arrange
        Evaluator.TagEndsWith evaluator = new Evaluator.TagEndsWith("span");
        Document doc = Jsoup.parse("<div></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void id_givenMatchingId_shouldReturnTrue() {
        // Arrange
        Evaluator.Id evaluator = new Evaluator.Id("main");
        Document doc = Jsoup.parse("<div id='main'></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("#main", evaluator.toString());
    }

    @Test
    public void id_givenDifferentId_shouldReturnFalse() {
        // Arrange
        Evaluator.Id evaluator = new Evaluator.Id("header");
        Document doc = Jsoup.parse("<div id='main'></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void class_givenMatchingClass_shouldReturnTrue() {
        // Arrange
        Evaluator.Class evaluator = new Evaluator.Class("btn");
        Document doc = Jsoup.parse("<div class='btn active'></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(".btn", evaluator.toString());
    }

    @Test
    public void class_givenMissingClass_shouldReturnFalse() {
        // Arrange
        Evaluator.Class evaluator = new Evaluator.Class("hidden");
        Document doc = Jsoup.parse("<div class='btn active'></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void attribute_givenExistingAttribute_shouldReturnTrue() {
        // Arrange
        Evaluator.Attribute evaluator = new Evaluator.Attribute("data-id");
        Document doc = Jsoup.parse("<div data-id='123'></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("[data-id]", evaluator.toString());
    }

    @Test
    public void attribute_givenMissingAttribute_shouldReturnFalse() {
        // Arrange
        Evaluator.Attribute evaluator = new Evaluator.Attribute("data-other");
        Document doc = Jsoup.parse("<div data-id='123'></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void attributeStarting_givenMatchingPrefix_shouldReturnTrue() {
        // Arrange
        Evaluator.AttributeStarting evaluator = new Evaluator.AttributeStarting("data-");
        Document doc = Jsoup.parse("<div DATA-user='john'></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("[^data-]", evaluator.toString());
    }

    @Test
    public void attributeStarting_givenNoMatchingPrefix_shouldReturnFalse() {
        // Arrange
        Evaluator.AttributeStarting evaluator = new Evaluator.AttributeStarting("aria-");
        Document doc = Jsoup.parse("<div data-user='john'></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertFalse(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void attributeStarting_givenNullOrEmpty_shouldThrowException() {
        new Evaluator.AttributeStarting("");
    }

    @Test
    public void attributeWithValue_givenExactValue_shouldReturnTrue() {
        // Arrange
        Evaluator.AttributeWithValue evaluator = new Evaluator.AttributeWithValue("title", "Hello");
        Document doc = Jsoup.parse("<div title=' Hello '></div>");
        Element element = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, element);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("[title=hello]", evaluator.toString());
    }

    @Test
    public void attributeWithValue_givenQuotedValueInConstructor_shouldStripQuotes() {
        // Arrange
        Evaluator.AttributeWithValue evalDouble = new Evaluator.AttributeWithValue("title", "\"world\"");
        Evaluator.AttributeWithValue evalSingle = new Evaluator.AttributeWithValue("title", "'world'");
        Document doc = Jsoup.parse("<div title='world'></div>");
        Element element = doc.select("div").first();

        // Act & Assert
        Assert.assertTrue(evalDouble.matches(doc, element));
        Assert.assertTrue(evalSingle.matches(doc, element));
        Assert.assertEquals("[title=world]", evalDouble.toString());
    }

    @Test
    public void attributeWithValue_givenMissingAttributeOrMismatch_shouldReturnFalse() {
        // Arrange
        Evaluator.AttributeWithValue evaluator = new Evaluator.AttributeWithValue("title", "world");
        Document doc = Jsoup.parse("<div title='different'></div><span id='noattr'></span>");
        Element elem1 = doc.select("div").first();
        Element elem2 = doc.select("span").first();

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, elem1));
        Assert.assertFalse(evaluator.matches(doc, elem2));
    }

    @Test
    public void attributeWithValueNot_givenDifferentValueOrMissingAttr_shouldReturnTrue() {
        // Arrange
        Evaluator.AttributeWithValueNot evaluator = new Evaluator.AttributeWithValueNot("type", "submit");
        Document doc = Jsoup.parse("<input type='button'/><input id='no-type'/>");
        Element btn = doc.select("input[type=button]").first();
        Element noType = doc.select("#no-type").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, btn));
        Assert.assertTrue(evaluator.matches(doc, noType));
        Assert.assertEquals("[type!=submit]", evaluator.toString());
    }

    @Test
    public void attributeWithValueNot_givenExactMatch_shouldReturnFalse() {
        // Arrange
        Evaluator.AttributeWithValueNot evaluator = new Evaluator.AttributeWithValueNot("type", "submit");
        Document doc = Jsoup.parse("<input type='SUBMIT'/>");
        Element input = doc.select("input").first();

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, input));
    }

    @Test
    public void attributeWithValueStarting_givenPrefixMatch_shouldReturnTrue() {
        // Arrange
        Evaluator.AttributeWithValueStarting evaluator = new Evaluator.AttributeWithValueStarting("href", "https");
        Document doc = Jsoup.parse("<a href='HTTPS://example.com'></a>");
        Element link = doc.select("a").first();

        // Act
        boolean result = evaluator.matches(doc, link);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("[href^=https]", evaluator.toString());
    }

    @Test
    public void attributeWithValueStarting_givenMismatchOrMissing_shouldReturnFalse() {
        // Arrange
        Evaluator.AttributeWithValueStarting evaluator = new Evaluator.AttributeWithValueStarting("href", "https");
        Document doc = Jsoup.parse("<a href='http://example.com'></a><a></a>");
        Element mismatch = doc.select("a").get(0);
        Element missing = doc.select("a").get(1);

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, mismatch));
        Assert.assertFalse(evaluator.matches(doc, missing));
    }

    @Test
    public void attributeWithValueEnding_givenSuffixMatch_shouldReturnTrue() {
        // Arrange
        Evaluator.AttributeWithValueEnding evaluator = new Evaluator.AttributeWithValueEnding("src", ".png");
        Document doc = Jsoup.parse("<img src='PHOTO.PNG'/>");
        Element img = doc.select("img").first();

        // Act
        boolean result = evaluator.matches(doc, img);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("[src$=.png]", evaluator.toString());
    }

    @Test
    public void attributeWithValueEnding_givenMismatchOrMissing_shouldReturnFalse() {
        // Arrange
        Evaluator.AttributeWithValueEnding evaluator = new Evaluator.AttributeWithValueEnding("src", ".png");
        Document doc = Jsoup.parse("<img src='photo.jpg'/><img>");
        Element mismatch = doc.select("img").get(0);
        Element missing = doc.select("img").get(1);

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, mismatch));
        Assert.assertFalse(evaluator.matches(doc, missing));
    }

    @Test
    public void attributeWithValueContaining_givenSubstrMatch_shouldReturnTrue() {
        // Arrange
        Evaluator.AttributeWithValueContaining evaluator = new Evaluator.AttributeWithValueContaining("class", "card");
        Document doc = Jsoup.parse("<div class='MY-CARD-WRAPPER'></div>");
        Element div = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, div);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("[class*=card]", evaluator.toString());
    }

    @Test
    public void attributeWithValueContaining_givenMismatchOrMissing_shouldReturnFalse() {
        // Arrange
        Evaluator.AttributeWithValueContaining evaluator = new Evaluator.AttributeWithValueContaining("class", "card");
        Document doc = Jsoup.parse("<div class='box'></div><div></div>");
        Element mismatch = doc.select("div").get(0);
        Element missing = doc.select("div").get(1);

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, mismatch));
        Assert.assertFalse(evaluator.matches(doc, missing));
    }

    @Test
    public void attributeWithValueMatching_givenRegexMatch_shouldReturnTrue() {
        // Arrange
        Pattern pattern = Pattern.compile("^IMG_\\d+$");
        Evaluator.AttributeWithValueMatching evaluator = new Evaluator.AttributeWithValueMatching("id", pattern);
        Document doc = Jsoup.parse("<div id='IMG_123'></div>");
        Element div = doc.select("div").first();

        // Act
        boolean result = evaluator.matches(doc, div);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("[id~=" + pattern.toString() + "]", evaluator.toString());
    }

    @Test
    public void attributeWithValueMatching_givenRegexMismatchOrMissing_shouldReturnFalse() {
        // Arrange
        Pattern pattern = Pattern.compile("^IMG_\\d+$");
        Evaluator.AttributeWithValueMatching evaluator = new Evaluator.AttributeWithValueMatching("id", pattern);
        Document doc = Jsoup.parse("<div id='TEST_123'></div><div></div>");
        Element mismatch = doc.select("div").get(0);
        Element missing = doc.select("div").get(1);

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, mismatch));
        Assert.assertFalse(evaluator.matches(doc, missing));
    }

    @Test(expected = IllegalArgumentException.class)
    public void attributeKeyPair_givenNullKey_shouldThrowException() {
        new Evaluator.AttributeWithValue(null, "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void attributeKeyPair_givenEmptyKey_shouldThrowException() {
        new Evaluator.AttributeWithValue("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void attributeKeyPair_givenNullValue_shouldThrowException() {
        new Evaluator.AttributeWithValue("key", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void attributeKeyPair_givenEmptyValue_shouldThrowException() {
        new Evaluator.AttributeWithValue("key", "");
    }

    @Test
    public void allElements_shouldAlwaysReturnTrue() {
        // Arrange
        Evaluator.AllElements evaluator = new Evaluator.AllElements();
        Document doc = Jsoup.parse("<div><p>text</p></div>");
        Element div = doc.select("div").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, div));
        Assert.assertEquals("*", evaluator.toString());
    }

    @Test
    public void indexLessThan_givenIndexLowerThanTarget_shouldReturnTrue() {
        // Arrange
        Evaluator.IndexLessThan evaluator = new Evaluator.IndexLessThan(2);
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li></ul>");
        Element li0 = doc.select("li").get(0);
        Element li1 = doc.select("li").get(1);
        Element li2 = doc.select("li").get(2);

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, li0));
        Assert.assertTrue(evaluator.matches(doc, li1));
        Assert.assertFalse(evaluator.matches(doc, li2));
        Assert.assertFalse(evaluator.matches(li0, li0)); // root == element branch
        Assert.assertEquals(":lt(2)", evaluator.toString());
    }

    @Test
    public void indexGreaterThan_givenIndexGreaterThanTarget_shouldReturnTrue() {
        // Arrange
        Evaluator.IndexGreaterThan evaluator = new Evaluator.IndexGreaterThan(1);
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li></ul>");
        Element li0 = doc.select("li").get(0);
        Element li1 = doc.select("li").get(1);
        Element li2 = doc.select("li").get(2);

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, li0));
        Assert.assertFalse(evaluator.matches(doc, li1));
        Assert.assertTrue(evaluator.matches(doc, li2));
        Assert.assertEquals(":gt(1)", evaluator.toString());
    }

    @Test
    public void indexEquals_givenEqualIndex_shouldReturnTrue() {
        // Arrange
        Evaluator.IndexEquals evaluator = new Evaluator.IndexEquals(1);
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li></ul>");
        Element li0 = doc.select("li").get(0);
        Element li1 = doc.select("li").get(1);

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, li0));
        Assert.assertTrue(evaluator.matches(doc, li1));
        Assert.assertEquals(":eq(1)", evaluator.toString());
    }

    @Test
    public void isLastChild_givenLastChildElement_shouldReturnTrue() {
        // Arrange
        Evaluator.IsLastChild evaluator = new Evaluator.IsLastChild();
        Document doc = Jsoup.parse("<div><span>1</span><span>2</span></div>");
        Element first = doc.select("span").get(0);
        Element last = doc.select("span").get(1);

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, first));
        Assert.assertTrue(evaluator.matches(doc, last));
        Assert.assertEquals(":last-child", evaluator.toString());
    }

    @Test
    public void isLastChild_givenParentIsDocumentOrNull_shouldReturnFalse() {
        // Arrange
        Evaluator.IsLastChild evaluator = new Evaluator.IsLastChild();
        Document doc = Jsoup.parse("<html><body></body></html>");
        Element html = doc.child(0);
        Element orphan = new Element(Tag.valueOf("div"), "");

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, html));
        Assert.assertFalse(evaluator.matches(null, orphan));
    }

    @Test
    public void isFirstChild_givenFirstChildElement_shouldReturnTrue() {
        // Arrange
        Evaluator.IsFirstChild evaluator = new Evaluator.IsFirstChild();
        Document doc = Jsoup.parse("<div><span>1</span><span>2</span></div>");
        Element first = doc.select("span").get(0);
        Element second = doc.select("span").get(1);

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, first));
        Assert.assertFalse(evaluator.matches(doc, second));
        Assert.assertEquals(":first-child", evaluator.toString());
    }

    @Test
    public void isFirstChild_givenParentIsDocumentOrNull_shouldReturnFalse() {
        // Arrange
        Evaluator.IsFirstChild evaluator = new Evaluator.IsFirstChild();
        Document doc = Jsoup.parse("<html><body></body></html>");
        Element orphan = new Element(Tag.valueOf("div"), "");

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, doc.child(0)));
        Assert.assertFalse(evaluator.matches(null, orphan));
    }

    @Test
    public void isFirstOfType_givenFirstElementOfType_shouldReturnTrue() {
        // Arrange
        Evaluator.IsFirstOfType evaluator = new Evaluator.IsFirstOfType();
        Document doc = Jsoup.parse("<div><p>p1</p><span>s1</span><p>p2</p></div>");
        Element p1 = doc.select("p").get(0);
        Element p2 = doc.select("p").get(1);
        Element s1 = doc.select("span").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, p1));
        Assert.assertTrue(evaluator.matches(doc, s1));
        Assert.assertFalse(evaluator.matches(doc, p2));
        Assert.assertEquals(":first-of-type", evaluator.toString());
    }

    @Test
    public void isLastOfType_givenLastElementOfType_shouldReturnTrue() {
        // Arrange
        Evaluator.IsLastOfType evaluator = new Evaluator.IsLastOfType();
        Document doc = Jsoup.parse("<div><p>p1</p><span>s1</span><p>p2</p></div>");
        Element p1 = doc.select("p").get(0);
        Element p2 = doc.select("p").get(1);
        Element s1 = doc.select("span").first();

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, p1));
        Assert.assertTrue(evaluator.matches(doc, p2));
        Assert.assertTrue(evaluator.matches(doc, s1));
        Assert.assertEquals(":last-of-type", evaluator.toString());
    }

    @Test
    public void isNthChild_givenPositions_shouldMatchFormula() {
        // Formula: 2n+1 -> 1st, 3rd child
        Evaluator.IsNthChild evaluator = new Evaluator.IsNthChild(2, 1);
        Document doc = Jsoup.parse("<div><span>1</span><span>2</span><span>3</span><span>4</span></div>");
        Element s1 = doc.select("span").get(0);
        Element s2 = doc.select("span").get(1);
        Element s3 = doc.select("span").get(2);
        Element s4 = doc.select("span").get(3);

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, s1));
        Assert.assertFalse(evaluator.matches(doc, s2));
        Assert.assertTrue(evaluator.matches(doc, s3));
        Assert.assertFalse(evaluator.matches(doc, s4));
        Assert.assertEquals(":nth-child(2n+1)", evaluator.toString());
    }

    @Test
    public void isNthChild_givenZeroA_shouldMatchExactPosition() {
        // Formula: a = 0, b = 2 -> 2nd child
        Evaluator.IsNthChild evaluator = new Evaluator.IsNthChild(0, 2);
        Document doc = Jsoup.parse("<div><span>1</span><span>2</span><span>3</span></div>");
        Element s1 = doc.select("span").get(0);
        Element s2 = doc.select("span").get(1);

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, s1));
        Assert.assertTrue(evaluator.matches(doc, s2));
        Assert.assertEquals(":nth-child(2)", evaluator.toString());
    }

    @Test
    public void isNthChild_givenZeroB_shouldFormatWithoutOffset() {
        Evaluator.IsNthChild evaluator = new Evaluator.IsNthChild(2, 0);
        Assert.assertEquals(":nth-child(2n)", evaluator.toString());
    }

    @Test
    public void isNthChild_givenNegativeStepOrDirection_shouldCoverArithmeticBranches() {
        // Formula: -2n+5 -> pos <= 5, (pos-5) % -2 == 0 -> pos=5, pos=3, pos=1
        Evaluator.IsNthChild evaluator = new Evaluator.IsNthChild(-2, 5);
        Document doc = Jsoup.parse("<div><span>1</span><span>2</span><span>3</span><span>4</span><span>5</span><span>6</span></div>");
        Element s3 = doc.select("span").get(2); // pos 3: (3-5)*(-2) = 4 >= 0, -2 % -2 == 0 -> true
        Element s6 = doc.select("span").get(5); // pos 6: (6-5)*(-2) = -2 < 0 -> false

        Assert.assertTrue(evaluator.matches(doc, s3));
        Assert.assertFalse(evaluator.matches(doc, s6));
        Assert.assertEquals(":nth-child(-2n+5)", evaluator.toString());
    }

    @Test
    public void isNthChild_givenParentIsDocumentOrNull_shouldReturnFalse() {
        Evaluator.IsNthChild evaluator = new Evaluator.IsNthChild(1, 1);
        Document doc = Jsoup.parse("<html><body></body></html>");
        Element orphan = new Element(Tag.valueOf("div"), "");

        Assert.assertFalse(evaluator.matches(doc, doc.child(0)));
        Assert.assertFalse(evaluator.matches(null, orphan));
    }

    @Test
    public void isNthLastChild_givenMatchingPosition_shouldReturnTrue() {
        // a=0, b=1 -> last child
        Evaluator.IsNthLastChild evaluator = new Evaluator.IsNthLastChild(0, 1);
        Document doc = Jsoup.parse("<div><span>1</span><span>2</span></div>");
        Element s1 = doc.select("span").get(0);
        Element s2 = doc.select("span").get(1);

        Assert.assertFalse(evaluator.matches(doc, s1));
        Assert.assertTrue(evaluator.matches(doc, s2));
        Assert.assertEquals(":nth-last-child(1)", evaluator.toString());
    }

    @Test
    public void isNthOfType_givenMatchingPosition_shouldReturnTrue() {
        // 2nd paragraph: a=0, b=2
        Evaluator.IsNthOfType evaluator = new Evaluator.IsNthOfType(0, 2);
        Document doc = Jsoup.parse("<div><p>1</p><span>a</span><p>2</p></div>");
        Element p1 = doc.select("p").get(0);
        Element p2 = doc.select("p").get(1);

        Assert.assertFalse(evaluator.matches(doc, p1));
        Assert.assertTrue(evaluator.matches(doc, p2));
        Assert.assertEquals(":nth-of-type(2)", evaluator.toString());
    }

    @Test
    public void isNthLastOfType_givenMatchingPosition_shouldReturnTrue() {
        // 2nd from last paragraph: a=0, b=2
        Evaluator.IsNthLastOfType evaluator = new Evaluator.IsNthLastOfType(0, 2);
        Document doc = Jsoup.parse("<div><p>1</p><span>a</span><p>2</p><p>3</p></div>");
        Element p1 = doc.select("p").get(0);
        Element p2 = doc.select("p").get(1);
        Element p3 = doc.select("p").get(2);

        Assert.assertFalse(evaluator.matches(doc, p1));
        Assert.assertTrue(evaluator.matches(doc, p2));
        Assert.assertFalse(evaluator.matches(doc, p3));
        Assert.assertEquals(":nth-last-of-type(2)", evaluator.toString());
    }

    @Test
    public void isRoot_givenDocumentOrRootElement_shouldMatchRoot() {
        // Arrange
        Evaluator.IsRoot evaluator = new Evaluator.IsRoot();
        Document doc = Jsoup.parse("<html><body><div></div></body></html>");
        Element html = doc.child(0);
        Element div = doc.select("div").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, html));
        Assert.assertFalse(evaluator.matches(doc, div));
        Assert.assertTrue(evaluator.matches(div, div)); // non-document root
        Assert.assertEquals(":root", evaluator.toString());
    }

    @Test
    public void isOnlyChild_givenSingleChild_shouldReturnTrue() {
        // Arrange
        Evaluator.IsOnlyChild evaluator = new Evaluator.IsOnlyChild();
        Document doc = Jsoup.parse("<div><span>one</span></div><ul><li>1</li><li>2</li></ul>");
        Element single = doc.select("span").first();
        Element multiple = doc.select("li").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, single));
        Assert.assertFalse(evaluator.matches(doc, multiple));
        Assert.assertEquals(":only-child", evaluator.toString());
    }

    @Test
    public void isOnlyChild_givenNullParentOrDocumentParent_shouldReturnFalse() {
        Evaluator.IsOnlyChild evaluator = new Evaluator.IsOnlyChild();
        Document doc = Jsoup.parse("<html><body></body></html>");
        Element orphan = new Element(Tag.valueOf("div"), "");

        Assert.assertFalse(evaluator.matches(doc, doc.child(0)));
        Assert.assertFalse(evaluator.matches(null, orphan));
    }

    @Test
    public void isOnlyOfType_givenSingleOfType_shouldReturnTrue() {
        // Arrange
        Evaluator.IsOnlyOfType evaluator = new Evaluator.IsOnlyOfType();
        Document doc = Jsoup.parse("<div><span>one</span><p>p1</p><p>p2</p></div>");
        Element singleSpan = doc.select("span").first();
        Element multiP = doc.select("p").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, singleSpan));
        Assert.assertFalse(evaluator.matches(doc, multiP));
        Assert.assertEquals(":only-of-type", evaluator.toString());
    }

    @Test
    public void isOnlyOfType_givenNullParentOrDocumentParent_shouldReturnFalse() {
        Evaluator.IsOnlyOfType evaluator = new Evaluator.IsOnlyOfType();
        Document doc = Jsoup.parse("<html><body></body></html>");
        Element orphan = new Element(Tag.valueOf("div"), "");

        Assert.assertFalse(evaluator.matches(doc, doc.child(0)));
        Assert.assertFalse(evaluator.matches(null, orphan));
    }

    @Test
    public void isEmpty_givenEmptyOrIgnoredNodes_shouldReturnTrue() {
        // Arrange
        Evaluator.IsEmpty evaluator = new Evaluator.IsEmpty();
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(new Comment("comment", ""));
        div.appendChild(new XmlDeclaration("xml", "", false));
        div.appendChild(new DocumentType("html", "", "", ""));

        // Act & Assert
        Assert.assertTrue(evaluator.matches(null, div));
        Assert.assertEquals(":empty", evaluator.toString());
    }

    @Test
    public void isEmpty_givenTextOrChildElement_shouldReturnFalse() {
        // Arrange
        Evaluator.IsEmpty evaluator = new Evaluator.IsEmpty();
        Element divWithText = new Element(Tag.valueOf("div"), "");
        divWithText.appendChild(new TextNode("hello", ""));

        Element divWithChild = new Element(Tag.valueOf("div"), "");
        divWithChild.appendChild(new Element(Tag.valueOf("span"), ""));

        // Act & Assert
        Assert.assertFalse(evaluator.matches(null, divWithText));
        Assert.assertFalse(evaluator.matches(null, divWithChild));
    }

    @Test
    public void containsText_givenTextContained_shouldReturnTrue() {
        // Arrange
        Evaluator.ContainsText evaluator = new Evaluator.ContainsText("HELLO");
        Document doc = Jsoup.parse("<div><p>Say hello world</p></div>");
        Element div = doc.select("div").first();
        Element p = doc.select("p").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, div));
        Assert.assertTrue(evaluator.matches(doc, p));
        Assert.assertEquals(":contains(hello)", evaluator.toString());
    }

    @Test
    public void containsText_givenTextNotContained_shouldReturnFalse() {
        // Arrange
        Evaluator.ContainsText evaluator = new Evaluator.ContainsText("bye");
        Document doc = Jsoup.parse("<div><p>Say hello world</p></div>");
        Element div = doc.select("div").first();

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, div));
    }

    @Test
    public void containsData_givenDataContained_shouldReturnTrue() {
        // Arrange
        Evaluator.ContainsData evaluator = new Evaluator.ContainsData("var x");
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var x = 10;", ""));

        // Act & Assert
        Assert.assertTrue(evaluator.matches(null, script));
        Assert.assertEquals(":containsData(var x)", evaluator.toString());
    }

    @Test
    public void containsData_givenDataNotContained_shouldReturnFalse() {
        // Arrange
        Evaluator.ContainsData evaluator = new Evaluator.ContainsData("var y");
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var x = 10;", ""));

        // Act & Assert
        Assert.assertFalse(evaluator.matches(null, script));
    }

    @Test
    public void containsOwnText_givenElementWithOwnText_shouldReturnTrue() {
        // Arrange
        Evaluator.ContainsOwnText evaluator = new Evaluator.ContainsOwnText("parent");
        Document doc = Jsoup.parse("<div id='p'>Parent text <span>child text</span></div>");
        Element div = doc.select("#p").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, div));
        Assert.assertEquals(":containsOwn(parent)", evaluator.toString());
    }

    @Test
    public void containsOwnText_givenTextOnlyInChild_shouldReturnFalse() {
        // Arrange
        Evaluator.ContainsOwnText evaluator = new Evaluator.ContainsOwnText("child");
        Document doc = Jsoup.parse("<div id='p'>Parent text <span>child text</span></div>");
        Element div = doc.select("#p").first();

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, div));
    }

    @Test
    public void matches_givenRegexMatch_shouldReturnTrue() {
        // Arrange
        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}");
        Evaluator.Matches evaluator = new Evaluator.Matches(pattern);
        Document doc = Jsoup.parse("<div><span>Call 555-1234 today</span></div>");
        Element div = doc.select("div").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, div));
        Assert.assertEquals(":matches(" + pattern.toString() + ")", evaluator.toString());
    }

    @Test
    public void matches_givenRegexMismatch_shouldReturnFalse() {
        // Arrange
        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}");
        Evaluator.Matches evaluator = new Evaluator.Matches(pattern);
        Document doc = Jsoup.parse("<div><span>No number here</span></div>");
        Element div = doc.select("div").first();

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, div));
    }

    @Test
    public void matchesOwn_givenDirectMatch_shouldReturnTrue() {
        // Arrange
        Pattern pattern = Pattern.compile("^Order:\\s*#\\d+$");
        Evaluator.MatchesOwn evaluator = new Evaluator.MatchesOwn(pattern);
        Document doc = Jsoup.parse("<div>Order: #42<p>Detail</p></div>");
        Element div = doc.select("div").first();

        // Act & Assert
        Assert.assertTrue(evaluator.matches(doc, div));
        Assert.assertEquals(":matchesOwn(" + pattern.toString() + ")", evaluator.toString());
    }

    @Test
    public void matchesOwn_givenMatchOnlyInDescendant_shouldReturnFalse() {
        // Arrange
        Pattern pattern = Pattern.compile("^Detail$");
        Evaluator.MatchesOwn evaluator = new Evaluator.MatchesOwn(pattern);
        Document doc = Jsoup.parse("<div>Order: #42<p>Detail</p></div>");
        Element div = doc.select("div").first();

        // Act & Assert
        Assert.assertFalse(evaluator.matches(doc, div));
    }

    @Test
    public void cssNthEvaluator_singleArgConstructor_shouldSetDefaultAtoZero() {
        Evaluator.CssNthEvaluator evaluator = new Evaluator.IsNthChild(3);
        Assert.assertEquals(":nth-child(3)", evaluator.toString());
    }
}