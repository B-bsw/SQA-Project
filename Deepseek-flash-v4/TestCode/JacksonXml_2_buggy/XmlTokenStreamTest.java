package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.codehaus.stax2.XMLStreamReader2;
import org.codehaus.stax2.ri.Stax2ReaderAdapter;
import com.fasterxml.jackson.core.JsonLocation;
import java.io.IOException;

public class XmlTokenStreamTest {

    private XmlTokenStream tokenStream;
    private XMLStreamReader2 mockReader;

    private static class MockXMLStreamReader2 extends Stax2ReaderAdapter {
        private int eventType;
        private String localName;
        private String namespaceURI;
        private String[] attrNames;
        private String[] attrValues;
        private int attrCount;
        private String textValue;
        private int nextEventIndex;
        private int[] events;
        private int currentIndex;
        private boolean hasNext;

        public MockXMLStreamReader2(int initialEventType) {
            this.eventType = initialEventType;
            this.attrCount = 0;
            this.hasNext = true;
        }

        @Override
        public int getEventType() { return eventType; }

        @Override
        public String getLocalName() { return localName; }

        @Override
        public String getNamespaceURI() { return namespaceURI; }

        @Override
        public int getAttributeCount() { return attrCount; }

        @Override
        public String getAttributeLocalName(int index) { return attrNames[index]; }

        @Override
        public String getAttributeNamespace(int index) { return namespaceURI; }

        @Override
        public String getAttributeValue(int index) { return attrValues[index]; }

        @Override
        public String getText() { return textValue; }

        @Override
        public boolean hasNext() { return hasNext; }

        @Override
        public int next() throws XMLStreamException {
            if (currentIndex < events.length) {
                eventType = events[currentIndex++];
                return eventType;
            }
            hasNext = false;
            eventType = XMLStreamConstants.END_DOCUMENT;
            return eventType;
        }

        @Override
        public void closeCompletely() throws XMLStreamException { }

        @Override
        public void close() throws XMLStreamException { }

        @Override
        public LocationInfo getLocationInfo() {
            return new LocationInfo() {
                @Override
                public XMLStreamLocation2 getCurrentLocation() { return null; }
                @Override
                public XMLStreamLocation2 getStartLocation() { return null; }
            };
        }

        public void setStartElement(String name, String ns, int attrCount, String[] attrNames, String[] attrValues) {
            this.eventType = XMLStreamConstants.START_ELEMENT;
            this.localName = name;
            this.namespaceURI = ns;
            this.attrCount = attrCount;
            this.attrNames = attrNames;
            this.attrValues = attrValues;
        }

        public void setEndElement(String name, String ns) {
            this.eventType = XMLStreamConstants.END_ELEMENT;
            this.localName = name;
            this.namespaceURI = ns;
        }

        public void setText(String text) {
            this.eventType = XMLStreamConstants.CHARACTERS;
            this.textValue = text;
        }

        public void setEvents(int[] eventTypes) {
            this.events = eventTypes;
            this.currentIndex = 0;
        }
    }

    @Before
    public void setUp() {
        mockReader = new MockXMLStreamReader2(XMLStreamConstants.START_ELEMENT);
        tokenStream = new XmlTokenStream(mockReader, this);
    }

    @After
    public void tearDown() {
        tokenStream = null;
        mockReader = null;
    }

    @Test
    public void testConstructorWithInvalidState() {
        MockXMLStreamReader2 invalidReader = new MockXMLStreamReader2(XMLStreamConstants.END_DOCUMENT);
        try {
            new XmlTokenStream(invalidReader, this);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testInitialState() {
        assertEquals(XmlTokenStream.XML_START_ELEMENT, tokenStream.getCurrentToken());
        assertNotNull(tokenStream.getXmlReader());
    }

    @Test
    public void testNextWithAttributeNames() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 2, new String[]{"attr1", "attr2"}, new String[]{"val1", "val2"});
        tokenStream = new XmlTokenStream(reader, this);

        int token = tokenStream.next();
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, token);
        assertEquals("attr1", tokenStream.getLocalName());
        assertEquals("val1", tokenStream.getText());

