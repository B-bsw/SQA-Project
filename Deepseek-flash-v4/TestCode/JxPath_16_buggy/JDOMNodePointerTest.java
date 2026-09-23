package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import org.jdom.*;
import org.apache.commons.jxpath.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.*;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.util.TypeUtils;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

public class JDOMNodePointerTest {

    private Element element;
    private Document document;
    private JDOMNodePointer pointer;

    private void setUpElement() {
        element = new Element("root", "http://example.com");
        element.setAttribute("id", "1");
        element.setText("hello");
        document = new Document(element);
        pointer = new JDOMNodePointer(document, Locale.ENGLISH);
    }

    @Test
    public void testConstructorWithLocale() {
        Element e = new Element("test");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.US);
        assertNotNull(p);
        assertEquals(e, p.getBaseValue());
        assertEquals(Locale.US, p.getLocale());
        assertNull(p.getParent());
    }

    @Test
    public void testConstructorWithId() {
        Element e = new Element("test");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.US, "myId");
        assertNotNull(p);
        assertEquals("myId", p.asPath().substring(4, p.asPath().length() - 2));
    }

    @Test
    public void testChildIterator() {
        setUpElement();
        Element child = new Element("child");
        element.addContent(child);
        NodeIterator it = pointer.childIterator(null, false, null);
        assertNotNull(it);
        int count = 0;
        while (it.setPosition(it.getPosition() + 1)) {
            count++;
            assertNotNull(it.getNodePointer());
        }
        assertTrue(count > 0);
    }

    @Test
    public void testAttributeIterator() {
        setUpElement();
        element.setAttribute("attr1", "value1");
        NodeIterator it = pointer.attributeIterator(new QName("attr1"));
        assertNotNull(it);
        int count = 0;
        while (it.setPosition(it.getPosition() + 1)) {
            count++;
        }
        assertTrue(count >= 1);
    }

    @Test
    public void testNamespaceIterator() {
        setUpElement();
        element.addNamespaceDeclaration("pre", "http://namespace");
        NodeIterator it = pointer.namespaceIterator();
        assertNotNull(it);
        int count = 0;
        while (it.setPosition(it.getPosition() + 1)) {
            count++;
        }
        assertTrue(count > 0);
    }

    @Test
    public void testNamespacePointer() {
        setUpElement();
        NodePointer np = pointer.namespacePointer("xml");
        assertNotNull(np);
        assertEquals("http://www.w3.org/XML/1998/namespace", np.getName().getName());
    }

    @Test
    public void testGetNamespaceURIWithElement() {
        setUpElement();
        String ns = pointer.getNamespaceURI();
        assertNull(ns);
    }

    @Test
    public void testGetNamespaceURIWithPrefix() {
        setUpElement();
        element.addNamespaceDeclaration("pre", "http://example.com/ns");
        assertEquals("http://example.com/ns", pointer.getNamespaceURI("pre"));
        assertEquals("http://www.w3.org/XML/1998/namespace", pointer.getNamespaceURI("xml"));
        assertNull(pointer.getNamespaceURI("nonexistent"));
    }

    @Test
    public void testGetNamespaceURIForDocumentNode() {
        Document doc = new Document();
        doc.setRootElement(new Element("root"));
        JDOMNodePointer p = new JDOMNodePointer(doc, Locale.ENGLISH);
        assertNull(p.getNamespaceURI("non"));
    }

    @Test
    public void testGetNamespaceResolver() {
        setUpElement();
        assertNotNull(pointer.getNamespaceResolver());
    }

    @Test
    public void testCompareChildNodePointers() {
        setUpElement();
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        element.addContent(child1);
        element.addContent(child2);
        NodePointer p1 = new JDOMNodePointer(this, child1);
        NodePointer p2 = new JDOMNodePointer(this, child2);
        assertEquals(-1, pointer.compareChildNodePointers(p1, p2));
        assertEquals(1, pointer.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointersNull() {
        setUpElement();
        assertEquals(0, pointer.compareChildNodePointers(null, null));
    }

    @Test
    public void testGetBaseValue() {
        setUpElement();
        assertNotNull(pointer.getBaseValue());
    }

    @Test
    public void testIsCollection() {
        setUpElement();
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetName() {
        setUpElement();
        assertEquals("", pointer.getName().getPrefix());
        assertEquals("root", pointer.getName().getName());
    }

    @Test
    public void testGetImmediateNode() {
        setUpElement();
        assertNotNull(pointer.getImmediateNode());
    }

    @Test
    public void testGetValueWithText() {
        setUpElement();
        element.setText("   hello   ");
        assertEquals("   hello   ", pointer.getValue());
    }

    @Test
    public void testGetValueWithComment() {
        Comment comment = new Comment("   comment text   ");
        Document doc = new Document();
        doc.addContent(comment);
        JDOMNodePointer p = new JDONodePointer(doc, Locale.ENGLISH);
        assertEquals("comment text", p.getValue());
    }

    @Test
    public void testGetValueWithProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data   ");
        Document doc = new Document();
        doc.addContent(pi);
        JDOMNodePointer p = new JDOMNodePointer(doc, Locale.ENGLISH);
        assertEquals("data", p.getValue());
    }

    @Test
    public void testSetValueOnText() {
        setUpElement();
        Text text = new Text("old");
        element.setTextContent(text);
        JDOMNodePointer p = new JDOMNodePointer(text, Locale.ENGLISH);
        p.setValue("new");
        assertEquals("new", text.getText());
    }

    @Test
    public void testSetValueOnEmptyText() {
        Text text = new Text("");
        JDOMNodePointer p = new JDOMNodePointer(text, Locale.ENGLISH);
        p.setValue("");
        assertNotNull(text.getParent());
    }

    @Test
    public void testSetValueOnElement() {
        setUpElement();
        Element target = new Element("target");
        pointer.setValue(target);
        assertEquals("target", element.getContent(0).getValue());
    }

    @Test
    public void testSetValueOnDocument() {
        Element old = new Element("old");
        document.setRootElement(old);
        setUpElement();
        Element source = new Element("newElem");
        source.addContent(new Text("text"));
        JDOMNodePointer p = new JDOMNodePointer(old, Locale.ENGLISH);
        p.setValue(source);
        assertEquals("text", old.getContent(0).getValue());
    }

    @Test
    public void testTestNodeReturnsTrueForNullTest() {
        setUpElement();
        assertTrue(pointer.testNode(null));
    }

    @Test
    public void testTestNodeWithNodeTypeTest() {
        setUpElement();
        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_ELEMENT);
        assertTrue(pointer.testNode(nodeTest));
    }

    @Test
    public void testTestNodeWithPITest() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer p = new JDOMNodePointer(pi, Locale.ENGLISH);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(JDOMNodePointer.testNode(p, pi, test));
    }

    @Test
    public void testTestNodeWithNameTestWildcard() {
        setUpElement();
        NodeNameTest test = new NodeNameTest(new QName("*"), true);
        assertTrue(pointer.testNode(test));
    }

    @Test
    public void testTestNodeWithFalseName() {
        setUpElement();
        NodeNameTest test = new NodeNameTest(new QName("wrong"));
        assertFalse(pointer.testNode(test));
    }

    @Test
    public void testEqualStrings() {
        assertTrue(JDOMNodePointer.equalStrings(null, null));
        assertTrue(JDOMNodePointer.equalStrings(null, ""));
        assertFalse(JDOMNodePointer.equalStrings("a", "b"));
    }

    @Test
    public void testGetPrefixWithElementPrefix() {
        Element e = new Element("prefix", "local", "http://uri");
        assertEquals("prefix", JDOMNodePointer.getPrefix(e));
        Element e2 = new Element("local", "http://uri");
        assertNull(JDOMNodePointer.getPrefix(e2));
    }

    @Test
    public void testGetLocalNameWithElement() {
        Element e = new Element("local");
        assertEquals("local", JDOMNodePointer.getLocalName(e));
    }

    @Test
    public void testIsLanguageWithNullCurrent() {
        setUpElement();
        assertTrue(pointer.isLanguage("EN"));
    }

    @Test
    public void testGetLanguageWithEnclosing() {
        Element parent = new Element("parent");
        parent.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        parent.addContent(child);
        JDOMNodePointer p = new JDONodePointer(child, Locale.ENGLISH);
        assertEquals("en", p.getLanguage());
    }

    @Test
    public void testFindEnclosingAttributeWithExisting() {
        Element parent = new Element("parent");
        parent.setAttribute("lang", "fr", Namespace.XML_NAMESPACE);
        assertEquals("fr", JDOMNodePointer.findEnclosingAttribute(parent, "lang", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testFindEnclosingAttributeWithNoLang() {
        Element parent = new Element("parent");
        assertNull(JDOMNodePointer.findEnclosingAttribute(parent, "lang", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testNodeParent() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);
        assertSame(parent, JDOMNodePointer.nodeParent(child));
    }

    @Test
    public void testHashCode() {
        setUpElement();
        assertEquals(System.identityHashCode(document), pointer.hashCode());
    }

    @Test
    public void testEqualsWithSelf() {
        setUpElement();
        assertEquals(pointer, pointer);
    }

    @Test
    public void testEqualsWithDifferent() {
        setUpElement();
        assertNotEquals(pointer, new Object());
        assertNotEquals(pointer, new JDOMNodePointer(element, Locale.ENGLISH));
    }
}