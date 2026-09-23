package org.apache.commons.jxpath.ri.model.beans;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class PropertyPointerTest {

    private TestPropertyPointer pointer;
    private TestPropertyPointer parent;

    @org.junit.Before
    public void setUp() {
        parent = new TestPropertyPointer(null);
        pointer = new TestPropertyPointer(parent);
    }

    @Test
    public void testGetPropertyIndexInitial() {
        assertEquals(PropertyPointer.UNSPECIFIED_PROPERTY, pointer.getPropertyIndex());
    }

    @Test
    public void testSetPropertyIndex() {
        pointer.setPropertyIndex(5);
        assertEquals(5, pointer.getPropertyIndex());
        pointer.setPropertyIndex(5);
        assertEquals(5, pointer.getPropertyIndex());
    }

    @Test
    public void testGetBeanWhenBeanNull() {
        TestPropertyPointer parentWithBean = new TestPropertyPointer(null);
        Object bean = new Object();
        parentWithBean.setBean(bean);
        TestPropertyPointer childPointer = new TestPropertyPointer(parentWithBean);
        assertSame(bean, childPointer.getBean());
    }

    @Test
    public void testGetName() {
        pointer.setPropertyName("test");
        QName name = pointer.getName();
        assertEquals("test", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void testIsActualWhenNotActual() {
        pointer.setActual(false);
        assertFalse(pointer.isActual());
    }

    @Test
    public void testGetImmediateNodeWithWholeCollection() {
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertEquals(1, pointer.getImmediateNode());
    }

    @Test
    public void testGetImmediateNodeWithIndex() {
        pointer.setIndex(0);
        assertEquals(10, pointer.getImmediateNode());
    }

    @Test
    public void testIsCollectionWithNullValue() {
        pointer.setValue(null);
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testIsCollection() {
        Object[] array = new Object[] {1, 2, 3};
        pointer.setValue(array);
        assertTrue(pointer.isCollection());
    }

    @Test
    public void testIsLeafAtomicValue() {
        pointer.setValue("string");
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLeafNullValue() {
        pointer.setValue(null);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testGetLength() {
        Object[] array = new Object[] {1, 2, 3};
        pointer.setValue(array);
        assertEquals(3, pointer.getLength());
    }

    @Test
    public void testGetImmediateValuePointer() {
        pointer.setIndex(0);
        NodePointer np = pointer.getImmediateValuePointer();
        assertNotNull(np);
    }

    @Test
    public void testCreatePathWhenImmediateNodeNotNull() {
        pointer.setValue("test");
        assertEquals(pointer, pointer.createPath(null));
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreatePathWhenFactoryFails() {
        pointer.setValue(null);
        TestAbstractFactory factory = new TestAbstractFactory(false);
        pointer.setAbstractFactory(factory);
        pointer.createPath(new DummyContext());
    }

    @Test
    public void testCreatePathWithIndexGreaterThanLength() {
        pointer.setIndex(5);
        pointer.createPath(new DummyContext(), "value");
        assertEquals("value", pointer.pointerValue);
    }

    @Test
    public void testCreateChildWithName() {
        TestPropertyPointer result = (TestPropertyPointer) pointer.createChild(
            new DummyContext(), new QName("prefix", "name"), 0);
        assertNotNull(result);
        assertEquals("name", result.getPropertyName());
    }

    @Test
    public void testCreateChildWithNullName() {
        TestPropertyPointer result = (TestPropertyPointer) pointer.createChild(
            new DummyContext(), null, 0);
        assertNotNull(result);
    }

    @Test
    public void testHashCode() {
        assertNotNull(pointer.hashCode());
    }

    @Test
    public void testEqualsSelf() {
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(pointer.equals("test"));
    }

    @Test
    public void testEqualsDifferentParent() {
        TestPropertyPointer other = new TestPropertyPointer(new TestPropertyPointer(null));
        pointer.setPropertyName("test");
        other.setPropertyName("test");
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEqualsSameParentDifferentIndex() {
        TestPropertyPointer other = new TestPropertyPointer(parent);
        pointer.setPropertyName("test");
        other.setPropertyName("test");
        other.setIndex(1);
        pointer.setIndex(2);
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(pointer.equals(null));
    }

    @Test
    public void testEqualsSameProperties() {
        TestPropertyPointer other = new TestPropertyPointer(parent);
        pointer.setPropertyName("test");
        other.setPropertyName("test");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        other.setIndex(0);
        assertTrue(pointer.equals(other));
    }

    @Test
    public void testCompareChildNodePointers() {
        Object[] array = new Object[2];
        array[0] = "first";
        array[1] = "second";
        pointer.setValue(array);
        pointer.setIndex(1);
        assertNotNull(pointer.compareChildNodePointers(
            new TestNodePointer(pointer), new TestNodePointer(pointer)));
    }

    // Inner test class
    private static class TestPropertyPointer extends PropertyPointer {
        private String propertyName;
        private boolean actual = true;
        private Object value;
        private AbstractFactory factory;

        public TestPropertyPointer(NodePointer parent) {
            super(parent);
        }

        @Override
        public String getPropertyName() {
            return propertyName;
        }

        @Override
        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }

        @Override
        public int getPropertyCount() {
            return 1;
        }

        @Override
        public String[] getPropertyNames() {
            return new String[] {propertyName};
        }

        @Override
        protected boolean isActualProperty() {
            return actual;
        }

        public void setActual(boolean actual) {
            this.actual = actual;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        @Override
        public Object getBaseValue() {
            return value;
        }

        public void setBean(Object bean) {
            this.bean = bean;
        }

        @Override
        public Object getNode() {
            return value;
        }

        public void setFactory(AbstractFactory factory) {
            this.factory = factory;
        }

        @Override
        protected AbstractFactory getAbstractFactory(JXPathContext context) {
            return factory;
        }

        @Override
        public NodePointer createPath(JXPathContext context) {
            if (factory == null || !factory.createObject(context, this, getBean(), getPropertyName(), 0)) {
                throw new JXPathAbstractFactoryException("Factory failed");
            }
            return this;
        }

        @Override
        public NodePointer getImmediateValuePointer() {
            return this;
        }

        @Override
        public Object getImmediateNode() {
            if (index == WHOLE_COLLECTION) {
                return 1;
            } else if (index == 0) {
                return 10;
            }
            return value;
        }
    }

    private static class TestAbstractFactory extends AbstractFactory {
        private boolean success;

        public TestAbstractFactory(boolean success) {
            this.success = success;
        }

        @Override
        public boolean createObject(
            JXPathContext context, NodePointer pointer, Object parent, String name, int index) {
            return success;
        }
    }

    private static class DummyContext extends JXPathContext {
        public DummyContext() {
            super(null, null);
        }
    }

    private static class TestNodePointer extends NodePointer {
        public TestNodePointer(NodePointer parent) {
            super(parent);
        }

        @Override
        public boolean isLeaf() {
            return false;
        }

        @Override
        public boolean isActual() {
            return true;
        }

        @Override
        public Object getBaseValue() {
            return null;
        }

        @Override
        public Object getImmediateNode() {
            return null;
        }

        @Override
        public int getLength() {
            return 0;
        }

        @Override
        public String asPath() {
            return "";
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }
    }
}