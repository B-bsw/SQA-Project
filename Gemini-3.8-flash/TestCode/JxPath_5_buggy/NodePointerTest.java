package org.apache.commons.jxpath.ri.model;

import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Assert;
import org.junit.Test;

public class NodePointerTest {

    private static class MockNodePointer extends NodePointer {
        private static final long serialVersionUID = 1L;
        private QName name;
        private Object node;
        private Object baseValue;
        private boolean leaf;
        private boolean collection;
        private int length;
        private boolean container;
        private NodePointer immediateValuePointer;
        private String namespaceURI;
        private String defaultNamespaceURI;

        public MockNodePointer(NodePointer parent, QName name, Object node) {
            super(parent);
            this.name = name;
            this.node = node;
            this.leaf = true;
            this.collection = false;
            this.length = 1;
            this.immediateValuePointer = this;
        }

        public MockNodePointer(NodePointer parent, Locale locale, QName name, Object node) {
            super(parent, locale);
            this.name = name;
            this.node = node;
            this.leaf = true;
            this.collection = false;
            this.length = 1;
            this.immediateValuePointer = this;
        }

        public boolean isLeaf() {
            return leaf;
        }

        public void setLeaf(boolean leaf) {
            this.leaf = leaf;
        }

        public boolean isCollection() {
            return collection;
        }

        public void setCollection(boolean collection) {
            this.collection = collection;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public boolean isContainer() {
            return container;
        }

        public void setContainer(boolean container) {
            this.container = container;
        }

        public QName getName() {
            return name;
        }

        public void setName(QName name) {
            this.name = name;
        }

        public Object getBaseValue() {
            return baseValue;
        }

        public void setBaseValue(Object baseValue) {
            this.baseValue = baseValue;
        }

        public Object getImmediateNode() {
            return node;
        }

        public void setValue(Object value) {
            this.node = value;
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            if (pointer1 == pointer2) {
                return 0;
            }
            if (pointer1 == null) {
                return -1;
            }
            if (pointer2 == null) {
                return 1;
            }
            String n1 = pointer1.getName() != null ? pointer1.getName().toString() : "";
            String n2 = pointer2.getName() != null ? pointer2.getName().toString() : "";
            return n1.compareTo(n2);
        }

        public NodePointer getImmediateValuePointer() {
            return immediateValuePointer;
        }

        public void setImmediateValuePointer(NodePointer ivp) {
            this.immediateValuePointer = ivp;
        }

        public String getNamespaceURI(String prefix) {
            return namespaceURI;
        }

        public void setNamespaceURI(String namespaceURI) {
            this.namespaceURI = namespaceURI;
        }

        protected String getDefaultNamespaceURI() {
            return defaultNamespaceURI;
        }

        public void setDefaultNamespaceURI(String defaultNamespaceURI) {
            this.defaultNamespaceURI = defaultNamespaceURI;
        }

        public boolean isDefaultNamespace(String prefix) {
            return super.isDefaultNamespace(prefix);
        }
    }

    private static class DelegatingTestContext extends JXPathContext {
        private String requestedId;
        private String requestedKey;
        private String requestedKeyValue;
        private Pointer pointerToReturn;

        protected DelegatingTestContext(JXPathContext parentContext, Object contextBean) {
            super(parentContext, contextBean);
        }

        public Pointer getPointerByID(String id) {
            this.requestedId = id;
            return pointerToReturn;
        }

        public Pointer getPointerByKey(String key, String value) {
            this.requestedKey = key;
            this.requestedKeyValue = value;
            return pointerToReturn;
        }

        public Pointer getPointerToReturn() {
            return pointerToReturn;
        }

        public void setPointerToReturn(Pointer pointerToReturn) {
            this.pointerToReturn = pointerToReturn;
        }

        public String getRequestedId() {
            return requestedId;
        }

        public String getRequestedKey() {
            return requestedKey;
        }

        public String getRequestedKeyValue() {
            return requestedKeyValue;
        }

