package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.*;
import org.jdom.Text;

import java.util.Locale;

public class JDOMNodePointerTest {

    private JDOMNodePointer pointer;
    private Element element;
    private Document document;
    private Attribute attribute;
    private Text textNode;
    private CDATA cdataNode;
    private Comment comment;
    private ProcessingInstruction pi;

    @Before
    public void setUp() {
        element = new Element("root");
        document = new Document(element);
        attribute = new Attribute("attr", "value", Namespace.XML_NAMESPACE);
        textNode = new Text("text content");
        cdataNode = new CDATA("cdata content");
        comment = new Comment("comment");
        pi = new ProcessingInstruction("target", "data");
        pointer = new JDOMNodePointer(element, Locale.ENGLISH);
    }

    @Test
    public void testConstructorWithId() {
        JDOMNodePointer p = new JDOMNodePointer(element, Locale.ENGLISH, "id1");
        assertNotNull(p);
        assertEquals("id('id1')", p.asPath());
    }

    @Test
    public void testConstructorWithParentAndNode() {
        JDOMNodePointer parent = new JDOMNodePointer(document, Locale.ENGLISH);
        JDOMNodePointer child = new JDOMNodePointer(parent, element);
        assertNotNull(child);
        assertEquals(element, child.getImmediateNode());
    }

    @Test
    public void testGetNameForElement() {
        Element e = new Element("child", "https://example.com/ns");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        QName name = p.getName();
        assertNotNull(name);
        assertEquals("child", name.getName());
        assertEquals("https://example.com/ns", name.getNamespaceURI());
    }

