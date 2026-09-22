package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Comprehensive Unit Tests for {@link BeanPropertyWriter}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class BeanPropertyWriterTest {

    // Test POJOs for serialization verification
    public static class SimpleBean {
        private String name;
        private int count;

        public SimpleBean(String name, int count) {
            this.name = name;
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public int getCount() {
            return count;
        }
    }

    public static class AnnotatedBean {
        @JsonProperty("custom_name")
        private String originalName;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String optionalField;

        public AnnotatedBean(String originalName, String optionalField) {
            this.originalName = originalName;
            this.optionalField = optionalField;
        }

        public String getOriginalName() {
            return originalName;
        }

        public String getOptionalField() {
            return optionalField;
        }
    }

    public static class InnerAddress {
        public String city;
        public String street;

        public InnerAddress(String city, String street) {
            this.city = city;
            this.street = street;
        }
    }

    public static class OuterUser {
        public String username;

        @JsonUnwrapped
        public InnerAddress address;

        public OuterUser(String username, InnerAddress address) {
            this.username = username;
            this.address = address;
        }
    }

    @Test
    public void serializeAsField_givenSimpleBean_shouldSerializeProperties() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = new SimpleBean("Tester", 100);

        // Act
        String json = mapper.writeValueAsString(bean);

        // Assert
        assertTrue(json.contains("\"name\":\"Tester\""));
        assertTrue(json.contains("\"count\":100"));
    }

    @Test
    public void serializeAsField_givenCustomPropertyAndNonNullFilter_shouldApplyRules() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedBean beanWithNull = new AnnotatedBean("Jackson", null);
        AnnotatedBean beanWithValue = new AnnotatedBean("Jackson", "present");

        // Act
        String jsonWithNull = mapper.writeValueAsString(beanWithNull);
        String jsonWithValue = mapper.writeValueAsString(beanWithValue);

        // Assert
        assertTrue(jsonWithNull.contains("\"custom_name\":\"Jackson\""));
        assertFalse(jsonWithNull.contains("optionalField"));

        assertTrue(jsonWithValue.contains("\"custom_name\":\"Jackson\""));
        assertTrue(jsonWithValue.contains("\"optionalField\":\"present\""));
    }

    @Test
    public void unwrappingWriter_givenUnwrappedProperty_shouldInlineFields() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        InnerAddress addr = new InnerAddress("Tokyo", "Shibuya");
        OuterUser user = new OuterUser("alice", addr);

        // Act
        String json = mapper.writeValueAsString(user);

        // Assert
        assertTrue(json.contains("\"username\":\"alice\""));
        assertTrue(json.contains("\"city\":\"Tokyo\""));
        assertTrue(json.contains("\"street\":\"Shibuya\""));
        assertFalse(json.contains("address"));
    }
}