        token = tokenStream.next();
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, token);
        assertEquals("val1", tokenStream.getText());
    }

    @Test
    public void testNextWithTextThenEndElement() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        reader.setText("text content");
        reader.setEvents(new int[]{XMLStreamConstants.CHARACTERS, XMLStreamConstants.END_ELEMENT});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.next(); // skip attribute handling (none)

        int token = tokenStream.next();
        assertEquals(XmlTokenStream.XML_TEXT, token);
        assertEquals("text content", tokenStream.getText());
    }

    @Test
    public void testNextWithDirectEndElement() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        reader.setEndElement("root", "ns");
        reader.setEvents(new int[]{XMLStreamConstants.END_ELEMENT});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.next(); // skip attribute handling

        int token = tokenStream.next();
        assertEquals(XmlTokenStream.XML_END_ELEMENT, token);
    }

    @Test
    public void testNextReachEnd() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        reader.setEvents(new int[]{XMLStreamConstants.END_DOCUMENT});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.next(); // skip attribute handling

        int token = tokenStream.next();
        assertEquals(XmlTokenStream.XML_END, token);
    }

    @Test
    public void testRepeatStartElement() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        reader.setEndElement("root", "ns");
        reader.setEvents(new int[]{XMLStreamConstants.END_ELEMENT});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.repeatStartElement();

        int token = tokenStream.next();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, token);
    }

    @Test
    public void testRepeatStartElementInvalidState() {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        reader.setEvents(new int[]{XMLStreamConstants.CHARACTERS, XMLStreamConstants.END_ELEMENT});

        tokenStream = new XmlTokenStream(reader, this);
        try {
            tokenStream.repeatStartElement();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testSkipAttributes() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 2, new String[]{"a", "b"}, new String[]{"1", "2"});
        reader.setEvents(new int[]{XMLStreamConstants.CHARACTERS, XMLStreamConstants.END_ELEMENT});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.skipAttributes();

        int token = tokenStream.next();
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, token);
    }

    @Test
    public void testSkipAttributesWhenCurrentStateNotStart() {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        reader.setText("text");
        reader.setEvents(new int[]{XMLStreamConstants.CHARACTERS});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.next(); // move to text state
        try {
            tokenStream.skipAttributes();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testConvertToString() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 2, new String[]{"a"}, new String[]{"1"});
        reader.setText(null);
        reader.setEvents(new int[]{XMLStreamConstants.CHARACTERS, XMLStreamConstants.END_ELEMENT});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.next(); // attribute name

        String result = tokenStream.convertToString();
        assertNotNull(result);
    }

    @Test
    public void testGetCurrentLocation() {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        tokenStream = new XmlTokenStream(reader, this);
        JsonLocation loc = tokenStream.getCurrentLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetTokenLocation() {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        tokenStream = new XmlTokenStream(reader, this);
        JsonLocation loc = tokenStream.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testCloseCompletely() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.closeCompletely();
    }

    @Test
    public void testClose() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.close();
    }

    @Test
    public void testHasAttributes() {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 2, new String[]{"a", "b"}, new String[]{"1", "2"});
        tokenStream = new XmlTokenStream(reader, this);
        assertTrue(tokenStream.hasAttributes());
    }

    @Test
    public void testHasNoAttributes() {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        tokenStream = new XmlTokenStream(reader, this);
        assertFalse(tokenStream.hasAttributes());
    }

    @Test
    public void testSkipEndElement() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        reader.setEndElement("root", "ns");
        reader.setEvents(new int[]{XMLStreamConstants.END_ELEMENT});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.skipEndElement();
    }

    @Test
    public void testSkipEndElementWithWrongToken() throws IOException {
        MockXMLStreamReader2 reader = (MockXMLStreamReader2) mockReader;
        reader.setStartElement("root", "ns", 0, new String[]{}, new String[]{});
        reader.setText("text");
        reader.setEvents(new int[]{XMLStreamConstants.CHARACTERS});

        tokenStream = new XmlTokenStream(reader, this);
        tokenStream.next();
        try {
            tokenStream.skipEndElement();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }
}