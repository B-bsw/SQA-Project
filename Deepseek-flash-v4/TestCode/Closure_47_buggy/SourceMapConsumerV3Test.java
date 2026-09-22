package com.google.debugging.sourcemap;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Collection;
import java.util.Collections;

public class SourceMapConsumerV3Test {
    private SourceMapConsumerV3 consumer;
    private static final String BASIC_MAP = "{\"version\":3,\"file\":\"test.js\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"original.js\"],\"names\":[\"name1\"]}";
    private static final String UNMAPPED_MAP = "{\"version\":3,\"file\":\"test.js\",\"lineCount\":2,\"mappings\":\"A;A\",\"sources\":[\"original.js\"],\"names\":[]}";
    private static final String EMPTY_LINE_MAP = "{\"version\":3,\"file\":\"test.js\",\"lineCount\":3,\"mappings\":\"A; ;C\",\"sources\":[\"orig.js\"],\"names\":[]}";

    @Before
    public void setUp() {
        consumer = new SourceMapConsumerV3();
    }

    @After
    public void tearDown() {
        consumer = null;
    }

    @Test
    public void testBasicParseAndGetMapping() throws Exception {
        consumer.parse(BASIC_MAP);
        OriginalMapping mapping = consumer.getMappingForLine(1, 1);
        assertNotNull(mapping);
        assertEquals("original.js", mapping.getOriginalFile());
        assertEquals(0, mapping.getLineNumber());
        assertEquals(0, mapping.getColumnPosition());
    }

    @Test
    public void testParseWithNullSectionSupplier() throws Exception {
        consumer.parse(BASIC_MAP, null);
        assertNotNull(consumer.getOriginalSources());
        assertEquals(1, consumer.getOriginalSources().size());
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseInvalidVersion() throws Exception {
        consumer.parse("{\"version\":2,\"file\":\"test.js\"}");
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseEmptyFile() throws Exception {
        consumer.parse("{\"version\":3,\"file\":\"\",\"lineCount\":0,\"mappings\":\"\"}");
    }

    @Test
    public void testParseWithSections() throws Exception {
        String sectionedMap = "{\"version\":3,\"file\":\"bundle.js\",\"sections\":[{\"offset\":{\"line\":0,\"column\":0},\"map\":{\"version\":3,\"file\":\"test.js\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"inner.js\"],\"names\":[]}}]}";
        consumer.parse(sectionedMap);
        assertNotNull(consumer.getOriginalSources());
        assertTrue(consumer.getOriginalSources().contains("inner.js"));
    }

    @Test
    public void testGetMappingForLineOutOfBounds() throws Exception {
        consumer.parse(BASIC_MAP);
        OriginalMapping mapping = consumer.getMappingForLine(5, 1);
        assertNull(mapping);
    }

    @Test
    public void testUnmappedEntry() throws Exception {
        consumer.parse(UNMAPPED_MAP);
        OriginalMapping mapping = consumer.getMappingForLine(1, 0);
        assertNull(mapping);
    }

    @Test
    public void testEmptyLineReturnsPreviousMapping() throws Exception {
        consumer.parse(EMPTY_LINE_MAP);
        OriginalMapping mapping = consumer.getMappingForLine(2, 0);
        assertNull(mapping);
    }

    @Test
    public void testGetOriginalSources() throws Exception {
        consumer.parse(BASIC_MAP);
        Collection<String> sources = consumer.getOriginalSources();
        assertNotNull(sources);
        assertEquals(1, sources.size());
        assertTrue(sources.contains("original.js"));
    }

    @Test
    public void testGetReverseMapping() throws Exception {
        consumer.parse(BASIC_MAP);
        consumer.getMappingForLine(1, 1);
        Collection<OriginalMapping> mappings = consumer.getReverseMapping("original.js", 0, 0);
        assertNotNull(mappings);
        assertTrue(mappings.size() > 0);
    }

    @Test
    public void testGetReverseMappingNoSource() throws Exception {
        consumer.parse(BASIC_MAP);
        Collection<OriginalMapping> mappings = consumer.getReverseMapping("nonexistent.js", 0, 0);
        assertNotNull(mappings);
        assertEquals(0, mappings.size());
    }

    @Test
    public void testGetReverseMappingNoLine() throws Exception {
        consumer.parse(BASIC_MAP);
        consumer.getMappingForLine(1, 1);
        Collection<OriginalMapping> mappings = consumer.getReverseMapping("original.js", 99, 0);
        assertNotNull(mappings);
        assertEquals(0, mappings.size());
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseInvalidJSON() throws Exception {
        consumer.parse("invalid json content");
    }

    @Test
    public void testParseWithMultipleMappings() throws Exception {
        String multiMap = "{\"version\":3,\"file\":\"test.js\",\"lineCount\":2,\"mappings\":\"AAAA;AACA\",\"sources\":[\"original.js\",\"second.js\"],\"names\":[]}";
        consumer.parse(multiMap);
        OriginalMapping mapping1 = consumer.getMappingForLine(1, 0);
        assertNotNull(mapping1);
        assertEquals("original.js", mapping1.getOriginalFile());
        
        OriginalMapping mapping2 = consumer.getMappingForLine(2, 0);
        assertNotNull(mapping2);
        assertEquals("original.js", mapping2.getOriginalFile());
    }

    @Test
    public void testParseMetaMapWithUrl() throws Exception {
        final String innerMap = "{\"version\":3,\"file\":\"inner.js\",\"lineCount\":1,\"mappings\":\"AAAA\",\"sources\":[\"innerSource.js\"],\"names\":[]}";
        SourceMapSupplier supplier = new SourceMapSupplier() {
            @Override
            public String getSourceMap(String url) {
                return url.endsWith(".map") ? innerMap : null;
            }
        };
        String metaMap = "{\"version\":3,\"file\":\"outer.js\",\"sections\":[{\"offset\":{\"line\":0,\"column\":0},\"url\":\"inner.map\"}]}";
        consumer.parse(metaMap, supplier);
        assertNotNull(consumer.getOriginalSources());
        assertTrue(consumer.getOriginalSources().contains("innerSource.js"));
    }

    @Test(expected = SourceMapParseException.class)
    public void testParseMetaMapWithMissingUrl() throws Exception {
        String metaMap = "{\"version\":3,\"file\":\"outer.js\",\"sections\":[{\"offset\":{\"line\":0,\"column\":0},\"url\":\"missing.map\"}]}";
        consumer.parse(metaMap, new DefaultSourceMapSupplier());
    }

    @Test
    public void testLineNumberBoundary() throws Exception {
        consumer.parse(BASIC_MAP);
        OriginalMapping mapping = consumer.getMappingForLine(0, 0);
        assertNull(mapping);
    }

    @Test
    public void testNameMapping() throws Exception {
        String namedMap = "{\"version\":3,\"file\":\"test.js\",\"lineCount\":1,\"mappings\":\"AAAAI\",\"sources\":[\"original.js\"],\"names\":[\"namedFunction\"]}";
        consumer.parse(namedMap);
        OriginalMapping mapping = consumer.getMappingForLine(1, 0);
        assertNotNull(mapping);
        assertEquals("namedFunction", mapping.getOriginalName());
    }
}