package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21026 {
    private final Productionnull_21026 production = new Productionnull_21026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}