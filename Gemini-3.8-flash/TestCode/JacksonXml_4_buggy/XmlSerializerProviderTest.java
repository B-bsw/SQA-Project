package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Comprehensive Unit Tests for {@link XmlSerializerProvider}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class XmlSerializerProviderTest {

    public static class SimpleBean {
        public String name = "TestName";
        public int count = 99;
    }

    @Test
    public void serializeBean_shouldProduceValidXmlWithRoot() throws Exception {
        // Arrange
        XmlMapper mapper = new XmlMapper();
        SimpleBean bean = new SimpleBean();

        // Act
        String xml = mapper.writeValueAsString(bean);

        // Assert
        assertNotNull(xml);
        assertTrue(xml.contains("<SimpleBean>"));
        assertTrue(xml.contains("<name>TestName</name>"));
        assertTrue(xml.contains("<count>99</count>"));
        assertTrue(xml.contains("</SimpleBean>"));
    }
}
