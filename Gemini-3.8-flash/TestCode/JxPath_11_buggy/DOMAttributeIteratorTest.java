package org.apache.commons.jxpath.ri.model.dom;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class DOMAttributeIteratorTest {

    private Document doc;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.newDocument();
    }

    private Document createNonNamespaceAwareDocument() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(false);
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.newDocument();
    }

    private static class TestNodePointer extends DOMNodePointer {
        private Map namespaceMap;

        public TestNodePointer(Node node) {
            super(node, Locale.getDefault());
            this.namespaceMap = new HashMap();
        }

        public void registerNamespace(String prefix, String uri) {
            this.namespaceMap.put(prefix, uri);
        }

        public String getNamespaceURI(String prefix) {
            if (namespaceMap != null && namespaceMap.containsKey(prefix)) {
                return (String) namespaceMap.get(prefix);
            }
            return super.getNamespaceURI(prefix);
        }
    }

    @Test
    public void constructor_givenNonElementNode_shouldHaveEmptyAttributes() {
        // Arrange
        Text textNode = doc.createTextNode("sample text");
        TestNodePointer pointer = new TestNodePointer(textNode);
        QName qName = new QName("attr");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenSpecificAttributeWithoutPrefix_shouldFindAttribute() {
        // Arrange
        Element element = doc.createElement("root");
        element.setAttribute("title", "Legacy Testing");
        TestNodePointer pointer = new TestNodePointer(element);
        QName qName = new QName("title");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());
        NodePointer nodePointer = iterator.getNodePointer();
        Assert.assertNotNull(nodePointer);
        Assert.assertEquals("Legacy Testing", ((Attr) nodePointer.getNode()).getValue());
    }

    @Test
    public void constructor_givenNonExistentAttribute_shouldBeEmpty() {
        // Arrange
        Element element = doc.createElement("root");
        element.setAttribute("title", "Legacy Testing");
        TestNodePointer pointer = new TestNodePointer(element);
        QName qName = new QName("unknown");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenWildcardName_shouldIncludeRegularAttributesAndExcludeXmlns() {
        // Arrange
        Element element = doc.createElementNS("http://example.com/ns", "root");
        element.setAttribute("attr1", "val1");
        element.setAttribute("attr2", "val2");
        element.setAttribute("xmlns", "http://example.com/ns");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:custom", "http://custom.com");

        TestNodePointer pointer = new TestNodePointer(element);
        QName qName = new QName("*");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertFalse(iterator.setPosition(3));
    }

    @Test
    public void constructor_givenSpecificAttributeWithNamespace_shouldFindAttributeByNamespaceURI() {
        // Arrange
        String nsUri = "http://example.com/ns";
        Element element = doc.createElementNS(nsUri, "elem");
        element.setAttributeNS(nsUri, "p:customAttr", "targetedValue");

        TestNodePointer pointer = new TestNodePointer(element);
        pointer.registerNamespace("p", nsUri);
        QName qName = new QName("p", "customAttr");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer nodePointer = iterator.getNodePointer();
        Assert.assertNotNull(nodePointer);
        Assert.assertEquals("targetedValue", ((Attr) nodePointer.getNode()).getValue());
    }

    @Test
    public void constructor_givenSpecificAttributeWithNamespaceFallback_shouldMatchViaFallbackLoop() throws Exception {
        // Arrange
        Document nonNsDoc = createNonNamespaceAwareDocument();
        Element element = nonNsDoc.createElement("root");
        element.setAttribute("p:legacyAttr", "legacyVal");

        TestNodePointer pointer = new TestNodePointer(element);
        pointer.registerNamespace("p", "http://example.com/ns");
        QName qName = new QName("p", "legacyAttr");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer nodePointer = iterator.getNodePointer();
        Assert.assertNotNull(nodePointer);
        Assert.assertEquals("legacyVal", ((Attr) nodePointer.getNode()).getValue());
    }

    @Test
    public void constructor_givenSpecificAttributeWithNamespaceFallbackNotFound_shouldReturnNull() throws Exception {
        // Arrange
        Document nonNsDoc = createNonNamespaceAwareDocument();
        Element element = nonNsDoc.createElement("root");
        element.setAttribute("other:differentAttr", "someVal");

        TestNodePointer pointer = new TestNodePointer(element);
        pointer.registerNamespace("p", "http://example.com/ns");
        QName qName = new QName("p", "legacyAttr");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenSpecificAttributeWithUnregisteredPrefix_shouldFallbackToGetAttributeNode() {
        // Arrange
        Element element = doc.createElement("root");
        element.setAttribute("unprefixedAttr", "expectedVal");

        TestNodePointer pointer = new TestNodePointer(element);
        QName qName = new QName("unregistered", "unprefixedAttr");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer nodePointer = iterator.getNodePointer();
        Assert.assertNotNull(nodePointer);
        Assert.assertEquals("expectedVal", ((Attr) nodePointer.getNode()).getValue());
    }

    @Test
    public void constructor_givenWildcardWithPrefix_shouldMatchAttributesWithSameResolvedNamespace() {
        // Arrange
        String ns1 = "http://example.com/ns1";
        String ns2 = "http://example.com/ns2";
        Element element = doc.createElementNS(ns1, "root");
        element.setAttributeNS(ns1, "a:item1", "v1");
        element.setAttributeNS(ns1, "b:item2", "v2");
        element.setAttributeNS(ns2, "c:item3", "v3");

        TestNodePointer pointer = new TestNodePointer(element);
        pointer.registerNamespace("a", ns1);
        pointer.registerNamespace("b", ns1);
        pointer.registerNamespace("c", ns2);

        QName qName = new QName("a", "*");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertFalse(iterator.setPosition(3));
    }

    @Test
    public void constructor_givenWildcardWithPrefixAndAttributeWithoutPrefix_shouldNotMatch() {
        // Arrange
        Element element = doc.createElement("root");
        element.setAttribute("regularAttr", "value");

        TestNodePointer pointer = new TestNodePointer(element);
        pointer.registerNamespace("p", "http://example.com/ns");
        QName qName = new QName("p", "*");

        // Act
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, qName);

        // Assert
        Assert.assertFalse(iterator.setPosition(1));
    }

    @Test
    public void getNodePointer_givenPositionZero_shouldDefaultToFirstAttributeAndRestorePosition() {
        // Arrange
        Element element = doc.createElement("root");
        element.setAttribute("first", "v1");
        TestNodePointer pointer = new TestNodePointer(element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, new QName("first"));

        // Act
        Assert.assertEquals(0, iterator.getPosition());
        NodePointer nodePointer = iterator.getNodePointer();

        // Assert
        Assert.assertNotNull(nodePointer);
        Assert.assertEquals("v1", ((Attr) nodePointer.getNode()).getValue());
        Assert.assertEquals(0, iterator.getPosition());
    }

    @Test
    public void getNodePointer_givenExplicitPosition_shouldReturnAttributeAtPosition() {
        // Arrange
        Element element = doc.createElement("root");
        element.setAttribute("a", "alpha");
        element.setAttribute("b", "beta");
        TestNodePointer pointer = new TestNodePointer(element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, new QName("*"));

        // Act
        Assert.assertTrue(iterator.setPosition(2));
        NodePointer nodePointer = iterator.getNodePointer();

        // Assert
        Assert.assertNotNull(nodePointer);
        Assert.assertEquals(2, iterator.getPosition());
    }

    @Test
    public void getNodePointer_givenNegativePosition_shouldFallbackToIndexZero() {
        // Arrange
        Element element = doc.createElement("root");
        element.setAttribute("a", "alpha");
        TestNodePointer pointer = new TestNodePointer(element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, new QName("a"));

        // Act
        iterator.setPosition(-2);
        NodePointer nodePointer = iterator.getNodePointer();

        // Assert
        Assert.assertNotNull(nodePointer);
        Assert.assertEquals("alpha", ((Attr) nodePointer.getNode()).getValue());
    }

    @Test
    public void setPosition_givenBoundaryAndOutOfBoundsValues_shouldReturnExpectedBoolean() {
        // Arrange
        Element element = doc.createElement("root");
        element.setAttribute("k1", "v1");
        element.setAttribute("k2", "v2");
        TestNodePointer pointer = new TestNodePointer(element);
        DOMAttributeIterator iterator = new DOMAttributeIterator(pointer, new QName("*"));

        // Act & Assert
        Assert.assertFalse(iterator.setPosition(0));
        Assert.assertEquals(0, iterator.getPosition());

        Assert.assertFalse(iterator.setPosition(-1));
        Assert.assertEquals(-1, iterator.getPosition());

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());

        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertEquals(2, iterator.getPosition());

        Assert.assertFalse(iterator.setPosition(3));
        Assert.assertEquals(3, iterator.getPosition());
    }
}