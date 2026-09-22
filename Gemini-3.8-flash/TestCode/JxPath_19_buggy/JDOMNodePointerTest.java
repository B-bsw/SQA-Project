package org.apache.commons.jxpath.ri.model.jdom;

import java.util.ArrayList;
import java.util.List;
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
    public void constructors_givenDifferentParameters_shouldInitializeCorrectly() {
        Element element = new Element("test");
        Locale locale = Locale.US;

        JDOMNodePointer ptr1 = new JDOMNodePointer(element, locale);
        Assert.assertSame(element, ptr1.getBaseValue());
        Assert.assertSame(element, ptr1.getImmediateNode());

        JDOMNodePointer ptr2 = new JDOMNodePointer(element, locale, "id123");
        Assert.assertEquals("id('id123')", ptr2.asPath());

        JDOMNodePointer ptr3 = new JDOMNodePointer(ptr1, element);
        Assert.assertSame(ptr1, ptr3.getParent());
        Assert.assertSame(element, ptr3.getBaseValue());
    }

    @Test
    public void isCollection_givenAnyNode_shouldReturnFalse() {
        Element element = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        boolean result = pointer.isCollection();

        Assert.assertFalse(result);
    }

    @Test
    public void getLength_givenAnyNode_shouldReturnOne() {
        Element element = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        int result = pointer.getLength();

        Assert.assertEquals(1, result);
    }

    @Test
    public void isLeaf_givenEmptyElement_shouldReturnTrue() {
        Element element = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        boolean result = pointer.isLeaf();

        Assert.assertTrue(result);
    }

    @Test
    public void isLeaf_givenElementWithChildren_shouldReturnFalse() {
        Element element = new Element("root");
        element.addContent(new Element("child"));
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        boolean result = pointer.isLeaf();

        Assert.assertFalse(result);
    }

    @Test
    public void isLeaf_givenEmptyDocument_shouldReturnTrue() {
        Document doc = new Document();
        JDOMNodePointer pointer = new JDOMNodePointer(doc, Locale.ENGLISH);

        boolean result = pointer.isLeaf();

        Assert.assertTrue(result);
    }

    @Test
    public void isLeaf_givenDocumentWithRoot_shouldReturnFalse() {
        Document doc = new Document(new Element("root"));
        JDOMNodePointer pointer = new JDOMNodePointer(doc, Locale.ENGLISH);

        boolean result = pointer.isLeaf();

        Assert.assertFalse(result);
    }

    @Test
    public void isLeaf_givenNonElementNonDocument_shouldReturnTrue() {
        Text text = new Text("sample");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.ENGLISH);

        boolean result = pointer.isLeaf();

        Assert.assertTrue(result);
    }

    @Test
    public void getName_givenElementWithPrefix_shouldReturnQNameWithPrefixAndLocalName() {
        Element element = new Element("tag", "pfx", "http://example.com");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        QName name = pointer.getName();

        Assert.assertEquals("pfx", name.getPrefix());
        Assert.assertEquals("tag", name.getName());
    }

    @Test
    public void getName_givenElementWithoutPrefix_shouldReturnQNameWithNullPrefix() {
        Element element = new Element("tag");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        QName name = pointer.getName();

        Assert.assertNull(name.getPrefix());
        Assert.assertEquals("tag", name.getName());
    }

    @Test
    public void getName_givenProcessingInstruction_shouldReturnTargetAsName() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer pointer = new JDOMNodePointer(pi, Locale.ENGLISH);

        QName name = pointer.getName();

        Assert.assertNull(name.getPrefix());
        Assert.assertEquals("target", name.getName());
    }

    @Test
    public void getName_givenTextNode_shouldReturnEmptyQName() {
        Text text = new Text("data");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.ENGLISH);

        QName name = pointer.getName();

        Assert.assertNull(name.getPrefix());
        Assert.assertNull(name.getName());
    }

    @Test
    public void getNamespaceURI_givenElementWithNamespace_shouldReturnURI() {
        Element element = new Element("tag", "pfx", "http://example.com");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        String uri = pointer.getNamespaceURI();

        Assert.assertEquals("http://example.com", uri);
    }

    @Test
    public void getNamespaceURI_givenElementWithEmptyNamespace_shouldReturnNull() {
        Element element = new Element("tag");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        String uri = pointer.getNamespaceURI();

        Assert.assertNull(uri);
    }

    @Test
    public void getNamespaceURI_givenNonElementNode_shouldReturnNull() {
        Text text = new Text("sample");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.ENGLISH);

        String uri = pointer.getNamespaceURI();

        Assert.assertNull(uri);
    }

    @Test
    public void getNamespaceURI_givenXmlPrefix_shouldReturnXmlNamespaceURI() {
        Element element = new Element("tag");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        String uri = pointer.getNamespaceURI("xml");

        Assert.assertEquals(Namespace.XML_NAMESPACE.getURI(), uri);
    }

    @Test
    public void getNamespaceURI_givenDocumentNodeWithMatchingPrefix_shouldReturnRootElementURI() {
        Element root = new Element("root", "custom", "http://custom.com");
        Document doc = new Document(root);
        JDOMNodePointer pointer = new JDOMNodePointer(doc, Locale.ENGLISH);

        String uri = pointer.getNamespaceURI("custom");

        Assert.assertEquals("http://custom.com", uri);
    }

    @Test
    public void getNamespaceURI_givenElementNodeWithMatchingPrefix_shouldReturnURI() {
        Element root = new Element("root", "custom", "http://custom.com");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);

        String uri = pointer.getNamespaceURI("custom");

        Assert.assertEquals("http://custom.com", uri);
    }

    @Test
    public void getNamespaceURI_givenUnknownPrefix_shouldReturnNull() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);

        String uri = pointer.getNamespaceURI("unknown");

        Assert.assertNull(uri);
    }

    @Test
    public void getNamespaceURI_givenNonElementNonDocumentNode_shouldReturnNull() {
        Text text = new Text("data");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.ENGLISH);

        String uri = pointer.getNamespaceURI("prefix");

        Assert.assertNull(uri);
    }

    @Test
    public void getNamespaceResolver_givenInitializedPointer_shouldReturnConfiguredResolver() {
        Element element = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        NamespaceResolver resolver = pointer.getNamespaceResolver();

        Assert.assertNotNull(resolver);
        Assert.assertSame(resolver, pointer.getNamespaceResolver());
    }

    @Test
    public void compareChildNodePointers_givenSameNodePointers_shouldReturnZero() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr1 = new JDOMNodePointer(rootPtr, child);
        JDOMNodePointer childPtr2 = new JDOMNodePointer(rootPtr, child);

        int result = rootPtr.compareChildNodePointers(childPtr1, childPtr2);

        Assert.assertEquals(0, result);
    }

    @Test
    public void compareChildNodePointers_givenAttributeAndElement_shouldReturnMinusOne() {
        Element root = new Element("root");
        Attribute attr = new Attribute("id", "1");
        Element child = new Element("child");
        root.setAttribute(attr);
        root.addContent(child);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer attrPtr = new JDOMNodePointer(rootPtr, attr);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);

        int result1 = rootPtr.compareChildNodePointers(attrPtr, childPtr);
        int result2 = rootPtr.compareChildNodePointers(childPtr, attrPtr);

        Assert.assertEquals(-1, result1);
        Assert.assertEquals(1, result2);
    }

    @Test
    public void compareChildNodePointers_givenTwoAttributes_shouldCompareByListOrder() {
        Element root = new Element("root");
        Attribute attr1 = new Attribute("a", "1");
        Attribute attr2 = new Attribute("b", "2");
        root.setAttribute(attr1);
        root.setAttribute(attr2);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(rootPtr, attr1);
        JDOMNodePointer p2 = new JDOMNodePointer(rootPtr, attr2);

        int forward = rootPtr.compareChildNodePointers(p1, p2);
        int reverse = rootPtr.compareChildNodePointers(p2, p1);

        Assert.assertEquals(-1, forward);
        Assert.assertEquals(1, reverse);
    }

    @Test
    public void compareChildNodePointers_givenTwoAttributesNotInList_shouldReturnZero() {
        Element root = new Element("root");
        Attribute attr1 = new Attribute("x", "1");
        Attribute attr2 = new Attribute("y", "2");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(rootPtr, attr1);
        JDOMNodePointer p2 = new JDOMNodePointer(rootPtr, attr2);

        int result = rootPtr.compareChildNodePointers(p1, p2);

        Assert.assertEquals(0, result);
    }

    @Test(expected = RuntimeException.class)
    public void compareChildNodePointers_givenNonElementParent_shouldThrowRuntimeException() {
        Text text = new Text("data");
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(textPtr, new Element("a"));
        JDOMNodePointer p2 = new JDOMNodePointer(textPtr, new Element("b"));

        textPtr.compareChildNodePointers(p1, p2);
    }

    @Test
    public void compareChildNodePointers_givenTwoContentChildren_shouldCompareByContentOrder() {
        Element root = new Element("root");
        Element child1 = new Element("c1");
        Element child2 = new Element("c2");
        root.addContent(child1);
        root.addContent(child2);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer p2 = new JDOMNodePointer(rootPtr, child2);

        int forward = rootPtr.compareChildNodePointers(p1, p2);
        int reverse = rootPtr.compareChildNodePointers(p2, p1);

        Assert.assertEquals(-1, forward);
        Assert.assertEquals(1, reverse);
    }

    @Test
    public void compareChildNodePointers_givenTwoContentChildrenNotInContent_shouldReturnZero() {
        Element root = new Element("root");
        Element foreign1 = new Element("f1");
        Element foreign2 = new Element("f2");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(rootPtr, foreign1);
        JDOMNodePointer p2 = new JDOMNodePointer(rootPtr, foreign2);

        int result = rootPtr.compareChildNodePointers(p1, p2);

        Assert.assertEquals(0, result);
    }

    @Test
    public void getValue_givenElementWithTextAndChildElements_shouldConcatenateAllText() {
        Element root = new Element("root");
        root.addContent(new Text("Hello "));
        Element child = new Element("child");
        child.addContent(new Text("World"));
        root.addContent(child);
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);

        Object val = pointer.getValue();

        Assert.assertEquals("Hello World", val);
    }

    @Test
    public void getValue_givenComment_shouldReturnTrimmedText() {
        Comment comment = new Comment("  a comment text  ");
        JDOMNodePointer pointer = new JDOMNodePointer(comment, Locale.ENGLISH);

        Object val = pointer.getValue();

        Assert.assertEquals("a comment text", val);
    }

    @Test
    public void getValue_givenCommentWithNullText_shouldReturnNull() {
        Comment comment = new Comment();
        JDOMNodePointer pointer = new JDOMNodePointer(comment, Locale.ENGLISH);

        Object val = pointer.getValue();

        Assert.assertNull(val);
    }

    @Test
    public void getValue_givenTextWithoutPreserve_shouldReturnTrimmedText() {
        Text text = new Text("  some text  ");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.ENGLISH);

        Object val = pointer.getValue();

        Assert.assertEquals("some text", val);
    }

    @Test
    public void getValue_givenTextWithPreserve_shouldPreserveWhitespace() {
        Element root = new Element("root");
        root.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Text text = new Text("  some text  ");
        root.addContent(text);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer pointer = new JDOMNodePointer(rootPtr, text);

        Object val = pointer.getValue();

        Assert.assertEquals("  some text  ", val);
    }

    @Test
    public void getValue_givenProcessingInstruction_shouldReturnData() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "  pi data  ");
        JDOMNodePointer pointer = new JDOMNodePointer(pi, Locale.ENGLISH);

        Object val = pointer.getValue();

        Assert.assertEquals("pi data", val);
    }

    @Test
    public void getValue_givenDocumentNode_shouldReturnNull() {
        Document doc = new Document();
        JDOMNodePointer pointer = new JDOMNodePointer(doc, Locale.ENGLISH);

        Object val = pointer.getValue();

        Assert.assertNull(val);
    }

    @Test
    public void setValue_givenTextNodeWithValue_shouldUpdateText() {
        Text text = new Text("initial");
        JDOMNodePointer pointer = new JDOMNodePointer(text, Locale.ENGLISH);

        pointer.setValue("updated");

        Assert.assertEquals("updated", text.getText());
    }

    @Test
    public void setValue_givenTextNodeWithEmptyValue_shouldRemoveTextFromParent() {
        Element root = new Element("root");
        Text text = new Text("initial");
        root.addContent(text);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, text);

        textPtr.setValue("");

        Assert.assertEquals(0, root.getContent().size());
    }

    @Test
    public void setValue_givenElementAndElementValue_shouldReplaceContent() {
        Element target = new Element("target");
        target.addContent(new Text("old"));
        Element source = new Element("source");
        source.addContent(new Element("c1"));
        source.addContent(new Text("textChild"));
        source.addContent(new ProcessingInstruction("pi", "data"));
        source.addContent(new Comment("commentChild"));
        JDOMNodePointer pointer = new JDOMNodePointer(target, Locale.ENGLISH);

        pointer.setValue(source);

        Assert.assertEquals(4, target.getContent().size());
    }

    @Test
    public void setValue_givenElementAndDocumentValue_shouldReplaceContentFromDocument() {
        Element target = new Element("target");
        Document doc = new Document();
        doc.addContent(new Element("docChild"));
        JDOMNodePointer pointer = new JDOMNodePointer(target, Locale.ENGLISH);

        pointer.setValue(doc);

        Assert.assertEquals(1, target.getContent().size());
        Assert.assertEquals("docChild", ((Element) target.getContent().get(0)).getName());
    }

    @Test
    public void setValue_givenElementAndTextValue_shouldAddText() {
        Element target = new Element("target");
        JDOMNodePointer pointer = new JDOMNodePointer(target, Locale.ENGLISH);

        pointer.setValue(new Text("customText"));

        Assert.assertEquals(1, target.getContent().size());
        Assert.assertEquals("customText", ((Text) target.getContent().get(0)).getText());
    }

    @Test
    public void setValue_givenElementAndCDATAValue_shouldAddText() {
        Element target = new Element("target");
        JDOMNodePointer pointer = new JDOMNodePointer(target, Locale.ENGLISH);

        pointer.setValue(new CDATA("cdataContent"));

        Assert.assertEquals(1, target.getContent().size());
        Assert.assertEquals("cdataContent", ((Text) target.getContent().get(0)).getText());
    }

    @Test
    public void setValue_givenElementAndProcessingInstructionValue_shouldAddClonedPI() {
        Element target = new Element("target");
        ProcessingInstruction pi = new ProcessingInstruction("pTarget", "pData");
        JDOMNodePointer pointer = new JDOMNodePointer(target, Locale.ENGLISH);

        pointer.setValue(pi);

        Assert.assertEquals(1, target.getContent().size());
        ProcessingInstruction added = (ProcessingInstruction) target.getContent().get(0);
        Assert.assertNotSame(pi, added);
        Assert.assertEquals("pTarget", added.getTarget());
    }

    @Test
    public void setValue_givenElementAndCommentValue_shouldAddClonedComment() {
        Element target = new Element("target");
        Comment comment = new Comment("hello");
        JDOMNodePointer pointer = new JDOMNodePointer(target, Locale.ENGLISH);

        pointer.setValue(comment);

        Assert.assertEquals(1, target.getContent().size());
        Comment added = (Comment) target.getContent().get(0);
        Assert.assertNotSame(comment, added);
        Assert.assertEquals("hello", added.getText());
    }

    @Test
    public void setValue_givenElementAndStringValue_shouldAddTextNode() {
        Element target = new Element("target");
        JDOMNodePointer pointer = new JDOMNodePointer(target, Locale.ENGLISH);

        pointer.setValue("simple text");

        Assert.assertEquals(1, target.getContent().size());
        Assert.assertEquals("simple text", ((Text) target.getContent().get(0)).getText());
    }

    @Test
    public void setValue_givenElementAndEmptyString_shouldLeaveContentEmpty() {
        Element target = new Element("target");
        target.addContent(new Text("old"));
        JDOMNodePointer pointer = new JDOMNodePointer(target, Locale.ENGLISH);

        pointer.setValue("");

        Assert.assertEquals(0, target.getContent().size());
    }

    @Test
    public void testNode_givenNullTest_shouldReturnTrue() {
        Element element = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);

        boolean result = pointer.testNode(null);

        Assert.assertTrue(result);
    }

    @Test
    public void testNode_givenNodeNameTestOnNonElement_shouldReturnFalse() {
        Text text = new Text("data");
        NodeNameTest test = new NodeNameTest(new QName("test"));

        boolean result = JDOMNodePointer.testNode(null, text, test);

        Assert.assertFalse(result);
    }

    @Test
    public void testNode_givenWildcardWithoutPrefix_shouldReturnTrue() {
        Element element = new Element("child");
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));

        boolean result = JDOMNodePointer.testNode(null, element, test);

        Assert.assertTrue(result);
    }

    @Test
    public void testNode_givenWildcardWithMatchingNamespaceURI_shouldReturnTrue() {
        Element element = new Element("child", "pfx", "http://example.com");
        NodeNameTest test = new NodeNameTest(new QName("pfx", "*"), "http://example.com");

        boolean result = JDOMNodePointer.testNode(null, element, test);

        Assert.assertTrue(result);
    }

    @Test
    public void testNode_givenWildcardWithMismatchedNamespaceURI_shouldReturnFalse() {
        Element element = new Element("child", "pfx", "http://example.com");
        NodeNameTest test = new NodeNameTest(new QName("pfx", "*"), "http://different.com");

        boolean result = JDOMNodePointer.testNode(null, element, test);

        Assert.assertFalse(result);
    }

    @Test
    public void testNode_givenMatchingNameAndMatchingURI_shouldReturnTrue() {
        Element element = new Element("child", "pfx", "http://example.com");
        NodeNameTest test = new NodeNameTest(new QName("pfx", "child"), "http://example.com");

        boolean result = JDOMNodePointer.testNode(null, element, test);

        Assert.assertTrue(result);
    }

    @Test
    public void testNode_givenMatchingNameAndNullURIBothMatchingPrefix_shouldReturnTrue() {
        Element element = new Element("child");
        NodeNameTest test = new NodeNameTest(new QName(null, "child"), null);

        boolean result = JDOMNodePointer.testNode(null, element, test);

        Assert.assertTrue(result);
    }

    @Test
    public void testNode_givenMismatchedLocalName_shouldReturnFalse() {
        Element element = new Element("child");
        NodeNameTest test = new NodeNameTest(new QName(null, "other"));

        boolean result = JDOMNodePointer.testNode(null, element, test);

        Assert.assertFalse(result);
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldMatchCorrectNodeTypes() {
        Element element = new Element("elem");
        Text text = new Text("txt");
        CDATA cdata = new CDATA("cd");
        Comment comment = new Comment("cmt");
        ProcessingInstruction pi = new ProcessingInstruction("pi", "data");

        NodeTypeTest anyNodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(JDOMNodePointer.testNode(null, element, anyNodeTest));

        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, text, textTest));
        Assert.assertTrue(JDOMNodePointer.testNode(null, cdata, textTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, comment, textTest));

        NodeTypeTest commentTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(JDOMNodePointer.testNode(null, comment, commentTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, text, commentTest));

        NodeTypeTest piTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, piTest));
        Assert.assertFalse(JDOMNodePointer.testNode(null, element, piTest));

        NodeTypeTest unknownTest = new NodeTypeTest(999);
        Assert.assertFalse(JDOMNodePointer.testNode(null, element, unknownTest));
    }

    @Test
    public void testNode_givenProcessingInstructionTest_shouldMatchMatchingTarget() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        ProcessingInstructionTest matching = new ProcessingInstructionTest("target");
        ProcessingInstructionTest mismatch = new ProcessingInstructionTest("other");

        Assert.assertTrue(JDOMNodePointer.testNode(null, pi, matching));
        Assert.assertFalse(JDOMNodePointer.testNode(null, pi, mismatch));
        Assert.assertFalse(JDOMNodePointer.testNode(null, new Element("target"), matching));
    }

    @Test
    public void getPrefix_givenVariousNodes_shouldReturnPrefixOrNull() {
        Element elemWithPrefix = new Element("name", "pfx", "http://test.com");
        Element elemNoPrefix = new Element("name");
        Attribute attrWithPrefix = new Attribute("name", "val", Namespace.getNamespace("apfx", "http://attr.com"));
        Attribute attrNoPrefix = new Attribute("name", "val");
        Text text = new Text("txt");

        Assert.assertEquals("pfx", JDOMNodePointer.getPrefix(elemWithPrefix));
        Assert.assertNull(JDOMNodePointer.getPrefix(elemNoPrefix));
        Assert.assertEquals("apfx", JDOMNodePointer.getPrefix(attrWithPrefix));
        Assert.assertNull(JDOMNodePointer.getPrefix(attrNoPrefix));
        Assert.assertNull(JDOMNodePointer.getPrefix(text));
    }

    @Test
    public void getLocalName_givenVariousNodes_shouldReturnNameOrNull() {
        Element elem = new Element("elementName");
        Attribute attr = new Attribute("attrName", "val");
        Text text = new Text("txt");

        Assert.assertEquals("elementName", JDOMNodePointer.getLocalName(elem));
        Assert.assertEquals("attrName", JDOMNodePointer.getLocalName(attr));
        Assert.assertNull(JDOMNodePointer.getLocalName(text));
    }

    @Test
    public void isLanguage_givenMatchingAndNonMatchingLanguage_shouldReturnCorrectBoolean() {
        Element root = new Element("root");
        root.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        root.addContent(child);
        Text text = new Text("data");
        child.addContent(text);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);
        JDOMNodePointer textPtr = new JDOMNodePointer(childPtr, text);

        Assert.assertTrue(textPtr.isLanguage("en"));
        Assert.assertTrue(textPtr.isLanguage("EN-US"));
        Assert.assertFalse(textPtr.isLanguage("fr"));
    }

    @Test
    public void isLanguage_givenNoXmlLang_shouldFallbackToLocale() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.GERMAN);

        Assert.assertTrue(pointer.isLanguage("de"));
        Assert.assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void findEnclosingAttribute_givenVariousJDOMNodes_shouldTraverseParents() {
        Element root = new Element("root");
        root.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        CDATA cdata = new CDATA("data");
        Comment comment = new Comment("comm");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        root.addContent(cdata);
        root.addContent(comment);
        root.addContent(pi);

        Assert.assertEquals("en", JDOMNodePointer.findEnclosingAttribute(cdata, "lang", Namespace.XML_NAMESPACE));
        Assert.assertEquals("en", JDOMNodePointer.findEnclosingAttribute(comment, "lang", Namespace.XML_NAMESPACE));
        Assert.assertEquals("en", JDOMNodePointer.findEnclosingAttribute(pi, "lang", Namespace.XML_NAMESPACE));
        Assert.assertNull(JDOMNodePointer.findEnclosingAttribute(null, "lang", Namespace.XML_NAMESPACE));
        Assert.assertNull(JDOMNodePointer.findEnclosingAttribute("aString", "lang", Namespace.XML_NAMESPACE));
    }

    @Test
    public void createChild_withoutFactory_shouldThrowException() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        try {
            pointer.createChild(context, new QName("child"), 0);
            Assert.fail("Expected JXPathAbstractFactoryException");
        }
        catch (JXPathAbstractFactoryException ex) {
            Assert.assertNotNull(ex.getMessage());
        }
    }

    @Test
    public void createChild_withFactory_shouldCreateAndReturnNodePointer() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                if (node instanceof Element) {
                    ((Element) node).addContent(new Element(name));
                    return true;
                }
                return false;
            }
        });

        NodePointer result = pointer.createChild(context, new QName("child"), 0);

        Assert.assertNotNull(result);
        Assert.assertEquals("child", ((Element) result.getBaseValue()).getName());
    }

    @Test
    public void createChild_withFactoryAndValue_shouldSetAssignedValue() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext ctx, Pointer parent, Object node, String name, int index) {
                if (node instanceof Element) {
                    ((Element) node).addContent(new Element(name));
                    return true;
                }
                return false;
            }
        });

        NodePointer result = pointer.createChild(context, new QName("child"), 0, "childValue");

        Assert.assertNotNull(result);
        Assert.assertEquals("childValue", result.getValue());
    }

    @Test
    public void createAttribute_givenElementWithoutPrefix_shouldAddAttribute() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer attrPtr = pointer.createAttribute(context, new QName("testAttr"));

        Assert.assertNotNull(attrPtr);
        Assert.assertEquals("testAttr", ((Attribute) attrPtr.getBaseValue()).getName());
        Assert.assertEquals("", ((Attribute) attrPtr.getBaseValue()).getValue());
    }

    @Test
    public void createAttribute_givenElementWithRegisteredPrefix_shouldAddAttributeWithNamespace() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);
        pointer.getNamespaceResolver().registerNamespace("ns", "http://example.com");
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer attrPtr = pointer.createAttribute(context, new QName("ns", "attrWithNs"));

        Assert.assertNotNull(attrPtr);
        Attribute attr = (Attribute) attrPtr.getBaseValue();
        Assert.assertEquals("attrWithNs", attr.getName());
        Assert.assertEquals("http://example.com", attr.getNamespaceURI());
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_givenElementWithUnknownPrefix_shouldThrowException() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());

        pointer.createAttribute(context, new QName("unknown", "attr"));
    }

    @Test(expected = JXPathException.class)
    public void remove_givenRootNodeWithoutParent_shouldThrowJXPathException() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);

        pointer.remove();
    }

    @Test
    public void remove_givenChildElement_shouldRemoveFromParent() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);

        childPtr.remove();

        Assert.assertEquals(0, root.getContent().size());
    }

    @Test
    public void asPath_givenId_shouldReturnIdSelector() {
        Element root = new Element("root");
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH, "elemId");

        String path = pointer.asPath();

        Assert.assertEquals("id('elemId')", path);
    }

    @Test
    public void asPath_givenNestedElements_shouldBuildCompletePath() {
        Element root = new Element("root");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        root.addContent(child1);
        root.addContent(child2);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer child1Ptr = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer child2Ptr = new JDOMNodePointer(rootPtr, child2);

        Assert.assertEquals("/child[1]", child1Ptr.asPath());
        Assert.assertEquals("/child[2]", child2Ptr.asPath());
    }

    @Test
    public void asPath_givenElementWithNamespaceAndRegisteredPrefix_shouldIncludePrefix() {
        Element root = new Element("root");
        Element child = new Element("item", "pfx", "http://test.com");
        root.addContent(child);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        rootPtr.getNamespaceResolver().registerNamespace("pfx", "http://test.com");
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);

        Assert.assertEquals("/pfx:item[1]", childPtr.asPath());
    }

    @Test
    public void asPath_givenElementWithNamespaceAndUnregisteredPrefix_shouldUseNodeFunction() {
        Element root = new Element("root");
        Element child = new Element("item", "pfx", "http://unknown.com");
        root.addContent(child);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);

        Assert.assertEquals("/node()[1]", childPtr.asPath());
    }

    @Test
    public void asPath_givenTextAndCDATANodes_shouldReturnTextSelector() {
        Element root = new Element("root");
        Text text = new Text("hello");
        CDATA cdata = new CDATA("world");
        root.addContent(text);
        root.addContent(cdata);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, text);
        JDOMNodePointer cdataPtr = new JDOMNodePointer(rootPtr, cdata);

        Assert.assertEquals("/text()[1]", textPtr.asPath());
        Assert.assertEquals("/text()[2]", cdataPtr.asPath());
    }

    @Test
    public void asPath_givenProcessingInstruction_shouldReturnPISelector() {
        Element root = new Element("root");
        ProcessingInstruction pi1 = new ProcessingInstruction("target", "d1");
        ProcessingInstruction pi2 = new ProcessingInstruction("target", "d2");
        root.addContent(pi1);
        root.addContent(pi2);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer pi1Ptr = new JDOMNodePointer(rootPtr, pi1);
        JDOMNodePointer pi2Ptr = new JDOMNodePointer(rootPtr, pi2);

        Assert.assertEquals("/processing-instruction('target')[1]", pi1Ptr.asPath());
        Assert.assertEquals("/processing-instruction('target')[2]", pi2Ptr.asPath());
    }

    @Test
    public void equalsAndHashCode_givenVariousComparisons_shouldAdhereToContract() {
        Element elem1 = new Element("elem");
        Element elem2 = new Element("elem");

        JDOMNodePointer ptr1 = new JDOMNodePointer(elem1, Locale.ENGLISH);
        JDOMNodePointer ptr1Same = new JDOMNodePointer(elem1, Locale.ENGLISH);
        JDOMNodePointer ptr2 = new JDOMNodePointer(elem2, Locale.ENGLISH);

        Assert.assertTrue(ptr1.equals(ptr1));
        Assert.assertTrue(ptr1.equals(ptr1Same));
        Assert.assertFalse(ptr1.equals(ptr2));
        Assert.assertFalse(ptr1.equals(null));
        Assert.assertFalse(ptr1.equals("NotANodePointer"));

        Assert.assertEquals(ptr1.hashCode(), ptr1Same.hashCode());
        Assert.assertEquals(elem1.hashCode(), ptr1.hashCode());
    }

    @Test
    public void iterators_givenElement_shouldInstantiateIteratorsAndPointers() {
        Element root = new Element("root");
        root.setAttribute("attr", "val");
        root.addContent(new Element("child"));

        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.ENGLISH);

        NodeIterator childIt = pointer.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = pointer.attributeIterator(new QName("attr"));
        Assert.assertNotNull(attrIt);

        NodeIterator nsIt = pointer.namespaceIterator();
        Assert.assertNotNull(nsIt);

        NodePointer nsPtr = pointer.namespacePointer("xml");
        Assert.assertNotNull(nsPtr);
    }
}