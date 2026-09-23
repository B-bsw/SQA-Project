package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.*;
import org.jdom.input.SAXBuilder;
import java.io.StringReader;

public class JDOMNodePointerTest {

    private JDOMNodePointer pointer;
    private Element element;
    private Document document;
    private JXPathContext context;

    @Before
    public void setUp() throws Exception {
        String xml = "<root><child attr='value'>text</child><child2>text2</child2></root>";
        SAXBuilder builder = new SAXBuilder();
        document = builder.build(new StringReader(xml));
        element = document.getRootElement();
        pointer = new JDOMNodePointer(element, Locale.ENGLISH);
        context = JXPathContext.newContext(document);
    }

    @After
    public void tearDown() {
        pointer = null;
        element = null;
        document = null;
        context = null;
    }

    @Test
    public void testConstructors() {
        JDOMNodePointer p1 = new JDOMNodePointer(element, Locale.ENGLISH);
        assertNotNull(p1);
        assertEquals(element, p1.getBaseValue());
        JDOMNodePointer p2 = new JDOMNodePointer(element, Locale.ENGLISH, "id1");
        assertEquals("id1", p2.getBaseValue());
        assertNotSame(p1, p2);
    }

    @Test
    public void testGetNamespaceURI() {
        assertEquals(null, pointer.getNamespaceURI());
        Namespace ns = Namespace.getNamespace("prefix", "http://example.com");
        element.setNamespace(ns);
        assertEquals("http://example.com", pointer.getNamespaceURI());
        element.setNamespace(Namespace.NO_NAMESPACE);
        assertEquals(null, pointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIForPrefix() {
        Namespace ns = Namespace.getNamespace("pre", "http://example.com");
        element.addNamespaceDeclaration(ns);
        assertEquals("http://example.com", pointer.getNamespaceURI("pre"));
        assertEquals(null, pointer.getNamespaceURI("nonexistent"));
    }

    @Test
    public void testCompareChildNodePointers() {
        Element child1 = element.getChild("child");
        Element child2 = element.getChild("child2");
        JDOMNodePointer p1 = new JDOMNodePointer(child1, Locale.ENGLISH);
        JDOMNodePointer p2 = new JDOMNodePointer(child2, Locale.ENGLISH);
        assertEquals(-1, pointer.compareChildNodePointers(p1, p2));
        assertEquals(0, pointer.compareChildNodePointers(p1, p1));
        assertEquals(1, pointer.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointersWithAttributes() {
        Element child = element.getChild("child");
        Attribute attr = child.getAttribute("attr");
        JDOMNodePointer attrPointer = new JDOMNodePointer(attr, Locale.ENGLISH);
        JDOMNodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        assertEquals(-1, childPointer.compareChildNodePointers(attrPointer, childPointer));
        assertEquals(1, childPointer.compareChildNodePointers(childPointer, attrPointer));
    }

    @Test
    public void testGetBaseValue() {
        assertEquals(element, pointer.getBaseValue());
        JDOMNodePointer docPointer = new JDOMNodePointer(document, Locale.ENGLISH);
        assertEquals(document, docPointer.getBaseValue());
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
    public void testIsLeaf() {
        assertFalse(pointer.isLeaf());
        Element noChildren = new Element("empty");
        JDOMNodePointer emptyPointer = new JDOMNodePointer(noChildren, Locale.ENGLISH);
        assertTrue(emptyPointer.isLeaf());
        assertTrue(new JDOMNodePointer(new Document(), Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testGetName() {
        QName name = pointer.getName();
        assertEquals("root", name.getName());
        assertEquals("", name.getPrefix());
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer piPointer = new JDOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("target", piPointer.getName().getName());
    }

    @Test
    public void testGetImmediateNode() {
        assertEquals(element, pointer.getImmediateNode());
    }

    @Test
    public void testGetValue() {
        Element child = element.getChild("child");
        JDOMNodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        assertEquals("text", childPointer.getValue());
        Comment comment = new Comment(" comment ");
        JDOMNodePointer commentPointer = new JDOMNodePointer(new Element("x").addContent(comment).getContent().get(0), Locale.ENGLISH);
        assertEquals("comment", commentPointer.getValue());
        Text text = new Text(" text ");
        JDOMNodePointer textPointer = new JDOMNodePointer(text, Locale.ENGLISH);
        assertEquals("text", textPointer.getValue());
        CDATA cdata = new CDATA(" cdata ");
        JDOMNodePointer cdataPointer = new JDOMNodePointer(cdata, Locale.ENGLISH);
        assertEquals("cdata", cdataPointer.getValue());
        ProcessingInstruction pi = new ProcessingInstruction("target", " data ");
        JDOMNodePointer piPointer = new JDOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("data", piPointer.getValue());
        Element emptyElement = new Element("empty");
        JDOMNodePointer emptyPointer = new JDOMNodePointer(emptyElement, Locale.ENGLISH);
        assertEquals(null, emptyPointer.getValue());
    }

    @Test
    public void testSetValue() {
        Element child = element.getChild("child");
        JDOMNodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        childPointer.setValue("newText");
        assertEquals("newText", child.getTextTrim());
    }

    @Test
    public void testSetValueWithDifferentTypes() {
        Element child = element.getChild("child");
        JDOMNodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        childPointer.setValue(new Element("newElement"));
        assertTrue(child.getContent().size() == 1);
        assertTrue(child.getContent(0) instanceof Element);
        childPointer.setValue(document);
        assertTrue(child.getContent().size() > 0);
        childPointer.setValue(new Text("newText"));
        assertEquals("newText", child.getTextTrim());
        childPointer.setValue(new CDATA("cdata"));
        assertTrue(child.getContent().size() == 1);
        assertTrue(child.getContent(0) instanceof CDATA);
        childPointer.setValue(new ProcessingInstruction("target", "data"));
        assertTrue(child.getContent(0) instanceof ProcessingInstruction);
        childPointer.setValue(new Comment("comment"));
        assertTrue(child.getContent(0) instanceof Comment);
    }

    @Test
    public void testTestNode() {
        Element child = element.getChild("child");
        JDOMNodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        assertTrue(childPointer.testNode(null));
        NodeTypeTest nodeType = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(childPointer.testNode(nodeType));
        NodeNameTest nameTest = new NodeNameTest(new QName("child"));
        assertTrue(childPointer.testNode(nameTest));
        NodeNameTest wildcardTest = new NodeNameTest(new QName("*"));
        assertTrue(childPointer.testNode(wildcardTest));
    }

    @Test
    public void testTestNodeWithDifferentTypes() {
        Element child = element.getChild("child");
        JDOMNodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        NodeTypeTest textType = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse(childPointer.testNode(textType));
        Text text = new Text("text");
        JDOMNodePointer textPointer = new JDOMNodePointer(text, Locale.ENGLISH);
        assertTrue(textPointer.testNode(textType));
        CDATA cdata = new CDATA("cdata");
        JDOMNodePointer cdataPointer = new JDOMNodePointer(cdata, Locale.ENGLISH);
        assertTrue(cdataPointer.testNode(textType));
        NodeTypeTest commentType = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Comment comment = new Comment("comment");
        JDOMNodePointer commentPointer = new JDOMNodePointer(comment, Locale.ENGLISH);
        assertTrue(commentPointer.testNode(commentType));
        NodeTypeTest piType = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer piPointer = new JDOMNodePointer(pi, Locale.ENGLISH);
        assertTrue(piPointer.testNode(piType));
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target");
        assertTrue(piPointer.testNode(piTest));
        ProcessingInstructionTest wrongPiTest = new ProcessingInstructionTest("other");
        assertFalse(piPointer.testNode(wrongPiTest));
    }

    @Test
    public void testGetPrefix() {
        assertEquals(null, JDOMNodePointer.getPrefix(element));
        Namespace ns = Namespace.getNamespace("pre", "http://example.com");
        element.setNamespace(ns);
        assertEquals("pre", JDOMNodePointer.getPrefix(element));
        Attribute attr = element.getAttribute("attr");
        assertEquals("", JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetLocalName() {
        assertEquals("root", JDOMNodePointer.getLocalName(element));
        Attribute attr = element.getAttribute("attr");
        assertEquals("attr", JDOMNodePointer.getLocalName(attr));
    }

    @Test
    public void testIsLanguage() {
        assertFalse(pointer.isLanguage("en"));
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        assertTrue(pointer.isLanguage("EN"));
        assertTrue(pointer.isLanguage("en-US"));
    }

    @Test
    public void testGetLanguage() {
        assertNull(pointer.getLanguage());
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        assertEquals("en", pointer.getLanguage());
    }

    @Test
    public void testRemove() {
        Element child = element.getChild("child");
        JDOMNodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        childPointer.remove();
        assertNull(element.getChild("child"));
    }

    @Test
    public void testAsPath() {
        assertEquals("id('test')", new JDOMNodePointer(element, Locale.ENGLISH, "test").asPath());
        Element child = element.getChild("child");
        JDOMNodePointer childPointer = new JDOMNodePointer(child, Locale.ENGLISH);
        childPointer.asPath();
    }

    @Test
    public void testHashCodeAndEquals() {
        JDOMNodePointer samePointer = new JDOMNodePointer(element, Locale.ENGLISH);
        assertEquals(pointer.hashCode(), samePointer.hashCode());
        assertTrue(pointer.equals(samePointer));
        assertTrue(pointer.equals(pointer));
        assertFalse(pointer.equals(null));
        assertFalse(pointer.equals(new Object()));
        JDOMNodePointer otherPointer = new JDOMNodePointer(new Element("other"), Locale.ENGLISH);
        assertFalse(pointer.equals(otherPointer));
    }
}