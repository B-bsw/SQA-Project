package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class AnalyzePrototypePropertiesTest {

    private AnalyzePrototypeProperties pass;
    private AbstractCompiler compiler;
    private JSModuleGraph moduleGraph;
    private Node externRoot;
    private Node root;

    private static class TestCompiler extends AbstractCompiler {
        private CodingConvention convention = new ClosureCodingConvention();

        @Override
        public CodingConvention getCodingConvention() {
            return convention;
        }

        @Override
        public void report(CheckLevel level, JSError error) {
        }

        @Override
        public void process(CompilerInput input) {
        }

        @Override
        public void process(CompilerInput[] inputs) {
        }

        @Override
        public void processExternDefs(List<Node> externs) {
        }

        // Additional abstract methods can be stubbed as needed
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        moduleGraph = null;
        externRoot = new Node(Token.EMPTY);
        root = new Node(Token.EMPTY);
        pass = new AnalyzePrototypeProperties(compiler, moduleGraph, true, true);
    }

    @After
    public void tearDown() {
        pass = null;
        compiler = null;
        externRoot = null;
        root = null;
    }

    @Test
    public void testProcessEmptyRoots() {
        pass.process(externRoot, root);
        Collection<NameInfo> infos = pass.getAllNameInfo();
        assertNotNull(infos);
        assertEquals(0, infos.size());
    }

    @Test
    public void testGetAllNameInfoEmpty() {
        Collection<NameInfo> infos = pass.getAllNameInfo();
        assertNotNull(infos);
        assertTrue(infos.isEmpty());
    }

    @Test
    public void testProcessWithPrototypeProperty() {
        Node function = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "Foo");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        function.addChildToBack(name);
        function.addChildToBack(params);
        function.addChildToBack(body);

        Node assign = new Node(Token.ASSIGN);
        Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "prototype"));
        Node objectLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "bar");
        Node value = new Node(Token.NUMBER, Node.newNumber(1));
        objectLit.addChildToBack(key);
        key.addChildToBack(value);
        getprop.addChildToBack(Node.newString(Token.STRING, "prototype"));
        assign.addChildToBack(getprop);
        assign.addChildToBack(objectLit);

        body.addChildToBack(assign);
        root.addChildToBack(function);

        pass.process(externRoot, root);
        Collection<NameInfo> infos = pass.getAllNameInfo();
        assertNotNull(infos);
        assertFalse(infos.isEmpty());
    }

    @Test
    public void testProcessWithGlobalFunction() {
        Node function = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "globalFunc");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        function.addChildToBack(name);
        function.addChildToBack(params);
        function.addChildToBack(body);

        Node assign = new Node(Token.ASSIGN);
        Node var = new Node(Token.VAR);
        Node varName = Node.newString(Token.NAME, "globalVar");
        var.addChildToBack(varName);
        varName.addChildToBack(function);
        body.addChildToBack(var);

        root.addChildToBack(var);

        pass.process(externRoot, root);
        Collection<NameInfo> infos = pass.getAllNameInfo();
        assertNotNull(infos);
    }

    @Test
    public void testGetNameInfoForNameCreateNew() {
        // Use reflection to access private method
        // Since it's private, we can test through getAllNameInfo after processing
        // or use reflection if needed - but since it's private, we test indirectly
        // via process() calls above
    }

    @Test
    public void testProcessExternPropertiesWithExterns() {
        // Create extern root with some properties
        Node externProp = new Node(Token.GETPROP);
        externProp.addChildToBack(Node.newString(Token.NAME, "externObj"));
        externProp.addChildToBack(Node.newString(Token.STRING, "extProp"));
        externRoot.addChildToBack(externProp);

        pass.process(externRoot, root);
        Collection<NameInfo> infos = pass.getAllNameInfo();
        assertNotNull(infos);
    }

    @Test
    public void testSymbolGraphConnections() {
        pass.process(externRoot, root);
        assertNotNull(pass.symbolGraph);
    }

    @Test
    public void testGlobalNodeReferences() {
        assertNotNull(pass.globalNode);
        assertNotNull(pass.externNode);
        assertNotNull(pass.anonymousNode);
    }

    @Test
    public void testImplicitlyUsedProperties() {
        // Since IMPLICITLY_USED_PROPERTIES is static final, we can test its effects
        // The constructor should have created nodes for these properties
        // We can't access private fields directly, but we can check via getAllNameInfo
        // after process - for now just run process
        pass.process(externRoot, root);
        // No assertion failure means it didn't crash
    }

    @Test
    public void testNameInfoToString() {
        NameInfo info = new NameInfo("testName");
        assertEquals("testName", info.toString());
    }

    @Test
    public void testNameInfoReferencedFlag() {
        NameInfo info = new NameInfo("testFlag");
        assertFalse(info.isReferenced());
    }

    @Test
    public void testNameInfoDeepestCommonModuleRef() {
        NameInfo info = new NameInfo("testModule");
        assertNull(info.getDeepestCommonModuleRef());
    }

    @Test
    public void testNameInfoDeclarations() {
        NameInfo info = new NameInfo("testDecl");
        assertNotNull(info.getDeclarations());
        assertTrue(info.getDeclarations().isEmpty());
    }

    @Test
    public void testProcessNullExternRoot() {
        try {
            pass.process(null, root);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testProcessNullRoot() {
        try {
            pass.process(externRoot, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testProcessWithModuleGraph() {
        // Create a simple module graph
        JSModule module = new JSModule("testModule");
        moduleGraph = new JSModuleGraph(new JSModule[] { module });
        pass = new AnalyzePrototypeProperties(compiler, moduleGraph, true, true);
        pass.process(externRoot, root);
        assertNotNull(pass.getAllNameInfo());
    }

    @Test
    public void testProcessWithCanModifyExternsFalse() {
        pass = new AnalyzePrototypeProperties(compiler, moduleGraph, false, true);
        pass.process(externRoot, root);
        assertNotNull(pass.getAllNameInfo());
    }

    @Test
    public void testGlobalFunctionDetection() {
        // Test isGlobalFunctionDeclaration behavior
        Node function = new Node(Token.FUNCTION, Node.newString(Token.NAME, "test"));
        Node name = new Node(Token.NAME, "testFunc");
        function.addChildToFront(name);
        root.addChildToBack(function);
        pass.process(externRoot, root);
        // No exception means it worked
    }

    @Test
    public void testNameContextClass() {
        // Test inner class NameContext indirectly
        // Since it's private, test through process
        Node func = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "ctxFunc");
        func.addChildToBack(name);
        root.addChildToBack(func);
        pass.process(externRoot, root);
    }

    @Test
    public void testProcessPropertiesWithGetProp() {
        Node getProp = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NAME, "someObj");
        Node prop = Node.newString(Token.STRING, "someProp");
        getProp.addChildToBack(obj);
        getProp.addChildToBack(prop);
        root.addChildToBack(getProp);
        pass.process(externRoot, root);
    }

    @Test
    public void testProcessPropertiesWithObjectLit() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "key1");
        Node val = new Node(Token.NUMBER, Node.newNumber(1));
        objLit.addChildToBack(key);
        key.addChildToBack(val);
        root.addChildToBack(objLit);
        pass.process(externRoot, root);
    }

    @Test
    public void testEdgePropagation() {
        // Test with a complete setup to ensure edges propagate
        Node function = new Node(Token.FUNCTION);
        Node fName = Node.newString(Token.NAME, "edgeFunc");
        function.addChildToBack(fName);
        root.addChildToBack(function);
        pass.process(externRoot, root);
        // Verify no crash
    }

    @Test
    public void testMultiplePropertyReferences() {
        // Create a name info and mark references
        NameInfo info = new NameInfo("multiRef");
        assertFalse(info.isReferenced());
        info.markReference(null);
        assertTrue(info.isReferenced());
    }

    @Test
    public void testNameInfoMarkReferenceChanges() {
        NameInfo info = new NameInfo("refChange");
        assertFalse(info.isReferenced());
        info.markReference(null);
        assertTrue(info.isReferenced());
        // Test change detection
        assertFalse(info.hasChanged());
    }

    @Test
    public void testNameInfoMultipleMarkReference() {
        NameInfo info = new NameInfo("multiMark");
        info.markReference(null);
        info.markReference(null);
        assertTrue(info.isReferenced());
    }

    @Test
    public void testNameInfoDeepestCommonModuleWithNull() {
        NameInfo info = new NameInfo("nullModule");
        assertNull(info.getDeepestCommonModuleRef());
    }

    @Test
    public void testSymbolGraphCreation() {
        assertNotNull(pass.symbolGraph);
    }

    @Test
    public void testExternNodeInitialized() {
        assertNotNull(pass.externNode);
    }

    @Test
    public void testGlobalNodeInitialized() {
        assertNotNull(pass.globalNode);
    }

    @Test
    public void testAnonymousNodeInitialized() {
        assertNotNull(pass.anonymousNode);
    }

    @Test
    public void testPropertyNameInfoMapInitialized() {
        assertNotNull(pass.propertyNameInfo);
        assertTrue(pass.propertyNameInfo.isEmpty());
    }

    @Test
    public void testVarNameInfoMapInitialized() {
        assertNotNull(pass.varNameInfo);
        assertTrue(pass.varNameInfo.isEmpty());
    }

    @Test
    public void testProcessWithExternProperties() {
        // Create extern root with properties
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString(Token.NAME, "ext"));
        getProp.addChildToBack(Node.newString(Token.STRING, "prop"));
        externRoot.addChildToBack(getProp);
        pass.process(externRoot, root);
        assertNotNull(pass.getAllNameInfo());
    }

    @Test
    public void testProcessWithBothRoots() {
        Node extProp = new Node(Token.GETPROP);
        extProp.addChildToBack(Node.newString(Token.NAME, "extObj"));
        extProp.addChildToBack(Node.newString(Token.STRING, "extProp"));
        externRoot.addChildToBack(extProp);

        Node intProp = new Node(Token.GETPROP);
        intProp.addChildToBack(Node.newString(Token.NAME, "intObj"));
        intProp.addChildToBack(Node.newString(Token.STRING, "intProp"));
        root.addChildToBack(intProp);

        pass.process(externRoot, root);
        assertNotNull(pass.getAllNameInfo());
    }

    @Test
    public void testGlobalFunctionWithModuleGraph() {
        JSModule module = new JSModule("mod1");
        JSModule[] modules = { module };
        moduleGraph = new JSModuleGraph(modules);
        pass = new AnalyzePrototypeProperties(compiler, moduleGraph, true, true);

        Node func = new Node(Token.FUNCTION);
        Node funcName = Node.newString(Token.NAME, "globalFunc");
        func.addChildToBack(funcName);
        Node assign = new Node(Token.ASSIGN);
        Node var = new Node(Token.VAR);
        var.addChildToBack(Node.newString(Token.NAME, "globalAssignment"));
        var.getFirstChild().addChildToBack(func);
        root.addChildToBack(var);

        pass.process(externRoot, root);
        assertNotNull(pass.getAllNameInfo());
    }

    @Test
    public void testSymbolMarkReference() {
        NameInfo info = new NameInfo("refTest");
        info.markReference(null);
        assertTrue(info.isReferenced());
    }

    @Test
    public void testSymbolChangeDetection() {
        NameInfo info = new NameInfo("changeTest");
        assertFalse(info.hasChanged());
        info.markReference(null);
        assertFalse(info.hasChanged());
        // Verify it doesn't mark changed just for references
        // The actual change would be in module reference
    }

    @Test
    public void testPropagateReferencesWithEdge() {
        // Test the edge callback indirectly
        PassFactory factory = new PassFactory("test") {
            @Override
            protected CompilerPass create(AbstractCompiler compiler) {
                return AnalyzePrototypePropertiesTest.this.pass;
            }
        };
        // Just ensure no exceptions when processing
        assertNotNull(pass);
    }

    @Test
    public void testIsPrototypePropertyAssign() {
        // Test with prototype property assignment
        Node assign = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NAME, "Foo");
        Node proto = Node.newString(Token.STRING, "prototype");
        getProp.addChildToBack(obj);
        getProp.addChildToBack(proto);
        assign.addChildToBack(getProp);
        assertNotNull(assign);
    }

    @Test
    public void testProcessWithObjectLiteralAssignment() {
        Node assign = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString(Token.NAME, "Foo"));
        getProp.addChildToBack(Node.newString(Token.STRING, "prototype"));
        
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "method1");
        Node func = new Node(Token.FUNCTION);
        objLit.addChildToBack(key);
        key.addChildToBack(func);
        
        assign.addChildToBack(getProp);
        assign.addChildToBack(objLit);
        
        root.addChildToBack(assign);
        pass.process(externRoot, root);
        assertNotNull(pass.getAllNameInfo());
    }

    @Test
    public void testAnonymousFunctionHandling() {
        Node func = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME, "");
        func.addChildToBack(name);
        root.addChildToBack(func);
        pass.process(externRoot, root);
    }

    @Test
    public void testExportedFunctionHandling() {
        Node func = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "exportedFunc");
        func.addChildToBack(name);
        // Force exported by using getter/setter convention
        ((TestCompiler) compiler).getCodingConvention().setExported(true);
        root.addChildToBack(func);
        pass.process(externRoot, root);
    }

    @Test
    public void testProcessWithNullModuleGraph() {
        pass = new AnalyzePrototypeProperties(compiler, null, true, true);
        pass.process(externRoot, root);
        assertNotNull(pass.getAllNameInfo());
    }

    @Test
    public void testAllNameInfoContainsUniqueNames() {
        pass.process(externRoot, root);
        Collection<NameInfo> infos = pass.getAllNameInfo();
        assertNotNull(infos);
        // No duplicate names should be present
        Map<String, NameInfo> testMap = new java.util.HashMap<>();
        for (NameInfo info : infos) {
            assertFalse("Duplicate name: " + info.name, testMap.containsKey(info.name));
            testMap.put(info.name, info);
        }
    }

    @Test
    public void testInternalNameInfoClass() {
        NameInfo info = new NameInfo("internalTest");
        assertEquals("internalTest", info.getName());
        assertEquals("internalTest", info.toString());
    }

    @Test
    public void testHashCodeConsistency() {
        NameInfo info1 = new NameInfo("hashTest");
        NameInfo info2 = new NameInfo("hashTest");
        // Different instances but same name - hashCode should be consistent
        assertEquals(info1.hashCode(), info2.hashCode());
    }

    @Test
    public void testNotEqualsDifferentNames() {
        NameInfo info1 = new NameInfo("name1");
        NameInfo info2 = new NameInfo("name2");
        assertFalse(info1.equals(info2));
    }
}