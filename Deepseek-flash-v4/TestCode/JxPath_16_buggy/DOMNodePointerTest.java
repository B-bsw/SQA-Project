package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMNodePointerTest {
    private Document document;
    private Element root;
    private DOMNodePointer pointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        document = factory.newDocumentBuilder().newDocument();
        root = document.createElement("root");
        document.appendChild(root);
        pointer = new DOMNodePointer(root, null);
    }

    @Test
    public void testConstructorWithNodeAndLocale() {
        DOMNodePointer p = new DOMNodePointer(root, null);
        assertNotNull(p);
        assertSame(root, p.getImmediateNode());
    }

    @Test
    public void testConstructorWithId() {
        DOMNodePointer p = new DOMNodePointer(root, null, "testId");
        assertNotNull(p);
        assertEquals("id('testId')", p.asPath());
    }

    @Test
    public void testConstructorWithParent() {
        DOMNodePointer parent = new DOMNodePointer(root, null);
        DOMNodePointer child = new DOMNodePointer(parent, root);
        assertNotNull(child);
        assertSame(parent, child.getParent());
    }

    @Test
    public void testTestNodeWithNull() {
        assertTrue(pointer.testNode((NodeTest) null));
    }

    @Test
    public void testTestNodeNodeNameTest() {
        Element element = document.createElement("child");
        root.appendChild(element);
        NodeNameTest test = new NodeNameTest(new QName(null, "child"));
        DOMNodePointer p = new DOMNodePointer(element, null);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNodeNodeTypeTest() {
        Element element = document.createElement("child");
        root.appendChild(element);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        DOMNodePointer p = new DOMNodePointer(element, null);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        root.appendChild(pi);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        DOMNodePointer p = new DOMNodePointer(pi, null);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNodeIncorrectType() {
        Element element = document.createElement("child");
        root.appendChild(element);
        NodeNameTest test = new NodeNameTest(new QName(null, "wrong"));
        DOMNodePointer p = new DOMNodePointer(element, null);
        assertFalse(p.testNode(test));
    }

    @Test
    public void testGetNameForElement() {
        Element element = document.createElement("testElement");
        root.appendChild(element);
        DOMNodePointer p = new DOMNodePointer(element, null);
        QName name = p.getName();
        assertEquals("testElement", name.getName());
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("pi", "data");
        root.appendChild(pi);
        DOMNodePointer p = new DOMNodePointer(pi, null);
        QName name = p.getName();
        assertEquals("pi", name.getName());
    }

    @Test
    public void testGetNamespaceURIWithNullPrefix() {
        assertEquals(null, pointer.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURIXmlPrefix() {
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIXmlnsPrefix() {
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURINotFound() {
        assertNull(pointer.getNamespaceURI("nonexistent"));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        root.setAttribute("xmlns", "http://example.com");
        assertEquals("http://example.com", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURIEmpty() {
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetBaseValue() {
        assertSame(root, pointer.getBaseValue());
    }

    @Test
    public void testIsActual() {
        assertTrue(pointer.isActual());
    }

    @Test
    public void testIsCollection() {
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetLength() {
        assertEquals(1, pointer.getLength());
    }

    @Test
    public void testIsLeafWithChildren() {
        Element child = document.createElement("child");
        root.appendChild(child);
        assertFalse(pointer.isLeaf());
    }

    @Test
    public void testIsLeafNoChildren() {
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLanguage() {
        root.setAttribute("xml:lang", "en-US");
        assertTrue(pointer.isLanguage("en"));
        assertTrue(pointer.isLanguage("EN"));
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageNull() {
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testSetValueOnTextNode() throws Exception {
        Text text = document.createTextNode("hello");
        root.appendChild(text);
        DOMNodePointer p = new DOMNodePointer(text, null);
        p.setValue("world");
        assertEquals("world", text.getNodeValue());
    }

    @Test
    public void testSetValueOnElementClearsChildren() {
        Element child = document.createElement("child");
        root.appendChild(child);
        pointer.setValue("newValue");
        assertEquals("newValue", root.getTextContent());
    }

    @Test
    public void testSetValueWithNodeValue() {
        Element newChild = document.createElement("newChild");
        pointer.setValue(newChild);
        NodeList children = root.getChildNodes();
        boolean found = false;
        for (int i = 0; i < children.getLength(); i++) {
            if (children.item(i) instanceof Element) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testGetValueForComment() {
        Comment comment = document.createComment("comment");
        root.appendChild(comment);
        DOMNodePointer p = new DOMNodePointer(comment, null);
        assertEquals("", p.getValue());
    }

    @Test
    public void testGetValueForText() {
        Text text = document.createTextNode("textContent");
        root.appendChild(text);
        DOMNodePointer p = new DOMNodePointer(text, null);
        assertEquals("textContent", p.getValue());
    }

    @Test
    public void testGetValueForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        root.appendChild(pi);
        DOMNodePointer p = new DOMNodePointer(pi, null);
        assertEquals("data", p.getValue());
    }

    @Test
    public void testGetPointerByID() {
        Element idElement = document.createElement("item");
        idElement.setAttribute("id", "item1");
        root.appendChild(idElement);
        DOMNodePointer p = new DOMNodePointer(root, null);
        assertNull(p.getPointerByID(null, "item1"));
    }

    @Test
    public void testCompareChildNodePointersSameNode() {
        assertEquals(0, pointer.compareChildNodePointers(pointer, pointer));
    }

    @Test
    public void testHashCodeConsistency() {
        DOMNodePointer p1 = new DOMNodePointer(root, null);
        DOMNodePointer p2 = new DOMNodePointer(root, null);
        assertEquals(p1.hashCode(), p1.hashCode());
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testEqualsSameObject() {
        DOMNodePointer p = new DOMNodePointer(root, null);
        assertEquals(p, p);
    }

    @Test
    public void testEqualsDifferentObject() {
        DOMNodePointer p1 = new DOMNodePointer(root, null);
        Element otherRoot = document.createElement("other");
        DOMNodePointer p2 = new DOMNodePointer(otherRoot, null);
        assertNotEquals(p1, p2);
    }

    @Test
    public void testGetLocalNameWithPrefix() {
        Element elem = document.createElementNS("http://example.com", "prefix:local");
        assertEquals("local", DOMNodePointer.getLocalName(elem));
    }

    @Test
    public void testGetLocalNameWithoutPrefix() {
        Element elem = document.createElement("local");
        assertEquals("local", DOMNodePointer.getLocalName(elem));
    }

    @Test
    public void testGetPrefixWithPrefix() {
        Element elem = document.createElementNS("http://example.com", "prefix:local");
        assertEquals("prefix", DOMNodePointer.getPrefix(elem));
    }

    @Test
    public void testGetPrefixWithoutPrefix() {
        Element elem = document.createElement("local");
        assertNull(DOMNodePointer.getPrefix(elem));
    }

    @Test
    public void testGetNamespaceURIWithElement() {
        Element elem = document.createElementNS("http://example.com", "prefix:local");
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(elem));
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer p = new DOMNodePointer(root, null, "specialId");
        assertEquals("id('specialId')", p.asPath());
    }

    @Test
    public void testAsPathWithRoot() {
        DOMNodePointer p = new DOMNodePointer(document, null);
        assertEquals("/", p.asPath());
    }
}