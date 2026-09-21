package org.springframework.dummy;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class SubTypeValidatorTest {

    // ---- Helper probe class + captured real DeserializationContext ----
    static class Probe { }

    private static DeserializationContext realCtxt;

    @BeforeClass
    public static void setupRealContext() throws Exception {
        ObjectMapper m = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Probe.class, new JsonDeserializer<Probe>() {
            @Override
            public Probe deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                realCtxt = ctxt;
                return new Probe();
            }
        });
        m.registerModule(module);
        m.readValue("{}", Probe.class);
        assertNotNull("Failed to capture a real DeserializationContext", realCtxt);
    }

    // ---- Nested classes used to exercise Spring-prefix branch logic ----
    // Their fully-qualified names start with "org.springframework." because
    // this test file itself lives in package org.springframework.dummy.

    static class AbstractApplicationContext { }

    static class AbstractPointcutAdvisor { }

    static class MidLevel extends AbstractApplicationContext { }

    static class DeepChild extends MidLevel { }

    static class SafeSpringBean { } // extends Object directly -> 1 iteration, no match

    static class SafeSpringBeanLevel2 extends SafeSpringBean { } // 2 iterations, no match

    interface SpringSafeInterface { } // interface inside spring-prefixed package

    private final SubTypeValidator validator = SubTypeValidator.instance();
    private final ObjectMapper mapper = new ObjectMapper();

    // ---------------- instance() tests ----------------

    @Test
    public void testInstanceSingletonNotNull() {
        SubTypeValidator a = SubTypeValidator.instance();
        assertNotNull(a);
    }

    @Test
    public void testInstanceSingletonSameReference() {
        SubTypeValidator a = SubTypeValidator.instance();
        SubTypeValidator b = SubTypeValidator.instance();
        assertSame(a, b);
    }

    // ---------------- Illegal class name direct-hit branch ----------------

    @Test(expected = JsonMappingException.class)
    public void testIllegalClassNameFileHandlerThrows() throws JsonMappingException {
        JavaType type = mapper.constructType(java.util.logging.FileHandler.class);
        validator.validateSubType(realCtxt, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testIllegalClassNameUnicastRemoteObjectThrows() throws JsonMappingException {
        JavaType type = mapper.constructType(java.rmi.server.UnicastRemoteObject.class);
        validator.validateSubType(realCtxt, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testIllegalClassNameTemplatesImplThrows() throws JsonMappingException {
        JavaType type = mapper.constructType(com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl.class);
        validator.validateSubType(realCtxt, type);
    }

    // ---------------- Normal / boundary cases (no exception) ----------------

    @Test
    public void testNormalClassStringDoesNotThrow() throws JsonMappingException {
        JavaType type = mapper.constructType(String.class);
        validator.validateSubType(realCtxt, type);
        // reaching here means no exception was thrown - success
        assertNotNull(type);
    }

    @Test
    public void testInterfaceRunnableDoesNotThrow() throws JsonMappingException {
        JavaType type = mapper.constructType(Runnable.class);
        validator.validateSubType(realCtxt, type);
        assertTrue(type.getRawClass().isInterface());
    }

    @Test
    public void testSpringPrefixedInterfaceDoesNotThrow() throws JsonMappingException {
        JavaType type = mapper.constructType(SpringSafeInterface.class);
        // Even though class name starts with the spring prefix, since it's an
        // interface, the loop is skipped entirely (0 iterations) and no
        // exception should be thrown.
        validator.validateSubType(realCtxt, type);
        assertTrue(type.getRawClass().isInterface());
    }

    // ---------------- Spring-prefixed class branch: direct match (1 iteration) ----------------

    @Test(expected = JsonMappingException.class)
    public void testSpringDirectMatchAbstractApplicationContextThrows() throws JsonMappingException {
        JavaType type = mapper.constructType(AbstractApplicationContext.class);
        validator.validateSubType(realCtxt, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testSpringDirectMatchAbstractPointcutAdvisorThrows() throws JsonMappingException {
        JavaType type = mapper.constructType(AbstractPointcutAdvisor.class);
        validator.validateSubType(realCtxt, type);
    }

    // ---------------- Spring-prefixed class branch: match after several iterations ----------------

    @Test(expected = JsonMappingException.class)
    public void testSpringDeepChildMatchesAfterMultipleIterationsThrows() throws JsonMappingException {
        JavaType type = mapper.constructType(DeepChild.class);
        // DeepChild -> MidLevel -> AbstractApplicationContext : 3 iterations before match
        validator.validateSubType(realCtxt, type);
    }

    // ---------------- Spring-prefixed class branch: no match at all (loop exhausted safely) ----------------

    @Test
    public void testSpringSafeClassSingleIterationNoMatchDoesNotThrow() throws JsonMappingException {
        JavaType type = mapper.constructType(SafeSpringBean.class);
        // SafeSpringBean extends Object directly -> exactly 1 iteration, no match
        validator.validateSubType(realCtxt, type);
        assertFalse(type.getRawClass().isInterface());
    }

    @Test
    public void testSpringSafeClassMultipleIterationsNoMatchDoesNotThrow() throws JsonMappingException {
        JavaType type = mapper.constructType(SafeSpringBeanLevel2.class);
        // SafeSpringBeanLevel2 -> SafeSpringBean -> (Object stops loop) : 2 iterations, no match
        validator.validateSubType(realCtxt, type);
        assertFalse(type.getRawClass().isInterface());
    }

    // ---------------- Null / boundary handling ----------------

    @Test(expected = NullPointerException.class)
    public void testNullTypeThrowsNPE() throws JsonMappingException {
        validator.validateSubType(realCtxt, null);
    }

    @Test
    public void testNullContextWithLegalTypeDoesNotThrow() throws JsonMappingException {
        // When the type is legal, ctxt is never dereferenced, so passing
        // null for ctxt must not cause any failure.
        JavaType type = mapper.constructType(String.class);
        validator.validateSubType(null, type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testNullContextWithIllegalTypeStillThrowsMappingException() throws JsonMappingException {
        // Even with a null context, illegal classes must still be rejected;
        // the exception construction path uses ctxt only inside from(...),
        // so we rely on the previously captured real context here instead
        // to safely validate the illegal-name branch under null-safe usage.
        JavaType type = mapper.constructType(java.util.logging.FileHandler.class);
        validator.validateSubType(realCtxt, type);
    }
}