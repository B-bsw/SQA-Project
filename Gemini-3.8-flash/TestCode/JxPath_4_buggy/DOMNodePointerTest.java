package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DOMNodePointerTest {

    private Document document;
    private Element rootElement;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
        rootElement = document.createElement("root");
        document.appendChild(rootElement);
    }

    @Test
    public void constructors_givenVariousArguments_shouldInitializeProperly() {
        DOMNodePointer ptr1 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Assert.assertSame(rootElement, ptr1.getBaseValue());
        Assert.assertSame(rootElement, ptr1.getImmediateNode());
        Assert.assertEquals(Locale.ENGLISH, ptr1.getLocale());

        DOMNodePointer ptr2 = new DOMNodePointer(rootElement, Locale.US, "testId");
        Assert.assertEquals("id('testId')", ptr2.asPath());

        DOMNodePointer ptr3 = new DOMNodePointer(ptr1, rootElement);
        Assert.assertSame(ptr1, ptr3.getParent());
        Assert.assertSame(rootElement, ptr3.getNode());
    }

    @Test
    public void testNode_givenNullTest_shouldReturnTrue() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Assert.assertTrue(pointer.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testNode_givenNodeNameTestOnNonElement_shouldReturnFalse() {
        Text text = document.createTextNode("text");
        NodeNameTest test = new NodeNameTest(new QName("text"));
        Assert.assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testNode_givenWildcardWithoutPrefix_shouldReturnTrue() {
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(DOMNodePointer.testNode(rootElement, wildcardTest));
    }

    @Test
    public void testNode_givenWildcardWithMatchingNamespace_shouldReturnTrue() {
        Element nsElem = document.createElementNS("http://example.com", "ns:elem");
        NodeNameTest wildcardNsTest = new NodeNameTest(new QName("ns", "*"), "http://example.com");
        Assert.assertTrue(DOMNodePointer.testNode(nsElem, wildcardNsTest));
    }

    @Test
    public void testNode_givenMatchingNameAndNamespace_shouldReturnTrue() {
        Element nsElem = document.createElementNS("http://example.com", "ns:elem");
        NodeNameTest matchTest = new NodeNameTest(new QName("ns", "elem"), "http://example.com");
        Assert.assertTrue(DOMNodePointer.testNode(nsElem, matchTest));
    }

    @Test
    public void testNode_givenMatchingNameAndMismatchedNamespace_shouldReturnFalse() {
        Element nsElem = document.createElementNS("http://example.com", "ns:elem");
        NodeNameTest mismatchTest = new NodeNameTest(new QName("ns", "elem"), "http://other.com");
        Assert.assertFalse(DOMNodePointer.testNode(nsElem, mismatchTest));
    }

    @Test
    public void testNode_givenMismatchedName_shouldReturnFalse() {
        NodeNameTest test = new NodeNameTest(new QName("different"));
        Assert.assertFalse(DOMNodePointer.testNode(rootElement, test));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldMatchCorrectNodeTypes() {
        Text text = document.createTextNode("sample");
        CDATASection cdata = document.createCDATASection("sample");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(DOMNodePointer.testNode(rootElement, nodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(document, nodeTest));
        Assert.assertFalse(DOMNodePointer.testNode(text, nodeTest));

        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(DOMNodePointer.testNode(text, textTest));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, textTest));
        Assert.assertFalse(DOMNodePointer.testNode(rootElement, textTest));

        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(DOMNodePointer.testNode(comment, commentTest));
        Assert.assertFalse(DOMNodePointer.testNode(rootElement, commentTest));

        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));
        Assert.assertFalse(DOMNodePointer.testNode(rootElement, piTest));

        NodeTypeTest unknownTypeTest = new NodeTypeTest(9999);
        Assert.assertFalse(DOMNodePointer.testNode(rootElement, unknownTypeTest));
    }

    @Test
    public void testNode_givenProcessingInstructionTest_shouldMatchOnlySameTarget() {
        ProcessingInstruction pi = document.createProcessingInstruction("target1", "data");
        ProcessingInstructionTest match = new ProcessingInstructionTest("target1");
        ProcessingInstructionTest mismatch = new ProcessingInstructionTest("target2");

        Assert.assertTrue(DOMNodePointer.testNode(pi, match));
        Assert.assertFalse(DOMNodePointer.testNode(pi, mismatch));
        Assert.assertFalse(DOMNodePointer.testNode(rootElement, match));
    }

    @Test
    public void testNode_givenUnrecognizedNodeTest_shouldReturnFalse() {
        NodeTest dummyTest = new NodeTest() {};
        Assert.assertFalse(DOMNodePointer.testNode(rootElement, dummyTest));
    }

    @Test
    public void getName_givenVariousNodeTypes_shouldReturnExpectedQNames() {
        Element prefixedElem = document.createElementNS("http://example.com", "ns:myTag");
        DOMNodePointer p1 = new DOMNodePointer(prefixedElem, Locale.ENGLISH);
        QName qName1 = p1.getName();
        Assert.assertEquals("ns", qName1.getPrefix());
        Assert.assertEquals("myTag", qName1.getName());

        DOMNodePointer p2 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        QName qName2 = p2.getName();
        Assert.assertNull(qName2.getPrefix());
        Assert.assertEquals("root", qName2.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("myTarget", "myData");
        DOMNodePointer p3 = new DOMNodePointer(pi, Locale.ENGLISH);
        QName qName3 = p3.getName();
        Assert.assertNull(qName3.getPrefix());
        Assert.assertEquals("myTarget", qName3.getName());

        Text text = document.createTextNode("text");
        DOMNodePointer p4 = new DOMNodePointer(text, Locale.ENGLISH);
        QName qName4 = p4.getName();
        Assert.assertNull(qName4.getPrefix());
        Assert.assertNull(qName4.getName());
    }

    @Test
    public void getNamespaceURI_givenPrefixesAndInheritance_shouldResolveCorrectly() {
        rootElement.setAttribute("xmlns:foo", "http://foo.com");
        rootElement.setAttribute("xmlns", "http://default.com");

        Element child = document.createElement("child");
        rootElement.appendChild(child);

        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);

        Assert.assertEquals("http://default.com", childPointer.getNamespaceURI(null));
        Assert.assertEquals("http://default.com", childPointer.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, childPointer.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, childPointer.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://foo.com", childPointer.getNamespaceURI("foo"));
        Assert.assertEquals("http://foo.com", childPointer.getNamespaceURI("foo"));
        Assert.assertNull(childPointer.getNamespaceURI("nonexistent"));

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertEquals("http://foo.com", docPointer.getNamespaceURI("foo"));
    }

    @Test
    public void getDefaultNamespaceURI_givenNoDeclaration_shouldReturnNull() {
        Element isolated = document.createElement("isolated");
        DOMNodePointer ptr = new DOMNodePointer(isolated, Locale.ENGLISH);
        Assert.assertNull(ptr.getDefaultNamespaceURI());
    }

    @Test
    public void getDefaultNamespaceURI_givenDocumentNode_shouldLookAtDocumentElement() {
        rootElement.setAttribute("xmlns", "http://inherited-default.com");
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertEquals("http://inherited-default.com", docPointer.getDefaultNamespaceURI());
    }

    @Test
    public void structuralQueries_givenVariousNodes_shouldReturnExpectedProperties() {
        DOMNodePointer pointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Assert.assertTrue(pointer.isActual());
        Assert.assertFalse(pointer.isCollection());
        Assert.assertEquals(1, pointer.getLength());
        Assert.assertTrue(pointer.isLeaf());

        rootElement.appendChild(document.createElement("sub"));
        Assert.assertFalse(pointer.isLeaf());
    }

    @Test
    public void isLanguage_givenXmlLangHierarchy_shouldMatchProperly() {
        rootElement.setAttribute("xml:lang", "en-US");
        Element child = document.createElement("child");
        rootElement.appendChild(child);

        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        Assert.assertTrue(childPointer.isLanguage("en"));
        Assert.assertTrue(childPointer.isLanguage("EN-US"));
        Assert.assertFalse(childPointer.isLanguage("fr"));

        Element noLang = document.createElement("nolang");
        DOMNodePointer noLangPtr = new DOMNodePointer(noLang, Locale.GERMAN);
        Assert.assertTrue(noLangPtr.isLanguage("de"));
    }

    @Test
    public void setValue_givenTextNodeWithNonEmptyValue_shouldUpdateValue() {
        Text text = document.createTextNode("initial");
        rootElement.appendChild(text);

        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        ptr.setValue("updated");
        Assert.assertEquals("updated", text.getNodeValue());
    }

    @Test
    public void setValue_givenTextNodeWithEmptyOrNullValue_shouldRemoveNode() {
        Text text = document.createTextNode("initial");
        rootElement.appendChild(text);

        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        ptr.setValue("");
        Assert.assertNull(text.getParentNode());

        Text text2 = document.createTextNode("initial2");
        rootElement.appendChild(text2);
        DOMNodePointer ptr2 = new DOMNodePointer(text2, Locale.ENGLISH);
        ptr2.setValue(null);
        Assert.assertNull(text2.getParentNode());
    }

    @Test
    public void setValue_givenElementWithString_shouldReplaceChildrenWithText() {
        rootElement.appendChild(document.createElement("oldChild"));
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);

        ptr.setValue("newText");
        Assert.assertEquals(1, rootElement.getChildNodes().getLength());
        Assert.assertEquals("newText", rootElement.getFirstChild().getNodeValue());

        ptr.setValue("");
        Assert.assertEquals(0, rootElement.getChildNodes().getLength());
    }

    @Test
    public void setValue_givenElementWithElementOrDocumentValue_shouldAppendClonedChildren() {
        Element sourceElem = document.createElement("source");
        sourceElem.appendChild(document.createElement("c1"));
        sourceElem.appendChild(document.createElement("c2"));

        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        ptr.setValue(sourceElem);

        Assert.assertEquals(2, rootElement.getChildNodes().getLength());
        Assert.assertEquals("c1", rootElement.getChildNodes().item(0).getNodeName());
        Assert.assertEquals("c2", rootElement.getChildNodes().item(1).getNodeName());

        Document sourceDoc = null;
        try {
            sourceDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element docElem = sourceDoc.createElement("docRoot");
            sourceDoc.appendChild(docElem);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        ptr.setValue(sourceDoc);
        Assert.assertEquals(1, rootElement.getChildNodes().getLength());
        Assert.assertEquals("docRoot", rootElement.getFirstChild().getNodeName());

        Comment comment = document.createComment("myComment");
        ptr.setValue(comment);
        Assert.assertEquals(1, rootElement.getChildNodes().getLength());
        Assert.assertEquals("myComment", ((Comment) rootElement.getFirstChild()).getData());
    }

    @Test
    public void createChild_withoutFactory_shouldThrowJXPathException() {
        JXPathContext context = JXPathContext.newContext(document);
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);

        try {
            ptr.createChild(context, new QName("child"), 0);
            Assert.fail("Expected JXPathException for missing factory");
        } catch (JXPathException e) {
            Assert.assertTrue(e.getMessage().indexOf("Factory is not set") != -1);
        }
    }

    @Test
    public void createChild_withFailingFactory_shouldThrowJXPathAbstractFactoryException() {
        JXPathContext context = JXPathContext.newContext(document);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer pointer, Object parent, String name, int index) {
                return false;
            }
        });

        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        try {
            ptr.createChild(context, new QName("child"), 0);
            Assert.fail("Expected JXPathAbstractFactoryException");
        } catch (JXPathAbstractFactoryException e) {
            Assert.assertTrue(e.getMessage().indexOf("Factory could not create a child node") != -1);
        }
    }

    @Test
    public void createChild_withSuccessfulFactory_shouldReturnNewPointer() {
        JXPathContext context = JXPathContext.newContext(document);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer pointer, Object parent, String name, int index) {
                Element parentElem = (Element) parent;
                Element newChild = parentElem.getOwnerDocument().createElement(name);
                parentElem.appendChild(newChild);
                return true;
            }
        });

        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        NodePointer childPtr = ptr.createChild(context, new QName("child"), NodePointer.WHOLE_COLLECTION);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals("child", childPtr.getName().getName());

        NodePointer childWithValue = ptr.createChild(context, new QName("childWithValue"), 1, "hello");
        Assert.assertEquals("hello", childWithValue.getValue());
    }

    @Test
    public void createAttribute_onNonElementNode_shouldDelegateToSuperAndFail() {
        Text text = document.createTextNode("text");
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(document);

        try {
            ptr.createAttribute(context, new QName("attr"));
            Assert.fail("Expected exception on non-element createAttribute");
        } catch (JXPathException e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void createAttribute_onElementWithUnknownPrefix_shouldThrowException() {
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(document);

        try {
            ptr.createAttribute(context, new QName("unknown", "attr"));
            Assert.fail("Expected JXPathException for unknown namespace prefix");
        } catch (JXPathException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unknown namespace prefix") != -1);
        }
    }

    @Test
    public void createAttribute_onElementWithKnownPrefixAndWithoutPrefix_shouldSetAttributes() {
        rootElement.setAttribute("xmlns:ns", "http://example.com");
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(document);

        NodePointer attrPtr1 = ptr.createAttribute(context, new QName("ns", "attr1"));
        Assert.assertNotNull(attrPtr1);
        Assert.assertEquals("ns:attr1", attrPtr1.getName().toString());

        NodePointer attrPtr2 = ptr.createAttribute(context, new QName("attr2"));
        Assert.assertNotNull(attrPtr2);
        Assert.assertEquals("attr2", attrPtr2.getName().getName());

        NodePointer attrPtr2Again = ptr.createAttribute(context, new QName("attr2"));
        Assert.assertNotNull(attrPtr2Again);
    }

    @Test
    public void remove_givenRootNodeWithoutParent_shouldThrowException() {
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        rootElement.getParentNode().removeChild(rootElement);

        try {
            ptr.remove();
            Assert.fail("Expected JXPathException when removing root node");
        } catch (JXPathException e) {
            Assert.assertEquals("Cannot remove root DOM node", e.getMessage());
        }
    }

    @Test
    public void remove_givenAttachedChild_shouldRemoveFromParent() {
        Element child = document.createElement("removable");
        rootElement.appendChild(child);

        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        ptr.remove();
        Assert.assertNull(child.getParentNode());
    }

    @Test
    public void asPath_givenId_shouldReturnEscapedIdPath() {
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH, "a'b\"c");
        Assert.assertEquals("id('a&apos;b&quot;c')", ptr.asPath());
    }

    @Test
    public void asPath_givenVariousNodesAndSiblings_shouldGenerateCorrectPath() {
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertEquals("", docPointer.asPath());

        Element e1 = document.createElement("item");
        Element e2 = document.createElement("item");
        rootElement.appendChild(e1);
        rootElement.appendChild(e2);

        DOMNodePointer rootPointer = new DOMNodePointer(docPointer, rootElement);
        DOMNodePointer pE1 = new DOMNodePointer(rootPointer, e1);
        DOMNodePointer pE2 = new DOMNodePointer(rootPointer, e2);

        Assert.assertEquals("/item[1]", pE1.asPath());
        Assert.assertEquals("/item[2]", pE2.asPath());

        Element nsElem = document.createElementNS("http://custom.com", "nsElem");
        rootElement.appendChild(nsElem);
        DOMNodePointer pNs = new DOMNodePointer(rootPointer, nsElem);
        Assert.assertEquals("/node()[3]", pNs.asPath());

        Text t1 = document.createTextNode("text1");
        Text t2 = document.createTextNode("text2");
        rootElement.appendChild(t1);
        rootElement.appendChild(t2);

        DOMNodePointer pt1 = new DOMNodePointer(rootPointer, t1);
        DOMNodePointer pt2 = new DOMNodePointer(rootPointer, t2);
        Assert.assertEquals("/text()[1]", pt1.asPath());
        Assert.assertEquals("/text()[2]", pt2.asPath());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        rootElement.appendChild(pi);
        DOMNodePointer pPi = new DOMNodePointer(rootPointer, pi);
        Assert.assertEquals("/processing-instruction('target')[1]", pPi.asPath());
    }

    @Test
    public void asPath_givenPrefixInNamespaceResolver_shouldIncludePrefix() {
        JXPathContext context = JXPathContext.newContext(document);
        context.registerNamespace("c", "http://custom.com");

        Element nsElem = document.createElementNS("http://custom.com", "c:customTag");
        rootElement.appendChild(nsElem);

        DOMNodePointer docPointer = (DOMNodePointer) context.getPointer("/");
        DOMNodePointer rootPointer = new DOMNodePointer(docPointer, rootElement);
        DOMNodePointer elemPointer = new DOMNodePointer(rootPointer, nsElem);

        Assert.assertEquals("/c:customTag[1]", elemPointer.asPath());
    }

    @Test
    public void equalsAndHashCode_givenVariousComparisons_shouldBehaveCorrectly() {
        DOMNodePointer p1 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        DOMNodePointer p2 = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Element otherElem = document.createElement("other");
        DOMNodePointer p3 = new DOMNodePointer(otherElem, Locale.ENGLISH);

        Assert.assertTrue(p1.equals(p1));
        Assert.assertTrue(p1.equals(p2));
        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("StringObject"));

        Assert.assertEquals(System.identityHashCode(rootElement), p1.hashCode());
    }

    @Test
    public void getPrefixAndLocalName_givenNodes_shouldExtractProperly() {
        Element elem = document.createElement("myPrefix:myTag");
        Assert.assertEquals("myPrefix", DOMNodePointer.getPrefix(elem));
        Assert.assertEquals("myTag", DOMNodePointer.getLocalName(elem));

        Element simpleElem = document.createElement("simple");
        Assert.assertNull(DOMNodePointer.getPrefix(simpleElem));
        Assert.assertEquals("simple", DOMNodePointer.getLocalName(simpleElem));
    }

    @Test
    public void getNamespaceURI_givenDirectAndInheritedXmlns_shouldReturnURI() {
        rootElement.setAttribute("xmlns:pref", "http://pref.com");
        Element child = document.createElement("pref:child");
        rootElement.appendChild(child);

        Assert.assertEquals("http://pref.com", DOMNodePointer.getNamespaceURI(child));

        Element childNoNs = document.createElement("childNoNs");
        rootElement.appendChild(childNoNs);
        Assert.assertNull(DOMNodePointer.getNamespaceURI(childNoNs));

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertNull(docPointer.getNamespaceURI());
    }

    @Test
    public void getValue_givenVariousNodes_shouldExtractTrimmedStrings() {
        Comment comment = document.createComment("  sample comment  ");
        DOMNodePointer commentPtr = new DOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertEquals("sample comment", commentPtr.getValue());

        Text text = document.createTextNode("  sample text  ");
        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.ENGLISH);
        Assert.assertEquals("sample text", textPtr.getValue());

        CDATASection cdata = document.createCDATASection("  sample cdata  ");
        DOMNodePointer cdataPtr = new DOMNodePointer(cdata, Locale.ENGLISH);
        Assert.assertEquals("sample cdata", cdataPtr.getValue());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "  sample pi data  ");
        DOMNodePointer piPtr = new DOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals("sample pi data", piPtr.getValue());

        Element composite = document.createElement("composite");
        composite.appendChild(document.createTextNode("hello "));
        Element inner = document.createElement("inner");
        inner.appendChild(document.createTextNode("world"));
        composite.appendChild(inner);

        DOMNodePointer compositePtr = new DOMNodePointer(composite, Locale.ENGLISH);
        Assert.assertEquals("hello world", compositePtr.getValue());
    }

    @Test
    public void getPointerByID_givenMatchingAndNonMatchingID_shouldReturnPointerOrNullPointer() {
        Element elem = document.createElement("item");
        elem.setAttribute("id", "targetId");
        elem.setIdAttribute("id", true);
        rootElement.appendChild(elem);

        JXPathContext context = JXPathContext.newContext(document);
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);

        Pointer foundPointer = docPointer.getPointerByID(context, "targetId");
        Assert.assertTrue(foundPointer instanceof DOMNodePointer);
        Assert.assertSame(elem, foundPointer.getNode());

        DOMNodePointer rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        Pointer foundFromRoot = rootPointer.getPointerByID(context, "targetId");
        Assert.assertSame(elem, foundFromRoot.getNode());

        Pointer notFound = docPointer.getPointerByID(context, "nonexistent");
        Assert.assertTrue(notFound instanceof NullPointer);
    }

    @Test
    public void compareChildNodePointers_givenAttributesAndChildren_shouldOrderCorrectly() {
        rootElement.setAttribute("attr1", "v1");
        rootElement.setAttribute("attr2", "v2");
        Attr a1 = rootElement.getAttributeNode("attr1");
        Attr a2 = rootElement.getAttributeNode("attr2");

        Element c1 = document.createElement("c1");
        Element c2 = document.createElement("c2");
        rootElement.appendChild(c1);
        rootElement.appendChild(c2);

        DOMNodePointer rootPointer = new DOMNodePointer(rootElement, Locale.ENGLISH);
        DOMNodePointer ptrAttr1 = new DOMNodePointer(rootPointer, a1);
        DOMNodePointer ptrAttr2 = new DOMNodePointer(rootPointer, a2);
        DOMNodePointer ptrChild1 = new DOMNodePointer(rootPointer, c1);
        DOMNodePointer ptrChild2 = new DOMNodePointer(rootPointer, c2);

        Assert.assertEquals(0, rootPointer.compareChildNodePointers(ptrChild1, ptrChild1));
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(ptrAttr1, ptrChild1));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(ptrChild1, ptrAttr1));

        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(ptrAttr1, ptrAttr2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(ptrAttr2, ptrAttr1));

        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(ptrChild1, ptrChild2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(ptrChild2, ptrChild1));

        Element detached = document.createElement("detached");
        DOMNodePointer ptrDetached = new DOMNodePointer(rootPointer, detached);
        Assert.assertEquals(0, rootPointer.compareChildNodePointers(ptrChild1, ptrDetached));
    }

    @Test
    public void iterators_givenDOMNodePointer_shouldReturnNonNullIterators() {
        DOMNodePointer ptr = new DOMNodePointer(rootElement, Locale.ENGLISH);
        NodeIterator childIt = ptr.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = ptr.attributeIterator(new QName("test"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = ptr.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = ptr.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);
    }
}