package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.JsonPointerBasedFilter;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

public class ObjectReaderTest {

    private ObjectReader objectReader;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        objectReader = new ObjectReader(mapper, mapper.getDeserializationConfig());
    }

    @After
    public void tearDown() {
        objectReader = null;
        mapper = null;
    }

    @Test
    public void testVersion() {
        Version version = objectReader.version();
        assertNotNull(version);
        // Version should not be null for Jackson databind
    }

    @Test
    public void testWithDeserializationFeature() {
        ObjectReader newReader = objectReader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithDeserializationFeatureSingleAndOthers() {
        ObjectReader newReader = objectReader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(newReader.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
    }

    @Test
    public void testWithDeserializationFeatures() {
        ObjectReader newReader = objectReader.withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        assertNotNull(newReader);
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(newReader.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
    }

    @Test
    public void testWithoutDeserializationFeature() {
        ObjectReader newReader = objectReader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader newReader2 = newReader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(newReader2);
        assertFalse(newReader2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutDeserializationFeatures() {
        ObjectReader newReader = objectReader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        ObjectReader newReader2 = newReader.withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(newReader2);
        assertFalse(newReader2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(newReader2.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
    }

    @Test
    public void testWithJsonParserFeature() {
        ObjectReader newReader = objectReader.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
        assertTrue(newReader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithJsonParserFeatures() {
        ObjectReader newReader = objectReader.withFeatures(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        assertNotNull(newReader);
        assertTrue(newReader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        assertTrue(newReader.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
    }

    @Test
    public void testWithoutJsonParserFeature() {
        ObjectReader newReader = objectReader.with(JsonParser.Feature.ALLOW_COMMENTS);
        ObjectReader newReader2 = newReader.without(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotNull(newReader2);
        assertFalse(newReader2.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutJsonParserFeatures() {
        ObjectReader newReader = objectReader.with(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        ObjectReader newReader2 = newReader.withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotNull(newReader2);
        assertFalse(newReader2.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        assertTrue(newReader2.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
    }

    @Test
    public void testAtWithString() {
        ObjectReader newReader = objectReader.at("/path");
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testAtWithJsonPointer() {
        JsonPointer pointer = JsonPointer.compile("/path");
        ObjectReader newReader = objectReader.at(pointer);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithDeserializationConfig() {
        DeserializationConfig config = mapper.getDeserializationConfig();
        ObjectReader newReader = objectReader.with(config);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
        assertSame(config, newReader.getConfig());
    }

    @Test
    public void testWithInjectableValues() {
        InjectableValues injectable = new InjectableValues.Std().addValue("key", "value");
        ObjectReader newReader = objectReader.with(injectable);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
        assertSame(injectable, newReader.getInjectableValues());
    }

    @Test
    public void testWithInjectableValuesSameInstance() {
        InjectableValues injectable = objectReader.getInjectableValues();
        ObjectReader newReader = objectReader.with(injectable);
        assertSame(objectReader, newReader);
    }

    @Test
    public void testWithJsonNodeFactory() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectReader newReader = objectReader.with(factory);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithJsonFactory() throws IOException {
        JsonFactory factory = new JsonFactory();
        ObjectReader newReader = objectReader.with(factory);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithRootNameString() {
        ObjectReader newReader = objectReader.withRootName("root");
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithRootNamePropertyName() {
        ObjectReader newReader = objectReader.withRootName(PropertyName.construct("root"));
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithoutRootName() {
        ObjectReader newReader = objectReader.withRootName("root").withoutRootName();
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithFormatSchema() {
        JSONSchema schema = null; // No default schema in Test
        try {
            objectReader.with(schema);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testWithFormatSchemaValid() {
        // Assume no schema available, but we can test with non-null schema using a mock or custom
        // For now just test with null schema, which should return new reader
        ObjectReader newReader = objectReader.with(schema -> {});
        assertNotNull(newReader);
    }

    @Test
    public void testForTypeJavaType() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        ObjectReader newReader = objectReader.forType(type);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testForTypeClass() {
        ObjectReader newReader = objectReader.forType(String.class);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testForTypeTypeReference() {
        TypeReference<String> typeRef = new TypeReference<String>() {};
        ObjectReader newReader = objectReader.forType(typeRef);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithTypeJavaType() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        ObjectReader newReader = objectReader.withType(type);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithTypeClass() {
        ObjectReader newReader = objectReader.withType(String.class);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithTypeTypeReference() {
        TypeReference<String> typeRef = new TypeReference<String>() {};
        ObjectReader newReader = objectReader.withType(typeRef);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithValueToUpdateNonNull() {
        Object value = new Object();
        ObjectReader newReader = objectReader.withValueToUpdate(value);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithValueToUpdateNull() {
        ObjectReader newReader = objectReader.withValueToUpdate(null);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithView() {
        ObjectReader newReader = objectReader.withView(SomeView.class);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithLocale() {
        ObjectReader newReader = objectReader.with(Locale.US);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithTimeZone() {
        TimeZone tz = TimeZone.getDefault();
        ObjectReader newReader = objectReader.with(tz);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithHandler() {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        ObjectReader newReader = objectReader.withHandler(handler);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithBase64Variant() {
        Base64Variant base64 = Base64Variants.getDefaultVariant();
        ObjectReader newReader = objectReader.with(base64);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithFormatDetection() {
        ObjectReader[] readers = { mapper.reader() };
        ObjectReader newReader = objectReader.withFormatDetection(readers);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithContextAttributes() {
        ContextAttributes attrs = ContextAttributes.getEmpty();
        ObjectReader newReader = objectReader.with(attrs);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithAttributes() {
        Map<Object, Object> attrs = new HashMap<>();
        ObjectReader newReader = objectReader.withAttributes(attrs);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithAttribute() {
        ObjectReader newReader = objectReader.withAttribute("key", "value");
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testWithoutAttribute() {
        ObjectReader newReader = objectReader.withAttribute("key", "value").withoutAttribute("key");
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testIsEnabledDeserializationFeature() {
        assertTrue(objectReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testIsEnabledMapperFeature() {
        assertFalse(objectReader.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
    }

    @Test
    public void testIsEnabledJsonParserFeature() {
        assertFalse(objectReader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testGetConfig() {
        DeserializationConfig config = objectReader.getConfig();
        assertNotNull(config);
    }

    @Test
    public void testGetFactory() {
        JsonFactory factory = objectReader.getFactory();
        assertNotNull(factory);
    }

    @Test
    public void testGetTypeFactory() {
        TypeFactory factory = objectReader.getTypeFactory();
        assertNotNull(factory);
    }

    @Test
    public void testGetAttributes() {
        ContextAttributes attrs = objectReader.getAttributes();
        assertNotNull(attrs);
    }

    @Test
    public void testGetInjectableValues() {
        InjectableValues injectable = objectReader.getInjectableValues();
        assertNull(injectable);
    }

    @Test
    public void testReadValueJsonParser() throws IOException {
        JsonParser p = new JsonFactory().createParser("{\"a\":1}");
        Map<String, Object> result = objectReader.readValue(p);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
        p.close();
    }

    @Test
    public void testReadValueJsonParserWithClass() throws IOException {
        JsonParser p = new JsonFactory().createParser("{\"a\":1}");
        Map result = objectReader.readValue(p, Map.class);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
        p.close();
    }

    @Test
    public void testReadValueJsonParserWithTypeReference() throws IOException {
        JsonParser p = new JsonFactory().createParser("{\"a\":1}");
        Map result = objectReader.readValue(p, new TypeReference<Map<String, Object>>() {});
        assertNotNull(result);
        assertEquals(1, result.get("a"));
        p.close();
    }

    @Test
    public void testReadValuesJsonParser() throws IOException {
        JsonParser p = new JsonFactory().createParser("[1,2,3]");
        Iterator<Integer> values = objectReader.readValues(p, Integer.class);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(2), values.next());
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(3), values.next());
        assertFalse(values.hasNext());
        p.close();
    }

    @Test
    public void testReadValuesJsonParserTypeReference() throws IOException {
        JsonParser p = new JsonFactory().createParser("[1,2,3]");
        Iterator<Integer> values = objectReader.readValues(p, new TypeReference<Integer>() {});
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        p.close();
    }

    @Test
    public void testReadValuesInputStream() throws IOException {
        InputStream in = new ByteArrayInputStream("[1,2]".getBytes());
        Iterator<Integer> values = objectReader.readValues(in);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        assertEquals(Integer.valueOf(2), values.next());
        assertFalse(values.hasNext());
    }

    @Test
    public void testCreateArrayNode() {
        JsonNode node = objectReader.createArrayNode();
        assertNotNull(node);
        assertTrue(node.isArray());
        assertEquals(0, node.size());
    }

    @Test
    public void testCreateObjectNode() {
        JsonNode node = objectReader.createObjectNode();
        assertNotNull(node);
        assertTrue(node.isObject());
        assertEquals(0, node.size());
    }

    @Test
    public void testTreeAsTokens() throws IOException {
        JsonNode node = objectReader.createObjectNode().put("a", 1);
        JsonParser p = objectReader.treeAsTokens(node);
        assertNotNull(p);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testReadTreeAsTree() throws IOException {
        JsonNode node = objectReader.readTree("{\"a\":1}");
        assertNotNull(node);
        assertTrue(node.isObject());
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testReadTreeInputStream() throws IOException {
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes());
        JsonNode node = objectReader.readTree(in);
        assertNotNull(node);
        assertTrue(node.isObject());
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testReadTreeReader() throws IOException {
        Reader reader = new StringReader("{\"a\":1}");
        JsonNode node = objectReader.readTree(reader);
        assertNotNull(node);
        assertTrue(node.isObject());
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testReadTreeString() throws IOException {
        JsonNode node = objectReader.readTree("{\"a\":1}");
        assertNotNull(node);
        assertTrue(node.isObject());
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testReadValuesFile() throws IOException {
        File file = File.createTempFile("test", ".json");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("[1,2,3]");
        }
        Iterator<Integer> values = objectReader.readValues(file);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        file.delete();
    }

    @Test
    public void testReadValuesURL() throws IOException {
        File file = File.createTempFile("test", ".json");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("[1,2]");
        }
        URL url = file.toURI().toURL();
        Iterator<Integer> values = objectReader.readValues(url);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        assertEquals(Integer.valueOf(2), values.next());
        file.delete();
    }

    @Test
    public void testReadValuesBytes() throws IOException {
        byte[] src = "[1,2]".getBytes();
        Iterator<Integer> values = objectReader.readValues(src);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
    }

    @Test
    public void testReadValuesBytesOffsetLength() throws IOException {
        byte[] src = "xx[1,2]yy".getBytes();
        Iterator<Integer> values = objectReader.readValues(src, 2, 5);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        assertEquals(Integer.valueOf(2), values.next());
        assertFalse(values.hasNext());
    }

    @Test
    public void testReadValuesReader() throws IOException {
        Reader reader = new StringReader("[1,2]");
        Iterator<Integer> values = objectReader.readValues(reader);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
    }

    @Test
    public void testReadValueString() throws IOException {
        Map result = objectReader.readValue("{\"a\":1}");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueBytes() throws IOException {
        byte[] src = "{\"a\":1}".getBytes();
        Map result = objectReader.readValue(src);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueBytesOffsetLength() throws IOException {
        byte[] src = "xx{\"a\":1}yy".getBytes();
        Map result = objectReader.readValue(src, 2, 6);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueFile() throws IOException {
        File file = File.createTempFile("test", ".json");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("{\"a\":1}");
        }
        Map result = objectReader.readValue(file);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
        file.delete();
    }

    @Test
    public void testReadValueURL() throws IOException {
        File file = File.createTempFile("test", ".json");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("{\"a\":1}");
        }
        URL url = file.toURI().toURL();
        Map result = objectReader.readValue(url);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
        file.delete();
    }

    @Test
    public void testReadValueInputStream() throws IOException {
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes());
        Map result = objectReader.readValue(in);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueReader() throws IOException {
        Reader reader = new StringReader("{\"a\":1}");
        Map result = objectReader.readValue(reader);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueJsonNode() throws IOException {
        JsonNode node = objectReader.createObjectNode().put("a", 1);
        Map result = objectReader.readValue(node);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testTreeToValue() throws IOException {
        JsonNode node = objectReader.createObjectNode().put("a", 1);
        Map result = objectReader.treeToValue(node, Map.class);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValuesWithTypeJavaType() throws IOException {
        JsonParser p = new JsonFactory().createParser("[1,2]");
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        Iterator<Integer> values = objectReader.readValues(p, type);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        p.close();
    }

    @Test
    public void testReadValuesWithSchema() throws IOException {
        JsonParser p = new JsonFactory().createParser("[1,2]");
        Iterator<Integer> values = objectReader.readValues(p);
        assertNotNull(values);
        assertTrue(values.hasNext());
        p.close();
    }

    @Test
    public void testBindAsTreeWithEmptyToken() throws IOException {
        JsonParser p = new JsonFactory().createParser("");
        // This should fail or return null depending on implementation
        try {
            objectReader.readTree(p);
            // If no exception, then maybe empty token handled
        } catch (JsonParseException e) {
            // Expected
        }
        p.close();
    }

    @Test
    public void testReadValuesWithUnsupportedSource() throws IOException {
        try {
            Object src = new Object();
            objectReader.readValues(src);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testReadValueWithFormatDetection() throws IOException {
        // Can't fully test but ensure no exception
        ObjectReader reader = objectReader.withFormatDetection(new DataFormatReaders());
        assertNotNull(reader);
    }

    @Test
    public void testWithFormatDetectionDataFormatReaders() {
        DataFormatReaders readers = new DataFormatReaders();
        ObjectReader newReader = objectReader.withFormatDetection(readers);
        assertNotNull(newReader);
        assertNotSame(objectReader, newReader);
    }

    @Test
    public void testReadValueWithRootName() throws IOException {
        ObjectReader reader = objectReader.withRootName("root");
        Map result = reader.readValue("{\"root\":{\"a\":1}}");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueWithRootNameMismatch() throws IOException {
        ObjectReader reader = objectReader.withRootName("root");
        try {
            reader.readValue("{\"wrong\":{\"a\":1}}");
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testReadValuesGenericTypeReference() throws IOException {
        JsonParser p = new JsonFactory().createParser("[1,2]");
        Iterator<Integer> values = objectReader.readValues(p, new TypeReference<Integer>() {});
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        p.close();
    }

    @Test
    public void testReadValueWithValueToUpdate() throws IOException {
        Map valueToUpdate = new HashMap<>();
        ObjectReader reader = objectReader.withValueToUpdate(valueToUpdate);
        Map result = reader.readValue("{\"a\":1}");
        assertSame(valueToUpdate, result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueWithNullValueToUpdate() throws IOException {
        ObjectReader reader = objectReader.withValueToUpdate(null);
        Map result = reader.readValue("{\"a\":1}");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testWriteValue() throws IOException {
        StringWriter w = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(w);
        Map value = new HashMap<>();
        value.put("a", 1);
        objectReader.writeValue(gen, value);
        gen.flush();
        assertTrue(w.toString().contains("\"a\""));
        assertTrue(w.toString().contains("1"));
        gen.close();
    }

    @Test
    public void testWriteTree() throws IOException {
        StringWriter w = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(w);
        ObjectNode node = objectReader.createObjectNode().put("a", 1);
        objectReader.writeTree(gen, node);
        gen.flush();
        assertEquals("{\"a\":1}", w.toString());
        gen.close();
    }

    @Test
    public void testReadValueWithEmptyString() throws IOException {
        try {
            objectReader.readValue("");
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testReadValueWithNullInputStream() throws IOException {
        try {
            objectReader.readValue((InputStream) null);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testReadTreeAsTreeWithFilter() throws IOException {
        ObjectReader reader = objectReader.at("/a");
        JsonNode node = reader.readTree("{\"a\":1,\"b\":2}");
        assertNotNull(node);
        assertEquals(1, node.asInt());
    }

    @Test
    public void testReadTreeWithFilter() throws IOException {
        ObjectReader reader = objectReader.at("/a");
        JsonNode node = reader.readTree("{\"a\":{\"c\":1},\"b\":2}");
        assertNotNull(node);
        assertTrue(node.isObject());
        assertEquals(1, node.get("c").asInt());
    }

    @Test
    public void testReadValueWithFilter() throws IOException {
        ObjectReader reader = objectReader.at("/a");
        Map result = reader.readValue("{\"a\":{\"c\":1},\"b\":2}");
        assertNotNull(result);
        assertEquals(1, result.get("c"));
    }

    @Test
    public void testReadValuesWithFilter() throws IOException {
        ObjectReader reader = objectReader.at("/a");
        Iterator<Object> values = reader.readValues("[{\"a\":1},{\"a\":2}]");
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(1, values.next().get("a"));
        assertTrue(values.hasNext());
        assertEquals(2, values.next().get("a"));
        assertFalse(values.hasNext());
    }

    @Test
    public void testReadValueWithRootWrapper() throws IOException {
        ObjectReader reader = objectReader.withRootName("root");
        Map result = reader.readValue("{\"root\":{\"a\":1}}", Map.class);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueUnwrappedRoot() throws IOException {
        ObjectReader reader = objectReader.withRootName("root").withRootName(PropertyName.NO_NAME);
        Map result = reader.readValue("{\"a\":1}");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValuesWithDifferentTypes() throws IOException {
        JsonParser p = new JsonFactory().createParser("[1,2,3]");
        Iterator<Integer> values = objectReader.readValues(p, Integer.class);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Integer.valueOf(1), values.next());
        p.close();
    }

    @Test
    public void testReadTreeWithEmptyObject() throws IOException {
        JsonNode node = objectReader.readTree("{}");
        assertNotNull(node);
        assertTrue(node.isObject());
        assertEquals(0, node.size());
    }

    @Test
    public void testReadTreeWithArray() throws IOException {
        JsonNode node = objectReader.readTree("[1,2,3]");
        assertNotNull(node);
        assertTrue(node.isArray());
        assertEquals(3, node.size());
    }

    @Test
    public void testReadValueWithTrailingTokensEnabled() throws IOException {
        ObjectReader reader = objectReader.with(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        try {
            reader.readValue("{\"a\":1}   x");
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testReadValueWithTrailingTokensDisabled() throws IOException {
        ObjectReader reader = objectReader.without(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        Map result = reader.readValue("{\"a\":1}   ");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueWithMultipleSpaces() throws IOException {
        Map result = objectReader.readValue("   {\"a\":1}   ");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueWithComment() throws IOException {
        ObjectReader reader = objectReader.with(JsonParser.Feature.ALLOW_COMMENTS);
        Map result = reader.readValue("/* comment */ {\"a\":1}");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValueWithSingleQuote() throws IOException {
        ObjectReader reader = objectReader.with(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        Map result = reader.readValue("{'a':1}");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValuesWithEmptyJson() throws IOException {
        JsonParser p = new JsonFactory().createParser("");
        Iterator<Object> values = objectReader.readValues(p);
        assertNotNull(values);
        // May or may not exist depending on implementation
        p.close();
    }

    @Test
    public void testReadValueWithInvalidJson() throws IOException {
        try {
            objectReader.readValue("{\"a\":");
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testReadValueWithNull() throws IOException {
        try {
            objectReader.readValue((String) null);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testReadValueWithEmptyByteArray() throws IOException {
        try {
            objectReader.readValue(new byte[0]);
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testReadValueWithZeroOffset() throws IOException {
        byte[] src = "{\"a\":1}".getBytes();
        Map result = objectReader.readValue(src, 0, src.length);
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValuesWithZeroLength() throws IOException {
        byte[] src = "{\"a\":1}".getBytes();
        try {
            objectReader.readValues(src, 0, 0);
            // May not throw, depends on implementation
        } catch (IOException e) {
            // Expected if implementation treats as error
        }
    }

    @Test
    public void testReadValueWithNegativeOffset() throws IOException {
        byte[] src = "{\"a\":1}".getBytes();
        try {
            objectReader.readValue(src, -1, src.length);
            fail("Expected ArrayIndexOutOfBoundsException or similar");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testReadValuesWithDifferentTokenTypes() throws IOException {
        JsonParser p = new JsonFactory().createParser("[true, null, \"hello\", 42]");
        Iterator<Object> values = objectReader.readValues(p);
        assertNotNull(values);
        assertTrue(values.hasNext());
        assertEquals(Boolean.TRUE, values.next());
        assertTrue(values.hasNext());
        assertNull(values.next());
        assertTrue(values.hasNext());
        assertEquals("hello", values.next());
        assertTrue(values.hasNext());
        assertEquals(42, values.next());
        assertFalse(values.hasNext());
        p.close();
    }

    @Test
    public void testWithAutoDetect() throws IOException {
        ObjectReader reader = objectReader.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertNotNull(reader);
        assertTrue(reader.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testWithAutoDetectAll() throws IOException {
        ObjectReader reader = objectReader.with(new DeserializationFeature[] { DeserializationFeature.UNWRAP_ROOT_VALUE, DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES });
        assertNotNull(reader);
        assertTrue(reader.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutAutoDetect() throws IOException {
        ObjectReader reader = objectReader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(reader);
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutAutoDetectAll() throws IOException {
        ObjectReader reader = objectReader.without(new DeserializationFeature[] { DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT });
        assertNotNull(reader);
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(reader.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
    }
}