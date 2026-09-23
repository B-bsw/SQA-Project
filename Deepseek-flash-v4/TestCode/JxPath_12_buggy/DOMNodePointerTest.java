package org.apache.commons.jxpath.ri.model.dom;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Locale;

import static org.junit.Assert.*;

public class DOMNodePointerTest {

    private Document document;
    private Element root;
    private DOMNodePointer rootPointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        document = factory.newDocumentBuilder().newDocument();
        root = document.createElement("root");
        root.setAttribute("xmlns:test", "http://example.com/test");
        root.setAttribute("id", "rootId");
        document.appendChild(root);
        rootPointer = new DOMNodePointer(document, Locale.ENGLISH);
    }

    @After
    public void tearDown() {
        document = null;
        root = null;
        rootPointer = null;
    }

    @Test
    public void testConstructorWithNodeAndLocale() {
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        assertNotNull(pointer);
        assertEquals(root, pointer.getBaseValue());
    }

    @Test
    public void testConstructorWithId() {
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US, "testId");
        assertNotNull(pointer);
        assertEquals("id('testId')", pointer.asPath());
    }

    @Test
    public void testTestNodeNull() {
        assertTrue(DOMNodePointer.testNode(root, null));
    }

    @Test
    public void testTestNodeWithNullNode() {
        NodeTypeTest test = new NodeTypeTest(1);
        assertFalse(DOMNodePointer.testNode(null, test));
    }

    @Test
    public void testTestNodeWithNameTestAndNullPrefix() {
        QName qName = new QName("test", "root");
        NodeNameTest test = new NodeNameTest(qName);
        assertTrue(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testTestNodeWithWildcard() {
        QName qName = new QName(null, "*");
        NodeNameTest test = new NodeNameTest(qName);
        assertTrue(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testTestNodeWithNodeType() {
        NodeTypeTest test = new NodeTypeTest(1);
        assertTrue(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testTestNodeWithNodeTypeNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testTestNodeWithNodeTypeText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testTestNodeWithNodeTypeComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertFalse(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testTestNodeWithNodeTypePI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertFalse(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testTestNodeWithProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testGetName() {
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ENGLISH);
        QName name = pointer.getName();
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetNameWithPrefix() {
        Element element = document.createElementNS("http://example.com/test", "t:child");
        Attribute attr = document.createAttributeNS("http://example.com/test", "t:attr");
        root.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);
        QName name = pointer.getName();
        assertNotNull(name.getName());
    }

    @Test
    public void testGetNamespaceURI() {
        Element element = document.createElementNS("http://example.com", "test:child");
        root.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);
        assertNotNull(pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIWithNullPrefix() {
        assertNotNull(rootPointer.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURIWithEmptyPrefix() {
        assertNotNull(rootPointer.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURIWithXmlPrefix() {
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, rootPointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIWithXmlnsPrefix() {
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, rootPointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURIWithUnknownPrefix() {
        Element element = document.createElementNS("http://example.com/test", "t:child");
        root.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);
        assertNull(pointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        Element element = document.createElementNS("http://example.com/default", "d:child");
        element.setAttribute("xmlns", "http://example.com/default");
        root.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);
        assertNotNull(pointer.getNamespaceURI(""));
    }

    @Test
    public void testGetBaseValue() {
        assertEquals(root, rootPointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        assertEquals(root, rootPointer.getImmediateNode());
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
    public void testIsLeaf() {
        assertFalse(rootPointer.isLeaf());
        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLanguageWithLang() {
        Element element = document.createElement("child");
        element.setAttribute("xml:lang", "en-US");
        root.appendChild(element);
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithNoLang() {
        assertFalse(rootPointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithNull() {
        assertFalse(rootPointer.isLanguage(null));
    }

    @Test
    public void testFindEnclosingAttribute() {
        Element child = document.createElement("child");
        child.setAttribute("data-test", "value");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("value", DOMNodePointer.findEnclosingAttribute(child, "data-test"));
    }

    @Test
    public void testGetLanguage() {
        Element child = document.createElement("child");
        child.setAttribute("xml:lang", "fr-FR");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("fr-FR", pointer.getLanguage());
    }

    @Test
    public void testSetValueWithString() {
        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        pointer.setValue("newValue");
        assertEquals("newValue", child.getTextContent());
    }

    @Test
    public void testSetValueWithNullString() {
        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        pointer.setValue(null);
        assertEquals("", child.getTextContent());
    }

    @Test
    public void testCompareChildNodePointers() {
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);
        DOMNodePointer pointer1 = new DOMNodePointer(child1, Locale.ENGLISH);
        DOMNodePointer pointer2 = new DOMNodePointer(child2, Locale.ENGLISH);
        assertEquals(-1, rootPointer.compareChildNodePointers(pointer1, pointer2));
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals(0, rootPointer.compareChildNodePointers(pointer, pointer));
    }

    @Test
    public void testCompareChildNodePointersAttributeVsElement() {
        root.setAttribute("attr", "value");
        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer attrPointer = new DOMNodePointer(root, Locale.ENGLISH).getAttributePointer();
        DOMNodePointer elementPointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals(-1, attrPointer.compareChildNodePointers(attrPointer, elementPointer));
    }

    @Test
    public void testHashCode() {
        assertNotNull(rootPointer.hashCode());
    }

    @Test
    public void testEqualsWithSameObject() {
        assertTrue(rootPointer.equals(rootPointer));
    }

    @Test
    public void testEqualsWithDifferentObject() {
        DOMNodePointer other = new DOMNodePointer(root, Locale.FRENCH);
        assertTrue(rootPointer.equals(other));
    }

    @Test
    public void testEqualsWithNull() {
        assertFalse(rootPointer.equals(null));
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ENGLISH, "testId");
        assertEquals("id('testId')", pointer.asPath());
    }

    @Test
    public void testGetValue() {
        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        Element nested = document.createElement("nested");
        child.appendChild(nested);
        assertEquals("", pointer.getValue());
    }

    @Test
    public void testGetValueWithTextNode() {
        Element child = document.createElement("child");
        child.setTextContent("some text");
        root.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        assertNotNull(pointer.getValue());
    }

    @Test
    public void testGetValueWithComment() {
        Comment comment = document.createComment("comment");
        root.appendChild(comment);
        DOMNodePointer pointer = new DOMNodePointer(comment, Locale.ENGLISH);
        assertEquals("", pointer.getValue());
    }
}