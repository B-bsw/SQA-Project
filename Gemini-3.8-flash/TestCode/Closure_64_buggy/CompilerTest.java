package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class CompilerTest {
    private Compiler compiler;
    private CompilerOptions options;

    @Before
    public void setUp() {
        compiler = new Compiler();
        options = new CompilerOptions();
    }

    @Test
    public void testConstructorWithErrorManager() {
        TestErrorManager em = new TestErrorManager();
        Compiler c = new Compiler(em);
        assertNotNull(c);
        assertEquals(em, c.getErrorManager());
    }

    @Test(expected = NullPointerException.class)
    public void testSetErrorManagerNull() {
        compiler.setErrorManager(null);
    }

    @Test
    public void testResetUniqueNameId() {
        compiler.initOptions(options);
        supplier<String> supplier = (Supplier<String>) compiler.getUniqueNameIdSupplier();
        assertEquals("0", supplier.get());
        assertEquals("1", supplier.get());
        compiler.resetUniqueNameId();
        assertEquals("0", supplier.get());
    }

    @Test
    public void testGetResultBeforeCompile() {
        compiler.initOptions(options);
        assertNotNull(compiler.getErrorManager());
        Result result = compiler.getResult();
        assertNotNull(result);
        assertEquals(0, result.errors.length);
        assertEquals(0, result.warnings.length);
    }

    @Test
    public void testInitModulesEmptyListError() {
        compiler.initOptions(options);
        List<JSModule> modules = new ArrayList<>();
        compiler.initModules(new ArrayList<JSSourceFile>(), modules, options);
        assertTrue(compiler.hasErrors());
        JSError[] errors = compiler.getErrors();
        assertEquals(1, errors.length);
        assertEquals("JSC_EMPTY_MODULE_LIST_ERROR", errors[0].getType().key);
    }

    @Test
    public void testInitModulesRootModuleEmptyError() {
        compiler.initOptions(options);
        List<JSModule> modules = new ArrayList<>();
        JSModule root = new JSModule("root");
        modules.add(root);
        JSModule child = new JSModule("child");
        child.add(JSSourceFile.fromCode("child.js", ""));
        modules.add(child);
        compiler.initModules(new ArrayList<JSSourceFile>(), modules, options);
        assertTrue(compiler.hasErrors());
        JSError[] errors = compiler.getErrors();
        assertEquals("JSC_EMPTY_ROOT_MODULE_ERROR", errors[0].getType().key);
    }

    @Test
    public void testInitInputsByNameMapDuplicateInput() {
        compiler.initOptions(options);
        List<JSSourceFile> externs = new ArrayList<>();
        externs.add(JSSourceFile.fromCode("shared.js", ""));
        List<JSModule> modules = new ArrayList<>();
        JSModule root = new JSModule("root");
        root.add(JSSourceFile.fromCode("shared.js", ""));
        modules.add(root);
        compiler.initModules(externs, modules, options);
        assertTrue(compiler.hasErrors());
        JSError[] errors = compiler.getErrors();
        assertEquals("JSC_DUPLICATE_INPUT", errors[0].getType().key);
    }

    @Test
    public void testParseInputsBasic() {
        compiler.initOptions(options);
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(Arrays.asList(extern), Arrays.asList(input), options);
        if (compiler.hasErrors()) {
            fail("Errors during init: " + Arrays.toString(compiler.getErrors()));
        }
        Node root = compiler.parseInputs();
        assertNotNull(root);
        assertNotNull(compiler.externsRoot);
        assertNotNull(compiler.jsRoot);
        assertEquals(1, compiler.externsRoot.getChildCount());
        assertEquals(1, compiler.jsRoot.getChildCount());
    }

    private static class TestErrorManager implements ErrorManager {
        private final List<JSError> errors = new ArrayList<>();
        @Override public void report(CheckLevel level, JSError error) {
            if (level == CheckLevel.ERROR) errors.add(error);
        }
        @Override public JSError[] getErrors() { return errors.toArray(new JSError[0]); }
        @Override public JSError[] getWarnings() { return new JSError[0]; }
        @Override public int getErrorCount() { return errors.size(); }
        @Override public int getWarningCount() { return 0; }
        @Override public void generateReport() {}
    }
}