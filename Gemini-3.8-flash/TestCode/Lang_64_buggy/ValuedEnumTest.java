package org.apache.commons.lang.enums;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

/**
 * Comprehensive Unit Tests for {@link ValuedEnum}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ValuedEnumTest {

    public static class PriorityEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        public static final PriorityEnum LOW = new PriorityEnum("Low", 1);
        public static final PriorityEnum MEDIUM = new PriorityEnum("Medium", 2);
        public static final PriorityEnum HIGH = new PriorityEnum("High", 3);

        protected PriorityEnum(String name, int value) {
            super(name, value);
        }

        public static PriorityEnum getEnum(int value) {
            return (PriorityEnum) getEnum(PriorityEnum.class, value);
        }

        public static PriorityEnum getEnum(String name) {
            return (PriorityEnum) getEnum(PriorityEnum.class, name);
        }

        public static Map getEnumMap() {
            return getEnumMap(PriorityEnum.class);
        }

        public static List getEnumList() {
            return getEnumList(PriorityEnum.class);
        }
    }

    @Test
    public void getValueAndGetName_shouldReturnAttributes() {
        // Arrange & Act & Assert
        assertEquals(1, PriorityEnum.LOW.getValue());
        assertEquals("Low", PriorityEnum.LOW.getName());

        assertEquals(2, PriorityEnum.MEDIUM.getValue());
        assertEquals("Medium", PriorityEnum.MEDIUM.getName());

        assertEquals(3, PriorityEnum.HIGH.getValue());
        assertEquals("High", PriorityEnum.HIGH.getName());
    }

    @Test
    public void getEnum_byValueAndName_shouldLookupInstances() {
        // Arrange & Act & Assert
        assertSame(PriorityEnum.LOW, PriorityEnum.getEnum(1));
        assertSame(PriorityEnum.MEDIUM, PriorityEnum.getEnum(2));
        assertSame(PriorityEnum.HIGH, PriorityEnum.getEnum(3));
        assertNull(PriorityEnum.getEnum(99));

        assertSame(PriorityEnum.LOW, PriorityEnum.getEnum("Low"));
        assertSame(PriorityEnum.HIGH, PriorityEnum.getEnum("High"));
        assertNull(PriorityEnum.getEnum("NonExistent"));
    }

    @Test
    public void getEnumListAndMap_shouldContainAllEntries() {
        // Arrange & Act
        List list = PriorityEnum.getEnumList();
        Map map = PriorityEnum.getEnumMap();

        // Assert
        assertEquals(3, list.size());
        assertEquals(3, map.size());
        assertTrue(map.containsKey("Low"));
        assertTrue(map.containsKey("Medium"));
        assertTrue(map.containsKey("High"));
    }
}
