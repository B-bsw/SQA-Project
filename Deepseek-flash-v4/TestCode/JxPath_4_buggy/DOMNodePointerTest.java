package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;

public class DOMNodePointerTest {

    private Document document;
    private Element rootElement;
    private DOMNodePointer rootPointer;

    @Before
    public void setUp() throws Exception {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        rootElement = document.createElement("root");
        document.appendChild(rootElement);
        rootPointer = new DOMNodePointer(rootElement, null);
    }

    @Test
    public void testGetName_ElementNode() {
        Element element = document.createElement("test:element");
        element.setPrefix("test");
        QName name = new DOMNodePointer(element, null).getName();
        assertEquals("test", name.getPrefix());
        assertEquals("element", name.getName());
    }

    @Test
    public void testGetName_TextNode() {
        Text text = document.createTextNode("text");
        QName name = new DOMNodePointer(text, null).getName();
        assertNull(name.getPrefix());
        assertEquals("", name.getName());
    }

    @Test
    public void testGetNamespaceURI_NoNamespace() {
        assertNull(rootPointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_XmlNamespace() {
        assertEquals("http://www.w3.org/XML/1998/namespace", rootPointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetLanguage_NullLanguage() {
        assertTrue(rootPointer.isLanguage(null));
    }

    @Test
    public void testGetLanguage_ExplicitLang() {
        rootElement.setAttribute("xml:lang", "en-US");
        assertTrue(rootPointer.isLanguage("en"));
        assertFalse(rootPointer.isLanguage("fr"));
    }

    @Test
    public void testSetValue_ElementNode() {
        Element child = document.createElement("child");
        child.setTextContent("old");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, null);
        pointer.setValue("new-value");
        assertEquals("new-value", child.getTextContent());
    }

    @Test
    public void testSetValue_NullValueRemovesNode() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, null);
        pointer.setValue(null);
        assertNull(child.getParentNode());
    }

    @Test
    public void testTestNode_NullTest() {
        assertTrue(rootPointer.testNode(null));
    }

    @Test
    public void testTestNode_NodeNameTestMatch() {
        NodeNameTest test = new NodeNameTest(new QName(null, "root"), null, true);
        assertTrue(rootPointer.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTestText() {
        Text text = document.createTextNode("text");
        DOMNodePointer pointer = new DOMNodePointer(text, null);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        document.appendChild(pi);
        DOMNodePointer pointer = new DOMNodePointer(pi, null);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testGetValue_ElementNode() {
        Element element = document.createElement("example");
        element.setTextContent("Example Text");
        DOMNodePointer pointer = new DOMNodePointer(element, null);
        assertEquals("Example Text", pointer.getValue());
    }

    @Test
    public void testGetValue_NullValue() {
        Element element = document.createElement("example");
        DOMNodePointer pointer = new DOMNodePointer(element, null);
        assertEquals("", pointer.getValue());
    }

    @Test
    public void testHashCode_IdentityHashCode() {
        Element other = document.createElement("other");
        assertNotEquals(rootPointer.hashCode(), new DOMNodePointer(other, null).hashCode());
        assertEquals(System.identityHashCode(rootElement), rootPointer.hashCode());
    }

    @Test
    public void testEquals_SameInstance() {
        assertTrue(rootPointer.equals(rootPointer));
    }

    @Test
    public void testEquals_DifferentType() {
        assertFalse(rootPointer.equals(new Object()));
    }

    @Test
    public void testEquals_SameNode() {
        assertTrue(rootPointer.equals(new DOMNodePointer(rootElement, null)));
    }

    @Test
    public void testGetLength_AlwaysOne() {
        assertEquals(1, rootPointer.getLength());
    }

    @Test
    public void testIsCollection_False() {
        assertFalse(rootPointer.isCollection());
    }

    @Test
    public void testIsLeaf_WithChild() {
        rootElement.appendChild(document.createElement("child"));
        assertFalse(rootPointer.isLeaf());
    }

    @Test
    public void testIsLeaf_NoChildren() {
        assertTrue(rootPointer.isLeaf());
    }

    @Test
    public void testGetDefaultNamespaceURI_NoDefault() {
        assertNull(rootPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_WithDefault() {
        Element child = document.createElement("child");
        child.setAttribute("xmlns", "http://example.com");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, null);
        assertEquals("http://example.com", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetBaseValue() {
        assertSame(rootElement, rootPointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        assertSame(rootElement, rootPointer.getImmediateNode());
    }
}