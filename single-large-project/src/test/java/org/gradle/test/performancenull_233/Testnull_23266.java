package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23266 {
    private final Productionnull_23266 production = new Productionnull_23266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}