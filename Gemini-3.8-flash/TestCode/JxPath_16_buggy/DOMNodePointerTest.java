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
import org.w3c.dom.Node;
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
    public void constructor_givenNodeAndLocale_shouldInitializeProperly() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);

        Assert.assertSame(root, pointer.getNode());
        Assert.assertSame(root, pointer.getBaseValue());
        Assert.assertSame(root, pointer.getImmediateNode());
        Assert.assertEquals(Locale.US, pointer.getLocale());
        Assert.assertNull(pointer.getParent());
    }

    @Test
    public void constructor_givenNodeLocaleAndId_shouldInitializeWithId() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.ENGLISH, "id123");

        Assert.assertSame(root, pointer.getNode());
        Assert.assertEquals("id('id123')", pointer.asPath());
    }

    @Test
    public void constructor_givenParentAndNode_shouldInitializeWithParent() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);

        Assert.assertSame(rootPointer, childPointer.getParent());
        Assert.assertSame(child, childPointer.getNode());
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
        Text text = document.createTextNode("text");
        NodeNameTest test = new NodeNameTest(new QName("test"));

        Assert.assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testNode_givenNodeNameTestWildcardNoPrefix_shouldReturnTrue() {
        Element elem = document.createElement("sample");
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));

        Assert.assertTrue(DOMNodePointer.testNode(elem, test));
    }

    @Test
    public void testNode_givenNodeNameTestWildcardWithPrefix_shouldMatchNamespaceOrPrefix() {
        Element elem = document.createElementNS("http://example.com/ns", "p:sample");
        NodeNameTest testMatching = new NodeNameTest(new QName("p", "*"), "http://example.com/ns");
        NodeNameTest testMismatch = new NodeNameTest(new QName("p", "*"), "http://other.com");

        Assert.assertTrue(DOMNodePointer.testNode(elem, testMatching));
        Assert.assertFalse(DOMNodePointer.testNode(elem, testMismatch));

        Element noNsElem = document.createElement("p:sample");
        NodeNameTest testNoNsMatching = new NodeNameTest(new QName("p", "*"), null);
        NodeNameTest testNoNsMismatch = new NodeNameTest(new QName("other", "*"), null);

        Assert.assertTrue(DOMNodePointer.testNode(noNsElem, testNoNsMatching));
        Assert.assertFalse(DOMNodePointer.testNode(noNsElem, testNoNsMismatch));
    }

    @Test
    public void testNode_givenNodeNameTestSpecificName_shouldMatchAppropriately() {
        Element elem = document.createElementNS("http://example.com/ns", "p:item");
        NodeNameTest match = new NodeNameTest(new QName("p", "item"), "http://example.com/ns");
        NodeNameTest nameMismatch = new NodeNameTest(new QName("p", "other"), "http://example.com/ns");
        NodeNameTest nsMismatch = new NodeNameTest(new QName("p", "item"), "http://other.com");

        Assert.assertTrue(DOMNodePointer.testNode(elem, match));
        Assert.assertFalse(DOMNodePointer.testNode(elem, nameMismatch));
        Assert.assertFalse(DOMNodePointer.testNode(elem, nsMismatch));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldMatchProperNodeTypes() {
        Element elem = document.createElement("elem");
        Text text = document.createTextNode("txt");
        CDATASection cdata = document.createCDATASection("cdata");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(DOMNodePointer.testNode(elem, nodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(document, nodeTest));
        Assert.assertFalse(DOMNodePointer.testNode(text, nodeTest));

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

        NodeTypeTest unknownTest = new NodeTypeTest(999);
        Assert.assertFalse(DOMNodePointer.testNode(elem, unknownTest));
    }

    @Test
    public void testNode_givenProcessingInstructionTest_shouldMatchTargetOnlyOnPI() {
        ProcessingInstruction pi = document.createProcessingInstruction("myTarget", "someData");
        Element elem = document.createElement("elem");

        ProcessingInstructionTest matchTest = new ProcessingInstructionTest("myTarget");
        ProcessingInstructionTest mismatchTest = new ProcessingInstructionTest("otherTarget");

        Assert.assertTrue(DOMNodePointer.testNode(pi, matchTest));
        Assert.assertFalse(DOMNodePointer.testNode(pi, mismatchTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, matchTest));
    }

    @Test
    public void testNode_givenUnrecognizedNodeTest_shouldReturnFalse() {
        Element elem = document.createElement("elem");
        NodeTest customTest = new NodeTest() {};
        Assert.assertFalse(DOMNodePointer.testNode(elem, customTest));
    }

    @Test
    public void getName_givenElement_shouldReturnPrefixAndLocalName() {
        Element elemWithPrefix = document.createElementNS("http://example.com", "prefix:myElement");
        DOMNodePointer pointer1 = new DOMNodePointer(elemWithPrefix, Locale.US);
        QName name1 = pointer1.getName();
        Assert.assertEquals("prefix", name1.getPrefix());
        Assert.assertEquals("myElement", name1.getName());

        Element elemNoPrefix = document.createElement("plainElement");
        DOMNodePointer pointer2 = new DOMNodePointer(elemNoPrefix, Locale.US);
        QName name2 = pointer2.getName();
        Assert.assertNull(name2.getPrefix());
        Assert.assertEquals("plainElement", name2.getName());
    }

    @Test
    public void getName_givenProcessingInstruction_shouldReturnTargetAsName() {
        ProcessingInstruction pi = document.createProcessingInstruction("targetName", "data");
        DOMNodePointer pointer = new DOMNodePointer(pi, Locale.US);
        QName name = pointer.getName();
        Assert.assertNull(name.getPrefix());
        Assert.assertEquals("targetName", name.getName());
    }

    @Test
    public void getName_givenOtherNodeType_shouldReturnNullNameAndPrefix() {
        Text text = document.createTextNode("content");
        DOMNodePointer pointer = new DOMNodePointer(text, Locale.US);
        QName name = pointer.getName();
        Assert.assertNull(name.getPrefix());
        Assert.assertNull(name.getName());
    }

    @Test
    public void getNamespaceURI_givenPrefixes_shouldResolveCorrectly() {
        Element root = document.createElementNS("http://default.com", "root");
        root.setAttribute("xmlns", "http://default.com");
        root.setAttribute("xmlns:custom", "http://custom.com");
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);

        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://default.com", pointer.getNamespaceURI(""));
        Assert.assertEquals("http://default.com", pointer.getNamespaceURI((String) null));
        Assert.assertEquals("http://custom.com", pointer.getNamespaceURI("custom"));
        Assert.assertNull(pointer.getNamespaceURI("unknownPrefix"));

        // Second call to test caching
        Assert.assertEquals("http://custom.com", pointer.getNamespaceURI("custom"));
        Assert.assertNull(pointer.getNamespaceURI("unknownPrefix"));
    }

    @Test
    public void getNamespaceURI_givenDocumentNode_shouldLookupOnDocumentElement() {
        Element root = document.createElement("root");
        root.setAttribute("xmlns:app", "http://app.com");
        document.appendChild(root);

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.US);
        Assert.assertEquals("http://app.com", docPointer.getNamespaceURI("app"));
    }

    @Test
    public void getDefaultNamespaceURI_givenNoDefault_shouldReturnNull() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        Assert.assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void getDefaultNamespaceURI_givenEmptyDefault_shouldReturnNull() {
        Element root = document.createElement("root");
        root.setAttribute("xmlns", "");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        Assert.assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    public void isLeaf_givenNodeWithOrWithoutChildren_shouldReflectState() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        Assert.assertTrue(pointer.isLeaf());

        root.appendChild(document.createElement("child"));
        Assert.assertFalse(pointer.isLeaf());
    }

    @Test
    public void isActualAndIsCollectionAndLength_shouldReturnFixedValues() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);

        Assert.assertTrue(pointer.isActual());
        Assert.assertFalse(pointer.isCollection());
        Assert.assertEquals(1, pointer.getLength());
    }

    @Test
    public void isLanguage_givenXmlLangHierarchy_shouldDetermineLanguage() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPointer = new DOMNodePointer(child, Locale.US);
        Assert.assertTrue(childPointer.isLanguage("en"));
        Assert.assertTrue(childPointer.isLanguage("EN-US"));
        Assert.assertFalse(childPointer.isLanguage("fr"));

        Element rootNoLang = document.createElement("root");
        DOMNodePointer noLangPointer = new DOMNodePointer(rootNoLang, Locale.GERMAN);
        Assert.assertTrue(noLangPointer.isLanguage("de"));
    }

    @Test
    public void setValue_givenTextOrCdataNodeNonEmpty_shouldUpdateValue() {
        Text text = document.createTextNode("old");
        Element parent = document.createElement("parent");
        parent.appendChild(text);

        DOMNodePointer pointer = new DOMNodePointer(text, Locale.US);
        pointer.setValue("newText");
        Assert.assertEquals("newText", text.getNodeValue());

        CDATASection cdata = document.createCDATASection("oldCdata");
        parent.appendChild(cdata);
        DOMNodePointer cdataPointer = new DOMNodePointer(cdata, Locale.US);
        cdataPointer.setValue("newCdata");
        Assert.assertEquals("newCdata", cdata.getNodeValue());
    }

    @Test
    public void setValue_givenTextNodeEmptyOrNull_shouldRemoveNodeFromParent() {
        Element parent = document.createElement("parent");
        Text text1 = document.createTextNode("old");
        parent.appendChild(text1);

        DOMNodePointer pointer1 = new DOMNodePointer(text1, Locale.US);
        pointer1.setValue("");
        Assert.assertNull(text1.getParentNode());

        Text text2 = document.createTextNode("old2");
        parent.appendChild(text2);
        DOMNodePointer pointer2 = new DOMNodePointer(text2, Locale.US);
        pointer2.setValue(null);
        Assert.assertNull(text2.getParentNode());
    }

    @Test
    public void setValue_givenElementWithString_shouldReplaceChildrenWithTextNode() {
        Element parent = document.createElement("parent");
        parent.appendChild(document.createElement("oldChild"));

        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        pointer.setValue("simple text");

        Assert.assertEquals(1, parent.getChildNodes().getLength());
        Assert.assertEquals(Node.TEXT_NODE, parent.getFirstChild().getNodeType());
        Assert.assertEquals("simple text", parent.getFirstChild().getNodeValue());

        pointer.setValue("");
        Assert.assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test
    public void setValue_givenElementWithElementOrDocumentNode_shouldAppendClonedChildren() {
        Element parent = document.createElement("parent");
        parent.appendChild(document.createElement("oldChild"));

        Element sourceElem = document.createElement("source");
        sourceElem.appendChild(document.createElement("sub1"));
        sourceElem.appendChild(document.createElement("sub2"));

        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        pointer.setValue(sourceElem);

        Assert.assertEquals(2, parent.getChildNodes().getLength());
        Assert.assertEquals("sub1", parent.getChildNodes().item(0).getNodeName());
        Assert.assertEquals("sub2", parent.getChildNodes().item(1).getNodeName());

        Document sourceDoc = null;
        try {
            sourceDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (Exception e) {
            Assert.fail("Document creation failed: " + e.getMessage());
        }
        Element docRoot = sourceDoc.createElement("docRoot");
        sourceDoc.appendChild(docRoot);
        pointer.setValue(sourceDoc);
        Assert.assertEquals(1, parent.getChildNodes().getLength());
        Assert.assertEquals("docRoot", parent.getFirstChild().getNodeName());
    }

    @Test
    public void setValue_givenElementWithNonElementNode_shouldAppendClonedNode() {
        Element parent = document.createElement("parent");
        Comment comment = document.createComment("my comment");

        DOMNodePointer pointer = new DOMNodePointer(parent, Locale.US);
        pointer.setValue(comment);

        Assert.assertEquals(1, parent.getChildNodes().getLength());
        Assert.assertEquals(Node.COMMENT_NODE, parent.getFirstChild().getNodeType());
        Assert.assertEquals("my comment", ((Comment) parent.getFirstChild()).getData());
    }

    @Test
    public void remove_givenNodeWithParent_shouldRemoveSuccessfully() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer pointer = new DOMNodePointer(child, Locale.US);
        pointer.remove();

        Assert.assertNull(child.getParentNode());
        Assert.assertEquals(0, root.getChildNodes().getLength());
    }

    @Test(expected = JXPathException.class)
    public void remove_givenRootNodeWithoutParent_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        pointer.remove();
    }

    @Test
    public void asPath_givenIdWithSpecialCharacters_shouldEscape() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US, "a'b\"c");
        Assert.assertEquals("id('a&apos;b&quot;c')", pointer.asPath());

        DOMNodePointer plainPointer = new DOMNodePointer(root, Locale.US, "plainId");
        Assert.assertEquals("id('plainId')", pointerPlain(plainPointer));
    }

    private String pointerPlain(DOMNodePointer p) {
        return p.asPath();
    }

    @Test
    public void asPath_givenDocumentNode_shouldReturnEmptyOrSlash() {
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.US);
        Assert.assertEquals("", docPointer.asPath());
    }

    @Test
    public void asPath_givenElementStructure_shouldBuildXPathWithIndices() {
        Element root = document.createElement("root");
        Element child1 = document.createElement("child");
        Element child2 = document.createElement("child");
        Element other = document.createElement("other");
        root.appendChild(child1);
        root.appendChild(child2);
        root.appendChild(other);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer child1Pointer = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer child2Pointer = new DOMNodePointer(rootPointer, child2);
        DOMNodePointer otherPointer = new DOMNodePointer(rootPointer, other);

        Assert.assertEquals("/child[1]", child1Pointer.asPath());
        Assert.assertEquals("/child[2]", child2Pointer.asPath());
        Assert.assertEquals("/other[1]", otherPointer.asPath());
    }

    @Test
    public void asPath_givenNamespacedElementStructure_shouldIncludePrefixOrNode() {
        Element root = document.createElementNS("http://ns.com", "ns:root");
        Element child = document.createElementNS("http://ns.com", "ns:child");
        root.appendChild(child);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);

        String path = childPointer.asPath();
        Assert.assertTrue(path.endsWith("[1]"));
        Assert.assertTrue(path.indexOf("child") >= 0 || path.indexOf("node()") >= 0);
    }

    @Test
    public void asPath_givenTextAndCdataAndPI_shouldIncludeRespectiveFunctions() {
        Element root = document.createElement("root");
        Text text1 = document.createTextNode("txt1");
        CDATASection cdata2 = document.createCDATASection("cdata2");
        ProcessingInstruction pi1 = document.createProcessingInstruction("piTarget", "data1");
        ProcessingInstruction pi2 = document.createProcessingInstruction("piTarget", "data2");
        root.appendChild(text1);
        root.appendChild(cdata2);
        root.appendChild(pi1);
        root.appendChild(pi2);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer text1Pointer = new DOMNodePointer(rootPointer, text1);
        DOMNodePointer cdata2Pointer = new DOMNodePointer(rootPointer, cdata2);
        DOMNodePointer pi1Pointer = new DOMNodePointer(rootPointer, pi1);
        DOMNodePointer pi2Pointer = new DOMNodePointer(rootPointer, pi2);

        Assert.assertEquals("/text()[1]", text1Pointer.asPath());
        Assert.assertEquals("/text()[2]", cdata2Pointer.asPath());
        Assert.assertEquals("/processing-instruction('piTarget')[1]", pi1Pointer.asPath());
        Assert.assertEquals("/processing-instruction('piTarget')[2]", pi2Pointer.asPath());
    }

    @Test
    public void hashCodeAndEquals_shouldConformToContract() {
        Element elem1 = document.createElement("elem");
        Element elem2 = document.createElement("elem");

        DOMNodePointer p1 = new DOMNodePointer(elem1, Locale.US);
        DOMNodePointer p1Duplicate = new DOMNodePointer(elem1, Locale.CANADA);
        DOMNodePointer p2 = new DOMNodePointer(elem2, Locale.US);

        Assert.assertEquals(p1.hashCode(), p1Duplicate.hashCode());
        Assert.assertTrue(p1.equals(p1));
        Assert.assertTrue(p1.equals(p1Duplicate));
        Assert.assertFalse(p1.equals(p2));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("nonDOMNodePointer"));
    }

    @Test
    public void getValue_givenCommentNode_shouldReturnTrimmedData() {
        Comment comment = document.createComment("  hello world  ");
        DOMNodePointer pointer = new DOMNodePointer(comment, Locale.US);
        Assert.assertEquals("hello world", pointer.getValue());

        Comment emptyComment = document.createComment(null);
        DOMNodePointer emptyPointer = new DOMNodePointer(emptyComment, Locale.US);
        Assert.assertEquals("", emptyPointer.getValue());
    }

    @Test
    public void getValue_givenTextAndCdataAndPI_shouldConcatenateAndHandleWhitespace() {
        Element root = document.createElement("root");
        Text text = document.createTextNode("  hello  ");
        CDATASection cdata = document.createCDATASection("  world  ");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "  piData  ");
        Comment comment = document.createComment("ignored");

        root.appendChild(text);
        root.appendChild(cdata);
        root.appendChild(pi);
        root.appendChild(comment);

        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        Assert.assertEquals("helloworldpiData", pointer.getValue());

        root.setAttribute("xml:space", "preserve");
        Assert.assertEquals("  hello    world    piData  ", pointer.getValue());
    }

    @Test
    public void getPointerByID_givenExistingAndNonExistingId_shouldReturnExpected() {
        Element root = document.createElement("root");
        Element target = document.createElement("target");
        target.setAttribute("id", "t1");
        target.setIdAttribute("id", true);
        root.appendChild(target);
        document.appendChild(root);

        JXPathContext context = JXPathContext.newContext(document);
        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.US);

        Pointer found = docPointer.getPointerByID(context, "t1");
        Assert.assertTrue(found instanceof DOMNodePointer);
        Assert.assertSame(target, found.getNode());

        Pointer notFound = docPointer.getPointerByID(context, "nonExistent");
        Assert.assertTrue(notFound instanceof NullPointer);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        Pointer foundFromRoot = rootPointer.getPointerByID(context, "t1");
        Assert.assertTrue(foundFromRoot instanceof DOMNodePointer);
        Assert.assertSame(target, foundFromRoot.getNode());
    }

    @Test
    public void compareChildNodePointers_givenDifferentTypesAndOrder_shouldCompareProperly() {
        Element root = document.createElement("root");
        root.setAttribute("attr1", "val1");
        root.setAttribute("attr2", "val2");
        Attr attr1 = root.getAttributeNode("attr1");
        Attr attr2 = root.getAttributeNode("attr2");

        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.US);
        DOMNodePointer ptrAttr1 = new DOMNodePointer(rootPointer, attr1);
        DOMNodePointer ptrAttr2 = new DOMNodePointer(rootPointer, attr2);
        DOMNodePointer ptrChild1 = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer ptrChild2 = new DOMNodePointer(rootPointer, child2);

        // Same pointer
        Assert.assertEquals(0, rootPointer.compareChildNodePointers(ptrChild1, ptrChild1));

        // Attribute vs Element
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(ptrAttr1, ptrChild1));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(ptrChild1, ptrAttr1));

        // Attribute vs Attribute
        int attrComparison = rootPointer.compareChildNodePointers(ptrAttr1, ptrAttr2);
        Assert.assertTrue(attrComparison == -1 || attrComparison == 1);
        Assert.assertEquals(-attrComparison, rootPointer.compareChildNodePointers(ptrAttr2, ptrAttr1));

        // Child vs Child
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(ptrChild1, ptrChild2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(ptrChild2, ptrChild1));

        // Unrelated node not in root
        Element unrelated = document.createElement("unrelated");
        DOMNodePointer ptrUnrelated = new DOMNodePointer(rootPointer, unrelated);
        Assert.assertEquals(0, rootPointer.compareChildNodePointers(ptrUnrelated, ptrChild1));
    }

    @Test(expected = JXPathException.class)
    public void createChild_givenNoFactoryInContext_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);

        pointer.createChild(context, new QName("child"), 0);
    }

    @Test
    public void createChild_givenFactoryReturnsFalse_shouldThrowAbstractFactoryException() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                return false;
            }
        });

        try {
            pointer.createChild(context, new QName("child"), NodePointer.WHOLE_COLLECTION);
            Assert.fail("Expected JXPathAbstractFactoryException");
        } catch (JXPathAbstractFactoryException expected) {
            Assert.assertTrue(expected.getMessage().indexOf("Factory could not create a child node") >= 0);
        }
    }

    @Test
    public void createChild_givenFactoryAppendsChild_shouldReturnChildPointer() {
        final Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(root);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                Element child = root.getOwnerDocument().createElement(name);
                root.appendChild(child);
                return true;
            }
        });

        NodePointer created = pointer.createChild(context, new QName("child"), 0, "childValue");
        Assert.assertNotNull(created);
        Assert.assertEquals("child", created.getName().getName());
        Assert.assertEquals("childValue", created.getValue());
    }

    @Test
    public void createAttribute_givenElementWithoutPrefix_shouldCreateAttribute() {
        Element elem = document.createElement("elem");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.US);
        JXPathContext context = JXPathContext.newContext(elem);

        NodePointer attrPtr = pointer.createAttribute(context, new QName("myAttr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertTrue(elem.hasAttribute("myAttr"));

        // Second create should reuse
        NodePointer attrPtr2 = pointer.createAttribute(context, new QName("myAttr"));
        Assert.assertNotNull(attrPtr2);
    }

    @Test
    public void createAttribute_givenElementWithPrefix_shouldResolveNamespaceAndCreate() {
        Element elem = document.createElement("elem");
        elem.setAttribute("xmlns:p", "http://test.com");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.US);
        JXPathContext context = JXPathContext.newContext(elem);

        NodePointer attrPtr = pointer.createAttribute(context, new QName("p", "attr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertEquals("http://test.com", elem.getAttributeNodeNS("http://test.com", "attr").getNamespaceURI());
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_givenElementWithUnknownPrefix_shouldThrowException() {
        Element elem = document.createElement("elem");
        DOMNodePointer pointer = new DOMNodePointer(elem, Locale.US);
        JXPathContext context = JXPathContext.newContext(elem);

        pointer.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test
    public void createAttribute_givenNonElement_shouldDelegateToSuper() {
        Text text = document.createTextNode("text");
        DOMNodePointer pointer = new DOMNodePointer(text, Locale.US);
        JXPathContext context = JXPathContext.newContext(text);

        try {
            pointer.createAttribute(context, new QName("attr"));
            Assert.fail("Expected exception when creating attribute on non-element");
        } catch (JXPathException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void iteratorsAndResolvers_shouldConstructProperly() {
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

        NamespaceResolver resolver = pointer.getNamespaceResolver();
        Assert.assertNotNull(resolver);
        Assert.assertSame(resolver, pointer.getNamespaceResolver());
    }

    @Test
    public void staticHelperMethods_getPrefixAndGetLocalName() {
        Element elemWithPrefix = document.createElementNS("http://example.com", "nsPrefix:localPart");
        Assert.assertEquals("nsPrefix", DOMNodePointer.getPrefix(elemWithPrefix));
        Assert.assertEquals("localPart", DOMNodePointer.getLocalName(elemWithPrefix));

        Element nonNsWithColon = document.createElement("colonPrefix:part");
        Assert.assertEquals("colonPrefix", DOMNodePointer.getPrefix(nonNsWithColon));
        Assert.assertEquals("part", DOMNodePointer.getLocalName(nonNsWithColon));

        Element simpleElem = document.createElement("simple");
        Assert.assertNull(DOMNodePointer.getPrefix(simpleElem));
        Assert.assertEquals("simple", DOMNodePointer.getLocalName(simpleElem));
    }
}