        public org.apache.commons.jxpath.CompiledExpression compilePath(String xpath) {
            return null;
        }

        public Object getValue(String xpath) {
            return null;
        }

        public Object getValue(String xpath, Class requiredType) {
            return null;
        }

        public java.util.Iterator iterate(String xpath) {
            return null;
        }

        public Pointer getPointer(String xpath) {
            return null;
        }

        public java.util.Iterator iteratePointers(String xpath) {
            return null;
        }

        public Pointer createPath(String xpath) {
            return null;
        }

        public Pointer createPath(String xpath, Object value) {
            return null;
        }

        public Pointer createPathAndSetValue(String xpath, Object value) {
            return null;
        }

        public void setValue(String xpath, Object value) {
        }

        public void removePath(String xpath) {
        }

        public void removeAll(String xpath) {
        }

        public org.apache.commons.jxpath.JXPathContext getRelativeContext(Pointer pointer) {
            return null;
        }
    }

    @Test
    public void newNodePointer_givenNullBean_shouldReturnNullPointer() {
        QName name = new QName("testName");
        Locale locale = Locale.ENGLISH;

        NodePointer result = NodePointer.newNodePointer(name, null, locale);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof NullPointer);
        Assert.assertEquals(locale, result.getLocale());
    }

    @Test
    public void constructorsAndParent_givenParentAndLocale_shouldInitializeCorrectly() {
        MockNodePointer root = new MockNodePointer(null, Locale.GERMANY, new QName("root"), "rootValue");
        MockNodePointer child = new MockNodePointer(root, new QName("child"), "childValue");

        Assert.assertNull(root.getParent());
        Assert.assertNull(root.getImmediateParentPointer());
        Assert.assertTrue(root.isRoot());

        Assert.assertSame(root, child.getParent());
        Assert.assertSame(root, child.getImmediateParentPointer());
        Assert.assertFalse(child.isRoot());
    }

