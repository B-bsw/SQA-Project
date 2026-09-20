package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class DOMAttributeIteratorTest {

    private Document document;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
    }

    private static class StubNodePointer extends DOMNodePointer {
        private NamespaceResolver customResolver;

        public StubNodePointer(org.w3c.dom.Node node) {
            super(node, Locale.US);
        }

        public void setNamespaceResolver(NamespaceResolver resolver) {
            this.customResolver = resolver;
        }

        public NamespaceResolver getNamespaceResolver() {
            if (customResolver != null) {
                return customResolver;
            }
            return super.getNamespaceResolver();
        }
    }

    @Test
    public void constructor_givenNonElementNode_shouldHaveEmptyAttributes() {
        Text textNode = document.createTextNode("Sample Text");
        NodePointer pointer = new DOMNodePointer(textNode, Locale.US);
        QName name = new QName("attr");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenDocumentNode_shouldHaveEmptyAttributes() {
        NodePointer pointer = new DOMNodePointer(document, Locale.US);
        QName name = new QName("*");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenSpecificAttributeNameAndAttributeExists_shouldFindAttribute() {
        Element element = document.createElement("book");
        element.setAttribute("title", "Legacy Java");
        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("title");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertTrue(iterator.setPosition(1));
        NodePointer attrPointer = iterator.getNodePointer();
        Assert.assertNotNull(attrPointer);
        Assert.assertEquals("title", ((Attr) attrPointer.getNode()).getName());
        Assert.assertEquals("Legacy Java", ((Attr) attrPointer.getNode()).getValue());
    }

    @Test
    public void constructor_givenSpecificAttributeNameAndAttributeDoesNotExist_shouldNotFindAttribute() {
        Element element = document.createElement("book");
        element.setAttribute("title", "Legacy Java");
        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("nonexistent");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenWildcardName_shouldIterateAllAttributesExcludingXmlns() {
        Element element = document.createElementNS("http://example.com/ns", "ns:book");
        element.setAttribute("id", "101");
        element.setAttribute("name", "Enterprise");
        element.setAttribute("xmlns", "http://example.com/ns");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ns", "http://example.com/ns");

        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("*");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertFalse(iterator.setPosition(3));
    }

    @Test
    public void constructor_givenWildcardWithNamespacePrefix_shouldMatchAttributesWithSamePrefix() {
        Element element = document.createElementNS("http://example.com/ns", "ns:book");
        element.setAttributeNS("http://example.com/ns", "ns:code", "ABC");
        element.setAttribute("other", "XYZ");

        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("ns", "*");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertTrue(iterator.setPosition(1));
        Attr attr = (Attr) iterator.getNodePointer().getNode();
        Assert.assertEquals("code", attr.getLocalName());
        Assert.assertFalse(iterator.setPosition(2));
    }

    @Test
    public void constructor_givenAttributeWithNamespaceAndDirectNSLookup_shouldFindAttribute() {
        Element element = document.createElementNS("http://example.com/ns", "ns:book");
        element.setAttributeNS("http://example.com/ns", "ns:isbn", "1234567890");

        StubNodePointer pointer = new StubNodePointer(element);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("myprefix", "http://example.com/ns");
        pointer.setNamespaceResolver(resolver);

        QName name = new QName("myprefix", "isbn");
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertTrue(iterator.setPosition(1));
        NodePointer attrPointer = iterator.getNodePointer();
        Assert.assertNotNull(attrPointer);
        Assert.assertEquals("isbn", ((Attr) attrPointer.getNode()).getLocalName());
    }

    @Test
    public void constructor_givenAttributeWithNamespaceFallback_shouldMatchFromAttributesList() throws Exception {
        DocumentBuilderFactory nonNsFactory = DocumentBuilderFactory.newInstance();
        nonNsFactory.setNamespaceAware(false);
        Document nonNsDoc = nonNsFactory.newDocumentBuilder().newDocument();
        Element element = nonNsDoc.createElement("book");
        element.setAttribute("p1:code", "VAL123");

        StubNodePointer pointer = new StubNodePointer(element);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p1", "http://example.com/test");
        pointer.setNamespaceResolver(resolver);

        QName name = new QName("p1", "code");
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertTrue(iterator.setPosition(1));
        NodePointer attrPointer = iterator.getNodePointer();
        Assert.assertNotNull(attrPointer);
        Assert.assertEquals("p1:code", ((Attr) attrPointer.getNode()).getName());
    }

    @Test
    public void constructor_givenAttributeWithNamespaceFallbackAndNoMatch_shouldReturnNull() throws Exception {
        DocumentBuilderFactory nonNsFactory = DocumentBuilderFactory.newInstance();
        nonNsFactory.setNamespaceAware(false);
        Document nonNsDoc = nonNsFactory.newDocumentBuilder().newDocument();
        Element element = nonNsDoc.createElement("book");
        element.setAttribute("p1:other", "VAL123");

        StubNodePointer pointer = new StubNodePointer(element);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p1", "http://example.com/test");
        pointer.setNamespaceResolver(resolver);

        QName name = new QName("p1", "code");
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenPrefixWithoutNamespaceUri_shouldFallbackToLocalName() {
        Element element = document.createElement("book");
        element.setAttribute("code", "PLAIN");

        StubNodePointer pointer = new StubNodePointer(element);
        pointer.setNamespaceResolver(new NamespaceResolver());

        QName name = new QName("unregistered", "code");
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertEquals("code", ((Attr) iterator.getNodePointer().getNode()).getName());
    }

    @Test
    public void testAttr_givenDifferentPrefixesSameNamespaceURI_shouldMatch() {
        Element element = document.createElementNS("http://example.com/ns", "p1:item");
        element.setAttributeNS("http://example.com/ns", "p1:attr", "val");

        StubNodePointer pointer = new StubNodePointer(element);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p2", "http://example.com/ns");
        resolver.registerNamespace("p1", "http://example.com/ns");
        pointer.setNamespaceResolver(resolver);

        QName name = new QName("p2", "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testAttr_givenDifferentNamespaceURIs_shouldNotMatch() {
        Element element = document.createElementNS("http://example.com/ns1", "p1:item");
        element.setAttributeNS("http://example.com/ns1", "p1:attr", "val");

        StubNodePointer pointer = new StubNodePointer(element);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("p1", "http://example.com/ns1");
        resolver.registerNamespace("p2", "http://example.com/ns2");
        pointer.setNamespaceResolver(resolver);

        QName name = new QName("p2", "*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void testAttr_givenNullPrefixOnQueryAndPrefixedAttribute_shouldNotMatch() {
        Element element = document.createElementNS("http://example.com/ns", "p:item");
        element.setAttributeNS("http://example.com/ns", "p:attr", "val");

        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName(null, "attr");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertFalse(iterator.setPosition(1));
    }

    @Test
    public void getNodePointer_givenPositionZeroAndAttributesExist_shouldReturnFirstElement() {
        Element element = document.createElement("item");
        element.setAttribute("first", "1");
        element.setAttribute("second", "2");

        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("*");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);
        Assert.assertEquals(0, iterator.getPosition());

        NodePointer result = iterator.getNodePointer();

        Assert.assertNotNull(result);
        Assert.assertEquals(0, iterator.getPosition());
    }

    @Test
    public void getNodePointer_givenPositionZeroAndEmptyAttributes_shouldReturnNull() {
        Element element = document.createElement("item");
        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("*");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        NodePointer result = iterator.getNodePointer();

        Assert.assertNull(result);
    }

    @Test
    public void getNodePointer_givenNegativePosition_shouldReturnFirstElement() {
        Element element = document.createElement("item");
        element.setAttribute("key", "val");

        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("key");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);
        iterator.setPosition(-1);

        NodePointer result = iterator.getNodePointer();

        Assert.assertNotNull(result);
        Assert.assertEquals("key", ((Attr) result.getNode()).getName());
    }

    @Test
    public void setPosition_givenBoundaryPositions_shouldReturnExpectedBoolean() {
        Element element = document.createElement("item");
        element.setAttribute("a", "1");
        element.setAttribute("b", "2");

        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("*");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        Assert.assertFalse("Position 0 should be invalid", iterator.setPosition(0));
        Assert.assertEquals(0, iterator.getPosition());

        Assert.assertFalse("Negative position should be invalid", iterator.setPosition(-5));
        Assert.assertEquals(-5, iterator.getPosition());

        Assert.assertTrue("Position 1 should be valid", iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());

        Assert.assertTrue("Position 2 should be valid", iterator.setPosition(2));
        Assert.assertEquals(2, iterator.getPosition());

        Assert.assertFalse("Position 3 should be out of bounds", iterator.setPosition(3));
        Assert.assertEquals(3, iterator.getPosition());
    }

    @Test
    public void getNodePointer_givenPositionAfterSetPosition_shouldReturnCorrectPointer() {
        Element element = document.createElement("item");
        element.setAttribute("a", "valA");
        element.setAttribute("b", "valB");

        NodePointer pointer = new DOMNodePointer(element, Locale.US);
        QName name = new QName("*");

        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, name);

        iterator.setPosition(2);
        NodePointer ptr2 = iterator.getNodePointer();
        Assert.assertNotNull(ptr2);
        Assert.assertTrue(ptr2 instanceof DOMAttributePointer);

        iterator.setPosition(1);
        NodePointer ptr1 = iterator.getNodePointer();
        Assert.assertNotNull(ptr1);
        Assert.assertFalse(ptr1.getNode().equals(ptr2.getNode()));
    }
}