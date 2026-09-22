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
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DOMNodePointerTest {

    private Document document;
    private DocumentBuilder builder;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        builder = factory.newDocumentBuilder();
        document = builder.newDocument();
    }

    @Test
    public void testConstructors_shouldInitializeProperly() {
        Element root = document.createElement("root");
        DOMNodePointer ptr1 = new DOMNodePointer(root, Locale.US);
        Assert.assertEquals(root, ptr1.getNode());
        Assert.assertEquals(Locale.US, ptr1.getLocale());
        Assert.assertNull(ptr1.getParent());

        DOMNodePointer ptr2 = new DOMNodePointer(root, Locale.GERMANY, "myId");
        Assert.assertEquals(root, ptr2.getNode());
        Assert.assertEquals(Locale.GERMANY, ptr2.getLocale());
        Assert.assertEquals("id('myId')", ptr2.asPath());

        DOMNodePointer ptr3 = new DOMNodePointer(ptr1, root);
        Assert.assertEquals(ptr1, ptr3.getParent());
        Assert.assertEquals(root, ptr3.getNode());
    }

    @Test
    public void testNode_givenNullTest_shouldReturnTrue() {
        Element elem = document.createElement("test");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertTrue(ptr.testNode(null));
        Assert.assertTrue(DOMNodePointer.testNode(elem, null));
    }

    @Test
    public void testNode_givenNodeNameTest_shouldMatchAccurately() {
        Element elem = document.createElementNS("http://example.com/ns", "p:test");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);

        NodeNameTest matchExact = new NodeNameTest(new QName("p", "test"), "http://example.com/ns");
        Assert.assertTrue(ptr.testNode(matchExact));

        NodeNameTest wrongNs = new NodeNameTest(new QName("p", "test"), "http://different.com");
        Assert.assertFalse(ptr.testNode(wrongNs));

        NodeNameTest wrongLocal = new NodeNameTest(new QName("p", "wrong"), "http://example.com/ns");
        Assert.assertFalse(ptr.testNode(wrongLocal));

        NodeNameTest wildcardNoPrefix = new NodeNameTest(new QName(null, "*"), null);
        Assert.assertTrue(ptr.testNode(wildcardNoPrefix));

        NodeNameTest wildcardWithNs = new NodeNameTest(new QName("p", "*"), "http://example.com/ns");
        Assert.assertTrue(ptr.testNode(wildcardWithNs));

        NodeNameTest wildcardMismatchNs = new NodeNameTest(new QName("p", "*"), "http://other.com");
        Assert.assertFalse(ptr.testNode(wildcardMismatchNs));

        Text text = document.createTextNode("content");
        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.ENGLISH);
        Assert.assertFalse(textPtr.testNode(matchExact));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldDistinguishNodeTypes() {
        Element elem = document.createElement("elem");
        Text text = document.createTextNode("text");
        CDATASection cdata = document.createCDATASection("cdata");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        NodeTypeTest unknownTest = new NodeTypeTest(999);

        Assert.assertTrue(DOMNodePointer.testNode(elem, nodeTest));
        Assert.assertTrue(DOMNodePointer.testNode(document, nodeTest));
        Assert.assertFalse(DOMNodePointer.testNode(text, nodeTest));

        Assert.assertTrue(DOMNodePointer.testNode(text, textTest));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, textTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, textTest));

        Assert.assertTrue(DOMNodePointer.testNode(comment, commentTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, commentTest));

        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTest));

        Assert.assertFalse(DOMNodePointer.testNode(elem, unknownTest));
    }

    @Test
    public void testNode_givenProcessingInstructionTest_shouldMatchTarget() {
        ProcessingInstruction pi = document.createProcessingInstruction("xml-stylesheet", "href='style.css'");
        ProcessingInstructionTest match = new ProcessingInstructionTest("xml-stylesheet");
        ProcessingInstructionTest mismatch = new ProcessingInstructionTest("other-target");

        Assert.assertTrue(DOMNodePointer.testNode(pi, match));
        Assert.assertFalse(DOMNodePointer.testNode(pi, mismatch));

        Element elem = document.createElement("test");
        Assert.assertFalse(DOMNodePointer.testNode(elem, match));
    }

    @Test
    public void getName_givenVariousNodes_shouldReturnProperQName() {
        Element elem = document.createElementNS("http://test.com", "ns:tag");
        DOMNodePointer ptrElem = new DOMNodePointer(elem, Locale.ENGLISH);
        QName qnameElem = ptrElem.getName();
        Assert.assertEquals("ns", qnameElem.getPrefix());
        Assert.assertEquals("tag", qnameElem.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer ptrPI = new DOMNodePointer(pi, Locale.ENGLISH);
        QName qnamePI = ptrPI.getName();
        Assert.assertNull(qnamePI.getPrefix());
        Assert.assertEquals("target", qnamePI.getName());

        Comment comment = document.createComment("comment");
        DOMNodePointer ptrComment = new DOMNodePointer(comment, Locale.ENGLISH);
        QName qnameComment = ptrComment.getName();
        Assert.assertNull(qnameComment.getPrefix());
        Assert.assertNull(qnameComment.getName());
    }

    @Test
    public void getNamespaceURI_givenPrefixOrUnprefixed_shouldResolveExpectedURI() {
        Element root = document.createElementNS("http://default.com", "root");
        root.setAttribute("xmlns:foo", "http://foo.com");
        root.setAttribute("xmlns", "http://default.com");
        document.appendChild(root);

        Element child = document.createElementNS("http://default.com", "child");
        root.appendChild(child);

        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);

        Assert.assertEquals("http://default.com", ptr.getDefaultNamespaceURI());
        Assert.assertEquals("http://default.com", ptr.getNamespaceURI(""));
        Assert.assertEquals("http://default.com", ptr.getNamespaceURI(null));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://foo.com", ptr.getNamespaceURI("foo"));
        Assert.assertNull(ptr.getNamespaceURI("unboundPrefix"));

        DOMNodePointer docPointer = new DOMNodePointer(document, Locale.ENGLISH);
        Assert.assertEquals("http://foo.com", docPointer.getNamespaceURI("foo"));
        Assert.assertEquals("http://default.com", docPointer.getDefaultNamespaceURI());
    }

    @Test
    public void getNamespaceURI_givenStaticNodeHelper_shouldFallbackProperly() {
        Element root = document.createElement("unprefixed");
        root.setAttribute("xmlns", "http://fallback.com");
        document.appendChild(root);

        Assert.assertEquals("http://fallback.com", DOMNodePointer.getNamespaceURI(root));
        Assert.assertEquals("http://fallback.com", DOMNodePointer.getNamespaceURI(document));

        Element orphan = document.createElement("orphan");
        Assert.assertNull(DOMNodePointer.getNamespaceURI(orphan));
    }

    @Test
    public void getPrefixAndLocalName_givenDOMNodes_shouldExtractAccurately() {
        Element elemWithPrefix = document.createElementNS("http://foo.com", "foo:bar");
        Assert.assertEquals("foo", DOMNodePointer.getPrefix(elemWithPrefix));
        Assert.assertEquals("bar", DOMNodePointer.getLocalName(elemWithPrefix));

        Element fallbackElem = document.createElement("bar");
        Assert.assertNull(DOMNodePointer.getPrefix(fallbackElem));
        Assert.assertEquals("bar", DOMNodePointer.getLocalName(fallbackElem));
    }

    @Test
    public void basicAttributesAndFlags_shouldReturnExpectedConstants() {
        Element elem = document.createElement("empty");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);

        Assert.assertEquals(elem, ptr.getBaseValue());
        Assert.assertEquals(elem, ptr.getImmediateNode());
        Assert.assertTrue(ptr.isActual());
        Assert.assertFalse(ptr.isCollection());
        Assert.assertEquals(1, ptr.getLength());
        Assert.assertTrue(ptr.isLeaf());

        elem.appendChild(document.createTextNode("hello"));
        Assert.assertFalse(ptr.isLeaf());
    }

    @Test
    public void isLanguage_andGetLanguage_shouldRespectHierarchy() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        Assert.assertTrue(childPtr.isLanguage("en"));
        Assert.assertTrue(childPtr.isLanguage("en-us"));
        Assert.assertFalse(childPtr.isLanguage("fr"));

        Element rootNoLang = document.createElement("rootNoLang");
        DOMNodePointer noLangPtr = new DOMNodePointer(rootNoLang, Locale.FRENCH);
        Assert.assertTrue(noLangPtr.isLanguage("fr"));
    }

    @Test
    public void getValue_givenVariousNodeTypes_shouldExtractText() {
        Comment comment = document.createComment(" sample comment ");
        DOMNodePointer commentPtr = new DOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertEquals("sample comment", commentPtr.getValue());

        ProcessingInstruction pi = document.createProcessingInstruction("pi", "pi-data ");
        DOMNodePointer piPtr = new DOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals("pi-data", piPtr.getValue());

        Element parent = document.createElement("parent");
        Text t1 = document.createTextNode("  Hello ");
        CDATASection cdata = document.createCDATASection(" World  ");
        parent.appendChild(t1);
        parent.appendChild(cdata);
        parent.appendChild(document.createComment("ignored comment"));

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.ENGLISH);
        Assert.assertEquals("Hello World", parentPtr.getValue());

        parent.setAttribute("xml:space", "preserve");
        Assert.assertEquals("  Hello  World  ", parentPtr.getValue());
    }

    @Test
    public void setValue_givenTextOrCDATANode_shouldModifyOrRemove() {
        Element parent = document.createElement("parent");
        Text text = document.createTextNode("old");
        parent.appendChild(text);

        DOMNodePointer textPtr = new DOMNodePointer(text, Locale.ENGLISH);
        textPtr.setValue("new");
        Assert.assertEquals("new", text.getNodeValue());

        textPtr.setValue("");
        Assert.assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test
    public void setValue_givenElementNode_shouldClearAndReplaceChildren() {
        Element elem = document.createElement("parent");
        elem.appendChild(document.createElement("child1"));
        DOMNodePointer elemPtr = new DOMNodePointer(elem, Locale.ENGLISH);

        elemPtr.setValue("simple text");
        Assert.assertEquals(1, elem.getChildNodes().getLength());
        Assert.assertEquals("simple text", elem.getFirstChild().getNodeValue());

        Element foreign = document.createElement("foreign");
        Element sub = document.createElement("sub");
        foreign.appendChild(sub);

        elemPtr.setValue(foreign);
        Assert.assertEquals(1, elem.getChildNodes().getLength());
        Assert.assertEquals("sub", elem.getFirstChild().getNodeName());

        Text singleTextNode = document.createTextNode("single text node");
        elemPtr.setValue(singleTextNode);
        Assert.assertEquals(1, elem.getChildNodes().getLength());
        Assert.assertEquals("single text node", elem.getFirstChild().getNodeValue());
    }

    @Test
    public void asPath_givenEscapedId_shouldFormatCorrectly() {
        Element elem = document.createElement("tag");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH, "a'b\"c");
        Assert.assertEquals("id('a&apos;b&quot;c')", ptr.asPath());
    }

    @Test
    public void asPath_givenHierarchy_shouldComputeRelativePaths() {
        Element root = document.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);

        Element child1 = document.createElement("child");
        root.appendChild(child1);
        DOMNodePointer child1Ptr = new DOMNodePointer(rootPtr, child1);
        Assert.assertEquals("/child[1]", child1Ptr.asPath());

        Element child2 = document.createElement("child");
        root.appendChild(child2);
        DOMNodePointer child2Ptr = new DOMNodePointer(rootPtr, child2);
        Assert.assertEquals("/child[2]", child2Ptr.asPath());

        Text text = document.createTextNode("text-val");
        root.appendChild(text);
        DOMNodePointer textPtr = new DOMNodePointer(rootPtr, text);
        Assert.assertEquals("/text()[1]", textPtr.asPath());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        root.appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(rootPtr, pi);
        Assert.assertEquals("/processing-instruction('target')[1]", piPtr.asPath());
    }

    @Test
    public void asPath_givenNamespaceResolver_shouldUsePrefixOrNodeSelector() {
        Element root = document.createElementNS("http://ns.com", "p:root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);

        Element child = document.createElementNS("http://ns.com", "p:child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, child);

        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix1", "http://ns.com");
        childPtr.setNamespaceResolver(resolver);
        Assert.assertEquals("/prefix1:child[1]", childPtr.asPath());

        NamespaceResolver emptyResolver = new NamespaceResolver();
        childPtr.setNamespaceResolver(emptyResolver);
        Assert.assertEquals("/node()[1]", childPtr.asPath());
    }

    @Test
    public void createAttribute_givenUnprefixedAndPrefixedAttributes_shouldSetAndReturnPointer() {
        Element elem = document.createElement("element");
        elem.setAttribute("xmlns:test", "http://test.com");
        document.appendChild(elem);
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);

        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer attr1 = ptr.createAttribute(context, new QName("attr1"));
        Assert.assertNotNull(attr1);
        Assert.assertTrue(elem.hasAttribute("attr1"));

        NodePointer attrNS = ptr.createAttribute(context, new QName("test", "attr2"));
        Assert.assertNotNull(attrNS);
        Assert.assertTrue(elem.hasAttributeNS("http://test.com", "attr2"));
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_givenUnknownPrefix_shouldThrowException() {
        Element elem = document.createElement("element");
        DOMNodePointer ptr = new DOMNodePointer(elem, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());
        ptr.createAttribute(context, new QName("unregistered", "attr"));
    }

    @Test
    public void remove_givenChildNode_shouldRemoveFromParent() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        childPtr.remove();
        Assert.assertNull(child.getParentNode());
    }

    @Test(expected = JXPathException.class)
    public void remove_givenRootNode_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.ENGLISH);
        rootPtr.remove();
    }

    @Test
    public void compareChildNodePointers_givenAttributesAndElements_shouldSortCorrectly() {
        Element elem = document.createElement("elem");
        elem.setAttribute("a1", "v1");
        elem.setAttribute("a2", "v2");

        Element child1 = document.createElement("c1");
        Element child2 = document.createElement("c2");
        elem.appendChild(child1);
        elem.appendChild(child2);

        DOMNodePointer parentPtr = new DOMNodePointer(elem, Locale.ENGLISH);

        Attr a1Node = elem.getAttributeNode("a1");
        Attr a2Node = elem.getAttributeNode("a2");
        DOMNodePointer pAttr1 = new DOMNodePointer(parentPtr, a1Node);
        DOMNodePointer pAttr2 = new DOMNodePointer(parentPtr, a2Node);
        DOMNodePointer pChild1 = new DOMNodePointer(parentPtr, child1);
        DOMNodePointer pChild2 = new DOMNodePointer(parentPtr, child2);

        Assert.assertEquals(0, parentPtr.compareChildNodePointers(pChild1, pChild1));
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(pAttr1, pChild1));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(pChild1, pAttr1));
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(pChild1, pChild2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(pChild2, pChild1));

        int attrOrder = parentPtr.compareChildNodePointers(pAttr1, pAttr2);
        Assert.assertTrue(attrOrder == -1 || attrOrder == 1);
    }

    @Test
    public void getPointerByID_givenMatchingAndMissingID_shouldReturnPointer() {
        Element elem = document.createElement("elem");
        elem.setAttribute("id", "id1");
        elem.setIdAttribute("id", true);
        document.appendChild(elem);

        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        Pointer hit = docPtr.getPointerByID(context, "id1");
        Assert.assertNotNull(hit);
        Assert.assertTrue(hit instanceof DOMNodePointer);
        Assert.assertEquals(elem, ((DOMNodePointer) hit).getNode());

        Pointer miss = docPtr.getPointerByID(context, "missingId");
        Assert.assertNotNull(miss);
        Assert.assertTrue(miss instanceof NullPointer);
    }

    @Test
    public void childAndAttributeAndNamespaceIterators_shouldBeCreatedSuccessfully() {
        Element root = document.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);

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
    public void equalsAndHashCode_shouldAdhereToIdentityContract() {
        Element elem1 = document.createElement("test");
        Element elem2 = document.createElement("test");

        DOMNodePointer ptr1 = new DOMNodePointer(elem1, Locale.ENGLISH);
        DOMNodePointer ptr2 = new DOMNodePointer(elem1, Locale.GERMAN);
        DOMNodePointer ptr3 = new DOMNodePointer(elem2, Locale.ENGLISH);

        Assert.assertTrue(ptr1.equals(ptr1));
        Assert.assertTrue(ptr1.equals(ptr2));
        Assert.assertFalse(ptr1.equals(ptr3));
        Assert.assertFalse(ptr1.equals(new Object()));

        Assert.assertEquals(System.identityHashCode(elem1), ptr1.hashCode());
    }

    @Test
    public void createChild_withoutFactory_shouldThrowException() {
        Element root = document.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        try {
            ptr.createChild(context, new QName("child"), 0);
            Assert.fail("Expected JXPathException for missing factory");
        }
        catch (JXPathException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Factory is not set") != -1);
        }
    }

    @Test
    public void createChild_withFactory_shouldDelegateAndCreateChild() {
        final Element root = document.createElement("root");
        final DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        context.setFactory(new AbstractFactory() {
            public boolean createObject(
                JXPathContext ctx,
                Pointer parent,
                Object contextNode,
                String name,
                int index)
            {
                Element newChild = root.getOwnerDocument().createElement(name);
                root.appendChild(newChild);
                return true;
            }
        });

        NodePointer created = ptr.createChild(context, new QName("newChild"), 0, "childValue");
        Assert.assertNotNull(created);
        Assert.assertEquals(1, root.getElementsByTagName("newChild").getLength());
        Assert.assertEquals("childValue", created.getValue());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void createChild_whenFactoryReturnsFalse_shouldThrowAbstractFactoryException() {
        Element root = document.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        context.setFactory(new AbstractFactory() {
            public boolean createObject(
                JXPathContext ctx,
                Pointer parent,
                Object contextNode,
                String name,
                int index)
            {
                return false;
            }
        });

        ptr.createChild(context, new QName("failedChild"), 0);
    }
}