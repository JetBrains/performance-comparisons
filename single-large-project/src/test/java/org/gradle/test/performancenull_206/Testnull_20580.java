package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20580 {
    private final Productionnull_20580 production = new Productionnull_20580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}