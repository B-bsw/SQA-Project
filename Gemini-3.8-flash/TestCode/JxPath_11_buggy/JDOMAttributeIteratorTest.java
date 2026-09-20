package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.Assert;
import org.junit.Test;

public class JDOMAttributeIteratorTest {

    private static class MockNodePointer extends NodePointer {
        private Object node;

        public MockNodePointer(Object node) {
            super(null, Locale.getDefault());
            this.node = node;
        }

        public Object getNode() {
            return node;
        }

        public Object getImmediateNode() {
            return node;
        }

        public Object getBaseValue() {
            return node;
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

        public void setValue(Object value) {
            this.node = value;
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }
    }

    @Test
    public void constructor_givenNonElementParent_shouldRemainUninitialized() {
        // Arrange
        NodePointer nonElementPointer = new MockNodePointer("just a string");
        QName name = new QName("attr");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(nonElementPointer, name);

        // Assert
        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenXmlPrefix_shouldFindXmlAttribute() {
        // Arrange
        Element element = new Element("root");
        Attribute xmlAttr = new Attribute("lang", "en", Namespace.XML_NAMESPACE);
        element.setAttribute(xmlAttr);
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("xml", "lang");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());
        NodePointer pointer = iterator.getNodePointer();
        Assert.assertNotNull(pointer);
        Assert.assertEquals(xmlAttr, pointer.getNode());
    }

    @Test
    public void constructor_givenCustomPrefixExisting_shouldFindAttribute() {
        // Arrange
        Element element = new Element("root");
        Namespace customNs = Namespace.getNamespace("custom", "http://commons.apache.org/test");
        element.addNamespaceDeclaration(customNs);
        Attribute attr = new Attribute("id", "123", customNs);
        element.setAttribute(attr);
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("custom", "id");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        Assert.assertNotNull(pointer);
        Assert.assertEquals(attr, pointer.getNode());
    }

    @Test
    public void constructor_givenUnknownPrefix_shouldSetEmptyListAndReturnEarly() {
        // Arrange
        Element element = new Element("root");
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("unknownPrefix", "id");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenNoPrefixExistingAttribute_shouldFindAttribute() {
        // Arrange
        Element element = new Element("root");
        Attribute attr = new Attribute("testAttr", "testValue");
        element.setAttribute(attr);
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("testAttr");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        Assert.assertNotNull(pointer);
        Assert.assertEquals(attr, pointer.getNode());
    }

    @Test
    public void constructor_givenNoPrefixNonExistingAttribute_shouldReturnNullPointer() {
        // Arrange
        Element element = new Element("root");
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("missingAttr");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void constructor_givenWildcardWithNoPrefix_shouldMatchOnlyNoNamespaceAttributes() {
        // Arrange
        Element element = new Element("root");
        Attribute attr1 = new Attribute("a1", "v1");
        Attribute attr2 = new Attribute("a2", "v2");
        Namespace customNs = Namespace.getNamespace("custom", "http://commons.apache.org/test");
        element.addNamespaceDeclaration(customNs);
        Attribute attr3 = new Attribute("a3", "v3", customNs);

        element.setAttribute(attr1);
        element.setAttribute(attr2);
        element.setAttribute(attr3);

        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("*");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(attr1, iterator.getNodePointer().getNode());

        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertEquals(attr2, iterator.getNodePointer().getNode());

        Assert.assertFalse(iterator.setPosition(3));
    }

    @Test
    public void constructor_givenWildcardWithPrefix_shouldMatchOnlyPrefixNamespaceAttributes() {
        // Arrange
        Element element = new Element("root");
        Namespace customNs = Namespace.getNamespace("custom", "http://commons.apache.org/test");
        element.addNamespaceDeclaration(customNs);

        Attribute attr1 = new Attribute("a1", "v1");
        Attribute attr2 = new Attribute("a2", "v2", customNs);
        Attribute attr3 = new Attribute("a3", "v3", customNs);

        element.setAttribute(attr1);
        element.setAttribute(attr2);
        element.setAttribute(attr3);

        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("custom", "*");

        // Act
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Assert
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(attr2, iterator.getNodePointer().getNode());

        Assert.assertTrue(iterator.setPosition(2));
        Assert.assertEquals(attr3, iterator.getNodePointer().getNode());

        Assert.assertFalse(iterator.setPosition(3));
    }

    @Test
    public void getNodePointer_whenPositionIsZeroAndAttributesExist_shouldFetchFirstAndResetPosition() {
        // Arrange
        Element element = new Element("root");
        Attribute attr = new Attribute("key", "val");
        element.setAttribute(attr);
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("key");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Act
        Assert.assertEquals(0, iterator.getPosition());
        NodePointer pointer = iterator.getNodePointer();

        // Assert
        Assert.assertNotNull(pointer);
        Assert.assertEquals(attr, pointer.getNode());
        Assert.assertEquals(0, iterator.getPosition());
    }

    @Test
    public void getNodePointer_whenPositionIsZeroAndNoAttributesExist_shouldReturnNull() {
        // Arrange
        Element element = new Element("root");
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("nonExistent");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Act
        NodePointer pointer = iterator.getNodePointer();

        // Assert
        Assert.assertNull(pointer);
    }

    @Test
    public void getNodePointer_whenPositionIsExplicitlySet_shouldReturnMatchingPointer() {
        // Arrange
        Element element = new Element("root");
        Attribute attr1 = new Attribute("a1", "v1");
        Attribute attr2 = new Attribute("a2", "v2");
        element.setAttribute(attr1);
        element.setAttribute(attr2);
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("*");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Act & Assert
        Assert.assertTrue(iterator.setPosition(2));
        NodePointer pointer2 = iterator.getNodePointer();
        Assert.assertNotNull(pointer2);
        Assert.assertEquals(attr2, pointer2.getNode());

        Assert.assertTrue(iterator.setPosition(1));
        NodePointer pointer1 = iterator.getNodePointer();
        Assert.assertNotNull(pointer1);
        Assert.assertEquals(attr1, pointer1.getNode());
    }

    @Test
    public void setPosition_givenBoundaryPositions_shouldReturnAccurateResults() {
        // Arrange
        Element element = new Element("root");
        Attribute attr1 = new Attribute("a1", "v1");
        element.setAttribute(attr1);
        NodePointer parent = new MockNodePointer(element);
        QName name = new QName("a1");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, name);

        // Act & Assert
        Assert.assertFalse(iterator.setPosition(0));
        Assert.assertEquals(0, iterator.getPosition());

        Assert.assertFalse(iterator.setPosition(-1));
        Assert.assertEquals(-1, iterator.getPosition());

        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());

        Assert.assertFalse(iterator.setPosition(2));
        Assert.assertEquals(2, iterator.getPosition());
    }

    @Test
    public void setPosition_whenAttributesIsNull_shouldReturnFalse() {
        // Arrange
        NodePointer nonElementPointer = new MockNodePointer(new Object());
        QName name = new QName("attr");
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(nonElementPointer, name);

        // Act
        boolean result = iterator.setPosition(1);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(0, iterator.getPosition());
    }
}