package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import org.jdom.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JDOMNodePointerTest {

    private Element element;
    private Document document;
    private Text text;
    private CDATA cdata;
    private Comment comment;
    private ProcessingInstruction pi;
    private Attribute attribute;
    private Locale locale;
    private JDOMNodePointer elementPointer;
    private JDOMNodePointer documentPointer;
    private JDOMNodePointer textPointer;
    private JDOMNodePointer cdataPointer;
    private JDOMNodePointer commentPointer;
    private JDOMNodePointer piPointer;

    @Before
    public void setUp() {
        locale = Locale.US;
        element = new Element("root", "ns", "http://example.com");
        element.setText("  text  ");
        document = new Document(new Element("doc"));
        text = new Text("hello");
        cdata = new CDATA("world");
        comment = new Comment("comment");
        pi = new ProcessingInstruction("target", "data");
        attribute = new Attribute("attr", "value");
        elementPointer = new JDOMNodePointer(element, locale);
        documentPointer = new JDOMNodePointer(document, locale);
        textPointer = new JDOMNodePointer(text, locale);
        cdataPointer = new JDOMNodePointer(cdata, locale);
        commentPointer = new JDOMNodePointer(comment, locale);
        piPointer = new JDOMNodePointer(pi, locale);
    }

    @Test
    public void testConstructors() {
        assertNotNull(new JDOMNodePointer(element, locale));
        assertNotNull(new JDOMNodePointer(element, locale, "id1"));
        assertEquals("id1", new JDOMNodePointer(element, locale, "id1").asPath());
        JDOMNodePointer parent = new JDOMNodePointer(element, locale);
        JDOMNodePointer child = new JDOMNodePointer(parent, text);
        assertSame(parent, child.getParent());
    }

    @Test
    public void testIsLeaf() {
        assertFalse(elementPointer.isLeaf());
        element.removeContent();
        assertTrue(elementPointer.isLeaf());
        assertFalse(documentPointer.isLeaf());
        Document emptyDoc = new Document();
        assertTrue(new JDOMNodePointer(emptyDoc, locale).isLeaf());
        assertTrue(textPointer.isLeaf());
        assertTrue(cdataPointer.isLeaf());
        assertTrue(commentPointer.isLeaf());
        assertTrue(piPointer.isLeaf());
    }

    @Test
    public void testGetValue() {
        assertEquals("text", elementPointer.getValue());
        assertEquals("comment", commentPointer.getValue());
        assertEquals("hello", textPointer.getValue());
        assertEquals("world", cdataPointer.getValue());
        assertEquals("data", piPointer.getValue());
        assertNull(new JDOMNodePointer(new Element("x"), locale).getValue());
        assertNull(new JDOMNodePointer(new Document(), locale).getValue());
    }

    @Test
    public void testSetValueOnTextNode() {
        Text txt = new Text("old");
        JDOMNodePointer p = new JDOMNodePointer(txt, locale);
        p.setValue("new");
        assertEquals("new", txt.getText());
        Element parent = new Element("parent");
        parent.addContent(txt);
        p.setValue("");
        assertTrue(parent.getContent().isEmpty());
    }

    @Test
    public void testSetValueOnElementWithString() {
        Element el = new Element("el");
        JDOMNodePointer p = new JDOMNodePointer(el, locale);
        p.setValue("value");
        assertEquals("value", el.getTextTrim());
        el.removeContent();
        p.setValue("");
        assertTrue(el.getContent().isEmpty());
    }

    @Test
    public void testSetValueOnElementWithElement() {
        Element el = new Element("el");
        JDOMNodePointer p = new JDOMNodePointer(el, locale);
        Element child = new Element("child");
        p.setValue(child);
        assertEquals(1, el.getContent().size());
        assertTrue(el.getContent().get(0) instanceof Element);
        assertEquals("child", ((Element) el.getContent().get(0)).getName());
    }

    @Test
    public void testTestNode() {
        NodeNameTest nameTest = new NodeNameTest(new QName("root"));
        assertTrue(elementPointer.testNode(nameTest));
        NodeNameTest wrongNameTest = new NodeNameTest(new QName("wrong"));
        assertFalse(elementPointer.testNode(wrongNameTest));
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"), null, true);
        assertTrue(elementPointer.testNode(wildcardTest));
        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertFalse(elementPointer.testNode(textTest));
        assertTrue(textPointer.testNode(textTest));
        assertTrue(cdataPointer.testNode(textTest));
        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(commentPointer.testNode(commentTest));
        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(piPointer.testNode(piTest));
        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(elementPointer.testNode(nodeTest));
        assertFalse(textPointer.testNode(nodeTest));
        ProcessingInstructionTest piTest2 = new ProcessingInstructionTest("target");
        assertTrue(piPointer.testNode(piTest2));
        ProcessingInstructionTest wrongPiTest = new ProcessingInstructionTest("other");
        assertFalse(piPointer.testNode(wrongPiTest));
        assertTrue(elementPointer.testNode(null));
    }

    @Test
    public void testCompareChildNodePointers() {
        Element parent = new Element("parent");
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        parent.addContent(child1);
        parent.addContent(child2);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        NodePointer ptr1 = new JDOMNodePointer(parentPtr, child1);
        NodePointer ptr2 = new JDOMNodePointer(parentPtr, child2);
        assertEquals(-1, parentPtr.compareChildNodePointers(ptr1, ptr2));
        assertEquals(1, parentPtr.compareChildNodePointers(ptr2, ptr1));
        assertEquals(0, parentPtr.compareChildNodePointers(ptr1, ptr1));
        Attribute attr = new Attribute("a", "v");
        parent.setAttribute(attr);
        NodePointer attrPtr = new JDOMNodePointer(parentPtr, attr);
        assertEquals(-1, parentPtr.compareChildNodePointers(attrPtr, ptr1));
        assertEquals(1, parentPtr.compareChildNodePointers(ptr1, attrPtr));
        Attribute attr2 = new Attribute("b", "v");
        parent.setAttribute(attr2);
        NodePointer attrPtr2 = new JDOMNodePointer(parentPtr, attr2);
        assertEquals(-1, parentPtr.compareChildNodePointers(attrPtr, attrPtr2));
        assertEquals(1, parentPtr.compareChildNodePointers(attrPtr2, attrPtr));
        try {
            textPointer.compareChildNodePointers(ptr1, ptr2);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test
    public void testGetNamespaceURI() {
        assertEquals("http://example.com", elementPointer.getNamespaceURI());
        Element noNs = new Element("noNs");
        assertNull(new JDOMNodePointer(noNs, locale).getNamespaceURI());
        assertNull(textPointer.getNamespaceURI());
        assertNull(documentPointer.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIWithPrefix() {
        Element root = new Element("root", "http://default");
        Document doc = new Document(root);
        JDOMNodePointer docPtr = new JDOMNodePointer(doc, locale);
        assertNull(docPtr.getNamespaceURI("non-existent"));
        Element el = new Element("el", "pre", "http://prefix");
        JDOMNodePointer elPtr = new JDOMNodePointer(el, locale);
        assertEquals("http://prefix", elPtr.getNamespaceURI("pre"));
        assertNull(elPtr.getNamespaceURI("unknown"));
        assertNull(textPointer.getNamespaceURI("pre"));
    }

    @Test
    public void testAsPath() {
        JDOMNodePointer idPtr = new JDOMNodePointer(element, locale, "myId");
        assertTrue(idPtr.asPath().contains("id('myId')"));
        JDOMNodePointer rootPtr = new JDOMNodePointer(element, locale);
        assertTrue(rootPtr.asPath().startsWith("/"));
        assertTrue(rootPtr.asPath().contains("root"));
        Element parent = new Element("parent");
        Text txt = new Text("text");
        parent.addContent(txt);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        JDOMNodePointer txtPtr = new JDOMNodePointer(parentPtr, txt);
        assertTrue(txtPtr.asPath().contains("/text()"));
        Element piParent = new Element("piParent");
        ProcessingInstruction pi2 = new ProcessingInstruction("mytarget", "data");
        piParent.addContent(pi2);
        JDOMNodePointer piParentPtr = new JDOMNodePointer(piParent, locale);
        JDOMNodePointer piPtr = new JDOMNodePointer(piParentPtr, pi2);
        assertTrue(piPtr.asPath().contains("processing-instruction('mytarget')"));
    }

    @Test
    public void testRemove() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);
        childPtr.remove();
        assertTrue(parent.getContent().isEmpty());
        try {
            parentPtr.remove();
            fail("Expected JXPathException");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        }
    }

    @Test
    public void testCreateAttribute() {
        Element el = new Element("el", "pre", "http://pre");
        JDOMNodePointer elPtr = new JDOMNodePointer(el, locale);
        NodePointer attrPtr = elPtr.createAttribute(null, new QName("pre", "localName"));
        assertNotNull(attrPtr);
        assertTrue(el.getAttribute("localName", Namespace.getNamespace("pre", "http://pre")) != null);
        Element el2 = new Element("el2");
        JDOMNodePointer el2Ptr = new JDOMNodePointer(el2, locale);
        NodePointer attrPtr2 = el2Ptr.createAttribute(null, new QName("attrName"));
        assertNotNull(attrPtr2);
        assertTrue(el2.getAttribute("attrName") != null);
        try {
            textPointer.createAttribute(null, new QName("x"));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test
    public void testIsLanguage() {
        Element el = new Element("el");
        el.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        JDOMNodePointer elPtr = new JDOMNodePointer(el, locale);
        assertTrue(elPtr.isLanguage("en"));
        assertTrue(elPtr.isLanguage("EN"));
        assertTrue(elPtr.isLanguage("en-US"));
        assertFalse(elPtr.isLanguage("fr"));
        Element el2 = new Element("el2");
        JDOMNodePointer el2Ptr = new JDOMNodePointer(el2, locale);
        assertFalse(el2Ptr.isLanguage("en"));
    }

    @Test
    public void testEqualsAndHashCode() {
        JDOMNodePointer p1 = new JDOMNodePointer(element, locale);
        JDOMNodePointer p2 = new JDOMNodePointer(element, locale);
        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
        JDOMNodePointer p3 = new JDOMNodePointer(text, locale);
        assertNotEquals(p1, p3);
        assertNotEquals(p1, null);
        assertNotEquals(p1, "string");
    }

    @Test
    public void testGetBaseValueAndImmediateNode() {
        assertSame(element, elementPointer.getBaseValue());
        assertSame(element, elementPointer.getImmediateNode());
    }

    @Test
    public void testGetLanguage() {
        Element el = new Element("el");
        el.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        JDOMNodePointer p = new JDOMNodePointer(el, locale);
        assertEquals("en", p.getLanguage());
        Element parent = new Element("parent");
        parent.setAttribute("lang", "fr", Namespace.XML_NAMESPACE);
        parent.addContent(el);
        assertEquals("en", p.getLanguage());
        Element el2 = new Element("el2");
        parent.addContent(el2);
        JDOMNodePointer p2 = new JDOMNodePointer(parent, locale);
        JDOMNodePointer p2child = new JDOMNodePointer(p2, el2);
        assertEquals("fr", p2child.getLanguage());
        Element orphan = new Element("orphan");
        assertNull(new JDOMNodePointer(orphan, locale).getLanguage());
    }

    @Test
    public void testStaticHelpers() {
        Element el = new Element("el", "pre", "http://pre");
        assertEquals("pre", JDOMNodePointer.getPrefix(el));
        Element noPrefix = new Element("no");
        assertNull(JDOMNodePointer.getPrefix(noPrefix));
        Attribute attr = new Attribute("a", "v", Namespace.getNamespace("pre", "uri"));
        assertEquals("pre", JDOMNodePointer.getPrefix(attr));
        assertNull(JDOMNodePointer.getPrefix(text));
        assertEquals("el", JDOMNodePointer.getLocalName(el));
        assertEquals("a", JDOMNodePointer.getLocalName(attr));
        assertNull(JDOMNodePointer.getLocalName(text));
        Element el2 = new Element("el2", "ns2", "http://ns2");
        assertTrue(JDOMNodePointer.testNode(null, el2, null));
        NodeNameTest nameTest = new NodeNameTest(new QName("el2"));
        assertTrue(JDOMNodePointer.testNode(null, el2, nameTest));
    }

    @Test
    public void testIsCollectionAndGetLength() {
        assertFalse(elementPointer.isCollection());
        assertEquals(1, elementPointer.getLength());
    }

    @Test
    public void testGetName() {
        QName name = elementPointer.getName();
        assertEquals("ns", name.getPrefix());
        assertEquals("root", name.getName());
        QName piName = piPointer.getName();
        assertEquals("target", piName.getName());
    }

    @Test
    public void testNamespaceIteratorAndPointer() {
        assertNotNull(elementPointer.namespaceIterator());
        assertNotNull(elementPointer.namespacePointer("ns"));
    }

    @Test
    public void testAttributeIterator() {
        assertNotNull(elementPointer.attributeIterator(new QName("attr")));
    }

    @Test
    public void testChildIterator() {
        assertNotNull(elementPointer.childIterator(null, false, null));
    }
}