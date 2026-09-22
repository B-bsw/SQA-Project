package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
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
        Assert.assertSame(root, pointer1.getBaseValue());
        Assert.assertSame(root, pointer1.getImmediateNode());
        Assert.assertEquals(Locale.US, pointer1.getLocale());

        DOMNodePointer pointer2 = new DOMNodePointer(root, Locale.GERMANY, "customId");
        Assert.assertSame(root, pointer2.getBaseValue());
        Assert.assertEquals("id('customId')", pointer2.asPath());

        DOMNodePointer pointer3 = new DOMNodePointer(pointer1, root);
        Assert.assertSame(pointer1, pointer3.getParent());
        Assert.assertSame(root, pointer3.getBaseValue());
    }

    @Test
    public void testNode_givenNullTest_shouldReturnTrue() {
        Element element = document.createElement("test");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);

        Assert.assertTrue(pointer.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(element, null));
    }

    @Test
    public void testNode_givenNodeNameTestOnNonElement_shouldReturnFalse() {
        Text text = document.createTextNode("sample");
        DOMNodePointer pointer = new DOMNodePointer(text, Locale.ENGLISH);
        NodeNameTest test = new NodeNameTest(new QName("test"));

        Assert.assertFalse(pointer.testNode(test));
    }

    @Test
    public void testNode_givenWildcardNodeNameTest_shouldEvaluateCorrectly() {
        Element element = document.createElement("test");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);

        NodeNameTest wildcardNoPrefix = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(pointer.testNode(wildcardNoPrefix));

        NodeNameTest wildcardWithPrefix = new NodeNameTest(new QName("p", "*"), "http://example.com");
        Assert.assertFalse(pointer.testNode(wildcardWithPrefix));

        Element nsElement = document.createElementNS("http://example.com", "p:child");
        DOMNodePointer nsPointer = new DOMNodePointer(nsElement, Locale.ENGLISH);
        Assert.assertTrue(nsPointer.testNode(wildcardWithPrefix));
    }

    @Test
    public void testNode_givenMatchingAndMismatchingNodeNameTest_shouldEvaluateCorrectly() {
        Element element = document.createElement("targetName");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);

        NodeNameTest matchingTest = new NodeNameTest(new QName("targetName"));
        Assert.assertTrue(pointer.testNode(matchingTest));

        NodeNameTest mismatchingTest = new NodeNameTest(new QName("otherName"));
        Assert.assertFalse(pointer.testNode(mismatchingTest));

        Element elementWithPrefix = document.createElement("pre:targetName");
        NodeNameTest testWithPrefix = new NodeNameTest(new QName("pre", "targetName"));
        Assert.assertTrue(DOMNodePointer.testNode(elementWithPrefix, testWithPrefix));

        NodeNameTest testWithMismatchPrefix = new NodeNameTest(new QName("otherPre", "targetName"));
        Assert.assertFalse(DOMNodePointer.testNode(elementWithPrefix, testWithMismatchPrefix));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldHandleAllNodeTypes() {
        Element elem = document.createElement("elem");
        Text text = document.createTextNode("txt");
        CDATASection cdata = document.createCDATASection("cdata");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        NodeTypeTest anyNodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(DOMNodePointer.testNode(elem, anyNodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(text, anyNodeTest));

        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(DOMNodePointer.testNode(text, textTest));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, textTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, textTest));

        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(DOMNodePointer.testNode(comment, commentTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, commentTest));

        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTest));

        NodeTypeTest unknownTypeTest = new NodeTypeTest(999);
        Assert.assertFalse(DOMNodePointer.testNode(elem, unknownTypeTest));
    }

    @Test
    public void testNode_givenProcessingInstructionTest_shouldEvaluateTarget() {
        ProcessingInstruction pi = document.createProcessingInstruction("myTarget", "someData");
        Element elem = document.createElement("elem");

        ProcessingInstructionTest matchingTest = new ProcessingInstructionTest("myTarget");
        ProcessingInstructionTest mismatchingTest = new ProcessingInstructionTest("otherTarget");

        Assert.assertTrue(DOMNodePointer.testNode(pi, matchingTest));
        Assert.assertFalse(DOMNodePointer.testNode(pi, mismatchingTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, matchingTest));
    }

    @Test
    public void getName_givenVariousNodes_shouldReturnExpectedQName() {
        Element elem = document.createElement("simple");
        DOMNodePointer pointer1 = new DOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, "simple"), pointer1.getName());

        Element prefixedElem = document.createElement("ns:complex");
        DOMNodePointer pointer2 = new DOMNodePointer(prefixedElem, Locale.ENGLISH);
        Assert.assertEquals(new QName("ns", "complex"), pointer2.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("targetPi", "data");
        DOMNodePointer pointer3 = new DOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, "targetPi"), pointer3.getName());

        Text text = document.createTextNode("content");
        DOMNodePointer pointer4 = new DOMNodePointer(text, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, null), pointer4.getName());
    }

    @Test
    public void getNamespaceURI_givenPrefixes_shouldResolveProperly() {
        Element root = document.createElementNS("http://default.com", "root");
        root.setAttribute("xmlns:custom", "http://custom.com");
        root.setAttribute("xmlns", "http://default.com");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ENGLISH);

        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://custom.com", pointer.getNamespaceURI("custom"));
        Assert.assertEquals("http://default.com", pointer.getNamespaceURI(""));
        Assert.assertEquals("http://default.com", pointer.getNamespaceURI((String) null));

        Assert.assertNull(pointer.getNamespaceURI("unboundPrefix"));
        // Cached lookup
        Assert.assertNull(pointer.getNamespaceURI("unboundPrefix"));
        Assert.assertEquals("http://custom.com", pointer.getNamespaceURI("custom"));
    }

    @Test
    public void getNamespaceURI_givenDocumentNode_shouldDelegateToDocumentElement() {
        Element root = document.createElementNS("http://rootns.com", "root");
        root.setAttribute("xmlns:app", "http://app.com");
        document.appendChild(root);

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertEquals("http://app.com", docPointer.getNamespaceURI("app"));
        Assert.assertEquals("http://rootns.com", docPointer.getDefaultNamespaceURI());
        Assert.assertEquals("http://rootns.com", docPointer.getNamespaceURI());
    }

    @Test
    public void basicProperties_givenNode_shouldReturnConstants() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ENGLISH);

        Assert.assertTrue(pointer.isActual());
        Assert.assertFalse(pointer.isCollection());
        Assert.assertEquals(1, pointer.getLength());
        Assert.assertTrue(pointer.isLeaf());

        root.appendChild(document.createElement("child"));
        Assert.assertFalse(pointer.isLeaf());
    }

    @Test
    public void isLanguage_givenXmlLangHierarchy_shouldEvaluateCorrectly() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.ENGLISH);
        Assert.assertTrue(childPointer.isLanguage("en"));
        Assert.assertTrue(childPointer.isLanguage("en-US"));
        Assert.assertFalse(childPointer.isLanguage("fr"));

        Element noLangElem = document.createElement("standalone");
        DOMNodePointer noLangPointer = new DOMNodePointer(noLangElem, Locale.GERMAN);
        Assert.assertTrue(noLangPointer.isLanguage("de"));
    }

    @Test
    public void setValue_givenTextOrCDataNode_shouldUpdateOrRemove() {
        Element parent = document.createElement("parent");
        Text text = document.createTextNode("initial");
        parent.appendChild(text);

        DOMNodePointer textPointer = new DOMNodePointer(text, Locale.ENGLISH);
        textPointer.setValue("updated");
        Assert.assertEquals("updated", text.getNodeValue());

        textPointer.setValue("");
        Assert.assertNull(text.getParentNode());

        CDATASection cdata = document.createCDATASection("initialCData");
        parent.appendChild(cdata);
        DOMNodePointer cdataPointer = new DOMNodePointer(cdata, Locale.ENGLISH);
        cdataPointer.setValue(null);
        Assert.assertNull(cdata.getParentNode());
    }

    @Test
    public void setValue_givenElementNode_shouldReplaceChildrenWithConvertedString() {
        Element parent = document.createElement("parent");
        parent.appendChild(document.createElement("oldChild"));
        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.ENGLISH);

        pointer.setValue("newTextValue");
        Assert.assertEquals(1, parent.getChildNodes().getLength());
        Assert.assertEquals("newTextValue", parent.getFirstChild().getNodeValue());

        pointer.setValue(null);
        Assert.assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test
    public void setValue_givenElementNode_shouldAppendClonedNodes() {
        Element parent = document.createElement("parent");
        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.ENGLISH);

        Element sourceElem = document.createElement("source");
        Element childElem = document.createElement("sourceChild");
        sourceElem.appendChild(childElem);

        pointer.setValue(sourceElem);
        Assert.assertEquals(1, parent.getChildNodes().getLength());
        Assert.assertEquals("sourceChild", parent.getFirstChild().getNodeName());

        Document sourceDoc = null;
        try {
            sourceDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element docElem = sourceDoc.createElement("docElem");
            sourceDoc.appendChild(docElem);
            pointer.setValue(sourceDoc);
            Assert.assertEquals(1, parent.getChildNodes().getLength());
            Assert.assertEquals("docElem", parent.getFirstChild().getNodeName());
        } catch (Exception e) {
            Assert.fail("Document creation failed: " + e.getMessage());
        }

        Text rawTextNode = document.createTextNode("rawText");
        pointer.setValue(rawTextNode);
        Assert.assertEquals(1, parent.getChildNodes().getLength());
        Assert.assertEquals("rawText", parent.getFirstChild().getNodeValue());
    }

    @Test
    public void createAttribute_givenElementWithoutPrefix_shouldSetAttribute() {
        Element element = document.createElement("elem");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer attrPointer = pointer.createAttribute(context, new QName("attrKey"));
        Assert.assertNotNull(attrPointer);
        Assert.assertTrue(element.hasAttribute("attrKey"));
    }

    @Test
    public void createAttribute_givenElementWithPrefix_shouldSetAttributeNS() {
        Element element = document.createElementNS("http://test.com", "p:elem");
        element.setAttribute("xmlns:p", "http://test.com");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer attrPointer = pointer.createAttribute(context, new QName("p", "attrKey"));
        Assert.assertNotNull(attrPointer);
        Assert.assertEquals("http://test.com", element.getAttributeNodeNS("http://test.com", "attrKey").getNamespaceURI());
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_givenUnknownPrefix_shouldThrowException() {
        Element element = document.createElement("elem");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        pointer.createAttribute(context, new QName("unknown", "attrKey"));
    }

    @Test(expected = JXPathException.class)
    public void remove_givenRootNode_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ENGLISH);
        pointer.remove();
    }

    @Test
    public void remove_givenChildNode_shouldRemoveFromParent() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.ENGLISH);
        pointer.remove();
        Assert.assertNull(child.getParentNode());
    }

    @Test
    public void asPath_givenVariousNodes_shouldBuildExpectedPaths() {
        Element root = document.createElement("root");
        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.ENGLISH);
        Assert.assertEquals("", rootPointer.asPath());

        Element child1 = document.createElement("item");
        Element child2 = document.createElement("item");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer pChild1 = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer pChild2 = new DOMNodePointer(rootPointer, child2);
        Assert.assertEquals("/item[1]", pChild1.asPath());
        Assert.assertEquals("/item[2]", pChild2.asPath());

        Text text = document.createTextNode("test");
        root.appendChild(text);
        DOMNodePointer textPointer = new DOMNodePointer(rootPointer, text);
        Assert.assertEquals("/text()[1]", textPointer.asPath());

        ProcessingInstruction pi = document.createProcessingInstruction("myTarget", "data");
        root.appendChild(pi);
        DOMNodePointer piPointer = new DOMNodePointer(rootPointer, pi);
        Assert.assertEquals("/processing-instruction('myTarget')[1]", piPointer.asPath());

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertEquals("", docPointer.asPath());
    }

    @Test
    public void asPath_givenNamespaceElementWithoutPrefixInResolver_shouldUseNodeFunction() {
        Element root = document.createElementNS("http://ns.com", "root");
        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.ENGLISH);
        Element child = document.createElementNS("http://ns.com", "child");
        root.appendChild(child);

        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);
        Assert.assertEquals("/node()[1]", childPointer.asPath());
    }

    @Test
    public void equalsAndHashCode_givenSameOrEquivalentInstances_shouldBehaveCorrectly() {
        Element elem1 = document.createElement("test");
        Element elem2 = document.createElement("test");

        DOMNodePointer p1 = new DOMNodePointer(elem1, Locale.ENGLISH);
        DOMNodePointer p2 = new DOMNodePointer(elem1, Locale.ENGLISH);
        DOMNodePointer p3 = new DOMNodePointer(elem2, Locale.ENGLISH);

        Assert.assertTrue(p1.equals(p1));
        Assert.assertTrue(p1.equals(p2));
        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("NotAPointer"));
        Assert.assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void getValue_givenVariousNodeTypes_shouldExtractStringValue() {
        Comment comment = document.createComment(" sample comment ");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertEquals("sample comment", commentPointer.getValue());

        Element parent = document.createElement("parent");
        Text t1 = document.createTextNode("  Hello  ");
        ProcessingInstruction pi = document.createProcessingInstruction("pi", "  world  ");
        parent.appendChild(t1);
        parent.appendChild(pi);

        DOMNodePointer parentPointer = new DOMNodePointer(parent, Locale.ENGLISH);
        Assert.assertEquals("Helloworld", parentPointer.getValue());

        Element preserveElem = document.createElement("preserved");
        preserveElem.setAttribute("xml:space", "preserve");
        Text tPreserve = document.createTextNode("  Keep Spaces  ");
        preserveElem.appendChild(tPreserve);
        DOMNodePointer preservePointer = new DOMNodePointer(preserveElem, Locale.ENGLISH);
        Assert.assertEquals("  Keep Spaces  ", preservePointer.getValue());
    }

    @Test
    public void getPointerByID_givenDocument_shouldReturnPointerOrNullPointer() {
        Element root = document.createElement("root");
        root.setAttribute("id", "rootId");
        root.setIdAttribute("id", true);
        document.appendChild(root);

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        Pointer found = docPointer.getPointerByID(context, "rootId");
        Assert.assertTrue(found instanceof DOMNodePointer);
        Assert.assertSame(root, found.getNode());

        Pointer notFound = docPointer.getPointerByID(context, "missingId");
        Assert.assertTrue(notFound instanceof NullPointer);
    }

    @Test
    public void compareChildNodePointers_givenChildrenAndAttributes_shouldDetermineOrder() {
        Element root = document.createElement("root");
        root.setAttribute("attr1", "val1");
        root.setAttribute("attr2", "val2");
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer pChild1 = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer pChild2 = new DOMNodePointer(rootPointer, child2);

        Assert.assertEquals(0, rootPointer.compareChildNodePointers(pChild1, pChild1));
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(pChild1, pChild2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(pChild2, pChild1));

        Attr attr1 = root.getAttributeNode("attr1");
        DOMNodePointer pAttr1 = new DOMNodePointer(rootPointer, attr1);

        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(pAttr1, pChild1));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(pChild1, pAttr1));

        Attr attr2 = root.getAttributeNode("attr2");
        DOMNodePointer pAttr2 = new DOMNodePointer(rootPointer, attr2);
        int attrComparison = rootPointer.compareChildNodePointers(pAttr1, pAttr2);
        Assert.assertTrue(attrComparison == -1 || attrComparison == 1);
    }

    @Test
    public void iteratorsAndResolvers_givenPointer_shouldInitializeSubComponents() {
        Element element = document.createElement("elem");
        DOMNodePointer pointer = new DOMNodePointer(element, Locale.ENGLISH);

        NodeIterator childIter = pointer.childIterator(null, false, null);
        Assert.assertNotNull(childIter);

        NodeIterator attrIter = pointer.attributeIterator(new QName("test"));
        Assert.assertNotNull(attrIter);

        NodePointer nsPointer = pointer.namespacePointer("xmlns");
        Assert.assertNotNull(nsPointer);

        NodeIterator nsIter = pointer.namespaceIterator();
        Assert.assertNotNull(nsIter);

        NamespaceResolver resolver = pointer.getNamespaceResolver();
        Assert.assertNotNull(resolver);
        Assert.assertSame(resolver, pointer.getNamespaceResolver());
    }

    @Test
    public void getPrefixAndLocalName_givenNodesWithAndWithoutPrefix_shouldReturnExpected() {
        Element simple = document.createElement("simple");
        Assert.assertNull(DOMNodePointer.getPrefix(simple));
        Assert.assertEquals("simple", DOMNodePointer.getLocalName(simple));

        Element prefixed = document.createElement("ns:compound");
        Assert.assertEquals("ns", DOMNodePointer.getPrefix(prefixed));
        Assert.assertEquals("compound", DOMNodePointer.getLocalName(prefixed));
    }
}