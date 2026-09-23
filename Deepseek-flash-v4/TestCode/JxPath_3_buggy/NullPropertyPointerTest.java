package org.apache.commons.jxpath.ri.model.beans;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.Pointer;

public class NullPropertyPointerTest {

    private NullPropertyPointer pointer;
    private NodePointer parent;

    @Before
    public void setUp() {
        parent = new NullPointer(new QName("root"));
        pointer = new NullPropertyPointer(parent);
    }

    @Test
    public void testNameDefault() {
        assertEquals(new QName("*"), pointer.getName());
        assertEquals("*", pointer.getPropertyName());
    }

    @Test
    public void testSetPropertyName() {
        pointer.setPropertyName("foo");
        assertEquals("foo", pointer.getPropertyName());
    }

    @Test
    public void testSetNameAttributeValueEscapes() {
        pointer.setNameAttributeValue("it's \"quoted\"");
        assertEquals("it's \"quoted\"", pointer.getNameAttributeValue());
        assertTrue(pointer.asPath().contains("&apos;"));
        assertTrue(pointer.asPath().contains("&quot;"));
    }

    @Test
    public void testBasicMethods() {
        pointer.setPropertyIndex(0);
        assertEquals(0, pointer.getLength());
        assertNull(pointer.getBaseValue());
        assertNull(pointer.getImmediateNode());
        assertTrue(pointer.isLeaf());
        assertFalse(pointer.isActual());
        assertTrue(pointer.isContainer());
        assertEquals(0, pointer.getPropertyCount());
        assertArrayEquals(new String[0], pointer.getPropertyNames());
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testValuePointer() {
        pointer.setPropertyName("name");
        NodePointer vp = pointer.getValuePointer();
        assertNotNull(vp);
        assertEquals("name", vp.getName().getName());
    }

    @Test
    public void testSetValueThrowsWhenParentContainer() {
        try {
            pointer.setValue("val");
            fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            // expected
        }
    }

    @Test
    public void testCreatePathWithNonPropertyParent() throws Exception {
        NodePointer np = new NullPointer(new QName("container"));
        NullPropertyPointer npp = new NullPropertyPointer(np);
        npp.setPropertyName("child");
        NodePointer result = npp.createPath(JXPathContext.newContext(new Object()));
        assertNotNull(result);
    }

    @Test
    public void testCreatePathWithValue() {
        try {
            pointer.createPath(JXPathContext.newContext(new Object()), new Object());
            fail("Expected JXPathException");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testCreateChildDelegates() {
        NodePointer p = new NullPointer(new QName("root"));
        NullPropertyPointer npp = new NullPropertyPointer(p);
        npp.setPropertyName("x");
        try {
            npp.createChild(JXPathContext.newContext(new Object()), new QName("child"), 0);
            fail("Expected JXPathException");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testCreateChildWithValueDelegates() {
        NodePointer p = new NullPointer(new QName("root"));
        NullPropertyPointer npp = new NullPropertyPointer(p);
        npp.setPropertyName("x");
        try {
            npp.createChild(JXPathContext.newContext(new Object()), new QName("child"), 0, "val");
            fail("Expected JXPathException");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testAsPathWithoutNameAttribute() {
        pointer.setPropertyName("test");
        assertTrue(pointer.asPath().contains("/test"));
    }

    @Test
    public void testAsPathWithNameAttributeNoIndex() {
        pointer.setNameAttributeValue("test");
        assertTrue(pointer.asPath().contains("[@name='test']"));
    }

    @Test
    public void testAsPathWithNameAttributeIndex() {
        pointer.setNameAttributeValue("it's");
        String path = pointer.asPath();
        assertTrue(path.contains("[@name='it&apos;s']"));
    }

    @Test
    public void testGetLength() {
        assertEquals(0, pointer.getLength());
    }

    @Test
    public void testGetBaseValue() {
        assertNull(pointer.getBaseValue());
    }

    @Test
    public void testGetImmediateNode() {
        assertNull(pointer.getImmediateNode());
    }

    @Test
    public void testIsLeaf() {
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsActual() {
        assertFalse(pointer.isActual());
    }

    @Test
    public void testIsContainer() {
        assertTrue(pointer.isContainer());
    }

    @Test
    public void testIsCollectionNumber() {
        assertFalse(pointer.isCollection());
        pointer.setIndex(0);
        assertTrue(pointer.isCollection());
    }

    @Test
    public void testGetPropertyCount() {
        assertEquals(0, pointer.getPropertyCount());
    }

    @Test
    public void testEscapeSingleQuote() throws Exception {
        pointer.setNameAttributeValue("a'b");
        String path = pointer.asPath();
        assertTrue(path.contains("a&apos;b"));
    }

    @Test
    public void testEscapeDoubleQuote() throws Exception {
        pointer.setNameAttributeValue("a\"b");
        String path = pointer.asPath();
        assertTrue(path.contains("a&quot;b"));
    }

    @Test
    public void testDoubleEscape() throws Exception {
        pointer.setNameAttributeValue("'\"");
        String path = pointer.asPath();
        assertTrue(path.contains("&apos;&quot;"));
    }

    @Test
    public void testSetValueWhenParentNotContainer() throws Exception {
        NodePointer parent2 = new PropertyOwnerPointer() {
            @Override
            public QName getName() {
                return new QName("test");
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
            public boolean isLeaf() {
                return false;
            }
            @Override
            public boolean isContainer() {
                return false;
            }
            @Override
            public NodePointer getValuePointer() {
                return new NullPointer(new QName("test"));
            }
            @Override
            protected NodePointer getImmediateParentPointer() {
                return null;
            }
            @Override
            public boolean isActual() {
                return false;
            }
            @Override
            public int hashCode() {
                return 0;
            }
            @Override
            public boolean equals(Object o) {
                return false;
            }
            @Override
            public String toString() {
                return "TestParent";
            }
            @Override
            public void setValue(Object value) {
                throw new UnsupportedOperationException();
            }
            @Override
            public boolean isCollection() {
                return false;
            }
            @Override
            public boolean isActualProperty() {
                return false;
            }
            public boolean isDynamicPropertyDeclarationSupported() {
                return false;
            }
            @Override
            public PropertyPointer getPropertyPointer() {
                return new PropertyPointer(this) {
                    @Override
                    public QName getName() {
                        return new QName("prop");
                    }
                    @Override
                    public void setPropertyIndex(int index) {
                    }
                    @Override
                    public int getLength() {
                        return 0;
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
                    public boolean isLeaf() {
                        return false;
                    }
                    @Override
                    protected boolean isActualProperty() {
                        return false;
                    }
                    @Override
                    public int getPropertyCount() {
                        return 0;
                    }
                    @Override
                    public String[] getPropertyNames() {
                        return new String[0];
                    }
                    @Override
                    public String asPath() {
                        return "/test/";
                    }
                    @Override
                    public boolean isContainer() {
                        return false;
                    }
                    @Override
                    public void setValue(Object value) {
                    }
                    @Override
                    public Object getImmediateParent() {
                        return null;
                    }
                    @Override
                    protected Object getImmediateParentNode() {
                        return null;
                    }
                };
            }
            @Override
            public String getPropertyName() {
                return "prop";
            }
            @Override
            public void setPropertyName(String name) {
            }
            @Override
            public int getIndex() {
                return 0;
            }
            @Override
            public void setIndex(int index) {
            }
            @Override
            public int getWholeCollection() {
                return 0;
            }
            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index, Object value) {
                return null;
            }
            @Override
            public NodePointer createChild(JXPathContext context, QName name, int index) {
                return null;
            }
            @Override
            public NodePointer createPath(JXPathContext context) {
                return null;
            }
            @Override
            public NodePointer createPath(JXPathContext context, Object value) {
                return null;
            }
            @Override
            public Object getNodeValue() {
                return null;
            }
            @Override
            public boolean isActual() {
                return false;
            }
        };
        NullPropertyPointer npp = new NullPropertyPointer(parent2);
        npp.setPropertyName("x");
        try {
            npp.setValue("val");
            fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            // expected
        }
    }
}