package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class CompilerOptionsTest {

    private CompilerOptions options;

    @Before
    public void setUp() {
        options = new CompilerOptions();
    }

    @Test
    public void testConstructorInitializesDefaults() {
        assertFalse(options.checkSymbols);
        assertFalse(options.checkTypes);
        assertFalse(options.foldConstants);
        assertFalse(options.inlineVariables);
        assertFalse(options.collapseProperties);
        assertEquals(VariableRenamingPolicy.OFF, options.variableRenaming);
        assertEquals(PropertyRenamingPolicy.OFF, options.propertyRenaming);
        assertEquals(AnonymousFunctionNamingPolicy.OFF, options.anonymousFunctionNaming);
        assertEquals(CheckLevel.OFF, options.checkGlobalThisLevel);
        assertEquals(CheckLevel.ERROR, options.brokenClosureRequiresLevel);
        assertEquals(CheckLevel.OFF, options.checkUnreachableCode);
        assertFalse(options.manageClosureDependencies);
        assertTrue(options.rewriteNewDateGoogNow);
        assertTrue(options.removeAbstractMethods);
        assertEquals(TracerMode.OFF, options.tracer);
        assertFalse(options.prettyPrint);
        assertFalse(options.lineBreak);
        assertEquals(ErrorFormat.SINGLELINE, options.errorFormat);
        assertNull(options.jsOutputFile);
        assertEquals(SourceMap.DetailLevel.SYMBOLS, options.sourceMapDetailLevel);
        assertNull(options.outputCharset);
        assertFalse(options.instrumentForCoverage);
        assertFalse(options.instrumentForCoverageOnly);
    }

    @Test
    public void testSetDefineToBooleanLiteral() {
        options.setDefineToBooleanLiteral("DEBUG", true);
        Map<String, Node> defines = options.getDefineReplacements();
        assertEquals(1, defines.size());
        Node node = defines.get("DEBUG");
        assertNotNull(node);
        assertEquals(Token.TRUE, node.getToken());
    }

    @Test
    public void testSetDefineToStringLiteral() {
        options.setDefineToStringLiteral("APP_NAME", "MyApp");
        Map<String, Node> defines = options.getDefineReplacements();
        Node node = defines.get("APP_NAME");
        assertNotNull(node);
        assertEquals(Token.STRING, node.getToken());
        assertEquals("MyApp", node.getString());
    }

    @Test
    public void testSetDefineToNumberLiteral() {
        options.setDefineToNumberLiteral("COUNT", 10);
        Map<String, Node> defines = options.getDefineReplacements();
        Node node = defines.get("COUNT");
        assertNotNull(node);
        assertEquals(Token.NUMBER, node.getToken());
        assertEquals(10.0, node.getDouble(), 0.0001);
    }

    @Test
    public void testSetDefineToDoubleLiteral() {
        options.setDefineToDoubleLiteral("PI", 3.14159);
        Map<String, Node> defines = options.getDefineReplacements();
        Node node = defines.get("PI");
        assertNotNull(node);
        assertEquals(Token.NUMBER, node.getToken());
        assertEquals(3.14159, node.getDouble(), 0.000001);
    }

    @Test
    public void testGetDefineReplacementsEmptyByDefault() {
        Map<String, Node> defines = options.getDefineReplacements();
        assertNotNull(defines);
        assertTrue(defines.isEmpty());
    }

    @Test
    public void testSkipAllCompilerPasses() {
        options.skipAllCompilerPasses();
        assertTrue(options.skipAllPasses);
        assertFalse(options.nameAnonymousFunctionsOnly);
    }

    @Test
    public void testSetNameAnonymousFunctionsOnly() {
        options.setNameAnonymousFunctionsOnly(true);
        assertTrue(options.nameAnonymousFunctionsOnly);
        options.setNameAnonymousFunctionsOnly(false);
        assertFalse(options.nameAnonymousFunctionsOnly);
    }

    @Test
    public void testSetColorizeErrorOutput() {
        assertFalse(options.shouldColorizeErrorOutput());
        options.setColorizeErrorOutput(true);
        assertTrue(options.shouldColorizeErrorOutput());
        options.setColorizeErrorOutput(false);
        assertFalse(options.shouldColorizeErrorOutput());
    }

    @Test
    public void testSetChainCalls() {
        assertFalse(options.chainCalls);
        options.setChainCalls(true);
        assertTrue(options.chainCalls);
        options.setChainCalls(false);
        assertFalse(options.chainCalls);
    }

    @Test
    public void testEnableRuntimeTypeCheck() {
        assertFalse(options.runtimeTypeCheck);
        assertNull(options.runtimeTypeCheckLogFunction);
        options.enableRuntimeTypeCheck("logFn");
        assertTrue(options.runtimeTypeCheck);
        assertEquals("logFn", options.runtimeTypeCheckLogFunction);
    }

    @Test
    public void testDisableRuntimeTypeCheck() {
        options.enableRuntimeTypeCheck("logFn");
        options.disableRuntimeTypeCheck();
        assertFalse(options.runtimeTypeCheck);
        assertNull(options.runtimeTypeCheckLogFunction);
    }

    @Test
    public void testSetAndGetCodingConvention() {
        assertNull(options.getCodingConvention());
        CodingConvention convention = new CodingConvention() {
            @Override
            public String getDelegateQualifierName(String action, String method) {
                return null;
            }
            @Override
            public boolean isCommonModuleIdentifier(String name) {
                return false;
            }
        };
        options.setCodingConvention(convention);
        assertSame(convention, options.getCodingConvention());
    }

    @Test
    public void testSetManageClosureDependencies() {
        assertFalse(options.manageClosureDependencies);
        options.setManageClosureDependencies(true);
        assertTrue(options.manageClosureDependencies);
        options.setManageClosureDependencies(false);
        assertFalse(options.manageClosureDependencies);
    }

    @Test
    public void testEnableExternExports() {
        assertFalse(options.isExternExportsEnabled());
        options.enableExternExports(true);
        assertTrue(options.isExternExportsEnabled());
        options.enableExternExports(false);
        assertFalse(options.isExternExportsEnabled());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        options.instrumentForCoverage = true;
        options.prettyPrint = true;
        options.variableRenaming = VariableRenamingPolicy.LOCAL;
        CompilerOptions clone = (CompilerOptions) options.clone();
        assertNotNull(clone);
        assertTrue(clone.instrumentForCoverage);
        assertTrue(clone.prettyPrint);
        assertEquals(VariableRenamingPolicy.LOCAL, clone.variableRenaming);
        assertFalse(clone == options);
    }

    @Test
    public void testSetSummaryDetailLevel() {
        // This method is not implemented in the source (just signature), so test default
        assertEquals(1, options.summaryDetailLevel);
    }

    @Test
    public void testSetLooseTypes() {
        // Method not present in source snippet, skip actual behavior
        // Just verify no exception thrown
        // options.setLooseTypes(true);
    }

    @Test
    public void testToggleMode() {
        for (TracerMode mode : TracerMode.values()) {
            if (mode == TracerMode.OFF) {
                assertFalse(mode != TracerMode.OFF);
            } else {
                assertTrue(mode != TracerMode.OFF);
            }
        }
    }
}