package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
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
    public void constructors_givenVariousInputs_shouldInitializeProperly() {
        Element element = new Element("root");
        JDOMNodePointer p1 = new JDOMNodePointer(element, Locale.ENGLISH);
        Assert.assertEquals(element, p1.getBaseValue());
        Assert.assertEquals(element, p1.getImmediateNode());
        Assert.assertFalse(p1.isCollection());
        Assert.assertEquals(1, p1.getLength());

        JDOMNodePointer p2 = new JDOMNodePointer(element, Locale.ENGLISH, "id123");
        Assert.assertEquals("id('id123')", p2.asPath());

        JDOMNodePointer p3 = new JDOMNodePointer(p1, new Text("child"));
        Assert.assertEquals(p1, p3.getParent());
    }

    @Test
    public void hashCodeAndEquals_givenPointers_shouldAdhereToContract() {
        Element el1 = new Element("test");
        Element el2 = new Element("test");
        JDOMNodePointer p1 = new JDOMNodePointer(el1, Locale.US);
        JDOMNodePointer p2 = new JDOMNodePointer(el1, Locale.US);
        JDOMNodePointer p3 = new JDOMNodePointer(el2, Locale.US);

        Assert.assertTrue(p1.equals(p1));
        Assert.assertTrue(p1.equals(p2));
        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("Not a pointer"));
        Assert.assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void iteratorsAndNamespacePointer_givenCalls_shouldReturnInstances() {
        Element element = new Element("root");
        element.setAttribute("attr", "val");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.US);

        NodeIterator childIt = pointer.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = pointer.attributeIterator(new QName("attr"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = pointer.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = pointer.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);
    }

    @Test
    public void isLeaf_givenVariousNodes_shouldReturnCorrectFlag() {
        Element emptyElement = new Element("empty");
        Assert.assertTrue(new JDOMNodePointer(emptyElement, Locale.US).isLeaf());

        Element parentElement = new Element("parent");
        parentElement.addContent(new Element("child"));
        Assert.assertFalse(new JDOMNodePointer(parentElement, Locale.US).isLeaf());

        Document emptyDoc = new Document();
        Assert.assertTrue(new JDOMNodePointer(emptyDoc, Locale.US).isLeaf());

        Document docWithRoot = new Document(new Element("root"));
        Assert.assertFalse(new JDOMNodePointer(docWithRoot, Locale.US).isLeaf());

        Comment comment = new Comment("comment");
        Assert.assertTrue(new JDOMNodePointer(comment, Locale.US).isLeaf());

        Text text = new Text("text");
        Assert.assertTrue(new JDOMNodePointer(text, Locale.US).isLeaf());
    }

    @Test
    public void getName_givenDifferentNodes_shouldReturnExpectedQName() {
        Element elNoNs = new Element("element");
        JDOMNodePointer ptr1 = new JDOMNodePointer(elNoNs, Locale.US);
        Assert.assertEquals(new QName(null, "element"), ptr1.getName());

        Element elWithNs = new Element("element", "p", "http://example.com");
        JDOMNodePointer ptr2 = new JDOMNodePointer(elWithNs, Locale.US);
        Assert.assertEquals(new QName("p", "element"), ptr2.getName());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer ptr3 = new JDOMNodePointer(pi, Locale.US);
        Assert.assertEquals(new QName(null, "target"), ptr3.getName());

        Text text = new Text("content");
        JDOMNodePointer ptr4 = new JDOMNodePointer(text, Locale.US);
        Assert.assertEquals(new QName(null, null), ptr4.getName());
    }

    @Test
    public void getNamespaceURI_givenElementAndOtherNodes_shouldResolveNamespace() {
        Element el = new Element("test");
        JDOMNodePointer ptr1 = new JDOMNodePointer(el, Locale.US);
        Assert.assertNull(ptr1.getNamespaceURI());

        Element elNs = new Element("test", "http://sample.org");
        JDOMNodePointer ptr2 = new JDOMNodePointer(elNs, Locale.US);
        Assert.assertEquals("http://sample.org", ptr2.getNamespaceURI());

        Text text = new Text("content");
        JDOMNodePointer ptr3 = new JDOMNodePointer(text, Locale.US);
        Assert.assertNull(ptr3.getNamespaceURI());
    }

    @Test
    public void getNamespaceResolver_multipleCalls_shouldReturnSameInitializedResolver() {
        Element el = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(el, Locale.US);
        NamespaceResolver res1 = ptr.getNamespaceResolver();
        NamespaceResolver res2 = ptr.getNamespaceResolver();
        Assert.assertNotNull(res1);
        Assert.assertSame(res1, res2);
    }

    @Test
    public void getNamespaceURIForPrefix_givenPrefix_shouldResolveCorrectly() {
        Element el = new Element("root", "http://default.org");
        Namespace customNs = Namespace.getNamespace("custom", "http://custom.org");
        el.addNamespaceDeclaration(customNs);
        JDOMNodePointer ptr = new JDOMNodePointer(el, Locale.US);

        Assert.assertEquals(Namespace.XML_NAMESPACE.getURI(), ptr.getNamespaceURI("xml"));
        Assert.assertEquals("http://custom.org", ptr.getNamespaceURI("custom"));
        Assert.assertNull(ptr.getNamespaceURI("nonexistent"));

        Document doc = new Document(el);
        JDOMNodePointer docPtr = new JDOMNodePointer(doc, Locale.US);
        Assert.assertEquals("http://custom.org", docPtr.getNamespaceURI("custom"));

        Document emptyDoc = new Document();
        JDOMNodePointer emptyDocPtr = new JDOMNodePointer(emptyDoc, Locale.US);
        Assert.assertNull(emptyDocPtr.getNamespaceURI("custom"));

        Comment comment = new Comment("text");
        JDOMNodePointer commentPtr = new JDOMNodePointer(comment, Locale.US);
        Assert.assertNull(commentPtr.getNamespaceURI("custom"));
    }

    @Test
    public void compareChildNodePointers_givenAttributesAndContent_shouldOrderCorrectly() {
        Element parent = new Element("parent");
        Attribute a1 = new Attribute("a1", "v1");
        Attribute a2 = new Attribute("a2", "v2");
        parent.setAttribute(a1);
        parent.setAttribute(a2);

        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        parent.addContent(c1);
        parent.addContent(c2);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.US);
        NodePointer pA1 = new JDOMNodePointer(parentPtr, a1);
        NodePointer pA2 = new JDOMNodePointer(parentPtr, a2);
        NodePointer pC1 = new JDOMNodePointer(parentPtr, c1);
        NodePointer pC2 = new JDOMNodePointer(parentPtr, c2);

        Assert.assertEquals(0, parentPtr.compareChildNodePointers(pA1, pA1));
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(pA1, pC1));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(pC1, pA1));
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(pA1, pA2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(pA2, pA1));
        Assert.assertEquals(-1, parentPtr.compareChildNodePointers(pC1, pC2));
        Assert.assertEquals(1, parentPtr.compareChildNodePointers(pC2, pC1));

        Attribute foreignAttr = new Attribute("foreign", "val");
        NodePointer pForeignAttr = new JDOMNodePointer(parentPtr, foreignAttr);
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(pA1, pForeignAttr));

        Element foreignContent = new Element("foreign");
        NodePointer pForeignContent = new JDOMNodePointer(parentPtr, foreignContent);
        Assert.assertEquals(0, parentPtr.compareChildNodePointers(c1, pForeignContent));
    }

    @Test(expected = RuntimeException.class)
    public void compareChildNodePointers_whenNodeNotElement_shouldThrowException() {
        Comment comment = new Comment("text");
        JDOMNodePointer commentPtr = new JDOMNodePointer(comment, Locale.US);
        NodePointer child1 = new JDOMNodePointer(commentPtr, new Element("c1"));
        NodePointer child2 = new JDOMNodePointer(commentPtr, new Element("c2"));
        commentPtr.compareChildNodePointers(child1, child2);
    }

    @Test
    public void getValue_givenVariousNodeTypes_shouldReturnFormattedString() {
        Element root = new Element("root");
        root.addContent(new Text("Hello "));
        Element sub = new Element("sub");
        sub.addContent(new Text("World"));
        root.addContent(sub);
        root.addContent(new Comment("ignored comment"));
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        Assert.assertEquals("Hello World", rootPtr.getValue());

        Comment comment = new Comment("  trimmed comment  ");
        JDOMNodePointer commentPtr = new JDOMNodePointer(comment, Locale.US);
        Assert.assertEquals("trimmed comment", commentPtr.getValue());

        ProcessingInstruction pi = new ProcessingInstruction("target", "  some data  ");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.US);
        Assert.assertEquals("some data", piPtr.getValue());

        Element spacePreserve = new Element("space");
        spacePreserve.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Text textNode = new Text("  kept  ");
        spacePreserve.addContent(textNode);
        JDOMNodePointer textPreservePtr = new JDOMNodePointer(spacePreserve, textNode);
        Assert.assertEquals("  kept  ", textPreservePtr.getValue());

        Element spaceDefault = new Element("space");
        Text textTrimNode = new Text("  trimmed  ");
        spaceDefault.addContent(textTrimNode);
        JDOMNodePointer textTrimPtr = new JDOMNodePointer(spaceDefault, textTrimNode);
        Assert.assertEquals("trimmed", textTrimPtr.getValue());
    }

    @Test
    public void setValue_givenTextNode_shouldModifyOrRemove() {
        Element parent = new Element("parent");
        Text text = new Text("initial");
        parent.addContent(text);
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.US);

        textPtr.setValue("updated");
        Assert.assertEquals("updated", text.getText());

        textPtr.setValue("");
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test
    public void setValue_givenElementNode_shouldReplaceChildrenCorrectly() {
        Element element = new Element("parent");
        JDOMNodePointer elemPtr = new JDOMNodePointer(element, Locale.US);

        Element donorElement = new Element("donor");
        donorElement.addContent(new Element("child1"));
        donorElement.addContent(new Text("textChild"));
        donorElement.addContent(new ProcessingInstruction("pi", "val"));
        donorElement.addContent(new Comment("commentChild"));
        elemPtr.setValue(donorElement);
        Assert.assertEquals(4, element.getContent().size());

        Document donorDoc = new Document();
        donorDoc.addContent(new Element("docChild"));
        elemPtr.setValue(donorDoc);
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertEquals("docChild", ((Element) element.getContent().get(0)).getName());

        elemPtr.setValue(new CDATA("cdata value"));
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertTrue(element.getContent().get(0) instanceof Text);

        elemPtr.setValue(new ProcessingInstruction("t", "d"));
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertTrue(element.getContent().get(0) instanceof ProcessingInstruction);

        elemPtr.setValue(new Comment("comment"));
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertTrue(element.getContent().get(0) instanceof Comment);

        elemPtr.setValue("Simple text");
        Assert.assertEquals(1, element.getContent().size());
        Assert.assertEquals("Simple text", ((Text) element.getContent().get(0)).getText());

        elemPtr.setValue("");
        Assert.assertEquals(0, element.getContent().size());
    }

    @Test
    public void testNode_givenNodeNameTest_shouldEvaluateCorrectly() {
        Element elem = new Element("tag", "p", "http://example.com");

        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, null));

        Assert.assertFalse(JDOMNodePointer.testNode(null, new Text("text"), new NodeNameTest(new QName("tag"))));

        NodeNameTest wildcardNoPrefix = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, wildcardNoPrefix));

        NodeNameTest matchWithPrefix = new NodeNameTest(new QName("p", "tag"), "http://example.com");
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, matchWithPrefix));

        NodeNameTest matchWildcardNs = new NodeNameTest(new QName("p", "*"), "http://example.com");
        Assert.assertTrue(JDOMNodePointer.testNode(null, elem, matchWildcardNs));

        NodeNameTest mismatchNs = new NodeNameTest(new QName("p", "tag"), "http://other.com");
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, mismatchNs));

        NodeNameTest mismatchName = new NodeNameTest(new QName("p", "wrong"), "http://example.com");
        Assert.assertFalse(JDOMNodePointer.testNode(null, elem, mismatchName));

        Element noNsElem = new Element("local");
        NodeNameTest localMatch = new NodeNameTest(new QName(null, "local"), null);
        Assert.assertTrue(JDOMNodePointer.testNode(null, noNsElem, localMatch));

        NodeNameTest localMismatchPrefix = new NodeNameTest(new QName("p", "local"), null);
        Assert.assertFalse(JDOMNodePointer.testNode(null, noNsElem, localMismatchPrefix));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldMatchAccurately() {
        Element el = new Element("el");
        Document doc = new Document();
        Text text = new Text("text");
        CDATA cdata = new CDATA("cdata");
        Comment comment = new Comment("comment");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(JDOMNodePointer.testNode(null, el, nodeTest));
        Assert.assertTrue(JDOMNodePointer.testNode(null, doc, nodeTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, text, nodeTest));

        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, text, textTest));
        Assert.assertTrue(JDOMNodePointer.testNode(null, cdata, textTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, el, textTest));

        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, comment, commentTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, el, commentTest));

        NodeTypeTest piTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, piTypeTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, el, piTypeTest));

        NodeTypeTest unknownTest = new NodeTypeTest(999);
        Assert.assertFalse(JDOMNodePointer.testNode(null, el, unknownTest));
    }

    @Test
    public void testNode_givenProcessingInstructionTest_shouldMatchTarget() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        ProcessingInstructionTest matchTest = new ProcessingInstructionTest("target");
        ProcessingInstructionTest mismatchTest = new ProcessingInstructionTest("other");

        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, matchTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, pi, mismatchTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, new Element("target"), matchTest));
    }

    @Test
    public void getPrefixAndLocalName_givenDifferentNodes_shouldReturnStrings() {
        Element el = new Element("name", "ns", "http://test");
        Attribute attr = new Attribute("attr", "val", Namespace.getNamespace("ans", "http://attr"));
        Text text = new Text("val");

        Assert.assertEquals("ns", JDOMNodePointer.getPrefix(el));
        Assert.assertEquals("ans", JDOMNodePointer.getPrefix(attr));
        Assert.assertNull(JDOMNodePointer.getPrefix(text));

        Element elNoPrefix = new Element("name");
        Attribute attrNoPrefix = new Attribute("attr", "val");
        Assert.assertNull(JDOMNodePointer.getPrefix(elNoPrefix));
        Assert.assertNull(JDOMNodePointer.getPrefix(attrNoPrefix));

        Assert.assertEquals("name", JDOMNodePointer.getLocalName(el));
        Assert.assertEquals("attr", JDOMNodePointer.getLocalName(attr));
        Assert.assertNull(JDOMNodePointer.getLocalName(text));
    }

    @Test
    public void language_givenXmlLangHierarchy_shouldResolveAndMatch() {
        Element root = new Element("root");
        root.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        root.addContent(child);
        Text text = new Text("hello");
        child.addContent(text);

        JDOMNodePointer textPtr = new JDOMNodePointer(new JDOMNodePointer(root, Locale.US), text);
        Assert.assertEquals("en-US", textPtr.getLanguage());
        Assert.assertTrue(textPtr.isLanguage("en"));
        Assert.assertTrue(textPtr.isLanguage("EN-US"));
        Assert.assertFalse(textPtr.isLanguage("fr"));

        Element noLangRoot = new Element("noLang");
        JDOMNodePointer noLangPtr = new JDOMNodePointer(noLangRoot, Locale.US);
        Assert.assertNull(noLangPtr.getLanguage());
        Assert.assertTrue(noLangPtr.isLanguage("en"));
    }

    @Test
    public void createAttribute_givenElement_shouldSetAttributeCorrectly() {
        Element elem = new Element("tag");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer attrPtr = ptr.createAttribute(context, new QName("attr"));
        Assert.assertNotNull(attrPtr);
        Assert.assertNotNull(elem.getAttribute("attr"));
        Assert.assertEquals("", elem.getAttributeValue("attr"));

        NodePointer attrPtr2 = ptr.createAttribute(context, new QName("attr"));
        Assert.assertNotNull(attrPtr2);

        ptr.getNamespaceResolver().registerNamespace("ns", "http://ns.org");
        NodePointer nsAttrPtr = ptr.createAttribute(context, new QName("ns", "nsAttr"));
        Assert.assertNotNull(nsAttrPtr);
        Assert.assertNotNull(elem.getAttribute("nsAttr", Namespace.getNamespace("ns", "http://ns.org")));
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_givenUnknownNamespacePrefix_shouldThrowException() {
        Element elem = new Element("tag");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        ptr.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test
    public void createAttribute_givenNonElement_shouldDelegateToSuper() {
        Text text = new Text("test");
        JDOMNodePointer ptr = new JDOMNodePointer(text, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        try {
            ptr.createAttribute(context, new QName("attr"));
            Assert.fail("Expected exception for non-element node");
        }
        catch (JXPathException ex) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void createChild_withFactory_shouldCreateAndPopulateNode() {
        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                if (node instanceof Element && "child".equals(name)) {
                    ((Element) node).addContent(new Element("child"));
                    return true;
                }
                return false;
            }
        });

        NodePointer childPtr = rootPtr.createChild(context, new QName("child"), 0);
        Assert.assertNotNull(childPtr);
        Assert.assertEquals(1, root.getChildren("child").size());

        NodePointer childValPtr = rootPtr.createChild(context, new QName("child"), 0, "childText");
        Assert.assertNotNull(childValPtr);
        Assert.assertEquals("childText", ((Element) root.getChildren("child").get(0)).getText());
    }

    @Test(expected = JXPathException.class)
    public void createChild_withoutFactory_shouldThrowException() {
        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        rootPtr.createChild(context, new QName("child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void createChild_whenFactoryFails_shouldThrowFactoryException() {
        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                return false;
            }
        });
        rootPtr.createChild(context, new QName("child"), 0);
    }

    @Test
    public void remove_givenParentedNode_shouldRemoveFromParent() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);

        JDOMNodePointer childPtr = new JDOMNodePointer(child, Locale.US);
        childPtr.remove();
        Assert.assertEquals(0, parent.getContent().size());
    }

    @Test(expected = JXPathException.class)
    public void remove_givenRootNode_shouldThrowException() {
        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        rootPtr.remove();
    }

    @Test
    public void asPath_givenVariousNodesAndStructures_shouldBuildXPathString() {
        JDOMNodePointer idPtr = new JDOMNodePointer(new Element("root"), Locale.US, "a'b\"c");
        Assert.assertEquals("id('a&apos;b&quot;c')", idPtr.asPath());

        Element root = new Element("root");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.US);
        Assert.assertEquals("", rootPtr.asPath());

        Element child1 = new Element("item");
        Element child2 = new Element("item");
        root.addContent(child1);
        root.addContent(child2);
        JDOMNodePointer child1Ptr = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer child2Ptr = new JDOMNodePointer(rootPtr, child2);
        Assert.assertEquals("/item[1]", child1Ptr.asPath());
        Assert.assertEquals("/item[2]", child2Ptr.asPath());

        Element nsChild = new Element("item", "ns", "http://example.com/ns");
        root.addContent(nsChild);
        JDOMNodePointer nsChildPtr = new JDOMNodePointer(rootPtr, nsChild);
        rootPtr.getNamespaceResolver().registerNamespace("ns", "http://example.com/ns");
        Assert.assertEquals("/ns:item[1]", nsChildPtr.asPath());

        Element anonNsChild = new Element("anon", "http://anon.com");
        root.addContent(anonNsChild);
        JDOMNodePointer anonChildPtr = new JDOMNodePointer(rootPtr, anonNsChild);
        Assert.assertEquals("/node()[4]", anonChildPtr.asPath());

        Text text = new Text("sample");
        root.addContent(text);
        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, text);
        Assert.assertEquals("/text()[1]", textPtr.asPath());

        ProcessingInstruction pi = new ProcessingInstruction("test-pi", "val");
        root.addContent(pi);
        JDOMNodePointer piPtr = new JDOMNodePointer(rootPtr, pi);
        Assert.assertEquals("/processing-instruction('test-pi')[1]", piPtr.asPath());
    }
}