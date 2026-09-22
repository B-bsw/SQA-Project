package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class WhitelistTest {

    @Test
    public void none_givenDefault_shouldAllowNoTags() {
        Whitelist whitelist = Whitelist.none();
        Assert.assertFalse(whitelist.isSafeTag("p"));
        Assert.assertFalse(whitelist.isSafeTag("b"));
        Assert.assertFalse(whitelist.isSafeTag("a"));
    }

    @Test
    public void simpleText_givenDefault_shouldAllowSimpleFormattingTagsOnly() {
        Whitelist whitelist = Whitelist.simpleText();
        Assert.assertTrue(whitelist.isSafeTag("b"));
        Assert.assertTrue(whitelist.isSafeTag("em"));
        Assert.assertTrue(whitelist.isSafeTag("i"));
        Assert.assertTrue(whitelist.isSafeTag("strong"));
        Assert.assertTrue(whitelist.isSafeTag("u"));
        Assert.assertFalse(whitelist.isSafeTag("p"));
        Assert.assertFalse(whitelist.isSafeTag("a"));
    }

    @Test
    public void basic_givenDefault_shouldAllowTextTagsAndEnforceNofollowOnLinks() {
        Whitelist whitelist = Whitelist.basic();
        Assert.assertTrue(whitelist.isSafeTag("a"));
        Assert.assertTrue(whitelist.isSafeTag("blockquote"));
        Assert.assertTrue(whitelist.isSafeTag("p"));
        Assert.assertTrue(whitelist.isSafeTag("ul"));
        Assert.assertFalse(whitelist.isSafeTag("img"));

        Attributes enforced = whitelist.getEnforcedAttributes("a");
        Assert.assertEquals("nofollow", enforced.get("rel"));

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "http://example.com/test");
        Attribute validAttr = new Attribute("href", "http://example.com/test");
        Assert.assertTrue(whitelist.isSafeAttribute("a", el, validAttr));

        Element elBad = new Element(Tag.valueOf("a"), "http://example.com/");
        elBad.attr("href", "javascript:alert(1)");
        Attribute invalidAttr = new Attribute("href", "javascript:alert(1)");
        Assert.assertFalse(whitelist.isSafeAttribute("a", elBad, invalidAttr));
    }

    @Test
    public void basicWithImages_givenDefault_shouldAllowImageTagsAndProtocols() {
        Whitelist whitelist = Whitelist.basicWithImages();
        Assert.assertTrue(whitelist.isSafeTag("img"));
        Assert.assertTrue(whitelist.isSafeTag("a"));

        Element elImg = new Element(Tag.valueOf("img"), "http://example.com/");
        elImg.attr("src", "https://example.com/pic.jpg");
        Attribute validSrc = new Attribute("src", "https://example.com/pic.jpg");
        Assert.assertTrue(whitelist.isSafeAttribute("img", elImg, validSrc));

        Element elImgBad = new Element(Tag.valueOf("img"), "http://example.com/");
        elImgBad.attr("src", "ftp://example.com/pic.jpg");
        Attribute invalidSrc = new Attribute("src", "ftp://example.com/pic.jpg");
        Assert.assertFalse(whitelist.isSafeAttribute("img", elImgBad, invalidSrc));
    }

    @Test
    public void relaxed_givenDefault_shouldAllowTablesAndHeadingsWithoutEnforcedNofollow() {
        Whitelist whitelist = Whitelist.relaxed();
        Assert.assertTrue(whitelist.isSafeTag("table"));
        Assert.assertTrue(whitelist.isSafeTag("h1"));
        Assert.assertTrue(whitelist.isSafeTag("div"));

        Attributes enforced = whitelist.getEnforcedAttributes("a");
        Assert.assertFalse(enforced.hasKey("rel"));
    }

    @Test
    public void addTags_givenValidTagNames_shouldAllowThoseTags() {
        Whitelist whitelist = new Whitelist();
        Assert.assertFalse(whitelist.isSafeTag("custom"));

        whitelist.addTags("custom", "section");
        Assert.assertTrue(whitelist.isSafeTag("custom"));
        Assert.assertTrue(whitelist.isSafeTag("section"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addTags_givenNullArray_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addTags_givenEmptyTag_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("p", "");
    }

    @Test
    public void addAttributes_givenValidAttributes_shouldAllowAttributesForTag() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("p");
        whitelist.addAttributes("p", "class", "id");

        Element el = new Element(Tag.valueOf("p"), "http://example.com/");
        Attribute classAttr = new Attribute("class", "lead");
        Attribute idAttr = new Attribute("id", "intro");
        Attribute styleAttr = new Attribute("style", "color:red");

        Assert.assertTrue(whitelist.isSafeAttribute("p", el, classAttr));
        Assert.assertTrue(whitelist.isSafeAttribute("p", el, idAttr));
        Assert.assertFalse(whitelist.isSafeAttribute("p", el, styleAttr));
    }

    @Test
    public void addAttributes_givenExistingTagAttributes_shouldAppendAttributes() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("p");
        whitelist.addAttributes("p", "class");
        whitelist.addAttributes("p", "title");

        Element el = new Element(Tag.valueOf("p"), "http://example.com/");
        Assert.assertTrue(whitelist.isSafeAttribute("p", el, new Attribute("class", "lead")));
        Assert.assertTrue(whitelist.isSafeAttribute("p", el, new Attribute("title", "headline")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAttributes_givenNullTag_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes(null, "class");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAttributes_givenEmptyTag_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("", "class");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAttributes_givenNullKeys_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("p", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAttributes_givenEmptyKeyInList_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("p", "class", "");
    }

    @Test
    public void addAttributes_givenPseudoTagAll_shouldApplyToAllTags() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("div", "p");
        whitelist.addAttributes(":all", "class");

        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        Element p = new Element(Tag.valueOf("p"), "http://example.com/");

        Assert.assertTrue(whitelist.isSafeAttribute("div", div, new Attribute("class", "wrapper")));
        Assert.assertTrue(whitelist.isSafeAttribute("p", p, new Attribute("class", "content")));
        Assert.assertFalse(whitelist.isSafeAttribute("div", div, new Attribute("id", "wrapper")));
        Assert.assertFalse(whitelist.isSafeAttribute(":all", div, new Attribute("class", "wrapper")));
    }

    @Test
    public void addEnforcedAttribute_givenNewAndExistingKeys_shouldEnforceAttributes() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("a");
        whitelist.addEnforcedAttribute("a", "rel", "nofollow");
        whitelist.addEnforcedAttribute("a", "target", "_blank");

        Attributes enforced = whitelist.getEnforcedAttributes("a");
        Assert.assertEquals("nofollow", enforced.get("rel"));
        Assert.assertEquals("_blank", enforced.get("target"));

        Attributes nonExistent = whitelist.getEnforcedAttributes("div");
        Assert.assertNotNull(nonExistent);
        Assert.assertEquals(0, nonExistent.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEnforcedAttribute_givenEmptyTag_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("", "rel", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEnforcedAttribute_givenEmptyKey_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("a", "", "nofollow");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEnforcedAttribute_givenEmptyValue_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("a", "rel", "");
    }

    @Test
    public void preserveRelativeLinks_givenTrue_shouldKeepOriginalRelativeUrl() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http", "https");
        whitelist.preserveRelativeLinks(true);

        Element el = new Element(Tag.valueOf("a"), "http://example.com/base/");
        el.attr("href", "relative/path.html");
        Attribute attr = new Attribute("href", "relative/path.html");

        boolean isSafe = whitelist.isSafeAttribute("a", el, attr);
        Assert.assertTrue(isSafe);
        Assert.assertEquals("relative/path.html", attr.getValue());
    }

    @Test
    public void preserveRelativeLinks_givenFalse_shouldUpdateAttributeToAbsoluteUrl() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http", "https");
        whitelist.preserveRelativeLinks(false);

        Element el = new Element(Tag.valueOf("a"), "http://example.com/base/");
        el.attr("href", "relative/path.html");
        Attribute attr = new Attribute("href", "relative/path.html");

        boolean isSafe = whitelist.isSafeAttribute("a", el, attr);
        Assert.assertTrue(isSafe);
        Assert.assertEquals("http://example.com/base/relative/path.html", attr.getValue());
    }

    @Test
    public void addProtocols_givenMultipleProtocols_shouldSupportAllConfiguredProtocols() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http", "https");
        whitelist.addProtocols("a", "href", "custom");

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");

        el.attr("href", "http://example.com");
        Assert.assertTrue(whitelist.isSafeAttribute("a", el, new Attribute("href", "http://example.com")));

        el.attr("href", "https://example.com");
        Assert.assertTrue(whitelist.isSafeAttribute("a", el, new Attribute("href", "https://example.com")));

        el.attr("href", "custom://domain");
        Assert.assertTrue(whitelist.isSafeAttribute("a", el, new Attribute("href", "custom://domain")));

        el.attr("href", "ftp://example.com");
        Assert.assertFalse(whitelist.isSafeAttribute("a", el, new Attribute("href", "ftp://example.com")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addProtocols_givenEmptyTag_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("", "href", "http");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addProtocols_givenEmptyKey_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("a", "", "http");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addProtocols_givenNullProtocols_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("a", "href", (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addProtocols_givenEmptyProtocolItem_shouldThrowException() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("a", "href", "http", "");
    }

    @Test
    public void isSafeAttribute_givenTagHasProtocolsForOtherKey_shouldAllowKeyWithoutProtocols() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href", "title");
        whitelist.addProtocols("a", "href", "http");

        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("title", "tooltip");
        Attribute titleAttr = new Attribute("title", "tooltip");

        Assert.assertTrue(whitelist.isSafeAttribute("a", el, titleAttr));
    }

    @Test
    public void isSafeAttribute_givenRelativeUrlWithNoBaseUri_shouldDenyAttribute() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http");

        Element el = new Element(Tag.valueOf("a"), "");
        el.attr("href", "page.html");
        Attribute attr = new Attribute("href", "page.html");

        Assert.assertFalse(whitelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void isSafeAttribute_givenAttributeNotConfiguredForTagOrAll_shouldReturnFalse() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("span");

        Element el = new Element(Tag.valueOf("span"), "http://example.com/");
        Attribute attr = new Attribute("style", "color:red;");

        Assert.assertFalse(whitelist.isSafeAttribute("span", el, attr));
    }

    @Test
    public void typedValue_givenSameAndDifferentValues_shouldFollowEqualsAndHashCodeContract() {
        Whitelist.TagName tag1 = Whitelist.TagName.valueOf("div");
        Whitelist.TagName tag2 = Whitelist.TagName.valueOf("div");
        Whitelist.TagName tag3 = Whitelist.TagName.valueOf("span");
        Whitelist.AttributeKey key = Whitelist.AttributeKey.valueOf("div");

        Assert.assertTrue(tag1.equals(tag1));
        Assert.assertTrue(tag1.equals(tag2));
        Assert.assertEquals(tag1.hashCode(), tag2.hashCode());
        Assert.assertEquals("div", tag1.toString());

        Assert.assertFalse(tag1.equals(null));
        Assert.assertFalse(tag1.equals("div"));
        Assert.assertFalse(tag1.equals(tag3));
        Assert.assertFalse(tag1.equals(key));
    }

    @Test
    public void attributeValueAndProtocol_givenValues_shouldInstantiateCorrectly() {
        Whitelist.AttributeValue val = Whitelist.AttributeValue.valueOf("val1");
        Whitelist.Protocol prot = Whitelist.Protocol.valueOf("http");

        Assert.assertEquals("val1", val.toString());
        Assert.assertEquals("http", prot.toString());
        Assert.assertFalse(val.equals(prot));
    }
}