package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream;

/**
 * Comprehensive Unit Tests for {@link XmlTokenStream}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class XmlTokenStreamTest {

    @Test
    public void streamTokens_givenSimpleXml_shouldReadStartAndEndElements() throws Exception {
        // Arrange
        String xml = "<data><child>Hello</child></data>";
        XMLInputFactory f = XMLInputFactory.newInstance();
        XMLStreamReader sr = f.createXMLStreamReader(new StringReader(xml));
        XmlTokenStream stream = new XmlTokenStream(sr, xml);

        // Act & Assert
        int token = stream.next();
        assertTrue(token == XmlTokenStream.XML_START_ELEMENT || token == XmlTokenStream.XML_ROOT_SET);
        assertEquals("data", stream.getLocalName());

        token = stream.next();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, token);
        assertEquals("child", stream.getLocalName());

        token = stream.next();
        assertEquals(XmlTokenStream.XML_TEXT, token);
        assertEquals("Hello", stream.getText());

        token = stream.next();
        assertEquals(XmlTokenStream.XML_END_ELEMENT, token);

        token = stream.next();
        assertEquals(XmlTokenStream.XML_END_ELEMENT, token);

        stream.close();
    }
}
