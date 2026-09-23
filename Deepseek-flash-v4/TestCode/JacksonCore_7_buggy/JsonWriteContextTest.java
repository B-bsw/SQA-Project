package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class JsonWriteContextTest {

    private JsonWriteContext rootContext;
    private DupDetector dupDetector;

    @Before
    public void setUp() {
        rootContext = JsonWriteContext.createRootContext(null);
        dupDetector = new DupDetector();
    }

    @After
    public void tearDown() {
        rootContext = null;
        dupDetector = null;
    }

    @Test
    public void testCreateRootContext() {
        assertNotNull(rootContext);
        assertEquals(JsonStreamContext.TYPE_ROOT, rootContext.getType());
        assertNull(rootContext.getParent());
        assertNull(rootContext.getCurrentName());
        assertNull(rootContext.getCurrentValue());
        assertEquals(-1, rootContext.getCurrentIndex());
    }

    @Test
    public void testCreateRootContextWithDupDetector() {
        JsonWriteContext context = JsonWriteContext.createRootContext(dupDetector);
        assertNotNull(context);
        assertEquals(JsonStreamContext.TYPE_ROOT, context.getType());
        assertNotNull(context.getDupDetector());
        assertNull(context.getParent());
    }

    @Test
    public void testCreateChildArrayContext_NewChild() {
        JsonWriteContext child = rootContext.createChildArrayContext();
        assertNotNull(child);
        assertEquals(JsonStreamContext.TYPE_ARRAY, child.getType());
        assertEquals(rootContext, child.getParent());
        assertEquals(-1, child.getCurrentIndex());
    }

    @Test
    public void testCreateChildArrayContext_ReuseChild() {
        JsonWriteContext firstChild = rootContext.createChildArrayContext();
        JsonWriteContext secondChild = rootContext.createChildArrayContext();
        assertSame(firstChild, secondChild);
        assertEquals(JsonStreamContext.TYPE_ARRAY, secondChild.getType());
        assertEquals(-1, secondChild.getCurrentIndex());
    }

    @Test
    public void testCreateChildObjectContext_NewChild() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        assertNotNull(child);
        assertEquals(JsonStreamContext.TYPE_OBJECT, child.getType());
        assertEquals(rootContext, child.getParent());
        assertEquals(-1, child.getCurrentIndex());
    }

    @Test
    public void testCreateChildObjectContext_ReuseChild() {
        JsonWriteContext firstChild = rootContext.createChildObjectContext();
        JsonWriteContext secondChild = rootContext.createChildObjectContext();
        assertSame(firstChild, secondChild);
        assertEquals(JsonStreamContext.TYPE_OBJECT, secondChild.getType());
        assertEquals(-1, secondChild.getCurrentIndex());
    }

    @Test
    public void testWriteFieldName_ObjectContext_BeforeValue() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        int status = child.writeFieldName("test");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        assertEquals("test", child.getCurrentName());
    }

    @Test
    public void testWriteFieldName_ObjectContext_AfterComma() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        child.writeFieldName("first");
        child.writeValue();
        int status = child.writeFieldName("second");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
        assertEquals("second", child.getCurrentName());
    }

    @Test
    public void testWriteFieldName_DuplicateDetection() throws JsonProcessingException {
        JsonWriteContext child = rootContext.createChildObjectContext();
        child.writeFieldName("duplicate");
        child.writeValue();
        try {
            child.writeFieldName("duplicate");
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            // expected
        }
    }

    @Test
    public void testWriteValue_RootContext_First() {
        int status = rootContext.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
    }

    @Test
    public void testWriteValue_RootContext_Subsequent() {
        rootContext.writeValue();
        int status = rootContext.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, status);
    }

    @Test
    public void testWriteValue_ArrayContext_First() {
        JsonWriteContext child = rootContext.createChildArrayContext();
        int status = child.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
    }

    @Test
    public void testWriteValue_ArrayContext_Subsequent() {
        JsonWriteContext child = rootContext.createChildArrayContext();
        child.writeValue();
        int status = child.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
    }

    @Test
    public void testWriteValue_ObjectContext_AfterName() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        child.writeFieldName("name");
        int status = child.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, status);
    }

    @Test
    public void testGetCurrentValue_InitialNull() {
        assertNull(rootContext.getCurrentValue());
    }

    @Test
    public void testSetCurrentValue() {
        Object value = new Object();
        rootContext.setCurrentValue(value);
        assertSame(value, rootContext.getCurrentValue());
    }

    @Test
    public void testGetCurrentName_ObjectContext() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        assertNull(child.getCurrentName());
        child.writeFieldName("abc");
        assertEquals("abc", child.getCurrentName());
    }

    @Test
    public void testWriteFieldName_AfterValue_GotName() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        child.writeFieldName("first");
        child.writeValue();
        child.writeFieldName("second");
        int status = child.writeFieldName("third");
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, status);
    }

    @Test
    public void testResetContext_AfterReuse() {
        JsonWriteContext child = rootContext.createChildArrayContext();
        child.writeValue();
        assertEquals(0, child.getCurrentIndex());
        child.reset(JsonStreamContext.TYPE_OBJECT);
        assertEquals(-1, child.getCurrentIndex());
        assertNull(child.getCurrentName());
        assertEquals(JsonStreamContext.TYPE_OBJECT, child.getType());
    }

    @Test
    public void testWithDupDetector() {
        JsonWriteContext child = rootContext.createChildArrayContext();
        assertNull(child.getDupDetector());
        child.withDupDetector(dupDetector);
        assertSame(dupDetector, child.getDupDetector());
    }

    @Test
    public void testAppendDesc_ObjectContext() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        child.writeFieldName("test");
        StringBuilder sb = new StringBuilder();
        child.appendDesc(sb);
        assertEquals("{\"test\"}", sb.toString());
    }

    @Test
    public void testAppendDesc_ObjectContext_NoName() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        StringBuilder sb = new StringBuilder();
        child.appendDesc(sb);
        assertEquals("{?}", sb.toString());
    }

    @Test
    public void testAppendDesc_ArrayContext() {
        JsonWriteContext child = rootContext.createChildArrayContext();
        child.writeValue();
        StringBuilder sb = new StringBuilder();
        child.appendDesc(sb);
        assertEquals("[0]", sb.toString());
    }

    @Test
    public void testAppendDesc_RootContext() {
        StringBuilder sb = new StringBuilder();
        rootContext.appendDesc(sb);
        assertEquals("/", sb.toString());
    }

    @Test
    public void testToString_ObjectContext() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        child.writeFieldName("test");
        assertEquals("{\"test\"}", child.toString());
    }

    @Test
    public void testWriteFieldName_WithDupDetector() throws JsonProcessingException {
        JsonWriteContext child = rootContext.createChildObjectContext();
        child.withDupDetector(dupDetector);
        child.writeFieldName("field");
        child.writeValue();
        try {
            child.writeFieldName("field");
            fail("Expected exception");
        } catch (JsonGenerationException e) {
            // expected
        }
    }

    @Test
    public void testWriteFieldName_IndexUpdates() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        child.writeFieldName("a");
        child.writeValue();
        child.writeFieldName("b");
        child.writeValue();
        assertEquals(1, child.getCurrentIndex());
    }

    @Test
    public void testCreateChildArrayContext_WithDupDetector() {
        JsonWriteContext root = JsonWriteContext.createRootContext(dupDetector);
        JsonWriteContext child = root.createChildArrayContext();
        assertNotNull(child.getDupDetector());
        assertNotSame(dupDetector, child.getDupDetector());
    }

    @Test
    public void testCreateChildObjectContext_WithDupDetector() {
        JsonWriteContext root = JsonWriteContext.createRootContext(dupDetector);
        JsonWriteContext child = root.createChildObjectContext();
        assertNotNull(child.getDupDetector());
        assertNotSame(dupDetector, child.getDupDetector());
    }

    @Test
    public void testCreateChildObjectContext_Reuse_WithDupDetector() {
        JsonWriteContext root = JsonWriteContext.createRootContext(dupDetector);
        JsonWriteContext child1 = root.createChildObjectContext();
        JsonWriteContext child2 = root.createChildObjectContext();
        assertSame(child1, child2);
    }
}