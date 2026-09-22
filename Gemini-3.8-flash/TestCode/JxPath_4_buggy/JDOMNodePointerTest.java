package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import org.junit.Assert;
import org.junit.Test;

public class JDOMNodePointerTest {

    @Test
    public void constructors_givenVariousParameters_shouldInstantiateCorrectly() {
        Element element = new Element("root");
        Locale locale = Locale.ENGLISH;

        JDOMNodePointer ptr1 = new JDOMNodePointer(element, locale);
        Assert.assertEquals(element, ptr1.getBaseValue());
        Assert.assertEquals(element, ptr1.getImmediateNode());
        Assert.assertEquals(locale, ptr1.getLocale());

        JDOMNodePointer ptr2 = new JDOMNodePointer(element, locale, "id123");
        Assert.assertEquals(element, ptr2.getBaseValue());
        Assert.assertEquals("id('id123')", ptr2.asPath());

        Element child = new Element("child");
        element.addContent(child);
        JDOMNodePointer ptr3 = new JDOMNodePointer(ptr1, child);
        Assert.assertSame(ptr1, ptr3.getParent());
        Assert.assertEquals(child, ptr3.getBaseValue());
    }

    @Test
    public void iterators_givenNodePointer_shouldReturnNonNullIterators() {
        Element element = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(element, Locale.ENGLISH);

        NodeIterator childIt = ptr.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("attr"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);
    }

    @Test
    public void getNamespaceURI_givenElementWithoutNamespace_shouldReturnNull() {
        Element element = new Element("test");
        JDOMNodePointer ptr = new JDOMNodePointer(element, Locale.ENGLISH);
        Assert.assertNull(ptr.getNamespaceURI());
    }

    @Test
    public void getNamespaceURI_givenElementWithNamespace_shouldReturnURI() {
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com/ns");
        Element element = new Element("test", ns);
        JDOMNodePointer ptr = new JDOMNodePointer(element, Locale.ENGLISH);
        Assert.assertEquals("http://example.com/ns", ptr.getNamespaceURI());
    }

    @Test
    public void getNamespaceURI_givenNonElementNode_shouldReturnNull() {
        Text text = new Text("hello");
        JDOMNodePointer ptr = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertNull(ptr.getNamespaceURI());
    }

    @Test
    public void getNamespaceURI_byPrefix_givenDocument_shouldReturnNamespaceURI() {
        Element root = new Element("root");
        Namespace ns = Namespace.getNamespace("custom", "http://custom.uri");
        root.addNamespaceDeclaration(ns);
        Document doc = new Document(root);

        JDOMNodePointer ptr = new JDOMNodePointer(doc, Locale.ENGLISH);
        Assert.assertEquals("http://custom.uri", ptr.getNamespaceURI("custom"));
        Assert.assertNull(ptr.getNamespaceURI("unknown"));
    }

    @Test
    public void getNamespaceURI_byPrefix_givenElement_shouldReturnNamespaceURI() {
        Element root = new Element("root");
        Namespace ns = Namespace.getNamespace("custom", "http://custom.uri");
        root.addNamespaceDeclaration(ns);

        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("http://custom.uri", ptr.getNamespaceURI("custom"));
        Assert.assertNull(ptr.getNamespaceURI("unknown"));
    }

    @Test
    public void getNamespaceURI_byPrefix_givenOtherNode_shouldReturnNull() {
        Text text = new Text("sample");
        JDOMNodePointer ptr = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertNull(ptr.getNamespaceURI("xml"));
    }

