package org.apache.commons.codec.language.bm;

import org.junit.Assert;
import org.junit.Test;

public class PhoneticEngineTest {

    @Test
    public void encode_givenBasicName_shouldReturnPhoneticRepresentation() {
        // Arrange
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);

        // Act
        String result = engine.encode("smith");

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.length() > 0);
    }

    @Test
    public void encode_givenDifferentRuleTypes_shouldProduceResults() {
        // Arrange
        PhoneticEngine approx = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        PhoneticEngine exact = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);

        // Act
        String resApprox = approx.encode("miller");
        String resExact = exact.encode("miller");

        // Assert
        Assert.assertNotNull(resApprox);
        Assert.assertNotNull(resExact);
    }

    @Test
    public void getters_givenConfiguration_shouldReturnConfiguredValues() {
        // Arrange
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, false, 15);

        // Act & Assert
        Assert.assertEquals(NameType.SEPHARDIC, engine.getNameType());
        Assert.assertEquals(RuleType.RULES, engine.getRuleType());
        Assert.assertFalse(engine.isConcat());
        Assert.assertEquals(15, engine.getMaxPhonemes());
    }
}
