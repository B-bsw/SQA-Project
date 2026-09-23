package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.*;
import java.util.Locale;

public class DOMNodePointerTest {
    private Document document;
    private Element rootElement;
    private DOMNodePointer rootPointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        document = factory.newDocumentBuilder().newDocument();
        rootElement = document.createElement("root");
        rootElement.setAttribute("xmlns:test", "http://example.com/test");
        document.appendChild(rootElement);
        rootPointer = new DOMNodePointer(document, Locale.ENGLISH);
    }

    @Test
    public void testConstructorWithNodeAndLocale() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertNotNull(pointer);
        assertEquals(rootElement, pointer.getBaseValue());
    }

    @Test
    public void testConstructorWithNodeLocaleAndId() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH, "testId");
        assertNotNull(pointer);
        assertEquals("id('testId')", pointer.asPath());
    }

    @Test
    public void testConstructorWithParentAndNode() {
        DOMNodePointer parent = new DOMNodePointer(document, Locale.ENGLISH);
        DOMNodePointer pointer = new DOMNodePointer(parent, rootElement);
        assertNotNull(pointer);
        assertEquals(rootElement, pointer.getBaseValue());
        assertEquals(parent, pointer.getParent());
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeWithNodeNameTestElement() {
        NodeNameTest test = new NodeNameTest(new QName("root"));
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcard() {
        NodeNameTest test = new NodeNameTest(new QName("*"), true, null);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcardWithPrefix() {
        NodeNameTest test = new NodeNameTest(new QName("test", "http://example.com/test"), true, "test");
        Element child = document.createElementNS("http://example.com/test", "test:child");
        rootElement.appendChild(child);
        assertTrue(DOMNodePointer.testNode(child, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonElement() {
        NodeNameTest test = new NodeNameTest(new QName("root"));
        assertFalse(DOMNodePointer.testNode(document, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestMismatch() {
        NodeNameTest test = new NodeNameTest(new QName("other"));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Element child = document.createElement("child");
        child.appendChild(document.createTextNode("text"));
        rootElement.appendChild(child);
        assertTrue(DOMNodePointer.testNode(child.getFirstChild(), test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestTextOnNonText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Comment comment = document.createComment("comment");
        assertTrue(DOMNodePointer.testNode(comment, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestPI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestDefault() {
        NodeTypeTest test = new NodeTypeTest(999);
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTest() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestMismatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        ProcessingInstruction pi = document.createProcessingInstruction("other", "data");
        assertFalse(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testGetNameForElement() {
        Element child = document.createElementNS("http://example.com/test", "test:child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        QName name = pointer.getName();
        assertEquals("test", name.getPrefix());
        assertEquals("child", name.getName());
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.ENGLISH);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNameForOtherNodeType() {
        Comment comment = document.createComment("comment");
        DOMNodePointer pointer = new DOMNodePointer(comment, Locale.ENGLISH);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertNull(name.getName());
    }

    @Test
    public void testGetNamespaceURIWithNullPrefix() {
        Element child = document.createElementNS("http://example.com/test", "test:child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("http://example.com/test", pointer.getNamespaceURI("test"));
    }

    @Test
    public void testGetNamespaceURIWithEmptyPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertNull(pointer.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURIWithXmlPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIWithXmlnsPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURIWithUnknownPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertNull(pointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURICached() {
        Element child = document.createElementNS("http://example.com/test", "test:child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("http://example.com/test", pointer.getNamespaceURI("test"));
        assertEquals("http://example.com/test", pointer.getNamespaceURI("test"));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        Element child = document.createElement("child");
        child.setAttribute("xmlns", "http://default.com");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("http://default.com", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURIEmpty() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetBaseValue() {
        assertEquals(document, rootPointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        assertEquals(document, rootPointer.getImmediateNode());
    }

    @Test
    public void testIsActual() {
        assertTrue(rootPointer.isActual());
    }

    @Test
    public void testIsCollection() {
        assertFalse(rootPointer.isCollection());
    }

    @Test
    public void testGetLength() {
        assertEquals(1, rootPointer.getLength());
    }

    @Test
    public void testIsLeafWithNoChildren() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLeafWithChildren() {
        Element child = document.createElement("child");
        child.appendChild(document.createElement("grandchild"));
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLanguageMatch() {
        Element child = document.createElement("child");
        child.setAttribute("xml:lang", "en");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageNoMatch() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testSetValueTextNode() {
        Element child = document.createElement("child");
        child.appendChild(document.createTextNode("old"));
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child.getFirstChild(), Locale.ENGLISH);
        pointer.setValue("new");
        assertEquals("new", child.getTextContent());
    }

    @Test
    public void testSetValueEmptyString() {
        Element child = document.createElement("child");
        child.appendChild(document.createTextNode("old"));
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child.getFirstChild(), Locale.ENGLISH);
        pointer.setValue("");
        assertNull(child.getFirstChild());
    }

    @Test
    public void testSetValueNodeValue() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        Element newChild = document.createElement("newChild");
        pointer.setValue(newChild);
        assertEquals("newChild", child.getChildNodes().item(0).getNodeName());
    }

    @Test
    public void testCreateChildWithIndexWholeCollection() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());
        // This will throw because factory cannot create
        try {
            pointer.createChild(context, new QName("newChild"), DOMNodePointer.WHOLE_COLLECTION);
            fail("Expected JXPathAbstractFactoryException");
        } catch (JXPathAbstractFactoryException e) {
            // expected
        }
    }

    @Test
    public void testCreateAttributeOnNonElement() {
        DOMNodePointer pointer = new DOMNodePointer(document, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());
        try {
            pointer.createAttribute(context, new QName("attr"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetPointerByID() {
        Element child = document.createElement("child");
        child.setAttribute("id", "testId");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Pointer result = pointer.getPointerByID(null, "testId");
        assertEquals(child, result.getBaseValue());
    }

    @Test
    public void testGetPointerByIDNotFound() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertNull(pointer.getPointerByID(null, "nonexistent"));
    }

    @Test
    public void testCompareChildNodePointersAttributesFirst() {
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);
        DOMNodePointer pointer1 = new DOMNodePointer(child1, Locale.ENGLISH);
        DOMNodePointer pointer2 = new DOMNodePointer(child2, Locale.ENGLISH);
        assertTrue(pointer1.compareChildNodePointers(pointer1, pointer2) < 0);
    }

    @Test
    public void testEqualsSameObject() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertEquals(pointer, pointer);
    }

    @Test
    public void testEqualsDifferentObject() {
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        DOMNodePointer pointer2 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertNotEquals(pointer1, pointer2);
    }

    @Test
    public void testEqualsNotNull() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertNotNull(pointer);
    }

    @Test
    public void testHashCode() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        assertEquals(rootElement.hashCode(), pointer.hashCode());
    }
}