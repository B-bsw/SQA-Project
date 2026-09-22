package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Locale;

import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;

import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;

/**
 * Comprehensive Unit Tests for {@link JDOMNodePointer}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class JDOMNodePointerTest {

    @Test
    public void getName_givenElement_shouldReturnQName() {
        // Arrange
        Element elem = new Element("user");
        JDOMNodePointer pointer = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Act
        QName name = pointer.getName();

        // Assert
        assertNotNull(name);
        assertEquals("user", name.getName());
    }

    @Test
    public void getName_givenProcessingInstruction_shouldReturnTarget() {
        // Arrange
        ProcessingInstruction pi = new ProcessingInstruction("testTarget", "some data");
        JDOMNodePointer pointer = new JDOMNodePointer(pi, Locale.ENGLISH);

        // Act
        QName name = pointer.getName();

        // Assert
        assertNotNull(name);
        assertEquals("testTarget", name.getName());
    }

    @Test
    public void getBaseValueAndImmediateNode_shouldReturnUnderlyingObject() {
        // Arrange
        Element elem = new Element("item");
        JDOMNodePointer pointer = new JDOMNodePointer(elem, Locale.ENGLISH, "id99");

        // Act & Assert
        assertSame(elem, pointer.getBaseValue());
        assertSame(elem, pointer.getImmediateNode());
        assertTrue(pointer.isActual());
        assertFalse(pointer.isCollection());
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void isLeaf_givenEmptyAndPopulatedElement_shouldEvaluateCorrectly() {
        // Arrange
        Element emptyElem = new Element("empty");
        JDOMNodePointer emptyPointer = new JDOMNodePointer(emptyElem, Locale.ENGLISH);

        Element parentElem = new Element("parent");
        parentElem.addContent(new Element("child"));
        JDOMNodePointer parentPointer = new JDOMNodePointer(parentElem, Locale.ENGLISH);

        // Act & Assert
        assertTrue(emptyPointer.isLeaf());
        assertFalse(parentPointer.isLeaf());
    }

    @Test
    public void getValueAndSetValue_givenTextContent_shouldReadAndWrite() {
        // Arrange
        Element elem = new Element("title");
        elem.setText("Initial Title");
        JDOMNodePointer pointer = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Act
        Object initial = pointer.getValue();
        pointer.setValue("Updated Title");
        Object updated = pointer.getValue();

        // Assert
        assertEquals("Initial Title", initial);
        assertEquals("Updated Title", updated);
    }

    @Test
    public void testNode_givenNodeNameTest_shouldMatchNameAndWildcard() {
        // Arrange
        Element elem = new Element("customer");
        JDOMNodePointer pointer = new JDOMNodePointer(elem, Locale.ENGLISH);

        NodeNameTest matchTest = new NodeNameTest(new QName("customer"));
        NodeNameTest mismatchTest = new NodeNameTest(new QName("product"));
        NodeNameTest wildcardTest = new NodeNameTest(new QName("*"));

        // Act & Assert
        assertTrue(pointer.testNode(matchTest));
        assertFalse(pointer.testNode(mismatchTest));
        assertTrue(pointer.testNode(wildcardTest));
        assertTrue(pointer.testNode(null));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldMatchJDOMTypes() {
        // Arrange
        Element elem = new Element("testElem");
        Text text = new Text("sample text");
        Comment comment = new Comment("a comment");

        JDOMNodePointer elemPointer = new JDOMNodePointer(elem, Locale.ENGLISH);
        JDOMNodePointer textPointer = new JDOMNodePointer(text, Locale.ENGLISH);
        JDOMNodePointer commentPointer = new JDOMNodePointer(comment, Locale.ENGLISH);

        NodeTypeTest elementTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);

        // Act & Assert
        assertTrue(elemPointer.testNode(elementTest));
        assertFalse(elemPointer.testNode(textTest));

        assertTrue(textPointer.testNode(textTest));
        assertFalse(textPointer.testNode(elementTest));

        assertTrue(commentPointer.testNode(commentTest));
        assertFalse(commentPointer.testNode(elementTest));
    }

    @Test
    public void getNamespaceURI_givenStandardPrefixes_shouldReturnURIs() {
        // Arrange
        Element elem = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Act & Assert
        assertEquals(JDOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        assertEquals(JDOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void iterators_shouldReturnNonNullIterators() {
        // Arrange
        Element elem = new Element("root");
        elem.setAttribute("key", "val");
        elem.addContent(new Element("sub"));
        JDOMNodePointer pointer = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Act
        NodeIterator childIt = pointer.childIterator(null, false, null);
        NodeIterator attrIt = pointer.attributeIterator(new QName("key"));
        NodeIterator nsIt = pointer.namespaceIterator();
        NodePointer nsPointer = pointer.namespacePointer("xml");

        // Assert
        assertNotNull(childIt);
        assertNotNull(attrIt);
        assertNotNull(nsIt);
        assertNotNull(nsPointer);
    }

    @Test
    public void asPath_givenElement_shouldReturnXPathString() {
        // Arrange
        Element elem = new Element("main");
        Document doc = new Document(elem);
        JDOMNodePointer pointer = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Act
        String path = pointer.asPath();

        // Assert
        assertNotNull(path);
        assertTrue(path.contains("main"));
    }
}
