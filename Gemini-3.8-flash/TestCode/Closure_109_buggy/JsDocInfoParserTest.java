package com.google.javascript.jscomp.parsing;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JsDocInfoParserTest {

  private static class RecordingErrorReporter implements ErrorReporter {
    private final List warnings = new ArrayList();
    private final List errors = new ArrayList();

    public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
      warnings.add(message);
    }

    public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
    }

    public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
      return new EvaluatorException(message);
    }

    public boolean hasWarning(String text) {
      for (int i = 0; i < warnings.size(); i++) {
        String msg = (String) warnings.get(i);
        if (msg.indexOf(text) != -1) {
          return true;
        }
      }
      return false;
    }

    public boolean hasError(String text) {
      for (int i = 0; i < errors.size(); i++) {
        String msg = (String) errors.get(i);
        if (msg.indexOf(text) != -1) {
          return true;
        }
      }
      return false;
    }
  }

  private JsDocInfoParser createParser(String commentText, boolean parseDocs, RecordingErrorReporter reporter) {
    Set whitelist = Sets.newHashSet();
    Set suppressions = Sets.newHashSet();
    suppressions.add("checkTypes");
    suppressions.add("extraRequire");

    Config config = new Config(whitelist, suppressions, parseDocs, LanguageMode.ECMASCRIPT3, false);
    JsDocTokenStream stream = new JsDocTokenStream(commentText);
    StaticSourceFile sourceFile = new SimpleSourceFile("testcode", false);
    Node node = IR.script();
    node.setStaticSourceFile(sourceFile);
    Comment comment = new Comment(0, commentText.length(), Comment.CommentType.JSDOC, commentText);

    return new JsDocInfoParser(stream, comment, node, config, reporter);
  }

  private JsDocInfoParser createParserNoNode(String commentText, boolean parseDocs, RecordingErrorReporter reporter) {
    Set whitelist = Sets.newHashSet();
    Set suppressions = Sets.newHashSet();
    Config config = new Config(whitelist, suppressions, parseDocs, LanguageMode.ECMASCRIPT3, false);
    JsDocTokenStream stream = new JsDocTokenStream(commentText);
    return new JsDocInfoParser(stream, null, null, config, reporter);
  }

  @Test
  public void parseTypeString_givenPrimitiveType_shouldReturnValidNode() {
    Node node = JsDocInfoParser.parseTypeString("number");
    Assert.assertNotNull(node);
    Assert.assertEquals(Token.STRING, node.getType());
    Assert.assertEquals("number", node.getString());
  }

  @Test
  public void parseTypeString_givenNullAndUndefined_shouldReturnValidNodes() {
    Node nullNode = JsDocInfoParser.parseTypeString("null");
    Assert.assertNotNull(nullNode);
    Assert.assertEquals("null", nullNode.getString());

    Node undefNode = JsDocInfoParser.parseTypeString("undefined");
    Assert.assertNotNull(undefNode);
    Assert.assertEquals("undefined", undefNode.getString());
  }

  @Test
  public void parseTypeString_givenAnyAndAllType_shouldReturnStarNode() {
    Node starNode = JsDocInfoParser.parseTypeString("*");
    Assert.assertNotNull(starNode);
    Assert.assertEquals(Token.STAR, starNode.getType());
  }

  @Test
  public void parseTypeString_givenUnknownType_shouldReturnQmarkNode() {
    Node qmark = JsDocInfoParser.parseTypeString("?");
    Assert.assertNotNull(qmark);
    Assert.assertEquals(Token.QMARK, qmark.getType());
  }

  @Test
  public void parseTypeString_givenPrefixModifiers_shouldWrapType() {
    Node bangNode = JsDocInfoParser.parseTypeString("!number");
    Assert.assertNotNull(bangNode);
    Assert.assertEquals(Token.BANG, bangNode.getType());
    Assert.assertEquals("number", bangNode.getFirstChild().getString());

    Node qmarkNode = JsDocInfoParser.parseTypeString("?number");
    Assert.assertNotNull(qmarkNode);
    Assert.assertEquals(Token.QMARK, qmarkNode.getType());
    Assert.assertEquals("number", qmarkNode.getFirstChild().getString());
  }

  @Test
  public void parseTypeString_givenPostfixModifiers_shouldWrapType() {
    Node bangNode = JsDocInfoParser.parseTypeString("number!");
    Assert.assertNotNull(bangNode);
    Assert.assertEquals(Token.BANG, bangNode.getType());
    Assert.assertEquals("number", bangNode.getFirstChild().getString());

    Node qmarkNode = JsDocInfoParser.parseTypeString("number?");
    Assert.assertNotNull(qmarkNode);
    Assert.assertEquals(Token.QMARK, qmarkNode.getType());
    Assert.assertEquals("number", qmarkNode.getFirstChild().getString());
  }

  @Test
  public void parseTypeString_givenTypeUnion_shouldReturnPipeNode() {
    Node union = JsDocInfoParser.parseTypeString("(number|string)");
    Assert.assertNotNull(union);
    Assert.assertEquals(Token.PIPE, union.getType());
    Assert.assertEquals(2, union.getChildCount());

    Node unionTopLevel = JsDocInfoParser.parseTypeString("number|string");
    Assert.assertNotNull(unionTopLevel);
    Assert.assertEquals(Token.PIPE, unionTopLevel.getType());
  }

  @Test
  public void parseTypeString_givenArrayType_shouldReturnLbNode() {
    Node array = JsDocInfoParser.parseTypeString("[number, string, ...boolean]");
    Assert.assertNotNull(array);
    Assert.assertEquals(Token.LB, array.getType());
    Assert.assertEquals(3, array.getChildCount());
  }

  @Test
  public void parseTypeString_givenRecordType_shouldReturnLcNode() {
    Node record = JsDocInfoParser.parseTypeString("{a: number, b: string}");
    Assert.assertNotNull(record);
    Assert.assertEquals(Token.LC, record.getType());
  }

  @Test
  public void parseTypeString_givenRecordTypeWithoutType_shouldReturnFieldNameNode() {
    Node record = JsDocInfoParser.parseTypeString("{a}");
    Assert.assertNotNull(record);
    Assert.assertEquals(Token.LC, record.getType());
  }

  @Test
  public void parseTypeString_givenGenericType_shouldParseTypeParams() {
    Node genericType = JsDocInfoParser.parseTypeString("Array.<string, number>");
    Assert.assertNotNull(genericType);
    Assert.assertEquals("Array", genericType.getString());
    Assert.assertTrue(genericType.hasChildren());
  }

  @Test
  public void parseTypeString_givenFunctionTypeWithNewAndThis_shouldParseParameters() {
    Node fn = JsDocInfoParser.parseTypeString("function(new:Object, string, ...[number]): void");
    Assert.assertNotNull(fn);
    Assert.assertEquals(Token.FUNCTION, fn.getType());

    Node fnThis = JsDocInfoParser.parseTypeString("function(this:Object, number=): string");
    Assert.assertNotNull(fnThis);
    Assert.assertEquals(Token.FUNCTION, fnThis.getType());

    Node fnSimple = JsDocInfoParser.parseTypeString("function()");
    Assert.assertNotNull(fnSimple);
    Assert.assertEquals(Token.FUNCTION, fnSimple.getType());

    Node fnVarArgsEllipsisOnly = JsDocInfoParser.parseTypeString("function(...)");
    Assert.assertNotNull(fnVarArgsEllipsisOnly);
    Assert.assertEquals(Token.FUNCTION, fnVarArgsEllipsisOnly.getType());
  }

  @Test
  public void parseInlineTypeDoc_givenValidType_shouldReturnJSDocInfo() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    JsDocInfoParser parser = createParser("{string} */", false, reporter);
    JSDocInfo info = parser.parseInlineTypeDoc();
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getType());
  }

  @Test
  public void parseInlineTypeDoc_givenInvalidType_shouldReturnNull() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    JsDocInfoParser parser = createParser("} */", false, reporter);
    JSDocInfo info = parser.parseInlineTypeDoc();
    Assert.assertNull(info);
  }

  @Test
  public void parse_givenBlockDescriptionWithDocumentationParsed_shouldRecordDescription() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "This is a block description.\n * Second line.\n */";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    boolean result = parser.parse();
    Assert.assertTrue(result);
    Assert.assertTrue(parser.hasParsedJSDocInfo());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info.getBlockDescription());
    Assert.assertTrue(info.getBlockDescription().indexOf("This is a block description") != -1);
  }

  @Test
  public void parse_givenBlockDescriptionWithoutDocumentationParsed_shouldRecordEmptyDescription() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "Short description.\n */";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    boolean result = parser.parse();
    Assert.assertTrue(result);
    Assert.assertTrue(parser.hasParsedJSDocInfo());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertEquals("", info.getBlockDescription());
  }

  @Test
  public void parse_givenNgInjectAndJaggerAnnotations_shouldRecordCorrectly() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@ngInject\n@jaggerInject\n@jaggerModule\n@jaggerProvide\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.isNgInject());

    // Test duplicate warnings
    String dupDoc = "@ngInject\n@ngInject\n@jaggerInject\n@jaggerInject\n@jaggerModule\n@jaggerModule\n@jaggerProvide\n@jaggerProvide\n*/";
    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    JsDocInfoParser parser2 = createParser(dupDoc, false, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.nginject.extra"));
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.jaggerInject.extra"));
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.jaggerModule.extra"));
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.jaggerProvide.extra"));
  }

  @Test
  public void parse_givenAuthorTag_shouldHandlePresentAndMissing() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@author John Doe\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.getAuthors().contains("John Doe"));

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String missingAuthorDoc = "@author\n*/";
    JsDocInfoParser parser2 = createParser(missingAuthorDoc, true, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.authormissing"));
  }

  @Test
  public void parse_givenStructAndDict_shouldRecordStructAndWarnOnConflict() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@struct\n@dict\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.makesStructs());
    Assert.assertTrue(reporter.hasWarning("Bad type annotation"));
  }

  @Test
  public void parse_givenConstructorAndInterface_shouldHandleConflict() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@constructor\n@interface\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.interface.constructor"));

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String doc2 = "@interface\n@constructor\n*/";
    JsDocInfoParser parser2 = createParser(doc2, false, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.interface.constructor"));
  }

  @Test
  public void parse_givenDeprecatedTag_shouldRecordReason() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@deprecated Use newer function instead.\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.isDeprecated());
    Assert.assertEquals("Use newer function instead.", info.getDeprecationReason());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String dupDoc = "@deprecated Reason 1\n@deprecated Reason 2\n*/";
    JsDocInfoParser parser2 = createParser(dupDoc, true, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.deprecated"));
  }

  @Test
  public void parse_givenDescTag_shouldRecordDescription() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@desc Testing description\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertEquals("Testing description", info.getDescription());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String dupDoc = "@desc Desc 1\n@desc Desc 2\n*/";
    JsDocInfoParser parser2 = createParser(dupDoc, true, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.desc.extra"));
  }

  @Test
  public void parse_givenFileOverview_shouldSetFileOverviewInfo() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@fileoverview Overview test\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.getFileOverviewJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.getFileOverview().indexOf("Overview test") != -1);

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String dupDoc = "@fileoverview View1\n@fileoverview View2\n*/";
    JsDocInfoParser parser2 = createParser(dupDoc, true, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.fileoverview.extra"));
  }

  @Test
  public void parse_givenLicenseAndPreserve_shouldAppendToFileLevelBuilder() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@license Apache 2.0\n@preserve Keep this\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    final StringBuilder builder = new StringBuilder();
    Node.FileLevelJsDocBuilder fileLevelBuilder = new Node.FileLevelJsDocBuilder() {
      public void append(String text) {
        builder.append(text).append("\n");
      }
    };
    parser.setFileLevelJsDocBuilder(fileLevelBuilder);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(builder.toString().indexOf("Apache 2.0") != -1);
    Assert.assertTrue(builder.toString().indexOf("Keep this") != -1);
  }

  @Test
  public void parse_givenEnumTag_shouldRecordEnumType() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@enum {string}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info.getEnumParameterType());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String doc2 = "@enum\n*/";
    JsDocInfoParser parser2 = createParser(doc2, false, reporter2);
    Assert.assertTrue(parser2.parse());
    JSDocInfo info2 = parser2.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info2.getEnumParameterType());
  }

  @Test
  public void parse_givenSimpleFlagAnnotations_shouldRecordAllFlags() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@export\n@expose\n@externs\n@javadispatch\n@hidden\n@noalias\n@nocompile\n"
        + "@nocheck\n@notimplemented\n@override\n@preservertry\n@noshadow\n@nosideeffects\n"
        + "@implicitCast\n@wizaction\n@consistentIdGenerator\n@stableIdGenerator\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info);
    Assert.assertTrue(info.isExport());
    Assert.assertTrue(info.isExpose());
    Assert.assertTrue(info.isExterns());
    Assert.assertTrue(info.isJavaDispatch());
    Assert.assertTrue(info.isHidden());
    Assert.assertTrue(info.isNoAlias());
    Assert.assertTrue(info.isNoCompile());
    Assert.assertTrue(info.isNoTypeCheck());
    Assert.assertTrue(info.isOverride());
    Assert.assertTrue(info.isPreserveTry());
    Assert.assertTrue(info.isNoShadow());
    Assert.assertTrue(info.hasNoSideEffects());
    Assert.assertTrue(info.isImplicitCast());
    Assert.assertTrue(info.isWizaction());
    Assert.assertTrue(info.isConsistentIdGenerator());
    Assert.assertTrue(info.isStableIdGenerator());
  }

  @Test
  public void parse_givenDuplicateSimpleFlagAnnotations_shouldWarn() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@export\n@export\n@expose\n@expose\n@externs\n@externs\n@javadispatch\n@javadispatch\n"
        + "@hidden\n@hidden\n@noalias\n@noalias\n@nocompile\n@nocompile\n@nocheck\n@nocheck\n"
        + "@override\n@override\n@preservertry\n@preservertry\n@noshadow\n@noshadow\n"
        + "@nosideeffects\n@nosideeffects\n@implicitCast\n@implicitCast\n@wizaction\n@wizaction\n"
        + "@consistentIdGenerator\n@consistentIdGenerator\n@stableIdGenerator\n@stableIdGenerator\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.export"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.expose"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.externs"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.javadispatch"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.hidden"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.noalias"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.nocompile"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.nocheck"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.override"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.preservertry"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.noshadow"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.nosideeffects"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.implicitcast"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.wizaction"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.consistidgen"));
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.stableidgen"));
  }

  @Test
  public void parse_givenExtendsAndImplements_shouldHandleBothCorrectly() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@constructor\n@extends {SuperClass}\n@implements {InterfaceOne}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info.getBaseType());
    Assert.assertEquals(1, info.getImplementedInterfaceCount());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String doc2 = "@interface\n@extends {SuperInterface}\n*/";
    JsDocInfoParser parser2 = createParser(doc2, false, reporter2);
    Assert.assertTrue(parser2.parse());
    JSDocInfo info2 = parser2.retrieveAndResetParsedJSDocInfo();
    Assert.assertEquals(1, info2.getExtendedInterfacesCount());
  }

  @Test
  public void parse_givenLendsAnnotation_shouldRecordLends() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@lends {MyClass.prototype}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertEquals("MyClass.prototype", info.getLendsName());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String badDoc = "@lends\n*/";
    JsDocInfoParser parser2 = createParser(badDoc, false, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.lends.missing"));
  }

  @Test
  public void parse_givenMeaningTag_shouldRecordMeaning() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@meaning Specific meaning of term\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertEquals("Specific meaning of term", info.getMeaning());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String dupDoc = "@meaning Meaning 1\n@meaning Meaning 2\n*/";
    JsDocInfoParser parser2 = createParser(dupDoc, true, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.meaning.extra"));
  }

  @Test
  public void parse_givenThrowsAnnotation_shouldRecordThrowTypeAndDescription() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@throws {Error} In case of failure\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertEquals(1, info.getThrownTypes().size());
  }

  @Test
  public void parse_givenParamAnnotation_shouldRecordParameters() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@param {string} name User name\n@param {number=} [opt_count] Count\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.hasParameter("name"));
    Assert.assertTrue(info.hasParameter("opt_count"));
    Assert.assertEquals("User name", info.getParameterDescription("name"));
  }

  @Test
  public void parse_givenDuplicateParam_shouldReportWarning() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@param {string} x\n@param {number} x\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarning("msg.dup.variable.name"));
  }

  @Test
  public void parse_givenParamMissingName_shouldReportWarning() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@param {string}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarning("msg.missing.variable.name"));
  }

  @Test
  public void parse_givenModifiesAnnotation_shouldRecordModifications() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@param {Object} x\n@modifies {this|arguments|x}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.getModifies().contains("this"));
    Assert.assertTrue(info.getModifies().contains("arguments"));
    Assert.assertTrue(info.getModifies().contains("x"));

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String badDoc = "@modifies {unknownParam}\n*/";
    JsDocInfoParser parser2 = createParser(badDoc, false, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.modifies.unknown"));
  }

  @Test
  public void parse_givenSeeTag_shouldRecordReference() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@see http://example.com\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.getReferences().contains("http://example.com"));

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String missingSeeDoc = "@see\n*/";
    JsDocInfoParser parser2 = createParser(missingSeeDoc, true, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.seemissing"));
  }

  @Test
  public void parse_givenSuppressTag_shouldRecordSuppressions() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@suppress {checkTypes, extraRequire}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.getSuppressions().contains("checkTypes"));
    Assert.assertTrue(info.getSuppressions().contains("extraRequire"));

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String unknownDoc = "@suppress {unknownSuppression}\n*/";
    JsDocInfoParser parser2 = createParser(unknownDoc, false, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.suppress.unknown"));
  }

  @Test
  public void parse_givenTemplateTag_shouldRecordTemplateNames() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@template T, U\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.getTemplateTypeNames().contains("T"));
    Assert.assertTrue(info.getTemplateTypeNames().contains("U"));

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String missingDoc = "@template\n*/";
    JsDocInfoParser parser2 = createParser(missingDoc, false, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.templatemissing"));
  }

  @Test
  public void parse_givenIdGeneratorTags_shouldRecordVariants() {
    RecordingErrorReporter rep1 = new RecordingErrorReporter();
    JsDocInfoParser parser1 = createParser("@idGenerator\n*/", false, rep1);
    Assert.assertTrue(parser1.parse());
    Assert.assertTrue(parser1.retrieveAndResetParsedJSDocInfo().isIdGenerator());

    RecordingErrorReporter rep2 = new RecordingErrorReporter();
    JsDocInfoParser parser2 = createParser("@idGenerator {consistent}\n*/", false, rep2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(parser2.retrieveAndResetParsedJSDocInfo().isConsistentIdGenerator());

    RecordingErrorReporter rep3 = new RecordingErrorReporter();
    JsDocInfoParser parser3 = createParser("@idGenerator {stable}\n*/", false, rep3);
    Assert.assertTrue(parser3.parse());
    Assert.assertTrue(parser3.retrieveAndResetParsedJSDocInfo().isStableIdGenerator());

    RecordingErrorReporter rep4 = new RecordingErrorReporter();
    JsDocInfoParser parser4 = createParser("@idGenerator {mapped}\n*/", false, rep4);
    Assert.assertTrue(parser4.parse());
    Assert.assertTrue(parser4.retrieveAndResetParsedJSDocInfo().isMappedIdGenerator());

    RecordingErrorReporter repBad = new RecordingErrorReporter();
    JsDocInfoParser parserBad = createParser("@idGenerator {invalidKind}\n*/", false, repBad);
    Assert.assertTrue(parserBad.parse());
    Assert.assertTrue(repBad.hasWarning("msg.jsdoc.idgen.unknown"));
  }

  @Test
  public void parse_givenDisposesTag_shouldRecordDisposedParameters() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@param {Object} x\n@disposes {x}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String missingDoc = "@disposes\n*/";
    JsDocInfoParser parser2 = createParser(missingDoc, false, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.disposeparameter.missing"));
  }

  @Test
  public void parse_givenVersionTag_shouldRecordVersion() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@version 1.2.3\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertEquals("1.2.3", info.getVersion());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String missingDoc = "@version\n*/";
    JsDocInfoParser parser2 = createParser(missingDoc, true, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.versionmissing"));

    RecordingErrorReporter reporter3 = new RecordingErrorReporter();
    String dupDoc = "@version 1.0\n@version 2.0\n*/";
    JsDocInfoParser parser3 = createParser(dupDoc, true, reporter3);
    Assert.assertTrue(parser3.parse());
    Assert.assertTrue(reporter3.hasWarning("msg.jsdoc.extraversion"));
  }

  @Test
  public void parse_givenConstantTag_shouldRecordConstancy() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@const {number}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.isConstant());
    Assert.assertNotNull(info.getType());

    RecordingErrorReporter reporter2 = new RecordingErrorReporter();
    String dupDoc = "@const\n@const\n*/";
    JsDocInfoParser parser2 = createParser(dupDoc, false, reporter2);
    Assert.assertTrue(parser2.parse());
    Assert.assertTrue(reporter2.hasWarning("msg.jsdoc.const"));
  }

  @Test
  public void parse_givenDefineTag_shouldRecordDefine() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@define {boolean} Description of define flag\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertTrue(info.isDefine());
    Assert.assertNotNull(info.getType());
  }

  @Test
  public void parse_givenVisibilityAnnotations_shouldRecordVisibility() {
    RecordingErrorReporter repPrivate = new RecordingErrorReporter();
    JsDocInfoParser p1 = createParser("@private {string}\n*/", false, repPrivate);
    Assert.assertTrue(p1.parse());
    Assert.assertEquals(Visibility.PRIVATE, p1.retrieveAndResetParsedJSDocInfo().getVisibility());

    RecordingErrorReporter repProtected = new RecordingErrorReporter();
    JsDocInfoParser p2 = createParser("@protected {string}\n*/", false, repProtected);
    Assert.assertTrue(p2.parse());
    Assert.assertEquals(Visibility.PROTECTED, p2.retrieveAndResetParsedJSDocInfo().getVisibility());

    RecordingErrorReporter repPublic = new RecordingErrorReporter();
    JsDocInfoParser p3 = createParser("@public {string}\n*/", false, repPublic);
    Assert.assertTrue(p3.parse());
    Assert.assertEquals(Visibility.PUBLIC, p3.retrieveAndResetParsedJSDocInfo().getVisibility());
  }

  @Test
  public void parse_givenConflictingVisibility_shouldReportWarning() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@private\n@public\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarning("msg.jsdoc.visibility.public"));
  }

  @Test
  public void parse_givenReturnAnnotation_shouldRecordReturnTypeAndDescription() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@return {number} Calculated count\n*/";
    JsDocInfoParser parser = createParser(doc, true, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info.getReturnType());
    Assert.assertEquals("Calculated count", info.getReturnDescription());

    RecordingErrorReporter repEmptyReturn = new RecordingErrorReporter();
    JsDocInfoParser p2 = createParser("@return\n*/", false, repEmptyReturn);
    Assert.assertTrue(p2.parse());
    Assert.assertNotNull(p2.retrieveAndResetParsedJSDocInfo().getReturnType());
  }

  @Test
  public void parse_givenThisAnnotation_shouldRecordThisType() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@this {Element}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info.getThisType());
  }

  @Test
  public void parse_givenTypedefAnnotation_shouldRecordTypedef() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@typedef {string|number}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info.getTypedefType());
  }

  @Test
  public void parse_givenTypeAnnotation_shouldRecordType() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@type {number}\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    Assert.assertNotNull(info.getType());
  }

  @Test
  public void parse_givenUnknownAnnotationTag_shouldReportWarning() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@unsupportedTag\n*/";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertTrue(reporter.hasWarning("msg.bad.jsdoc.tag"));
  }

  @Test
  public void parse_givenUnexpectedEOF_shouldReturnFalseAndReportWarning() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    String doc = "@type {number}";
    JsDocInfoParser parser = createParser(doc, false, reporter);
    boolean result = parser.parse();
    Assert.assertFalse(result);
    Assert.assertTrue(reporter.hasWarning("msg.unexpected.eof"));
  }

  @Test
  public void setFileOverviewJSDocInfo_givenNullOrValid_shouldSetField() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    JsDocInfoParser parser = createParser("*/", false, reporter);
    Assert.assertNull(parser.getFileOverviewJSDocInfo());

    JSDocInfo info = new JSDocInfo();
    parser.setFileOverviewJSDocInfo(info);
    Assert.assertSame(info, parser.getFileOverviewJSDocInfo());
  }

  @Test
  public void constructor_withoutAssociatedNode_shouldHandleNullSourceFile() {
    RecordingErrorReporter reporter = new RecordingErrorReporter();
    JsDocInfoParser parser = createParserNoNode("*/", false, reporter);
    Assert.assertTrue(parser.parse());
    Assert.assertFalse(parser.hasParsedJSDocInfo());
  }
}