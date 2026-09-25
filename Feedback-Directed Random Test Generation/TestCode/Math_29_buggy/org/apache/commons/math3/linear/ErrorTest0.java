package org.apache.commons.math3.linear;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray2);
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector3.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector9);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor11 = openMapRealVector9.iterator();
        boolean boolean13 = openMapRealVector9.isDefaultValue(51.0098029794274d);
        org.apache.commons.math3.linear.RealVector realVector15 = openMapRealVector9.mapMultiplyToSelf(0.0d);
        java.lang.Double[] doubleArray18 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray18);
        java.lang.Double[] doubleArray22 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray22, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor27 = openMapRealVector25.iterator();
        boolean boolean29 = openMapRealVector25.isDefaultValue(51.0098029794274d);
        org.apache.commons.math3.linear.RealVector realVector31 = openMapRealVector25.mapMultiplyToSelf(0.0d);
        double[] doubleArray32 = openMapRealVector25.toArray();
        java.lang.Double[] doubleArray35 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray35);
        java.lang.Double[] doubleArray39 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray39, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector36.mapAdd(1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector36.mapAdd(10100.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector36);
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray51);
        java.lang.Double[] doubleArray55 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector58);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor60 = openMapRealVector58.iterator();
        boolean boolean62 = openMapRealVector58.isDefaultValue(51.0098029794274d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector48.append(openMapRealVector58);
        org.apache.commons.math3.linear.RealMatrix realMatrix64 = openMapRealVector25.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector48);
        java.lang.Double[] doubleArray68 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray68);
        java.lang.Double[] doubleArray72 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray72, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector69.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector75);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor77 = openMapRealVector75.iterator();
        java.lang.Double[] doubleArray80 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray80);
        double double82 = openMapRealVector75.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector81);
        double[] doubleArray83 = openMapRealVector75.toArray();
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator84 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry85 = openMapRealVector75.new OpenMapEntry(iterator84);
        double double86 = openMapRealVector75.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector65.append(openMapRealVector75);
        org.apache.commons.math3.linear.RealVector realVector89 = openMapRealVector65.mapDivideToSelf((double) 3);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector9.ebeMultiply(realVector89);
        org.apache.commons.math3.linear.RealVector realVector92 = realVector89.mapMultiplyToSelf(1000.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and openMapRealVector90", openMapRealVector9.equals(openMapRealVector90) ? openMapRealVector9.hashCode() == openMapRealVector90.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray2);
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector3.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector9);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor11 = openMapRealVector9.iterator();
        boolean boolean13 = openMapRealVector9.isDefaultValue(51.0098029794274d);
        org.apache.commons.math3.linear.RealVector realVector15 = openMapRealVector9.mapMultiplyToSelf(0.0d);
        java.lang.Double[] doubleArray18 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray18);
        java.lang.Double[] doubleArray22 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray22);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray22, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector25);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor27 = openMapRealVector25.iterator();
        boolean boolean29 = openMapRealVector25.isDefaultValue(51.0098029794274d);
        org.apache.commons.math3.linear.RealVector realVector31 = openMapRealVector25.mapMultiplyToSelf(0.0d);
        double[] doubleArray32 = openMapRealVector25.toArray();
        java.lang.Double[] doubleArray35 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray35);
        java.lang.Double[] doubleArray39 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray39);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray39, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector36.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector36.mapAdd(1.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector36.mapAdd(10100.0d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector36);
        java.lang.Double[] doubleArray51 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray51);
        java.lang.Double[] doubleArray55 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray55, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector52.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector58);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor60 = openMapRealVector58.iterator();
        boolean boolean62 = openMapRealVector58.isDefaultValue(51.0098029794274d);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector48.append(openMapRealVector58);
        org.apache.commons.math3.linear.RealMatrix realMatrix64 = openMapRealVector25.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector48);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector48);
        java.lang.Double[] doubleArray68 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray68);
        java.lang.Double[] doubleArray72 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray72);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray72, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector76 = openMapRealVector69.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector75);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor77 = openMapRealVector75.iterator();
        java.lang.Double[] doubleArray80 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray80);
        double double82 = openMapRealVector75.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector81);
        double[] doubleArray83 = openMapRealVector75.toArray();
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator84 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry85 = openMapRealVector75.new OpenMapEntry(iterator84);
        double double86 = openMapRealVector75.getL1Norm();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector65.append(openMapRealVector75);
        org.apache.commons.math3.linear.RealVector realVector89 = openMapRealVector65.mapDivideToSelf((double) 3);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector9.ebeMultiply(realVector89);
        org.apache.commons.math3.linear.RealVector realVector92 = openMapRealVector9.mapSubtractToSelf(52.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector25 and openMapRealVector90", openMapRealVector25.equals(openMapRealVector90) ? openMapRealVector25.hashCode() == openMapRealVector90.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray2);
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector3.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector9);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor11 = openMapRealVector9.iterator();
        boolean boolean13 = openMapRealVector9.isDefaultValue(51.0098029794274d);
        org.apache.commons.math3.linear.RealVector realVector15 = openMapRealVector9.mapMultiplyToSelf(0.0d);
        double[] doubleArray16 = openMapRealVector9.toArray();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray16, 0.0d);
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray23);
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray27);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray27, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector24.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector30);
        openMapRealVector30.addToEntry(1, (double) '4');
        double double35 = openMapRealVector30.getLInfNorm();
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray38);
        java.lang.Double[] doubleArray42 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray42);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray42, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector39.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector45);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor47 = openMapRealVector45.iterator();
        java.lang.Double[] doubleArray50 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray50);
        double double52 = openMapRealVector45.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector51);
        openMapRealVector51.addToEntry((int) (byte) 1, (double) 1L);
        java.lang.Double[] doubleArray58 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray58);
        java.lang.Double[] doubleArray62 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray62);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray62, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector59.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector65);
        double double67 = openMapRealVector51.cosine((org.apache.commons.math3.linear.RealVector) openMapRealVector65);
        double double68 = openMapRealVector30.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector51);
        org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iterator69 = null;
        org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry openMapEntry70 = openMapRealVector30.new OpenMapEntry(iterator69);
        java.lang.Double[] doubleArray73 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray73);
        java.lang.Double[] doubleArray77 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray77);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray77, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector74.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector80);
        org.apache.commons.math3.linear.RealMatrix realMatrix82 = openMapRealVector30.outerProduct((org.apache.commons.math3.linear.RealVector) openMapRealVector74);
        org.apache.commons.math3.linear.RealVector realVector84 = openMapRealVector30.mapDivideToSelf(1000000.0d);
        org.apache.commons.math3.linear.RealVector realVector86 = realVector84.mapSubtract(0.0d);
        org.apache.commons.math3.linear.RealVector realVector87 = openMapRealVector18.combine(0.8944271909999159d, (double) (short) 10, realVector86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on openMapRealVector9 and realVector86", openMapRealVector9.equals(realVector86) ? openMapRealVector9.hashCode() == realVector86.hashCode() : true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray2);
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray6, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector3.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector9);
        openMapRealVector9.addToEntry(1, (double) '4');
        java.lang.Double[] doubleArray16 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray16);
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray20);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray20, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector17.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector23);
        org.apache.commons.math3.linear.RealVector realVector26 = openMapRealVector23.mapDivide(10.0d);
        double double27 = openMapRealVector9.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector23);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math3.linear.OpenMapRealVector((org.apache.commons.math3.linear.RealVector) openMapRealVector9);
        double double29 = openMapRealVector9.getSparsity();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector9.unitVector();
        org.apache.commons.math3.linear.RealVector realVector32 = openMapRealVector30.mapMultiplyToSelf(0.0d);
        int int33 = realVector32.getMaxIndex();
        org.apache.commons.math3.linear.RealVector realVector35 = realVector32.mapMultiply((double) (short) 10);
        java.lang.Double[] doubleArray40 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray40);
        java.lang.Double[] doubleArray44 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray44);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray44, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector41.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector47);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor49 = openMapRealVector47.iterator();
        java.lang.Double[] doubleArray52 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray52);
        double double54 = openMapRealVector47.getDistance((org.apache.commons.math3.linear.RealVector) openMapRealVector53);
        java.lang.Double[] doubleArray59 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray59);
        java.lang.Double[] doubleArray63 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray63);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray63, (double) '4');
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector60.ebeMultiply((org.apache.commons.math3.linear.RealVector) openMapRealVector66);
        openMapRealVector66.addToEntry(1, (double) '4');
        org.apache.commons.math3.linear.RealVector realVector72 = openMapRealVector66.mapDivide((double) 100L);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector66.mapAddToSelf((double) 1.0f);
        org.apache.commons.math3.linear.RealVector realVector75 = openMapRealVector53.combine(100.0d, (double) 100, (org.apache.commons.math3.linear.RealVector) openMapRealVector66);
        double double76 = openMapRealVector66.getL1Norm();
        int int77 = openMapRealVector66.getMaxIndex();
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector66);
        double double79 = openMapRealVector78.getMaxValue();
        java.lang.Double[] doubleArray84 = new java.lang.Double[] { (-1.0d), 100.0d };
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector85 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray84);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector86 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray84);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math3.linear.OpenMapRealVector(doubleArray84, (double) 1L);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor89 = openMapRealVector88.iterator();
        org.apache.commons.math3.linear.RealVector realVector90 = openMapRealVector78.combine(52.0d, 102.0d, (org.apache.commons.math3.linear.RealVector) openMapRealVector88);
        org.apache.commons.math3.linear.OpenMapRealVector openMapRealVector91 = new org.apache.commons.math3.linear.OpenMapRealVector(openMapRealVector78);
        org.apache.commons.math3.linear.RealVector realVector92 = realVector32.combine((double) 2, 0.05405405405405406d, (org.apache.commons.math3.linear.RealVector) openMapRealVector78);
        java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> entryItor93 = realVector32.iterator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector32 and realVector92", realVector32.equals(realVector92) ? realVector32.hashCode() == realVector92.hashCode() : true);
    }
}

