package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23188 {
    private final Productionnull_23188 production = new Productionnull_23188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}