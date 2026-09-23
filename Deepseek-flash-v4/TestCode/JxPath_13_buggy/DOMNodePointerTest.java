package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

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
    public void testConstructorWithNodeAndLocale() {
        Element element = document.createElement("test");
        DOMNodePointer pointer = new DOMNodePointer(element, null);
        assertSame(element, pointer.getBaseValue());
        assertEquals("test", pointer.getName().getName());
        assertNull(pointer.getNamespaceURI());
    }

    @Test
    public void testConstructorWithId() {
        Element element = document.createElement("test");
        DOMNodePointer pointer = new DOMNodePointer(element, null, "123");
        assertEquals("id('123')", pointer.asPath());
    }

    @Test
    public void testConstructorWithParent() {
        Element child = document.createElement("child");
        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);
        assertSame(rootPointer, childPointer.getParent());
        assertEquals("child", childPointer.getName().getName());
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcard() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestMatchingName() {
        NodeNameTest test = new NodeNameTest(new QName(null, "root"));
        assertTrue(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNonMatchingName() {
        NodeNameTest test = new NodeNameTest(new QName(null, "other"));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNonElementNodeAndNameTest() {
        Text textNode = document.createTextNode("text");
        NodeNameTest test = new NodeNameTest(new QName(null, "root"));
        assertFalse(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(org.apache.commons.jxpath.ri.Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(rootElement, test));
        assertTrue(DOMNodePointer.testNode(document, test));
        assertFalse(DOMNodePointer.testNode(document.createTextNode("text"), test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        NodeTypeTest test = new NodeTypeTest(org.apache.commons.jxpath.ri.Compiler.NODE_TYPE_TEXT);
        Text textNode = document.createTextNode("text");
        assertTrue(DOMNodePointer.testNode(textNode, test));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(org.apache.commons.jxpath.ri.Compiler.NODE_TYPE_COMMENT);
        Comment comment = document.createComment("comment");
        assertTrue(DOMNodePointer.testNode(comment, test));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestPI() {
        NodeTypeTest test = new NodeTypeTest(org.apache.commons.jxpath.ri.Compiler.NODE_TYPE_PI);
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(pi, test));
        assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
        ProcessingInstructionTest nonMatching = new ProcessingInstructionTest("other");
        assertFalse(DOMNodePointer.testNode(pi, nonMatching));
    }

    @Test
    public void testGetNameForElement() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "http://example.com");
        DOMNodePointer pointer = new DOMNodePointer(element, null);
        QName name = pointer.getName();
        assertEquals("prefix", name.getPrefix());
        assertEquals("local", name.getName());
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer pointer = new DOMNodePointer(pi, null);
        QName name = pointer.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNamespaceURINullPrefix() {
        Element element = document.createElement("root");
        element.setAttribute("xmlns", "http://example.com");
        DOMNodePointer pointer = new DOMNodePointer(element, null);
        assertEquals("http://example.com", pointer.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURIEmptyPrefix() {
        Element element = document.createElement("root");
        element.setAttribute("xmlns", "http://example.com");
        DOMNodePointer pointer = new DOMNodePointer(element, null);
        assertEquals("http://example.com", pointer.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURIXmlPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertEquals("http://www.w3.org/XML/1998/namespace", pointer.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIXmlnsPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertEquals("http://www.w3.org/2000/xmlns/", pointer.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURIWithPrefixFromMap() {
        Element child = document.createElement("child");
        child.setAttribute("xmlns:custom", "http://custom.example.com");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, null);
        assertEquals("http://custom.example.com", pointer.getNamespaceURI("custom"));
    }

    @Test
    public void testGetNamespaceURIWithUnknownPrefix() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertNull(pointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIWithPrefixFromParent() {
        rootElement.setAttribute("xmlns:parent", "http://parent.example.com");
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(child, null);
        assertEquals("http://parent.example.com", pointer.getNamespaceURI("parent"));
    }

    @Test
    public void testGetNamespaceURIWithPrefixOnDocument() {
        Document doc = document;
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:docprefix", "http://doc.example.com");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, null);
        assertEquals("http://doc.example.com", pointer.getNamespaceURI("docprefix"));
    }

    @Test
    public void testGetNamespaceURIWithPrefixOnDocumentElement() {
        Document doc = document;
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:docelement", "http://docelement.example.com");
        doc.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(doc, null);
        assertEquals("http://docelement.example.com", pointer.getNamespaceURI("docelement"));
    }

    @Test
    public void testGetDefaultNamespaceURIWithNamespace() {
        rootElement.setAttribute("xmlns", "http://default.example.com");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertEquals("http://default.example.com", pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURIWithEmptyNamespace() {
        rootElement.setAttribute("xmlns", "");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURINoNamespace() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertNull(pointer.getDefaultNamespaceURI());
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
    public void testIsLeafWithChildren() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        assertFalse(rootPointer.isLeaf());
    }

    @Test
    public void testIsLeafWithoutChildren() {
        assertTrue(rootPointer.isLeaf());
    }

    @Test
    public void testIsLanguageWithMatchingLang() {
        rootElement.setAttribute("xml:lang", "en-US");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertTrue(pointer.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithNonMatchingLang() {
        rootElement.setAttribute("xml:lang", "en-US");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testIsLanguageWithNoLang() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertFalse(pointer.isLanguage("en"));
    }

    @Test
    public void testFindEnclosingAttributeWithMatchingAttribute() {
        rootElement.setAttribute("custom-attr", "value");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertEquals("value", DOMNodePointer.findEnclosingAttribute(rootElement, "custom-attr"));
    }

    @Test
    public void testFindEnclosingAttributeWithoutMatchingAttribute() {
        assertNull(DOMNodePointer.findEnclosingAttribute(rootElement, "nonexistent"));
    }

    @Test
    public void testGetValueForTextNode() {
        Text textNode = document.createTextNode("hello");
        DOMNodePointer pointer = new DOMNodePointer(textNode, null);
        assertEquals("hello", pointer.getValue());
    }

    @Test
    public void testGetValueForCommentNode() {
        Comment comment = document.createComment("comment");
        DOMNodePointer pointer = new DOMNodePointer(comment, null);
        assertEquals("", pointer.getValue());
    }

    @Test
    public void testGetValueForProcessingInstructionNode() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer pointer = new DOMNodePointer(pi, null);
        assertEquals("target data", pointer.getValue());
    }

    @Test
    public void testGetValueForElement() {
        rootElement.appendChild(document.createTextNode("text content"));
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertEquals("text content", pointer.getValue());
    }

    @Test
    public void testSetValueWithString() {
        Text textNode = document.createTextNode("old");
        DOMNodePointer pointer = new DOMNodePointer(textNode, null);
        pointer.setValue("new");
        assertEquals("new", textNode.getNodeValue());
    }

    @Test
    public void testSetValueWithNode() {
        Element newChild = document.createElement("newChild");
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        pointer.setValue(newChild);
        assertSame(newChild, rootElement.getFirstChild());
    }

    @Test
    public void testSetValueWithNull() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        pointer.setValue(null);
        assertNull(rootElement.getFirstChild());
    }

    @Test
    public void testSetValueWithEmptyString() {
        Text textNode = document.createTextNode("old");
        DOMNodePointer pointer = new DOMNodePointer(textNode, null);
        pointer.setValue("");
        assertNull(textNode.getNodeValue());
    }

    @Test
    public void testSetValueWithElement() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        pointer.setValue(child);
        assertSame(child, rootElement.getFirstChild());
    }

    @Test
    public void testCreateChildWithValidContext() throws Exception {
        JXPathContext context = JXPathContext.newContext(rootPointer.getBaseValue());
        NodePointer childPointer = rootPointer.createChild(context, new QName(null, "child"), 0);
        assertNotNull(childPointer);
        assertEquals("child", childPointer.getName().getName());
        assertEquals(1, rootElement.getChildNodes().getLength());
    }

    @Test
    public void testCreateChildWithIndexWHOLE_COLLECTION() {
        JXPathContext context = JXPathContext.newContext(rootPointer.getBaseValue());
        NodePointer childPointer = rootPointer.createChild(context, new QName(null, "child"), NodePointer.WHOLE_COLLECTION);
        assertNotNull(childPointer);
        assertEquals("child", childPointer.getName().getName());
    }

    @Test
    public void testCreateChildWithIndexMatchingExisting() {
        Element existing = document.createElement("existing");
        rootElement.appendChild(existing);
        JXPathContext context = JXPathContext.newContext(rootPointer.getBaseValue());
        NodePointer childPointer = rootPointer.createChild(context, new QName(null, "existing"), 0);
        assertNotNull(childPointer);
        assertEquals("existing", childPointer.getName().getName());
    }

    @Test
    public void testCreateChildWithValue() {
        JXPathContext context = JXPathContext.newContext(rootPointer.getBaseValue());
        NodePointer childPointer = rootPointer.createChild(context, new QName(null, "child"), 0, "value");
        assertNotNull(childPointer);
        assertEquals("value", childPointer.getValue());
        assertEquals("value", rootElement.getChildNodes().item(0).getTextContent());
    }

    @Test
    public void testCreateChildWithFactory() {
        // Test with a factory that creates the element
        JXPathContext context = JXPathContext.newContext(rootPointer.getBaseValue());
        context.setFactory(new AbstractFactory() {
            @Override
            public Object createObject(JXPathContext context, Pointer pointer, org.apache.commons.jxpath.ri.model.NodePointer parent, QName name, int index) {
                Element element = document.createElement(name.getName());
                ((DOMNodePointer) parent).getBaseValue().appendChild(element);
                return element;
            }
        });
        NodePointer childPointer = rootPointer.createChild(context, new QName(null, "factoryChild"), 0);
        assertNotNull(childPointer);
        assertEquals("factoryChild", childPointer.getName().getName());
    }

    @Test
    public void testCreateAttributeWithElement() {
        JXPathContext context = JXPathContext.newContext(rootPointer.getBaseValue());
        NodePointer attrPointer = rootPointer.createAttribute(context, new QName(null, "attr"));
        assertNotNull(attrPointer);
        assertTrue(rootElement.hasAttribute("attr"));
    }

    @Test
    public void testCreateAttributeWithNonElement() {
        Text textNode = document.createTextNode("text");
        DOMNodePointer pointer = new DOMNodePointer(textNode, null);
        JXPathContext context = JXPathContext.newContext(pointer.getBaseValue());
        NodePointer attrPointer = pointer.createAttribute(context, new QName(null, "attr"));
        assertNotNull(attrPointer);
    }

    @Test
    public void testCreateAttributeWithExistingAttribute() {
        rootElement.setAttribute("attr", "old");
        JXPathContext context = JXPathContext.newContext(rootPointer.getBaseValue());
        NodePointer attrPointer = rootPointer.createAttribute(context, new QName(null, "attr"));
        assertNotNull(attrPointer);
        assertEquals("old", rootElement.getAttribute("attr"));
    }

    @Test
    public void testCreateAttributeWithPrefixAndNamespace() throws Exception {
        JXPathContext context = JXPathContext.newContext(rootPointer.getBaseValue());
        NodePointer attrPointer = rootPointer.createAttribute(context, new QName("prefix", "local"));
        assertNotNull(attrPointer);
        assertTrue(rootElement.hasAttribute("prefix:local"));
    }

    @Test
    public void testRemoveWithParent() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(rootPointer, child);
        pointer.remove();
        assertEquals(0, rootElement.getChildNodes().getLength());
    }

    @Test
    public void testRemoveWithoutParent() {
        try {
            rootPointer.remove();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Cannot remove root"));
        }
    }

    @Test
    public void testAsPathWithId() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null, "123");
        assertEquals("id('123')", pointer.asPath());
    }

    @Test
    public void testAsPathWithIdContainingSpecialChars() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null, "a'b\"c\\d");
        assertEquals("id('a\\'b\\\"c\\\\d')", pointer.asPath());
    }

    @Test
    public void testAsPathForRootElement() {
        assertEquals("/root", rootPointer.asPath());
    }

    @Test
    public void testAsPathForNestedChild() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(rootPointer, child);
        assertEquals("/root/child", pointer.asPath());
    }

    @Test
    public void testAsPathForAttribute() {
        rootElement.setAttribute("attr", "value");
        Attr attr = (Attr) rootElement.getAttributes().getNamedItem("attr");
        DOMNodePointer pointer = new DOMNodePointer(rootPointer, attr);
        assertEquals("/root/@attr", pointer.asPath());
    }

    @Test
    public void testAsPathForIndexedChild() {
        Element child1 = document.createElement("child");
        rootElement.appendChild(child1);
        Element child2 = document.createElement("child");
        rootElement.appendChild(child2);
        DOMNodePointer pointer = new DOMNodePointer(rootPointer, child2);
        assertEquals("/root/child[2]", pointer.asPath());
    }

    @Test
    public void testAsPathForTextNode() {
        Text textNode = document.createTextNode("text");
        rootElement.appendChild(textNode);
        DOMNodePointer pointer = new DOMNodePointer(rootPointer, textNode);
        assertEquals("/root/text()", pointer.asPath());
    }

    @Test
    public void testAsPathForProcessingInstruction() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        rootElement.appendChild(pi);
        DOMNodePointer pointer = new DOMNodePointer(rootPointer, pi);
        assertEquals("/root/processing-instruction('target')", pointer.asPath());
    }

    @Test
    public void testHashCodeConsistency() {
        Element element = document.createElement("test");
        DOMNodePointer p1 = new DOMNodePointer(element, null);
        DOMNodePointer p2 = new DOMNodePointer(element, null);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testEqualsWithSameInstance() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEqualsWithDifferentType() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertFalse(pointer.equals("string"));
    }

    @Test
    public void testEqualsWithNull() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, null);
        assertFalse(pointer.equals(null));
    }

    @Test
    public void testEqualsWithOtherNode() {
        Element otherElement = document.createElement("other");
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, null);
        DOMNodePointer pointer2 = new DOMNodePointer(otherElement, null);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    public void testEqualsWithSameNodeButDifferentInstance() {
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, null);
        DOMNodePointer pointer2 = new DOMNodePointer(rootElement, null);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    public void testEqualsWithSameObject() {
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, null);
        DOMNodePointer pointer2 = new DOMNodePointer(pointer1.getParent(), rootElement);
        assertTrue(pointer1.equals(pointer2));
    }

    @Test
    public void testGetPrefixWithNamespace() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "http://example.com");
        assertEquals("prefix", DOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetPrefixWithoutNamespace() {
        Element element = document.createElement("local");
        assertEquals("", DOMNodePointer.getPrefix(element));
    }

    @Test
    public void testGetLocalNameWithPrefix() {
        Element element = document.createElement("prefix:local");
        assertEquals("local", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetLocalNameWithoutPrefix() {
        Element element = document.createElement("local");
        assertEquals("local", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetLocalNameWithEmptyString() {
        Element element = document.createElement("");
        assertEquals("", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetLocalNameWithNullNode() {
        Element element = document.createElement("local");
        element.setAttribute("xmlns:prefix", "http://example.com");
        element.setAttribute("xmlns", "http://example.com");
        assertEquals("local", DOMNodePointer.getLocalName(element));
    }

    @Test
    public void testGetNamespaceURIWithDocument() throws Exception {
        Document doc = document;
        Element root = doc.createElement("root");
        root.setAttribute("xmlns", "http://example.com");
        doc.appendChild(root);
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(doc));
    }

    @Test
    public void testGetNamespaceURIWithDocumentAndPrefix() throws Exception {
        Document doc = document;
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:pref", "http://pref.example.com");
        doc.appendChild(root);
        assertEquals("http://pref.example.com", DOMNodePointer.getNamespaceURI(doc));
    }

    @Test
    public void testGetNamespaceURIWithElement() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "http://example.com");
        assertEquals("http://example.com", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndNoNamespace() {
        Element element = document.createElement("local");
        assertNull(DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndRelativeUri() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "../relative");
        // Relative URIs are not resolved, so return as-is
        assertEquals("../relative", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndEmptyString() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "");
        assertEquals("", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndParentNamespace() {
        Element parent = document.createElement("parent");
        parent.setAttribute("xmlns:pref", "http://parent.example.com");
        rootElement.appendChild(parent);
        Element child = document.createElement("child");
        parent.appendChild(child);
        assertEquals("http://parent.example.com", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testGetNamespaceURIWithElementAndNamespaceFromAttribute() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "http://attr.example.com");
        // Namespace is in the element itself
        assertEquals("http://attr.example.com", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndNamespaceFromAttributeWithPrefix() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "http://attr.example.com");
        assertEquals("http://attr.example.com", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndNamespaceFromAttributeWithDefault() {
        Element element = document.createElement("local");
        element.setAttribute("xmlns", "http://default.example.com");
        assertEquals("http://default.example.com", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndNamespaceFromAttributeWithDefaultAndPrefix() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "http://prefix.example.com");
        element.setAttribute("xmlns", "http://default.example.com");
        assertEquals("http://prefix.example.com", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndNamespaceFromAttributeWithPrefixAndDefault() {
        Element element = document.createElement("prefix:local");
        element.setAttribute("xmlns:prefix", "http://prefix.example.com");
        element.setAttribute("xmlns", "http://default.example.com");
        assertEquals("http://prefix.example.com", DOMNodePointer.getNamespaceURI(element));
    }

    @Test
    public void testGetNamespaceURIWithElementAndNamespaceFromAttributeWithPrefixAndDefaultWithParentNamespace() {
        Element parent = document.createElement("parent");
        parent.setAttribute("xmlns:prefix", "http://parent.example.com");
        rootElement.appendChild(parent);
        Element child = document.createElement("prefix:local");
        parent.appendChild(child);
        child.setAttribute("xmlns:prefix", "http://child.example.com");
        assertEquals("http://child.example.com", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testCompareChildNodePointers() {
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);
        DOMNodePointer p1 = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer p2 = new DOMNodePointer(rootPointer, child2);
        assertEquals(-1, rootPointer.compareChildNodePointers(p1, p2));
        assertEquals(0, rootPointer.compareChildNodePointers(p1, p1));
        assertEquals(1, rootPointer.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointersWithAttribute() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        rootElement.setAttribute("attr", "value");
        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);
        DOMNodePointer attrPointer = new DOMNodePointer(rootPointer, rootElement.getAttributes().getNamedItem("attr"));
        assertEquals(-1, rootPointer.compareChildNodePointers(childPointer, attrPointer));
        assertEquals(1, rootPointer.compareChildNodePointers(attrPointer, childPointer));
    }

    @Test
    public void testCompareChildNodePointersWithSameNode() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer pointer = new DOMNodePointer(rootPointer, child);
        assertEquals(0, rootPointer.compareChildNodePointers(pointer, pointer));
    }
}