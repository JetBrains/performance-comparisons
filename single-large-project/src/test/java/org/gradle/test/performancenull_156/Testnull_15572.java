package org.gradle.test.performancenull_156;

import static org.junit.Assert.*;

public class Testnull_15572 {
    private final Productionnull_15572 production = new Productionnull_15572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}