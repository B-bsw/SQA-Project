package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ElementsTest {

    @Test
    public void constructor_givenDefaultConstructor_shouldBeEmpty() {
        Elements elements = new Elements();
        Assert.assertTrue(elements.isEmpty());
        Assert.assertEquals(0, elements.size());
    }

    @Test
    public void constructor_givenCollection_shouldContainAllElements() {
        Element el1 = new Element(Tag.valueOf("p"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        Collection<Element> col = new ArrayList<Element>();
        col.add(el1);
        col.add(el2);

        Elements elements = new Elements(col);

        Assert.assertEquals(2, elements.size());
        Assert.assertEquals(el1, elements.get(0));
        Assert.assertEquals(el2, elements.get(1));
    }

    @Test
    public void constructor_givenList_shouldWrapList() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        List<Element> list = new ArrayList<Element>();
        list.add(el1);

        Elements elements = new Elements(list);

        Assert.assertEquals(1, elements.size());
        Assert.assertEquals(el1, elements.get(0));
    }

    @Test
    public void constructor_givenVarargs_shouldContainAllVarargElements() {
        Element el1 = new Element(Tag.valueOf("b"), "");
        Element el2 = new Element(Tag.valueOf("i"), "");

        Elements elements = new Elements(el1, el2);

        Assert.assertEquals(2, elements.size());
        Assert.assertEquals(el1, elements.get(0));
        Assert.assertEquals(el2, elements.get(1));
    }

    @Test
    public void clone_givenElements_shouldProduceDeepCopy() {
        Document doc = Jsoup.parse("<div><p class='first'>One</p><p class='second'>Two</p></div>");
        Elements original = doc.select("p");

        Elements cloned = original.clone();

        Assert.assertEquals(original.size(), cloned.size());
        Assert.assertNotSame(original.get(0), cloned.get(0));
        Assert.assertEquals(original.get(0).outerHtml(), cloned.get(0).outerHtml());

        cloned.get(0).text("Modified");
        Assert.assertFalse(original.get(0).text().equals(cloned.get(0).text()));
    }

    @Test
    public void attr_givenExistingAttributeInFirstElement_shouldReturnValue() {
        Document doc = Jsoup.parse("<div id='div1' title='T1'></div><div id='div2' title='T2'></div>");
        Elements elements = doc.select("div");

        String val = elements.attr("title");

        Assert.assertEquals("T1", val);
    }

    @Test
    public void attr_givenAttributeOnlyInSecondElement_shouldReturnValueFromSecondElement() {
        Document doc = Jsoup.parse("<div id='div1'></div><div id='div