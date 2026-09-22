package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMNodePointerTest {
    private Document document;
    private Element element;
    private DOMNodePointer pointer;

    @Before
    public void setUp() throws Exception {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        element = document.createElement("test");
        document.appendChild(element);
        pointer = new DOMNodePointer(element, Locale.getDefault());
    }

    @Test
    public void testConstructorWithLocale() {
        DOMNodePointer p = new DOMNodePointer(element, Locale.US);
        assertNotNull(p);
        assertEquals(element, p.getBaseValue());
    }

    @Test
    public void testConstructorWithId() {
        DOMNodePointer p = new DOMNodePointer(element, Locale.US, "testId");
        assertNotNull(p);
        assertEquals("id('testId')", p.asPath());
    }

    @Test
    public void testTestNodeNull() {
        assertTrue(DOMNodePointer.testNode(element, null));
    }

    @Test
    public void testTestNodeNameMatch() {
        NodeNameTest test = new NodeNameTest(new QName(null, "test"));
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeNameNoMatch() {
        NodeNameTest test = new NodeNameTest(new QName(null, "other"));
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testTestNodeTypeElement() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeTypeText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testTestNodeProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        document.appendChild(pi);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testGetNameElement() {
        QName name = pointer.getName();
        assertEquals("test", name.getName());
    }

    @Test
    public void testGetNameProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("pi", "data");
        DOMNodePointer p = new DOMNodePointer(pi, Locale.getDefault());
        assertEquals("pi", p.getName().getName());
    }

    @Test
    public void testGetNamespaceURIWithPrefix() {
        element.setAttribute("xmlns:prefix", "http://example.com");
        assertEquals("http://example.com", pointer.getNamespaceURI("prefix"));
    }

    @Test
    public void testGetNamespaceURIUnknownPrefix() {
        String ns = pointer.getNamespaceURI("unknown");
        assertTrue(ns == null || ns.equals(NodePointer.UNKNOWN_NAMESPACE));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        element.setAttribute("xmlns", "http://example.com");
        assertEquals("http://example.com", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testIsLeaf() {
        assertTrue(pointer.isLeaf());
        element.appendChild(document.createTextNode("text"));
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLanguage() {
        element.setAttribute("xml:lang", "en-US");
        assertTrue(pointer.isLanguage("en"));
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testSetValueTextNode() {
        Node textNode = document.createTextNode("");
        element.appendChild(textNode);
        DOMNodePointer p = new DOMNodePointer(textNode, Locale.getDefault());
        p.setValue("new text");
        assertEquals("new text", textNode.getNodeValue());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChildFailure() {
        JXPathContext context = JXPathContext.newContext(document);
        pointer.createChild(context, new QName(null, "test"), 0);
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEqualsDifferentTypes() {
        assertFalse(pointer.equals("string"));
    }

    @Test
    public void testEqualsSameNodeDifferentObject() {
        DOMNodePointer p2 = new DOMNodePointer(element, Locale.getDefault());
        assertTrue(pointer.equals(p2));
    }
}