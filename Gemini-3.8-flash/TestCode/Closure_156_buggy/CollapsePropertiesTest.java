package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;

@RunWith(JUnit4.class)
public class CollapsePropertiesTest {

    private CollapseProperties collapseProperties;
    private AbstractCompiler compiler;

    private static class TestCompiler extends AbstractCompiler {
        private boolean changed = false;
        private List<JSError> errors = new ArrayList<>();

        @Override
        public void report(JSError error) {
            errors.add(error);
        }

        @Override
        public CodingConvention getCodingConvention() {
            return CodingConventions.getDefault();
        }

        @Override
        public void reportCodeChange() {
            changed = true;
        }

        @Override
        public boolean hasCodeChanged() {
            return changed;
        }

        @Override
        public void clearCodeChange() {
            changed = false;
        }

        @Override
        public void setChangeFileIsOnDisk() {
        }

        @Override
        public void setChangeMark(ChangeDescription mark) {
        }

        @Override
        public ChangeDescription getChangeMark() {
            return null;
        }

        @Override
        public boolean getInputDebugHash() {
            return false;
        }

        @Override
        public void setInputDebugHash(boolean value) {
        }

        @Override
        public SourceFile[] getInputs() {
            return new SourceFile[0];
        }

        @Override
        public CompilerInput getInput(String name) {
            return null;
        }

        @Override
        public CompilerInput newInput(SourceFile inputFile) {
            return null;
        }

        @Override
        public CompilerInput getInputById(String id) {
            return null;
        }

        @Override
        public TypeRegistry getTypeRegistry() {
            return null;
        }

        @Override
        public JSType getType(Node node) {
            return null;
        }

        @Override
        public void setType(Node node, JSType type) {
        }

        @Override
        public boolean isTypeChecking() {
            return false;
        }

        @Override
        public boolean isIncrementalTypeChecking() {
            return false;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return null;
        }

        @Override
        public void addChangeHandler(ChangeHandler handler) {
        }

        @Override
        public void removeChangeHandler(ChangeHandler handler) {
        }

        @Override
        public void setErrorManager(ErrorManager errorManager) {
        }

        @Override
        public ErrorManager getErrorManager() {
            return null;
        }

        @Override
        public void setTypeCheckingMode(TypeCheckingMode mode) {
        }

        @Override
        public TypeCheckingMode getTypeCheckingMode() {
            return null;
        }

        @Override
        public void setLinearRuntimeLevel(int level) {
        }

        @Override
        public void setInstrumentation(Instrumentation instrumentation) {
        }

        @Override
        public JavaType getJavaType() {
            return null;
        }

        @Override
        public void setJavaType(JavaType javaType) {
        }

        @Override
        public void setParsingMode(ParsingMode mode) {
        }

        @Override
        public Result compile(SourceFile... sourceFiles) {
            return null;
        }

        @Override
        public Result compile(Module module, SourceFile... sourceFiles) {
            return null;
        }

        @Override
        public Result compile(CompilerEnviroment envirment) {
            return null;
        }

        @Override
        public void process(SourceFile... sourceFiles) {
        }

        @Override
        public void process(Module module) {
        }
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        collapseProperties = new CollapseProperties(compiler, false, false);
    }

    @Test
    public void testProcessWithNonNullNodes() {
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.BLOCK);
        collapseProperties.process(externs, root);
    }

    @Test
    public void testProcessWithExternTypesEnabled() {
        CollapseProperties cp = new CollapseProperties(compiler, true, false);
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.BLOCK);
        cp.process(externs, root);
    }

    @Test
    public void testInlineAliasesWithNullNameMap() {
        CollapseProperties cp = new CollapseProperties(compiler, false, true);
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.BLOCK);
        cp.process(externs, root);
    }

    @Test
    public void testCheckNamespacesWithNullNameMap() {
        // Should not throw NPE
        collapseProperties.checkNamespaces();
    }

    @Test
    public void testFlattenReferencesToWithNullProps() {
        Name name = new Name("test", null, null, null);
        collapseProperties.flattenReferencesToCollapsibleDescendantNames(name, "alias");
    }

    @Test
    public void testFlattenReferencesToWithNonNullProps() {
        Name child = new Name("child", null, null, null);
        Name parent = new Name("parent", null, null, null);
        parent.addChild(child);
        collapseProperties.flattenReferencesToCollapsibleDescendantNames(parent, "alias");
    }

    @Test
    public void testUpdateObjLitOrFunctionDeclarationWithNullDeclaration() {
        Name name = new Name("test", null, null, null);
        name.declaration = null;
        collapseProperties.updateObjLitOrFunctionDeclaration(name, "alias");
    }

    @Test
    public void testUpdateObjLitOrFunctionDeclarationWithTwin() {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = new Node(Token.NAME, "test");
        Node parentNode = new Node(Token.EXPR_RESULT);
        parentNode.addChildToBack(assignNode);
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(new Node(Token.NUMBER, 1.0));
        Node declarationNode = new Node(Token.NAME, "test");
        declarationNode.setParent(assignNode);
        declarationNode.addChildToBack(new Node(Token.NAME, "test"));
        Name name = new Name("test", new Node(Token.NAME, "test"), null, null);
        name.declaration = declarationNode;
        collapseProperties.updateObjLitOrFunctionDeclaration(name, "alias");
    }

    @Test
    public void testFlattenNameRefAtDepthWithNullNode() {
        collapseProperties.flattenNameRefAtDepth("alias", null, 0, "original");
    }

    @Test
    public void testWarnAboutNamespaceAliasing() {
        Node node = new Node(Token.NAME, "test");
        Ref ref = new Ref(null, null, node, null, null);
        collapseProperties.warnAboutNamespaceAliasing(new Name("test", null, null, null), ref);
    }

    @Test
    public void testWarnAboutNamespaceRedefinition() {
        Node node = new Node(Token.NAME, "test");
        Ref ref = new Ref(null, null, node, null, null);
        collapseProperties.warnAboutNamespaceRedefinition(new Name("test", null, null, null), ref);
    }

    @Test
    public void testInlineAliasIfPossibleWithNullParent() {
        Name name = new Name("test", null, null, null);
        Ref ref = new Ref(null, null, new Node(Token.NAME, "test"), null, null);
        CollapseProperties cp = new CollapseProperties(compiler, false, true);
        assertFalse(cp.inlineAliasIfPossible(ref, new GlobalNamespace(compiler, new Node(Token.BLOCK))));
    }
}