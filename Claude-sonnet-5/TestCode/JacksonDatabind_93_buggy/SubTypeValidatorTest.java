package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class SubTypeValidatorTest {

    private File tempDir;

    @Before
    public void setUp() throws IOException {
        tempDir = Files.createTempDirectory("subtypevalidatortest").toFile();
    }

    @After
    public void tearDown() {
        deleteRecursively(tempDir);
    }

    private void deleteRecursively(File f) {
        if (f == null || !f.exists()) {
            return;
        }
        if (f.isDirectory()) {
            File[] children = f.listFiles();
            if (children != null) {
                for (File c : children) {
                    deleteRecursively(c);
                }
            }
        }
        try {
            f.delete();
        } catch (Exception ignored) {
            // best-effort cleanup only
        }
    }

    // ---------------------------------------------------------------
    // Helper: dynamically compile a tiny class with a given package
    // name and simple name (optionally extending another already
    // compiled class), then load it. Used to simulate classes that
    // physically live in the "org.springframework." package without
    // requiring a real Spring dependency.
    // ---------------------------------------------------------------
    private Class<?> compileAndLoad(String packageName, String simpleName) throws Exception {
        return compileAndLoad(packageName, simpleName, null);
    }

    private Class<?> compileAndLoad(String packageName, String simpleName, String superFqcn) throws Exception {
        String qualifiedName = packageName + "." + simpleName;
        String extendsClause = (superFqcn != null) ? " extends " + superFqcn : "";
        String source = "package " + packageName + ";\n"
                + "public class " + simpleName + extendsClause + " {\n"
                + "    public " + simpleName + "() {}\n"
                + "}\n";

        File pkgDir = new File(tempDir, packageName.replace('.', '/'));
        pkgDir.mkdirs();
        File srcFile = new File(pkgDir, simpleName + ".java");
        try (FileWriter fw = new FileWriter(srcFile)) {
            fw.write(source);
        }

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        assertNotNull("System Java compiler not available - tests require a JDK", compiler);

        int result = compiler.run(null, null, null,
                "-cp", tempDir.getAbsolutePath(),
                srcFile.getAbsolutePath());
        assertEquals("Compilation should succeed for " + qualifiedName, 0, result);

        URLClassLoader classLoader = URLClassLoader.newInstance(
                new URL[] { tempDir.toURI().toURL() });
        return Class.forName(qualifiedName, true, classLoader);
    }

    // ---------------------------------------------------------------
    // Helper marker type + deserializer used solely to obtain a real,
    // fully functional DeserializationContext instance to pass into
    // SubTypeValidator.validateSubType(...)
    // ---------------------------------------------------------------
    static class Marker {
        public Marker() {}
    }

    static class ValidatingDeserializer extends JsonDeserializer<Marker> {
        private final Class<?> classUnderTest;

        ValidatingDeserializer(Class<?> classUnderTest) {
            this.classUnderTest = classUnderTest;
        }

        @Override
        public Marker deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            JavaType jt = ctxt.getTypeFactory().constructType(classUnderTest);
            SubTypeValidator.instance().validateSubType(ctxt, jt);
            return new Marker();
        }
    }

    private void runValidation(Class<?> classUnderTest) throws Exception {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Marker.class, new ValidatingDeserializer(classUnderTest));
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(module);
        mapper.readValue("{}", Marker.class);
    }

    // ------------------------------------------------------------
    // Tests
    // ------------------------------------------------------------

    @Test
    public void testInstanceIsSingleton() {
        SubTypeValidator v1 = SubTypeValidator.instance();
        SubTypeValidator v2 = SubTypeValidator.instance();
        assertNotNull(v1);
        assertSame(v1, v2);
    }

    @Test
    public void testValidateSubType_safeClass_noException() throws Exception {
        runValidation(String.class);
    }

    @Test
    public void testValidateSubType_safeCustomClass_noException() throws Exception {
        runValidation(Marker.class);
    }

    @Test
    public void testValidateSubType_primitiveType_noException() throws Exception {
        runValidation(int.class);
    }

    @Test
    public void testValidateSubType_directIllegalClass_fileHandler_throws() throws Exception {
        try {
            runValidation(java.util.logging.FileHandler.class);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("java.util.logging.FileHandler"));
        }
    }

    @Test
    public void testValidateSubType_directIllegalClass_unicastRemoteObject_throws() throws Exception {
        try {
            runValidation(java.rmi.server.UnicastRemoteObject.class);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("java.rmi.server.UnicastRemoteObject"));
        }
    }

    @Test
    public void testValidateSubType_springAbstractApplicationContext_throws() throws Exception {
        Class<?> clazz = compileAndLoad("org.springframework.testx", "AbstractApplicationContext");
        try {
            runValidation(clazz);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("org.springframework.testx.AbstractApplicationContext"));
        }
    }

    @Test
    public void testValidateSubType_springAbstractPointcutAdvisor_throws() throws Exception {
        Class<?> clazz = compileAndLoad("org.springframework.testx", "AbstractPointcutAdvisor");
        try {
            runValidation(clazz);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("org.springframework.testx.AbstractPointcutAdvisor"));
        }
    }

    @Test
    public void testValidateSubType_springPrefixButSafeClass_noException() throws Exception {
        Class<?> clazz = compileAndLoad("org.springframework.testx", "SafeSpringBean");
        runValidation(clazz);
    }

    @Test
    public void testValidateSubType_springDeepAncestorMatch_throws() throws Exception {
        // First compile a base class (in an unrelated package) whose
        // simple name matches one of the guarded names.
        compileAndLoad("commonbase", "AbstractApplicationContext");
        // Then compile a leaf class living under org.springframework.*
        // that extends it - forcing the validator's ancestor-walking
        // loop to execute multiple rounds before finding the match.
        Class<?> leaf = compileAndLoad("org.springframework.testx4", "DeepLeaf",
                "commonbase.AbstractApplicationContext");
        try {
            runValidation(leaf);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("org.springframework.testx4.DeepLeaf"));
        }
    }

    @Test
    public void testValidateSubType_messageFormat() throws Exception {
        try {
            runValidation(java.util.logging.FileHandler.class);
            fail("Expected exception");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().startsWith("Illegal type"));
            assertTrue(e.getMessage().contains("prevented for security reasons"));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testValidateSubType_nullType_throwsNPE() throws JsonMappingException {
        SubTypeValidator.instance().validateSubType(null, null);
    }
}