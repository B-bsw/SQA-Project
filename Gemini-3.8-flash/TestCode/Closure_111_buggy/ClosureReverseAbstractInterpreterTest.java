package com.google.javascript.jscomp.type;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClosureReverseAbstractInterpreterTest {

    private JSTypeRegistry typeRegistry;
    private CodingConvention convention;
    private ClosureReverseAbstractInterpreter interpreter;
    private FlowScope mockFlowScope;

    @Before
    public void setUp() {
        typeRegistry = new JSTypeRegistry(new TestErrorReporter(null, null));
        convention = new DefaultCodingConvention();
        interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
        mockFlowScope = createMockFlowScope();
    }

    @Test
    public void getPreciserScope_givenNonCallCondition_shouldReturnBlindScope() {
        // Arrange
        Node condition = new Node(Token.NAME, "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertSame(mockFlowScope, result);
    }

    @Test
    public void getPreciserScope_givenCallWithSingleChild_shouldReturnBlindScope() {
        // Arrange
        Node condition = new Node(Token.CALL);
        condition.addChildToBack(new Node(Token.NAME, "fn"));

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertSame(mockFlowScope, result);
    }

    @Test
    public void getPreciserScope_givenCallNotOnGoog_shouldReturnBlindScope() {
        // Arrange
        Node condition = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME, "otherLib"), Node.newString("isDef"));
        Node param = new Node(Token.NAME, "paramVar");
        condition.addChildToBack(getProp);
        condition.addChildToBack(param);

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertSame(mockFlowScope, result);
    }

    @Test
    public void getPreciserScope_givenGoogUnknownMethod_shouldReturnBlindScope() {
        // Arrange
        Node condition = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString("unknownMethod"));
        Node param = new Node(Token.NAME, "paramVar");
        condition.addChildToBack(getProp);
        condition.addChildToBack(param);

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertSame(mockFlowScope, result);
    }

    @Test
    public void getPreciserScope_givenGoogIsDef_withTrueOutcome_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isDef", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void getPreciserScope_givenGoogIsDef_withFalseOutcome_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isDef", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, false);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void getPreciserScope_givenGoogIsNull_withTrueOutcome_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isNull", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void getPreciserScope_givenGoogIsNull_withFalseOutcome_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isNull", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, false);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void getPreciserScope_givenGoogIsDefAndNotNull_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isDefAndNotNull", "x");

        // Act
        FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);
        FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, false);

        // Assert
        Assert.assertNotNull(resultTrue);
        Assert.assertNotNull(resultFalse);
    }

    @Test
    public void getPreciserScope_givenGoogIsString_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isString", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void getPreciserScope_givenGoogIsBoolean_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isBoolean", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void getPreciserScope_givenGoogIsNumber_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isNumber", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void getPreciserScope_givenGoogIsArray_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isArray", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void getPreciserScope_givenGoogIsObject_shouldReturnChildScope() {
        // Arrange
        Node condition = createGoogCall("isObject", "x");

        // Act
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockFlowScope, true);

        // Assert
        Assert.assertNotNull(result);
    }

    private Node createGoogCall(String functionName, String paramName) {
        Node condition = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString(functionName));
        Node param = new Node(Token.NAME, paramName);
        param.setJSType(typeRegistry.getNativeType(JSTypeNative.ALL_TYPE));
        condition.addChildToBack(getProp);
        condition.addChildToBack(param);
        return condition;
    }

    private FlowScope createMockFlowScope() {
        return (FlowScope) Proxy.newProxyInstance(
                FlowScope.class.getClassLoader(),
                new Class<?>[] { FlowScope.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("createChildFlowScope".equals(name)) {
                            return createMockFlowScope();
                        }
                        if ("inferSlotType".equals(name)) {
                            return null;
                        }
                        if ("getSlot".equals(name)) {
                            return null;
                        }
                        return null;
                    }
                }
        );
    }
}
