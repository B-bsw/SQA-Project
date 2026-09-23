package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NamespaceResolver;

public class JDOMAttributeIteratorTest {

    private static class TestNamespaceResolver implements NamespaceResolver {
        private String uri;
        public TestNamespaceResolver(String uri) { this.uri = uri; }
        @Override
        public String getNamespaceURI(String prefix) { return uri; }
    }

    private static class TestNodePointer extends NodePointer {
        private Object node;
        private NamespaceResolver nsResolver;

        public TestNodePointer(Object node, NamespaceResolver nsResolver) {
            super(null);
            this.node = node;
            this.nsResolver = nsResolver;
        }

        @Override public Object getNode() { return node; }
        @Override public NamespaceResolver getNamespaceResolver() { return nsResolver; }
        @Override public Object getValuePointer() { return this; }
        @Override public boolean isLeaf() { return true; }
        @Override public boolean isCollection() { return false; }
        @Override public int getLength() { return 1; }
        @Override public Object getImmediateNode() { return node; }
        @Override public boolean isActual() { return true; }
        @Override public boolean isContainer() { return false; }
        @Override public QName getName() { return null; }
        @Override public Object getBaseValue() { return null; }
        @Override public Object getValue() { return null; }
        @Override public int compareChildNodePointers(NodePointer p1, NodePointer p2) { return 0; }
        @Override public String asPath() { return "/"; }
        @Override public int hashCode() { return 0; }
        @Override public boolean equals(Object o) { return false; }
    }

    private Element element;

    @Before
    public void setUp() {
        element = new Element("root");
    }

    @Test
    public void testParentNotElement() {
        NodePointer parent = new TestNodePointer("string", null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName("test"));
        assertFalse(iter.setPosition(1));
        assertNull(iter.getNodePointer());
    }

    @Test
    public void testPrefixXmlSpecific() {
        element.setAttribute(new Attribute("xmlAttr", "val", Namespace.XML_NAMESPACE));
        NodePointer parent = new TestNodePointer(element, null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName("xml", "xmlAttr"));
        assertTrue(iter.setPosition(1));
        assertNotNull(iter.getNodePointer());
        assertFalse(iter.setPosition(2));
    }

    @Test
    public void testPrefixWithUri() {
        Namespace fooNs = Namespace.getNamespace("foo", "http://foo");
        element.setAttribute(new Attribute("bar", "val", fooNs));
        NamespaceResolver resolver = new TestNamespaceResolver("http://foo");
        NodePointer parent = new TestNodePointer(element, resolver);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName("foo", "bar"));
        assertTrue(iter.setPosition(1));
        assertNotNull(iter.getNodePointer());
    }

    @Test
    public void testPrefixNoUri() {
        NamespaceResolver resolver = new TestNamespaceResolver(null);
        NodePointer parent = new TestNodePointer(element, resolver);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName("foo", "bar"));
        assertFalse(iter.setPosition(1));
        assertNull(iter.getNodePointer());
    }

    @Test
    public void testNoPrefixSpecificName() {
        element.setAttribute(new Attribute("attr1", "val1", Namespace.NO_NAMESPACE));
        NodePointer parent = new TestNodePointer(element, null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName(null, "attr1"));
        assertTrue(iter.setPosition(1));
        assertNotNull(iter.getNodePointer());
    }

    @Test
    public void testNoPrefixWildcard() {
        element.setAttribute(new Attribute("attr1", "val1", Namespace.NO_NAMESPACE));
        element.setAttribute(new Attribute("attr2", "val2", Namespace.NO_NAMESPACE));
        NodePointer parent = new TestNodePointer(element, null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName(null, "*"));
        assertTrue(iter.setPosition(1));
        assertTrue(iter.setPosition(2));
        assertFalse(iter.setPosition(3));
    }

    @Test
    public void testSetPositionBoundaries() {
        element.setAttribute(new Attribute("a", "b", Namespace.NO_NAMESPACE));
        NodePointer parent = new TestNodePointer(element, null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName(null, "*"));
        assertFalse(iter.setPosition(0));
        assertEquals(0, iter.getPosition());
        assertTrue(iter.setPosition(1));
        assertEquals(1, iter.getPosition());
        assertFalse(iter.setPosition(2));
        assertEquals(2, iter.getPosition());
    }

    @Test
    public void testGetNodePointerPositionZero() {
        element.setAttribute(new Attribute("a", "b", Namespace.NO_NAMESPACE));
        NodePointer parent = new TestNodePointer(element, null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName(null, "a"));
        NodePointer p1 = iter.getNodePointer();
        assertNotNull(p1);
        assertEquals(0, iter.getPosition());
        NodePointer p2 = iter.getNodePointer();
        assertSame(p1, p2);
    }

    @Test
    public void testIterateAllAttributes() {
        element.setAttribute(new Attribute("x", "1", Namespace.NO_NAMESPACE));
        element.setAttribute(new Attribute("y", "2", Namespace.NO_NAMESPACE));
        element.setAttribute(new Attribute("z", "3", Namespace.XML_NAMESPACE));
        NodePointer parent = new TestNodePointer(element, null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName(null, "*"));
        int count = 0;
        while (iter.setPosition(count + 1)) {
            assertNotNull(iter.getNodePointer());
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testWildcardNoMatch() {
        element.setAttribute(new Attribute("a", "1", Namespace.XML_NAMESPACE));
        NodePointer parent = new TestNodePointer(element, null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName(null, "*"));
        assertFalse(iter.setPosition(1));
    }

    @Test
    public void testPrefixXmlWildcard() {
        element.setAttribute(new Attribute("a", "1", Namespace.XML_NAMESPACE));
        element.setAttribute(new Attribute("b", "2", Namespace.XML_NAMESPACE));
        NodePointer parent = new TestNodePointer(element, null);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, new QName("xml", "*"));
        assertTrue(iter.setPosition(1));
        assertTrue(iter.setPosition(2));
        assertFalse(iter.setPosition(3));
    }
}