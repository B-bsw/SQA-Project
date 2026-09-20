package org.apache.commons.cli2.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder1.create();
        org.apache.commons.cli2.Option option3 = patternBuilder1.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass6 = option5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder3.create();
        org.apache.commons.cli2.Option option6 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass5 = option4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass3 = option2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass6 = option5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass5 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder1.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder1.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        org.apache.commons.cli2.Option option5 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder4.create();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder0.create();
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder2.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder4.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass6 = option5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder2.create();
        org.apache.commons.cli2.Option option4 = patternBuilder2.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.Option option9 = patternBuilder6.create();
        org.apache.commons.cli2.Option option10 = patternBuilder6.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder2.create();
        java.lang.Class<?> wildcardClass4 = patternBuilder2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        org.apache.commons.cli2.Option option9 = patternBuilder7.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass6 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.Option option9 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass10 = option9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        org.apache.commons.cli2.Option option8 = patternBuilder6.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass8 = option7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass6 = option5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        patternBuilder6.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass3 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder3.create();
        org.apache.commons.cli2.Option option14 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass6 = patternBuilder4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option4 = patternBuilder1.create();
        org.apache.commons.cli2.Option option5 = patternBuilder1.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder3.create();
        org.apache.commons.cli2.Option option7 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass14 = option13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        org.apache.commons.cli2.Option option11 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.Option option1 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass2 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option1 and option1", option1.equals(option1) ? option1.hashCode() == option1.hashCode() : true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass9 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.Option option1 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option1 and option1", option1.equals(option1) ? option1.hashCode() == option1.hashCode() : true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass13 = option12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder7.create();
        org.apache.commons.cli2.Option option11 = patternBuilder7.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        patternBuilder4.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder3.create();
        org.apache.commons.cli2.Option option13 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass6 = option5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder3.create();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder5.create();
        org.apache.commons.cli2.Option option12 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        org.apache.commons.cli2.Option option10 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass14 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder4.create();
        org.apache.commons.cli2.Option option9 = patternBuilder4.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder1.create();
        patternBuilder1.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder5.create();
        org.apache.commons.cli2.Option option12 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder7.create();
        patternBuilder7.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass12 = option11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        org.apache.commons.cli2.Option option8 = patternBuilder6.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option6 = patternBuilder1.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder1.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass6 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        org.apache.commons.cli2.Option option8 = patternBuilder4.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        patternBuilder6.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option6 = patternBuilder1.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass6 = option5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option9 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass8 = option7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        java.lang.Class<?> wildcardClass15 = patternBuilder13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option7 = patternBuilder3.create();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        java.lang.Class<?> wildcardClass9 = patternBuilder7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option4 = patternBuilder1.create();
        java.lang.Class<?> wildcardClass5 = option4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder8.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder8.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass6 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        patternBuilder13.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        org.apache.commons.cli2.Option option9 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option4 = patternBuilder1.create();
        java.lang.Class<?> wildcardClass5 = patternBuilder1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass4 = option3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder3.create();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        org.apache.commons.cli2.Option option13 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.Option option4 = patternBuilder1.create();
        java.lang.Class<?> wildcardClass5 = option4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass12 = option11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder8.create();
        org.apache.commons.cli2.Option option16 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder3.create();
        org.apache.commons.cli2.Option option9 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option4 = patternBuilder1.create();
        patternBuilder1.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        java.lang.Class<?> wildcardClass13 = option12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        org.apache.commons.cli2.Option option11 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.Option option1 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option1 and option1", option1.equals(option1) ? option1.hashCode() == option1.hashCode() : true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder0.create();
        org.apache.commons.cli2.Option option13 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass9 = patternBuilder4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        java.lang.Class<?> wildcardClass15 = patternBuilder13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        org.apache.commons.cli2.Option option5 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass5 = option4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass4 = option3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        java.lang.Class<?> wildcardClass14 = option13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.apache.commons.cli2.Option option14 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.Option option4 = patternBuilder1.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass10 = option9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.apache.commons.cli2.Option option15 = patternBuilder13.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder4.create();
        org.apache.commons.cli2.Option option13 = patternBuilder4.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option6 = patternBuilder1.create();
        org.apache.commons.cli2.Option option7 = patternBuilder1.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        patternBuilder4.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        org.apache.commons.cli2.Option option10 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder5.create();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder1.create();
        java.lang.Class<?> wildcardClass8 = option7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder3.create();
        org.apache.commons.cli2.Option option17 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        java.lang.Class<?> wildcardClass15 = patternBuilder13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.apache.commons.cli2.Option option14 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("hi!");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder6.create();
        patternBuilder6.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder1.create();
        org.apache.commons.cli2.Option option11 = patternBuilder1.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        org.apache.commons.cli2.Option option15 = patternBuilder11.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder4.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass12 = option11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass12 = option11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass6 = option5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        patternBuilder4.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass9 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option5 = patternBuilder4.create();
        patternBuilder4.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass4 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option9 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        java.lang.Class<?> wildcardClass15 = patternBuilder13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder6.create();
        patternBuilder6.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        java.lang.Class<?> wildcardClass14 = patternBuilder11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder7.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        patternBuilder9.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass14 = option13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.apache.commons.cli2.Option option14 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass10 = option9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder7.create();
        org.apache.commons.cli2.Option option10 = patternBuilder7.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        patternBuilder4.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder10.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass17 = option16.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option6 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder2.create();
        org.apache.commons.cli2.Option option6 = patternBuilder2.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass8 = option7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder5.create();
        org.apache.commons.cli2.Option option13 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        patternBuilder7.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder11.withPattern("hi!");
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder11.create();
        org.apache.commons.cli2.Option option17 = patternBuilder11.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder4.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass4 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        patternBuilder4.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option2 = patternBuilder1.create();
        java.lang.Class<?> wildcardClass3 = option2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option2 and option2", option2.equals(option2) ? option2.hashCode() == option2.hashCode() : true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.Option option4 = patternBuilder1.create();
        patternBuilder1.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        patternBuilder5.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        patternBuilder9.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        org.apache.commons.cli2.Option option12 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder4.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder11.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass14 = option13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        org.apache.commons.cli2.Option option15 = patternBuilder11.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder12.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option7 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass8 = option7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.Option option12 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder2.create();
        patternBuilder2.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        patternBuilder4.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder3.create();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        java.lang.Class<?> wildcardClass14 = option13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder3.create();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        patternBuilder4.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder8.create();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder12.create();
        patternBuilder12.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass5 = option4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder2.create();
        patternBuilder2.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option17 = patternBuilder3.create();
        org.apache.commons.cli2.Option option18 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option17 and option17", option17.equals(option17) ? option17.hashCode() == option17.hashCode() : true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option6 = patternBuilder1.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass10 = option9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        patternBuilder14.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder5.create();
        org.apache.commons.cli2.Option option13 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder0.create();
        org.apache.commons.cli2.Option option14 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        patternBuilder13.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option14 = patternBuilder10.create();
        org.apache.commons.cli2.Option option15 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass10 = option9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass7 = option6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass14 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass16 = patternBuilder10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        java.lang.Class<?> wildcardClass15 = patternBuilder11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder14.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder14.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass13 = option12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass8 = option7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        patternBuilder3.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass14 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder2.create();
        patternBuilder2.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("hi!");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder13.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option16 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder16.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder16.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option17 and option17", option17.equals(option17) ? option17.hashCode() == option17.hashCode() : true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder10.create();
        patternBuilder10.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.Option option15 = patternBuilder10.create();
        org.apache.commons.cli2.Option option16 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder5.create();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder10.withPattern("");
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass16 = option15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass13 = option12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass13 = option12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        org.apache.commons.cli2.Option option11 = patternBuilder9.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder11.create();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option6 = patternBuilder1.create();
        patternBuilder1.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass12 = option11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder15.reset();
        org.apache.commons.cli2.Option option21 = patternBuilder15.create();
        org.apache.commons.cli2.Option option22 = patternBuilder15.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option21 and option21", option21.equals(option21) ? option21.hashCode() == option21.hashCode() : true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder0.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        patternBuilder10.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder1.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder1.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder4.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        java.lang.Class<?> wildcardClass15 = option14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder7.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        org.apache.commons.cli2.Option option14 = patternBuilder12.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder6.create();
        org.apache.commons.cli2.Option option11 = patternBuilder6.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder7.create();
        patternBuilder7.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        java.lang.Class<?> wildcardClass15 = option14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        patternBuilder9.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder9.reset();
        org.apache.commons.cli2.Option option15 = patternBuilder9.create();
        org.apache.commons.cli2.Option option16 = patternBuilder9.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass14 = option13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option6 = patternBuilder4.create();
        org.apache.commons.cli2.Option option7 = patternBuilder4.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder9.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass14 = patternBuilder10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.Option option1 = patternBuilder0.create();
        patternBuilder0.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option1 and option1", option1.equals(option1) ? option1.hashCode() == option1.hashCode() : true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option7 = patternBuilder3.create();
        org.apache.commons.cli2.Option option8 = patternBuilder3.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option6 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass7 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option6 and option6", option6.equals(option6) ? option6.hashCode() == option6.hashCode() : true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder0.create();
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass8 = option7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder2.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder2.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder18 = patternBuilder15.reset();
        org.apache.commons.cli2.Option option19 = patternBuilder15.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder20 = patternBuilder15.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option19 and option19", option19.equals(option19) ? option19.hashCode() == option19.hashCode() : true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option15 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass16 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option15 and option15", option15.equals(option15) ? option15.hashCode() == option15.hashCode() : true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option17 = patternBuilder16.create();
        org.apache.commons.cli2.Option option18 = patternBuilder16.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option17 and option17", option17.equals(option17) ? option17.hashCode() == option17.hashCode() : true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option16 = patternBuilder8.create();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option16 and option16", option16.equals(option16) ? option16.hashCode() == option16.hashCode() : true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option8 = patternBuilder0.create();
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("");
        org.apache.commons.cli2.Option option13 = patternBuilder10.create();
        org.apache.commons.cli2.Option option14 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder3.withPattern("");
        org.apache.commons.cli2.Option option12 = patternBuilder3.create();
        patternBuilder3.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder11.reset();
        org.apache.commons.cli2.Option option13 = patternBuilder12.create();
        patternBuilder12.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder5.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option8 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass9 = option8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        patternBuilder5.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder5.create();
        java.lang.Class<?> wildcardClass13 = patternBuilder5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder0.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder6.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass11 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder5.create();
        org.apache.commons.cli2.Option option10 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        patternBuilder8.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder7.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder9.create();
        patternBuilder9.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder5.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder5.create();
        org.apache.commons.cli2.Option option14 = patternBuilder5.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        patternBuilder4.withPattern("");
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder4.create();
        patternBuilder4.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        patternBuilder8.withPattern("hi!");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        org.apache.commons.cli2.Option option15 = patternBuilder13.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.Option option19 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass20 = option19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option19 and option19", option19.equals(option19) ? option19.hashCode() == option19.hashCode() : true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        patternBuilder13.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.Option option3 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        patternBuilder11.withPattern("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder10.create();
        java.lang.Class<?> wildcardClass13 = option12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder1.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder6.create();
        java.lang.Class<?> wildcardClass9 = patternBuilder6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        patternBuilder9.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder12.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder13.create();
        java.lang.Class<?> wildcardClass15 = option14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        patternBuilder2.withPattern("");
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder2.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass10 = patternBuilder8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass9 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder8.create();
        org.apache.commons.cli2.Option option13 = patternBuilder8.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder6.create();
        org.apache.commons.cli2.Option option8 = patternBuilder6.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        patternBuilder2.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder2.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder2.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder15 = patternBuilder10.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder16 = patternBuilder15.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder17 = patternBuilder15.reset();
        patternBuilder15.withPattern("");
        org.apache.commons.cli2.Option option20 = patternBuilder15.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder21 = patternBuilder15.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option20 and option20", option20.equals(option20) ? option20.hashCode() == option20.hashCode() : true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder5.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder5.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder8.create();
        patternBuilder8.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder7.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder8.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder8.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        patternBuilder8.withPattern("");
        patternBuilder8.withPattern("hi!");
        org.apache.commons.cli2.Option option13 = patternBuilder8.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder14 = patternBuilder8.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option13 and option13", option13.equals(option13) ? option13.hashCode() == option13.hashCode() : true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder1.create();
        patternBuilder1.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder7 = patternBuilder6.reset();
        org.apache.commons.cli2.Option option8 = patternBuilder6.create();
        org.apache.commons.cli2.Option option9 = patternBuilder6.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option8 and option8", option8.equals(option8) ? option8.hashCode() == option8.hashCode() : true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("");
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option11 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder3.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder9.reset();
        patternBuilder11.withPattern("hi!");
        org.apache.commons.cli2.Option option14 = patternBuilder11.create();
        java.lang.Class<?> wildcardClass15 = option14.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder2.reset();
        org.apache.commons.cli2.Option option4 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass5 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("hi!");
        patternBuilder1.withPattern("");
        patternBuilder1.withPattern("hi!");
        org.apache.commons.cli2.Option option10 = patternBuilder1.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder1.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder1.reset();
        org.apache.commons.cli2.Option option3 = patternBuilder2.create();
        java.lang.Class<?> wildcardClass4 = option3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option3 and option3", option3.equals(option3) ? option3.hashCode() == option3.hashCode() : true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder0.reset();
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder8.reset();
        org.apache.commons.cli2.Option option10 = patternBuilder8.create();
        java.lang.Class<?> wildcardClass11 = option10.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option10 and option10", option10.equals(option10) ? option10.hashCode() == option10.hashCode() : true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        patternBuilder3.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder9.reset();
        patternBuilder10.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder13 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option14 = patternBuilder10.create();
        org.apache.commons.cli2.Option option15 = patternBuilder10.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option14 and option14", option14.equals(option14) ? option14.hashCode() == option14.hashCode() : true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder4.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder4.reset();
        patternBuilder4.withPattern("hi!");
        patternBuilder4.withPattern("");
        org.apache.commons.cli2.Option option11 = patternBuilder4.create();
        java.lang.Class<?> wildcardClass12 = patternBuilder4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder8 = patternBuilder0.reset();
        org.apache.commons.cli2.Option option9 = patternBuilder0.create();
        patternBuilder0.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option9 and option9", option9.equals(option9) ? option9.hashCode() == option9.hashCode() : true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        patternBuilder1.withPattern("");
        org.apache.commons.cli2.Option option4 = patternBuilder1.create();
        org.apache.commons.cli2.Option option5 = patternBuilder1.create();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option4 and option4", option4.equals(option4) ? option4.hashCode() == option4.hashCode() : true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder3.reset();
        org.apache.commons.cli2.Option option7 = patternBuilder3.create();
        java.lang.Class<?> wildcardClass8 = patternBuilder3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option7 and option7", option7.equals(option7) ? option7.hashCode() == option7.hashCode() : true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("");
        patternBuilder0.withPattern("hi!");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder9 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder10 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder11 = patternBuilder10.reset();
        org.apache.commons.cli2.Option option12 = patternBuilder11.create();
        patternBuilder11.withPattern("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option12 and option12", option12.equals(option12) ? option12.hashCode() == option12.hashCode() : true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        patternBuilder0.withPattern("");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder3 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder4 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder5 = patternBuilder3.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder5.reset();
        patternBuilder6.withPattern("");
        patternBuilder6.withPattern("hi!");
        org.apache.commons.cli2.Option option11 = patternBuilder6.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder12 = patternBuilder6.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option11 and option11", option11.equals(option11) ? option11.hashCode() == option11.hashCode() : true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder0 = new org.apache.commons.cli2.builder.PatternBuilder();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder1 = patternBuilder0.reset();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder2 = patternBuilder0.reset();
        patternBuilder2.withPattern("");
        org.apache.commons.cli2.Option option5 = patternBuilder2.create();
        org.apache.commons.cli2.builder.PatternBuilder patternBuilder6 = patternBuilder2.reset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on option5 and option5", option5.equals(option5) ? option5.hashCode() == option5.hashCode() : true);
    }
}

