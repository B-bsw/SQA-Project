package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

public class ObjectReaderTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
        mapper = null;
    }

    public static class Person {
        public String name;
        public int age;

        public Person() {
        }
    }

    private int count(Iterator<?> values) {
        int c = 0;
        while (values.hasNext()) {
            values.next();
            c++;
        }
        return c;
    }

    @Test
    public void testVersionAndConfigOptions() {
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.version());
        assertNotNull(reader.getConfig());

        DeserializationFeature feature = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS;
        assertFalse(reader.isEnabled(feature));

        ObjectReader enabled = reader.with(feature);
        assertNotSame(reader, enabled);
        assertTrue(enabled.isEnabled(feature));
        assertFalse(reader.isEnabled(feature));
        assertFalse(enabled.without(feature).isEnabled(feature));

        ObjectReader multi = reader.withFeatures(feature,
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(multi.isEnabled(feature));
        assertFalse(multi.withoutFeatures(feature,
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).isEnabled(feature));
    }

    @Test
    public void testForTypeKeepsSameInstanceForSameType() {
        ObjectReader typed = mapper.reader().forType(Person.class);
        assertSame(typed, typed.forType(Person.class));
        ObjectReader other = typed.forType(String.class);
        assertNotSame(typed, other);
    }

    @Test
    public void testReadValueFromStringAndBoundary() throws Exception {
        Person bob = mapper.reader(Person.class).readValue(
                "{\"name\":\"Bob\",\"age\":3}");
        assertEquals("Bob", bob.name);
        assertEquals(3, bob.age);

        Person zero = mapper.reader(Person.class).readValue(
                "{\"name\":\"Kid\",\"age\":0}");
        assertEquals(0, zero.age);
    }

    @Test
    public void testReadValueFromParserAndInputStream() throws Exception {
        JsonParser p = mapper.getFactory().createParser(
                "{\"name\":\"Par\",\"age\":1}");
        Person fromParser = mapper.reader(Person.class).readValue(p);
        p.close();
        assertEquals("Par", fromParser.name);

        String json = "{\"name\":\"Stream\",\"age\":2}";
        Person fromStream = mapper.reader(Person.class).readValue(
                new ByteArrayInputStream(json.getBytes("UTF-8")));
        assertEquals("Stream", fromStream.name);
    }

    @Test
    public void testReadNullAndTree() throws Exception {
        assertNull(mapper.reader(Person.class).readValue("null"));

        JsonNode tree = mapper.reader().readTree("{\"a\":1}");
        assertEquals(1, tree.get("a").asInt());
        assertTrue(mapper.reader().readTree("null").isNull());
    }

    @Test
    public void testReadValuesZeroOneMany() throws Exception {
        ObjectReader intReader = mapper.reader(Integer.class);
        assertEquals(0, count(intReader.readValues("[]")));
        assertEquals(1, count(intReader.readValues("[42]")));
        assertEquals(3, count(intReader.readValues("[1,2,3]")));
    }

    @Test
    public void testReadValuesFromParser() throws Exception {
        JsonParser p = mapper.getFactory().createParser("[7,8]");
        assertEquals(2, count(mapper.reader(Integer.class).readValues(p)));
        p.close();
    }

    @Test
    public void testValueToUpdateSideEffect() throws Exception {
        Person target = new Person();
        ObjectReader updater = mapper.reader(Person.class).withValueToUpdate(target);
        Person result = updater.readValue("{\"name\":\"Upd\",\"age\":4}");
        assertSame(target, result);
        assertEquals("Upd", target.name);
        assertEquals(4, target.age);
    }

    @Test
    public void testWithValueToUpdateNullBehavior() throws Exception {
        ObjectReader reader = mapper.reader(Person.class);
        assertSame(reader, reader.withValueToUpdate(null));

        ObjectReader updater = reader.withValueToUpdate(new Person());
        try {
            updater.withValueToUpdate(null);
            fail("Should have rejected null replacement");
        } catch (IllegalArgumentException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithValueToUpdateRejectsArray() {
        mapper.reader(int[].class).withValueToUpdate(new int[2]);
    }

    @Test(expected = JsonMappingException.class)
    public void testEmptyInputThrows() throws Exception {
        mapper.reader(Person.class).readValue("   ");
    }

    @Test
    public void testMissingValueTypeThrows() throws Exception {
        try {
            mapper.reader().readValue("{}");
            fail("Should have failed without configured value type");
        } catch (JsonMappingException expected) {
            assertTrue(expected.getMessage().contains("No value type configured"));
        }
    }

    @Test
    public void testRootNameWrappingAndMismatch() throws Exception {
        ObjectReader rooted = mapper.reader(Person.class).withRootName("person");
        Person p = rooted.readValue("{\"person\":{\"name\":\"Ann\",\"age\":2}}");
        assertEquals("Ann", p.name);

        try {
            rooted.readValue("{\"wrong\":{\"name\":\"Ann\"}}");
            fail("Should have failed on wrong root name");
        } catch (JsonMappingException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testWithFactoryAndInjectableValues() {
        JsonFactory factory = new JsonFactory();
        ObjectReader reader = mapper.reader().with(factory);
        assertSame(factory, reader.getFactory());

        InjectableValues injectable = new InjectableValues.Std().addValue("id", 7);
        ObjectReader injected = mapper.reader().with(injectable);
        assertSame(injectable, injected.getInjectableValues());
    }

    @Test
    public void testTreeToValue() throws Exception {
        JsonNode tree = mapper.readTree("{\"name\":\"Tree\",\"age\":9}");
        Person p = mapper.reader().treeToValue(tree, Person.class);
        assertEquals("Tree", p.name);
        assertEquals(9, p.age);
    }

    @Test
    public void testAtReturnsFilteredReader() {
        assertNotNull(mapper.reader().at("/a"));
    }

    @Test
    public void testNodeFactoryMethods() {
        ObjectReader reader = mapper.reader();
        assertTrue(reader.createArrayNode().isArray());
        assertTrue(reader.createObjectNode().isObject());
    }
}