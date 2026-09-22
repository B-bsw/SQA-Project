包 org.jsoup.safety;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import java.util.List;
import java.util.ArrayList;

public class WhitelistTest {
    private Whitelist whitelist;
    private Element element;

    @Before
    public void setUp() {
        whitelist = new Whitelist();
        element = new Element("a");
    }

    @After
    public void tearDown() {
        whitelist = null;
        element = null;
    }

    @Test
    public void testNone() {
        Whitelist none = Whitelist.none();
        assertNotNull(none);
        assertFalse(none.isSafeTag("p"));
        assertFalse(none.isSafeTag("a"));
    }

    @Test
    public void testSimpleText() {
        Whitelist simpleText = Whitelist.simpleText();
        assertTrue(simpleText.isSafeTag("b"));
        assertTrue(simpleText.isSafeTag("em"));
        assertTrue(simpleText.isSafeTag("strong"));
        assertTrue(simpleText.isSafeTag("u"));
        assertFalse(simpleText.isSafeTag("p"));
        assertFalse(simpleText.isSafeTag("a"));
    }

    @Test
    public void testBasic() {
        Whitelist basic = Whitelist.basic();
        assertTrue(basic.isSafeTag("a"));
        assertTrue(basic.isSafeTag("p"));
        assertTrue(basic.isSafeTag("div"));
        assertFalse(basic.isSafeTag("img"));
        assertFalse(basic.isSafeTag("table"));
        assertTrue(basic.isSafeAttribute("a", new Element("a").attr("href"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void testBasicWithImages() {
        Whitelist basicWithImages = Whitelist.basicWithImages();
        assertTrue(basicWithImages.isSafeTag("img"));
        assertTrue(basicWithImages.isSafeTag("a"));
        assertTrue(basicWithImages.isSafeAttribute("img", new Element("img").attr("src"), new Attribute("src", "http://example.com")));
        assertFalse(basicWithImages.isSafeTag("table"));
    }

    @Test
    public void testRelaxed() {
        Whitelist relaxed = Whitelist.relaxed();
        assertTrue(relaxed.isSafeTag("div"));
        assertTrue(relaxed.isSafeTag("table"));
        assertTrue(relaxed.isSafeTag("img"));
        assertTrue(relaxed.isSafeAttribute("a", new Element("a").attr("href"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void testAddTags_Valid() {
        Whitelist result = whitelist.addTags("p", "span");
        assertSame(whitelist, result);
        assertTrue(whitelist.isSafeTag("p"));
        assertTrue(whitelist.isSafeTag("span"));
    }

    @Test
    public void testAddTags_Null() {
        try {
            whitelist.addTags(null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddTags_EmptyString() {
        try {
            whitelist.addTags("");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddAttributes_Tag_Valid() {
        whitelist.addTags("a");
        Whitelist result = whitelist.addAttributes("a", "href", "title");
        assertSame(whitelist, result);
        Element a = new Element("a");
        assertTrue(whitelist.isSafeAttribute("a", a.attr("href"), new Attribute("href", "value")));
        assertTrue(whitelist.isSafeAttribute("a", a.attr("title"), new Attribute("title", "value")));
    }

    @Test
    public void testAddAttributes_Tag_All() {
        whitelist.addTags("p");
        whitelist.addAttributes(":all", "class");
        Element p = new Element("p");
        assertTrue(whitelist.isSafeAttribute("p", p.attr("class"), new Attribute("class", "test")));
    }

    @Test
    public void testAddAttributes_NullTag() {
        try {
            whitelist.addAttributes(null, "href");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddAttributes_NullKeys() {
        try {
            whitelist.addAttributes("a", (String[]) null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddEnforcedAttribute_Valid() {
        whitelist.addTags("a");
        Whitelist result = whitelist.addEnforcedAttribute("a", "rel", "nofollow");
        assertSame(whitelist, result);
        Element a = new Element("a");
        a.attr("href", "http://example.com");
        assertEquals("nofollow", whitelist.getEnforcedAttributes("a", a).get("rel"));
    }

    @Test
    public void testAddEnforcedAttribute_NullValue() {
        try {
            whitelist.addEnforcedAttribute("a", "rel", null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddProtocols_Valid() {
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        Whitelist result = whitelist.addProtocols("a", "href", "http", "https");
        assertSame(whitelist, result);
        Element a = new Element("a");
        a.attr("href", "http://example.com");
        assertTrue(whitelist.isSafeAttribute("a", a.attr("href"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void testAddProtocols_NullTag() {
        try {
            whitelist.addProtocols(null, "href", "http");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPreserveRelativeLinks_True() {
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        whitelist.preserveRelativeLinks(true);
        Element a = new Element("a");
        a.attr("href", "/relative/path");
        assertTrue(whitelist.isSafeAttribute("a", a.attr("href"), new Attribute("href", "/relative/path")));
    }

    @Test
    public void testPreserveRelativeLinks_False() {
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http");
        whitelist.preserveRelativeLinks(false);
        Element a = new Element("a");
        a.attr("href", "/relative/path");
        assertFalse(whitelist.isSafeAttribute("a", a.attr("href"), new Attribute("href", "/relative/path")));
    }

    @Test
    public void testGetEnforcedAttributes_Tag_NotInMap() {
        whitelist.addTags("p");
        Attributes attrs = whitelist.getEnforcedAttributes("p", new Element("p"));
        assertNotNull(attrs);
        assertEquals(0, attrs.size());
    }

    @Test
    public void testGetEnforcedAttributes_Tag_InMap() {
        whitelist.addTags("a");
        whitelist.addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attrs = whitelist.getEnforcedAttributes("a", new Element("a"));
        assertNotNull(attrs);
        assertEquals(1, attrs.size());
        assertEquals("nofollow", attrs.get("rel"));
    }

    @Test
    public void testIsSafeTag_NullTag() {
        assertFalse(whitelist.isSafeTag(null));
    }

    @Test
    public void testIsSafeTag_EmptyTag() {
        assertFalse(whitelist.isSafeTag(""));
    }

    @Test
    public void testIsSafeAttribute_NoProtocols() {
        whitelist.addTags("p");
        whitelist.addAttributes("p", "class");
        Element p = new Element("p");
        assertTrue(whitelist.isSafeAttribute("p", p.attr("class"), new Attribute("class", "test")));
    }

    @Test
    public void testIsSafeAttribute_ProtocolNotMatching() {
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http");
        Element a = new Element("a");
        assertFalse(whitelist.isSafeAttribute("a", a.attr("href"), new Attribute("href", "javascript:alert(1)")));
    }

    @Test
    public void testIsSafeAttribute_ProtocolMatching() {
        whitelist.addTags("a");
        whitelist.addAttributes("a", "href");
        whitelist.addProtocols("a", "href", "http");
        Element a = new Element("a");
        assertTrue(whitelist.isSafeAttribute("a", a.attr("href"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void testAddTags_Chaining() {
        whitelist.addTags("p").addTags("span").addTags("div");
        assertTrue(whitelist.isSafeTag("p"));
        assertTrue(whitelist.isSafeTag("span"));
        assertTrue(whitelist.isSafeTag("div"));
    }

    @Test
    public void testAddAttributes_Chaining() {
        whitelist.addTags("a").addAttributes("a", "href").addAttributes("a", "title");
        Element a = new Element("a");
        assertTrue(whitelist.isSafeAttribute("a", a.attr("href"), new Attribute("href", "value")));
        assertTrue(whitelist.isSafeAttribute("a", a.attr("title"), new Attribute("title", "value")));
    }

    @Test
    public void testToString() {
        Whitelist.TypedValue value = Whitelist.TagName.valueOf("test");
        assertEquals("test", value.toString());
    }

    @Test
    public void testEquals_SameObject() {
        Whitelist.TypedValue value = Whitelist.TagName.valueOf("test");
        assertTrue(value.equals(value));
    }

    @Test
    public void testEquals_NullObject() {
        Whitelist.TypedValue value = Whitelist.TagName.valueOf("test");
        assertFalse(value.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() {
        Whitelist.TypedValue value = Whitelist.TagName.valueOf("test");
        assertFalse(value.equals("test"));
    }

    @Test
    public void testEquals_SameValue() {
        Whitelist.TypedValue value1 = Whitelist.TagName.valueOf("test");
        Whitelist.TypedValue value2 = Whitelist.TagName.valueOf("test");
        assertTrue(value1.equals(value2));
    }

    @Test
    public void testEquals_DifferentValue() {
        Whitelist.TypedValue value1 = Whitelist.TagName.valueOf("test1");
        Whitelist.TypedValue value2 = Whitelist.TagName.valueOf("test2");
        assertFalse(value1.equals(value2));
    }

    @Test
    public void testHashCode_SameValue() {
        Whitelist.TypedValue value1 = Whitelist.TagName.valueOf("test");
        Whitelist.TypedValue value2 = Whitelist.TagName.valueOf("test");
        assertEquals(value1.hashCode(), value2.hashCode());
    }
}