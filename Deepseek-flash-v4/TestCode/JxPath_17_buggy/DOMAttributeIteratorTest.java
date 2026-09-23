package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import org.apache.commons.jxpath.ri.QName;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import javax.xml.parsers.DocumentBuilderFactory;

public class DOMAttributeIteratorTest {

    private Document document;
    private DOMNodePointer parentPointer;
    private Element element;

    @Before
    public void setUp() throws Exception {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        element = document.createElementNS("http://example.com/ns", "prefix:root");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:prefix", "http://example.com/ns");
        element.setAttribute("plain", "value1");
        element.setAttributeNS("http://example.com/ns", "prefix:prefixed", "value2");
        element.setAttribute("xmlns", "http://defaultns");
        parentPointer = new DOMNodePointer(null, null, null) {
            @Override
            public Object getNode() {
                return element;
            }
        };
    }

    @Test
    public void testConstructorWithSpecificAttributeName() {
        QName qname = new QName(null, "plain");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testConstructorWithNonExistentAttributeName() {
        QName qname = new QName(null, "nonexistent");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testConstructorWithWildcardName() {
        QName qname = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testGetNodePointerWithZeroPosition() {
        QName qname = new QName(null, "plain");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        iterator.setPosition(0);
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testSetPositionNegative() {
        QName qname = new QName(null, "plain");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertFalse(iterator.setPosition(0));
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testSetPositionPositive() {
        QName qname = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testSetPositionBeyondRange() {
        QName qname = new QName(null, "plain");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertFalse(iterator.setPosition(2));
        assertEquals(2, iterator.getPosition());
    }

    @Test
    public void testSetPositionWithWildcard() {
        QName qname = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertFalse(iterator.setPosition(2));
        assertTrue(iterator.setPosition(1));
    }

    @Test
    public void testAttributeWithNamespacePrefix() {
        QName qname = new QName("http://example.com/ns", "prefixed");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testAttributeWithMismatchedNamespace() {
        QName qname = new QName("http://other-ns", "plain");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testXmlnsAttributeExcluded() {
        QName qname = new QName(null, "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parentPointer, qname);
        int count = 0;
        while (iterator.setPosition(count + 1)) {
            count++;
        }
        assertEquals(2, count);
    }
}