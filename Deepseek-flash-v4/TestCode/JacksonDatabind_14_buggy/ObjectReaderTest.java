package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.*;

public class ObjectReaderTest {

    private ObjectReader objectReader;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        objectReader = mapper.reader();
    }

    @Test
    public void testVersion() {
        assertNotNull(objectReader.version());
    }

    @Test
    public void testWithDeserializationFeature() {
        ObjectReader reader = objectReader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(reader);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithDeserializationFeatureMultiple() {
        ObjectReader reader = objectReader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES);
        assertNotNull(reader);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES));
    }

    @Test
    public void testWithFeatures() {
        ObjectReader reader = objectReader.withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(reader);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutDeserializationFeature() {
        ObjectReader reader = objectReader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(reader);
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutFeatures() {
        ObjectReader reader = objectReader.withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(reader);
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithJsonParserFeature() {
        ObjectReader reader = objectReader.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotNull(reader);
        assertTrue(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithJsonParserFeatures() {
        ObjectReader reader = objectReader.withFeatures(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        assertNotNull(reader);
        assertTrue(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        assertTrue(reader.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
    }

    @Test
    public void testWithoutJsonParserFeature() {
        ObjectReader reader = objectReader.without(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotNull(reader);
        assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutJsonParserFeatures() {
        ObjectReader reader = objectReader.withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        assertNotNull(reader);
        assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
    }

    @Test
    public void testWithConfig() {
        DeserializationConfig config = mapper.getDeserializationConfig();
        ObjectReader reader = objectReader.with(config);
        assertNotNull(reader);
        assertSame(config, reader.getConfig());
    }

    @Test
    public void testWithInjectableValues() {
        InjectableValues injectableValues = new InjectableValues.Std().addValue("key", "value");
        ObjectReader reader = objectReader.with(injectableValues);
        assertNotNull(reader);
    }

    @Test
    public void testWithJsonNodeFactory() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectReader reader = objectReader.with(factory);
        assertNotNull(reader);
    }

    @Test
    public void testWithJsonFactory() throws JsonProcessingException {
        JsonFactory factory = new JsonFactory();
        ObjectReader reader = objectReader.with(factory);
        assertNotNull(reader);
    }

    @Test
    public void testWithRootName() {
        ObjectReader reader = objectReader.withRootName("root");
        assertNotNull(reader);
    }

    @Test
    public void testWithFormatSchema() {
        FormatSchema schema = new com.fasterxml.jackson.core.schema.APISchema();
        ObjectReader reader = objectReader.with(schema);
        assertNotNull(reader);
    }

    @Test
    public void testForTypeJavaType() throws Exception {
        JavaType type = mapper.constructType(String.class);
        ObjectReader reader = objectReader.forType(type);
        assertNotNull(reader);
        assertEquals(String.class, reader.readValue("\"test\"").getClass());
    }

    @Test
    public void testForTypeClass() throws Exception {
        ObjectReader reader = objectReader.forType(String.class);
        assertNotNull(reader);
        assertEquals(String.class, reader.readValue("\"test\"").getClass());
    }

    @Test
    public void testForTypeTypeReference() throws Exception {
        TypeReference<String> typeRef = new TypeReference<String>() {};
        ObjectReader reader = objectReader.forType(typeRef);
        assertNotNull(reader);
        assertEquals(String.class, reader.readValue("\"test\"").getClass());
    }

    @Test
    public void testWithTypeJavaType() {
        JavaType type = mapper.constructType(String.class);
        ObjectReader reader = objectReader.withType(type);
        assertNotNull(reader);
    }

    @Test
    public void testWithTypeClass() {
        ObjectReader reader = objectReader.withType(String.class);
        assertNotNull(reader);
    }

    @Test
    public void testWithTypeType() {
        ObjectReader reader = objectReader.withType(String.class);
        assertNotNull(reader);
    }

    @Test
    public void testWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        assertNotNull(reader);
        Person result = reader.readValue("{\"name\":\"John\"}");
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithValueToUpdateNull() {
        objectReader.withValueToUpdate(null);
    }

    @Test
    public void testWithView() {
        ObjectReader reader = objectReader.withView(PersonView.class);
        assertNotNull(reader);
    }

    @Test
    public void testWithLocale() {
        ObjectReader reader = objectReader.with(Locale.US);
        assertNotNull(reader);
    }

    @Test
    public void testWithTimeZone() {
        ObjectReader reader = objectReader.with(TimeZone.getDefault());
        assertNotNull(reader);
    }

    @Test
    public void testWithHandler() {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        ObjectReader reader = objectReader.withHandler(handler);
        assertNotNull(reader);
    }

    @Test
    public void testWithBase64Variant() {
        Base64Variant b64 = Base64Variants.getDefaultVariant();
        ObjectReader reader = objectReader.with(b64);
        assertNotNull(reader);
    }

    @Test
    public void testWithFormatDetection() {
        ObjectReader reader = objectReader.withFormatDetection(mapper.reader(), mapper.reader());
        assertNotNull(reader);
    }

    @Test
    public void testWithFormatDetectionDataFormatReaders() {
        DataFormatReaders readers = new DataFormatReaders();
        ObjectReader reader = objectReader.withFormatDetection(readers);
        assertNotNull(reader);
    }

    @Test
    public void testWithContextAttributes() {
        ContextAttributes attrs = ContextAttributes.getEmpty();
        ObjectReader reader = objectReader.with(attrs);
        assertNotNull(reader);
    }

    @Test
    public void testWithAttributes() {
        Map<Object, Object> attrs = new HashMap<>();
        attrs.put("key", "value");
        ObjectReader reader = objectReader.withAttributes(attrs);
        assertNotNull(reader);
    }

    @Test
    public void testWithAttribute() {
        ObjectReader reader = objectReader.withAttribute("key", "value");
        assertNotNull(reader);
    }

    @Test
    public void testWithoutAttribute() {
        ObjectReader reader = objectReader.withoutAttribute("key");
        assertNotNull(reader);
    }

    @Test
    public void testIsEnabledDeserializationFeature() {
        assertFalse(objectReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        ObjectReader reader = objectReader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testIsEnabledMapperFeature() {
        assertFalse(objectReader.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testIsEnabledJsonParserFeature() {
        assertFalse(objectReader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testGetConfig() {
        assertNotNull(objectReader.getConfig());
    }

    @Test
    public void testGetFactory() {
        assertNotNull(objectReader.getFactory());
    }

    @Test
    public void testGetJsonFactory() {
        assertNotNull(objectReader.getJsonFactory());
    }

    @Test
    public void testGetTypeFactory() {
        assertNotNull(objectReader.getTypeFactory());
    }

    @Test
    public void testGetAttributes() {
        assertNotNull(objectReader.getAttributes());
    }

    @Test
    public void testReadValueJsonParser() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("{\"name\":\"John\"}");
        Map<String, Object> result = objectReader.readValue(jp);
        assertNotNull(result);
        assertEquals("John", result.get("name"));
    }

    @Test
    public void testReadValueJsonParserClass() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("{\"name\":\"John\"}");
        Person result = objectReader.readValue(jp, Person.class);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueJsonParserTypeReference() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("{\"name\":\"John\"}");
        Person result = objectReader.readValue(jp, new TypeReference<Person>() {});
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueJsonParserResolvedType() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("{\"name\":\"John\"}");
        ResolvedType type = objectReader.getTypeFactory().constructType(Person.class);
        Person result = objectReader.readValue(jp, type);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValuesJsonParserClass() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("[{\"name\":\"John\"},{\"name\":\"Jane\"}]");
        Iterator<Person> iterator = objectReader.readValues(jp, Person.class);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals("John", iterator.next().name);
        assertEquals("Jane", iterator.next().name);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesJsonParserTypeReference() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("[{\"name\":\"John\"}]");
        Iterator<Person> iterator = objectReader.readValues(jp, new TypeReference<Person>() {});
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testReadValuesJsonParserResolvedType() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("[{\"name\":\"John\"}]");
        ResolvedType type = objectReader.getTypeFactory().constructType(Person.class);
        Iterator<Person> iterator = objectReader.readValues(jp, type);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testReadValuesJsonParserJavaType() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("[{\"name\":\"John\"}]");
        JavaType type = objectReader.getTypeFactory().constructType(Person.class);
        Iterator<Person> iterator = objectReader.readValues(jp, type);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testCreateArrayNode() {
        JsonNode node = objectReader.createArrayNode();
        assertNotNull(node);
        assertTrue(node.isArray());
    }

    @Test
    public void testCreateObjectNode() {
        JsonNode node = objectReader.createObjectNode();
        assertNotNull(node);
        assertTrue(node.isObject());
    }

    @Test
    public void testTreeAsTokens() {
        JsonNode node = objectReader.createObjectNode();
        JsonParser jp = objectReader.treeAsTokens(node);
        assertNotNull(jp);
        assertTrue(jp instanceof TreeTraversingParser);
    }

    @Test
    public void testReadTreeJsonParser() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("{\"name\":\"John\"}");
        JsonNode node = objectReader.readTree(jp);
        assertNotNull(node);
        assertTrue(node.isObject());
    }

    @Test
    public void testWriteTree() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator jgen = objectReader.getFactory().createGenerator(sw);
        ObjectNode node = objectReader.createObjectNode();
        objectReader.writeTree(jgen, node);
        jgen.close();
        assertEquals("{\"name\":\"John\"}", sw.toString());
    }

    @Test
    public void testReadValueInputStream() throws Exception {
        String json = "{\"name\":\"John\"}";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        Person result = objectReader.readValue(is);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueReader() throws Exception {
        String json = "{\"name\":\"John\"}";
        Reader reader = new StringReader(json);
        Person result = objectReader.readValue(reader);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueString() throws Exception {
        String json = "{\"name\":\"John\"}";
        Person result = objectReader.readValue(json);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueBytes() throws Exception {
        String json = "{\"name\":\"John\"}";
        byte[] bytes = json.getBytes();
        Person result = objectReader.readValue(bytes);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueBytesOffsetLength() throws Exception {
        String json = "prefix{\"name\":\"John\"}suffix";
        byte[] bytes = json.getBytes();
        Person result = objectReader.readValue(bytes, 6, 12);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueFile() throws Exception {
        File file = File.createTempFile("test", ".json");
        file.deleteOnExit();
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("{\"name\":\"John\"}");
        }
        Person result = objectReader.readValue(file);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueURL() throws Exception {
        File file = File.createTempFile("test", ".json");
        file.deleteOnExit();
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("{\"name\":\"John\"}");
        }
        URL url = file.toURI().toURL();
        Person result = objectReader.readValue(url);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadValueJsonNode() throws Exception {
        ObjectNode node = objectReader.createObjectNode();
        node.put("name", "John");
        Person result = objectReader.readValue(node);
        assertNotNull(result);
        assertEquals("John", result.name);
    }

    @Test
    public void testReadTreeInputStream() throws Exception {
        String json = "{\"name\":\"John\"}";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        JsonNode node = objectReader.readTree(is);
        assertNotNull(node);
        assertEquals("John", node.get("name").asText());
    }

    @Test
    public void testReadTreeReader() throws Exception {
        String json = "{\"name\":\"John\"}";
        Reader reader = new StringReader(json);
        JsonNode node = objectReader.readTree(reader);
        assertNotNull(node);
        assertEquals("John", node.get("name").asText());
    }

    @Test
    public void testReadTreeString() throws Exception {
        String json = "{\"name\":\"John\"}";
        JsonNode node = objectReader.readTree(json);
        assertNotNull(node);
        assertEquals("John", node.get("name").asText());
    }

    @Test
    public void testReadValuesJsonParser() throws Exception {
        JsonParser jp = objectReader.getFactory().createParser("[{\"name\":\"John\"},{\"name\":\"Jane\"}]");
        Iterator<Person> iterator = objectReader.readValues(jp);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testReadValuesInputStream() throws Exception {
        String json = "[{\"name\":\"John\"}]";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        Iterator<Person> iterator = objectReader.readValues(is);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testReadValuesReader() throws Exception {
        String json = "[{\"name\":\"John\"}]";
        Reader reader = new StringReader(json);
        Iterator<Person> iterator = objectReader.readValues(reader);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testReadValuesString() throws Exception {
        String json = "[{\"name\":\"John\"}]";
        Iterator<Person> iterator = objectReader.readValues(json);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testReadValuesBytes() throws Exception {
        String json = "[{\"name\":\"John\"}]";
        byte[] bytes = json.getBytes();
        Iterator<Person> iterator = objectReader.readValues(bytes);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testReadValuesFile() throws Exception {
        File file = File.createTempFile("test", ".json");
        file.deleteOnExit();
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("[{\"name\":\"John\"}]");
        }
        Iterator<Person> iterator = objectReader.readValues(file);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testReadValuesURL() throws Exception {
        File file = File.createTempFile("test", ".json");
        file.deleteOnExit();
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("[{\"name\":\"John\"}]");
        }
        URL url = file.toURI().toURL();
        Iterator<Person> iterator = objectReader.readValues(url);
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testTreeToValue() throws Exception {
        ObjectNode node = objectReader.createObjectNode();
        node.put("name", "John");
        Person person = objectReader.treeToValue(node, Person.class);
        assertNotNull(person);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadValueJsonParserWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        JsonParser jp = objectReader.getFactory().createParser("{\"name\":\"John\"}");
        Person result = reader.readValue(jp);
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadValueInputStreamWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        String json = "{\"name\":\"John\"}";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        Person result = reader.readValue(is);
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadValueReaderWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        String json = "{\"name\":\"John\"}";
        Reader r = new StringReader(json);
        Person result = reader.readValue(r);
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadValueStringWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        Person result = reader.readValue("{\"name\":\"John\"}");
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadValueBytesWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        String json = "{\"name\":\"John\"}";
        Person result = reader.readValue(json.getBytes());
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadValueFileWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        File file = File.createTempFile("test", ".json");
        file.deleteOnExit();
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("{\"name\":\"John\"}");
        }
        Person result = reader.readValue(file);
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadValueURLWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        File file = File.createTempFile("test", ".json");
        file.deleteOnExit();
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("{\"name\":\"John\"}");
        }
        URL url = file.toURI().toURL();
        Person result = reader.readValue(url);
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadValueJsonNodeWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        ObjectNode node = objectReader.createObjectNode();
        node.put("name", "John");
        Person result = reader.readValue(node);
        assertSame(person, result);
        assertEquals("John", person.name);
    }

    @Test
    public void testReadTreeWithValueToUpdate() throws Exception {
        Person person = new Person();
        ObjectReader reader = objectReader.withValueToUpdate(person);
        JsonNode node = reader.readTree("{\"name\":\"John\"}");
        assertNotNull(node);
        assertEquals("John", node.get("name").asText());
    }

    @Test
    public void testBindException() throws Exception {
        ObjectReader reader = objectReader.forType(Integer.class);
        try {
            reader.readValue("notAnInteger");
            fail("Expected JsonProcessingException");
        } catch (JsonProcessingException e) {
            // expected
        }
    }

    @Test
    public void testReadValuesWithInvalidInput() throws Exception {
        ObjectReader reader = objectReader.forType(Person.class);
        try (JsonParser jp = objectReader.getFactory().createParser("invalid")) {
            iterator = reader.readValues(jp);
            fail("Expected JsonProcessingException");
        } catch (JsonProcessingException e) {
            // expected
        }
    }

    @Test
    public void testReadTreeInvalidJson() {
        try {
            objectReader.readTree("invalid");
            fail("Expected JsonProcessingException");
        } catch (JsonProcessingException e) {
            // expected
        }
    }

    @Test
    public void testReadValueEmptyInput() throws Exception {
        try {
            objectReader.readValue("");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testWithRootNameAndReadValue() throws Exception {
        ObjectReader reader = objectReader.withRootName("root");
        String json = "{\"root\":{\"name\":\"John\"}}";
        Person person = reader.forType(Person.class).readValue(json);
        assertNotNull(person);
        assertEquals("John", person.name);
    }

    @Test
    public void testWithViewAndReadValue() throws Exception {
        ObjectReader reader = objectReader.withView(PersonView.class);
        String json = "{\"name\":\"John\",\"age\":30}";
        Person person = reader.forType(Person.class).readValue(json);
        assertNotNull(person);
        assertEquals("John", person.name);
    }

    public static class Person {
        public String name;
        public int age;
    }

    public interface PersonView {}
}