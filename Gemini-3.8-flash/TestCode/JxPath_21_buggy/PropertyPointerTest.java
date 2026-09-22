package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;

/**
 * Comprehensive Unit Tests for {@link PropertyPointer}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class PropertyPointerTest {

    // Concrete stub for PropertyPointer testing
    private static class StubPropertyPointer extends PropertyPointer {
        private String propertyName = "testProp";
        private Object baseValue;
        private boolean actual = true;

        public StubPropertyPointer(NodePointer parent, Object baseValue) {
            super(parent);
            this.baseValue = baseValue;
        }

        public String getPropertyName() {
            return propertyName;
        }

        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }

        public int getPropertyCount() {
            return 1;
        }

        public String[] getPropertyNames() {
            return new String[] { propertyName };
        }

        protected boolean isActualProperty() {
            return actual;
        }

        public void setActual(boolean actual) {
            this.actual = actual;
        }

        public Object getBaseValue() {
            return baseValue;
        }

        public void setValue(Object value) {
            this.baseValue = value;
        }

        public String asPath() {
            return "/" + propertyName;
        }
    }

    public static class SampleBean {
        private String name = "DefaultName";
        private List items = new ArrayList();

        public SampleBean() {
            items.add("Item1");
            items.add("Item2");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List getItems() {
            return items;
        }
    }

    @Test
    public void getAndSetPropertyIndex_shouldUpdateIndexAndResetCollectionIndex() {
        // Arrange
        StubPropertyPointer pointer = new StubPropertyPointer(null, "value");
        pointer.setIndex(2);

        // Act
        pointer.setPropertyIndex(5);

        // Assert
        assertEquals(5, pointer.getPropertyIndex());
        assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
    }

    @Test
    public void getName_shouldReturnQNameWithPropertyName() {
        // Arrange
        StubPropertyPointer pointer = new StubPropertyPointer(null, "value");
        pointer.setPropertyName("customField");

        // Act
        QName name = pointer.getName();

        // Assert
        assertNotNull(name);
        assertEquals("customField", name.getName());
    }

    @Test
    public void isActual_givenActualAndNonActual_shouldReflectState() {
        // Arrange
        StubPropertyPointer pointer = new StubPropertyPointer(null, "value");

        // Act & Assert
        pointer.setActual(true);
        assertTrue(pointer.isActual());

        pointer.setActual(false);
        assertFalse(pointer.isActual());
    }

    @Test
    public void isCollection_andGetLength_givenArrayAndScalar_shouldEvaluateCorrectly() {
        // Arrange
        String[] array = new String[] { "A", "B", "C" };
        StubPropertyPointer arrayPointer = new StubPropertyPointer(null, array);
        StubPropertyPointer scalarPointer = new StubPropertyPointer(null, "single");

        // Act & Assert
        assertTrue(arrayPointer.isCollection());
        assertEquals(3, arrayPointer.getLength());

        assertFalse(scalarPointer.isCollection());
        assertEquals(1, scalarPointer.getLength());
    }

    @Test
    public void getImmediateNode_givenWholeCollectionAndIndex_shouldExtractValue() {
        // Arrange
        String[] array = new String[] { "First", "Second" };
        StubPropertyPointer pointerWhole = new StubPropertyPointer(null, array);
        StubPropertyPointer pointerIndexed = new StubPropertyPointer(null, array);
        pointerIndexed.setIndex(1);

        // Act
        Object whole = pointerWhole.getImmediateNode();
        Object second = pointerIndexed.getImmediateNode();

        // Assert
        assertSame(array, whole);
        assertEquals("Second", second);
    }

    @Test
    public void equalsAndHashCode_givenSameAndDifferentPointers_shouldAdhereToContract() {
        // Arrange
        StubPropertyPointer p1 = new StubPropertyPointer(null, "val");
        p1.setPropertyIndex(1);
        p1.setPropertyName("p");

        StubPropertyPointer p2 = new StubPropertyPointer(null, "val");
        p2.setPropertyIndex(1);
        p2.setPropertyName("p");

        StubPropertyPointer p3 = new StubPropertyPointer(null, "val");
        p3.setPropertyIndex(2);
        p3.setPropertyName("p");

        // Act & Assert
        assertTrue(p1.equals(p1));
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("different_class"));
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void jxpathIntegration_givenJavaBean_shouldTraversePropertyPointer() {
        // Arrange
        SampleBean bean = new SampleBean();
        JXPathContext context = JXPathContext.newContext(bean);

        // Act
        String name = (String) context.getValue("name");
        String firstItem = (String) context.getValue("items[1]");

        // Assert
        assertEquals("DefaultName", name);
        assertEquals("Item1", firstItem);
    }
}
