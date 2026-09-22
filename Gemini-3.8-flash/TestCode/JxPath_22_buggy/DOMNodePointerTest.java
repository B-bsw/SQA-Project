package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;

/**
 * Comprehensive Unit Tests for {@link DOMNodePointer}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class DOMNodePointerTest {

    private Document createDocument() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.newDocument();
    }

    @Test
    public void getName_givenElementNode_shouldReturnCorrectQName() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element elem = doc.createElement("testElement");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH);

        // Act
        QName name = pointer.getName();

        // Assert
        assertNotNull(name);
        assertEquals("testElement", name.getName());
    }

    @Test
    public void getName_givenProcessingInstruction_shouldReturnTargetName() throws Exception {
        // Arrange
        Document doc = createDocument();
        ProcessingInstruction pi = doc.createProcessingInstruction("targetPI", "data");
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.ENGLISH);

        // Act
        QName name = pointer.getName();

        // Assert
        assertNotNull(name);
        assertEquals("targetPI", name.getName());
    }

    @Test
    public void getBaseValueAndImmediateNode_shouldReturnUnderlyingNode() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element elem = doc.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH, "id123");

        // Act & Assert
        assertSame(elem, pointer.getBaseValue());
        assertSame(elem, pointer.getImmediateNode());
        assertTrue(pointer.isActual());
        assertFalse(pointer.isCollection());
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void isLeaf_givenLeafAndNonLeafNodes_shouldDetectCorrectly() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element emptyElem = doc.createElement("empty");
        DOMNodePointer emptyPointer = new DOMNodePointer(emptyElem, Locale.ENGLISH);

        Element parentElem = doc.createElement("parent");
        parentElem.appendChild(doc.createElement("child"));
        DOMNodePointer parentPointer = new DOMNodePointer(parentElem, Locale.ENGLISH);

        // Act & Assert
        assertTrue(emptyPointer.isLeaf());
        assertFalse(parentPointer.isLeaf());
    }

    @Test
    public void getValueAndSetValue_givenTextContent_shouldReadAndWrite() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element elem = doc.createElement("msg");
        elem.appendChild(doc.createTextNode("Hello"));
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH);

        // Act
        Object initialValue = pointer.getValue();
        pointer.setValue("World");
        Object updatedValue = pointer.getValue();

        // Assert
        assertEquals("Hello", initialValue);
        assertEquals("World", updatedValue);
    }

    @Test
    public void testNode_givenNodeNameTest_shouldMatchNameAndWildcard() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element elem = doc.createElement("targetNode");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH);

        NodeNameTest matchTest = new NodeNameTest(new QName("targetNode"));
        NodeNameTest mismatchTest = new NodeNameTest(new QName("otherNode"));
        NodeNameTest wildcardTest = new NodeNameTest(new QName("*"));

        // Act & Assert
        assertTrue(pointer.testNode(matchTest));
        assertFalse(pointer.testNode(mismatchTest));
        assertTrue(pointer.testNode(wildcardTest));
        assertTrue(pointer.testNode(null));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldMatchElementType() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element elem = doc.createElement("item");
        Text text = doc.createTextNode("txt");
        Comment comment = doc.createComment("a comment");

        DOMNodePointer elemPointer = new DOMNodePointer(elem, Locale.ENGLISH);
        DOMNodePointer textPointer = new DOMNodePointer(text, Locale.ENGLISH);
        DOMNodePointer commentPointer = new DOMNodePointer(comment, Locale.ENGLISH);

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
    public void getNamespaceURI_givenStandardPrefixes_shouldReturnURIs() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element elem = doc.createElement("node");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH);

        // Act & Assert
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void iterators_shouldReturnNonNullIterators() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element elem = doc.createElement("root");
        elem.setAttribute("attr1", "val1");
        elem.appendChild(doc.createElement("child1"));
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH);

        // Act
        NodeIterator childIt = pointer.childIterator(null, false, null);
        NodeIterator attrIt = pointer.attributeIterator(new QName("attr1"));
        NodeIterator nsIt = pointer.namespaceIterator();
        NodePointer nsPointer = pointer.namespacePointer("xml");

        // Assert
        assertNotNull(childIt);
        assertNotNull(attrIt);
        assertNotNull(nsIt);
        assertNotNull(nsPointer);
    }

    @Test
    public void asPath_givenRootElement_shouldReturnValidPath() throws Exception {
        // Arrange
        Document doc = createDocument();
        Element elem = doc.createElement("app");
        doc.appendChild(elem);
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.ENGLISH);

        // Act
        String path = pointer.asPath();

        // Assert
        assertNotNull(path);
        assertTrue(path.contains("app"));
    }
}