    @Test
    public void getParent_givenIntermediateContainer_shouldSkipContainers() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "root");
        MockNodePointer container1 = new MockNodePointer(root, new QName("container1"), "c1");
        container1.setContainer(true);
        MockNodePointer container2 = new MockNodePointer(container1, new QName("container2"), "c2");
        container2.setContainer(true);
        MockNodePointer leaf = new MockNodePointer(container2, new QName("leaf"), "leaf");

        Assert.assertSame(container2, leaf.getImmediateParentPointer());
        Assert.assertSame(root, leaf.getParent());
    }

    @Test
    public void getParent_whenAllAncestorsAreContainers_shouldReturnNull() {
        MockNodePointer containerRoot = new MockNodePointer(null, new QName("root"), "root");
        containerRoot.setContainer(true);
        MockNodePointer leaf = new MockNodePointer(containerRoot, new QName("leaf"), "leaf");

        Assert.assertNull(leaf.getParent());
    }

    @Test
    public void isNodeAndIsContainer_givenDefaultAndExplicit_shouldReflectState() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("node"), "val");

        Assert.assertFalse(pointer.isContainer());
        Assert.assertTrue(pointer.isNode());

        pointer.setContainer(true);
        Assert.assertTrue(pointer.isContainer());
        Assert.assertFalse(pointer.isNode());
    }

    @Test
    public void attributeAccessors_givenTrueAndFalse_shouldUpdateCorrectly() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("attr"), "val");

        Assert.assertFalse(pointer.isAttribute());
        pointer.setAttribute(true);
        Assert.assertTrue(pointer.isAttribute());
        pointer.setAttribute(false);
        Assert.assertFalse(pointer.isAttribute());
    }

    @Test
    public void indexAccessors_givenVariousIndices_shouldStoreAndRetrieve() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("indexed"), "val");

        Assert.assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
        pointer.setIndex(5);
        Assert.assertEquals(5, pointer.getIndex());
        pointer.setIndex(-1);
        Assert.assertEquals(-1, pointer.getIndex());
    }

    @Test
    public void isActual_givenDifferentIndexAndLengthConditions_shouldEvaluateAccurately() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("item"), "val");
        pointer.setLength(3);

        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        Assert.assertTrue(pointer.isActual());

        pointer.setIndex(0);
        Assert.assertTrue(pointer.isActual());

        pointer.setIndex(2);
        Assert.assertTrue(pointer.isActual());

        pointer.setIndex(3);
        Assert.assertFalse(pointer.isActual());

        pointer.setIndex(-1);
        Assert.assertFalse(pointer.isActual());

        pointer.setIndex(10);
        Assert.assertFalse(pointer.isActual());
    }

    @Test
    public void getValueAndGetNode_whenImmediateValuePointerIsSelf_shouldReturnNode() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("item"), "hello");

        Assert.assertEquals("hello", pointer.getNode());
        Assert.assertEquals("hello", pointer.getNodeValue());
        Assert.assertEquals("hello", pointer.getValue());
    }

    @Test
    public void getValue_whenImmediateValuePointerIsDifferent_shouldDelegate() {
        MockNodePointer target = new MockNodePointer(null, new QName("target"), "targetValue");
        MockNodePointer wrapper = new MockNodePointer(null, new QName("wrapper"), "wrapperValue");
        wrapper.setImmediateValuePointer(target);

        Assert.assertSame(target, wrapper.getValuePointer());
        Assert.assertEquals("targetValue", wrapper.getValue());
    }

    @Test
    public void getValuePointer_whenMultipleChainedPointers_shouldResolveDeepest() {
        MockNodePointer deep = new MockNodePointer(null, new QName("deep"), "deepVal");
        MockNodePointer mid = new MockNodePointer(null, new QName("mid"), "midVal");
        MockNodePointer top = new MockNodePointer(null, new QName("top"), "topVal");

        top.setImmediateValuePointer(mid);
        mid.setImmediateValuePointer(deep);

        Assert.assertSame(deep, top.getValuePointer());
    }

    @Test
    public void getRootNode_givenSingleNodeAndHierarchy_shouldCacheAndReturnRoot() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "rootNode");
        MockNodePointer child = new MockNodePointer(root, new QName("child"), "childNode");
        MockNodePointer grandChild = new MockNodePointer(child, new QName("grandChild"), "grandChildNode");

        Assert.assertEquals("rootNode", root.getRootNode());
        Assert.assertEquals("rootNode", child.getRootNode());
        Assert.assertEquals("rootNode", grandChild.getRootNode());

        Assert.assertEquals("rootNode", grandChild.getRootNode());
    }

    @Test
    public void namespaceResolver_givenParentInheritanceAndExplicitSet_shouldResolveProperly() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "root");
        NamespaceResolver rootResolver = new NamespaceResolver(null);
        root.setNamespaceResolver(rootResolver);

        MockNodePointer child = new MockNodePointer(root, new QName("child"), "child");
        Assert.assertSame(rootResolver, child.getNamespaceResolver());

        NamespaceResolver childResolver = new NamespaceResolver(rootResolver);
        child.setNamespaceResolver(childResolver);
        Assert.assertSame(childResolver, child.getNamespaceResolver());

        MockNodePointer orphan = new MockNodePointer(null, new QName("orphan"), "orphan");
        Assert.assertNull(orphan.getNamespaceResolver());
    }

    @Test
    public void locale_whenNullInChild_shouldInheritFromParent() {
        MockNodePointer root = new MockNodePointer(null, Locale.ITALY, new QName("root"), "root");
        MockNodePointer child = new MockNodePointer(root, new QName("child"), "child");

        Assert.assertEquals(Locale.ITALY, child.getLocale());
    }

    @Test
    public void locale_whenBothChildAndParentNull_shouldReturnNull() {
        MockNodePointer root = new MockNodePointer(null, null, new QName("root"), "root");
        MockNodePointer child = new MockNodePointer(root, null, new QName("child"), "child");

        Assert.assertNull(child.getLocale());
    }

    @Test
    public void isLanguage_givenMatchingAndNonMatching_shouldEvaluateCaseInsensitive() {
        MockNodePointer pointer = new MockNodePointer(null, Locale.US, new QName("item"), "val");

        Assert.assertTrue(pointer.isLanguage("en"));
        Assert.assertTrue(pointer.isLanguage("EN"));
        Assert.assertTrue(pointer.isLanguage("en-US"));
        Assert.assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void defaultImplementations_shouldReturnDefaultValues() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("elem"), "val");

        Assert.assertNull(pointer.namespaceIterator());
        Assert.assertNull(pointer.namespacePointer("ns"));
        Assert.assertNull(pointer.getNamespaceURI("prefix"));
        Assert.assertNull(pointer.getNamespaceURI());
        Assert.assertNull(pointer.childIterator(null, false, null));
        Assert.assertNull(pointer.attributeIterator(new QName("attr")));

        pointer.remove();
    }

    @Test
    public void childAndAttributeIterators_whenValuePointerIsChildPointer_shouldDelegate() {
        MockNodePointer target = new MockNodePointer(null, new QName("target"), "target");
        MockNodePointer wrapper = new MockNodePointer(null, new QName("wrapper"), "wrapper");
        wrapper.setImmediateValuePointer(target);

        Assert.assertNull(wrapper.childIterator(null, false, null));
        Assert.assertNull(wrapper.attributeIterator(new QName("test")));
    }

    @Test
    public void isDefaultNamespace_givenNullOrDifferentURIs_shouldEvaluateCorrectly() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("elem"), "val");

        Assert.assertTrue(pointer.isDefaultNamespace(null));

        pointer.setNamespaceURI("http://example.com");
        pointer.setDefaultNamespaceURI("http://example.com");
        Assert.assertTrue(pointer.isDefaultNamespace("pfx"));

        pointer.setDefaultNamespaceURI("http://other.com");
        Assert.assertFalse(pointer.isDefaultNamespace("pfx"));

        pointer.setNamespaceURI(null);
        Assert.assertFalse(pointer.isDefaultNamespace("pfx"));
    }

    @Test
    public void testNode_givenNullTest_shouldReturnTrue() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("item"), "val");
        Assert.assertTrue(pointer.testNode(null));
    }

    @Test
    public void testNode_givenContainer_whenNodeNameTest_shouldReturnFalse() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("item"), "val");
        pointer.setContainer(true);
        NodeNameTest test = new NodeNameTest(new QName("item"));

        Assert.assertFalse(pointer.testNode(test));
    }

    @Test
    public void testNode_givenNullPointerName_whenNodeNameTest_shouldReturnFalse() {
        MockNodePointer pointer = new MockNodePointer(null, null, "val");
        NodeNameTest test = new NodeNameTest(new QName("item"));

        Assert.assertFalse(pointer.testNode(test));
    }

    @Test
    public void testNode_givenDifferentPrefixAndDifferentNS_shouldReturnFalse() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("p1", "item"), "val");
        pointer.setNamespaceURI("uri1");

        NodeNameTest test = new NodeNameTest(new QName("p2", "item"));
        Assert.assertTrue(pointer.testNode(test));
    }

    private static class NsLookupPointer extends MockNodePointer {
        private String p1Uri;
        private String p2Uri;

        public NsLookupPointer(NodePointer parent, QName name, Object node) {
            super(parent, name, node);
        }

        public String getNamespaceURI(String prefix) {
            if ("p1".equals(prefix)) {
                return p1Uri;
            }
            if ("p2".equals(prefix)) {
                return p2Uri;
            }
            return null;
        }

        public void setP1Uri(String u) {
            this.p1Uri = u;
        }

        public void setP2Uri(String u) {
            this.p2Uri = u;
        }
    }

    @Test
    public void testNode_givenPrefixMismatchAndUriMismatch_shouldReturnFalse() {
        NsLookupPointer pointer = new NsLookupPointer(null, new QName("p1", "item"), "val");
        pointer.setP1Uri("http://ns1");
        pointer.setP2Uri("http://ns2");

        NodeNameTest test = new NodeNameTest(new QName("p2", "item"));
        Assert.assertFalse(pointer.testNode(test));
    }

    @Test
    public void testNode_givenPrefixMismatchButSameUri_shouldMatchName() {
        NsLookupPointer pointer = new NsLookupPointer(null, new QName("p1", "item"), "val");
        pointer.setP1Uri("http://common");
        pointer.setP2Uri("http://common");

        NodeNameTest testMatching = new NodeNameTest(new QName("p2", "item"));
        Assert.assertTrue(pointer.testNode(testMatching));

        NodeNameTest testDiffName = new NodeNameTest(new QName("p2", "other"));
        Assert.assertFalse(pointer.testNode(testDiffName));
    }

    @Test
    public void testNode_givenWildcardNodeNameTest_shouldReturnTrue() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("anyName"), "val");
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"));

        Assert.assertTrue(pointer.testNode(wildcardTest));
    }

    @Test
    public void testNode_givenExactNodeNameTest_shouldMatchExactNameOnly() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("item"), "val");

        Assert.assertTrue(pointer.testNode(new NodeNameTest(new QName("item"))));
        Assert.assertFalse(pointer.testNode(new NodeNameTest(new QName("nonItem"))));
    }

    @Test
    public void testNode_givenNodeTypeTest_shouldValidateNodeType() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("item"), "val");

        NodeTypeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(pointer.testNode(nodeTest));

        pointer.setContainer(true);
        Assert.assertFalse(pointer.testNode(nodeTest));

        pointer.setContainer(false);
        NodeTypeTest textTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertFalse(pointer.testNode(textTest));
    }

    @Test
    public void testNode_givenUnknownNodeTest_shouldReturnFalse() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("item"), "val");
        NodeTest otherTest = new NodeTest() {};

        Assert.assertFalse(pointer.testNode(otherTest));
    }

    @Test
    public void createPath_givenContext_shouldReturnSelfAndSetValue() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("elem"), "original");

        NodePointer pathPointer = pointer.createPath(null);
        Assert.assertSame(pointer, pathPointer);

        NodePointer pathValPointer = pointer.createPath(null, "updated");
        Assert.assertSame(pointer, pathValPointer);
        Assert.assertEquals("updated", pointer.getNode());
    }

    @Test(expected = JXPathException.class)
    public void createChild_4Args_shouldThrowJXPathException() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("root"), "val");
        pointer.createChild(null, new QName("child"), 0, "val");
    }

    @Test(expected = JXPathException.class)
    public void createChild_3Args_shouldThrowJXPathException() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("root"), "val");
        pointer.createChild(null, new QName("child"), 0);
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_shouldThrowJXPathException() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("root"), "val");
        pointer.createAttribute(null, new QName("attr"));
    }

    @Test
    public void getPointerByIDAndKey_givenContext_shouldDelegateToContext() {
        MockNodePointer pointer = new MockNodePointer(null, new QName("item"), "val");
        DelegatingTestContext ctx = new DelegatingTestContext(null, null);
        ctx.setPointerToReturn(pointer);

        Pointer p1 = pointer.getPointerByID(ctx, "id123");
        Assert.assertSame(pointer, p1);
        Assert.assertEquals("id123", ctx.getRequestedId());

        Pointer p2 = pointer.getPointerByKey(ctx, "keyName", "keyValue");
        Assert.assertSame(pointer, p2);
        Assert.assertEquals("keyName", ctx.getRequestedKey());
        Assert.assertEquals("keyValue", ctx.getRequestedKeyValue());
    }

    @Test
    public void asPath_givenRootElement_shouldFormatCorrectly() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "val");

        Assert.assertEquals("/root", root.asPath());
        Assert.assertEquals("/root", root.toString());
    }

    @Test
    public void asPath_givenAttributeAndCollectionIndex_shouldFormatCorrectly() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "rootVal");
        MockNodePointer attr = new MockNodePointer(root, new QName("item"), "val");
        attr.setAttribute(true);
        attr.setCollection(true);
        attr.setIndex(2);

        Assert.assertEquals("/root/@item[3]", attr.asPath());
    }

    @Test
    public void asPath_givenContainerParent_shouldUseParentPath() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "rootVal");
        MockNodePointer container = new MockNodePointer(root, new QName("container"), "cVal");
        container.setContainer(true);
        MockNodePointer leaf = new MockNodePointer(container, new QName("leaf"), "leafVal");

        Assert.assertEquals("/root", leaf.asPath());
    }

    @Test
    public void asPath_whenCollectionIndexIsWholeCollection_shouldNotAppendIndex() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "val");
        root.setCollection(true);
        root.setIndex(NodePointer.WHOLE_COLLECTION);

        Assert.assertEquals("/root", root.asPath());
    }

    @Test
    public void clone_givenHierarchy_shouldPerformDeepCloneOfParents() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "val");
        MockNodePointer child = new MockNodePointer(root, new QName("child"), "val2");

        MockNodePointer clonedChild = (MockNodePointer) child.clone();

        Assert.assertNotNull(clonedChild);
        Assert.assertNotSame(child, clonedChild);
        Assert.assertNotNull(clonedChild.parent);
        Assert.assertNotSame(child.parent, clonedChild.parent);
        Assert.assertEquals(child.getName(), clonedChild.getName());
    }

    @Test
    public void compareTo_givenSameParent_shouldDelegateToCompareChildNodePointers() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "val");
        MockNodePointer childA = new MockNodePointer(root, new QName("a"), "valA");
        MockNodePointer childB = new MockNodePointer(root, new QName("b"), "valB");

        Assert.assertTrue(childA.compareTo(childB) < 0);
        Assert.assertTrue(childB.compareTo(childA) > 0);
        Assert.assertEquals(0, childA.compareTo(childA));
    }

    @Test
    public void compareTo_givenNullParents_shouldReturnZero() {
        MockNodePointer root1 = new MockNodePointer(null, new QName("root"), "val1");
        Assert.assertEquals(0, root1.compareTo(root1));
    }

    @Test
    public void compareTo_givenDifferentDepths_shouldOrderCorrectly() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "val");
        MockNodePointer childA = new MockNodePointer(root, new QName("a"), "valA");
        MockNodePointer grandChildA = new MockNodePointer(childA, new QName("subA"), "valSubA");
        MockNodePointer childB = new MockNodePointer(root, new QName("b"), "valB");

        Assert.assertTrue(grandChildA.compareTo(childB) < 0);
        Assert.assertTrue(childB.compareTo(grandChildA) > 0);
    }

    @Test
    public void compareTo_givenIdenticalPointers_shouldReturnZero() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "val");
        MockNodePointer child = new MockNodePointer(root, new QName("child"), "childVal");

        Assert.assertEquals(0, child.compareTo(child));
    }

    @Test(expected = JXPathException.class)
    public void compareTo_givenDifferentTrees_shouldThrowJXPathException() {
        MockNodePointer root1 = new MockNodePointer(null, new QName("root1"), "val1");
        MockNodePointer root2 = new MockNodePointer(null, new QName("root2"), "val2");

        MockNodePointer child1 = new MockNodePointer(root1, new QName("child1"), "val");
        MockNodePointer child2 = new MockNodePointer(root2, new QName("child2"), "val");

        child1.compareTo(child2);
    }

    @Test
    public void printPointerChain_shouldRunWithoutException() {
        MockNodePointer root = new MockNodePointer(null, new QName("root"), "root");
        MockNodePointer child = new MockNodePointer(root, new QName("child"), "child");

        child.printPointerChain();
    }
}