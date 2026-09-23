package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.Version;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    static class TestModule extends Module {
        final String name;
        final Version version;
        final Object typeId;
        int setupCount;

        TestModule(String name, Version version, Object typeId) {
            this.name = name;
            this.version = version;
            this.typeId = typeId;
        }

        @Override
        public String getModuleName() {
            return name;
        }

        @Override
        public Version version() {
            return version;
        }

        @Override
        public Object getTypeId() {
            return typeId;
        }

        @Override
        public void setupModule(Module.SetupContext context) {
            setupCount++;
        }
    }

    static class SubObjectMapper extends ObjectMapper {
        private static final long serialVersionUID = 1L;
    }

    @Test
    public void testDefaultTypeResolverBuilderUseForType() {
        ObjectMapper.DefaultTypeResolverBuilder javaLangObject =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertTrue(javaLangObject.useForType(mapper.constructType(Object.class)));
        assertFalse(javaLangObject.useForType(mapper.constructType(String.class)));

        ObjectMapper.DefaultTypeResolverBuilder objectAndNonConcrete =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertTrue(objectAndNonConcrete.useForType(mapper.constructType(List.class)));
        assertFalse(objectAndNonConcrete.useForType(mapper.constructType(String.class)));

        ObjectMapper.DefaultTypeResolverBuilder nonConcreteArrays =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertTrue(nonConcreteArrays.useForType(mapper.constructType(Object[].class)));
        assertFalse(nonConcreteArrays.useForType(mapper.constructType(String[].class)));
        assertTrue(nonConcreteArrays.useForType(mapper.constructType(List.class)));

        ObjectMapper.DefaultTypeResolverBuilder nonFinal =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertTrue(nonFinal.useForType(mapper.constructType(List.class)));
        assertFalse(nonFinal.useForType(mapper.constructType(String.class)));
    }

    @Test
    public void testReadWriteRoundTrip() throws Exception {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);

        String json = mapper.writeValueAsString(map);
        assertEquals("{\"a\":1,\"b\":2}", json);
        assertEquals(map, mapper.readValue(json, Map.class));
    }

    @Test
    public void testWriteValueAsStringNull() throws Exception {
        assertEquals("null", mapper.writeValueAsString(null));
    }

    @Test
    public void testReadTreeNullLiteral() throws Exception {
        JsonNode n = mapper.readTree("null");
        assertNotNull(n);
        assertTrue(n.isNull());
    }

    @Test(expected = JsonMappingException.class)
    public void testReadValueEmptyStringThrows() throws Exception {
        mapper.readValue("", String.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModuleRejectsMissingName() {
        mapper.registerModule(new TestModule(null, Version.unknownVersion(), null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModuleRejectsMissingVersion() {
        mapper.registerModule(new TestModule("x", null, null));
    }

    @Test
    public void testRegisterModuleCallsSetup() {
        TestModule m = new TestModule("test", Version.unknownVersion(), "id");
        assertSame(mapper, mapper.registerModule(m));
        assertEquals(1, m.setupCount);
    }

    @Test
    public void testRegisterModuleIgnoresDuplicateWhenConfigured() {
        mapper.enable(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS);
        TestModule m = new TestModule("dup", Version.unknownVersion(), "same");
        mapper.registerModule(m);
        mapper.registerModule(m);
        assertEquals(1, m.setupCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableDefaultTypingRejectsExternalProperty() {
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE,
                JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitorRejectsNullType() throws Exception {
        mapper.acceptJsonFormatVisitor((JavaType) null, null);
    }

    @Test
    public void testTreeToValueDirectAndConverted() throws Exception {
        JsonNode objectNode = mapper.createObjectNode();
        assertSame(objectNode, mapper.treeToValue(objectNode, JsonNode.class));

        JsonNode textNode = mapper.getNodeFactory().textNode("123");
        assertEquals(Integer.valueOf(123), mapper.treeToValue(textNode, Integer.class));
    }

    @Test
    public void testValueToTreeNullAndValue() {
        assertNull(mapper.valueToTree(null));
        JsonNode tree = mapper.<JsonNode>valueToTree(123);
        assertTrue(tree.isInt());
        assertEquals(123, tree.intValue());
    }

    @Test
    public void testMixInRegistration() {
        mapper.addMixIn(Map.class, SortedMap.class);
        assertSame(SortedMap.class, mapper.findMixInClassFor(Map.class));
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testCanSerializeDeserialize() {
        assertTrue(mapper.canSerialize(String.class));
        assertTrue(mapper.canDeserialize(mapper.constructType(String.class)));
    }

    @Test
    public void testConfigureFeatures() {
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testCopyWorksForExactClass() throws Exception {
        ObjectMapper copy = mapper.copy();
        assertNotSame(mapper, copy);
        assertEquals("{\"a\":1}", copy.writeValueAsString(Collections.singletonMap("a", 1)));
    }

    @Test(expected = IllegalStateException.class)
    public void testCopyRejectsSubclass() {
        new SubObjectMapper().copy();
    }
}