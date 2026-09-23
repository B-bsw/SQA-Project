package com.fasterxml.jackson.databind.ser.impl;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

public class WritableObjectIdTest {

    private static class SimpleIdGenerator extends ObjectIdGenerators.StringIdGenerator {
        private static final long serialVersionUID = 1L;
        int counter = 0;
        @Override
        public Object generateId(Object forPojo) {
            return "id" + (++counter);
        }
    }

    private static class ObjectIdWriterStub extends ObjectIdWriter {
        public boolean alwaysAsId;
        public Object lastSerializedId;
        public JsonGenerator lastGen;

        public ObjectIdWriterStub(boolean alwaysAsId) {
            super("id", null, null, false);
            this.alwaysAsId = alwaysAsId;
        }

        @Override
        public void serialize(Object id, JsonGenerator gen, SerializerProvider provider) throws IOException {
            lastSerializedId = id;
            lastGen = gen;
        }
    }

    private static class JsonGeneratorStub extends JsonGenerator {
        boolean canWriteObjectIdValue = false;
        boolean writeObjectIdCalled = false;
        boolean writeObjectRefCalled = false;
        String lastObjectRefValue;
        Object lastObjectIdValue;
        String lastFieldName;

        @Override
        public boolean canWriteObjectId() {
            return canWriteObjectIdValue;
        }

        @Override
        public void writeObjectId(Object id) throws IOException {
            writeObjectIdCalled = true;
            lastObjectIdValue = id;
        }

        @Override
        public void writeObjectRef(Object referenced) throws IOException {
            writeObjectRefCalled = true;
            lastObjectRefValue = (String) referenced;
        }

        @Override
        public void writeFieldName(SerializableString name) throws IOException {
            lastFieldName = name.getValue();
        }

        @Override public void writeStartArray() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeFieldName(String name) throws IOException {}
        @Override public void writeString(String text) throws IOException {}
        @Override public void writeString(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeRaw(String text) throws IOException {}
        @Override public void writeRaw(String text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char c) throws IOException {}
        @Override public void writeBinary(byte[] data, int offset, int len) throws IOException {}
        @Override public void writeNumber(int v) throws IOException {}
        @Override public void writeNumber(long v) throws IOException {}
        @Override public void writeNumber(double v) throws IOException {}
        @Override public void writeNumber(float v) throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeNull() throws IOException {}
        @Override public void writeObject(Object pojo) throws IOException {}
        @Override public int getOutputBuffered() { return 0; }
        @Override public void flush() throws IOException {}
        @Override public void close() throws IOException {}
    }

    @Test
    public void testWriteAsIdWithNullIdReturnsFalse() throws IOException {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        JsonGeneratorStub jgen = new JsonGeneratorStub();
        ObjectIdWriterStub w = new ObjectIdWriterStub(false);
        assertFalse(oid.writeAsId(jgen, null, w));
    }

    @Test
    public void testWriteAsIdIdWrittenTrueAndCanWriteObjectId() throws IOException {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        oid.id = "testId";
        oid.idWritten = true;
        JsonGeneratorStub jgen = new JsonGeneratorStub();
        jgen.canWriteObjectIdValue = true;
        ObjectIdWriterStub w = new ObjectIdWriterStub(false);
        assertTrue(oid.writeAsId(jgen, null, w));
        assertTrue(jgen.writeObjectRefCalled);
        assertEquals("testId", jgen.lastObjectRefValue);
    }

    @Test
    public void testWriteAsIdIdWrittenTrueAndCannotWriteObjectId() throws IOException {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        oid.id = "testId";
        oid.idWritten = true;
        JsonGeneratorStub jgen = new JsonGeneratorStub();
        jgen.canWriteObjectIdValue = false;
        ObjectIdWriterStub w = new ObjectIdWriterStub(false);
        assertTrue(oid.writeAsId(jgen, null, w));
        assertEquals("testId", w.lastSerializedId);
    }

    @Test
    public void testWriteAsIdAlwaysAsIdTrueAndIdNotNull() throws IOException {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        oid.id = "myId";
        oid.idWritten = false;
        JsonGeneratorStub jgen = new JsonGeneratorStub();
        jgen.canWriteObjectIdValue = false;
        ObjectIdWriterStub w = new ObjectIdWriterStub(true);
        assertTrue(oid.writeAsId(jgen, null, w));
        assertEquals("myId", w.lastSerializedId);
    }

    @Test
    public void testWriteAsFieldCanWriteObjectId() throws IOException {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        oid.id = "fieldId";
        JsonGeneratorStub jgen = new JsonGeneratorStub();
        jgen.canWriteObjectIdValue = true;
        ObjectIdWriterStub w = new ObjectIdWriterStub(false);
        oid.writeAsField(jgen, null, w);
        assertTrue(oid.idWritten);
        assertTrue(jgen.writeObjectIdCalled);
        assertEquals("fieldId", jgen.lastObjectIdValue);
    }

    @Test
    public void testWriteAsFieldCannotWriteObjectIdPropertyNameNonNull() throws IOException {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        oid.id = "fieldId";
        JsonGeneratorStub jgen = new JsonGeneratorStub();
        jgen.canWriteObjectIdValue = false;
        ObjectIdWriterStub w = new ObjectIdWriterStub(false);
        w.propertyName = new SerializableString() {
            @Override public String getValue() { return "@id"; }
            @Override public int charLength() { return 3; }
            @Override public char[] asQuotedChars() { return "@id".toCharArray(); }
            @Override public byte[] asUnquotedUTF8() { return "@id".getBytes(); }
            @Override public byte[] asQuotedUTF8() { return "@id".getBytes(); }
        };
        oid.writeAsField(jgen, null, w);
        assertEquals("@id", jgen.lastFieldName);
        assertEquals("fieldId", w.lastSerializedId);
    }

    @Test
    public void testWriteAsFieldCannotWriteObjectIdPropertyNameNull() throws IOException {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        oid.id = "fieldId";
        JsonGeneratorStub jgen = new JsonGeneratorStub();
        jgen.canWriteObjectIdValue = false;
        ObjectIdWriterStub w = new ObjectIdWriterStub(false);
        w.propertyName = null;
        oid.writeAsField(jgen, null, w);
        assertNull(jgen.lastFieldName);
        assertNull(w.lastSerializedId);
    }

    @Test
    public void testGenerateId() {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        Object id1 = oid.generateId("pojo1");
        assertNotNull(id1);
        assertEquals("id1", id1);
        Object id2 = oid.generateId("pojo2");
        assertEquals("id2", id2);
        assertEquals(id2, oid.id);
    }

    @Test
    public void testConstructorSetsGenerator() {
        SimpleIdGenerator gen = new SimpleIdGenerator();
        WritableObjectId oid = new WritableObjectId(gen);
        assertSame(gen, oid.generator);
        assertNull(oid.id);
        assertFalse(oid.idWritten);
    }
}