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
        rootPointer = new DOMNodePointer(document, null);
    }

    @Test
    public void testConstructorWithId() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null, "id123");
        assertNotNull(pointer);
        assertEquals("id('id123')", pointer.asPath());
    }

    @Test
    public void testTestNode_NullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNode_ElementNotMatchingName() {
        NodeNameTest test = new NodeNameTest(new org.apache.commons.jxpath.ri.QName("wrong"));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNode_ElementMatchingName() {
        rootElement.setAttribute("xmlns:prefix", "http://example.com");
        NodeNameTest test = new NodeNameTest(new org.apache.commons.jxpath.ri.QName("prefix", "root"));
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNode_WildcardWithNullPrefix() {
        NodeNameTest test = new NodeNameTest(new org.apache.commons.jxpath.ri.QName(null, "*"));
        org.apache.commons.jxpath.ri.QName wildcardName = new org.apache.commons.jxpath.ri.QName("*");
        assertTrue(DOMNodePointer.testNode(rootElement, new NodeNameTest(wildcardName)));
    }

    @Test
    public void testTestNode_NodeTypeTestText() {
        Element textElement = document.createElement("text");
        textElement.appendChild(document.createTextNode("sample"));
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(textElement.getFirstChild(), test));
    }

    @Test
    public void testTestNode_NodeTypeTestComment() {
        Comment comment = document.createComment("comment");
        rootElement.appendChild(comment);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(comment, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        rootElement.appendChild(pi);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testGetName_Element() {
        Element element = document.createElement("elem");
        DOMNodePointer pointer = new DOMNodePointer(element, null);
        org.apache.commons.jxpath.ri.QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("elem", name.getName());
    }

    @Test
    public void testGetName_ProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer pointer = new DOMNodePointer(pi, null);
        org.apache.commons.jxpath.ri.QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNamespaceURI_XmlPrefix() {
        assertEquals("http://www.w3.org/XML/1998/namespace", rootPointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURI_XmlnsPrefix() {
        assertEquals("http://www.w3.org/2000/xmlns/", rootPointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURI_NullOrEmpty() {
        assertNull(rootPointer.getNamespaceURI(null));
        assertNull(rootPointer.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURI_FromElement() {
        rootElement.setAttribute("xmlns:test", "http://test.com");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertEquals("http://test.com", pointer.getNamespaceURI("test"));
    }

    @Test
    public void testGetDefaultNamespaceURI_NoAttr() {
        assertNull(rootPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetBaseValue() {
        assertSame(rootElement, rootPointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        assertSame(rootElement, rootPointer.getImmediateNode());
    }

    @Test
    public void testIsLeaf_WithChildren() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        assertFalse(rootPointer.isLeaf());
    }

    @Test
    public void testIsLeaf_NoChildren() {
        assertTrue(rootPointer.isLeaf());
    }

    @Test
    public void testIsLanguage_WithLanguage() {
        rootElement.setAttribute("xml:lang", "en-US");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_WithoutLanguage() {
        assertFalse(rootPointer.isLanguage("en"));
    }

    @Test
    public void testSetValue_TextNode() {
        Element textElement = document.createElement("text");
        textElement.appendChild(document.createTextNode("old"));
        DOMNodePointer pointer = new DOMNodePointer(textElement.getFirstChild(), null);
        pointer.setValue("new");
        assertEquals("new", textElement.getFirstChild().getNodeValue());
    }

    @Test
    public void testSetValue_NullValue() {
        Element textElement = document.createElement("text");
        textElement.appendChild(document.createTextNode("old"));
        DOMNodePointer pointer = new DOMNodePointer(textElement.getFirstChild(), null);
        pointer.setValue(null);
        assertNull(textElement.getFirstChild().getParentNode());
    }

    @Test
    public void testSetValue_EmptyStringValue() {
        Element textElement = document.createElement("text");
        textElement.appendChild(document.createTextNode("old"));
        DOMNodePointer pointer = new DOMNodePointer(textElement.getFirstChild(), null);
        pointer.setValue("");
        assertNull(textElement.getFirstChild().getParentNode());
    }

    @Test
    public void testSetValue_ElementWithStringValue() {
        Element element = document.createElement("elem");
        DOMNodePointer pointer = new DOMNodePointer(element, null);
        pointer.setValue("value");
        assertEquals("value", element.getTextContent());
    }

    @Test
    public void testHashCode_Consistent() {
        assertEquals(rootPointer.hashCode(), rootPointer.hashCode());
    }

    @Test
    public void testEquals_SameObject() {
        assertTrue(rootPointer.equals(rootPointer));
    }

    @Test
    public void testEquals_Null() {
        assertFalse(rootPointer.equals(null));
    }

    @Test
    public void testEquals_DifferentNode() {
        Element other = document.createElement("other");
        DOMNodePointer otherPointer = new DOMNodePointer(other, null);
        assertFalse(rootPointer.equals(otherPointer));
    }

    @Test
    public void testEquals_SameNode() {
        DOMNodePointer samePointer = new DOMNodePointer(rootElement, null);
        assertTrue(rootPointer.equals(samePointer));
    }

    @Test
    public void testGetValue_CommentNode() {
        Comment comment = document.createComment("data");
        DOMNodePointer pointer = new DOMNodePointer(comment, null);
        assertEquals("data", pointer.getValue());
    }

    @Test
    public void testGetValue_TextNode() {
        Element textElement = document.createElement("text");
        textElement.appendChild(document.createTextNode("content"));
        DOMNodePointer pointer = new DOMNodePointer(textElement.getFirstChild(), null);
        assertEquals("content", pointer.getValue());
    }

    @Test
    public void testGetValue_ProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer pointer = new DOMNodePointer(pi, null);
        assertEquals("data", pointer.getValue());
    }

    @Test
    public void testGetValue_CDataNode() {
        Element cdataElement = document.createElement("cdata");
        cdataElement.appendChild(document.createCDATASection("<content>"));
        DOMNodePointer pointer = new DOMNodePointer(cdataElement.getFirstChild(), null);
        assertEquals("<content>", pointer.getValue());
    }

    @Test
    public void testGetPointerByID_NotFound() {
        assertNull(rootPointer.getPointerByID(null, "nonexistent"));
    }

    @Test
    public void testGetPointerByID_Found() {
        Element target = document.createElement("target");
        target.setAttribute("id", "123");
        rootElement.appendChild(target);
        DOMNodePointer pointer = rootPointer.getPointerByID(null, "123");
        assertNotNull(pointer);
        assertSame(target, pointer.getBaseValue());
    }

    @Test
    public void testCompareChildNodePointers_SameNode() {
        DOMNodePointer p1 = new DOMNodePointer(rootElement, null);
        DOMNodePointer p2 = new DOMNodePointer(rootElement, null);
        assertEquals(0, rootPointer.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCreateAttribute_OnElement() {
        org.apache.commons.jxpath.ri.QName name = new org.apache.commons.jxpath.ri.QName("attr");
        NodePointer attr = rootPointer.createAttribute(null, name);
        assertNotNull(attr);
        assertEquals("attr", ((Attr) attr.getImmediateNode()).getName());
    }

    @Test(expected = org.apache.commons.jxpath.JXPathException.class)
    public void testCreateAttribute_UnknownPrefix() {
        rootElement.setAttribute("xmlns:known", "http://known.com");
        org.apache.commons.jxpath.ri.QName name = new org.apache.commons.jxpath.ri.QName("unknown", "attr");
        rootPointer.createAttribute(null, name);
    }

    @Test
    public void testGetNamespaceResolver_NotNull() {
        assertNotNull(rootPointer.getNamespaceResolver());
    }

    @Test
    public void testChildIterator() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        NodeIterator iterator = rootPointer.childIterator(null, false, null);
        assertNotNull(iterator);
        assertTrue(iterator.setPosition(1));
        assertSame(child, iterator.getNodePointer().getImmediateNode());
    }

    @Test
    public void testGetLength() {
        assertEquals(1, rootPointer.getLength());
    }

    @Test
    public void testIsActual() {
        assertTrue(rootPointer.isActual());
    }

    @Test
    public void testIsCollection() {
        assertFalse(rootPointer.isCollection());
    }
}