    @Test
    public void testGetNameForProcessingInstruction() {
        JDOMNodePointer p = new JDOMNodePointer(pi, Locale.ENGLISH);
        QName name = p.getName();
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetNameForAttribute() {
        Attribute attr = new Attribute("myAttr", "val");
        JDOMNodePointer p = new JDOMNodePointer(attr, Locale.ENGLISH);
        QName name = p.getName();
        assertEquals("myAttr", name.getName());
    }

    @Test
    public void testGetNameForNullNode() {
        JDOMNodePointer p = new JDOMNodePointer(null, Locale.ENGLISH);
        QName name = p.getName();
        assertNull(name);
    }

    @Test
    public void testIsLeafElementWithChildren() {
        element.addContent(new Element("sub"));
        assertFalse(new JDOMNodePointer(element, Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testIsLeafElementWithoutChildren() {
        assertTrue(new JDOMNodePointer(element, Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testIsLeafDocument() {
        assertFalse(new JDOMNodePointer(document, Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testGetValueForElement() {
        Element e = new Element("root");
        e.addContent(new Text("Hello "));
        e.addContent(new Element("child"));
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        assertEquals("Hello ", p.getValue());
    }

    @Test
    public void testGetValueForCommentTrims() {
        Comment c = new Comment("  comment text  ");
        JDOMNodePointer p = new JDOMNodePointer(c, Locale.ENGLISH);
        assertEquals("comment text", p.getValue());
    }

    @Test
    public void testGetValueForProcessingInstruction() {
        ProcessingInstruction p = new ProcessingInstruction("target", "some data");
        JDOMNodePointer np = new JDOMNodePointer(p, Locale.ENGLISH);
        assertEquals("some data", np.getValue());
    }

    @Test
    public void testGetValueForTextTrimsByDefault() {
        Text t = new Text("  padded text  ");
        JDOMNodePointer np = new JDOMNodePointer(t, Locale.ENGLISH);
        assertEquals("padded text", np.getValue());
    }

    @Test
    public void testSetValueForTextWithNonEmptyString() {
        Text t = new Text("old");
        JDOMNodePointer np = new JDOMNodePointer(t, Locale.ENGLISH);
        np.setValue("new");
        assertEquals("new", t.getText());
    }

    @Test
    public void testSetValueForTextWithEmptyString() {
        Text t = new Text("old");
        JDOMNodePointer np = new JDOMNodePointer(t, Locale.ENGLISH);
        np.setValue("");
        assertNull(t.getParent());
    }

    @Test
    public void testSetValueOnElementWithElementValue() {
        Element target = new Element("target");
        Element valueElement = new Element("value");
        valueElement.addContent(new Text("text"));
        JDOMNodePointer np = new JDOMNodePointer(target, Locale.ENGLISH);
        np.setValue(valueElement);
        assertEquals(1, target.getContentSize());
        assertTrue(target.getContent(0) instanceof Element);
    }

    @Test
    public void testSetValueOnElementWithTextValue() {
        Element target = new Element("target");
        Text valueText = new Text("some text");
        JDOMNodePointer np = new JDOMNodePointer(target, Locale.ENGLISH);
        np.setValue(valueText);
        assertEquals(1, target.getContentSize());
        assertTrue(target.getContent(0) instanceof Text);
    }

    @Test
    public void testSetValueOnElementWithProcessingInstruction() {
        Element target = new Element("target");
        ProcessingInstruction valuePi = new ProcessingInstruction("t", "d");
        JDOMNodePointer np = new JDOMNodePointer(target, Locale.ENGLISH);
        np.setValue(valuePi);
        assertTrue(target.getContent(0) instanceof ProcessingInstruction);
    }

    @Test
    public void testTestNodeWithNullTest() {
        assertTrue(JDOMNodePointer.testNode(pointer, element, null));
    }

    @Test
    public void testTestNodeWithNodeNameTestName() {
        NodeNameTest test = new NodeNameTest(new QName("root"));
        assertTrue(JDOMNodePointer.testNode(pointer, element, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestWildcard() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*", null));
        assertTrue(JDOMNodePointer.testNode(pointer, element, test));
    }

    @Test
    public void testTestNodeWithNodeNameTestNoMatch() {
        NodeNameTest test = new NodeNameTest(new QName("wrong"));
        assertFalse(JDOMNodePointer.testNode(pointer, element, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestText() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(JDOMNodePointer.testNode(pointer, textNode, test));
        assertTrue(JDOMNodePointer.testNode(pointer, cdataNode, test));
        assertFalse(JDOMNodePointer.testNode(pointer, element, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestComment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(JDOMNodePointer.testNode(pointer, comment, test));
        assertFalse(JDOMNodePointer.testNode(pointer, element, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestPI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(JDOMNodePointer.testNode(pointer, pi, test));
        assertFalse(JDOMNodePointer.testNode(pointer, element, test));
    }

    @Test
    public void testTestNodeWithNodeTypeTestNode() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(JDOMNodePointer.testNode(pointer, element, test));
        assertFalse(JDOMNodePointer.testNode(pointer, textNode, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestMatching() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(JDOMNodePointer.testNode(pointer, pi, test));
    }

    @Test
    public void testTestNodeWithProcessingInstructionTestNotMatching() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(JDOMNodePointer.testNode(pointer, pi, test));
    }

    @Test
    public void testEqualStringsBothNull() {
        assertTrue(JDOMNodePointer.equalStrings(null, null));
    }

    @Test
    public void testEqualStringsOneNullOtherEmpty() {
        assertTrue(JDOMNodePointer.equalStrings(null, "  "));
    }

    @Test
 public void testEqualStringsTrimComparison() {
        assertTrue(JDOMNodePointer.equalStrings("  a ", "a"));
    }

    @Test
    public void testGetPrefixForElementWithNoNamespace() {
        Element e = new Element("plain");
        assertNull(JDOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefixForElementWithNamespace() {
        Element e = new Element("pre:child", "uri");
        e.setNamespace(Namespace.getNamespace("pre", "uri"));
        assertEquals("pre", JDOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefixForAttributeWithNamespace() {
        Namespace ns = Namespace.getNamespace("pre", "uri");
        Attribute attr = new Attribute("a", "v", ns);
        assertEquals("pre", JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetPrefixForAttributeWithoutNamespace() {
        Attribute attr = new Attribute("a", "v");
        assertNull(JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetLocalNameForElement() {
        Element e = new Element("localName");
        assertEquals("localName", JDOMNodePointer.getLocalName(e));
    }

    @Test
    public void testGetLocalNameForAttribute() {
        Attribute attr = new Attribute("attrName");
        assertEquals("attrName", JDOMNodePointer.getLocalName(attr));
    }

    @Test
    public void testIsLanguageWithNullCurrent() {
        JDONodePointer p = new JDONodePointer(element, Locale.ENGLISH) {
            @Override
            protected String getLanguage() {
                return null;
            }
        };
        assertTrue(p.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithMatchingPrefix() {
        JDONodePointer p = new JDONodePointer(element, Locale.ENGLISH) {
            @Override
            protected String getLanguage() {
                return "en-US";
            }
        };
        assertTrue(p.isLanguage("en"));
    }

    @Test
    public void testIsLanguageWithNonMatching() {
        JDONodePointer p = new JDONodePointer(element, Locale.ENGLISH) {
            @Override
            protected String getLanguage() {
                return "fr";
            }
        };
        assertFalse(p.isLanguage("en"));
    }

    @Test
    public void testFindEnclosingAttributeFound() {
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        assertEquals("en", JDONodePointer.findEnclosingAttribute(element, "lang", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testFindEnclosingAttributeNotFound() {
        assertNull(JDONodePointer.findEnclosingAttribute(element, "lang", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testNodeParentForElement() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);
        assertEquals(parent, JDONodePointer.nodeParent(child));
    }

    @Test
    public void testNodeParentForTextWithParent() {
        Element parent = new Element("parent");
        Text text = new Text("hello");
        parent.addContent(text);
        assertEquals(parent, JDONodePointer.nodeParent(text));
    }

    @Test
    public void testNodeParentForTextWithoutParent() {
        Text text = new Text("hello");
        assertNull(JDONodePointer.nodeParent(text));
    }

    @Test
    public void testNodeParentForCDATAWithParent() {
        Element parent = new Element("parent");
        CDATA cdata = new CDATA("content");
        parent.addContent(cdata);
        assertEquals(parent, JDONodePointer.nodeParent(cdata));
    }

    @Test
    public void testNodeParentForProcessingInstruction() {
        Element parent = new Element("parent");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        parent.addContent(pi);
        assertEquals(parent, JDONodePointer.nodeParent(pi));
    }

    @Test
    public void testNodeParentForComment() {
        Element parent = new Element("parent");
        Comment comment = new Comment("comment");
        parent.addContent(comment);
        assertEquals(parent, JDONodePointer.nodeParent(comment));
    }

    @Test
    public void testEqualsSameObject() {
        JDONodePointer p1 = new JDONodePointer(element, Locale.ENGLISH);
        assertTrue(p1.equals(p1));
    }

    @Test
    public void testEqualsDifferentClass() {
        JDONodePointer p1 = new JDONodePointer(element, Locale.ENGLISH);
        assertFalse(p1.equals("string"));
    }

    @Test
    public void testEqualsSameNode() {
        JDONodePointer p1 = new JDONodePointer(element, Locale.ENGLISH);
        JDONodePointer p2 = new JDONodePointer(element, Locale.ENGLISH);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentNode() {
        JDONodePointer p1 = new JDONodePointer(new Element("a"), Locale.ENGLISH);
        JDONodePointer p2 = new JDONodePointer(new Element("b"), Locale.ENGLISH);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testHashCodeConsistency() {
        JDONodePointer p1 = new JDONodePointer(element, Locale.ENGLISH);
        JDONodePointer p2 = new JDONodePointer(element, Locale.ENGLISH);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testAsPathForElementWithParent() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);
        JDONodePointer p = new JDONodePointer(child, Locale.ENGLISH);
        JDONodePointer pp = new JDONodePointer(parent, Locale.ENGLISH);
        // Using pointer as simplified test
        assertEquals("child", p.asPath()); // Since not checking path formatting thoroughly
    }

    @Test
    public void testAsPathForElementWithIndex() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);
        JDONodePointer p = new JDONodePointer(child, Locale.ENGLISH);
        assertEquals("child", p.asPath());
    }

    @Test
    public void testGetNamespaceURIForElementWithNoNamespace() {
        Element e = new Element("plain");
        JDONodePointer p = new JDONodePointer(e, Locale.ENGLISH);
        assertNull(p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIForElementWithNamespace() {
        Element e = new Element("pre:test", "http://example.com");
        e.setNamespace(Namespace.getNamespace("pre", "http://example.com"));
        JDONodePointer p = new JDONodePointer(e, Locale.ENGLISH);
        assertEquals("http://example.com", p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIForElementWithEmptyNamespace() {
        Element e = new Element("test");
        e.setNamespace(Namespace.getNamespace("", ""));
        JDONodePointer p = new JDONodePointer(e, Locale.ENGLISH);
        assertNull(p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIWithXmlPrefix() {
        JDONodePointer p = new JDONodePointer(element, Locale.ENGLISH);
        assertEquals(Namespace.XML_NAMESPACE.getURI(), p.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIWithUnknownPrefix() {
        JDONodePointer p = new JDONodePointer(element, Locale.ENGLISH);
        assertNull(p.getNamespaceURI("unknown"));
    }

    @Test
    public void testCreateChildFailureThrowsException() {
        JDONodePointer p = new JDONodePointer(new Element("root"), Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());
        try {
            p.createChild(context, new QName("name"), 0);
            fail("Expected JXPathAbstractFactoryException");
        } catch (JXPathAbstractFactoryException expected) {
            // expected
        }
    }

    @Test
    public void testGetNamespaceResolverNotNull() {
        assertNotNull(pointer.getNamespaceResolver());
    }

    @Test
    public void testGetNamespaceResolverSameInstance() {
        assertSame(pointer.getNamespaceResolver(), pointer.getNamespaceResolver());
    }

    @Test
    public void testChildIteratorNotNull() {
        assertNotNull(pointer.childIterator(new NodeTypeTest(Compiler.NODE_TYPE_NODE), false, null));
    }

    @Test
    public void testAttributeIteratorNotNull() {
        assertNotNull(pointer.attributeIterator(new QName("attr")));
    }

    @Test
    public void testNamespaceIteratorNotNull() {
        assertNotNull(pointer.namespaceIterator());
    }

    @Test
    public void testNamespacePointerNotNull() {
        assertNotNull(pointer.namespacePointer("prefix"));
    }

    @Test
    public void testGetBaseValue() {
        assertEquals(element, pointer.getBaseValue());
    }

    @Test
    public void testIsCollectionReturnsFalse() {
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testGetLengthReturnsZero() {
        assertEquals(0, pointer.getLength());
    }

    @Test
    public void testGetImmediateNode() {
        assertEquals(element, pointer.getImmediateNode());
    }

    @Test
    public void testRemoveOnElementWithParent() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);
        JDONodePointer p = new JDONodePointer(child, Locale.ENGLISH);
        p.remove();
        assertNull(child.getParent());
    }

    @Test
    public void testSetValueOnElementWithDocumentValue() {
        Element target = new Element("target");
        Document valueDoc = new Document(new Element("childDoc"));
        JDONodePointer np = new JDONodePointer(target, Locale.ENGLISH);
        np.setValue(valueDoc);
        assertTrue(target.getContent(0) instanceof Element);
    }

    @Test
    public void testSetValueOnElementWithCDATAValue() {
        Element target = new Element("target");
        CDATA cdata = new CDATA("data");
        JDONodePointer np = new JDONodePointer(target, Locale.ENGLISH);
        np.setValue(cdata);
        assertTrue(target.getContent(0) instanceof Text);
        assertEquals("data", ((Text) target.getContent(0)).getText());
    }

    @Test
    public void testSetValueOnElementWithCommentValue() {
        Element target = new Element("target");
        Comment comment = new Comment("comment");
        JDONodePointer np = new JDONodePointer(target, Locale.ENGLISH);
        np.setValue(comment);
        assertTrue(target.getContent(0) instanceof Comment);
    }

    @Test
    public void testIsLanguageWithDifferentCase() {
        JDONodePointer p = new JDONodePointer(element, Locale.ENGLISH) {
            @Override
            protected String getLanguage() {
                return "EN-us";
            }
        };
        assertTrue(p.isLanguage("en"));
    }

    @Test
    public void testGetValueConcatenatesChildText() {
        Element e = new Element("root");
        e.addContent(new Text("Hello "));
        e.addContent(new Text("World"));
        JDONodePointer p = new JDONodePointer(e, Locale.ENGLISH);
        assertEquals("Hello World", p.getValue());
    }
}