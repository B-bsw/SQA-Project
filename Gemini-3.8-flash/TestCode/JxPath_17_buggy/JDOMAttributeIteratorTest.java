package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;

import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.Assert;
import org.junit.Test;

public class JDOMAttributeIteratorTest {

    private static class MockNodePointer extends NodePointer {
        private static final long serialVersionUID = 1L;
        private Object node;
        private NamespaceResolver resolver;

        public MockNodePointer(Object node, NamespaceResolver resolver) {
            super(null, Locale.getDefault());
            this.node = node;
            this.resolver = resolver;
        }

        public Object getImmediateNode() {
            return node;
        }

        public Object getNode() {
            return node;
        }

        public NamespaceResolver getNamespaceResolver() {
            return resolver;
        }

        public boolean isLeaf() {
            return false;
        }

        public boolean isCollection() {
            return false;
        }

        public int getLength() {
            return 1;
        }

        public QName getName() {
            return null;
        }

        public Object getBaseValue() {
            return node;
        }

        public void setValue(Object value) {
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }
    }

    @Test
    public void constructor_givenNonElementNode_shouldNotInitializeAttributes() {
        // Arrange
        MockNodePointer parent = new MockNodePointer("NonElementNode", new NamespaceResolver());
        QName name = new QName("attr");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenNullNode_shouldNotInitializeAttributes() {
        // Arrange
        MockNodePointer parent = new MockNodePointer(null, new NamespaceResolver());
        QName name = new QName("attr");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenXmlPrefixAndExistingAttribute_shouldFindAttribute() {
        // Arrange
        Element element = new Element("root");
        Attribute attr = new Attribute("lang", "en", Namespace.XML_NAMESPACE);
        element.setAttribute(attr);

        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("xml", "lang");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals(attr, ptr.getNode());
    }

    @Test
    public void constructor_givenXmlPrefixAndNonExistingAttribute_shouldFindNothing() {
        // Arrange
        Element element = new Element("root");
        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("xml", "space");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenRegisteredPrefixAndExistingAttribute_shouldFindAttribute() {
        // Arrange
        Element element = new Element("root");
        Namespace ns = Namespace.getNamespace("custom", "http://example.com/ns");
        Attribute attr = new Attribute("id", "123", ns);
        element.setAttribute(attr);

        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("custom", "http://example.com/ns");

        MockNodePointer parent = new MockNodePointer(element, resolver);
        QName name = new QName("custom", "id");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals(attr, ptr.getNode());
    }

    @Test
    public void constructor_givenUnresolvablePrefix_shouldProduceEmptyList() {
        // Arrange
        Element element = new Element("root");
        NamespaceResolver resolver = new NamespaceResolver();
        MockNodePointer parent = new MockNodePointer(element, resolver);
        QName name = new QName("unknownPrefix", "id");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenNullPrefixAndExistingAttribute_shouldFindAttribute() {
        // Arrange
        Element element = new Element("root");
        element.setAttribute("title", "TestTitle");

        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("title");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals(element.getAttribute("title"), ptr.getNode());
    }

    @Test
    public void constructor_givenNullPrefixAndNonExistingAttribute_shouldFindNothing() {
        // Arrange
        Element element = new Element("root");
        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("missing");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenWildcardNameAndNoPrefix_shouldMatchAllNoNamespaceAttributes() {
        // Arrange
        Element element = new Element("root");
        element.setAttribute("attr1", "val1");
        element.setAttribute("attr2", "val2");
        Namespace ns = Namespace.getNamespace("custom", "http://example.com/custom");
        element.setAttribute(new Attribute("attr3", "val3", ns));

        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("*");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals("attr1", ((Attribute) iterator.getNodePointer().getNode()).getName());

        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertEquals("attr2", ((Attribute) iterator.getNodePointer().getNode()).getName());

        Assert.assertFalse(iterator.setPosition(3));
    }

    @Test
    public void constructor_givenWildcardNameAndCustomPrefix_shouldMatchOnlyAttributesInThatNamespace() {
        // Arrange
        Element element = new Element("root");
        element.setAttribute("attr1", "val1");
        Namespace ns = Namespace.getNamespace("myNs", "http://example.com/myNs");
        element.setAttribute(new Attribute("attr2", "val2", ns));
        element.setAttribute(new Attribute("attr3", "val3", ns));

        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("myNs", "http://example.com/myNs");

        MockNodePointer parent = new MockNodePointer(element, resolver);
        QName name = new QName("myNs", "*");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals("attr2", ((Attribute) iterator.getNodePointer().getNode()).getName());

        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertEquals("attr3", ((Attribute) iterator.getNodePointer().getNode()).getName());

        Assert.assertFalse(iterator.setPosition(3));
    }

    @Test
    public void setPosition_givenBoundaryValues_shouldReturnExpectedBoolean() {
        // Arrange
        Element element = new Element("root");
        element.setAttribute("a", "1");
        element.setAttribute("b", "2");

        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("*");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

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

    @Test
    public void getNodePointer_whenPositionIsZero_shouldReturnFirstAttributeAndResetPosition() {
        // Arrange
        Element element = new Element("root");
        element.setAttribute("a", "1");

        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("a");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Act
        Assert.assertEquals(0, iterator.getPosition());
        NodePointer ptr = iterator.getNodePointer();

        // Assert
        Assert.assertNotNull(ptr);
        Assert.assertEquals("a", ((Attribute) ptr.getNode()).getName());
        Assert.assertEquals(0, iterator.getPosition());
    }

    @Test
    public void getNodePointer_whenPositionIsZeroAndEmptyList_shouldReturnNull() {
        // Arrange
        Element element = new Element("root");
        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("missing");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Act
        NodePointer ptr = iterator.getNodePointer();

        // Assert
        Assert.assertNull(ptr);
    }

    @Test
    public void getNodePointer_whenPositionIsNegative_shouldFallbackToFirstElement() {
        // Arrange
        Element element = new Element("root");
        element.setAttribute("a", "1");

        MockNodePointer parent = new MockNodePointer(element, new NamespaceResolver());
        QName name = new QName("a");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Act: setting negative position sets position = -1 and returns false
        iterator.setPosition(-1);
        Assert.assertEquals(-1, iterator.getPosition());

        // getNodePointer: index = position - 1 = -2; if (index < 0) index = 0;
        NodePointer ptr = iterator.getNodePointer();

        // Assert
        Assert.assertNotNull(ptr);
        Assert.assertEquals("a", ((Attribute) ptr.getNode()).getName());
    }
}