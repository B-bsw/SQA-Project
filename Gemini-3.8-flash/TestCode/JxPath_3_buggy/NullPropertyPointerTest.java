package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class NullPropertyPointerTest {

    // ==========================================
    // Test Stub Classes
    // ==========================================

    private static class StubNodePointer extends NodePointer {
        private boolean container = false;
        private NodePointer createPathReturn;
        private QName createdAttributeName;
        private Object createdAttributeValue;
        private QName createdChildName;
        private int createdChildIndex;
        private Object createdChildValue;

        StubNodePointer(NodePointer parent) {
            super(parent);
        }

        StubNodePointer(NodePointer parent, Locale locale) {
            super(parent, locale);
        }

        public void setContainer(boolean container) {
            this.container = container;
        }

        public void setCreatePathReturn(NodePointer createPathReturn) {
            this.createPathReturn = createPathReturn;
        }

        public QName getCreatedAttributeName() {
            return createdAttributeName;
        }

        public Object getCreatedAttributeValue() {
            return createdAttributeValue;
        }

        public QName getCreatedChildName() {
            return createdChildName;
        }

        public int getCreatedChildIndex() {
            return createdChildIndex;
        }

        public Object getCreatedChildValue() {
            return createdChildValue;
        }

        public boolean isContainer() {
            return container;
        }

        public NodePointer createPath(JXPathContext context) {
            return createPathReturn != null ? createPathReturn : this;
        }

        public NodePointer createAttribute(JXPathContext context, QName name) {
            this.createdAttributeName = name;
            return new StubNodePointer(this);
        }

        public NodePointer createChild(JXPathContext context, QName name, int index) {
            this.createdChildName = name;
            this.createdChildIndex = index;
            return new StubNodePointer(this);
        }

        public NodePointer createChild(JXPathContext context, QName name, int index, Object value) {
            this.createdChildName = name;
            this.createdChildIndex = index;
            this.createdChildValue = value;
            return new StubNodePointer(this);
        }

        public String asPath() {
            return "/mockNode";
        }

        public boolean isCollection() {
            return false;
        }

        public int getLength() {
            return 1;
        }

        public QName getName() {
            return new QName("mockNode");
        }

        public Object getBaseValue() {
            return null;
        }

        public Object getImmediateNode() {
            return null;
        }

        public void setValue(Object value) {
            this.createdAttributeValue = value;
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }
    }

    private static class StubPropertyPointer extends PropertyPointer {
        private String propName;
        private Object val;
        private int count = 0;

        StubPropertyPointer(NodePointer parent) {
            super(parent);
        }

        public int getPropertyCount() {
            return count;
        }

        public String[] getPropertyNames() {
            return new String[] { propName };
        }

        public String getPropertyName() {
            return propName;
        }

        public void setPropertyName(String propertyName) {
            this.propName = propertyName;
        }

        public void setPropertyIndex(int index) {
        }

        public Object getBaseValue() {
            return val;
        }

        public Object getImmediateNode() {
            return val;
        }

        public boolean isActualProperty() {
            return true;
        }

        public boolean isCollection() {
            return false;
        }

        public int getLength() {
            return 1;
        }

        public QName getName() {
            return new QName(propName);
        }

        public void setValue(Object value) {
            this.val = value;
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        public NodePointer createChild(JXPathContext context, QName name, int index) {
            StubNodePointer child = new StubNodePointer(this);
            child.createChild(context, name, index);
            return child;
        }

        public NodePointer createChild(JXPathContext context, QName name, int index, Object value) {
            StubNodePointer child = new StubNodePointer(this);
            child.createChild(context, name, index, value);
            return child;
        }
    }

    private static class StubPropertyOwnerPointer extends PropertyOwnerPointer {
        private boolean dynamicPropertySupported = false;
        private boolean container = false;
        private PropertyPointer propertyPointer;
        private NodePointer createPathReturn;

        StubPropertyOwnerPointer(NodePointer parent) {
            super(parent);
            this.propertyPointer = new StubPropertyPointer(this);
        }

        public void setDynamicPropertySupported(boolean supported) {
            this.dynamicPropertySupported = supported;
        }

        public void setContainer(boolean container) {
            this.container = container;
        }

        public void setCreatePathReturn(NodePointer pointer) {
            this.createPathReturn = pointer;
        }

        public void setPropertyPointer(PropertyPointer propertyPointer) {
            this.propertyPointer = propertyPointer;
        }

        public boolean isDynamicPropertyDeclarationSupported() {
            return dynamicPropertySupported;
        }

        public PropertyPointer getPropertyPointer() {
            return propertyPointer;
        }

        public boolean isContainer() {
            return container;
        }

        public NodePointer createPath(JXPathContext context) {
            return createPathReturn != null ? createPathReturn : this;
        }

        public boolean isCollection() {
            return false;
        }

        public int getLength() {
            return 1;
        }

        public QName getName() {
            return new QName("mockPropertyOwner");
        }

        public Object getBaseValue() {
            return null;
        }

        public Object getImmediateNode() {
            return null;
        }

        public void setValue(Object value) {
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        public String asPath() {
            return "/mockPropertyOwner";
        }
    }

    // ==========================================
    // Phase 1 & 2: Complete Test Suite Implementation
    // ==========================================

    @Test
    public void getName_givenDefaultConstructor_shouldReturnStarName() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act
        QName name = npp.getName();

        // Assert
        Assert.assertNotNull(name);
        Assert.assertEquals("*", name.getName());
    }

    @Test
    public void getName_givenCustomPropertyName_shouldReturnSpecifiedName() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setPropertyName("customProp");

        // Act
        QName name = npp.getName();

        // Assert
        Assert.assertNotNull(name);
        Assert.assertEquals("customProp", name.getName());
        Assert.assertEquals("customProp", npp.getPropertyName());
    }

    @Test
    public void setPropertyIndex_givenAnyIndex_shouldExecuteWithoutException() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        npp.setPropertyIndex(0);
        npp.setPropertyIndex(99);
        npp.setPropertyIndex(-1);
    }

    @Test
    public void getLength_givenAnyScenario_shouldReturnZero() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        Assert.assertEquals(0, npp.getLength());
    }

    @Test
    public void getBaseValue_givenAnyScenario_shouldReturnNull() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        Assert.assertNull(npp.getBaseValue());
    }

    @Test
    public void getImmediateNode_givenAnyScenario_shouldReturnNull() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        Assert.assertNull(npp.getImmediateNode());
    }

    @Test
    public void isLeaf_givenAnyScenario_shouldReturnTrue() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        Assert.assertTrue(npp.isLeaf());
    }

    @Test
    public void getValuePointer_givenProperty_shouldReturnNullPointerWithMatchingName() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setPropertyName("fieldA");

        // Act
        NodePointer valuePointer = npp.getValuePointer();

        // Assert
        Assert.assertNotNull(valuePointer);
        Assert.assertTrue(valuePointer instanceof NullPointer);
        Assert.assertEquals("fieldA", valuePointer.getName().getName());
    }

    @Test
    public void isActualProperty_givenAnyScenario_shouldReturnFalse() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        Assert.assertFalse(npp.isActualProperty());
    }

    @Test
    public void isActual_givenAnyScenario_shouldReturnFalse() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        Assert.assertFalse(npp.isActual());
    }

    @Test
    public void isContainer_givenAnyScenario_shouldReturnTrue() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        Assert.assertTrue(npp.isContainer());
    }

    @Test
    public void setValue_givenNullParent_shouldThrowJXPathInvalidAccessException() {
        // Arrange
        NullPropertyPointer npp = new NullPropertyPointer(null);

        // Act & Assert
        try {
            npp.setValue("testValue");
            Assert.fail("Expected JXPathInvalidAccessException when parent is null");
        }
        catch (JXPathInvalidAccessException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("the target object is null") != -1);
        }
    }

    @Test
    public void setValue_givenParentIsContainer_shouldThrowJXPathInvalidAccessException() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        parent.setContainer(true);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        try {
            npp.setValue("testValue");
            Assert.fail("Expected JXPathInvalidAccessException when parent.isContainer() is true");
        }
        catch (JXPathInvalidAccessException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("the target object is null") != -1);
        }
    }

    @Test
    public void setValue_givenParentSupportsDynamicPropertyDeclaration_shouldSetPropertyValue() {
        // Arrange
        StubPropertyOwnerPointer parent = new StubPropertyOwnerPointer(null);
        parent.setDynamicPropertySupported(true);
        StubPropertyPointer propertyPointer = new StubPropertyPointer(parent);
        parent.setPropertyPointer(propertyPointer);

        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setPropertyName("dynamicField");

        // Act
        npp.setValue("dynamicValue");

        // Assert
        Assert.assertEquals("dynamicField", propertyPointer.getPropertyName());
        Assert.assertEquals("dynamicValue", propertyPointer.getBaseValue());
    }

    @Test
    public void setValue_givenParentPropertyOwnerDoesNotSupportDynamic_shouldThrowJXPathInvalidAccessException() {
        // Arrange
        StubPropertyOwnerPointer parent = new StubPropertyOwnerPointer(null);
        parent.setDynamicPropertySupported(false);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setPropertyName("staticField");

        // Act & Assert
        try {
            npp.setValue("testValue");
            Assert.fail("Expected JXPathInvalidAccessException when dynamic property is unsupported");
        }
        catch (JXPathInvalidAccessException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("path does not match a changeable location") != -1);
        }
    }

    @Test
    public void setValue_givenParentNotPropertyOwnerAndNotContainer_shouldThrowJXPathInvalidAccessException() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        parent.setContainer(false);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        try {
            npp.setValue("testValue");
            Assert.fail("Expected JXPathInvalidAccessException when parent is not PropertyOwnerPointer");
        }
        catch (JXPathInvalidAccessException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("path does not match a changeable location") != -1);
        }
    }

    @Test
    public void createPath_givenAttributeTrue_shouldCreateAttributeOnParent() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setAttribute(true);
        npp.setPropertyName("attr1");
        JXPathContext context = JXPathContext.newContext(new Object());

        // Act
        NodePointer result = npp.createPath(context);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotNull(parent.getCreatedAttributeName());
        Assert.assertEquals("attr1", parent.getCreatedAttributeName().getName());
    }

    @Test
    public void createPath_givenAttributeFalseAndParentIsPropertyOwner_shouldUnwrapAndCreateChild() {
        // Arrange
        StubPropertyOwnerPointer parent = new StubPropertyOwnerPointer(null);
        StubPropertyPointer propPointer = new StubPropertyPointer(parent);
        parent.setPropertyPointer(propPointer);

        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setAttribute(false);
        npp.setPropertyName("childProp");
        npp.setIndex(2);
        JXPathContext context = JXPathContext.newContext(new Object());

        // Act
        NodePointer result = npp.createPath(context);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof StubNodePointer);
        StubNodePointer stubChild = (StubNodePointer) result;
        Assert.assertEquals("childProp", stubChild.getCreatedChildName().getName());
        Assert.assertEquals(2, stubChild.getCreatedChildIndex());
    }

    @Test
    public void createPath_givenAttributeFalseAndParentNotPropertyOwner_shouldDirectlyCreateChild() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setAttribute(false);
        npp.setPropertyName("childProp2");
        npp.setIndex(0);
        JXPathContext context = JXPathContext.newContext(new Object());

        // Act
        NodePointer result = npp.createPath(context);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("childProp2", parent.getCreatedChildName().getName());
        Assert.assertEquals(0, parent.getCreatedChildIndex());
    }

    @Test
    public void createPathWithValue_givenAttributeTrue_shouldCreateAttributeAndSetValue() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setAttribute(true);
        npp.setPropertyName("attrWithValue");
        JXPathContext context = JXPathContext.newContext(new Object());

        // Act
        NodePointer result = npp.createPath(context, "attrContent");

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("attrWithValue", parent.getCreatedAttributeName().getName());
        Assert.assertTrue(result instanceof StubNodePointer);
        Assert.assertEquals("attrContent", ((StubNodePointer) result).getCreatedAttributeValue());
    }

    @Test
    public void createPathWithValue_givenAttributeFalseAndParentIsPropertyOwner_shouldUnwrapAndCreateChildWithValue() {
        // Arrange
        StubPropertyOwnerPointer parent = new StubPropertyOwnerPointer(null);
        StubPropertyPointer propPointer = new StubPropertyPointer(parent);
        parent.setPropertyPointer(propPointer);

        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setAttribute(false);
        npp.setPropertyName("elemProp");
        npp.setIndex(1);
        JXPathContext context = JXPathContext.newContext(new Object());

        // Act
        NodePointer result = npp.createPath(context, "elemValue");

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof StubNodePointer);
        StubNodePointer stubChild = (StubNodePointer) result;
        Assert.assertEquals("elemProp", stubChild.getCreatedChildName().getName());
        Assert.assertEquals(1, stubChild.getCreatedChildIndex());
        Assert.assertEquals("elemValue", stubChild.getCreatedChildValue());
    }

    @Test
    public void createPathWithValue_givenAttributeFalseAndParentNotPropertyOwner_shouldDirectlyCreateChildWithValue() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setAttribute(false);
        npp.setPropertyName("directElem");
        npp.setIndex(3);
        JXPathContext context = JXPathContext.newContext(new Object());

        // Act
        NodePointer result = npp.createPath(context, "directVal");

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("directElem", parent.getCreatedChildName().getName());
        Assert.assertEquals(3, parent.getCreatedChildIndex());
        Assert.assertEquals("directVal", parent.getCreatedChildValue());
    }

    @Test
    public void createChild_withoutValue_shouldDelegateToCreatePath() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setPropertyName("parentField");
        JXPathContext context = JXPathContext.newContext(new Object());
        QName childQName = new QName("subChild");

        // Act
        NodePointer result = npp.createChild(context, childQName, 2);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof StubNodePointer);
        StubNodePointer stubResult = (StubNodePointer) result;
        Assert.assertEquals("subChild", stubResult.getCreatedChildName().getName());
        Assert.assertEquals(2, stubResult.getCreatedChildIndex());
    }

    @Test
    public void createChild_withValue_shouldDelegateToCreatePath() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setPropertyName("parentField2");
        JXPathContext context = JXPathContext.newContext(new Object());
        QName childQName = new QName("subChildVal");

        // Act
        NodePointer result = npp.createChild(context, childQName, 0, "childData");

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof StubNodePointer);
        StubNodePointer stubResult = (StubNodePointer) result;
        Assert.assertEquals("subChildVal", stubResult.getCreatedChildName().getName());
        Assert.assertEquals(0, stubResult.getCreatedChildIndex());
        Assert.assertEquals("childData", stubResult.getCreatedChildValue());
    }

    @Test
    public void isCollection_givenWholeCollection_shouldReturnFalse() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setIndex(NodePointer.WHOLE_COLLECTION);

        // Act & Assert
        Assert.assertFalse(npp.isCollection());
    }

    @Test
    public void isCollection_givenValidIndex_shouldReturnTrue() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setIndex(0);

        // Act & Assert
        Assert.assertTrue(npp.isCollection());

        npp.setIndex(5);
        Assert.assertTrue(npp.isCollection());
    }

    @Test
    public void getPropertyCount_givenAnyScenario_shouldReturnZero() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert
        Assert.assertEquals(0, npp.getPropertyCount());
    }

    @Test
    public void getPropertyNames_givenAnyScenario_shouldReturnEmptyArray() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act
        String[] names = npp.getPropertyNames();

        // Assert
        Assert.assertNotNull(names);
        Assert.assertEquals(0, names.length);
    }

    @Test
    public void asPath_givenByNameAttributeFalse_shouldCallSuperAsPath() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setPropertyName("simpleProp");

        // Act
        String path = npp.asPath();

        // Assert
        Assert.assertNotNull(path);
        Assert.assertTrue(path.startsWith("/mockNode"));
    }

    @Test
    public void asPath_givenByNameAttributeTrueAndWholeCollection_shouldFormatAttributePredicate() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setNameAttributeValue("item");
        npp.setIndex(NodePointer.WHOLE_COLLECTION);

        // Act
        String path = npp.asPath();

        // Assert
        Assert.assertEquals("/mockNode[@name='item']", path);
    }

    @Test
    public void asPath_givenByNameAttributeTrueAndSpecificIndex_shouldFormatPredicateWithOneBasedIndex() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setNameAttributeValue("item");
        npp.setIndex(0); // 0-based -> 1-based index is 1

        // Act
        String path = npp.asPath();

        // Assert
        Assert.assertEquals("/mockNode[@name='item'][1]", path);

        npp.setIndex(4); // 0-based -> 1-based index is 5
        Assert.assertEquals("/mockNode[@name='item'][5]", npp.asPath());
    }

    @Test
    public void asPath_givenQuotesInNameAttribute_shouldEscapeQuotesCorrectly() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);

        // Act & Assert - Single quotes
        npp.setNameAttributeValue("it'em's");
        Assert.assertEquals("/mockNode[@name='it&apos;em&apos;s']", npp.asPath());

        // Act & Assert - Double quotes
        npp.setNameAttributeValue("it\"em\"s");
        Assert.assertEquals("/mockNode[@name='it&quot;em&quot;s']", npp.asPath());

        // Act & Assert - Mixed quotes
        npp.setNameAttributeValue("'mixed\"quote'");
        Assert.assertEquals("/mockNode[@name='&apos;mixed&quot;quote&apos;']", npp.asPath());
    }

    @Test
    public void asPath_givenEmptyStringInNameAttribute_shouldHandleGracefully() {
        // Arrange
        StubNodePointer parent = new StubNodePointer(null);
        NullPropertyPointer npp = new NullPropertyPointer(parent);
        npp.setNameAttributeValue("");

        // Act
        String path = npp.asPath();

        // Assert
        Assert.assertEquals("/mockNode[@name='']", path);
    }
}