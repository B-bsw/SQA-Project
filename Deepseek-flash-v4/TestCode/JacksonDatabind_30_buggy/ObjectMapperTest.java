package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.*;
import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
        mapper = null;
    }

    @Test
    public void testDefaultConstruction() {
        assertNotNull(mapper);
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
        assertNotNull(mapper.getDeserializationContext());
        assertNotNull(mapper.getSerializerFactory());
        assertNotNull(mapper.getSerializerProvider());
        assertNotNull(mapper.getFactory());
        assertNotNull(mapper.getTypeFactory());
        assertNotNull(mapper.getSubtypeResolver());
        assertEquals(0, mapper.getMixInCount());
    }

    @Test
    public void testCopyConstructor() {
        ObjectMapper copy = mapper.copy();
        assertNotNull(copy);
        assertNotSame(mapper, copy);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckInvalidCopyWrongClass() {
        mapper._checkInvalidCopy(SomeRandomClass.class);
    }

    @Test
    public void testRegisterModuleNullName() {
        SimpleModule module = new SimpleModule();
        try {
            mapper.registerModule(module);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRegisterModuleNullVersion() {
        SimpleModule module = new SimpleModule("test");
        try {
            mapper.registerModule(module);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRegisterModuleDuplicateIgnored() {
        mapper.registerModule(new SimpleModule("dup", new Version(1, 0, 0, "", "", "")));
        SimpleModule mod2 = new SimpleModule("dup", new Version(1, 0, 0, "", "", ""));
        mapper.registerModule(mod2);
        assertTrue(mapper.isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS));
    }

    @Test
    public void testRegisterSubtypesVarargs() {
        mapper.registerSubtypes(TestClass.class);
        mapper.registerSubtypes();
    }

    @Test
    public void testSetMixInAnnotations() {
        mapper.setMixInAnnotations(TestClass.class, TestMixin.class);
        assertEquals(TestMixin.class, mapper.findMixInClassFor(TestClass.class));
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testAddMixIn() {
        mapper.addMixIn(TestClass.class, TestMixin.class);
        assertEquals(TestMixin.class, mapper.findMixInClassFor(TestClass.class));
    }

    @Test
    public void testSetMixInsMap() {
        Map<Class<?>, Class<?>> mixins = new HashMap<Class<?>, Class<?>>();
        mixins.put(TestClass.class, TestMixin.class);
        mapper.setMixIns(mixins);
        assertEquals(TestMixin.class, mapper.findMixInClassFor(TestClass.class));
    }

    @Test
    public void testSetMixInAnnotationsMap() {
        Map<Class<?>, Class<?>> mixins = new HashMap<Class<?>, Class<?>>();
        mixins.put(TestClass.class, TestMixin.class);
        mapper.setMixInAnnotations(mixins);
        assertEquals(TestMixin.class, mapper.findMixInClassFor(TestClass.class));
    }

    @Test
    public void testRegisterModules() {
        SimpleModule mod = new SimpleModule("mod", new Version(1, 0, 0, "", "", ""));
        List<SimpleModule> modules = new ArrayList<SimpleModule>();
        modules.add(mod);
        mapper.registerModules(modules);
        mapper.registerModules(mod);
    }

    @Test
    public void testFindModules() {
        assertNotNull(mapper.findModules());
        assertNotNull(mapper.findModules(null));
        assertNotNull(mapper.findModules(Thread.currentThread().getContextClassLoader()));
    }

    @Test
    public void testFindAndRegisterModules() {
        mapper.findAndRegisterModules();
    }

    @Test
    public void testSetDefaultTyping() {
        mapper.setDefaultTyping(mapper.getSubtypeResolver());
        mapper.setDefaultTyping(null);
    }

    @Test
    public void testEnableDefaultTyping() {
        mapper.enableDefaultTyping();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
    }

    @Test
    public void testEnableDefaultTypingWithAs() {
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS, JsonTypeInfo.As.EXISTING_PROPERTY);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.EXTERNAL_PROPERTY);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT, JsonTypeInfo.As.WRAPPER_ARRAY);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT, JsonTypeInfo.As.WRAPPER_OBJECT);
    }

    @Test
    public void testEnableDefaultTypingAsProperty() {
        mapper.enableDefaultTypingAsProperty(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, "type");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableDefaultTypingInvalidAs() {
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    @Test
    public void testDisableDefaultTyping() {
        mapper.disableDefaultTyping();
        assertNull(mapper._subtypeResolver);
    }

    @Test
    public void testSetDefaultTypingWithBuilder() {
        TypeResolverBuilder<?> typer = new DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        mapper.setDefaultTyping(typer);
        assertNotNull(mapper.getSubtypeResolver());
    }

    @Test
    public void testSetSubtypeResolver() {
        SubtypeResolver sr = new StdSubtypeResolver();
        mapper.setSubtypeResolver(sr);
        assertSame(sr, mapper.getSubtypeResolver());
    }

    @Test
    public void testSetVisibility() {
        mapper.setVisibility(JsonPropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.DEFAULT);
    }

    @Test
    public void testGetSerializationConfig() {
        assertNotNull(mapper.getSerializationConfig());
    }

    @Test
    public void testGetDeserializationConfig() {
        assertNotNull(mapper.getDeserializationConfig());
    }

    @Test
    public void testGetSerializationConfigWithFeatures() {
        assertNotNull(mapper.getSerializationConfig().with(SerializationFeature.INDENT_OUTPUT));
        assertNotNull(mapper.getSerializationConfig().with(new SerializationFeature[]{}, new Object[]{}));
    }

    @Test
    public void testGetDeserializationConfigWithFeatures() {
        assertNotNull(mapper.getDeserializationConfig().with(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
        assertNotNull(mapper.getDeserializationConfig().with(new DeserializationFeature[]{}, new Object[]{}));
    }

    @Test
    public void testReader() {
        assertNotNull(mapper.reader());
        assertNotNull(mapper.reader(TestClass.class));
        assertNotNull(mapper.reader(TypeFactory.defaultInstance().constructType(TestClass.class)));
        assertNotNull(mapper.readerFor(TestClass.class));
        assertNotNull(mapper.readerFor(TestClass.class).readValue("{}"));
    }

    @Test
    public void testReaderWithView() {
        assertNotNull(mapper.readerWithView(Object.class));
    }

    @Test
    public void testReaderForUpdating() {
        mapper.readerForUpdating(new TestClass());
    }

    @Test
    public void testReaderWithDefaultBase64() {
        mapper.readerForUpdating(new TestClass());
    }

    @Test
    public void testReaderWithAttributes() {
        ContextAttributes attrs = ContextAttributes.getEmpty();
        mapper.reader().with(attrs);
    }

    @Test
    public void testReaderWithInjection() {
        mapper.reader().with(new InjectableValues.Std().addValue("key", "value"));
    }

    @Test
    public void testReaderForRootType() {
        mapper.readerFor(TestClass.class).withRootName("root");
    }

    @Test
    public void testReaderForValueType() {
        mapper.readerFor(TestClass.class);
        mapper.readerFor((Class<?>) null);
        mapper.readerFor((Type) TestClass.class);
        mapper.readerFor(TypeFactory.defaultInstance().constructType(TestClass.class));
    }

    @Test
    public void testReadValueWithParser() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("{}");
        TestClass result = mapper.readValue(jp, TestClass.class);
        assertNotNull(result);
    }

    @Test
    public void testReadValueWithParserAndType() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("{}");
        TestClass result = mapper.readValue(jp, TypeFactory.defaultInstance().constructType(TestClass.class));
        assertNotNull(result);
    }

    @Test
    public void testReadValueWithNullParser() throws Exception {
        assertNull(mapper.readValue((JsonParser) null, TestClass.class));
        assertNull(mapper.readValue((JsonParser) null, TypeFactory.defaultInstance().constructType(TestClass.class)));
    }

    @Test
    public void testReadValuesWithParser() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("[]");
        MappingIterator<TestClass> it = mapper.readValues(jp, TestClass.class);
        assertFalse(it.hasNext());
    }

    @Test
    public void testReadTreeWithParser() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("{}");
        JsonNode node = mapper.readTree(jp);
        assertNotNull(node);
    }

    @Test
    public void testWriteValueToGenerator() throws Exception {
        JsonGenerator g = mapper.getFactory().createGenerator(new StringWriter());
        mapper.writeValue(g, new TestClass());
        g.close();
    }

    @Test
    public void testWriteValueWithCloseable() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        mapper._configAndWriteValue(g, new TestCloseable(), mapper.getSerializationConfig());
        g.close();
    }

    @Test
    public void testConvertValue() {
        TestClass src = new TestClass();
        src.name = "test";
        JsonNode node = mapper.valueToTree(src);
        assertNotNull(node);

        TestClass back = mapper.treeToValue(node, TestClass.class);
        assertEquals("test", back.name);
    }

    @Test
    public void testGenerateJsonSchema() throws Exception {
        mapper.generateJsonSchema(TestClass.class);
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        mapper.acceptJsonFormatVisitor(TestClass.class, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitorNull() throws Exception {
        mapper.acceptJsonFormatVisitor(null, null);
    }

    @Test
    public void testCreateObjectNode() {
        JsonNode node = mapper.createObjectNode();
        assertNotNull(node);
    }

    @Test
    public void testCreateArrayNode() {
        JsonNode node = mapper.createArrayNode();
        assertNotNull(node);
    }

    @Test
    public void testTreeToValue() throws Exception {
        JsonNode node = mapper.createObjectNode().put("name", "test");
        TestClass tc = mapper.treeToValue(node, TestClass.class);
        assertNotNull(tc);
        assertEquals("test", tc.name);
    }

    @Test
    public void testTreeToValueNull() throws Exception {
        assertNull(mapper.treeToValue(null, TestClass.class));
    }

    @Test
    public void testWriter() throws Exception {
        assertNotNull(mapper.writer());
        assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT));
        assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT, SerializationFeature.CLOSE_CLOSEABLE));
        assertNotNull(mapper.writerWithDefaultPrettyPrinter());
        assertNotNull(mapper.writerWithView(Object.class));
        assertNotNull(mapper.writerFor(TestClass.class));
        assertNotNull(mapper.writerFor((Class<?>) null));
        assertNotNull(mapper.writerFor(TypeFactory.defaultInstance().constructType(TestClass.class)));
    }

    @Test
    public void testWriterWithFormat() throws Exception {
        mapper.writer(DateFormat.getDateTimeInstance());
        mapper.writer(DateFormat.getDateTimeInstance()).withFormat(DateFormat.getTimeInstance(), Locale.US);
    }

    @Test
    public void testWriterWithPrettyPrinter() throws Exception {
        mapper.writer().withDefaultPrettyPrinter();
    }

    @Test
    public void testWriterWithFilterProvider() throws Exception {
        FilterProvider fp = new SimpleFilterProvider();
        mapper.writer(fp);
    }

    @Test
    public void testWriteValueAsString() throws Exception {
        TestClass tc = new TestClass();
        tc.name = "test";
        String json = mapper.writeValueAsString(tc);
        assertNotNull(json);
        assertTrue(json.contains("\"name\":\"test\""));
    }

    @Test
    public void testWriteValueAsStringNull() throws Exception {
        String json = mapper.writeValueAsString(null);
        assertNotNull(json);
    }

    @Test
    public void testWriteValueAsBytes() throws Exception {
        TestClass tc = new TestClass();
        tc.name = "test";
        byte[] bytes = mapper.writeValueAsBytes(tc);
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }

    @Test
    public void testReadValueFile() throws Exception {
        File f = File.createTempFile("test", ".json");
        mapper.writeValue(f, new TestClass());
        TestClass value = mapper.readValue(f, TestClass.class);
        assertNotNull(value);
        f.delete();
    }

    @Test
    public void testReadValueURL() throws Exception {
        File f = File.createTempFile("test", ".json");
        mapper.writeValue(f, new TestClass());
        URL url = f.toURI().toURL();
        TestClass value = mapper.readValue(url, TestClass.class);
        assertNotNull(value);
        f.delete();
    }

    @Test
    public void testReadValueString() throws Exception {
        String json = "{\"name\":\"test\"}";
        TestClass value = mapper.readValue(json, TestClass.class);
        assertNotNull(value);
        assertEquals("test", value.name);
    }

    @Test
    public void testReadValueReader() throws Exception {
        String json = "{\"name\":\"test\"}";
        StringReader sr = new StringReader(json);
        TestClass value = mapper.readValue(sr, TestClass.class);
        assertNotNull(value);
        assertEquals("test", value.name);
    }

    @Test
    public void testReadValueInputStream() throws Exception {
        String json = "{\"name\":\"test\"}";
        ByteArrayInputStream bis = new ByteArrayInputStream(json.getBytes("UTF-8"));
        TestClass value = mapper.readValue(bis, TestClass.class);
        assertNotNull(value);
        assertEquals("test", value.name);
    }

    @Test
    public void testReadValueBytes() throws Exception {
        String json = "{\"name\":\"test\"}";
        byte[] bytes = json.getBytes("UTF-8");
        TestClass value = mapper.readValue(bytes, TestClass.class);
        assertNotNull(value);
        assertEquals("test", value.name);
    }

    @Test
    public void testCanSerialize() {
        assertTrue(mapper.canSerialize(TestClass.class));
        assertFalse(mapper.canSerialize(TestClass.class, new AtomicReference<Throwable>()));
    }

    static class TestClass {
        public String name;

        public TestClass() { }

        public TestClass(String name) { this.name = name; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestClass testClass = (TestClass) o;
            return Objects.equals(name, testClass.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    static class TestMixin {
    }

    static class TestCloseable extends TestClass implements Closeable {
        public void close() throws IOException {
        }
    }

    static class SomeRandomClass {
    }
}