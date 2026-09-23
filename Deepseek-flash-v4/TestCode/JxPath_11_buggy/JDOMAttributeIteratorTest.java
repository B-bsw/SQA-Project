package org.apache.commons.jxpath.ri.model.jdom;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JDOMAttributeIteratorTest {

    private Element element;
    private NodePointer parent;

    @Before
    public void setUp() {
        element = new Element("testElement");
        parent = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(element, null, null);
    }

    @After
    public void tearDown() {
        element = null;
        parent = null;
    }

    @Test
    public void testConstructorNonElementParent() {
        NodePointer nonElementParent = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(new Object(), null, null);
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(nonElementParent, new QName("test"));
        assertNotNull(iterator.getNodePointer());
        assertNull(iterator.getNodePointer().getNode());
    }

    @Test
    public void testConstructorNullPrefixAndWildcardName() {
        element.setAttribute("attr1", "value1");
        element.setAttribute("attr2", "value2");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("*"));
        assertTrue(iterator.setPosition(1));
        assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testConstructorNullPrefixAndSpecificName() {
        element.setAttribute("attr1", "value1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("attr1"));
        assertTrue(iterator.setPosition(1));
        assertEquals("attr1", ((Attribute) ((JDOMAttributePointer) iterator.getNodePointer()).getNode()).getName());
    }

    @Test
    public void testConstructorWithPrefixAndNamespace() {
        Namespace ns = Namespace.getNamespace("prefix", "http://example.com");
        element.addNamespaceDeclaration(ns);
        element.setAttribute("attr1", "value1", ns);
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("prefix", "attr1"));
        assertTrue(iterator.setPosition(1));
        assertEquals("value1", ((Attribute) ((JDOMAttributePointer) iterator.getNodePointer()).getNode()).getValue());
    }

    @Test
    public void testConstructorWithPrefixButNoMatchingNamespace() {
        element.setAttribute("attr1", "value1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("nonexistent", "attr1"));
        assertNull(iterator.getNodePointer());
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testConstructorWithXmlPrefix() {
        element.setAttribute("xml:lang", "en");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("xml", "lang"));
        assertTrue(iterator.setPosition(1));
        assertEquals("en", ((Attribute) ((JDOMAttributePointer) iterator.getNodePointer()).getNode()).getValue());
    }

    @Test
    public void testWildcardWithNamespace() {
        Namespace ns = Namespace.getNamespace("prefix", "http://example.com");
        element.addNamespaceDeclaration(ns);
        element.setAttribute("attr1", "value1", ns);
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("prefix", "*"));
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testGetPositionInitiallyZero() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("nonexistent"));
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testSetPositionWithNullAttributes() {
        element.setAttribute("attr1", "value1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("nonexistent"));
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testSetPositionOutsideRange() {
        element.setAttribute("attr1", "value1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("attr1"));
        assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testGetNodePointerWhenPositionNotSet() {
        element.setAttribute("attr1", "value1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("attr1"));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertTrue(pointer instanceof JDOMAttributePointer);
    }

    @Test
    public void testGetNodePointerWithNullAttributes() {
        element.setAttribute("attr1", "value1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("nonexistent"));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructorWithNullParent() {
        try {
            new JDOMAttributeIterator(null, new QName("test"));
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithNullName() {
        try {
            new JDOMAttributeIterator(parent, null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testEmptyAttributesList() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("attr1"));
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testGetNodePointerWithNegativePosition() {
        element.setAttribute("attr1", "value1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("attr1"));
        iterator.setPosition(1);
        iterator.setPosition(0);
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
    }

    @Test
    public void testVersion() {
        // The source code does not define a getVersion method, but this is a placeholder for potential future tests.
        assertTrue(true);
    }
}