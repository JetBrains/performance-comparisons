package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22951 {
    private final Productionnull_22951 production = new Productionnull_22951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}