    @Test
    public void compareChildNodePointers_givenSameNode_shouldReturnZero() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);

        JDOMNodePointer parentPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr1 = new JDOMNodePointer(parentPtr, child);
        JDOMNodePointer childPtr2 = new JDOMNodePointer(parentPtr, child);

        Assert.assertEquals(0, parentPtr.compareChildNodePointers(childPtr1, childPtr2));
    }

    @Test
    public void compareChildNodePointers_givenAttributeAndChildNode_shouldPrioritizeAttribute() {
        Element root = new Element("root");
        Attribute attr = new Attribute("id", "1");
        Element child = new Element("child");
        root.setAttribute(attr);
        root.addContent(child);

        JDOMNodePointer parentPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer attrPtr = new JDOMNodePointer(parentPtr, attr);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);

        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(attrPtr, childPtr));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(childPtr, attrPtr));
    }

    @Test
    public void compareChildNodePointers_givenTwoAttributes_shouldReturnOrderInList() {
        Element root = new Element("root");
        Attribute attr1 = new Attribute("a", "1");
        Attribute attr2 = new Attribute("b", "2");
        root.setAttribute(attr1);
        root.setAttribute(attr2);

        JDOMNodePointer parentPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer ptr1 = new JDOMNodePointer(parentPtr, attr1);
        JDOMNodePointer ptr2 = new JDOMNodePointer(parentPtr, attr2);

        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(ptr1, ptr2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(ptr2, ptr1));

        Attribute unattached = new Attribute("c", "3");
        JDOMNodePointer unattachedPtr = new JDOMNodePointer(parentPtr, unattached);
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(unattachedPtr, unattachedPtr));
    }

    @Test(expected = RuntimeException.class)
    public void compareChildNodePointers_givenNonElementParent_shouldThrowException() {
        Text text = new Text("sample");
        JDOMNodePointer parentPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        JDOMNodePointer childPtr1 = new JDOMNodePointer(parentPtr, new Element("a"));
        JDOMNodePointer childPtr2 = new JDOMNodePointer(parentPtr, new Element("b"));

        parentPtr.compareChildNodePointers(childPtr1, childPtr2);
    }

    @Test
    public void compareChildNodePointers_givenElementChildren_shouldReturnOrderInList() {
        Element root = new Element("root");
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        root.addContent(c1);
        root.addContent(c2);

        JDOMNodePointer parentPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer ptr1 = new JDOMNodePointer(parentPtr, c1);
        JDOMNodePointer ptr2 = new JDOMNodePointer(parentPtr, c2);

        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(ptr1, ptr2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(ptr2, ptr1));

        Element unattached = new Element("unattached");
        JDOMNodePointer ptrUnattached = new JDOMNodePointer(parentPtr, unattached);
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(ptrUnattached, ptrUnattached));
    }

    @Test
    public void isCollection_and_getLength_shouldReturnDefaults() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        Assert.assertFalse(ptr.isCollection());
        Assert.assertEquals(1, ptr.getLength());
    }

    @Test
    public void isLeaf_givenVariousNodes_shouldReturnExpectedBoolean() {
        Element emptyElem = new Element("root");
        JDOMNodePointer ptrElem = new JDOMNodePointer(emptyElem, Locale.ENGLISH);
        Assert.assertTrue(ptrElem.isLeaf());

        emptyElem.addContent(new Element("child"));
        Assert.assertFalse(ptrElem.isLeaf());

        Document emptyDoc = new Document();
        JDOMNodePointer ptrDoc = new JDOMNodePointer(emptyDoc, Locale.ENGLISH);
        Assert.assertTrue(ptrDoc.isLeaf());

        emptyDoc.setRootElement(new Element("root"));
        Assert.assertFalse(ptrDoc.isLeaf());

        Text text = new Text("value");
        JDOMNodePointer ptrText = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertTrue(ptrText.isLeaf());
    }

    @Test
    public void getName_givenVariousNodes_shouldReturnQName() {
        Element elem = new Element("name", "ns", "http://example.com");
        JDOMNodePointer ptrElem = new JDOMNodePointer(elem, Locale.ENGLISH);
        QName qnameElem = ptrElem.getName();
        Assert.assertEquals("ns", qnameElem.getPrefix());
        Assert.assertEquals("name", qnameElem.getName());

        Element noNsElem = new Element("plain");
        JDOMNodePointer ptrNoNs = new JDOMNodePointer(noNsElem, Locale.ENGLISH);
        Assert.assertNull(ptrNoNs.getName().getPrefix());
        Assert.assertEquals("plain", ptrNoNs.getName().getName());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer ptrPi = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertNull(ptrPi.getName().getPrefix());
        Assert.assertEquals("target", ptrPi.getName().getName());

        Text text = new Text("text");
        JDOMNodePointer ptrText = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertNull(ptrText.getName().getPrefix());
        Assert.assertNull(ptrText.getName().getName());
    }

    @Test
    public void getValue_givenVariousNodes_shouldExtractTextContent() {
        Element elem = new Element("root");
        elem.setText("  content  ");
        Assert.assertEquals("content", new JDOMNodePointer(elem, Locale.ENGLISH).getValue());

        Comment comment = new Comment("  a comment  ");
        Assert.assertEquals("a comment", new JDOMNodePointer(comment, Locale.ENGLISH).getValue());

        Comment emptyComment = new Comment("");
        Assert.assertEquals("", new JDOMNodePointer(emptyComment, Locale.ENGLISH).getValue());

        Text text = new Text("  a text  ");
        Assert.assertEquals("a text", new JDOMNodePointer(text, Locale.ENGLISH).getValue());

        CDATA cdata = new CDATA("  cdata data  ");
        Assert.assertEquals("cdata data", new JDOMNodePointer(cdata, Locale.ENGLISH).getValue());

        ProcessingInstruction pi = new ProcessingInstruction("target", "  instruction  ");
        Assert.assertEquals("instruction", new JDOMNodePointer(pi, Locale.ENGLISH).getValue());

        Document doc = new Document();
        Assert.assertNull(new JDOMNodePointer(doc, Locale.ENGLISH).getValue());
    }

    @Test
    public void setValue_givenTextNodeWithValidString_shouldUpdateText() {
        Element parent = new Element("parent");
        Text text = new Text("old");
        parent.addContent(text);

        JDOMNodePointer ptr = new JDOMNodePointer(text, Locale.ENGLISH);
        ptr.setValue("new");
        Assert.assertEquals("new", text.getText());
    }

    @Test
    public void setValue_givenTextNodeWithEmptyOrNull_shouldRemoveFromParent() {
        Element parent = new Element("parent");
        Text text = new Text("old");
        parent.addContent(text);

        JDOMNodePointer ptr = new JDOMNodePointer(text, Locale.ENGLISH);
        ptr.setValue("");
        Assert.assertEquals(0, parent.getContent().size());

        Text text2 = new Text("old2");
        parent.addContent(text2);
        JDOMNodePointer ptr2 = new JDOMNodePointer(text2, Locale.ENGLISH);
        ptr2.setValue(null);
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test
    public void setValue_givenElementNode_shouldReplaceChildrenCorrectly() {
        Element target = new Element("target");
        target.addContent(new Element("childToRemove"));
        JDOMNodePointer ptr = new JDOMNodePointer(target, Locale.ENGLISH);

        Element sourceElem = new Element("source");
        sourceElem.addContent(new Element("c1"));
        sourceElem.addContent(new Text("t1"));
        sourceElem.addContent(new CDATA("cd1"));
        sourceElem.addContent(new ProcessingInstruction("pi1", "data1"));
        sourceElem.addContent(new Comment("comment1"));

        ptr.setValue(sourceElem);
        Assert.assertEquals(5, target.getContent().size());
        Assert.assertTrue(target.getContent().get(0) instanceof Element);
        Assert.assertTrue(target.getContent().get(1) instanceof Text);
        Assert.assertTrue(target.getContent().get(2) instanceof CDATA);
        Assert.assertTrue(target.getContent().get(3) instanceof ProcessingInstruction);
        Assert.assertTrue(target.getContent().get(4) instanceof Comment);

        Document sourceDoc = new Document();
        Element docRoot = new Element("docRoot");
        docRoot.addContent(new Element("subDoc"));
        sourceDoc.setRootElement(docRoot);

        ptr.setValue(sourceDoc);
        Assert.assertEquals(1, target.getContent().size());

        ptr.setValue(new Text("plain text"));
        Assert.assertEquals(1, target.getContent().size());
        Assert.assertEquals("plain text", ((Text) target.getContent().get(0)).getText());

        ptr.setValue(new CDATA("cdata text"));
        Assert.assertEquals(1, target.getContent().size());
        Assert.assertEquals("cdata text", ((Text) target.getContent().get(0)).getText());

        ptr.setValue(new ProcessingInstruction("targetPI", "piData"));
        Assert.assertEquals(1, target.getContent().size());
        Assert.assertTrue(target.getContent().get(0) instanceof ProcessingInstruction);

        ptr.setValue(new Comment("new comment"));
        Assert.assertEquals(1, target.getContent().size());
        Assert.assertTrue(target.getContent().get(0) instanceof Comment);

        ptr.setValue("string value");
        Assert.assertEquals(1, target.getContent().size());
        Assert.assertEquals("string value", ((Text) target.getContent().get(0)).getText());

        ptr.setValue("");
        Assert.assertEquals(0, target.getContent().size());
    }

    @Test
    public void testNode_givenNullTest_shouldReturnTrue() {
        Element element = new Element("elem");
        JDOMNodePointer ptr = new JDOMNodePointer(element, Locale.ENGLISH);
        Assert.assertTrue(ptr.testNode(null));
        Assert.assertTrue(JDOMNodePointer.testNode(ptr, element, null));
    }

    @Test
    public void testNode_givenNodeNameTest_shouldMatchCorrectly() {
        Element elem = new Element("test", "ns", "http://example.com");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);

        NodeNameTest nonElemTest = new NodeNameTest(new QName("test"));
        Assert.assertFalse(JDOMNodePointer.testNode(ptr, new Text("text"), nonElemTest));

        NodeNameTest wildcardNoPrefix = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(ptr.testNode(wildcardNoPrefix));

        NodeNameTest wildcardWithPrefix = new NodeNameTest(new QName("ns", "*"), "http://example.com");
        Assert.assertTrue(ptr.testNode(wildcardWithPrefix));

        NodeNameTest matchExact = new NodeNameTest(new QName("ns", "test"), "http://example.com");
        Assert.assertTrue(ptr.testNode(matchExact));

        NodeNameTest mismatchName = new NodeNameTest(new QName("ns", "other"), "http://example.com");
        Assert.assertFalse(ptr.testNode(mismatchName));

        NodeNameTest mismatchNS = new NodeNameTest(new QName("ns", "test"), "http://different.com");
        Assert.assertFalse(ptr.testNode(mismatchNS));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldMatchTypes() {
        Element elem = new Element("test");
        Document doc = new Document(new Element("root"));
        Text text = new Text("text");
        CDATA cdata = new CDATA("cdata");
        Comment comment = new Comment("comment");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, nodeTest));
        Assert.assertTrue(JDOMNodePointer.testNode(null, doc, nodeTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, text, nodeTest));

        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, text, textTest));
        Assert.assertTrue(JDOMNodePointer.testNode(null, cdata, textTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, textTest));

        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, comment, commentTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, commentTest));

        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, piTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, piTest));

        NodeTypeTest unknownType = new NodeTypeTest(999);
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, unknownType));
    }

    @Test
    public void testNode_givenProcessingInstructionTest_shouldMatchTarget() {
        ProcessingInstruction pi = new ProcessingInstruction("targetA", "data");
        ProcessingInstructionTest matchTest = new ProcessingInstructionTest("targetA");
        ProcessingInstructionTest mismatchTest = new ProcessingInstructionTest("targetB");

        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, matchTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, pi, mismatchTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, new Element("elem"), matchTest));
    }

    @Test
    public void testNode_givenUnrecognizedTestClass_shouldReturnFalse() {
        class CustomNodeTest extends NodeTest {}
        Assert.assertFalse(JDOMNodePointer.testNode(null, new Element("elem"), new CustomNodeTest()));
    }

    @Test
    public void getPrefix_and_getLocalName_givenVariousNodes_shouldReturnStrings() {
        Element elemWithPrefix = new Element("local", "pfx", "http://uri");
        Assert.assertEquals("pfx", JDOMNodePointer.getPrefix(elemWithPrefix));
        Assert.assertEquals("local", JDOMNodePointer.getLocalName(elemWithPrefix));

        Element elemNoPrefix = new Element("local");
        Assert.assertNull(JDOMNodePointer.getPrefix(elemNoPrefix));
        Assert.assertEquals("local", JDOMNodePointer.getLocalName(elemNoPrefix));

        Attribute attrWithPrefix = new Attribute("attr", "val", Namespace.getNamespace("pfx", "http://uri"));
        Assert.assertEquals("pfx", JDOMNodePointer.getPrefix(attrWithPrefix));
        Assert.assertEquals("attr", JDOMNodePointer.getLocalName(attrWithPrefix));

        Attribute attrNoPrefix = new Attribute("attr", "val");
        Assert.assertNull(JDOMNodePointer.getPrefix(attrNoPrefix));
        Assert.assertEquals("attr", JDOMNodePointer.getLocalName(attrNoPrefix));

        Text text = new Text("text");
        Assert.assertNull(JDOMNodePointer.getPrefix(text));
        Assert.assertNull(JDOMNodePointer.getLocalName(text));
    }

    @Test
    public void isLanguage_and_getLanguage_givenXmlLangHierarchy_shouldResolve() {
        Element root = new Element("root");
        root.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);

        Element child = new Element("child");
        root.addContent(child);

        Text text = new Text("sample");
        child.addContent(text);

        JDOMNodePointer ptrRoot = new JDOMNodePointer(root, Locale.ENGLISH);
        Assert.assertTrue(ptrRoot.isLanguage("en"));
        Assert.assertTrue(ptrRoot.isLanguage("EN-US"));
        Assert.assertFalse(ptrRoot.isLanguage("fr"));

        JDOMNodePointer ptrChild = new JDOMNodePointer(child, Locale.ENGLISH);
        Assert.assertTrue(ptrChild.isLanguage("en"));

        JDOMNodePointer ptrText = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertTrue(ptrText.isLanguage("en"));

        CDATA cdata = new CDATA("cdata");
        child.addContent(cdata);
        Assert.assertTrue(new JDOMNodePointer(cdata, Locale.ENGLISH).isLanguage("en"));

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        child.addContent(pi);
        Assert.assertTrue(new JDOMNodePointer(pi, Locale.ENGLISH).isLanguage("en"));

        Comment comment = new Comment("comm");
        child.addContent(comment);
        Assert.assertTrue(new JDOMNodePointer(comment, Locale.ENGLISH).isLanguage("en"));

        Element rootNoLang = new Element("rootNoLang");
        JDOMNodePointer ptrNoLang = new JDOMNodePointer(rootNoLang, Locale.FRENCH);
        Assert.assertTrue(ptrNoLang.isLanguage("fr"));
    }

    @Test
    public void createAttribute_givenElementWithoutPrefix_shouldAddAttribute() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(root);

        QName qname = new QName("attr");
        NodePointer attrPtr = ptr.createAttribute(context, qname);

        Assert.assertNotNull(attrPtr);
        Assert.assertEquals("attr", root.getAttribute("attr").getName());
        Assert.assertEquals("", root.getAttributeValue("attr"));

        NodePointer existingPtr = ptr.createAttribute(context, qname);
        Assert.assertNotNull(existingPtr);
    }

    @Test
    public void createAttribute_givenElementWithPrefix_shouldAddNamespacedAttribute() {
        Element root = new Element("root");
        Namespace ns = Namespace.getNamespace("custom", "http://example.com/ns");
        root.addNamespaceDeclaration(ns);
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(root);

        QName qname = new QName("custom", "attr");
        NodePointer attrPtr = ptr.createAttribute(context, qname);
        Assert.assertNotNull(attrPtr);
        Assert.assertEquals("attr", root.getAttribute("attr", ns).getName());
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_givenUnknownPrefix_shouldThrowException() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(root);

        ptr.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test
    public void createAttribute_givenNonElementNode_shouldDelegateToSuper() {
        Text text = new Text("sample");
        JDOMNodePointer ptr = new JDOMNodePointer(text, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(text);

        try {
            ptr.createAttribute(context, new QName("attr"));
            Assert.fail("Should throw JXPathException for non-element");
        }
        catch (JXPathException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void createChild_withoutFactory_shouldThrowException() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(root);

        try {
            ptr.createChild(context, new QName("child"), 0);
            Assert.fail("Should throw JXPathException when factory is missing");
        }
        catch (JXPathException e) {
            Assert.assertTrue(e.getMessage().indexOf("Factory is not set") != -1);
        }
    }

    @Test
    public void createChild_withFactorySuccess_shouldReturnChildPointer() {
        final Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(root);

        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, NodePointer parent, Object parentNode, String name, int index) {
                Element child = new Element(name);
                ((Element) parentNode).addContent(child);
                return true;
            }
        });

        NodePointer childPtr = ptr.createChild(context, new QName("child"), NodePointer.WHOLE_COLLECTION);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals(1, root.getChildren("child").size());

        NodePointer childWithValue = ptr.createChild(context, new QName("child2"), 0, "hello");
        Assert.assertNotNull(childWithValue);
        Assert.assertEquals("hello", root.getChildText("child2"));
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void createChild_withFactoryFailure_shouldThrowException() {
        final Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(root);

        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, NodePointer parent, Object parentNode, String name, int index) {
                return false;
            }
        });

        ptr.createChild(context, new QName("child"), 0);
    }

    @Test
    public void remove_givenRootElement_shouldThrowException() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        try {
            ptr.remove();
            Assert.fail("Expected JXPathException when removing root");
        }
        catch (JXPathException expected) {
            Assert.assertEquals("Cannot remove root JDOM node", expected.getMessage());
        }
    }

    @Test
    public void remove_givenChildElement_shouldRemoveFromParent() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);

        JDOMNodePointer ptr = new JDOMNodePointer(child, Locale.ENGLISH);
        ptr.remove();
        Assert.assertEquals(0, root.getContent().size());
    }

    @Test
    public void asPath_givenId_shouldEscapeQuotes() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH, "a'b\"c");
        Assert.assertEquals("id('a&apos;b&quot;c')", ptr.asPath());
    }

    @Test
    public void asPath_givenElementHierarchy_shouldComputeRelativePaths() {
        Element root = new Element("root");
        Element child1 = new Element("item");
        Element child2 = new Element("item");
        root.addContent(child1);
        root.addContent(child2);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr1 = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer childPtr2 = new JDOMNodePointer(rootPtr, child2);

        Assert.assertEquals("/item[1]", childPtr1.asPath());
        Assert.assertEquals("/item[2]", childPtr2.asPath());
    }

    @Test
    public void asPath_givenNamespacedElement_shouldIncludePrefixOrNode() {
        Element root = new Element("root");
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com/ns");
        Element child = new Element("item", ns);
        root.addContent(child);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);

        Assert.assertEquals("/node()[1]", childPtr.asPath());

        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pfx", "http://example.com/ns");
        rootPtr.setNamespaceResolver(resolver);
        Assert.assertEquals("/pfx:item[1]", childPtr.asPath());
    }

    @Test
    public void asPath_givenTextAndPIChildren_shouldGenerateCorrectPath() {
        Element root = new Element("root");
        Text text1 = new Text("hello");
        CDATA cdata1 = new CDATA("world");
        ProcessingInstruction pi = new ProcessingInstruction("test-pi", "sample");

        root.addContent(text1);
        root.addContent(cdata1);
        root.addContent(pi);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, text1);
        JDOMNodePointer cdataPtr = new JDOMNodePointer(rootPtr, cdata1);
        JDOMNodePointer piPtr = new JDOMNodePointer(rootPtr, pi);

        Assert.assertEquals("/text()[1]", textPtr.asPath());
        Assert.assertEquals("/text()[2]", cdataPtr.asPath());
        Assert.assertEquals("/processing-instruction('test-pi')[1]", piPtr.asPath());
    }

    @Test
    public void asPath_givenStandaloneNodesWithoutParent_shouldHandleGracefully() {
        Text text = new Text("alone");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertEquals("/text()[1]", textPtr.asPath());

        ProcessingInstruction pi = new ProcessingInstruction("pi", "data");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals("/processing-instruction('pi')[1]", piPtr.asPath());

        Element elem = new Element("elem");
        JDOMNodePointer elemPtr = new JDOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertEquals("", elemPtr.asPath());
    }

    @Test
    public void hashCode_and_equals_shouldAdhereToIdentityAndTypeRules() {
        Element elem1 = new Element("a");
        Element elem2 = new Element("a");

        JDOMNodePointer ptr1a = new JDOMNodePointer(elem1, Locale.ENGLISH);
        JDOMNodePointer ptr1b = new JDOMNodePointer(elem1, Locale.ENGLISH);
        JDOMNodePointer ptr2 = new JDOMNodePointer(elem2, Locale.ENGLISH);

        Assert.assertTrue(ptr1a.equals(ptr1a));
        Assert.assertTrue(ptr1a.equals(ptr1b));
        Assert.assertFalse(ptr1a.equals(ptr2));
        Assert.assertFalse(ptr1a.equals("string"));
        Assert.assertFalse(ptr1a.equals(null));

        Assert.assertEquals(System.identityHashCode(elem1), ptr1a.hashCode());
    }
}