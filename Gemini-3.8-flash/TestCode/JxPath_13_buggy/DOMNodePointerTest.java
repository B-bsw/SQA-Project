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
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
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

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
    }

    @Test
    public void constructors_givenVariousParameters_shouldInitializeCorrectly() {
        Element root = document.createElement("root");
        DOMNodePointer pointer1 = new DOMNodePointer(root, Locale.US);
        Assert.assertEquals(root, pointer1.getBaseValue());
        Assert.assertEquals(root, pointer1.getImmediateNode());
        Assert.assertEquals(Locale.US, pointer1.getLocale());

        DOMNodePointer pointer2 = new DOMNodePointer(root, Locale.GERMANY, "id1");
        Assert.assertEquals(root, pointer2.getBaseValue());
        Assert.assertEquals("id('id1')", pointer2.asPath());

        DOMNodePointer pointer3 = new DOMNodePointer(pointer1, root);
        Assert.assertEquals(pointer1, pointer3.getParent());
        Assert.assertEquals(root, pointer3.getBaseValue());
    }

    @Test
    public void testNode_givenNullTest_shouldReturnTrue() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        Assert.assertTrue(pointer.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(root, null));
    }

    @Test
    public void testNode_givenNodeNameTestNonElement_shouldReturnFalse() {
        Text text = document.createTextNode("sample");
        NodeNameTest test = new NodeNameTest(new QName("sample"));
        Assert.assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testNode_givenNodeNameTestWildcardWithoutPrefix_shouldReturnTrue() {
        Element element = document.createElement("sample");
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(DOMNodePointer.testNode(element, test));
    }

    @Test
    public void testNode_givenNodeNameTestMatchingNameAndNamespace_shouldReturnTrue() {
        Element element = document.createElementNS("http://example.com/ns", "ns:test");
        NodeNameTest test = new NodeNameTest(new QName("ns", "test"), "http://example.com/ns");
        Assert.assertTrue(DOMNodePointer.testNode(element, test));

        NodeNameTest mismatchNS = new NodeNameTest(new QName("ns", "test"), "http://other.com");
        Assert.assertFalse(DOMNodePointer.testNode(element, mismatchNS));

        NodeNameTest mismatchName = new NodeNameTest(new QName("ns", "other"), "http://example.com/ns");
        Assert.assertFalse(DOMNodePointer.testNode(element, mismatchName));
    }

    @Test
    public void testNode_givenNodeNameTestWithoutNodeNamespace_shouldComparePrefixes() {
        Element element = document.createElement("p:test");
        NodeNameTest matchPrefix = new NodeNameTest(new QName("p", "test"), null);
        Assert.assertTrue(DOMNodePointer.testNode(element, matchPrefix));

        NodeNameTest mismatchPrefix = new NodeNameTest(new QName("other", "test"), null);
        Assert.assertFalse(DOMNodePointer.testNode(element, mismatchPrefix));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldMatchCorrectNodeTypes() {
        Element element = document.createElement("elem");
        Text text = document.createTextNode("text");
        CDATASection cdata = document.createCDATASection("cdata");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(DOMNodePointer.testNode(element, nodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(document, nodeTest));
        Assert.assertFalse(DOMNodePointer.testNode(text, nodeTest));

        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(DOMNodePointer.testNode(text, textTest));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, textTest));
        Assert.assertFalse(DOMNodePointer.testNode(element, textTest));

        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(DOMNodePointer.testNode(comment, commentTest));
        Assert.assertFalse(DOMNodePointer.testNode(element, commentTest));

        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));
        Assert.assertFalse(DOMNodePointer.testNode(element, piTest));

        NodeTypeTest unknownTest = new NodeTypeTest(999);
        Assert.assertFalse(DOMNodePointer.testNode(element, unknownTest));
    }

    @Test
    public void testNode_givenProcessingInstructionTest_shouldMatchTarget() {
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        Element elem = document.createElement("elem");

        ProcessingInstructionTest matchingTest = new ProcessingInstructionTest("target");
        ProcessingInstructionTest nonMatchingTest = new ProcessingInstructionTest("other");

        Assert.assertTrue(DOMNodePointer.testNode(pi, matchingTest));
        Assert.assertFalse(DOMNodePointer.testNode(pi, nonMatchingTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, matchingTest));
    }

    @Test
    public void getName_givenVariousNodes_shouldReturnExpectedQName() {
        Element elem = document.createElementNS("http://example.com", "p:tag");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.US);
        QName name = pointer.getName();
        Assert.assertEquals("p", name.getPrefix());
        Assert.assertEquals("tag", name.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("myTarget", "myData");
        DOMNodePointer piPointer = new DOMNodePointer(pi, Locale.US);
        QName piName = piPointer.getName();
        Assert.assertNull(piName.getPrefix());
        Assert.assertEquals("myTarget", piName.getName());

        Text text = document.createTextNode("txt");
        DOMNodePointer textPointer = new DOMNodePointer(text, Locale.US);
        QName textName = textPointer.getName();
        Assert.assertNull(textName.getPrefix());
        Assert.assertNull(textName.getName());
    }

    @Test
    public void getNamespaceURI_givenPrefixesAndInheritance_shouldResolveCorrectly() {
        Element root = document.createElement("root");
        root.setAttribute("xmlns:app", "http://app.com");
        root.setAttribute("xmlns", "http://default.com");
        Element child = document.createElement("child");
        root.appendChild(child);
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        Assert.assertEquals("http://default.com", pointer.getDefaultNamespaceURI());
        Assert.assertEquals("http://default.com", pointer.getNamespaceURI(null));
        Assert.assertEquals("http://default.com", pointer.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://app.com", pointer.getNamespaceURI("app"));
        Assert.assertNull(pointer.getNamespaceURI("unknownPrefix"));

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.US);
        Assert.assertEquals("http://default.com", docPointer.getDefaultNamespaceURI());
        Assert.assertEquals("http://app.com", docPointer.getNamespaceURI("app"));

        Element noDefaultElement = document.createElement("noDefault");
        DOMNodePointer noDefaultPointer = new DOMNodePointer(noDefaultElement, Locale.US);
        Assert.assertNull(noDefaultPointer.getDefaultNamespaceURI());
    }

    @Test
    public void staticHelperMethods_givenVariousNodes_shouldExtractCorrectly() {
        Element prefixed = document.createElement("p:item");
        Assert.assertEquals("p", DOMNodePointer.getPrefix(prefixed));
        Assert.assertEquals("item", DOMNodePointer.getLocalName(prefixed));

        Element unprefixed = document.createElement("item");
        Assert.assertNull(DOMNodePointer.getPrefix(unprefixed));
        Assert.assertEquals("item", DOMNodePointer.getLocalName(unprefixed));

        Element nsElement = document.createElementNS("http://ns.com", "ns:item");
        Assert.assertEquals("http://ns.com", DOMNodePointer.getNamespaceURI(nsElement));

        Element elemWithXmlns = document.createElement("elem");
        elemWithXmlns.setAttribute("xmlns", "http://defaultns.com");
        Assert.assertEquals("http://defaultns.com", DOMNodePointer.getNamespaceURI(elemWithXmlns));

        Element elemWithPrefixedXmlns = document.createElement("elem");
        elemWithPrefixedXmlns.setAttribute("xmlns:p", "http://pns.com");
        Element child = document.createElement("p:child");
        elemWithPrefixedXmlns.appendChild(child);
        Assert.assertEquals("http://pns.com", DOMNodePointer.getNamespaceURI(child));

        document.appendChild(elemWithXmlns);
        Assert.assertEquals("http://defaultns.com", DOMNodePointer.getNamespaceURI(document));
        document.removeChild(elemWithXmlns);
    }

    @Test
    public void nodeProperties_givenVariousConfigurations_shouldReturnExpectedMetadata() {
        Element elem = document.createElement("elem");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.US);

        Assert.assertTrue(pointer.isActual());
        Assert.assertFalse(pointer.isCollection());
        Assert.assertEquals(1, pointer.getLength());
        Assert.assertTrue(pointer.isLeaf());

        elem.appendChild(document.createTextNode("content"));
        Assert.assertFalse(pointer.isLeaf());
    }

    @Test
    public void isLanguage_givenXmlLangHierarchy_shouldMatchCaseInsensitive() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        Assert.assertTrue(pointer.isLanguage("en"));
        Assert.assertTrue(pointer.isLanguage("en-us"));
        Assert.assertFalse(pointer.isLanguage("fr"));

        Element noLang = document.createElement("noLang");
        DOMNodePointer noLangPointer = new DOMNodePointer(noLang, Locale.US);
        Assert.assertTrue(noLangPointer.isLanguage("en"));
    }

    @Test
    public void getValue_givenVariousNodeTypesAndXmlSpace_shouldReturnTrimmedOrPreservedText() {
        Comment comment = document.createComment("  test comment  ");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, Locale.US);
        Assert.assertEquals("test comment", commentPointer.getValue());

        Element root = document.createElement("root");
        Text text = document.createTextNode("   hello   ");
        root.appendChild(text);
        DOMNodePointer textParentPointer = new DOMNodePointer(root, Locale.US);
        Assert.assertEquals("hello", textParentPointer.getValue());

        root.setAttribute("xml:space", "preserve");
        Assert.assertEquals("   hello   ", textParentPointer.getValue());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "  pi data  ");
        DOMNodePointer piPointer = new DOMNodePointer(pi, Locale.US);
        Assert.assertEquals("pi data", piPointer.getValue());

        Comment childComment = document.createComment("ignored");
        root.appendChild(childComment);
        Assert.assertEquals("   hello   ", textParentPointer.getValue());
    }

    @Test
    public void setValue_givenTextNode_shouldUpdateOrRemoveIfEmpty() {
        Element root = document.createElement("root");
        Text text = document.createTextNode("old");
        root.appendChild(text);

        DOMNodePointer textPointer = new DOMNodePointer(text, Locale.US);
        textPointer.setValue("new");
        Assert.assertEquals("new", text.getNodeValue());

        textPointer.setValue("");
        Assert.assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void setValue_givenElementNode_shouldReplaceChildrenWithConvertedTextOrClonedNodes() {
        Element root = document.createElement("root");
        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);

        rootPointer.setValue("text content");
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("text content", root.getFirstChild().getNodeValue());

        Element newChild = document.createElement("newChild");
        newChild.appendChild(document.createTextNode("inner"));
        rootPointer.setValue(newChild);
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("newChild", root.getFirstChild().getNodeName());
        Assert.assertEquals("inner", root.getFirstChild().getFirstChild().getNodeValue());

        Comment comment = document.createComment("a comment");
        rootPointer.setValue(comment);
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertTrue(root.getFirstChild() instanceof Comment);

        rootPointer.setValue("");
        Assert.assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void createAttribute_givenElementWithoutPrefix_shouldSetAttribute() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer attrPtr = pointer.createAttribute(context, new QName("attr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertTrue(root.hasAttribute("attr"));
    }

    @Test
    public void createAttribute_givenElementWithValidPrefix_shouldSetAttributeNS() {
        Element root = document.createElement("root");
        root.setAttribute("xmlns:app", "http://example.com/app");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer attrPtr = pointer.createAttribute(context, new QName("app", "testAttr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertTrue(root.hasAttributeNS("http://example.com/app", "testAttr"));
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_givenElementWithUnknownPrefix_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());

        pointer.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void createAttribute_givenNonElementNode_shouldDelegateToSuperAndFail() {
        Text text = document.createTextNode("sample");
        DOMNodePointer pointer = new DOMNodePointer(text, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());

        pointer.createAttribute(context, new QName("attr"));
    }

    @Test
    public void createChild_givenRegisteredFactory_shouldCreateChildAndSetPosition() {
        final Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());

        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                Element child = document.createElement(name);
                ((Element) node).appendChild(child);
                return true;
            }
        });

        NodePointer childPointer = pointer.createChild(context, new QName("child"), 0);
        Assert.assertNotNull(childPointer);
        Assert.assertEquals("child", childPointer.getName().getName());

        NodePointer childWithValue = pointer.createChild(context, new QName("childVal"), 1, "testValue");
        Assert.assertNotNull(childWithValue);
        Assert.assertEquals("testValue", childWithValue.getValue());
    }

    @Test(expected = JXPathException.class)
    public void createChild_givenNoFactory_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());

        pointer.createChild(context, new QName("child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void createChild_givenFactoryReturningFalse_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());

        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                return false;
            }
        });

        pointer.createChild(context, new QName("child"), 0);
    }

    @Test
    public void remove_givenParentNode_shouldRemoveChildSuccessfully() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        pointer.remove();
        Assert.assertEquals(0, root.getChildNodes().getLength());
    }

    @Test(expected = JXPathException.class)
    public void remove_givenRootNodeWithoutParent_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        pointer.remove();
    }

    @Test
    public void asPath_givenVariousNodesAndParents_shouldGenerateXPathStrings() {
        DOMNodePointer idPointer = new DOMNodePointer(document.createElement("test"), Locale.US, "my'id\"1");
        Assert.assertEquals("id('my&apos;id&quot;1')", idPointer.asPath());

        Element root = document.createElement("root");
        Element child1 = document.createElement("item");
        Element child2 = document.createElement("item");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer child2Pointer = new DOMNodePointer(rootPointer, child2);
        Assert.assertEquals("/item[2]", child2Pointer.asPath());

        Text text1 = document.createTextNode("first");
        Text text2 = document.createTextNode("second");
        child2.appendChild(text1);
        child2.appendChild(text2);
        DOMNodePointer text2Pointer = new DOMNodePointer(child2Pointer, text2);
        Assert.assertEquals("/item[2]/text()[2]", text2Pointer.asPath());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        child2.appendChild(pi);
        DOMNodePointer piPointer = new DOMNodePointer(child2Pointer, pi);
        Assert.assertEquals("/item[2]/processing-instruction('target')[1]", piPointer.asPath());

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.US);
        Assert.assertEquals("", docPointer.asPath());
    }

    @Test
    public void asPath_givenElementWithNamespace_shouldIncludePrefixOrNodeFunction() {
        Element root = document.createElementNS("http://ns.com", "ns:root");
        Element child = document.createElementNS("http://ns.com", "ns:child");
        root.appendChild(child);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("alias", "http://ns.com");
        rootPointer.setNamespaceResolver(resolver);

        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);
        Assert.assertEquals("/alias:child[1]", childPointer.asPath());

        NamespaceResolver emptyResolver = new NamespaceResolver();
        rootPointer.setNamespaceResolver(emptyResolver);
        Assert.assertEquals("/node()[1]", childPointer.asPath());
    }

    @Test
    public void equalsAndHashCode_givenVariousPointers_shouldRespectContract() {
        Element root1 = document.createElement("root");
        Element root2 = document.createElement("root");

        DOMNodePointer pointer1a = new DOMNodePointer(root1, Locale.US);
        DOMNodePointer pointer1b = new DOMNodePointer(root1, Locale.US);
        DOMNodePointer pointer2 = new DOMNodePointer(root2, Locale.US);

        Assert.assertTrue(pointer1a.equals(pointer1a));
        Assert.assertTrue(pointer1a.equals(pointer1b));
        Assert.assertFalse(pointer1a.equals(pointer2));
        Assert.assertFalse(pointer1a.equals(null));
        Assert.assertFalse(pointer1a.equals("string"));

        Assert.assertEquals(pointer1a.hashCode(), pointer1b.hashCode());
    }

    @Test
    public void getPointerByID_givenExistingAndNonExistingId_shouldReturnDOMNodePointerOrNullPointer() {
        Element root = document.createElement("root");
        root.setAttribute("id", "targetId");
        root.setIdAttribute("id", true);
        document.appendChild(root);

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.US);
        JXPathContext context = JXPathContext.newContext(document);

        Pointer found = docPointer.getPointerByID(context, "targetId");
        Assert.assertTrue(found instanceof DOMNodePointer);
        Assert.assertEquals(root, found.getNode());

        Pointer notFound = docPointer.getPointerByID(context, "missingId");
        Assert.assertTrue(notFound instanceof NullPointer);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        Pointer foundFromElement = rootPointer.getPointerByID(context, "targetId");
        Assert.assertTrue(foundFromElement instanceof DOMNodePointer);
    }

    @Test
    public void compareChildNodePointers_givenAttributesAndChildren_shouldOrderCorrectly() {
        Element root = document.createElement("root");
        root.setAttribute("a", "1");
        root.setAttribute("b", "2");

        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer parentPointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer child1Pointer = new DOMNodePointer(parentPointer, child1);
        DOMNodePointer child2Pointer = new DOMNodePointer(parentPointer, child2);

        Assert.assertEquals(0, parentPointer.compareChildNodePointers(child1Pointer, child1Pointer));
        Assert.assertEquals(-1, parentPointer.compareChildNodePointers(child1Pointer, child2Pointer));
        Assert.assertEquals(1, parentPointer.compareChildNodePointers(child2Pointer, child1Pointer));

        Attr attrA = root.getAttributeNode("a");
        Attr attrB = root.getAttributeNode("b");
        DOMNodePointer attrAPointer = new DOMNodePointer(parentPointer, attrA);
        DOMNodePointer attrBPointer = new DOMNodePointer(parentPointer, attrB);

        Assert.assertEquals(-1, parentPointer.compareChildNodePointers(attrAPointer, child1Pointer));
        Assert.assertEquals(1, parentPointer.compareChildNodePointers(child1Pointer, attrAPointer));
        Assert.assertTrue(parentPointer.compareChildNodePointers(attrAPointer, attrBPointer) != 0);

        Element unrelated = document.createElement("unrelated");
        DOMNodePointer unrelatedPointer = new DOMNodePointer(parentPointer, unrelated);
        Assert.assertEquals(0, parentPointer.compareChildNodePointers(child1Pointer, unrelatedPointer));
    }

    @Test
    public void iterators_givenDOMNodePointer_shouldReturnNonNullIterators() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);

        NodeIterator childIt = pointer.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = pointer.attributeIterator(new QName("test"));
        Assert.assertNotNull(attrIt);

        NodePointer nsPtr = pointer.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);

        NodeIterator nsIt = pointer.namespaceIterator();
        Assert.assertNotNull(nsIt);
    }
}