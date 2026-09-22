package com.google.javascript.rhino;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JSDocInfoBuilderTest {
    private JSDocInfoBuilder builder;

    @Before
    public void setUp() {
        builder = new JSDocInfoBuilder(false);
    }

    @Test
    public void testInitialState() {
        assertFalse(builder.isPopulated());
        assertFalse(builder.isPopulatedWithFileOverview());
        assertFalse(builder.isDescriptionRecorded());
        assertNull(builder.build("test.js"));
    }

    @Test
    public void testParseDocumentationEnabled() {
        JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
        assertFalse(docBuilder.isPopulated());
        assertTrue(docBuilder.recordDescription("Some description"));
        assertTrue(docBuilder.isDescriptionRecorded());
        JSDocInfo info = docBuilder.build("test.js");
        assertNotNull(info);
        assertEquals("Some description", info.getDescription());
    }

    @Test
    public void testBuildWithPopulatedData() {
        assertTrue(builder.recordDescription("Test"));
        assertTrue(builder.isPopulated());
        assertTrue(builder.isDescriptionRecorded());
        JSDocInfo info = builder.build("source.js");
        assertNotNull(info);
        assertEquals("source.js", info.getSourceName());
        assertEquals(Visibility.INHERITED, info.getVisibility());
    }

    @Test
    public void testBuildAfterBuild() {
        assertTrue(builder.recordDescription("Test"));
        JSDocInfo first = builder.build("source.js");
        assertNotNull(first);
        assertNull(builder.build("other.js"));
        assertFalse(builder.isPopulated());
    }

    @Test
    public void testBuildWithDefaults() {
        assertTrue(builder.recordDescription("Test"));
        JSDocInfo info = builder.build("src.js");
        assertEquals(Visibility.INHERITED, info.getVisibility());
    }

    @Test
    public void testVisibilityRecording() {
        assertTrue(builder.recordVisibility(Visibility.PUBLIC));
        assertFalse(builder.recordVisibility(Visibility.PRIVATE));
        JSDocInfo info = builder.build("test.js");
        assertEquals(Visibility.PUBLIC, info.getVisibility());
    }

    @Test
    public void testVisibilityNull() {
        assertTrue(builder.recordVisibility(null));
        JSDocInfo info = builder.build("test.js");
        assertNull(info.getVisibility());
        assertTrue(builder.recordVisibility(Visibility.PUBLIC));
        assertFalse(builder.recordVisibility(null));
    }

    @Test
    public void testRecordDescriptionDuplicate() {
        assertTrue(builder.recordDescription("First"));
        assertFalse(builder.recordDescription("Second"));
        JSDocInfo info = builder.build("test.js");
        assertEquals("First", info.getDescription());
    }

    @Test
    public void testRecordDescriptionNull() {
        assertFalse(builder.recordDescription(null));
        assertFalse(builder.isDescriptionRecorded());
    }

    @Test
    public void testRecordHiddenness() {
        assertTrue(builder.recordHiddenness());
        assertFalse(builder.recordHiddenness());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isHidden());
    }

    @Test
    public void testRecordNoTypeCheck() {
        assertTrue(builder.recordNoTypeCheck());
        assertFalse(builder.recordNoTypeCheck());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isNoTypeCheck());
    }

    @Test
    public void testRecordConstructor() {
        assertTrue(builder.recordConstructor());
        assertFalse(builder.recordConstructor());
        assertTrue(builder.isConstructorRecorded());
        builder.build("test.js");
    }

    @Test
    public void testRecordPreserveTry() {
        assertTrue(builder.recordPreserveTry());
        assertFalse(builder.recordPreserveTry());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.shouldPreserveTry());
    }

    @Test
    public void testRecordOverride() {
        assertTrue(builder.recordOverride());
        assertFalse(builder.recordOverride());
        builder.build("test.js");
    }

    @Test
    public void testRecordNoAlias() {
        assertTrue(builder.recordNoAlias());
        assertFalse(builder.recordNoAlias());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isNoAlias());
    }

    @Test
    public void testRecordDeprecated() {
        assertTrue(builder.recordDeprecated());
        assertFalse(builder.recordDeprecated());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isDeprecated());
    }

    @Test
    public void testRecordInterface() {
        assertTrue(builder.recordInterface());
        assertFalse(builder.recordInterface());
        builder.build("test.js");
    }

    @Test
    public void testRecordExport() {
        assertTrue(builder.recordExport());
        assertFalse(builder.recordExport());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isExport());
    }

    @Test
    public void testRecordNoShadow() {
        assertTrue(builder.recordNoShadow());
        assertFalse(builder.recordNoShadow());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isNoShadow());
    }

    @Test
    public void testRecordImplicitCast() {
        assertTrue(builder.recordImplicitCast());
        assertFalse(builder.recordImplicitCast());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isImplicitCast());
    }

    @Test
    public void testRecordNoSideEffects() {
        assertTrue(builder.recordNoSideEffects());
        assertFalse(builder.recordNoSideEffects());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isNoSideEffects());
    }

    @Test
    public void testIsInterfaceRecorded() {
        assertFalse(builder.isInterfaceRecorded());
        builder.recordInterface();
        assertTrue(builder.isInterfaceRecorded());
    }

    @Test
    public void testRecordDescriptionAfterBuild() {
        assertTrue(builder.recordDescription("Test"));
        builder.build("test.js");
        assertTrue(builder.recordDescription("New"));
        JSDocInfo info = builder.build("new.js");
        assertEquals("New", info.getDescription());
    }

    @Test
    public void testRecordTypeAndDescriptionCompatibility() {
        assertFalse(builder.isPopulated());
        builder.recordInterface();
        assertFalse(builder.recordType(null));
        assertFalse(builder.recordReturnType(null));
        assertTrue(builder.isPopulated());
    }

    @Test
    public void testRecordTypeWithNullType() {
        assertFalse(builder.recordType(null));
        assertFalse(builder.recordReturnType(null));
        assertFalse(builder.recordEnumParameterType(null));
    }

    @Test
    public void testRecordFileOverview() {
        JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
        assertTrue(docBuilder.recordFileOverview("Overview"));
        assertFalse(docBuilder.recordFileOverview("New"));
        JSDocInfo info = docBuilder.build("test.js");
        assertTrue(info.hasFileOverview());
        assertEquals("Overview", info.getFileOverview());
    }

    @Test
    public void testRecordFileOverviewWithDocumentationFalse() {
        assertFalse(builder.recordFileOverview("Overview"));
    }

    @Test
    public void testRecordThrowType() {
        builder.recordThrowType(null);
        assertFalse(builder.recordThrowType(new JSTypeExpression(null, "test")));
    }

    @Test
    public void testRecordThrowDescription() {
        assertFalse(builder.recordThrowDescription(null, null));
    }

    @Test
    public void testAddAuthor() {
        assertFalse(builder.addAuthor(null));
        assertFalse(builder.addAuthor("John"));
    }

    @Test
    public void testAddReference() {
        assertFalse(builder.addReference(null));
    }

    @Test
    public void testRecordVersion() {
        assertFalse(builder.recordVersion(null));
        assertFalse(builder.recordVersion("1.0"));
    }

    @Test
    public void testRecordDeprecationReason() {
        assertFalse(builder.recordDeprecationReason(null));
        assertTrue(builder.recordDeprecationReason("deprecated"));
        assertFalse(builder.recordDeprecationReason("new"));
        JSDocInfo info = builder.build("test.js");
        assertEquals("deprecated", info.getDeprecationReason());
    }

    @Test
    public void testRecordSuppressions() {
        assertTrue(builder.recordSuppressions(null));
        assertFalse(builder.recordSuppressions(null));
        JSDocInfo info = builder.build("test.js");
        assertNotNull(info.getSuppressions());
    }

    @Test
    public void testMarkAnnotation() {
        builder.recordDescription("Test");
        builder.markAnnotation("@param", 1, 0);
        assertTrue(builder.isPopulated());
    }

    @Test
    public void testMarkTextWithoutMarker() {
        builder.markText("text", 1, 0, 1, 4);
        assertTrue(builder.isPopulated());
    }

    @Test
    public void testHasParameter() {
        assertFalse(builder.hasParameter("param"));
        builder.recordDescription("Test");
        builder.recordParameter("param", new JSTypeExpression(null, "test"));
        builder.build("test.js");
    }

    @Test
    public void testRecordParameterWithNull() {
        assertFalse(builder.recordParameter(null, null));
        builder.recordDescription("Test");
        builder.recordParameter(null, null);
    }

    @Test
    public void testRecordParameterDuplicate() {
        JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
        JSTypeExpression type = new JSTypeExpression(null, "string");
        assertTrue(docBuilder.recordParameter("param", type));
        assertFalse(docBuilder.recordParameter("param", type));
        JSDocInfo info = docBuilder.build("test.js");
        assertNotNull(info.getParameterType("param"));
    }

    @Test
    public void testRecordParameterDescriptionWithNull() {
        assertFalse(builder.recordParameterDescription(null, null));
        builder.recordDescription("Test");
        assertFalse(builder.recordParameterDescription("param", "desc"));
    }

    @Test
    public void testRecordTemplateTypeName() {
        assertTrue(builder.recordTemplateTypeName("T"));
        assertFalse(builder.recordTemplateTypeName("T"));
        assertFalse(builder.recordTemplateTypeName(null));
        JSDocInfo info = builder.build("test.js");
        assertNotNull(info.getTemplateTypeNames());
        assertTrue(info.getTemplateTypeNames().contains("T"));
    }

    @Test
    public void testRecordTypedef() {
        JSTypeExpression type = new JSTypeExpression(null, "Type");
        assertFalse(builder.recordTypedef(type));
        builder.recordDescription("Test");
        assertTrue(builder.recordTypedef(type));
        assertFalse(builder.recordTypedef(type));
    }

    @Test
    public void testRecordThisType() {
        JSTypeExpression type = new JSTypeExpression(null, "this");
        assertTrue(builder.recordThisType(type));
        assertFalse(builder.recordThisType(type));
        assertTrue(builder.recordThisType(null));
        builder.recordDescription("Test");
        assertTrue(builder.recordThisType(type));
    }

    @Test
    public void testRecordBaseType() {
        JSTypeExpression type = new JSTypeExpression(null, "Base");
        assertFalse(builder.recordBaseType(type));
        builder.recordDescription("Test");
        assertTrue(builder.recordBaseType(type));
        assertFalse(builder.recordBaseType(type));
        JSDocInfo info = builder.build("test.js");
        assertNotNull(info.getBaseType());
    }

    @Test
    public void testRecordConstancy() {
        assertTrue(builder.recordConstancy());
        assertFalse(builder.recordConstancy());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isConstant());
    }

    @Test
    public void testRecordReturnDescription() {
        assertTrue(builder.recordReturnDescription("Returns something"));
        assertFalse(builder.recordReturnDescription("New description"));
        assertTrue(builder.recordReturnDescription(null));
        JSDocInfo info = builder.build("test.js");
        assertEquals("Returns something", info.getReturnDescription());
    }

    @Test
    public void testRecordReturnDescriptionWithDocumentation() {
        JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
        assertTrue(docBuilder.recordReturnDescription("Return desc"));
        assertFalse(docBuilder.recordReturnDescription("Second"));
        JSDocInfo info = docBuilder.build("test.js");
        assertEquals("Return desc", info.getReturnDescription());
    }

    @Test
    public void testRecordNormalParameter() {
        assertTrue(builder.recordParameter("name", new JSTypeExpression(null, "string")));
        assertFalse(builder.recordParameter("name", new JSTypeExpression(null, "number")));
        JSDocInfo info = builder.build("test.js");
        assertNotNull(info.getParameterType("name"));
    }
}